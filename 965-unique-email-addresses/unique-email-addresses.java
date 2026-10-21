
import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        List<String> unique = new ArrayList<>();

        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];

            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }

            local = local.replace(".", "");

            String normalized = local + "@" + domain;

            if (!unique.contains(normalized)) {
                unique.add(normalized);
            }
        }

        return unique.size();
    }
}


import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();

        if (nums.length == 0) {
            return ls;
        }

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                // Close the previous range
                if (start == nums[i - 1]) {
                    ls.add(String.valueOf(start));
                } else {
                    ls.add(start + "->" + nums[i - 1]);
                }

                // Start a new range
                start = nums[i];
            }
        }

        // Add the final range
        if (start == nums[nums.length - 1]) {
            ls.add(String.valueOf(start));
        } else {
            ls.add(start + "->" + nums[nums.length - 1]);
        }

        return ls;
    }
}

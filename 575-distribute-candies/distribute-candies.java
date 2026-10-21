
class Solution {
    public int distributeCandies(int[] candyType) {
        int limit = candyType.length / 2;
        int count = 0;

        for (int i = 0; i < candyType.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (candyType[i] == candyType[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                count++;
            }
        }

        return Math.min(count, limit);
    }
}

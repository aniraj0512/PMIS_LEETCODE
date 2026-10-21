
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;

        for (int x : aliceSizes) {
            sumA += x;
        }

        for (int y : bobSizes) {
            sumB += y;
        }

        int diff = (sumA - sumB) / 2;

        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for (int y : bobSizes) {
            set.add(y);
        }

        for (int x : aliceSizes) {
            int y = x - diff;

            if (set.contains(y)) {
                return new int[]{x, y};
            }
        }

        return new int[]{};
    }
}

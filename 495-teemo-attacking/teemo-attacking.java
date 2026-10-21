
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = timeSeries.length * duration;
        int totalDiff = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i] + duration > timeSeries[i + 1]) {
                totalDiff += timeSeries[i] + duration - timeSeries[i + 1];
            }
        }

        return total - totalDiff;
    }
}

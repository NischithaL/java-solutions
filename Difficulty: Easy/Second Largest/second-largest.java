class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x < largest) {
                second = x;
            }
        }

        return second == Integer.MIN_VALUE ? -1 : second;
    }
}

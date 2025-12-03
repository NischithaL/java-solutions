class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int left = 0, sum = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (left <= right && sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                res.add(left + 1);
                res.add(right + 1);
                return res;
            }
        }

        res.add(-1);
        return res;
    }
}

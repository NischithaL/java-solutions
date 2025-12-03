class Solution {
    int majorityElement(int arr[]) {
        int count = 0, candidate = 0;

        for (int x : arr) {
            if (count == 0) candidate = x;
            count += (x == candidate) ? 1 : -1;
        }

        count = 0;
        for (int x : arr) {
            if (x == candidate) count++;
        }

        return count > arr.length / 2 ? candidate : -1;
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        
        if(k > nums.length) {
            k = k % nums.length;
        }

        reverse(0,nums.length-1,nums);
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);

    }

    void reverse(int start, int end, int arr[]) {

        while(start < end) {

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }
}
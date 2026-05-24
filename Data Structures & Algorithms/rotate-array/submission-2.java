class Solution {

    void reverse(int[] arr, int start,int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    void leftRotate(int[] arr,int k){

        k= k%arr.length;
        if(k<=0) return;

        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);

    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k<=0) return;
        leftRotate(nums,nums.length-k);
    }
}
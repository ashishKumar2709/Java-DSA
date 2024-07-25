package components;

public class Search {
    public int linearSearch(int[] nums, int target){
        int steps = 0;
        for(int i=0; i<nums.length;i++){
            steps++;
            if(nums[i]==target){
                System.out.println("Steps taken in LS: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken in LS: " + steps);
        return -1;
    }
    public int binarySearch(int[] nums, int target){
        int right = nums.length-1;
        int left = 0;
        int steps = 0;
        while(right>=left){
            steps++;
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                System.out.println("Steps taken in BS: " + steps);
                return mid;
            }
            if(target<nums[mid]){
                right = mid-1;
            }else if(target>nums[mid]){
                left = mid+1;
            }
        }
        System.out.println("Steps taken in BS: " + steps);
        return -1;
    }
    public int binarySearchRecur(int[] nums, int target, int left, int right, int steps){
        if(right>=left){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                System.out.println("Steps taken in BSR: " + steps);
                return mid;
            }
            else if(target<nums[mid]){
                return binarySearchRecur(nums, target, left, mid-1, steps+1);
            }else {
                return binarySearchRecur(nums, target, mid+1, right, steps+1);
            }
        }
        System.out.println("Steps taken in BSR: " + steps);   
        return -1;
    }
}


public class Solution {


    public int treeSumClosest(int[] nums, int target){
        int sum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++)
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++)
                    if(Math.abs(target - sum) >
                            Math.abs(target - (nums[i]+ nums[j] +nums[k])))
                        sum = nums[i] + nums[j] + nums[k] ;
            }
        return  sum;
    }
}

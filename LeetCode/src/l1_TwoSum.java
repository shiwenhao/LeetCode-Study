import java.util.HashMap;

public class l1_TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,7,8,9};
		int []result = twoSum(nums,10);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
    public static int[] twoSum(int[] nums, int target) {
        int []result = new int[2];
        HashMap map = new HashMap();
        for(int i = 0;i<nums.length;++i){
        	if(map.containsKey(target-nums[i]))
        	{
        		result[0] = i;
        		result[1] = (int) map.get(target-nums[i]);
        		break;
        	}
        	map.put(nums[i], i);
        }
        return result;
    }
}

public class RemoveElements {

    public static void main(String[] args) {

       // nums = [3,2,2,3], val = 3

        int[] nums={3,2,2,3};
        int val=3;
        int j=0;


        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }

        for(int i=0;i<=j;i++)
        {
            System.out.println(nums[i]);
        }
    }
}

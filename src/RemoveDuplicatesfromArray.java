public class RemoveDuplicatesfromArray {

    public static void main(String[] args) {

       // nums= [0,0,1,1,1,2,2,3,3,4]
        //[0,1,2,3,4,_,_,_,_,_]

        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int j=0;


        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++; // Increment `j` to place the next unique element
                nums[j] = nums[i]; // Place the unique element
            }
        }


        for(int l=0;l<=j;l++)
        {
            System.out.println(nums[l]);

        }


    }
}

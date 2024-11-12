public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        //Output: [1,2,2,3,5,6]

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int n=3;
        int m=3;
        int[] nums2 = {2,5,6};

        int i=n-1;
        int j =m-1;
        int k=i+ j +1;

        while(i >=0 && j>=0)
        {
            if(nums1[i] >nums2[j])
            {
                nums1[k--]=nums1[i--];
            }
            else {
                nums1[k--]=nums2[j--];
            }
        }

        for(int l=0;l<m+n;l++)
        {
            System.out.println(nums1[l]);
        }

    }
}

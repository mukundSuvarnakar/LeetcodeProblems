public class TwoSum {

    public static void main(String[] args) {

        //nums = [3,2,4], target = 6

        int[] num={2,3,4};
        int target=6;

        int i=0;
        int j=num.length-1;
        int sum=0;

        while(i<j)
        {
            sum=num[i]+num[j];


            if(sum > target)
            {
                j--;
            }
            else if(sum < target
            ){
                i++;
            }
            else {

                System.out.println(i+","+j);
                break;

            }

        }
    }
}

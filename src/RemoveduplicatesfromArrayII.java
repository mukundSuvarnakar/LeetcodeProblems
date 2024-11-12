public class RemoveduplicatesfromArrayII {

    public static void main(String[] args) {
        //[1,1,1,2,2,3]
        //[1,1,2,2,3,_]

        int[] num={1,1,1,2,2,3};
        int j=2;



        for(int i=j;i<num.length;i++)
        {
            if(num[j-2]!=num[i])
            {
                num[j]=num[i];
                j++;
            }

        }

        for(int n=0;n<j;n++)
        {
            System.out.println(num[n]);
        }

    }
}

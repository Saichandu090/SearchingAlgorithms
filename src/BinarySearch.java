import java.util.Arrays;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] ar={56,847,364,36,1,45,32,7};
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        int rs=binarySearch(ar,364);
        System.out.println("Index is : "+rs);
    }

    public static int binarySearch(int[] ar,int ele)
    {
        return binarySearch(ar,ele,0,ar.length-1);
    }
    public static int binarySearch(int[] ar,int ele,int l,int h)
    {
        if(l>h)
            return -1;
        int mid=(l+h)/2;
        if(ar[mid]==ele)
            return mid;
        if(ele<ar[mid])
            return binarySearch(ar,ele,l,mid-1);
        else
            return binarySearch(ar,ele,mid+1,h);
    }
}

public class LinearSearch
{
    public static void main(String[] args) {

        int[] ar={23,45,674,53,224,1,2,37};

        int rs=linearSearch(ar,674);
        System.out.println("Index is "+rs);
    }

    public static int linearSearch(int[] ar,int ele)
    {
        return linearSearch(ar,ele,0);
    }

    public static int linearSearch(int[] ar,int ele,int l)
    {
        if(l>ar.length-1)
            return -1;
        else if(ar[l]==ele)
            return l;
        return linearSearch(ar,ele,l+1);
    }
}

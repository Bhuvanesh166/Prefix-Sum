import java.util.Scanner;

public class PrefixSum{
    public int[] findPrefixSum(int arr[]){
        int psum[]=new int[arr.length];
        // psum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PrefixSum prefixSum=new PrefixSum();
        System.out.println("Enter size of array:");
        int sze=scanner.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[sze];
        for (int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        prefixSum.findPrefixSum(arr);
        System.out.println("Prefix Sum");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
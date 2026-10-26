package AdvanceRecursion;
import java.util.*;
public class MergeSort {
    public static void conquer(int[] a,int start,int mid,int end) {
        int s=end-start+1,i=start,j=mid+1,k=0;
        int[] ar=new int[s];
        while(i<=mid&&j<=end){
            if(a[i]<a[j]){
                ar[k]=a[i++];
            }
            else{
                ar[k]=a[j++];
            }
            k++;
        }
        while(i<=mid){
            ar[k++]=a[i++];
        }
        while(j<=end){
            ar[k++]=a[j++];
        }
        k=0;
        while(k<s){
            a[start+k]=ar[k];
            k++;
        }
    }
    public static void divide(int[] a,int start,int end) {
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(a,start,mid);
        divide(a,mid+1,end);
        conquer(a,start,mid,end);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        divide(a, 0, s - 1);
        for(int i=0;i<s;i++){
            System.out.print(a[i]+" ");
        }
    }
}

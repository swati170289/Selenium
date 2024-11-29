import java.util.Arrays;
public class ArrayCopy {

	public static void main(String[] args) {
		int a[]= {1,2,3,6,2,8};
        int copy[]= new int [6];
        
        for(int i=0;i<a.length;i++) 
        {
        	copy[i]=a[i];
        }
        System.out.println(Arrays.toString(copy));
	}
      
}

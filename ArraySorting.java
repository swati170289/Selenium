import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int a []= {2,5,3,7,3,6};
		int b[] = new int[6];
		int temp;
		int i;
		int j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
										
				}
			}
		    b[i] = a[i];
//			System.out.print("\n" + "The sorted array is"+ " " +a[i]);
		}
		System.out.print(Arrays.toString(b));
	}

}

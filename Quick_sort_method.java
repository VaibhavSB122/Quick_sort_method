package list;

import java.util.Arrays;

public class Quick_sort_method {
public static void main(String[] args) {
	int [] a= {4,1,3,5,2};
	int si=0,ei=a.length-1;
	quicksort(a,si,ei);
	System.out.println(Arrays.toString (a));
}

static void quicksort(int[]a,int si,int ei)
{
	if(si<ei) {
		int pivote =partition (a,si,ei);
		quicksort(a,si,pivote-1);
		quicksort(a,pivote,ei);
	}
	
}
static int partition (int[]a,int si ,int ei) {
	int pivote =ei;
	int i=si-1;
	for(int j=si;j<=ei;j++)
	{
		if(a[j]<=a[pivote])
				{
			i++;
			swap(a,i,j);
			
				}
	}
	return i;
}
  static  void swap(int[]a, int i, int j)
{
	int temp=a[i];
			a[i]=a[j];
					a[j]=temp;
}

}















public class SecondMinimumValue {
    public static int getSecondMinimumValue(int[]a,int total){
        int temp;
        for (int i=0; i<total; i++){
            for(int j=i+1; j<total; j++){
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[1];
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={24,14,60,50,80};
        System.out.println("Second minimum Value is: "+getSecondMinimumValue(a,5));
        System.out.println("Second minimum Value is: "+getSecondMinimumValue(b,5));
    }
}

public class SortedStrictly {
    public static boolean Sorted(int a[],int idx){
        if(idx==a.length-1){
            return true;
            
        }
        if(a[idx]<a[idx+1]){
            return Sorted(a, idx+1);


        }
        else{

            return false;
        }
    }
    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        Sorted(a, 0);
        if(Sorted(a, 0)==true){
            System.out.println("it is an Strictly Sorted Array");
        

        }
        else{
            System.out.println("it is not Strictly Sorted Array");
        }
    }  
}

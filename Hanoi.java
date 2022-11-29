public class Hanoi {
    public static void TowerOfHanoi(int n,String Src, String Helper, String Destination){
        if(n==0){
            System.out.println("transfer disk "+n+" from "+Src+" to "+Destination);

        }
        else{
            TowerOfHanoi(n-1, Src,Destination,Helper);
            System.out.println("transfer disk "+n+" from "+Src+" to "+Destination);
            TowerOfHanoi(n-1, Helper, Src, Destination);
        }
    
    }
    public static void main(String[] args) {
       int n=1;
       TowerOfHanoi(n, "SRC", "Helper", "destination");

    }   

}

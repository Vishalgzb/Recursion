public class MoveAllXAtLast {
    
    public static void Move(String a,int idx,int Count,String b){
        
        if(idx==a.length()){
        
            for(int i=0;i<Count;i++){

                b+='x';
                

            }
            System.out.println(b);
            

            

            return;
            
        }
        else{
            char Curr = a.charAt(idx);
            if(Curr=='x'){
                

                 Count++;
                 
                 
                Move(a, idx+1, Count, b);


            }
            else{
                b += Curr;
                Move(a, idx+1, Count, b);
            }
        }    
    
    }
    public static void main(String[] args) {
        String a ="axbxcd";
        Move(a, 0, 0, "");

    }   
}

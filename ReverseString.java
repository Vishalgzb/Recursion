public class ReverseString {
public static void ReverseString(String a,int idx){
    if(idx==0){
        System.out.println(a.charAt(idx));
        return;
    }
    else{
        System.out.println(a.charAt(idx));
        ReverseString(a, idx-1);
    }
}    
    public static void main(String[] args) {
        String a ="abc";
        ReverseString(a, a.length()-1);


    }
}

public class StringReversal {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Rajeev") ;
        for(int i = 0 ; i < sb.length()/2 ; i++){
            int last = sb.length() - 1 - i ;
            char ch1 = sb.charAt(i) ;
            char ch2 = sb.charAt(last) ;
            sb.setCharAt(i,ch2) ;
            sb.setCharAt(last,ch1) ;
        }
        System.out.print(sb) ;
    }
}

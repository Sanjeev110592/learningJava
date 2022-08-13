public class StringBuilders {
    public static void main(String[] arg){
        StringBuilder sb = new StringBuilder("Sanjeev") ;
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'R');
        sb.setCharAt(6,'t');
        sb.insert(1,'h') ;
        sb.delete(1,2) ;
        sb.append(" Kumar") ;
        System.out.println(sb.length());
    }
}

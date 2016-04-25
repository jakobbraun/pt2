package assignment1;
import java.util.HashSet;
import java.util.Set;

/***
 * 
 * @author Wilhelm Friedemann, Jakob Braun
 *
 */
public class Sbahn {
    public static void main(String[] args) {
        //Sorgt dafür, dass der Code auf Code Ocean ausgeführt wird.
        System.out.println(numVerbindungen(144, 144));
    }

    public static int numVerbindungen(int A, int B) {
        if(!((1 <= A) && (A <= B) && (B <= 86400)))
            throw(new IllegalArgumentException());
        int c = 0;
        for(int i = A; i <= B; i++){
            if(checkNumber(i))
                c++;
        }
        return c;
    }
    
    public static boolean checkNumber(int nr){
        String str = "" + nr; 
        String inv = new StringBuilder(str).reverse().toString();
        if(str.equals(inv))
        	return true;
        
        char[] charArray = str.toCharArray();
        Set set = new HashSet();
        for(char c : charArray){
        	if(set.contains(c))
        		return false;
            set.add(c);
        }
        return true;
    }
}

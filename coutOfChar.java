import java.util.HashMap;

public class coutOfChar {
    public static void charCount(String s){
        char[] chars=s.toCharArray();
        HashMap<Character,Integer> fmap=new HashMap<>();
        for(char c: chars){
            //System.out.println(c);
            fmap.put(c,fmap.getOrDefault(c, 0)+1);
        }
        for(char c: fmap.keySet()){
            System.out.println(c+":"+fmap.get(c));
        }
    }
    public static void main(String[] args) {
        String word= "Lokeshh";
        charCount(word);
    }
    
}

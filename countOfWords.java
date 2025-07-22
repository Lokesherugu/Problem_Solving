import java.util.HashMap;

public class countOfWords {
    public static void wordCountOf(String s){
        //splitting the words
        String[] words=s.split(" ");
                HashMap<String,Integer> fmap=new HashMap<>();

        for(String word:words){
            //System.out.println(word);
        
        fmap.put(word,fmap.getOrDefault(word,0)+1);
    
    }
        
        for(String word:fmap.keySet()){
            System.out.println(word+": "+fmap.get(word));
        }
    
    
    }
    public static void main(String[] args) {
        String sentence="hey...! my name is lokesh";
        wordCountOf(sentence);
    }
    
}

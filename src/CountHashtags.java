import java.util.*;

public class CountHashtags {
    public static void main(String... args) {
        List<String> tweets = new ArrayList<>();
        tweets.add("#Java and #Scala are the languages");
        tweets.add("#Scala is functional language");
        tweets.add("#Java is non functional language");
        tweets.add("#Java is oop language");
        tweets.add("#Java is the best language");
        tweets.add("IBM are building an integrated platform with work with #Java #Scala and #cognitive");

        Map<String, Long> hashtagMap = new HashMap<>();

        tweets.stream().forEach(tweet -> {
            String[] words = tweet.split(" ");
            Arrays.stream(words).forEach(word -> {
                if(word.charAt(0) == '#') {
                    if(hashtagMap.get(word) == null) hashtagMap.put(word, 1L);
                    else hashtagMap.put(word, hashtagMap.get(word) + 1);
                }
            }
            );
        });
        System.out.println(hashtagMap);
        //OutPut: {#Java=5, #Scala=3, #cognitive=1}
    }


}

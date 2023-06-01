
import java.util.Arrays;

public class KyloRenChallenge {

    public static void main(String[] args) {
        System.out.println(areAnagrams("Kylo Ren", "KN Lore Y")); // output: true

    }

    static boolean areAnagrams(String word1, String word2) {
        return sortCharactersAndRemoveSpaces(word1).equals(sortCharactersAndRemoveSpaces(word2));
    }

    static String sortCharactersAndRemoveSpaces(String word) {
        char[] chars = word.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}


import java.util.*;

public class RareNotesChallenge {

    public static void main(String[] args) {
        int[] notes = {1, 2, 3, 2, 2, 1, 5, 5};
        int[] rareNotes = getRareNotes(notes);
        System.out.println(Arrays.toString(rareNotes));
    }

    static int[] getRareNotes(int[] notes) {
        Map<Integer, Integer> noteCounts = countNoteOccurrences(notes);
        List<Integer> rareNotesList = findRareNotes(noteCounts);

        return convertListToArray(rareNotesList);
    }

    static Map<Integer, Integer> countNoteOccurrences(int[] notes) {
        Map<Integer, Integer> noteCounts = new HashMap<>();
        for (int note : notes) {
            noteCounts.put(note, noteCounts.getOrDefault(note, 0) + 1);
        }
        return noteCounts;
    }

    static List<Integer> findRareNotes(Map<Integer, Integer> noteCounts) {
        List<Integer> rareNotesList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : noteCounts.entrySet()) {
            if (entry.getValue() == 1) {
                rareNotesList.add(entry.getKey());
            }
        }
        return rareNotesList;
    }

    static int[] convertListToArray(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        } else {
            int[] array = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }
            return array;
        }
    }
}

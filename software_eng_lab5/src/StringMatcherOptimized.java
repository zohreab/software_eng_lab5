import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class StringMatcherOptimized {

    private static final int LIST_SIZE = 100000;

    public static void main(String[] args)  {

        List<String> list1 = generateRandomStringList(LIST_SIZE);
        Set<String> set1 = new HashSet<>(list1);  // Conversion to set for O(1) lookup
        List<String> list2 = generateRandomStringList(LIST_SIZE);

        List<String> commonStrings = findCommonStrings(set1, list2);
        System.out.println("Number of common strings: " + commonStrings.size());
    }

    private static List<String> generateRandomStringList(int size) {
        List<String> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            byte[] array = new byte[7];
            rand.nextBytes(array);
            list.add(new String(array));
        }
        return list;
    }

    private static List<String> findCommonStrings(Set<String> set1, List<String> list2) {
        List<String> commonList = new ArrayList<>();
        for (String str2 : list2) {
            if (set1.contains(str2)) {
                commonList.add(str2);
                set1.remove(str2);  // remove to avoid duplicates
            }
        }
        return commonList;
    }
}

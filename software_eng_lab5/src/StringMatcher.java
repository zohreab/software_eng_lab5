import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringMatcher {
    private static final int LIST_SIZE = 100000;

    public static void main(String[] args)  {

        List<String> list1 = generateRandomStringList(LIST_SIZE);
        List<String> list2 = generateRandomStringList(LIST_SIZE);

        List<String> commonStrings = findCommonStrings(list1, list2);
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

    private static List<String> findCommonStrings(List<String> list1, List<String> list2) {
        List<String> commonList = new ArrayList<>();
        for (String str1 : list1) {
            for (String str2 : list2) {
                if (str1.equals(str2)) {
                    commonList.add(str1);
                }
            }
        }
        return commonList;
    }
}

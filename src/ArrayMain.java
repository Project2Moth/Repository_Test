import java.util.Arrays;
import java.util.List;

public class ArrayMain {
    public static void main(String[] args) {
        List<String> diff = null;
        List<String> list1 = Arrays.asList(new String[]{"a", "b", "c","d","e"});
        List<String> list2 = Arrays.asList(new String[]{"a", "b","c","d"});
        if (!list1.containsAll(list2) && list2.removeAll(list1)) {
            for (String s : list2) {
                diff.add(s);
            }
        }
        System.out.println("List: " + diff);

    }
}

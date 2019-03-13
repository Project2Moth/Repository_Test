import java.util.*;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "node");
        map1.put(2, "fds");
        map1.put(3, "nodsfdsde");
        map1.put(4, "dssd");
        int a = 1;
        for (Object key : map1.keySet()) {
            if (key.equals(a)) {
                System.out.println(map1.get(key));
            }
        }
    }
}

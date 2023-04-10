import java.util.Arrays;
import java.util.LinkedList;

public class Task1 {

    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    
public static void main(String[] args) {
    

    LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    LinkedList<Integer> reversedList = reverseLinkedList(list);
    System.out.println(reversedList); 
}
}

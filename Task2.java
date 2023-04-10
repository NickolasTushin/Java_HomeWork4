//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

class Task2<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        return list.poll();
    }

    public T first() {
        return list.peek();
    }
public static void main(String[] args) {
    
// Пример использования
Task2<String> queue = new Task2<>();
queue.enqueue("Первый элемент");
queue.enqueue("Второй элемент");
System.out.println(queue.first()); 
System.out.println(queue.dequeue()); 
System.out.println(queue.first()); 
}
}
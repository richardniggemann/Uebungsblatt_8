package h2;

public class H2_main {
    public static void main(String[] args) {
        SimpleList myList = new SimpleList();
        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);
        print(myList);
        myList.insertAfter(45, 4);
        print(myList);
        System.out.println(myList.findFirst(45));
        myList.delete(45);
        print(myList);
    }

    public static void print(SimpleList list) {
        Node iterate = list.head;
        while (iterate != null) {
            System.out.print(iterate.value);
            System.out.print(", ");
            iterate = iterate.next;
        }
        System.out.println();
    }
}

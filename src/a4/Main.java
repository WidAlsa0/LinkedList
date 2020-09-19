package a4;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);

        LinkedList list2 = new LinkedList<Integer>();
        list2.add(5);
        list2.add(6);
        list2.add(3);

        LinkedList list3 = new LinkedList<Integer>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(2);
        list3.add(1);

        LinkedList list4 = new LinkedList<Integer>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(3);
        list4.add(4);


//        list.removeAtIndex(0);
//        System.out.println(list.toString());

//        System.out.println(list.isEqual(list2));

//        System.out.println(list3.isSymmetrical());

//        list2.multiply(2);
//        System.out.println(list2.toString());

//        list4.removeRepeats();
//        System.out.println(list4);

//        list.reverse();
//        System.out.println(list.toString());

//        list.merge(list2);
//        System.out.println(list.toString());

        list4.containsCycle();



    }
}

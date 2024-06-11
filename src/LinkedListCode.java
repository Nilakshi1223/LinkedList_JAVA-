import java.util.LinkedList;
public class LinkedListCode {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Malith");
        names.add("Sasa");
        names.add("Kalana");
        names.add("Umesha");
        names.add("Chaturika");

        System.out.println("Names         : - " + names);

        names.add(3,"Gawesh");

        System.out.println("Updated names : - " + names);

        names.get(2);

        System.out.println("2nd index     : - " + names);

        names.set(1, "Sasadara Gamhewa");

        System.out.println("New names     : - " + names);

        String a = names.remove(3);

        System.out.println("Removed name  : - " + a);

        System.out.println("New names     : - " + names);

    }
}

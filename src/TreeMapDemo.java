import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<ZooAnimal, Integer> animal = new TreeMap<>();
        ZooAnimal lion = new ZooAnimal(7, "Leo");
        ZooAnimal giraffe = new ZooAnimal(6, "Gloria");
        ZooAnimal wolf = new ZooAnimal(1, "Rex");
        ZooAnimal hippopotamus = new ZooAnimal(3, "Hipo");
        ZooAnimal elephant = new ZooAnimal(15, "Laura");

        animal.put(lion, lion.getAge());
        animal.put(giraffe, giraffe.getAge());
        animal.put(wolf, wolf.getAge());
        animal.put(hippopotamus, hippopotamus.getAge());
        animal.put(elephant, elephant.getAge());

        System.out.println("The implementation output values TreeMap with entrySet:");
        for (Map.Entry entry : animal.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("The implementation output values TreeMap with keySet:");
        for (ZooAnimal key : animal.keySet()) {
            System.out.println(key + " - " + animal.get(key));
        }
    }
}


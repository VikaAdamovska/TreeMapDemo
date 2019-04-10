
    public class ZooAnimal implements Comparable<ZooAnimal> {
        private int age;
        private String name;

        public ZooAnimal(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(ZooAnimal o) {
            return name.compareTo(o.getName());
        }
    }


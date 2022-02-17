import java.util.List;

public class Functional {
    public static void main(String[] args) {
        List.of(new Person("John", Gender.MALE), new Person("Jane", Gender.FEMALE),
                new Person("Juliana", Gender.FEMALE), new Person("Juliet", Gender.FEMALE));
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", gender='" + gender + '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
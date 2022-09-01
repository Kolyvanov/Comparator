import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Иван", "Иванов", 18));
        persons.add(new Person("Юля", "Сорока Цюпа", 34));
        persons.add(new Person("Мохаммед", "ибн Абдурахман ибн Хоттаб", 101));
        persons.add(new Person("Джон", "Дональд Трамп", 80));
        persons.add(new Person("Александр", "Алексеевич Алексеев", 53));
        persons.add(new Person("Саша", "Петров", 10));
        persons.add(new Person("Муса", "Ходжи Расулович Газматов", 97));

        System.out.println(persons);

        Comparator<Person> comparator = (o1, o2) -> {
            String[] words1 = o1.getSurname().split(" ");
            String[] words2 = o2.getSurname().split(" ");
            if (words1.length >= 3 && words2.length >= 3) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else if (words1.length != words2.length) {
                return Integer.compare(words1.length, words2.length);
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        persons.sort(comparator);
        System.out.println(persons);
    }
}

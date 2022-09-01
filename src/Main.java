import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
        persons.add(new Person("Витя", "Сильченко", 11));

        System.out.println(persons);

        Predicate<Person> predicate = person -> person.getAge() < 18;
        persons.removeIf(predicate);

        System.out.println(persons);

        persons.sort(new PersonComparator(3));
        System.out.println(persons);
    }
}

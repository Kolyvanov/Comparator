import java.util.ArrayList;
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

        persons.sort(new PersonComparator(3));
        System.out.println(persons);
    }
}

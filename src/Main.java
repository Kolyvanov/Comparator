import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("����", "������", 18));
        persons.add(new Person("���", "������ ����", 34));
        persons.add(new Person("��������", "��� ���������� ��� ������", 101));
        persons.add(new Person("����", "������� �����", 80));
        persons.add(new Person("���������", "���������� ��������", 53));
        persons.add(new Person("����", "������", 10));

        System.out.println(persons);

        persons.sort(new PersonComparator());
        System.out.println(persons);
    }
}

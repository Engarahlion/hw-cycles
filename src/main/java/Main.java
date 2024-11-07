import ru.netology.services.Service;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        int count = service.calculate(10000, 3000, 20000);
        System.out.println("Удастся отдохнуть " + count + " месяца(ев)");
    }
}
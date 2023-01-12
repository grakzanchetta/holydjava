import java.util.*;

public class App {
    public static void main(String[] args) {
        Holiday holidaysList = new Holiday();
        Scanner input = new Scanner(System.in);
        System.out
                .println("Digite uma data no formato dd/mm/aaaa ou 'x' para listar todos.");
        String date = input.nextLine();
        holidaysList.getHoliday(date);
        input.close();
    }
}
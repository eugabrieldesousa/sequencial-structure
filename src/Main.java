import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Expressoes aritmeticos
        // + - * / &
        // Precedencia
//        int y = 32;
//        double x = 10.0928;
//
//        System.out.println(x);
//        System.out.println(y);
//
//        System.out.printf("%.2f\n", x);
//        System.out.printf("%.4f\n", x);
//        Locale.setDefault(Locale.US);

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // exemplo de saida:
//        Products:
//        Computer, which price is $ 2100,00
//        Office desk, which price is $ 650,50
//        Record: 30 years old, code 5290 and gender: F
//        Measue with eight decimal places: 53,23456700
//        Rouded (three decimal places): 53,235
//        US decimal point: 53.235

        System.out.println("Products");
        System.out.printf("%s, which price is %.2f \n", product1, price1);
        System.out.printf("%s, which price is %.2f \n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s \n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %f \n", measure);
        System.out.printf("Rouded (three decimal places): %.3f \n", measure);


    }
}

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double total = service.calculate(38,1.51);
        System.out.println(total);
    }
}

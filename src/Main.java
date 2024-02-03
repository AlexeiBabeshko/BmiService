public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 85;
        double height = 1.80;
        int result = service.calculate(weight, height);
        System.out.println("BMI index: " + result);
    }
}
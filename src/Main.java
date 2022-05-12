public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int imt = service.calculate(78, 1.63);

        System.out.println("Ваш ИМТ составил " + imt);
    }

}

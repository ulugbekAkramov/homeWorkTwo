public class Main {
    public static void main(String[] args) {
        System.out.println(ageTemperature(45, 20));
        System.out.println(ageTemperature(25, 23));
        System.out.println(ageTemperature(35, 26));
        System.out.println(ageTemperature(42, 21));
        System.out.println(ageTemperature(40, 29));
    }

    public static String ageTemperature(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять!";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять!";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять!";
        } else {
            return "Оставайтесь дома";
        }
    }
}

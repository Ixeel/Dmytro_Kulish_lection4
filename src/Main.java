public class Main {
    public static void main(String[] args) {
        //1st task
        int number = 5;
        int square = ToSquare(number);
        System.out.println("Квадрат числа "+number +" дорівнює = "+square);

        //2nd task
        double radius = 3.5;
        double height = 10;
        double result = Cylinder(radius,height);
        System.out.println("Об'єм циліндра з радіусом "+radius+" і висотою "+height+" дорівнює = "+result);

        //3rd task
        int a = 2;
        int b = 3;
        int result_pow = NumberPow(2,3);
        System.out.println("Результат "+a + "^" + b +" дорівнює = " +result_pow);
    }
    public static int ToSquare(int num) {
        return num*num;
    }

    public static double Cylinder(double radius, double height) {
        return Math.PI * Math.pow(radius,2)*height;
    }

    public static int NumberPow(int a, int b) {
        return (int) Math.pow(a,b);
    }
}
public class HomeworkTwo {
    public static void main(String[] args) {


    }
    public static boolean exeOne(int a, int b) {
        if (a + b > 10 && a + b <= 20) {
        return true;
    }
        else return false;

    }
    public static void exeTwo (int a) {
        if (a >= 0) {
            System.out.println("Положительно число");
        } else {
            System.out.println("Отрицательное число");
        }

    }
    public static boolean exeThree(int a) {
        if (a >= 0) {
            return true;
        } else return false;
    }
    public static void exeFour(String a, int b ){
         for (int i=0; i<b; i++) {
             System.out.println(a);
         }
        }
}

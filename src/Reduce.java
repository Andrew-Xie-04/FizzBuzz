public class Reduce {
    public static void main(int args) {
        int num = args;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            }
            else{
                num = num - 1;
            }
            System.out.println(num);
        }
    }
}

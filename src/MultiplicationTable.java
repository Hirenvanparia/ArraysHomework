public class MultiplicationTable {


    static void Table(int n) {
        int i = 1;
//using while method
        do{
            System.out.printf("%4d", n * i);
            i = i + 1;
        } while(i <= 3);
        System.out.println("");
    }
    // main method
    public static void main(String[] args) {
        int i = 1;
        do{
            Table(i);
            i = i + 1;
        } while (i <= 3
        );
    }
}


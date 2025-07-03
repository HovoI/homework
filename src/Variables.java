public class Variables {
    //1
    static byte a = -98;
    static byte b = 29;
    //2
    static short c = 546;
    static short d = -324;
    //3
     static int e = 1000;
    static int f = -249000;
    //4
    static long g = 4000000;
    static long h = -3600000;


    public static void printByte(byte x, byte y) {
        System.out.println(x + "," + y);
    }

    public static void printShort(short x, short y) {
        System.out.println(x + "," + y);
    }

    public static void print(int x, int y) {
        System.out.println(x + "," + y);
    }
    public static void print(long x, long y){
        System.out.println(x + "," +y);
    }

    public static void main(String[] args) {
        printByte(a, b);
        printShort(c, d);
        print(e, f);
        print(g, h);
    }
}


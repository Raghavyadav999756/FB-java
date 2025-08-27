public class typeconversion {
    public static void main(String[] args) {
        // Implicit Conversion
        double doublenum=99.99;
        int intnum=(int) doublenum;
        int bigvalue=300;
        byte smallvalue=(byte) bigvalue;
        System.out.println("Double to Int: "+doublenum);
        System.out.println("int (after casting)"+intnum);
        System.out.println("int 300 TO BYTE"  +  smallvalue);
    }
}



byte> short> int> long> float> double
char> int
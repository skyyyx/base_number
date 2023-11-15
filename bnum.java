public class bnum {
    public static void main(String[] args) {
        int decimalNumber = 10;
        System.out.println(decimalNumber + " ในรูปฐาน 2 คือ " + decimalToBinary(decimalNumber));
    }

    static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
public class bnum {
    public static void main(String[] args) {
        int decimalNumber = 255;
        System.out.println(decimalNumber + " ในรูปฐาน 16 คือ " + decimalToHex(decimalNumber));
    }

    static String decimalToHex(int decimal) {
        return Integer.toHexString(decimal);
    }
}
public class bnum {
    public static void main(String[] args) {
        String binaryNumber = "1010";
        System.out.println(binaryNumber + " ในรูปฐาน 10 คือ " + binaryToDecimal(binaryNumber));
    }

    static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
}
public class bnum {
    public static void main(String[] args) {
        String binaryNumber = "1010";
        System.out.println(binaryNumber + " ในรูปฐาน 16 คือ " + binaryToHex(binaryNumber));
    }

    static String binaryToHex(String binary) {
        int decimalNumber = Integer.parseInt(binary, 2);
        return Integer.toHexString(decimalNumber);
    }
}
public class bnum {
    public static void main(String[] args) {
        String hexNumber = "1A";
        System.out.println(hexNumber + " ในรูปฐาน 2 คือ " + hexToBinary(hexNumber));
    }

    static String hexToBinary(String hex) {
        int decimalNumber = Integer.parseInt(hex, 16);
        return Integer.toBinaryString(decimalNumber);
    }
}
public class HexToDecimal {
    public static void main(String[] args) {
        String hexNumber = "1A";
        System.out.println(hexNumber + " ในรูปฐาน 10 คือ " + hexToDecimal(hexNumber));
    }

    static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }
}

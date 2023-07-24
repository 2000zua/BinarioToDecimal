import javax.swing.*;

public class BinToDec {
    public static int binTodec(String binary){
        int decimal =0;
        int power = 0;

        for (int i = binary.length() - 1; i >=0; i--){
            char digital = binary.charAt(i);
            int intValue = Character.getNumericValue(digital);
            decimal += intValue* Math.pow(2,power);
            power++;
        }
        return decimal;
    }

    public static void start(){
        String input = JOptionPane.showInputDialog(null, "Digite o numero em decimal");
        int decimalNumber = BinToDec.binTodec(input);
        JOptionPane.showMessageDialog(null, "Binary: "+input+" To Decimal: "+decimalNumber);
    }
}

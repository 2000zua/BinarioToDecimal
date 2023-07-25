import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        boolean RUN = true;
        while (RUN){
            BinToDec.start();
            String resp = JOptionPane.showInputDialog(null, "Desejas terminar o programa ? [Sim/Nao]");
            if (resp.toString().toUpperCase().equals("SIM") || resp.toString().toUpperCase().equals("S")) {
                RUN = false;
            }

        }

    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class HelpDesign implements Runnable {

    public HelpA help;
    public String examName;
    public String examDetails;

    public HelpDesign(HelpA h) {
        help = h;
        examName = "n.TicTacToe";
        examDetails = "";
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            help.getMegaTitle().setText(help.getMegaTitle().getText() + examName.toCharArray()[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Error to design cradits." + ex);
            }
            i++;
            if (i == examName.length()) {
                break;
            }
        }

        int j = 0, k = 0;
        while (true) {
            if (j % 2 == 0) {
                help.getMyName().setForeground(Color.red);
            } else if (j % 3 == 0) {
                help.getMyName().setForeground(Color.BLUE);
            } else {
                help.getMyName().setForeground(Color.BLACK);
            }
            if (k <= examDetails.length()) {
                help.getDetails().setText(help.getDetails().getText() + examDetails.toCharArray()[k]);
                k++;
            }
            if (k == examDetails.length()) {
                k = 0;
                help.getDetails().setText("");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Error to design cradits." + ex);
            }
            j++;
        }
    }
}

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

    public CreditsFrame help;
    public String projectTitle;

    public HelpDesign(CreditsFrame h) {
        help = h;
        projectTitle = "n.TicTacToe";
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            help.getMegaTitle().setText(help.getMegaTitle().getText() + projectTitle.toCharArray()[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Error to design cradits." + ex);
            }
            i++;
            if (i == projectTitle.length()) {
                break;
            }
        }
    }
}

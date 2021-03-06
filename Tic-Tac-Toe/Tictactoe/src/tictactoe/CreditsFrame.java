/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreditsFrame.java
 *
 * Created on Jan 28, 2012, 5:54:52 PM
 */
package tictactoe;

import javax.swing.JLabel;

/**
 *
 * @author Nasir
 */
public class CreditsFrame extends javax.swing.JFrame {

    public HelpDesign hd;

    /** Creates new form HelpA */
    public CreditsFrame() {
        hd = new HelpDesign(this);
        initComponents();
        setLocation(895, 100);
        super.setTitle("Help");
        new Thread(hd).start();
    }

    public JLabel getMegaTitle() {
        return megaTitle;
    }

    public void setMegaTitle(JLabel megaTitle) {
        this.megaTitle = megaTitle;
    }

    public JLabel getMyName() {
        return myName;
    }

    public void setMyName(JLabel myName) {
        this.myName = myName;
    }
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        megaTitle = new javax.swing.JLabel();
        myName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setTitle("Credits");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 153));

        megaTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        megaTitle.setForeground(new java.awt.Color(51, 51, 255));
        megaTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        myName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        myName.setForeground(new java.awt.Color(0, 204, 51));
        myName.setText("MD. NASIR UDDIN BHUIYAN");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Senior Software Engineer");

        jLabel3.setBackground(new java.awt.Color(0, 255, 153));
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("E-mail: nubnasir@gmail.com");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(megaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(myName, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(megaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(myName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel megaTitle;
    private javax.swing.JLabel myName;
    // End of variables declaration//GEN-END:variables
}

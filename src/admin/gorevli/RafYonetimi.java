/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.gorevli;

import com.yedekparca.Common;
import com.yedekparca.MYSQLDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author Bireysel
 */
public class RafYonetimi extends javax.swing.JFrame {

    /**
     * Creates new form RafYonetimi
     */
    public RafYonetimi() {
        initComponents();
        fncRafGetir();
    }

    public void fncRafEkle() {

        try {
            int sonuc = new MYSQLDB().baglan().executeUpdate("CALL proRafEkle('" + txtRafAdi.getText().trim() + "','" + txtRafTanim.getText().trim() + "'," + Common.aid + ")");
            if (sonuc > 0) {
                JOptionPane.showMessageDialog(this, "Raf Ekleme Başarılı");
                txtRafAdi.setText("");
                txtRafTanim.setText("");
                fncRafGetir();
            }
        } catch (SQLException ex) {
            Logger.getLogger(RafYonetimi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    DefaultListModel<String> dlmRaf = new DefaultListModel<>();
    ArrayList<Integer> alRafId = new ArrayList<>();
    ArrayList<String> alRafTanim = new ArrayList<>();

    public void fncRafGetir() {
        alRafId.clear();
        alRafTanim.clear();
        dlmRaf.removeAllElements();
        try {
            ResultSet rs = new MYSQLDB().baglan().executeQuery("CALL proRafGetir");
            while (rs.next()) {
                dlmRaf.addElement(rs.getString("radi"));
                alRafId.add(rs.getInt("rid"));
                alRafTanim.add(rs.getString("tanim"));

            }
            System.out.println("raf id : " + alRafId);
            listRaf.setModel(dlmRaf);
        } catch (SQLException ex) {
            Logger.getLogger(RafYonetimi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void fncRafSil() {
        try {
            int sonuc = new MYSQLDB().baglan().executeUpdate("CALL proRafSil('" + alRafId.get(listRaf.getSelectedIndex()) + "')");
            if (sonuc > 0) {

            }
        } catch (SQLException ex) {
            Logger.getLogger(RafYonetimi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fncRafDuzenle(){
        try {
           int sonuc  = new MYSQLDB().baglan().executeUpdate("CALL proRafDuzenle("+alRafId.get(listRaf.getSelectedIndex())+",'"+txtRafAdi.getText().trim()+"','"+txtRafTanim.getText().trim()+"')");
            if (sonuc > 0) {
                JOptionPane.showMessageDialog(this, "Düzenleme Başarılı");
               fncRafGetir();
               txtRafAdi.setText("");
               txtRafTanim.setText("");
               
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(RafYonetimi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRafAdi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRafTanim = new javax.swing.JTextArea();
        btnRafKaydet = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listRaf = new javax.swing.JList<>();
        btnRafDuzenle = new javax.swing.JButton();
        btnRafSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Raf Yöntimi");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Raf Yönetimi"));

        jLabel1.setText("Raf Adı");

        jLabel2.setText("Raf Tanım");

        txtRafTanim.setColumns(20);
        txtRafTanim.setRows(5);
        jScrollPane1.setViewportView(txtRafTanim);

        btnRafKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Save-icon.png"))); // NOI18N
        btnRafKaydet.setText("Kaydet");
        btnRafKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRafKaydetActionPerformed(evt);
            }
        });

        listRaf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listRafMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listRafMouseClicked(evt);
            }
        });
        listRaf.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                listRafInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane2.setViewportView(listRaf);

        btnRafDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/update.png"))); // NOI18N
        btnRafDuzenle.setText("Düzenle");
        btnRafDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRafDuzenleActionPerformed(evt);
            }
        });

        btnRafSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/delete.png"))); // NOI18N
        btnRafSil.setText("Sil");
        btnRafSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRafSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRafAdi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRafDuzenle)
                                .addGap(18, 18, 18)
                                .addComponent(btnRafSil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRafKaydet))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRafAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRafKaydet)
                    .addComponent(btnRafDuzenle)
                    .addComponent(btnRafSil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRafKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRafKaydetActionPerformed
        fncRafEkle();
    }//GEN-LAST:event_btnRafKaydetActionPerformed

    private void btnRafSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRafSilActionPerformed
        fncRafSil();
        fncRafGetir();
    }//GEN-LAST:event_btnRafSilActionPerformed

    private void listRafMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listRafMouseClicked


    }//GEN-LAST:event_listRafMouseClicked

    private void listRafInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_listRafInputMethodTextChanged

    }//GEN-LAST:event_listRafInputMethodTextChanged

    private void listRafMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listRafMouseReleased
        txtRafTanim.setText(alRafTanim.get(listRaf.getSelectedIndex()));
        txtRafAdi.setText(listRaf.getSelectedValue());
    }//GEN-LAST:event_listRafMouseReleased

    private void btnRafDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRafDuzenleActionPerformed

       fncRafDuzenle();
    }//GEN-LAST:event_btnRafDuzenleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RafYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RafYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RafYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RafYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RafYonetimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRafDuzenle;
    private javax.swing.JButton btnRafKaydet;
    private javax.swing.JButton btnRafSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listRaf;
    private javax.swing.JTextField txtRafAdi;
    private javax.swing.JTextArea txtRafTanim;
    // End of variables declaration//GEN-END:variables
}

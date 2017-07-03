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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class MusteriYonetimi extends javax.swing.JFrame {

    /**
     * Creates new form MusteriYonetimi
     */
    public MusteriYonetimi() {
        initComponents();
        musteriDataGetir();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        txtSoyadi = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdres = new javax.swing.JTextArea();
        btnEkle = new javax.swing.JButton();
        btnDuzenle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMusteri = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Müşteri Yönetimi");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Yönetimi"));

        jLabel1.setText("Adı");

        jLabel2.setText("Soyadı");

        jLabel3.setText("Mail");

        jLabel4.setText("Telefon");

        jLabel5.setText("Adres");

        txtAdi.setName(""); // NOI18N

        txtAdres.setColumns(20);
        txtAdres.setRows(5);
        jScrollPane1.setViewportView(txtAdres);

        btnEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Save-icon.png"))); // NOI18N
        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/update.png"))); // NOI18N
        btnDuzenle.setText("Düzenle");
        btnDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuzenleActionPerformed(evt);
            }
        });

        btnSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/delete.png"))); // NOI18N
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnTemizle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/clear.png"))); // NOI18N
        btnTemizle.setText("Temizle");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(txtSoyadi)
                            .addComponent(txtMail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefon))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDuzenle)
                        .addGap(18, 18, 18)
                        .addComponent(btnSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTemizle)
                        .addGap(18, 18, 18)
                        .addComponent(btnEkle)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTemizle))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDuzenle)
                        .addComponent(btnSil)))
                .addGap(10, 10, 10))
        );

        tblMusteri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Admin", "Adı", "Soyadı", "Mail", "Telefon", "Adres", "Tarhi"
            }
        ));
        tblMusteri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMusteriMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMusteri);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        musteriDataTemizle();
        txtAdi.requestFocus();
    }//GEN-LAST:event_btnTemizleActionPerformed
    
    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        
        String adi = txtAdi.getText().trim();
        String soyadi = txtSoyadi.getText().trim();
        String mail = txtMail.getText().trim();
        String telefon = txtTelefon.getText().trim();
        String adress = txtAdres.getText().trim();
        
        String sorgu = "insert into musteri values (null, '"+adi+"', '"+soyadi+"','"+telefon+"','"+mail+"','"+adress+"',now(), '"+Common.aid+"')";
        MYSQLDB db = new MYSQLDB();
        
        try {
            int sonuc = db.baglan().executeUpdate(sorgu);
            if (sonuc > 0){
                musteriDataTemizle();
                musteriDataGetir();
            }
            musteriDataTemizle();
        } catch (Exception e) {
            System.err.println("islem basarisiz" + e);
        }
    }//GEN-LAST:event_btnEkleActionPerformed
    
    int mid = -1;
    private void tblMusteriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMusteriMouseClicked
        int row = tblMusteri.getSelectedRow();
        mid = Integer.valueOf(String.valueOf(tblMusteri.getValueAt(row, 0)));
        String ad = "" + tblMusteri.getValueAt(row, 2);
        String soyad = "" + tblMusteri.getValueAt(row, 3);
        String telefon = "" + tblMusteri.getValueAt(row, 4);
        String mail = "" + tblMusteri.getValueAt(row, 5);
        String adres = "" + tblMusteri.getValueAt(row, 6);
        txtAdi.setText(ad);
        txtSoyadi.setText(soyad);
        txtTelefon.setText(telefon);
        txtMail.setText(mail);
        txtAdres.setText(adres);
    }//GEN-LAST:event_tblMusteriMouseClicked

    private void btnDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuzenleActionPerformed
        
        if (mid > 0) {
            try {
                String adi = txtAdi.getText().trim();
                String soyadi = txtSoyadi.getText().trim();
                String mail = txtMail.getText().trim();
                String telefon = txtTelefon.getText().trim();
                String adres = txtAdres.getText().trim();
                
                String sorgu = "update musteri set madi = '"+adi+"', msoyadi = '"+soyadi+"', mtelefon = '"+telefon+"', mmail = '"+mail+"', madres = '"+adres+"' where mid = '" +mid+"' ";
                MYSQLDB db = new MYSQLDB();
                int sonuc = db.baglan().executeUpdate(sorgu);
                
                if (sonuc > 0) {
                    JOptionPane.showMessageDialog(this, "Kayit Guncellendi");
                    musteriDataGetir();
                    musteriDataTemizle();
                }
                
            } catch (Exception e) {
                System.err.println("Duzenleme Hatasi: " + e );
            }
            
        }
    }//GEN-LAST:event_btnDuzenleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        
        if (mid > 0) {
            String sorguSil = "delete from musteri where mid = '"+mid+"' ";
            MYSQLDB db = new MYSQLDB();
            
            try {
                int sonuc = db.baglan().executeUpdate(sorguSil);
                if (sonuc > 0) {
                    JOptionPane.showMessageDialog(this, "Silme islemi basarili");
                    mid = -1;
                    musteriDataGetir();
                    musteriDataTemizle();
                }
                
            } catch (Exception e) {
                System.err.println("Sql Hatasi " + e);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Lutfen secim yapiniz");
        }









        // TODO add your handling code here:
    }//GEN-LAST:event_btnSilActionPerformed

    //-------------------------------------------------------------------------------------------------------------------------------
    public void musteriDataTemizle(){
        txtAdi.setText(null);
        txtSoyadi.setText(null);
        txtMail.setText(null);
        txtTelefon.setText(null);
        txtAdres.setText(null);
    }
    //-------------------------------------------------------------------------------------------------------------------------------
    public void musteriDataGetir(){
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Admin");
        dm.addColumn("Adi");
        dm.addColumn("Soyadi");
        dm.addColumn("Telefon");
        dm.addColumn("Mail");
        dm.addColumn("Adres");
        dm.addColumn("Tarih");
        try {
            ResultSet rs = new MYSQLDB().baglan().executeQuery("select * from musteri");
            while (rs.next()) {
                dm.addRow(new String[]{rs.getString("mid"), 
                    rs.getString("aid"), 
                    rs.getString("madi"), 
                    rs.getString("msoyadi"), 
                    rs.getString("mtelefon"), 
                    rs.getString("mmail"), 
                    rs.getString("madres"), 
                    rs.getString("mtarih")});
            }
            tblMusteri.setModel(dm);
        } catch (SQLException ex) {
            System.err.println("Data getirme hatasi: " + ex);
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------------------------------------------------
    
    
    //-------------------------------------------------------------------------------------------------------------------------------
    
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
            java.util.logging.Logger.getLogger(MusteriYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriYonetimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDuzenle;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMusteri;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextArea txtAdres;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtSoyadi;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
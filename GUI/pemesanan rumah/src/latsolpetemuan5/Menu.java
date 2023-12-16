package latsolpetemuan5;


import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.util.Vector;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author IPANG
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    private String getSelectedValue() {
    ButtonModel selectedButton = buttonGroup1.getSelection();
    if (selectedButton != null) {
        String selectedValue = selectedButton.getActionCommand();
        return selectedValue;
    } else {
        return null; // or some default value indicating nothing is selected
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        hargabangunan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        namapemesan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hargatanah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipe1 = new javax.swing.JRadioButton();
        tipe2 = new javax.swing.JRadioButton();
        tipe3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lamacicilan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ppn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cicilanbulan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        luastanahasli = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        luastanahtersedia = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hargabangunan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargabangunanActionPerformed(evt);
            }
        });

        jLabel1.setText("nama pemesan");

        jLabel2.setText("harga tanah");

        jLabel3.setText("area");

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bougenvile", "melati", "flamboyan" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Harga Bangunan");

        jLabel5.setText("Tipe");

        buttonGroup1.add(tipe1);
        tipe1.setText("tipe1");
        tipe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipe1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(tipe2);
        tipe2.setText("tipe2");
        tipe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipe2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(tipe3);
        tipe3.setText("tipe3");
        tipe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipe3ActionPerformed(evt);
            }
        });

        jLabel6.setText("harga");

        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        jLabel7.setText("DP");

        dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpActionPerformed(evt);
            }
        });

        jLabel8.setText("Lama cicilan");

        jLabel9.setText("PPN 10%");

        ppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppnActionPerformed(evt);
            }
        });

        jLabel10.setText("Cicilan/bulan");

        cicilanbulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cicilanbulanActionPerformed(evt);
            }
        });

        jButton1.setText("simpam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Luas Tanah Asli");

        luastanahasli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luastanahasliActionPerformed(evt);
            }
        });

        jLabel12.setText("Tanah Tersedia");

        luastanahtersedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luastanahtersediaActionPerformed(evt);
            }
        });

        jButton3.setText("proses");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cicilanbulan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ppn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lamacicilan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namapemesan)
                            .addComponent(hargatanah)
                            .addComponent(combo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(165, 165, 165))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tipe3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(36, 36, 36))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(luastanahtersedia)
                                            .addContainerGap())))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(luastanahasli))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(hargabangunan)))
                                    .addContainerGap()))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namapemesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(hargabangunan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(hargatanah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipe1))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(luastanahasli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(luastanahtersedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipe2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipe3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lamacicilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ppn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cicilanbulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hargabangunanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargabangunanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargabangunanActionPerformed

    private void tipe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipe1ActionPerformed
        // TODO add your handling code here:
        luastanahasli.setText("90");
        
    }//GEN-LAST:event_tipe1ActionPerformed
    
      Connection con1;
      PreparedStatement insert;
         
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String npembeli = namapemesan.getText();
//        String nhargatanah = hargatanah.getText();
        String njenis = (String) combo1.getSelectedItem();
//        String nbangunan = hargabangunan.getText();
        String nasli = luastanahasli.getText();
//        String ntersedia = luastanahtersedia.getText();
        String nharga = harga.getText();
//        String ndp = dp.getText();
        String ncicilan = lamacicilan.getText();
//        String nppn = ppn.getText();
        String nbulan = cicilanbulan.getText();
        String ntipe = "1000";
        
        try {
          Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
          con1 = DriverManager.getConnection("jdbc:mysql://localhost/test","ipang","ipang");
          insert = con1.prepareStatement("insert into belirumah (nama, area, tipe, luas, harga, lama_cicilan, cicilan_bulan)values(?,?,?,?,?,?,?)");
//          insert.setString(1,npembeli);
//          insert.setString(2,njenis);
//          insert.setString(3,ntipe);
//          insert.setString(4,nasli);
////          insert.setString(4,ntersedia);
//          insert.setString(5,nharga);
////          insert.setString(6,ndp);
//          insert.setString(6,ncicilan);
////          insert.setString(8,nppn);
//          insert.setString(7,nbulan);
        insert.setString(1,"1000");
          insert.setString(2,"1000");
          insert.setString(3,"1000");
          insert.setString(4,"1000");
//          insert.setString(4,ntersedia);
          insert.setString(5,"1000");
//          insert.setString(6,ndp);
          insert.setString(6,"1000");
//          insert.setString(8,nppn);
          insert.setString(7,"1000");
          insert.executeUpdate();
          JOptionPane.showMessageDialog(this, "Record Saved");
          
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void luastanahasliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luastanahasliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luastanahasliActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
        String kode_rumah = (String) combo1.getSelectedItem();
        if (kode_rumah == "bougenvile") {
            hargatanah.setText("50000");
            hargabangunan.setText("90000");
        }else if (kode_rumah == "melati") {
            hargatanah.setText("60000");
            hargabangunan.setText("120000");
        }else if (kode_rumah == "flamboyan") {
            hargatanah.setText("70000");
            hargabangunan.setText("150000");
        }
    }//GEN-LAST:event_combo1ActionPerformed

    private void tipe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipe2ActionPerformed
        // TODO add your handling code here:
           luastanahasli.setText("120");
    }//GEN-LAST:event_tipe2ActionPerformed

    private void tipe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipe3ActionPerformed
        // TODO add your handling code here:
           luastanahasli.setText("150");
    }//GEN-LAST:event_tipe3ActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
        int n1, n2, n3 ,harga1;

        n1 = Integer.parseInt(luastanahtersedia.getText());
        n2 =  Integer.parseInt(hargatanah.getText());
        n3 =  Integer.parseInt(hargabangunan.getText());
        harga1 = (n1*n2+n3);
        harga.setText("" + harga1);
        
    }//GEN-LAST:event_hargaActionPerformed

    private void ppnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppnActionPerformed
        // TODO add your handling code here:
   
    
    }//GEN-LAST:event_ppnActionPerformed

    private void luastanahtersediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luastanahtersediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luastanahtersediaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        //harga
        
         int n1, n2, n3 ,harga1;
       
        n1 = Integer.parseInt(luastanahtersedia.getText());
        n2 =  Integer.parseInt(hargatanah.getText());
        n3 =  Integer.parseInt(hargabangunan.getText());
        harga1 = (n1*n2+n3);
        harga.setText("" + harga1);
        
        //harga
        
        //ppn
        int  n4,n5;
        n4 = harga1 * 10 / 100;
        ppn.setText("" + n4);
        
        //cicilan / bulan
           int dp1 = Integer.parseInt(dp.getText());
         int lamaCicilan = Integer.parseInt(lamacicilan.getText());
         
        int n6;
        n6 = (harga1 + n4 - dp1)/lamaCicilan;
        cicilanbulan.setText("" + n6);
        
       

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpActionPerformed

    private void cicilanbulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cicilanbulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cicilanbulanActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cicilanbulan;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JTextField dp;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField hargabangunan;
    private javax.swing.JTextField hargatanah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lamacicilan;
    private javax.swing.JTextField luastanahasli;
    private javax.swing.JTextField luastanahtersedia;
    private javax.swing.JTextField namapemesan;
    private javax.swing.JTextField ppn;
    private javax.swing.JRadioButton tipe1;
    private javax.swing.JRadioButton tipe2;
    private javax.swing.JRadioButton tipe3;
    // End of variables declaration//GEN-END:variables
}
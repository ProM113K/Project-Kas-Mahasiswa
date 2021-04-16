package Forms;

import Default.Menu;
import Connection.Koneksi;
import java.sql.Connection;
import java.sql.*;
import java.util.Calendar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIMAS
 */
public class Form_Pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Form_Pembayaran() {
        initComponents();
        TI.setVisible(false);
        KA.setVisible(false);
        AP.setVisible(false);
        txtNominal.setEnabled(false);
        tblSaldo.setEnabled(false);
        
        try {
            Connection MySQL = Koneksi.Connect("kas_mhs");
            ResultSet R = MySQL.createStatement().executeQuery("SELECT SUM(nominal) AS SALDO FROM bayar");
            tblSaldo.setModel(DbUtils.resultSetToTableModel(R));
        } catch (SQLException e) {
            System.out.println("Failed To Load :" + e.toString());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ListProdi = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TI = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        KA = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        AP = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableMhs = new javax.swing.JTable();
        btnSaldo = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblSaldo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNominal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pembayaran Kas");
        getContentPane().setLayout(null);

        ListProdi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Teknik Informatika", "Komputerisasi Akuntansi", "Administrasi Perkantoran" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListProdi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListProdiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListProdi);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 160, 70);

        TI.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "TI 413", "TI 414", "TI 415" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        TI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TIMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TI);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(180, 10, 50, 70);

        KA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "KA 223", "KA 224", "KA 225" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        KA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KAMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(KA);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(230, 10, 60, 70);

        AP.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "AP 213", "AP 214", "AP 215" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        AP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(AP);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(290, 10, 55, 70);

        TableMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "KELAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMhsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TableMhs);
        if (TableMhs.getColumnModel().getColumnCount() > 0) {
            TableMhs.getColumnModel().getColumn(0).setResizable(false);
            TableMhs.getColumnModel().getColumn(1).setResizable(false);
            TableMhs.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(6, 126, 340, 142);

        btnSaldo.setText("CEK SALDO");
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaldo);
        btnSaldo.setBounds(360, 240, 110, 28);

        tblSaldo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SALDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblSaldo);
        if (tblSaldo.getColumnModel().getColumnCount() > 0) {
            tblSaldo.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(360, 190, 88, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setText("NIM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 30, 30);

        txtNIM.setEditable(false);
        txtNIM.setToolTipText("Nomor Induk Mahasiswa");
        jPanel1.add(txtNIM);
        txtNIM.setBounds(50, 10, 170, 30);

        txtNama.setEditable(false);
        jPanel1.add(txtNama);
        txtNama.setBounds(50, 50, 170, 30);

        jLabel2.setText("Nama");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 41, 30);

        txtKelas.setEditable(false);
        jPanel1.add(txtKelas);
        txtKelas.setBounds(50, 90, 170, 30);

        jLabel3.setText("Kelas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 90, 41, 30);

        jButton1.setText("Bayar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 130, 70, 28);
        jPanel1.add(txtNominal);
        txtNominal.setBounds(70, 130, 73, 28);

        jLabel4.setText("Nominal");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 130, 60, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(360, 10, 230, 170);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(618, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ListProdiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListProdiMouseClicked
        String index = (String) ListProdi.getSelectedValue();
        if (index.equals("Teknik Informatika")) {
            TI.setVisible(true);
            KA.setVisible(false);
            AP.setVisible(false);
        } if (index.equals("Komputerisasi Akuntansi")) {
            TI.setVisible(false);
            KA.setVisible(true);
            AP.setVisible(false);
        } if (index.equals("Administrasi Perkantoran")) {
            TI.setVisible(false);
            KA.setVisible(false);
            AP.setVisible(true);
        }
    }//GEN-LAST:event_ListProdiMouseClicked

    private void TIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIMouseClicked
        String index = (String) TI.getSelectedValue();
        
        if (index.equals("TI 413")) {
            try {
                Connection MySQL = Koneksi.Connect("kas_mhs");
                ResultSet R = MySQL.createStatement().executeQuery("SELECT * FROM mahasiswa WHERE kelas = 'TI-413'");
                TableMhs.setModel(DbUtils.resultSetToTableModel(R));
            } catch (SQLException e) {
                System.out.println("Failed To Load :" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Yang lain");
        }
    }//GEN-LAST:event_TIMouseClicked

    private void TableMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMhsMouseClicked
        int row = TableMhs.getSelectedRow();
        String tbl_click = TableMhs.getModel().getValueAt(row, 0).toString();
        
        if (tbl_click.equals(tbl_click)) {
            txtNIM.setText(TableMhs.getModel().getValueAt(row, 0).toString());
            txtNama.setText(TableMhs.getModel().getValueAt(row, 1).toString());
            txtKelas.setText(TableMhs.getModel().getValueAt(row, 2).toString());
            txtNominal.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Tidak dipilih");
        }
    }//GEN-LAST:event_TableMhsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/" + "kas_mhs";
            Class.forName(myDriver);
            try (Connection conn = DriverManager.getConnection(myUrl, "root", "")) {
                Calendar calendar = Calendar.getInstance();
                java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
                
                String query = "INSERT INTO `bayar`(`id_bayar`, `nim`, `nominal`, `tgl_pembayaran`) VALUES (?,?,?,?)";
                
                PreparedStatement prpStat = conn.prepareStatement(query);
                prpStat.setInt(1, 0);
                prpStat.setString(2, txtNIM.getText());
                prpStat.setInt(3, Integer.parseInt(txtNominal.getText()));
                prpStat.setDate(4, startDate);
                
                prpStat.execute();
                JOptionPane.showMessageDialog(null, "Pembayaran Sukses");
            }
            
            txtNIM.setText("");
            txtNama.setText("");
            txtKelas.setText("");
            txtNominal.setText("");
            txtNominal.setEnabled(false);
        } catch (SQLException e) {
            System.err.print("Got an exception!");
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_Pembayaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        try {
            Connection MySQL = Koneksi.Connect("kas_mhs");
            ResultSet R = MySQL.createStatement().executeQuery("SELECT SUM(nominal) AS SALDO FROM bayar");
            tblSaldo.setModel(DbUtils.resultSetToTableModel(R));
        } catch (SQLException e) {
            System.err.println("Tidak ada saldo");
        }
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void KAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KAMouseClicked
        String index = (String) KA.getSelectedValue();
        if (index.equals("KA 223")) {
            try {
                Connection MySQL = Koneksi.Connect("kas_mhs");
                ResultSet R = MySQL.createStatement().executeQuery("SELECT * FROM mahasiswa WHERE kelas = 'KA-223'");
                TableMhs.setModel(DbUtils.resultSetToTableModel(R));
            } catch (SQLException e) {
                System.out.println("Failed To Load :" + e.toString());

            }
        } else {
            JOptionPane.showMessageDialog(null, "Yang lain");
        }
    }//GEN-LAST:event_KAMouseClicked

    private void APMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APMouseClicked
        String index = (String) AP.getSelectedValue();
        if (index.equals("AP 213")) {
            try {
                Connection MySQL = Koneksi.Connect("kas_mhs");
                ResultSet R = MySQL.createStatement().executeQuery("SELECT * FROM mahasiswa WHERE kelas = 'AP-213'");
                TableMhs.setModel(DbUtils.resultSetToTableModel(R));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Yang lain");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Yang lain");

        }
    }//GEN-LAST:event_APMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form_Pembayaran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> AP;
    private javax.swing.JList<String> KA;
    private javax.swing.JList<String> ListProdi;
    private javax.swing.JList<String> TI;
    private javax.swing.JTable TableMhs;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblSaldo;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNominal;
    // End of variables declaration//GEN-END:variables
}

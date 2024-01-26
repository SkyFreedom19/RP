
package Form;
import Config.Koneksi;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class KasPemasukan extends javax.swing.JFrame {

    private Connection conn;
    
    
    public KasPemasukan() {
        initComponents();
        conn=Koneksi.getConnection();
        getData();
        nonAktifButton();
        AktifButton();
    }
    
    private void getData() {
    DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
    model.setRowCount(0);

    try {
        String sql = "SELECT * FROM kas_pemasukan";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            int no = rs.getInt("no");
            String uraian = rs.getString("Uraian");
            Date tanggal = rs.getDate("Tanggal");
            int jumlahPemasukan = rs.getInt("Jumlah_Pemasukan"); // Ubah nama kolom dan tipe data

            Object[] rowData = {no, uraian, tanggal, jumlahPemasukan};
            model.addRow(rowData);
        }

        rs.close();
        st.close();
    } catch (Exception e) {
        Logger.getLogger(KasPemasukan.class.getName()).log(Level.SEVERE, null, e);
    }
}

    
    private void resetForm() {
        t_uraian.setText("");
        t_tanggal.setDate(null);
        t_jumlah.setText("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_uraian = new javax.swing.JTextField();
        t_jumlah = new javax.swing.JTextField();
        t_tanggal = new com.toedter.calendar.JDateChooser();
        t_cari = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_perbarui = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        kembalibutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_data.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tbl_data.setForeground(new java.awt.Color(102, 102, 102));
        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Uraian", "Tanggal", "Jumlah"
            }
        ));
        tbl_data.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_data.setRowHeight(30);
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        jLabel2.setText("Uraian");

        jLabel3.setText("Tanggal");

        jLabel4.setText("Jumlah Pemasukan");

        t_cari.setText("Pencarian");
        t_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cariMouseClicked(evt);
            }
        });
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });

        btn_tambah.setText("Tambah");
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMouseClicked(evt);
            }
        });

        btn_perbarui.setText("Perbarui");
        btn_perbarui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_perbaruiMouseClicked(evt);
            }
        });
        btn_perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perbaruiActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_batalMouseClicked(evt);
            }
        });
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
        });

        kembalibutton.setText("Kembali ");
        kembalibutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalibuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(t_jumlah)
                                    .addComponent(t_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(t_uraian))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_tambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_perbarui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(btn_batal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_hapus)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(kembalibutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t_cari)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_uraian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah)
                            .addComponent(btn_perbarui)
                            .addComponent(btn_batal)
                            .addComponent(btn_hapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembalibutton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
    String uraian = t_uraian.getText();
    Date tanggal = t_tanggal.getDate();
    int jumlahPemasukan = Integer.parseInt(t_jumlah.getText());
    
    if (uraian.isEmpty() || tanggal == null || jumlahPemasukan == -1) {
        JOptionPane.showMessageDialog(this, "Isi Semua Data", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        String sql = "INSERT INTO kas_pemasukan (uraian, tanggal, jumlah_Pemasukan) VALUES (?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, uraian);
        st.setDate(2, new java.sql.Date(tanggal.getTime()));
        st.setInt(3, jumlahPemasukan);

        int rowInserted = st.executeUpdate();
        if (rowInserted > 0) {
            JOptionPane.showMessageDialog(this, "Data Berhasil di Tambahkan");
            resetForm();
            getData();
        }

        st.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Data Gagal di Tambahkan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_tambahMouseClicked

    private void btn_perbaruiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perbaruiMouseClicked
        int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow != -1){
            String uraian = tbl_data.getValueAt(selectedRow, 1).toString();
            String tanggal = tbl_data.getValueAt(selectedRow, 2).toString();
            int jumlahPemasukan = Integer.parseInt(tbl_data.getValueAt(selectedRow, 3).toString());
            
            t_uraian.setText(uraian);
            t_tanggal.setDateFormatString(tanggal);
            t_jumlah.setText(String.valueOf(jumlahPemasukan));
        }
    }//GEN-LAST:event_btn_perbaruiMouseClicked

    private void btn_perbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perbaruiActionPerformed
        int selectedRow = tbl_data.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Silahkan pilih baris yang mau diperbarui");
        return;
    }

    try {
        String no = tbl_data.getValueAt(selectedRow, 0).toString();
        String uraian = t_uraian.getText();
        Date tanggal = t_tanggal.getDate();
        int jumlahPemasukan = Integer.parseInt(t_jumlah.getText());

        if (uraian.isEmpty() || tanggal == null || jumlahPemasukan == -1) {
            JOptionPane.showMessageDialog(this, "Isi Semua Data", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "UPDATE kas_pemasukan SET uraian=?, tanggal=?, jumlah_Pemasukan=? WHERE no=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, uraian);
        st.setDate(2, new java.sql.Date(tanggal.getTime()));
        st.setInt(3, jumlahPemasukan);
        st.setString(4, no);

        int rowUpdated = st.executeUpdate();
        if (rowUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Data Berhasil di Perbarui");
            resetForm();
            getData();
        }

        st.close();
    } catch (Exception e) {
        Logger.getLogger(KasPemasukan.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(this, "Data Gagal di Perbarui: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_perbaruiActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
       
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseClicked
     resetForm();
     AktifButton();
     nonAktifButton();
    }//GEN-LAST:event_btn_batalMouseClicked

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
         int selectedRow = tbl_data.getSelectedRow();
        if (selectedRow != -1) {
            String uraian = tbl_data.getValueAt(selectedRow, 1).toString();
            Date tanggal = (Date) tbl_data.getValueAt(selectedRow, 2);
           int jumlahPemasukan = Integer.parseInt(tbl_data.getValueAt(selectedRow, 3).toString());

            t_uraian.setText(uraian);
            t_tanggal.setDate(tanggal);
           t_jumlah.setText(String.valueOf(jumlahPemasukan));
        }

        btn_perbarui.setEnabled(true);
        btn_tambah.setEnabled(false);
        btn_hapus.setEnabled(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        int selectedRow = tbl_data.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Silahkan pilih baris yang mau dihapus");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data ini", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            String no = tbl_data.getValueAt(selectedRow, 0).toString();
            String sql = "DELETE FROM kas_pemasukan WHERE no=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, no);

            int rowDelete = st.executeUpdate();
            if (rowDelete > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            }

            st.close();
            resetForm();
            getData();
            AktifButton();
            nonAktifButton();
        } catch (Exception e) {
            Logger.getLogger(KasPemasukan.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Data Gagal di Hapus: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btn_hapusMouseClicked

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
    model.setRowCount(0);

    String cari = t_cari.getText();
    try {
        String sql = "SELECT * FROM kas_pemasukan WHERE Uraian LIKE ? OR Tanggal LIKE ? OR Jumlah LIKE ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, "%" + cari + "%");
        st.setString(2, "%" + cari + "%");
        st.setString(3, "%" + cari + "%");
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            int no = rs.getInt("no");
            String uraian = rs.getString("Uraian");
            Date tanggal = rs.getDate("Tanggal");
            int jumlahPemasukan = rs.getInt("Jumlah_Pemasukan");

            Object[] rowData = {no, uraian, tanggal, jumlahPemasukan};
            model.addRow(rowData);
        }

        rs.close();
        st.close();
    } catch (Exception e) {
        Logger.getLogger(KasPemasukan.class.getName()).log(Level.SEVERE, null, e);
    }
    }//GEN-LAST:event_t_cariKeyTyped

    private void t_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cariMouseClicked
       t_cari.setText("");
    }//GEN-LAST:event_t_cariMouseClicked

    private void kembalibuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalibuttonActionPerformed
        MenuUtama mU = new MenuUtama ();
        mU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembalibuttonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KasPemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasPemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasPemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasPemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasPemasukan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_perbarui;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembalibutton;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_jumlah;
    private com.toedter.calendar.JDateChooser t_tanggal;
    private javax.swing.JTextField t_uraian;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables

    private void nonAktifButton() {
        btn_perbarui.setEnabled(false);
        btn_hapus.setEnabled(false);
    }

    private void AktifButton() {
        btn_tambah.setEnabled(true);
        btn_batal.setEnabled(false);
    }

    

    
}

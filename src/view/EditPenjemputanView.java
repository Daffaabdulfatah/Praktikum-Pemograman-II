/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.*;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.Kurir;
import model.Permintaan;

/**
 *
 * @author bhadr
 */
public class EditPenjemputanView extends javax.swing.JFrame {

    /**
     * Creates new form TambahPenjemputanView
     */
    public EditPenjemputanView() {
        initComponents();
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
        menuBeratPoint = new javax.swing.JButton();
        menuHome = new javax.swing.JButton();
        menuKurir = new javax.swing.JButton();
        menuPenjemputan = new javax.swing.JButton();
        menuPermintaan = new javax.swing.JButton();
        menuRiwayat = new javax.swing.JButton();
        menuTracking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        permintaanLabel = new javax.swing.JLabel();
        kurir = new javax.swing.JComboBox<>();
        kurirLabel = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        statusLabel = new javax.swing.JLabel();
        pointLabel = new javax.swing.JLabel();
        point = new javax.swing.JTextField();
        hapusBtn = new javax.swing.JButton();
        simpanBtn = new javax.swing.JButton();
        permintaan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Penjemputan - PickUp");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(41, 115, 178));
        jPanel1.setForeground(new java.awt.Color(41, 115, 178));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 486));

        jLabel1.setBackground(new java.awt.Color(41, 115, 178));
        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PICK UP");

        menuBeratPoint.setBackground(new java.awt.Color(154, 203, 208));
        menuBeratPoint.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuBeratPoint.setForeground(new java.awt.Color(255, 255, 255));
        menuBeratPoint.setText("Total Berat & Point");
        menuBeratPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBeratPointActionPerformed(evt);
            }
        });

        menuHome.setBackground(new java.awt.Color(154, 203, 208));
        menuHome.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuHome.setForeground(new java.awt.Color(255, 255, 255));
        menuHome.setText("Halaman Utama");
        menuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHomeActionPerformed(evt);
            }
        });

        menuKurir.setBackground(new java.awt.Color(154, 203, 208));
        menuKurir.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuKurir.setForeground(new java.awt.Color(255, 255, 255));
        menuKurir.setText("Kurir");
        menuKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKurirActionPerformed(evt);
            }
        });

        menuPenjemputan.setBackground(new java.awt.Color(154, 203, 208));
        menuPenjemputan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuPenjemputan.setForeground(new java.awt.Color(255, 255, 255));
        menuPenjemputan.setText("Status Penjemputan");
        menuPenjemputan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPenjemputanActionPerformed(evt);
            }
        });

        menuPermintaan.setBackground(new java.awt.Color(154, 203, 208));
        menuPermintaan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuPermintaan.setForeground(new java.awt.Color(255, 255, 255));
        menuPermintaan.setText("Permintaan");
        menuPermintaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPermintaanActionPerformed(evt);
            }
        });

        menuRiwayat.setBackground(new java.awt.Color(154, 203, 208));
        menuRiwayat.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuRiwayat.setForeground(new java.awt.Color(255, 255, 255));
        menuRiwayat.setText("Riwayat Penjemputan");
        menuRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRiwayatActionPerformed(evt);
            }
        });

        menuTracking.setBackground(new java.awt.Color(154, 203, 208));
        menuTracking.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuTracking.setForeground(new java.awt.Color(255, 255, 255));
        menuTracking.setText("Status Tracking");
        menuTracking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrackingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuKurir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPenjemputan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPermintaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBeratPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuRiwayat, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(menuTracking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(menuHome, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(menuKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPenjemputan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPermintaan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuTracking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuBeratPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(menuHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel2.setText("Edit Penjemputan");

        permintaanLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        permintaanLabel.setText("Permintaan");

        kurir.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        kurirLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        kurirLabel.setText("Kurir");

        status.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Dimulai", "Dalam Perjalanan", "Selesai" }));

        statusLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        statusLabel.setText("Status");

        pointLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        pointLabel.setText("Point");

        point.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });

        hapusBtn.setBackground(new java.awt.Color(72, 166, 167));
        hapusBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        hapusBtn.setForeground(new java.awt.Color(255, 255, 255));
        hapusBtn.setText("Hapus");

        simpanBtn.setBackground(new java.awt.Color(41, 115, 178));
        simpanBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        simpanBtn.setForeground(new java.awt.Color(255, 255, 255));
        simpanBtn.setText("Simpan");

        permintaan.setEditable(false);
        permintaan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        permintaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permintaanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(permintaanLabel)
                            .addComponent(kurirLabel)
                            .addComponent(statusLabel)
                            .addComponent(pointLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kurir, 0, 475, Short.MAX_VALUE)
                            .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(point)
                            .addComponent(permintaan)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(simpanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(permintaanLabel)
                    .addComponent(permintaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kurirLabel)
                    .addComponent(kurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLabel))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pointLabel)
                    .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hapusBtn.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void setKurir(List<Kurir> kurirList, int id) {
        // Set model ke ComboBox langsung dengan List<Kurir>
        DefaultComboBoxModel<Kurir> model = new javax.swing.DefaultComboBoxModel<>(kurirList.toArray(new Kurir[0]));
        kurir.setModel(model);
        
        // Cari Kurir berdasarkan ID
        for (int i = 0; i < model.getSize(); i++) {
            Kurir kurirItem = model.getElementAt(i);
            if (kurirItem.getId() == id) {
                kurir.setSelectedIndex(i);  // Pilih Kurir berdasarkan indeks
                break;
            }
        }
    }

//    public void setPermintaan(List<Permintaan> permintaanList, int id) {
//        // Set model ke ComboBox langsung dengan List<Permintaan>
//        DefaultComboBoxModel<Permintaan> model = new javax.swing.DefaultComboBoxModel<>(permintaanList.toArray(new Permintaan[0]));
//        permintaan.setModel(model);
//    
//        // Cari Permintaan berdasarkan ID
//        for (int i = 0; i < model.getSize(); i++) {
//            Permintaan permintaanItem = model.getElementAt(i);
//            if (permintaanItem.getId() == id) {  // Use getId() without arguments
//                permintaan.setSelectedIndex(i);  // Pilih Permintaan berdasarkan indeks
//                break;
//            }
//        }
//    }
      

    
    public void editPenjemputan(ActionListener listener) {
        simpanBtn.addActionListener(listener);
    }
    
    public void deletePenjemputan(ActionListener listener) {
        hapusBtn.addActionListener(listener);
    }

    public void redirectHome(ActionListener listener){
        menuHome.addActionListener(listener);
    }
    
    public void redirectStatusPenjemputan(ActionListener listener){
        menuPenjemputan.addActionListener(listener);
    }

    public void redirectKurir(ActionListener listener){
        menuKurir.addActionListener(listener);
    }

    public void redirectRiwayat(ActionListener listener){
        menuRiwayat.addActionListener(listener);
    }
    
    public void redirectTotalBeratPoint(ActionListener listener){
        menuBeratPoint.addActionListener(listener);
    }
    
    public void redirectPermintaan(ActionListener listener){
        menuPermintaan.addActionListener(listener);
    }
    public void redirectTracking(ActionListener listener){
        menuTracking.addActionListener(listener);
    }
    
    
    private void menuBeratPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBeratPointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBeratPointActionPerformed

    private void menuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHomeActionPerformed

    private void menuKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKurirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuKurirActionPerformed

    private void menuPenjemputanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPenjemputanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPenjemputanActionPerformed

    private void menuPermintaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPermintaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPermintaanActionPerformed

    private void menuRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRiwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRiwayatActionPerformed

    private void menuTrackingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrackingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTrackingActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simpanBtnActionPerformed

    private void permintaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permintaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_permintaanActionPerformed


    public void setKurirSelection(Kurir kurirs) {
        kurir.setSelectedItem(kurirs);
    }
    
    public void setPermintaan(String permintaans) {
        permintaan.setText(permintaans);
    }
    
    public void setStatus(String statuss) {
        status.setSelectedItem(statuss);
    }
    
    public void setPoint(int points) {
        point.setText(String.valueOf(points));
    }
    
    
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapusBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<Kurir> kurir;
    private javax.swing.JLabel kurirLabel;
    private javax.swing.JButton menuBeratPoint;
    private javax.swing.JButton menuHome;
    private javax.swing.JButton menuKurir;
    private javax.swing.JButton menuPenjemputan;
    private javax.swing.JButton menuPermintaan;
    private javax.swing.JButton menuRiwayat;
    private javax.swing.JButton menuTracking;
    public javax.swing.JTextField permintaan;
    private javax.swing.JLabel permintaanLabel;
    public javax.swing.JTextField point;
    private javax.swing.JLabel pointLabel;
    private javax.swing.JButton simpanBtn;
    public javax.swing.JComboBox<String> status;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}

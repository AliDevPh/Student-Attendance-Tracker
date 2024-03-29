/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication17;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;







public class QRCodeScanner extends javax.swing.JFrame implements Runnable, ThreadFactory {
    
    private WebcamPanel panel=null;
    private Webcam webcam = null;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    


    public QRCodeScanner() {
        initComponents();
        initWebcam();
        jPanel1.setBackground(new Color(0,0,0,0));
        dt();
    }
    
    public void dt(){
        
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMM dd, yyyy");
        String dd = sdf.format(d);
        currentDate.setText(dd);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        subjects2 = new javax.swing.JComboBox<>();
        usernameLabel1 = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        subjects1 = new javax.swing.JComboBox<>();
        passwordLabel1 = new javax.swing.JLabel();
        currentDate2 = new javax.swing.JLabel();
        scan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        scanner = new javax.swing.JPanel();
        resulttf = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordLabel4 = new javax.swing.JLabel();
        currentDate = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tracker = new javax.swing.JTable();
        passwordLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tracker1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEAN CARMELO\\Desktop\\GUI Final Project\\Artboard 6.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins ExtraLight", 2, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BS IN COMPUTER ENGINEERING (2ND YEAR)");

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("STUDENT ATTENDANCE TRACKER");

        subjects2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Object Oriented Programming (CpE 406)", "CpE Laws and Professional Practice (CpE 407)", "Electronic Circuits: Devices and Analysis (ECE 421)", "Cognate / Elective Course 1 (CpEE 401)", "Basic Occupational Safety and Health (ENGG 411)", "Advanced Engineering Mathematics for CpE (CpE 408)", "Kontekstwalisadong Komunikasyon sa Filipino (Fili 101)" }));
        subjects2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjects2ActionPerformed(evt);
            }
        });

        usernameLabel1.setBackground(new java.awt.Color(255, 255, 255));
        usernameLabel1.setFont(new java.awt.Font("Proxima Nova Lt", 0, 18)); // NOI18N
        usernameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel1.setText("Subject:");

        passwordLabel2.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel2.setFont(new java.awt.Font("Proxima Nova Lt", 0, 18)); // NOI18N
        passwordLabel2.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel2.setText("Time:");

        subjects1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        subjects1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjects1ActionPerformed(evt);
            }
        });

        passwordLabel1.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setFont(new java.awt.Font("Proxima Nova Lt", 0, 18)); // NOI18N
        passwordLabel1.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel1.setText("Date:");

        currentDate2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        currentDate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentDate2.setText("0");

        scan.setBackground(new java.awt.Color(102, 102, 102));
        scan.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        scan.setForeground(new java.awt.Color(255, 255, 255));
        scan.setText("SCAN");
        scan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        scanner.setBackground(new java.awt.Color(255, 255, 255));
        scanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(scanner);
        scanner.setBounds(580, 90, 250, 230);

        resulttf.setEditable(false);
        resulttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resulttfActionPerformed(evt);
            }
        });
        jPanel1.add(resulttf);
        resulttf.setBounds(580, 330, 250, 30);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Time of out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(420, 350, 100, 26);

        jLabel3.setFont(new java.awt.Font("Poppins ExtraLight", 2, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BS IN COMPUTER ENGINEERING (2ND YEAR)");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 50, 329, 26);

        jLabel6.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STUDENT ATTENDANCE TRACKER");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 10, 346, 44);

        passwordLabel4.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel4.setFont(new java.awt.Font("Proxima Nova Lt", 0, 18)); // NOI18N
        passwordLabel4.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel4.setText("Date:");
        jPanel1.add(passwordLabel4);
        passwordLabel4.setBounds(20, 450, 40, 23);

        currentDate.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        currentDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentDate.setText("0");
        jPanel1.add(currentDate);
        currentDate.setBounds(130, 450, 100, 19);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Done");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(740, 380, 90, 26);

        tracker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Time of out"
            }
        ));
        jScrollPane2.setViewportView(tracker);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(430, 90, 90, 240);

        passwordLabel6.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel6.setFont(new java.awt.Font("Proxima Nova Lt", 0, 18)); // NOI18N
        passwordLabel6.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel6.setText("Course:");
        jPanel1.add(passwordLabel6);
        passwordLabel6.setBounds(20, 410, 86, 23);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(130, 410, 230, 22);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(730, 460, 90, 26);

        tracker1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "SR Code", "Date", "Attendance", "Time of in"
            }
        ));
        jScrollPane3.setViewportView(tracker1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 90, 400, 240);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Time of in");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(20, 350, 90, 26);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 860, 620));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEAN CARMELO\\Desktop\\GUI Final Project\\Artboard 5 copy.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // donee

        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void resulttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resulttfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resulttfActionPerformed

    private void subjects2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjects2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjects2ActionPerformed

    private void subjects1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjects1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjects1ActionPerformed

    private void scanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(QRCodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QRCodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QRCodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QRCodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QRCodeScanner().setVisible(true);
        });
    }
    
    
    
    private void initWebcam() {
        
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0);
        webcam.setViewSize(size);
        
        panel=new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);
        
        scanner.add(panel,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,420,315));
        executor.execute(this);
        
    }
    
    @Override
    public void run(){
        do{
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Result result = null;
            BufferedImage image = null;
            
            if (webcam.isOpen()){
                if((image = webcam.getImage())==null){
                    continue;
                }
            }
            
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            
            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException ex) {
                Logger.getLogger(QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (result !=null){
                resulttf.setText(result.getText());
                JOptionPane.showMessageDialog(null, "Your QR Code has been recorded");
                //Insert to table
                
                
                
                
                resulttf.setText("");
            }
            
            
            
        }while(true);
    }
    
    @Override
    public Thread newThread(Runnable r){
        Thread t = new Thread(r,"My Thread");
        t.setDaemon(true);
        return t;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentDate;
    private javax.swing.JLabel currentDate2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JLabel passwordLabel4;
    private javax.swing.JLabel passwordLabel6;
    private javax.swing.JTextField resulttf;
    private javax.swing.JButton scan;
    private javax.swing.JPanel scanner;
    private javax.swing.JComboBox<String> subjects1;
    private javax.swing.JComboBox<String> subjects2;
    private javax.swing.JTable tracker;
    private javax.swing.JTable tracker1;
    private javax.swing.JLabel usernameLabel1;
    // End of variables declaration//GEN-END:variables
}

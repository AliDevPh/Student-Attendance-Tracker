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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

import java.sql.*;




public class OOP_QRCodeScanner extends javax.swing.JFrame implements Runnable, ThreadFactory {
    
    private WebcamPanel panel=null;
    private Webcam webcam = null;
    private Executor executor = Executors.newSingleThreadExecutor(this);


    
    public OOP_QRCodeScanner() {
        initComponents();
        dt();
        times();
        Connect();
        initWebcam();
        mainpanel.setBackground(new Color (0,0,0,0));
     
     
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/trackeradmin","root","");
        } catch (SQLException ex) {
            Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    
        public void dt(){  
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            String dd = sdf.format(d);
            date.setText(dd);
        }
        
        Timer t;
        SimpleDateFormat st;
        
        public void times(){
            t = new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss aa");
                
                String tt = st.format(dt);
                time.setText(tt);
            }
            });
            t.start();

        }
        
        
        public static class Function{
        
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        final String DB_URL = "jdbc:mysql://localhost/trackeradmin";
        final String USERNAME = "root";
        final String PASSWORD = "";

        public ResultSet find(String s) throws SQLException {
            try {
                conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                ps = conn.prepareStatement("select * from mercado_anacieto_oop_display where Name = ?");
                ps.setString(1,s);
                rs = ps.executeQuery();
            } catch (SQLException e){
            }
            return rs;
        }
    
    }

    
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
        mainpanel = new javax.swing.JPanel();
        showabsent = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        passwordLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        saveDB = new javax.swing.JButton();
        scanner = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tracker = new javax.swing.JTable();
        nametf = new javax.swing.JTextField();
        SRcode = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        savetodb = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        att = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainpanel.setLayout(null);

        showabsent.setBackground(new java.awt.Color(102, 102, 102));
        showabsent.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        showabsent.setForeground(new java.awt.Color(255, 255, 255));
        showabsent.setText("Show Absent/s");
        showabsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showabsentActionPerformed(evt);
            }
        });
        mainpanel.add(showabsent);
        showabsent.setBounds(430, 320, 120, 23);

        jLabel3.setFont(new java.awt.Font("Poppins ExtraLight", 2, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BS IN COMPUTER ENGINEERING (2ND YEAR)");
        mainpanel.add(jLabel3);
        jLabel3.setBounds(20, 50, 363, 23);

        jLabel6.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STUDENT ATTENDANCE TRACKER");
        mainpanel.add(jLabel6);
        jLabel6.setBounds(20, 10, 613, 47);

        done.setBackground(new java.awt.Color(102, 102, 102));
        done.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        done.setForeground(new java.awt.Color(255, 255, 255));
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        mainpanel.add(done);
        done.setBounds(740, 410, 90, 23);

        passwordLabel6.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel6.setFont(new java.awt.Font("Proxima Nova Lt", 0, 18)); // NOI18N
        passwordLabel6.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel6.setText("Course:");
        mainpanel.add(passwordLabel6);
        passwordLabel6.setBounds(30, 370, 86, 24);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        mainpanel.add(jTextField3);
        jTextField3.setBounds(140, 370, 230, 22);

        saveDB.setBackground(new java.awt.Color(102, 102, 102));
        saveDB.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        saveDB.setForeground(new java.awt.Color(255, 255, 255));
        saveDB.setText("DB");
        saveDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDBActionPerformed(evt);
            }
        });
        mainpanel.add(saveDB);
        saveDB.setBounds(20, 320, 90, 23);

        scanner.setBackground(new java.awt.Color(255, 255, 255));
        scanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainpanel.add(scanner);
        scanner.setBounds(580, 40, 250, 230);

        tracker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR Code", "Date", " Time", "Attendance"
            }
        ));
        jScrollPane3.setViewportView(tracker);

        mainpanel.add(jScrollPane3);
        jScrollPane3.setBounds(20, 90, 530, 200);

        nametf.setEditable(false);
        nametf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametfActionPerformed(evt);
            }
        });
        mainpanel.add(nametf);
        nametf.setBounds(580, 320, 250, 30);

        SRcode.setEditable(false);
        SRcode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SRcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRcodeActionPerformed(evt);
            }
        });
        mainpanel.add(SRcode);
        SRcode.setBounds(580, 280, 250, 30);

        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("0");
        mainpanel.add(date);
        date.setBounds(580, 360, 250, 20);

        savetodb.setBackground(new java.awt.Color(102, 102, 102));
        savetodb.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        savetodb.setForeground(new java.awt.Color(255, 255, 255));
        savetodb.setText("Save to Database");
        savetodb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savetodbActionPerformed(evt);
            }
        });
        mainpanel.add(savetodb);
        savetodb.setBounds(530, 410, 140, 23);

        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setForeground(new java.awt.Color(0, 0, 0));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("0");
        mainpanel.add(time);
        time.setBounds(580, 380, 250, 20);

        getContentPane().add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 870, 500));

        att.setEditable(false);
        att.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        att.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attActionPerformed(evt);
            }
        });
        getContentPane().add(att, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Tracker.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showabsentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showabsentActionPerformed

        try {
            // donee time out (SELECT `ATTENDANCE` FROM `mercado_anacieto_oop_display` WHERE `ATTENDANCE`= "ABSENT";)

            pst=con.prepareStatement("SELECT `SR Code`, `Name`, `TIME`, `ATTENDANCE` FROM `mercado_anacieto_oop_display` WHERE `ATTENDANCE`= \"ABSENT\"");
             rs = pst.executeQuery();
              DefaultTableModel model = (DefaultTableModel)tracker.getModel();
              model.setRowCount(0);
              
              while (rs.next()){
                  model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});   
              }  
        } catch (SQLException ex) {
            Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_showabsentActionPerformed

    private void subjects2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjects2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjects2ActionPerformed

    private void subjects1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjects1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjects1ActionPerformed

    private void scanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scanActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doneActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void saveDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDBActionPerformed
        // TODO add your handling code here:
//        String namet = name.getText();
//        String srcodet = srcode.getText();
//        String datet = date.getText();
//        String timet = time.getText();
//        String attendance = "PRESENT";
//        
//        
//        Object[] data = {namet, srcodet, datet, timet, attendance};
        
        DefaultTableModel tblModel = (DefaultTableModel)tracker.getModel();
//        tblModel.addRow(data);
        
        if(tblModel.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Table is Empty");
        }
        
        else {
            try {
                String nm, src, dte, tm, att;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/trackeradmin","root","");
                
                for (int i=0; i<tblModel.getRowCount(); i++){
                    nm = tblModel.getValueAt(i, 0).toString();
                    src = tblModel.getValueAt(i, 1).toString();
                    dte = tblModel.getValueAt(i, 2).toString();
                    tm = tblModel.getValueAt(i, 3).toString();
                    att = tblModel.getValueAt(i, 4).toString();
                    String query = "INSERT into `mercado_anacieto_oop`(`Name`, `SR Code`, `Date`, `Time`, `ATTENDANCE`) VALUES (?,?,?,?,?)";
                    PreparedStatement prepstmt = con.prepareStatement(query);
                    prepstmt.setString(1, nm);
                    prepstmt.setString(2, src);
                    prepstmt.setString(3, dte);
                    prepstmt.setString(4, tm);
                    prepstmt.setString(5, att);
                    
                    prepstmt.execute();
                    tblModel.setRowCount(0);
                            
                    JOptionPane.showMessageDialog(null, "Your information has been uploaded to the system.");
                 
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        SRcode.setText("");

        
    }//GEN-LAST:event_saveDBActionPerformed

    private void SRcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SRcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SRcodeActionPerformed

    private void savetodbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savetodbActionPerformed
        // TODO add your handling code here:
//        att.setText("PRESENT");
//        String attd = att.getText();
//        String namet = name.getText();
//        String srcodet = srcode.getText();
//        String datet = date.getText();
//        String timet = time.getText();
//        
//        
//        
//        Object[] data = {namet, srcodet, datet, timet, attd};
//        
//        DefaultTableModel tblModel = (DefaultTableModel)tracker.getModel();
//        tblModel.addRow(data);
        
        
        
    }//GEN-LAST:event_savetodbActionPerformed

    private void attActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attActionPerformed

    private void nametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametfActionPerformed

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
            java.util.logging.Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OOP_QRCodeScanner().setVisible(true);
            }
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
                Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (result !=null){
                try {
                    SRcode.setText(result.getText());
                    att.setText("PRESENT");
                    Function f = new Function();
                    ResultSet rs = null;
                    String NAME = "Name";
                    String attd = att.getText();
                    String srcodet = SRcode.getText();
                    String datet = date.getText();
                    String timet = time.getText();
                    rs = f.find(srcodet);
                    try {
                        result = new MultiFormatReader().decode(bitmap);
                    } catch (NotFoundException ex) {
                        Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
                    }
            try {
                String srcode = SRcode.getText();
                pst=con.prepareStatement("SELECT `Name` FROM mercado_anacieto_oop_display where `SR Code` = '"+srcode+"'");
                rs = pst.executeQuery();
            
            

            while (rs.next()){
                
                 String studname = rs.getString("Name");
                 nametf.setText(studname);
                 
                
            }       
        
        
        }catch (SQLException ex) {
            Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                    Object[] data = {srcodet, datet, timet, attd};
                    
                    DefaultTableModel tblModel = (DefaultTableModel)tracker.getModel();
                    tblModel.addRow(data);
                    JOptionPane.showMessageDialog(null, "Your QR Code has been recorded");
                    SRcode.setText("");
                    nametf.setText("");
                    
                    
                    
                    PreparedStatement ps;
                    if(tblModel.getRowCount()==0){
                        JOptionPane.showMessageDialog(null, "Table is Empty");
                    }
                    
                    else {
                    }
                    try {
                        
                        String attend;
                        String srcode;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/trackeradmin","root","");
                        
                        for (int i=0; i<tblModel.getRowCount(); i++){
                            srcode = tblModel.getValueAt(i, 1).toString();
                            attend = tblModel.getValueAt(i, 4).toString();
                            String query = "UPDATE mercado_anacieto_oop_display SET ATTENDANCE = '"+ attend +"'" + "WHERE mercado_anacieto_oop_display.`SR Code` = '"+ srcode +"'";
                            ps = Myconnection.getConnection().prepareStatement(query);
                            int rowupdate = ps.executeUpdate(query);
                            System.out.println("Rows updated" + rowupdate);
                            System.out.println("Updated!");
                            
                            
                            
                            try{
                                
                                
                            } catch (Exception ex){
                                JOptionPane.showMessageDialog(null, ex.getMessage());
                            }
                            
                            JOptionPane.showMessageDialog(null, "Your information has been uploaded to the system.");
                        }
                        
                    } catch (ClassNotFoundException | SQLException ex) {           
                        Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    

                    //Insert to table
                    
                } catch (SQLException ex) {
                    Logger.getLogger(OOP_QRCodeScanner.class.getName()).log(Level.SEVERE, null, ex);
                }

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
    private javax.swing.JTextField SRcode;
    private javax.swing.JTextField att;
    private javax.swing.JLabel currentDate2;
    private javax.swing.JLabel date;
    private javax.swing.JButton done;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField nametf;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JLabel passwordLabel6;
    private javax.swing.JButton saveDB;
    private javax.swing.JButton savetodb;
    private javax.swing.JButton scan;
    private javax.swing.JPanel scanner;
    private javax.swing.JButton showabsent;
    private javax.swing.JComboBox<String> subjects1;
    private javax.swing.JComboBox<String> subjects2;
    private javax.swing.JLabel time;
    private javax.swing.JTable tracker;
    private javax.swing.JLabel usernameLabel1;
    // End of variables declaration//GEN-END:variables

    private static class Signup_Student {

        public Signup_Student() {
        }
    }
}
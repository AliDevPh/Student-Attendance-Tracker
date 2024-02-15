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
import java.sql.*;

import javax.swing.table.DefaultTableModel;


public class qrcode extends javax.swing.JFrame implements Runnable, ThreadFactory {
    
    
    private WebcamPanel panel=null;
    private Webcam webcam = null;
    private Executor executor = Executors.newSingleThreadExecutor(this);


    
    public qrcode() {
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
            Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/trackeradmin","root","");
        } catch (SQLException ex) {
            Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
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

    private void initWebcam() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        srCode = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sr", "Name", "Time", "Attendance"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STUDENT ATTENDANCE TRACKER");

        jLabel3.setFont(new java.awt.Font("Poppins ExtraLight", 2, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BS IN COMPUTER ENGINEERING (2ND YEAR)");

        jButton2.setText("DB");

        srCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srCodeActionPerformed(evt);
            }
        });

        jButton4.setText("SHOW TO DATABASE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("DONE");

        date.setEditable(false);
        date.setText("               0");

        time.setEditable(false);
        time.setText("               0");

        jLabel1.setText("COURSE: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton2)
                        .addGap(238, 238, 238)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(44, 44, 44)
                        .addComponent(jButton5)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(srCode))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(srCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jLabel1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try{
                    Connection conn = Myconnection.getConnection();
                    Statement st = conn.createStatement();
                    String query = "SELECT * FROM mercado_anacieto_oop_display where ATTENDANCE = \"ABSENT\"";
                    ResultSet rs = st.executeQuery(query);
                    ResultSetMetaData rsm = rs.getMetaData();
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                    int cols = rsm.getColumnCount();
                    String [] colNAme = new String[cols];
                    for(int i = 0; i<cols; i++){
                        colNAme[i] = rsm.getColumnName(i+1);
                        model.setColumnIdentifiers(colNAme);
                        TableColumnModel columnModel = jTable1.getColumnModel();
                        columnModel.getColumn(0).setPreferredWidth(70);
                        columnModel.getColumn(1).setPreferredWidth(155);
                        columnModel.getColumn(2).setPreferredWidth(145);
                        columnModel.getColumn(3).setPreferredWidth(130);
                            String NAME, SRCODE, ATTENDANCE, TIME;
                            
                            
                        while (rs.next()){
                            NAME = rs.getString(1);
                            SRCODE = rs.getString(2);
                            ATTENDANCE = rs.getString(3);
                            TIME = rs.getString(4);
                         
                            String[] row = {NAME, SRCODE, ATTENDANCE, TIME};
                            model.addRow(row);
                        }
                    }


                }catch (Exception ex){
                   ex.printStackTrace();
                }                                                       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void srCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srCodeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
//        tblModel.addRow(data);
        
        if(tblModel.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Table is Empty");
        }
        
        else {
            try {
                String nm, src, dte, tm, att;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/mercado_anacieto_oop","root","");
                
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
                Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        srCode.setText("");

        
    
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(qrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qrcode().setVisible(true);
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
                Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
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
                        Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                    Object[] data = {srcodet, datet, timet, attd};
                    
                    DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
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
                        Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    

                    //Insert to table
                    
                } catch (SQLException ex) {
                    Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField srCode;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Thread newThread(Runnable r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

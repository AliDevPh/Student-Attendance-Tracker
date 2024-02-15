

package javaapplication17;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class NewClass {
    
    public static void main(String[] args) {
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension (320, 240));
        WebcamPanel webcamPanel =  new WebcamPanel(webcam);
        webcamPanel.setMirrored(false);
        JFrame jFrame = new JFrame();
        jFrame.add(webcamPanel);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        
        do {
            try {
                BufferedImage image = webcam.getImage();
                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer (source));
                Result result =  new MultiFormatReader().decode(bitmap);
                if (result.getText () !=null) {
                    JOptionPane.showMessageDialog(null, result.getText(),"INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                    jFrame.setVisible(false);
                    jFrame.dispose();
                    webcam.close();
                    break;
                    
                }
                
                
                
            } catch (NotFoundException | HeadlessException e) {
            }
            } while(true);
    }
}

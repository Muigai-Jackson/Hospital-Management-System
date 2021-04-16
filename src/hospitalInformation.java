
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class hospitalInformation extends javax.swing.JFrame {

    /**
     * Creates new form hospitalInformation
     */
    public hospitalInformation() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalInformation.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 11, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Imagine a remote village in the interior forests of East Africa with minimal access to electricity, no reliable water source, \nand where one's food source is directly dependent on the weather.\nImagine a place so remote that the nearest paved road is a forty minute walk for a healthy young man, and during the rainy\nseason the walking road is almost completely inaccessible by motor vehicles.\nImagine a place so remote that the nearest place to get one's blood pressure checked is over a forty minute walk for a \nhealthy young man and to which no paved road exists.\nImagine a place so remote that in an emergency, there is no one available, no one to call, and no access to any sort of \nservices.\n\nSuch places exist all throughout East Africa. Gatamaiyu, Kenya is just one such place.\n\nWhat is the Benjamin Wellness Center?\n\nThe Benjamin Wellness Center...\n...will be a health and wellness center in Gatamaiyu, Kenya\n...will provide access to basic medical care and services in a place that has no access.\n...will be the hands and feet of Christ, providing healing and hope - physically, mentally, and spiritually.\n...will be the love of Christ in action, meeting the healthcare needs of the community while pointing them to the One \nwho is truly able to meet all of their needs.\n...will address the needs of the community as modern culture clashes with the traditional ways of the native people.\n\nCore Services:\n...Medical Care\n...Mental Health Services, including Spiritual Counseling and Discipleship\n...Public Health Education\n...Community Development\n\nWhy Gatamaiyu?\nGatamaiyu, Kenya is just one small village, yet it is considered a hub for surrounding villages because, despite its lack of \nresources, it has about five kiosks which constitute a shopping center. Equipping Gatamaiyu with healthcare resources \nwould benefit not only the people of that village but also the people of the surrounding villages.\n\nThe people of Gatamaiyu are predominantly sustenance farmers.  Any additional income they may have is generated from \nthe sale of any extra crops and milk, and for some the sale of cash crops, especially tea.  Unfortunately, due to changes \nimposed on the farmers' tea co-op, tea can no longer serve as a reliable source of income for many in the region. The \nhealth and economic situation in this region is greatly lacking and routine health services and screenings ae unavailable.\nThe Benjamin Wellness Center is being established to meet these fundamental needs of the people in this region.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 780, 200));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-power-off-button-24.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 456, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new patient background.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Close?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new home().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(hospitalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hospitalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hospitalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hospitalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hospitalInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

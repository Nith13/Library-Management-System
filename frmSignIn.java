import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class frmSignIn extends javax.swing.JFrame {
    String con,id,pas;
    String pwd;
    String signInId;
    Connection conn = null;
    Statement stat = null;
    ResultSet rest = null;
    String uid = "root", pw = "tiger";
    boolean flag=false;
    
    /**
     * Creates new form frmSignIn
     */
    public frmSignIn() {
        initComponents();
       // txtSignInEmailId.setBackground(new Color(0,0,0,0));
        try {
            Class.forName("java.sql.Driver");
            //System.out.println("Driver Registered");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/library", uid, pw);
            //System.out.println("Connection Establish");
            stat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //rest=stat.executeQuery("select *from dept;");
            // System.out.println("Ready For Query");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Driver Not Found");
            System.exit(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Connection Not Establish" + e.getMessage());
            System.exit(0);
        }
        
    }
    public static boolean pwdValueCheck(String pwd) {
        if(pwd.length() >8){
            return true; 
        }
        else{
            return false;
        }
    }

    public static boolean checkPass(String pwd){
        boolean hasNum=false; 
        boolean hasUpper=false; 
        boolean hasLower=false; 
        char c;
        for(int i=0; i<pwd.length();i++){
            c=pwd.charAt(i);
            if(Character.isDigit(c)){
                hasNum=true;
            }
            else if(Character.isUpperCase(c)){
                hasUpper=true;
            }
            else if(Character.isLowerCase(c)){
                hasLower=true;
            }
            if(hasNum && hasUpper && hasLower){
                return true;
            }
        }
        return false;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSignInEmailId = new javax.swing.JLabel();
        lblSignPassword = new javax.swing.JLabel();
        txtSignInEmailId = new javax.swing.JTextField();
        txtSignInPassPanel = new javax.swing.JPanel();
        txtSignInPassword = new javax.swing.JPasswordField();
        btnEyeSignInPass = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSignInEmailId.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblSignInEmailId.setText("EMAIL ID:");

        lblSignPassword.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblSignPassword.setText("PASSWORD:");

        txtSignInEmailId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSignInEmailIdFocusLost(evt);
            }
        });

        txtSignInPassPanel.setBackground(new java.awt.Color(255, 255, 255));
        txtSignInPassPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSignInPassPanel.setPreferredSize(new java.awt.Dimension(376, 41));

        txtSignInPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtSignInPassword.setForeground(java.awt.Color.orange);
        txtSignInPassword.setBorder(null);
        txtSignInPassword.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSignInPasswordCaretUpdate(evt);
            }
        });
        txtSignInPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSignInPasswordFocusLost(evt);
            }
        });

        btnEyeSignInPass.setBackground(new java.awt.Color(255, 255, 255));
        btnEyeSignInPass.setBorder(null);
        btnEyeSignInPass.setBorderPainted(false);
        btnEyeSignInPass.setContentAreaFilled(false);
        btnEyeSignInPass.setOpaque(true);
        btnEyeSignInPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEyeSignInPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEyeSignInPassMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout txtSignInPassPanelLayout = new javax.swing.GroupLayout(txtSignInPassPanel);
        txtSignInPassPanel.setLayout(txtSignInPassPanelLayout);
        txtSignInPassPanelLayout.setHorizontalGroup(
            txtSignInPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtSignInPassPanelLayout.createSequentialGroup()
                .addComponent(txtSignInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEyeSignInPass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txtSignInPassPanelLayout.setVerticalGroup(
            txtSignInPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSignInPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(btnEyeSignInPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnOK.setBackground(new java.awt.Color(51, 51, 51));
        btnOK.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnOK.setForeground(new java.awt.Color(0, 0, 204));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSignInEmailId)
                    .addComponent(lblSignPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSignInPassPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSignInEmailId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(btnOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSignInEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lblSignPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSignInEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSignInPassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(btnOK)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSignInPasswordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSignInPasswordCaretUpdate
        con = new String(txtSignInPassword.getPassword());
        btnEyeSignInPass.setEnabled(true);
        btnEyeSignInPass.setIcon(new ImageIcon("src/Eye11.png"));
        if (con.isEmpty()) {
            btnEyeSignInPass.setIcon(null);
            btnEyeSignInPass.setEnabled(false);
        }
    }//GEN-LAST:event_txtSignInPasswordCaretUpdate

    private void txtSignInPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSignInPasswordFocusLost
        con=new String(txtSignInPassword.getPassword());
        if(pwdValueCheck(con)){
            if(checkPass(con)){}
            else{
                JOptionPane.showMessageDialog(this,"Invalid Entry ,Please Write Atleast One Digit , Uppercase & LowerCase ","Error",0);
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Too Small","Error",0);
        }
        if(btnEyeSignInPass.isEnabled()) {
            //System.out.println("Button Released...");
            btnEyeSignInPass.setIcon(new ImageIcon("/src/Eye11.png"));
            txtSignInPassword.setEchoChar('\u25cf');
            txtSignInPassword.setText(con);
        }
    }//GEN-LAST:event_txtSignInPasswordFocusLost

    private void btnEyeSignInPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeSignInPassMousePressed
        if (btnEyeSignInPass.isEnabled()) {
            //System.out.println("Button Pressed...");
            con = new String(txtSignInPassword.getPassword());
            txtSignInPassword.setEchoChar((char) 0);
            txtSignInPassword.setText(con);
            btnEyeSignInPass.setIcon(new ImageIcon("src/Eye12.png"));
        }
    }//GEN-LAST:event_btnEyeSignInPassMousePressed

    private void btnEyeSignInPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeSignInPassMouseReleased
        if (btnEyeSignInPass.isEnabled()) {
            //System.out.println("Button Released...");
            btnEyeSignInPass.setIcon(new ImageIcon("src/Eye11.png"));
            txtSignInPassword.setEchoChar('\u25cf');
            txtSignInPassword.setText(con);
        }
    }//GEN-LAST:event_btnEyeSignInPassMouseReleased

    private void txtSignInEmailIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSignInEmailIdFocusLost
        signInId = new String(txtSignInEmailId.getText());
        if ((signInId.indexOf("@") == -1) || (!signInId.endsWith(".com") && (!signInId.endsWith(".co.in")))) {
            JOptionPane.showMessageDialog(this, "Invalid Email Id...", "Error", 0);
            txtSignInEmailId.requestFocus();
        }

    }//GEN-LAST:event_txtSignInEmailIdFocusLost

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        id=txtSignInEmailId.getText();
        pas=new String(txtSignInPassword.getPassword());
        try{
            rest=stat.executeQuery("select * from login");
            while(rest.next()){
                String temp = rest.getString("ID");
                String temp1 = rest.getString("pass");
                if(id.equals(temp) && pas.equals(temp1)){
                    frmLib frm =new frmLib();
                    this.dispose();
                    frm.pack();
                    frm.setLocationRelativeTo(this);
                    frm.setVisible(true);
                    flag = true;
                }
            }
            if(!flag) {
                JOptionPane.showMessageDialog(this,"Emailid and password doesnot match");
                txtSignInEmailId.setText("");
                txtSignInPassword.setText("");
                txtSignInEmailId.requestFocus();
            }
               
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error..."+e.getMessage());
        }
    }//GEN-LAST:event_btnOKActionPerformed

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
            java.util.logging.Logger.getLogger(frmSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEyeSignInPass;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lblSignInEmailId;
    private javax.swing.JLabel lblSignPassword;
    private javax.swing.JTextField txtSignInEmailId;
    private javax.swing.JPanel txtSignInPassPanel;
    private javax.swing.JPasswordField txtSignInPassword;
    // End of variables declaration//GEN-END:variables
}

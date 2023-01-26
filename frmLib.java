
import java.awt.Color;

public class frmLib extends javax.swing.JFrame {

    /**
     * Creates new form frmPathasalaMainPage
     */
    public frmLib() {
        initComponents();
        this.getContentPane().setBackground(Color.yellow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAuthorRec = new javax.swing.JLabel();
        lbllbooks = new javax.swing.JLabel();
        lbllauthors = new javax.swing.JLabel();
        lblpublishers = new javax.swing.JLabel();
        lblBooksRec = new javax.swing.JLabel();
        lblMember = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAuthorRec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAuthorRec.setForeground(new java.awt.Color(0, 204, 51));
        lblAuthorRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authorRec.PNG"))); // NOI18N
        lblAuthorRec.setText("AUTHORS RECORD");
        lblAuthorRec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAuthorRec.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblAuthorRec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAuthorRecMouseClicked(evt);
            }
        });

        lbllbooks.setBackground(new java.awt.Color(204, 204, 0));
        lbllbooks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbllbooks.setForeground(new java.awt.Color(204, 204, 0));
        lbllbooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/books.jpg"))); // NOI18N
        lbllbooks.setText("BOOKS");
        lbllbooks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbllbooks.setVerifyInputWhenFocusTarget(false);
        lbllbooks.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbllbooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbllbooksMouseClicked(evt);
            }
        });

        lbllauthors.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbllauthors.setForeground(new java.awt.Color(153, 0, 153));
        lbllauthors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/author.jpg"))); // NOI18N
        lbllauthors.setText("AUTHORS");
        lbllauthors.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbllauthors.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbllauthors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbllauthorsMouseClicked(evt);
            }
        });

        lblpublishers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblpublishers.setForeground(new java.awt.Color(0, 102, 153));
        lblpublishers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publisher.png"))); // NOI18N
        lblpublishers.setText("PUBLISHERS");
        lblpublishers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblpublishers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblpublishers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpublishersMouseClicked(evt);
            }
        });

        lblBooksRec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBooksRec.setForeground(new java.awt.Color(51, 0, 51));
        lblBooksRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBooksRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booksrecord.jpg"))); // NOI18N
        lblBooksRec.setText("BOOKSRECORD");
        lblBooksRec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBooksRec.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblBooksRec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBooksRecMouseClicked(evt);
            }
        });

        lblMember.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMember.setForeground(new java.awt.Color(153, 0, 153));
        lblMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/members.jpg"))); // NOI18N
        lblMember.setText("MEMBERS");
        lblMember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMember.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMemberMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBooksRec, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbllbooks)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbllauthors, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAuthorRec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblpublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbllauthors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbllbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblpublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAuthorRec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMember, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBooksRec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbllbooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllbooksMouseClicked
       frmBooks form = new frmBooks();
       this.dispose();
       form.pack();
       form.setLocationRelativeTo(this);
       form.setVisible(true);
    }//GEN-LAST:event_lbllbooksMouseClicked

    private void lbllauthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllauthorsMouseClicked
        frmAuthors form = new frmAuthors();
        this.dispose();
        form.pack();
        form.setLocationRelativeTo(this);
        form.setVisible(true);
    }//GEN-LAST:event_lbllauthorsMouseClicked

    private void lblpublishersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpublishersMouseClicked
        frmPublishers form =  new frmPublishers();
        this.dispose();
        form.pack();
        form.setLocationRelativeTo(this);
        form.setVisible(true);
    }//GEN-LAST:event_lblpublishersMouseClicked

    private void lblBooksRecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBooksRecMouseClicked
        frmBooksRecord form =  new frmBooksRecord();
        this.dispose();
        form.pack();
        form.setLocationRelativeTo(this);
        form.setVisible(true);

    }//GEN-LAST:event_lblBooksRecMouseClicked

    private void lblAuthorRecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAuthorRecMouseClicked
        frmAuthorsRecord form =  new frmAuthorsRecord();
        this.dispose();
        form.pack();
        form.setLocationRelativeTo(this);
        form.setVisible(true);

    }//GEN-LAST:event_lblAuthorRecMouseClicked

    private void lblMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMemberMouseClicked
        frmMembers form =  new frmMembers();
        this.dispose();
        form.pack();
        form.setLocationRelativeTo(this);
        form.setVisible(true);

    }//GEN-LAST:event_lblMemberMouseClicked

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
            java.util.logging.Logger.getLogger(frmLib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLib().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAuthorRec;
    private javax.swing.JLabel lblBooksRec;
    private javax.swing.JLabel lblMember;
    private javax.swing.JLabel lbllauthors;
    private javax.swing.JLabel lbllbooks;
    private javax.swing.JLabel lblpublishers;
    // End of variables declaration//GEN-END:variables
}

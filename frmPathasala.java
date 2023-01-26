import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class frmPathasala extends javax.swing.JFrame {
    int value;
    Timer tim;
    /**
     * Creates new form frmPathasala
     */
    public frmPathasala() {
        initComponents();
        //splash();
        //This show the text area of sponsor as a transparent//
        
        scrollSponsor.setOpaque(false);
        scrollSponsor.getViewport().setOpaque(false);
        scrollSponsor.setBorder(null);
        scrollSponsor.setViewportBorder(null);

        txtSponsor.setBorder(null);
        txtSponsor.setBackground(new Color(0, 0, 0,0));

        //This show the text area of disclaimer as a transparent// 
        
        scrollDisclaimer.setOpaque(false);
        scrollDisclaimer.getViewport().setOpaque(false);
        scrollDisclaimer.setBorder(null);
        scrollDisclaimer.setViewportBorder(null);

        txtDisclaimer.setBorder(null);
        txtDisclaimer.setBackground(new Color(0, 0, 0, 0));

        //This show the text area of about as a transparent//
        
        scrollAbout.setOpaque(false);
        scrollAbout.getViewport().setOpaque(false);
        scrollAbout.setBorder(null);
        scrollAbout.setViewportBorder(null);

        txtAbout.setBorder(null);
        txtAbout.setBackground(new Color(0, 0, 0, 0));

        //This show the text area of contact as a transparent//
        
        scrollContact.setOpaque(false);
        scrollContact.getViewport().setOpaque(false);
        scrollContact.setBorder(null);
        scrollContact.setViewportBorder(null);

        txtContact.setBorder(null);
        txtContact.setBackground(new Color(0, 0, 0, 0));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dialogSponsor = new javax.swing.JDialog();
        bgImgeSponsor = new javax.swing.JPanel();
        fgImgeSponsor = new javax.swing.JPanel();
        scrollSponsor = new javax.swing.JScrollPane();
        txtSponsor = new javax.swing.JTextArea();
        lblponsor = new javax.swing.JLabel();
        btnExitSponsor = new javax.swing.JButton();
        lblImgeSponsor = new javax.swing.JLabel();
        dialogDisclimar = new javax.swing.JDialog();
        bgImageDisclaimer = new javax.swing.JPanel();
        fgImageDisclaimer = new javax.swing.JPanel();
        scrollDisclaimer = new javax.swing.JScrollPane();
        txtDisclaimer = new javax.swing.JTextArea();
        lblHeadingDisclaimer = new javax.swing.JLabel();
        btnDisclaimerExit = new javax.swing.JButton();
        lblImageDisclaimer = new javax.swing.JLabel();
        dialogAbout = new javax.swing.JDialog();
        bgImageAbout = new javax.swing.JPanel();
        fgImageAbout = new javax.swing.JPanel();
        scrollAbout = new javax.swing.JScrollPane();
        txtAbout = new javax.swing.JTextArea();
        btnAboutExit = new javax.swing.JButton();
        lblHeadingAbout = new javax.swing.JLabel();
        lblImageAbout = new javax.swing.JLabel();
        dialogContact = new javax.swing.JDialog();
        bgImageContact = new javax.swing.JPanel();
        fgImageContact = new javax.swing.JPanel();
        lblHeadingContact = new javax.swing.JLabel();
        scrollContact = new javax.swing.JScrollPane();
        txtContact = new javax.swing.JTextArea();
        btnExitContact = new javax.swing.JButton();
        lblImageContact = new javax.swing.JLabel();
        dialogSplash = new javax.swing.JDialog();
        panelLogin = new javax.swing.JPanel();
        btnSignIn = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblAbout = new javax.swing.JLabel();
        lblSponsor = new javax.swing.JLabel();
        lblDisclaimer = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        dialogSponsor.setBackground(new java.awt.Color(255, 255, 0));
        dialogSponsor.setUndecorated(true);

        bgImgeSponsor.setMinimumSize(new java.awt.Dimension(0, 0));
        bgImgeSponsor.setOpaque(false);
        bgImgeSponsor.setPreferredSize(new java.awt.Dimension(1, 1));
        bgImgeSponsor.setLayout(new java.awt.GridBagLayout());

        fgImgeSponsor.setForeground(new java.awt.Color(204, 0, 0));
        fgImgeSponsor.setMinimumSize(new java.awt.Dimension(0, 0));
        fgImgeSponsor.setOpaque(false);
        fgImgeSponsor.setPreferredSize(new java.awt.Dimension(1, 1));

        txtSponsor.setEditable(false);
        txtSponsor.setBackground(new java.awt.Color(250, 250, 250));
        txtSponsor.setColumns(20);
        txtSponsor.setFont(new java.awt.Font("Script MT Bold", 2, 48)); // NOI18N
        txtSponsor.setForeground(new java.awt.Color(204, 0, 255));
        txtSponsor.setRows(5);
        txtSponsor.setText("Ministry of Human Resource Development (MHRD)\n, through its National Missionon Education through \nInformation and Communication Technology (NMEICT), \nhas sponsored and funded the e-PATHSHALA pilot project.");
        txtSponsor.setBorder(null);
        txtSponsor.setOpaque(false);
        scrollSponsor.setViewportView(txtSponsor);

        lblponsor.setFont(new java.awt.Font("Ravie", 1, 50)); // NOI18N
        lblponsor.setForeground(java.awt.Color.orange);
        lblponsor.setText("SPONSOR");

        btnExitSponsor.setBackground(new java.awt.Color(0, 0, 0));
        btnExitSponsor.setFont(new java.awt.Font("AA Sameer mosan", 1, 50)); // NOI18N
        btnExitSponsor.setForeground(java.awt.Color.red);
        btnExitSponsor.setText("EXIT");
        btnExitSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitSponsorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fgImgeSponsorLayout = new javax.swing.GroupLayout(fgImgeSponsor);
        fgImgeSponsor.setLayout(fgImgeSponsorLayout);
        fgImgeSponsorLayout.setHorizontalGroup(
            fgImgeSponsorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fgImgeSponsorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrollSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(fgImgeSponsorLayout.createSequentialGroup()
                .addGroup(fgImgeSponsorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fgImgeSponsorLayout.createSequentialGroup()
                        .addGap(594, 594, 594)
                        .addComponent(btnExitSponsor))
                    .addGroup(fgImgeSponsorLayout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(lblponsor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fgImgeSponsorLayout.setVerticalGroup(
            fgImgeSponsorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgImgeSponsorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblponsor)
                .addGap(30, 30, 30)
                .addComponent(scrollSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnExitSponsor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bgImgeSponsor.add(fgImgeSponsor, gridBagConstraints);

        lblImgeSponsor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo11.jpg"))); // NOI18N
        lblImgeSponsor.setMinimumSize(new java.awt.Dimension(0, 0));
        lblImgeSponsor.setPreferredSize(new java.awt.Dimension(1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bgImgeSponsor.add(lblImgeSponsor, gridBagConstraints);

        javax.swing.GroupLayout dialogSponsorLayout = new javax.swing.GroupLayout(dialogSponsor.getContentPane());
        dialogSponsor.getContentPane().setLayout(dialogSponsorLayout);
        dialogSponsorLayout.setHorizontalGroup(
            dialogSponsorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgImgeSponsor, javax.swing.GroupLayout.DEFAULT_SIZE, 1431, Short.MAX_VALUE)
        );
        dialogSponsorLayout.setVerticalGroup(
            dialogSponsorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgImgeSponsor, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        dialogDisclimar.setUndecorated(true);

        bgImageDisclaimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 3));
        bgImageDisclaimer.setOpaque(false);
        bgImageDisclaimer.setPreferredSize(new java.awt.Dimension(1, 1));
        bgImageDisclaimer.setLayout(new java.awt.GridBagLayout());

        fgImageDisclaimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 3));
        fgImageDisclaimer.setOpaque(false);
        fgImageDisclaimer.setPreferredSize(new java.awt.Dimension(1, 1));

        scrollDisclaimer.setOpaque(false);

        txtDisclaimer.setEditable(false);
        txtDisclaimer.setBackground(java.awt.SystemColor.windowText);
        txtDisclaimer.setColumns(20);
        txtDisclaimer.setFont(new java.awt.Font("Chiller", 0, 36)); // NOI18N
        txtDisclaimer.setForeground(new java.awt.Color(153, 0, 0));
        txtDisclaimer.setRows(5);
        txtDisclaimer.setText("e-PATHSHALAis a conglomeration of freely available or institutionally contributed or donated or publisher managed contents.\nAlmost all these contents are hosted and accessed from respective sources. The responsibility for authenticity,relevance, \ncompleteness, accuracy, reliability and suitability of these contents rests with respective organizationfrom where the\ncontents are sourced and e-PATHSALA has no responsibility or liability for these. Every effortis made to keep the \ne-PATHSALA portal up and running smoothly. However , e-PATHSALA takes no responsibility for, and will not be liable\n for, the portal being unavailable due to technical issues orotherwise.");
        txtDisclaimer.setBorder(null);
        scrollDisclaimer.setViewportView(txtDisclaimer);

        lblHeadingDisclaimer.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblHeadingDisclaimer.setForeground(new java.awt.Color(102, 255, 0));
        lblHeadingDisclaimer.setText("DISCLAIMER");

        btnDisclaimerExit.setBackground(new java.awt.Color(0, 0, 0));
        btnDisclaimerExit.setFont(new java.awt.Font("AA Sameer mosan", 1, 50)); // NOI18N
        btnDisclaimerExit.setForeground(new java.awt.Color(102, 255, 204));
        btnDisclaimerExit.setText("EXIT");
        btnDisclaimerExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisclaimerExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fgImageDisclaimerLayout = new javax.swing.GroupLayout(fgImageDisclaimer);
        fgImageDisclaimer.setLayout(fgImageDisclaimerLayout);
        fgImageDisclaimerLayout.setHorizontalGroup(
            fgImageDisclaimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgImageDisclaimerLayout.createSequentialGroup()
                .addGroup(fgImageDisclaimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fgImageDisclaimerLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(scrollDisclaimer, javax.swing.GroupLayout.PREFERRED_SIZE, 1326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fgImageDisclaimerLayout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(lblHeadingDisclaimer)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fgImageDisclaimerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDisclaimerExit)
                .addGap(612, 612, 612))
        );
        fgImageDisclaimerLayout.setVerticalGroup(
            fgImageDisclaimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgImageDisclaimerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblHeadingDisclaimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(scrollDisclaimer, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnDisclaimerExit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bgImageDisclaimer.add(fgImageDisclaimer, gridBagConstraints);

        lblImageDisclaimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo2.jpg"))); // NOI18N
        lblImageDisclaimer.setMinimumSize(new java.awt.Dimension(0, 0));
        lblImageDisclaimer.setPreferredSize(new java.awt.Dimension(1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bgImageDisclaimer.add(lblImageDisclaimer, gridBagConstraints);

        javax.swing.GroupLayout dialogDisclimarLayout = new javax.swing.GroupLayout(dialogDisclimar.getContentPane());
        dialogDisclimar.getContentPane().setLayout(dialogDisclimarLayout);
        dialogDisclimarLayout.setHorizontalGroup(
            dialogDisclimarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1409, Short.MAX_VALUE)
            .addGroup(dialogDisclimarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bgImageDisclaimer, javax.swing.GroupLayout.DEFAULT_SIZE, 1409, Short.MAX_VALUE))
        );
        dialogDisclimarLayout.setVerticalGroup(
            dialogDisclimarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
            .addGroup(dialogDisclimarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bgImageDisclaimer, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
        );

        dialogAbout.setUndecorated(true);

        bgImageAbout.setMinimumSize(new java.awt.Dimension(0, 0));
        bgImageAbout.setOpaque(false);
        bgImageAbout.setPreferredSize(new java.awt.Dimension(1, 1));
        bgImageAbout.setLayout(new java.awt.GridBagLayout());

        fgImageAbout.setMinimumSize(new java.awt.Dimension(0, 0));
        fgImageAbout.setOpaque(false);
        fgImageAbout.setPreferredSize(new java.awt.Dimension(1, 1));

        txtAbout.setEditable(false);
        txtAbout.setColumns(20);
        txtAbout.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        txtAbout.setForeground(new java.awt.Color(102, 0, 51));
        txtAbout.setRows(5);
        txtAbout.setText("Ministry of Human Resource Development (MHRD) under its National Mission on Education through\n Information and Communication Technology (NMEICT) has initiated the e-PATHSHA.\nFiltered and federated searching is employed to facilitate focused searching so that learners can find\nout the right resource with least effort and in minimum time.\ne-PATHSHALA is designed to hold content of  english and hindi language and provides interface\nsupport for leading languages.\nIt is being arranged to provide support for all academic levels including researchers and life-long \nlearners, all disciplines, all popular form of access devices and differently-abled learners.\nIt is being developed to help students to prepare for entrance and competitive examination , to enable\n people to learn and prepare from best practices .\n");
        scrollAbout.setViewportView(txtAbout);

        btnAboutExit.setBackground(new java.awt.Color(0, 0, 0));
        btnAboutExit.setFont(new java.awt.Font("AA Sameer mosan", 1, 50)); // NOI18N
        btnAboutExit.setForeground(new java.awt.Color(102, 255, 0));
        btnAboutExit.setText("EXIT");
        btnAboutExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutExitActionPerformed(evt);
            }
        });

        lblHeadingAbout.setFont(new java.awt.Font("Bodoni MT Black", 1, 50)); // NOI18N
        lblHeadingAbout.setForeground(new java.awt.Color(0, 0, 255));
        lblHeadingAbout.setText("ABOUT e-PATHSHALA");

        javax.swing.GroupLayout fgImageAboutLayout = new javax.swing.GroupLayout(fgImageAbout);
        fgImageAbout.setLayout(fgImageAboutLayout);
        fgImageAboutLayout.setHorizontalGroup(
            fgImageAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgImageAboutLayout.createSequentialGroup()
                .addGroup(fgImageAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fgImageAboutLayout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(lblHeadingAbout))
                    .addGroup(fgImageAboutLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(scrollAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fgImageAboutLayout.createSequentialGroup()
                        .addGap(617, 617, 617)
                        .addComponent(btnAboutExit)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        fgImageAboutLayout.setVerticalGroup(
            fgImageAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgImageAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeadingAbout)
                .addGap(18, 18, 18)
                .addComponent(scrollAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(btnAboutExit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bgImageAbout.add(fgImageAbout, gridBagConstraints);

        lblImageAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo12.jpg"))); // NOI18N
        lblImageAbout.setMinimumSize(new java.awt.Dimension(0, 0));
        lblImageAbout.setPreferredSize(new java.awt.Dimension(1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bgImageAbout.add(lblImageAbout, gridBagConstraints);

        javax.swing.GroupLayout dialogAboutLayout = new javax.swing.GroupLayout(dialogAbout.getContentPane());
        dialogAbout.getContentPane().setLayout(dialogAboutLayout);
        dialogAboutLayout.setHorizontalGroup(
            dialogAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgImageAbout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1503, Short.MAX_VALUE)
        );
        dialogAboutLayout.setVerticalGroup(
            dialogAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgImageAbout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        dialogContact.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogContact.setUndecorated(true);

        bgImageContact.setOpaque(false);
        bgImageContact.setPreferredSize(new java.awt.Dimension(1, 1));
        bgImageContact.setLayout(new java.awt.GridBagLayout());

        fgImageContact.setMinimumSize(new java.awt.Dimension(0, 0));
        fgImageContact.setOpaque(false);
        fgImageContact.setPreferredSize(new java.awt.Dimension(1, 1));

        lblHeadingContact.setFont(new java.awt.Font("Forte", 1, 60)); // NOI18N
        lblHeadingContact.setForeground(java.awt.Color.cyan);
        lblHeadingContact.setText("CONTACT");

        txtContact.setEditable(false);
        txtContact.setColumns(20);
        txtContact.setFont(new java.awt.Font("Algerian", 0, 40)); // NOI18N
        txtContact.setForeground(new java.awt.Color(255, 255, 51));
        txtContact.setRows(5);
        txtContact.setText("    e-PATHSHALA Project\n    Central Library (ISO-9001:2015 Certified)\n    LIONS INTERNATION CLUBS AND SCHOOL OF INFORMATICS PRACTICES MIRZAPUR\n    India - 721302\n\n    Phone: +91-3222-282435");
        scrollContact.setViewportView(txtContact);

        btnExitContact.setBackground(new java.awt.Color(0, 0, 0));
        btnExitContact.setFont(new java.awt.Font("AlQalam Mujeeb", 1, 55)); // NOI18N
        btnExitContact.setForeground(new java.awt.Color(0, 51, 204));
        btnExitContact.setText("EXIT");
        btnExitContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitContactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fgImageContactLayout = new javax.swing.GroupLayout(fgImageContact);
        fgImageContact.setLayout(fgImageContactLayout);
        fgImageContactLayout.setHorizontalGroup(
            fgImageContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgImageContactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fgImageContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fgImageContactLayout.createSequentialGroup()
                        .addComponent(scrollContact)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fgImageContactLayout.createSequentialGroup()
                        .addGap(0, 629, Short.MAX_VALUE)
                        .addComponent(lblHeadingContact)
                        .addGap(611, 611, 611))))
            .addGroup(fgImageContactLayout.createSequentialGroup()
                .addGap(671, 671, 671)
                .addComponent(btnExitContact)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fgImageContactLayout.setVerticalGroup(
            fgImageContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgImageContactLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblHeadingContact)
                .addGap(18, 18, 18)
                .addComponent(scrollContact, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnExitContact)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bgImageContact.add(fgImageContact, gridBagConstraints);

        lblImageContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo9.jpg"))); // NOI18N
        lblImageContact.setMinimumSize(new java.awt.Dimension(0, 0));
        lblImageContact.setPreferredSize(new java.awt.Dimension(1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bgImageContact.add(lblImageContact, gridBagConstraints);

        javax.swing.GroupLayout dialogContactLayout = new javax.swing.GroupLayout(dialogContact.getContentPane());
        dialogContact.getContentPane().setLayout(dialogContactLayout);
        dialogContactLayout.setHorizontalGroup(
            dialogContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgImageContact, javax.swing.GroupLayout.DEFAULT_SIZE, 1533, Short.MAX_VALUE)
        );
        dialogContactLayout.setVerticalGroup(
            dialogContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgImageContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );

        dialogSplash.setModal(true);

        javax.swing.GroupLayout dialogSplashLayout = new javax.swing.GroupLayout(dialogSplash.getContentPane());
        dialogSplash.getContentPane().setLayout(dialogSplashLayout);
        dialogSplashLayout.setHorizontalGroup(
            dialogSplashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );
        dialogSplashLayout.setVerticalGroup(
            dialogSplashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("e-PATHSHALA");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelLogin.setBackground(new java.awt.Color(204, 204, 255));
        panelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        panelLogin.setForeground(new java.awt.Color(0, 153, 153));

        btnSignIn.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(0, 0, 204));
        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        btnSignUp.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(0, 0, 153));
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnSignIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnSignUp)
                .addGap(77, 77, 77))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignIn)
                    .addComponent(btnSignUp))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FEATURES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Learning Resource type");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("SUBject domain");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylogo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("MENU DETAILS"));

        lblAbout.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblAbout.setForeground(new java.awt.Color(255, 102, 102));
        lblAbout.setText("ABOUT");
        lblAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAboutMouseExited(evt);
            }
        });

        lblSponsor.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblSponsor.setForeground(new java.awt.Color(0, 102, 0));
        lblSponsor.setText("SPONSOR");
        lblSponsor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSponsorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSponsorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSponsorMouseExited(evt);
            }
        });

        lblDisclaimer.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblDisclaimer.setForeground(new java.awt.Color(204, 0, 51));
        lblDisclaimer.setText("DISCLAIMER");
        lblDisclaimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDisclaimerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDisclaimerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDisclaimerMouseExited(evt);
            }
        });

        lblContact.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblContact.setForeground(new java.awt.Color(153, 0, 153));
        lblContact.setText("CONTACT");
        lblContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContactMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblContactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblContactMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContact)
                .addGap(18, 18, 18)
                .addComponent(lblDisclaimer)
                .addGap(37, 37, 37)
                .addComponent(lblSponsor)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAbout)
                            .addComponent(lblContact)
                            .addComponent(lblDisclaimer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmobile.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 51)));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roundimage.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addComponent(jLabel6)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseClicked
        this.dispose();
        dialogAbout.pack();
        dialogAbout.setLocationRelativeTo(null);
        dialogAbout.setVisible(true);
    }//GEN-LAST:event_lblAboutMouseClicked

    private void lblSponsorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSponsorMouseClicked
        this.dispose();
        dialogSponsor.pack();
        dialogSponsor.setLocationRelativeTo(null);
        dialogSponsor.setVisible(true);
    }//GEN-LAST:event_lblSponsorMouseClicked

    private void lblDisclaimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisclaimerMouseClicked
        this.dispose();
        dialogDisclimar.pack();
        dialogDisclimar.setLocationRelativeTo(null);
        dialogDisclimar.setVisible(true);
    }//GEN-LAST:event_lblDisclaimerMouseClicked

    private void lblContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContactMouseClicked
        this.dispose();
        dialogContact.pack();
        dialogContact.setLocationRelativeTo(null);
        dialogContact.setVisible(true);
    }//GEN-LAST:event_lblContactMouseClicked

    private void btnExitSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitSponsorActionPerformed
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        dialogSponsor.dispose();
    }//GEN-LAST:event_btnExitSponsorActionPerformed

    private void btnDisclaimerExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisclaimerExitActionPerformed
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        dialogDisclimar.dispose();
    }//GEN-LAST:event_btnDisclaimerExitActionPerformed

    private void btnAboutExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutExitActionPerformed
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        dialogAbout.dispose();
    }//GEN-LAST:event_btnAboutExitActionPerformed

    private void btnExitContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitContactActionPerformed
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        dialogContact.dispose();
    }//GEN-LAST:event_btnExitContactActionPerformed

    private void lblAboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseEntered
        Font aboutFont = lblAbout.getFont();
        lblAbout.setFont(new Font(aboutFont.getFontName(), aboutFont.getStyle(), aboutFont.getSize() + 1));
    }//GEN-LAST:event_lblAboutMouseEntered

    private void lblAboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseExited
        Font aboutFont = lblAbout.getFont();
        lblAbout.setFont(new Font(aboutFont.getFontName(), aboutFont.getStyle(), aboutFont.getSize() - 1));
    }//GEN-LAST:event_lblAboutMouseExited

    private void lblContactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContactMouseEntered
        Font contactFont = lblContact.getFont();
        lblContact.setFont(new Font(contactFont.getFontName(), contactFont.getStyle(), contactFont.getSize() + 1));
    }//GEN-LAST:event_lblContactMouseEntered

    private void lblContactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContactMouseExited
        Font contactFont = lblContact.getFont();
        lblContact.setFont(new Font(contactFont.getFontName(), contactFont.getStyle(), contactFont.getSize() - 1));
    }//GEN-LAST:event_lblContactMouseExited

    private void lblSponsorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSponsorMouseEntered
        Font sponsorFont = lblSponsor.getFont();
        lblSponsor.setFont(new Font(sponsorFont.getFontName(), sponsorFont.getStyle(), sponsorFont.getSize() + 1));
    }//GEN-LAST:event_lblSponsorMouseEntered

    private void lblSponsorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSponsorMouseExited
        Font sponsorFont = lblSponsor.getFont();
        lblSponsor.setFont(new Font(sponsorFont.getFontName(), sponsorFont.getStyle(), sponsorFont.getSize() - 1));
    }//GEN-LAST:event_lblSponsorMouseExited

    private void lblDisclaimerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisclaimerMouseEntered
        Font disclaimerFont = lblDisclaimer.getFont();
        lblDisclaimer.setFont(new Font(disclaimerFont.getFontName(), disclaimerFont.getStyle(), disclaimerFont.getSize() + 1));
    }//GEN-LAST:event_lblDisclaimerMouseEntered

    private void lblDisclaimerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisclaimerMouseExited
        Font disclaimerFont = lblDisclaimer.getFont();
        lblDisclaimer.setFont(new Font(disclaimerFont.getFontName(), disclaimerFont.getStyle(), disclaimerFont.getSize() - 1));
    }//GEN-LAST:event_lblDisclaimerMouseExited

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        frmSignIn frm= new frmSignIn();
        this.dispose();
        frm.pack();
        frm.setLocationRelativeTo(this);
        frm.setVisible(true);

    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        frmSignUp fram=new frmSignUp();
        this.dispose();
        fram.pack();
        fram.setLocationRelativeTo(this);
        fram.setVisible(true);
    }//GEN-LAST:event_btnSignUpActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPathasala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPathasala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPathasala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPathasala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPathasala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgImageAbout;
    private javax.swing.JPanel bgImageContact;
    private javax.swing.JPanel bgImageDisclaimer;
    private javax.swing.JPanel bgImgeSponsor;
    private javax.swing.JButton btnAboutExit;
    private javax.swing.JButton btnDisclaimerExit;
    private javax.swing.JButton btnExitContact;
    private javax.swing.JButton btnExitSponsor;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JDialog dialogAbout;
    private javax.swing.JDialog dialogContact;
    private javax.swing.JDialog dialogDisclimar;
    private javax.swing.JDialog dialogSplash;
    private javax.swing.JDialog dialogSponsor;
    private javax.swing.JPanel fgImageAbout;
    private javax.swing.JPanel fgImageContact;
    private javax.swing.JPanel fgImageDisclaimer;
    private javax.swing.JPanel fgImgeSponsor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDisclaimer;
    private javax.swing.JLabel lblHeadingAbout;
    private javax.swing.JLabel lblHeadingContact;
    private javax.swing.JLabel lblHeadingDisclaimer;
    private javax.swing.JLabel lblImageAbout;
    private javax.swing.JLabel lblImageContact;
    private javax.swing.JLabel lblImageDisclaimer;
    private javax.swing.JLabel lblImgeSponsor;
    private javax.swing.JLabel lblSponsor;
    private javax.swing.JLabel lblponsor;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JScrollPane scrollAbout;
    private javax.swing.JScrollPane scrollContact;
    private javax.swing.JScrollPane scrollDisclaimer;
    private javax.swing.JScrollPane scrollSponsor;
    private javax.swing.JTextArea txtAbout;
    private javax.swing.JTextArea txtContact;
    private javax.swing.JTextArea txtDisclaimer;
    private javax.swing.JTextArea txtSponsor;
    // End of variables declaration//GEN-END:variables
}

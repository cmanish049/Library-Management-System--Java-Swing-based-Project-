package college.bookreturn;
import javax.swing.*;

public class LibraryJFrame extends javax.swing.JFrame {

    /** Creates new form LibraryJFrame */
    public LibraryJFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameLogin = new javax.swing.JInternalFrame();
        jLabelLoginLbl = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabelPswd = new javax.swing.JLabel();
        jPasswordFieldPswd = new javax.swing.JPasswordField();
        jInternalFrameUserInfo = new javax.swing.JInternalFrame();
        jLabelUserInfo = new javax.swing.JLabel();
        jLabelBorrowerId = new javax.swing.JLabel();
        jTextFieldBorrowerId = new javax.swing.JTextField();
        jButtonFindBorrower = new javax.swing.JButton();
        jInternalFrameBookOwed = new javax.swing.JInternalFrame();
        jLabelBkBr = new javax.swing.JLabel();
        jLabelBkOwedTo = new javax.swing.JLabel();
        jLabelBorrId = new javax.swing.JLabel();
        jLabelBorrName = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jLabelBorrId1 = new javax.swing.JLabel();
        jLabelBorrName1 = new javax.swing.JLabel();
        jLabelBorrName2 = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBooks = new javax.swing.JList();
        jInternalFrameFineInfo = new javax.swing.JInternalFrame();
        jLabelFineInfo = new javax.swing.JLabel();
        jLabelBorrower = new javax.swing.JLabel();
        jLabelAmount = new javax.swing.JLabel();
        jButtonPaid = new javax.swing.JButton();
        jButtonNotPaid = new javax.swing.JButton();
        jLabelFine = new javax.swing.JLabel();
        jInternalFrameDlgBox = new javax.swing.JInternalFrame();
        jOptionPaneInvalidUser = new javax.swing.JOptionPane();
        jOptionPaneExit = new javax.swing.JOptionPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemLogout = new javax.swing.JMenuItem();
        jSeparatorAcnt = new javax.swing.JSeparator();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuLib = new javax.swing.JMenu();
        jMenuItemBookReturn = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameLogin.setClosable(true);
        jInternalFrameLogin.setResizable(true);
        jInternalFrameLogin.setAlignmentX(0.0F);
        jInternalFrameLogin.setAlignmentY(0.0F);
        jInternalFrameLogin.setMinimumSize(new java.awt.Dimension(200, 200));
        jInternalFrameLogin.setPreferredSize(new java.awt.Dimension(200, 231));

        jLabelLoginLbl.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabelLoginLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginLbl.setText("Login Here");
        jLabelLoginLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelUserName.setText("User Name");

        jButtonLogin.setText("Login Now");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelPswd.setText("Password");

        javax.swing.GroupLayout jInternalFrameLoginLayout = new javax.swing.GroupLayout(jInternalFrameLogin.getContentPane());
        jInternalFrameLogin.getContentPane().setLayout(jInternalFrameLoginLayout);
        jInternalFrameLoginLayout.setHorizontalGroup(
            jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogin)
                    .addGroup(jInternalFrameLoginLayout.createSequentialGroup()
                        .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUserName)
                            .addComponent(jLabelPswd))
                        .addGap(40, 40, 40)
                        .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUserName)
                            .addComponent(jPasswordFieldPswd, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLoginLbl)
                .addGap(1895, 1895, 1895))
        );
        jInternalFrameLoginLayout.setVerticalGroup(
            jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLoginLbl)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserName)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameLoginLayout.createSequentialGroup()
                        .addComponent(jLabelPswd)
                        .addGap(22, 22, 22)
                        .addComponent(jButtonLogin))
                    .addComponent(jPasswordFieldPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jInternalFrameUserInfo.setClosable(true);
        jInternalFrameUserInfo.setAlignmentX(0.0F);
        jInternalFrameUserInfo.setAlignmentY(0.0F);
        jInternalFrameUserInfo.setMinimumSize(new java.awt.Dimension(480, 2227));

        jLabelUserInfo.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabelUserInfo.setText("User Information");

        jLabelBorrowerId.setText("Borrower ID");

        jButtonFindBorrower.setText("Find Borrower");
        jButtonFindBorrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindBorrowerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameUserInfoLayout = new javax.swing.GroupLayout(jInternalFrameUserInfo.getContentPane());
        jInternalFrameUserInfo.getContentPane().setLayout(jInternalFrameUserInfoLayout);
        jInternalFrameUserInfoLayout.setHorizontalGroup(
            jInternalFrameUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameUserInfoLayout.createSequentialGroup()
                        .addComponent(jLabelBorrowerId)
                        .addGap(42, 42, 42)
                        .addComponent(jTextFieldBorrowerId, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelUserInfo)
                    .addComponent(jButtonFindBorrower))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jInternalFrameUserInfoLayout.setVerticalGroup(
            jInternalFrameUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUserInfo)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBorrowerId)
                    .addComponent(jTextFieldBorrowerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonFindBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jInternalFrameBookOwed.setClosable(true);

        jLabelBkBr.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabelBkBr.setText("Book Borrowed");

        jLabelBkOwedTo.setText("Following Books are Owed to:");

        jLabelBorrId.setFont(new java.awt.Font("Arial", 1, 12));
        jLabelBorrId.setText("Borrower ID");

        jLabelBorrName.setFont(new java.awt.Font("Arial", 1, 12));
        jLabelBorrName.setText("Borrower Name");

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelBorrId1.setText("Borrower ID:");

        jLabelBorrName1.setText("Borrower Name:");

        jLabelBorrName2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabelBorrName2.setText("Books Owed");

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jListBooks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListBooks);

        javax.swing.GroupLayout jInternalFrameBookOwedLayout = new javax.swing.GroupLayout(jInternalFrameBookOwed.getContentPane());
        jInternalFrameBookOwed.getContentPane().setLayout(jInternalFrameBookOwedLayout);
        jInternalFrameBookOwedLayout.setHorizontalGroup(
            jInternalFrameBookOwedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBookOwedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameBookOwedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameBookOwedLayout.createSequentialGroup()
                        .addGroup(jInternalFrameBookOwedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBkOwedTo)
                            .addGroup(jInternalFrameBookOwedLayout.createSequentialGroup()
                                .addGroup(jInternalFrameBookOwedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBorrId1)
                                    .addComponent(jLabelBorrName1))
                                .addGroup(jInternalFrameBookOwedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrameBookOwedLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabelBorrId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrameBookOwedLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelBorrName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(280, Short.MAX_VALUE))
                    .addGroup(jInternalFrameBookOwedLayout.createSequentialGroup()
                        .addComponent(jLabelBorrName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(408, 408, 408))
                    .addGroup(jInternalFrameBookOwedLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jInternalFrameBookOwedLayout.createSequentialGroup()
                        .addComponent(jButtonSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExit)
                        .addContainerGap(354, Short.MAX_VALUE))
                    .addGroup(jInternalFrameBookOwedLayout.createSequentialGroup()
                        .addComponent(jLabelBkBr)
                        .addContainerGap(359, Short.MAX_VALUE))))
        );
        jInternalFrameBookOwedLayout.setVerticalGroup(
            jInternalFrameBookOwedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBookOwedLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelBkBr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelBkOwedTo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameBookOwedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBorrId1)
                    .addComponent(jLabelBorrId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameBookOwedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBorrName1)
                    .addComponent(jLabelBorrName))
                .addGap(28, 28, 28)
                .addComponent(jLabelBorrName2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameBookOwedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubmit)
                    .addComponent(jButtonExit))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jInternalFrameFineInfo.setMinimumSize(new java.awt.Dimension(200, 200));

        jLabelFineInfo.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabelFineInfo.setText("Fine Information");

        jLabelBorrower.setText("The fine amount is:");

        jLabelAmount.setText("£");

        jButtonPaid.setText("Paid");
        jButtonPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaidActionPerformed(evt);
            }
        });

        jButtonNotPaid.setText("Not Paid");
        jButtonNotPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotPaidActionPerformed(evt);
            }
        });

        jLabelFine.setText("amount");

        javax.swing.GroupLayout jInternalFrameFineInfoLayout = new javax.swing.GroupLayout(jInternalFrameFineInfo.getContentPane());
        jInternalFrameFineInfo.getContentPane().setLayout(jInternalFrameFineInfoLayout);
        jInternalFrameFineInfoLayout.setHorizontalGroup(
            jInternalFrameFineInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameFineInfoLayout.createSequentialGroup()
                .addGroup(jInternalFrameFineInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameFineInfoLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabelFineInfo))
                    .addGroup(jInternalFrameFineInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBorrower))
                    .addGroup(jInternalFrameFineInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelFine)))
                .addContainerGap())
            .addGroup(jInternalFrameFineInfoLayout.createSequentialGroup()
                .addComponent(jButtonPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNotPaid)
                .addGap(354, 354, 354))
        );
        jInternalFrameFineInfoLayout.setVerticalGroup(
            jInternalFrameFineInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameFineInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFineInfo)
                .addGap(11, 11, 11)
                .addComponent(jLabelBorrower)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameFineInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAmount)
                    .addComponent(jLabelFine))
                .addGap(36, 36, 36)
                .addGroup(jInternalFrameFineInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPaid)
                    .addComponent(jButtonNotPaid))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jInternalFrameDlgBox.setPreferredSize(new java.awt.Dimension(500, 465));

        javax.swing.GroupLayout jInternalFrameDlgBoxLayout = new javax.swing.GroupLayout(jInternalFrameDlgBox.getContentPane());
        jInternalFrameDlgBox.getContentPane().setLayout(jInternalFrameDlgBoxLayout);
        jInternalFrameDlgBoxLayout.setHorizontalGroup(
            jInternalFrameDlgBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameDlgBoxLayout.createSequentialGroup()
                .addComponent(jOptionPaneInvalidUser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jOptionPaneExit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jInternalFrameDlgBoxLayout.setVerticalGroup(
            jInternalFrameDlgBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameDlgBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameDlgBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jOptionPaneExit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOptionPaneInvalidUser, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jMenuFile.setText("Account");

        jMenuItemLogin.setText("Login");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemLogin);

        jMenuItemLogout.setText("Logout");
        jMenuItemLogout.setBorder(null);
        jMenuItemLogout.setEnabled(false);
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemLogout);
        jMenuFile.add(jSeparatorAcnt);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemExit);

        jMenuBar1.add(jMenuFile);

        jMenuLib.setText("Library");

        jMenuItemBookReturn.setText("Book Return");
        jMenuItemBookReturn.setEnabled(false);
        jMenuItemBookReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBookReturnActionPerformed(evt);
            }
        });
        jMenuLib.add(jMenuItemBookReturn);

        jMenuBar1.add(jMenuLib);

        jMenuHelp.setText("Help");

        jMenuItemAbout.setText("About");
        jMenuHelp.add(jMenuItemAbout);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(526, 526, 526)
                .addComponent(jInternalFrameDlgBox, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrameUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(jInternalFrameBookOwed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrameFineInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrameLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jInternalFrameLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrameBookOwed)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jInternalFrameUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, Short.MAX_VALUE)
                        .addGap(382, 382, 382))))
            .addComponent(jInternalFrameFineInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrameDlgBox, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(443, Short.MAX_VALUE))
        );

        try {
            jInternalFrameFineInfo.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        try {
            jInternalFrameDlgBox.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
        // When librarian clicks on Login Menu Item, display login screen
        jInternalFrameLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // When librarian clicks on login button
        // Get the user name and password information
        String user = jTextFieldUserName.getText();
        String pswd = jPasswordFieldPswd.getText();

        Account myAccount = new Account();
        boolean isValid = myAccount.checkUser(user, pswd);
        
        if (isValid) {
            jInternalFrameLogin.dispose();
            jInternalFrameUserInfo.setVisible(true);
            jMenuItemLogout.setEnabled(true);
            jMenuItemBookReturn.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(jInternalFrameLogin,"User Does Not Exist. Please Verify User Name and Password.");
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        // On  logout clicking show the user login screen
        jButtonLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    /**
     * @param evt
     * The method exit the library system based on user confirmation
     */
    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        int optionSel;
        optionSel = JOptionPane.showConfirmDialog(jInternalFrameLogin, "Are you sure to exit?", "Confirm Exit", 0);

        switch (optionSel) {
            case 0:
                System.exit(0);
                break;
            case 1:
                break;
        }
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    /**
     * @param evt
     * check in database whether user id exist, if yes display a window with user id and name along with any books owed to him
     * else display an error dialog box.please re-enter burrower id
     */
    private void jButtonFindBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindBorrowerActionPerformed

        String userId = jTextFieldBorrowerId.getText();
        int usrId = Integer.parseInt(userId);
        Borrower bor =  new Borrower();
        String borName = bor.getBorrowerName(usrId);

        
        jInternalFrameUserInfo.dispose();
        BorrowerBook bBk = new BorrowerBook();
        String[] str = bBk.getBookList(usrId);

        jListBooks.setListData(str);
        jInternalFrameBookOwed.setVisible(true);

        jLabelBorrId.setText(userId);
        jLabelBorrName.setText(borName);
}//GEN-LAST:event_jButtonFindBorrowerActionPerformed

    /**
     * @param evt
     * exit the system from book owed screen and display the fine information window
     */
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        jInternalFrameBookOwed.dispose();
        jInternalFrameFineInfo.setVisible(true);
        
        String brId = jTextFieldBorrowerId.getText();
        int brIdInt = Integer.parseInt(brId);

        Fine fineObj = new Fine();
        double fine = fineObj.getFineAmount(brIdInt);
        System.out.println(fine);
        String fineStr = Double.toString(fine);
            jLabelFine.setText(fineStr);
    }//GEN-LAST:event_jButtonExitActionPerformed

    /**
     * @param evt
     * Return a book owed to a borrower.
     */
    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        jInternalFrameUserInfo.dispose();

        Object objVal = jListBooks.getSelectedValue();
        String bookTitle = objVal.toString();

        String userId = jTextFieldBorrowerId.getText();
        int usrId = Integer.parseInt(userId);
        
        BorrowerBook bBk = new BorrowerBook();
        String bookIsbn = bBk.getBookIsbn(bookTitle);
    
        bBk.removeItem(bookIsbn);

        String[] str = bBk.getBookList(usrId);

        jListBooks.setListData(str);
        jInternalFrameBookOwed.setVisible(true);
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    /**
     * @param evt
     * The method makes the librain login screen appear when librarian click on Book Return menu item.
     */
    private void jMenuItemBookReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBookReturnActionPerformed
       jInternalFrameLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItemBookReturnActionPerformed

    /**
     * @param evt
     * Simply exit the system. This method must be implemented for a full library system
     */
    private void jButtonPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaidActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonPaidActionPerformed

    /**
     * @param evt
     * Simply exit the system. This method must be implemented for a full library system
     */
    private void jButtonNotPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotPaidActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonNotPaidActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonFindBorrower;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonNotPaid;
    private javax.swing.JButton jButtonPaid;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JInternalFrame jInternalFrameBookOwed;
    private javax.swing.JInternalFrame jInternalFrameDlgBox;
    private javax.swing.JInternalFrame jInternalFrameFineInfo;
    private javax.swing.JInternalFrame jInternalFrameLogin;
    private javax.swing.JInternalFrame jInternalFrameUserInfo;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelBkBr;
    private javax.swing.JLabel jLabelBkOwedTo;
    private javax.swing.JLabel jLabelBorrId;
    private javax.swing.JLabel jLabelBorrId1;
    private javax.swing.JLabel jLabelBorrName;
    private javax.swing.JLabel jLabelBorrName1;
    private javax.swing.JLabel jLabelBorrName2;
    private javax.swing.JLabel jLabelBorrower;
    private javax.swing.JLabel jLabelBorrowerId;
    private javax.swing.JLabel jLabelFine;
    private javax.swing.JLabel jLabelFineInfo;
    private javax.swing.JLabel jLabelLoginLbl;
    private javax.swing.JLabel jLabelPswd;
    private javax.swing.JLabel jLabelUserInfo;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JList jListBooks;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemBookReturn;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenu jMenuLib;
    private javax.swing.JOptionPane jOptionPaneExit;
    private javax.swing.JOptionPane jOptionPaneInvalidUser;
    private javax.swing.JPasswordField jPasswordFieldPswd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorAcnt;
    private javax.swing.JTextField jTextFieldBorrowerId;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables

}
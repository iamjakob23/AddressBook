package addressbookdriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddressBookApp extends javax.swing.JFrame {
    //Temp object used to move data to the first of list
    Object[][] temp2;
    //Absolute path for file storage
    final String PATH = "C:\\Users\\TMF\\Desktop\\gui\\";
    //File extension during testing
    final String TYPE = ".txt";
    //Used to store user inputs into contacts list
    Object[][] data = new Object[1][8];
    //Used to label table for contacts list
    String[] columnName = new String[]{"First Name", "Last Name", "Number",
        "Email", "Address", "City", "State", "Zip"};
    //Needed global object for adding user input
    Object[][] temp = null;

    public AddressBookApp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        contactListPanel = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        deleteContactButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fullContactTable = new javax.swing.JTable();
        editContactButton = new javax.swing.JButton();
        showContactButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addContactButton = new javax.swing.JButton();
        addedFName = new javax.swing.JLabel();
        addedNum = new javax.swing.JLabel();
        addFName = new javax.swing.JTextField();
        addNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addedTag = new javax.swing.JLabel();
        addedEmail = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addEmail = new javax.swing.JTextField();
        addedAddress = new javax.swing.JLabel();
        addedState = new javax.swing.JLabel();
        addedCity = new javax.swing.JLabel();
        addedZip = new javax.swing.JLabel();
        addAddress = new javax.swing.JTextField();
        addCity = new javax.swing.JTextField();
        addState = new javax.swing.JTextField();
        addLName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addZip = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        addedLName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchContactButton = new javax.swing.JButton();
        searchName = new javax.swing.JTextField();
        foundFName = new javax.swing.JLabel();
        foundNum = new javax.swing.JLabel();
        foundEmail = new javax.swing.JLabel();
        foundAddress = new javax.swing.JLabel();
        foundCity = new javax.swing.JLabel();
        foundState = new javax.swing.JLabel();
        foundZip = new javax.swing.JLabel();
        searchTable = new javax.swing.JScrollPane();
        searchTableList = new javax.swing.JTable();
        foundLName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openContactListFile = new javax.swing.JMenuItem();
        saveContactListFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To Your Contacts List");
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Welcome to your contacts list");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 30));

        contactListPanel.setBackground(new java.awt.Color(102, 255, 255));

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));

        deleteContactButton.setText("Delete Contact");
        deleteContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteContactButtonActionPerformed(evt);
            }
        });

        fullContactTable.setBackground(new java.awt.Color(102, 255, 255));
        fullContactTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Number", "Email", "Address", "City", "State", "Zip"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fullContactTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        fullContactTable.setOpaque(false);
        fullContactTable.getTableHeader().setResizingAllowed(false);
        fullContactTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(fullContactTable);

        editContactButton.setText("Edit Contact");
        editContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editContactButtonActionPerformed(evt);
            }
        });

        showContactButton.setText("Show Contact");
        showContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showContactButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Select user you wish to take action with");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(showContactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editContactButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteContactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(112, 112, 112))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteContactButton)
                    .addComponent(editContactButton)
                    .addComponent(showContactButton))
                .addGap(36, 36, 36))
        );

        contactListPanel.addTab("View Contacts", jPanel4);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addContactButton.setText("Add Contact");
        addContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addContactButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addContactButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 110, 30));

        addedFName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(addedFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 480, 30));

        addedNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(addedNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 480, 30));
        jPanel1.add(addFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 310, 30));
        jPanel1.add(addNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 310, 30));

        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        addedTag.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(addedTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 70, 30));

        addedEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(addedEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 480, 30));

        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel1.add(addEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 310, 30));

        addedAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(addedAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 490, 30));

        addedState.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(addedState, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 490, 30));

        addedCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(addedCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 480, 30));

        addedZip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(addedZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 490, 30));
        jPanel1.add(addAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 310, 30));
        jPanel1.add(addCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 310, 30));

        addState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStateActionPerformed(evt);
            }
        });
        jPanel1.add(addState, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 310, 30));
        jPanel1.add(addLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 310, 30));

        jLabel7.setText("Last Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel9.setText("City");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel10.setText("State");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
        jPanel1.add(addZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 310, 30));

        jLabel11.setText("Zip");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        addedLName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(addedLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 480, 30));

        contactListPanel.addTab("Add Contact", jPanel1);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 30));

        searchContactButton.setText("Search");
        searchContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchContactButtonActionPerformed(evt);
            }
        });
        jPanel3.add(searchContactButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, 30));
        jPanel3.add(searchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 260, 30));

        foundFName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(foundFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 390, 30));

        foundNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(foundNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 390, 30));

        foundEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(foundEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 390, 30));

        foundAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(foundAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 390, 30));

        foundCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(foundCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 390, 30));

        foundState.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(foundState, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 390, 30));

        foundZip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(foundZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 390, 30));

        searchTableList.setBackground(new java.awt.Color(102, 255, 255));
        searchTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchTableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableListMouseClicked(evt);
            }
        });
        searchTable.setViewportView(searchTableList);

        jPanel3.add(searchTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 350, 400));

        foundLName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(foundLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 390, 20));

        contactListPanel.addTab("Search Contacts", jPanel3);

        jPanel2.add(contactListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1010, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 540));

        jMenu1.setText("File");

        openContactListFile.setText("Open");
        openContactListFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openContactListFileActionPerformed(evt);
            }
        });
        jMenu1.add(openContactListFile);

        saveContactListFile.setText("Save");
        saveContactListFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveContactListFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveContactListFile);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addContactButtonActionPerformed
        //Adding user entry to contacts list
        //Setting up the table displayed
        fullContactTable.setModel(new DefaultTableModel(data, columnName));

        //Copies existing data into temp object
        temp = new Object[data.length + 1][8];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < 8; j++) {
                temp[i][j] = data[i][j];
            }
        }

        //Loads user input into last spot of array
        temp[data.length][0] = addFName.getText().toUpperCase();
        temp[data.length][1] = addLName.getText().toUpperCase();
        temp[data.length][2] = addNum.getText().toUpperCase();
        temp[data.length][3] = addEmail.getText().toUpperCase();
        temp[data.length][4] = addAddress.getText().toUpperCase();
        temp[data.length][5] = addCity.getText().toUpperCase();
        temp[data.length][6] = addState.getText().toUpperCase();
        temp[data.length][7] = addZip.getText().toUpperCase();

        //Displays input back to user
        addedFName.setText(addFName.getText().toUpperCase());
        addedLName.setText(addLName.getText().toUpperCase());
        addedNum.setText(addNum.getText().toUpperCase());
        addedEmail.setText(addEmail.getText().toUpperCase());
        addedAddress.setText(addAddress.getText().toUpperCase());
        addedCity.setText(addCity.getText().toUpperCase());
        addedState.setText(addState.getText().toUpperCase());
        addedZip.setText(addZip.getText().toUpperCase());

        //Copies temp object to data object
        data = temp;

        //ReSets table with new data
        fullContactTable.setModel(new DefaultTableModel(data, columnName));

        //Clears input form after input
        addFName.setText(null);
        addLName.setText(null);
        addNum.setText(null);
        addEmail.setText(null);
        addAddress.setText(null);
        addCity.setText(null);
        addState.setText(null);
        addZip.setText(null);

        //Confirmation to user that input was added to the list
        addedTag.setText("Added");
    }//GEN-LAST:event_addContactButtonActionPerformed

    private void searchContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchContactButtonActionPerformed
        //Temp object used to move data to the first of list
        Object[][] temp1;
        //Searching user entry to list
        //Place holders for contact specifics
        int x = 0;
        String[] columns = new String[]{"Name Last", "Last Name"};
        String holderFName = "";
        String holderLName = "";
        String holderNum = "";
        String holderEmail = "";
        String holderAddress = "";
        String holderCity = "";
        String holderState = "";
        String holderZip = "";
        temp = new Object[data.length][8];
        Object[][] tableHolder = new Object[temp.length][8];

        //If user requests name not in contacts list
        foundFName.setText("Did not find person in contacts...");
        foundLName.setText(null);
        foundNum.setText(null);
        foundEmail.setText(null);
        foundCity.setText(null);
        foundState.setText(null);
        foundAddress.setText(null);
        foundZip.setText(null);

        //Sets table data
        searchTableList.setModel(new DefaultTableModel(tableHolder, columns));

        //Loads data into place holders.
        for (int i = 0; i < data.length; i++) {
            holderFName = data[i][0].toString().toUpperCase();
            holderLName = data[i][1].toString().toUpperCase();
            holderNum = data[i][2].toString().toUpperCase();
            holderEmail = data[i][3].toString().toUpperCase();
            holderAddress = data[i][4].toString().toUpperCase();
            holderCity = data[i][5].toString().toUpperCase();
            holderState = data[i][6].toString().toUpperCase();
            holderZip = data[i][7].toString().toUpperCase();

            //Testing loading placement
            temp[x][0] = "";
            temp[x][1] = "";

            //Compares to varify searched name is in list
            if (searchName.getText().toUpperCase().equals(holderFName.toUpperCase())
                    || searchName.getText().toUpperCase().equals(holderLName.toUpperCase())) {
                foundFName.setText(holderFName.toUpperCase());
                foundLName.setText(holderLName.toUpperCase());
                foundNum.setText(holderNum);
                foundEmail.setText(holderEmail);
                foundAddress.setText(holderAddress);
                foundCity.setText(holderCity);
                foundState.setText(holderState);
                foundZip.setText(holderZip);

                //Sets founds items in temp array for display in search table
                temp[x][0] = data[i][0];
                temp[x][1] = data[i][1];
                temp[x][2] = data[i][2];
                temp[x][3] = data[i][3];
                temp[x][4] = data[i][4];
                temp[x][5] = data[i][5];
                temp[x][6] = data[i][6];
                temp[x][7] = data[i][7];
            }
            x++;
        }
        x = 0;

        //Setting size of temp1
        temp1 = temp;

        //Setting data to "" for markers
        for (int i = 0; i < data.length; i++) {
            temp1[i][0] = "";
            temp1[i][1] = "";
            temp1[i][2] = "";
            temp1[i][3] = "";
            temp1[i][4] = "";
            temp1[i][5] = "";
            temp1[i][6] = "";
            temp1[i][7] = "";
        }

        //Finding seached name and moving to front of list
        for (int i = 0; i < temp.length; i++) {
            if (searchName.getText().toUpperCase().equals(data[i][0].toString().toUpperCase())) {
                temp1[x][0] = data[i][0];
                temp1[x][1] = data[i][1];
                temp1[x][2] = data[i][2];
                temp1[x][3] = data[i][3];
                temp1[x][4] = data[i][4];
                temp1[x][5] = data[i][5];
                temp1[x][6] = data[i][6];
                temp1[x][7] = data[i][7];
                x++;
            }
        }

        //Used for testing
        temp2 = temp1;
        tableHolder = temp1;

        //Sets table data
        searchTableList.setModel(new DefaultTableModel(tableHolder, columns));

        //Clears search box
        searchName.setText(null);

        //Resets temp
        temp = data;
    }//GEN-LAST:event_searchContactButtonActionPerformed

    private void showContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showContactButtonActionPerformed
        //Show selected contacts info
        int showPos = fullContactTable.getSelectedRow();
        JOptionPane.showMessageDialog(null, "THE SELECTED CONTACTS INFO\n"
                + data[showPos][0] + " " + data[showPos][1] + "\n"
                + data[showPos][2] + "\n" + data[showPos][3] + "\n" + data[showPos][4] + "\n"
                + data[showPos][5] + "\n" + data[showPos][6] + "\n" + data[showPos][7]);
    }//GEN-LAST:event_showContactButtonActionPerformed

    private void editContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editContactButtonActionPerformed
        // Editing an existing entry
        // Getting Positon of user selected row
        int editPos = fullContactTable.getSelectedRow();
        data[editPos][0] = JOptionPane.showInputDialog("Change First Name?", ""
                + data[editPos][0]).toUpperCase();
        data[editPos][1] = JOptionPane.showInputDialog("Change Last Name?", ""
                + data[editPos][1]).toUpperCase();
        data[editPos][2] = JOptionPane.showInputDialog("Change Number?", ""
                + data[editPos][2]).toUpperCase();
        data[editPos][3] = JOptionPane.showInputDialog("Change Email?", ""
                + data[editPos][3]).toUpperCase();
        data[editPos][4] = JOptionPane.showInputDialog("Change Address?", ""
                + data[editPos][4]).toUpperCase();
        data[editPos][5] = JOptionPane.showInputDialog("Change City?", ""
                + data[editPos][5]).toUpperCase();
        data[editPos][6] = JOptionPane.showInputDialog("Change State?", ""
                + data[editPos][6]).toUpperCase();
        data[editPos][7] = JOptionPane.showInputDialog("Change Zip?", ""
                + data[editPos][7]).toUpperCase();
        // ReSetting data
        fullContactTable.setModel(new DefaultTableModel(data, columnName));
    }//GEN-LAST:event_editContactButtonActionPerformed

    private void deleteContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteContactButtonActionPerformed
        //Removing an existing entry
        //Getting position of user selected row
        int removePos = fullContactTable.getSelectedRow();
        //Temp object used to move data in list...Deleting user selected
        Object[][] temp = new Object[data.length - 1][8];
        //Copies data to temp
        for (int i = 0; i < removePos; i++) {
            temp[i][0] = data[i][0];
            temp[i][1] = data[i][1];
            temp[i][2] = data[i][2];
            temp[i][3] = data[i][3];
            temp[i][4] = data[i][4];
            temp[i][5] = data[i][5];
            temp[i][6] = data[i][6];
            temp[i][7] = data[i][7];
        }
        //Moving user selected out of list
        for (int i = removePos + 1; i < data.length; i++) {
            temp[i - 1][0] = data[i][0];
            temp[i - 1][1] = data[i][1];
            temp[i - 1][2] = data[i][2];
            temp[i - 1][3] = data[i][3];
            temp[i - 1][4] = data[i][4];
            temp[i - 1][5] = data[i][5];
            temp[i - 1][6] = data[i][6];
            temp[i - 1][7] = data[i][7];
        }
        //Copies removed object back to data
        data = temp;
        //ReSets table
        fullContactTable.setModel(new DefaultTableModel(data, columnName));
    }//GEN-LAST:event_deleteContactButtonActionPerformed

    private void saveContactListFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveContactListFileActionPerformed
        //Saving data object to file
        try {
            String[] name = new String[data.length];
            BufferedWriter bw = new BufferedWriter(new FileWriter(PATH + "dataFName" + TYPE));
            for (int i = 0; i < data.length; i++) {
                name[i] = data[i][0].toString();
                bw.write(name[i] + ", ");
            }
            bw.close();
            bw = new BufferedWriter(new FileWriter(PATH + "dataLNumber" + TYPE));
            for (int i = 0; i < data.length; i++) {
                name[i] = data[i][1].toString();
                bw.write(name[i] + ", ");
            }
            bw.close();
            bw = new BufferedWriter(new FileWriter(PATH + "dataNum" + TYPE));
            for (int i = 0; i < data.length; i++) {
                name[i] = data[i][2].toString();
                bw.write(name[i] + ", ");
            }
            bw.close();
            bw = new BufferedWriter(new FileWriter(PATH + "dataEmail" + TYPE));
            for (int i = 0; i < data.length; i++) {
                name[i] = data[i][3].toString();
                bw.write(name[i] + ", ");
            }
            bw.close();
            bw = new BufferedWriter(new FileWriter(PATH + "dataAddress" + TYPE));
            for (int i = 0; i < data.length; i++) {
                name[i] = data[i][4].toString();
                bw.write(name[i] + ", ");
            }
            bw.close();
            bw = new BufferedWriter(new FileWriter(PATH + "dataCity" + TYPE));
            for (int i = 0; i < data.length; i++) {
                name[i] = data[i][5].toString();
                bw.write(name[i] + ", ");
            }
            bw.close();
            bw = new BufferedWriter(new FileWriter(PATH + "dataState" + TYPE));
            for (int i = 0; i < data.length; i++) {
                name[i] = data[i][6].toString();
                bw.write(name[i] + ", ");
            }
            bw.close();
            bw = new BufferedWriter(new FileWriter(PATH + "dataZip" + TYPE));
            for (int i = 0; i < data.length; i++) {
                name[i] = data[i][7].toString();
                bw.write(name[i] + ", ");
            }
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(AddressBookDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveContactListFileActionPerformed

    private void openContactListFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openContactListFileActionPerformed
        //Opening data object from file
        fullContactTable.setModel(new DefaultTableModel(data, columnName));
        int x = 0;
        String fileName = "dataFName";
        try {
            File br = new File(PATH + fileName + TYPE);
            Scanner fileScan = new Scanner(br).useDelimiter(", ");
            while (fileScan.hasNext()) {
                fileScan.next();
                x++;
                System.out.println(x);
            }
            fileScan.reset();
            temp = new Object[x][8];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < 8; j++) {
                    temp[i][j] = temp[i][j];
                }
            }
            x = 0;
            fileScan = new Scanner(br).useDelimiter(", ");
            while (fileScan.hasNext()) {
                temp[x][0] = fileScan.next().toString();
                System.out.println(temp[x][0]);
                x++;
            }
            x = 0;
            fileScan.reset();
            File br1 = new File(PATH + "dataLNumber" + TYPE);
            fileScan = new Scanner(br1).useDelimiter(", ");
            while (fileScan.hasNext()) {
                temp[x][1] = fileScan.next().toString();
                System.out.println(temp[x][1]);
                x++;
            }
            x = 0;
            fileScan.reset();
            File br2 = new File(PATH + "dataNum" + TYPE);
            fileScan = new Scanner(br2).useDelimiter(", ");
            while (fileScan.hasNext()) {
                temp[x][2] = fileScan.next().toString();
                System.out.println(temp[x][2]);
                x++;
            }
            x = 0;
            fileScan.reset();
            File br3 = new File(PATH + "dataEmail" + TYPE);
            fileScan = new Scanner(br3).useDelimiter(", ");
            while (fileScan.hasNext()) {
                temp[x][3] = fileScan.next().toString();
                System.out.println(temp[x][3]);
                x++;
            }
            x = 0;
            fileScan.reset();
            File br4 = new File(PATH + "dataAddress" + TYPE);
            fileScan = new Scanner(br1).useDelimiter(", ");
            while (fileScan.hasNext()) {
                temp[x][4] = fileScan.next().toString();
                System.out.println(temp[x][4]);
                x++;
            }
            x = 0;
            fileScan.reset();
            File br5 = new File(PATH + "dataCity" + TYPE);
            fileScan = new Scanner(br5).useDelimiter(", ");
            while (fileScan.hasNext()) {
                temp[x][5] = fileScan.next().toString();
                System.out.println(temp[x][5]);
                x++;
            }
            x = 0;
            fileScan.reset();
            File br6 = new File(PATH + "dataState" + TYPE);
            fileScan = new Scanner(br6).useDelimiter(", ");
            while (fileScan.hasNext()) {
                temp[x][6] = fileScan.next().toString();
                System.out.println(temp[x][6]);
                x++;
            }
            x = 0;
            fileScan.reset();
            File br7 = new File(PATH + "dataZip" + TYPE);
            fileScan = new Scanner(br7).useDelimiter(", ");
            while (fileScan.hasNext()) {
                temp[x][7] = fileScan.next().toString();
                System.out.println(temp[x][7]);
                x++;
            }
            x = 0;

            data = temp;
            fullContactTable.setModel(new DefaultTableModel(data, columnName));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddressBookDriver.class.getName()).log(Level.SEVERE, PATH + "dataFName" + TYPE, ex);
        }
    }//GEN-LAST:event_openContactListFileActionPerformed

    private void addStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addStateActionPerformed

    private void searchTableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableListMouseClicked
        int editPos = searchTableList.getSelectedRow();
        //Compares to varify searched name is in list
        foundFName.setText(temp2[editPos][0].toString().toUpperCase());
        foundLName.setText(temp2[editPos][1].toString().toUpperCase());
        foundNum.setText(temp2[editPos][2].toString().toUpperCase());
        foundEmail.setText(temp2[editPos][3].toString().toUpperCase());
        foundAddress.setText(temp2[editPos][4].toString().toUpperCase());
        foundCity.setText(temp2[editPos][5].toString().toUpperCase());
        foundState.setText(temp2[editPos][6].toString().toUpperCase());
        foundZip.setText(temp2[editPos][7].toString().toUpperCase());

    }//GEN-LAST:event_searchTableListMouseClicked

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
            java.util.logging.Logger.getLogger(AddressBookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressBookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressBookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressBookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddressBookApp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addAddress;
    private javax.swing.JTextField addCity;
    private javax.swing.JButton addContactButton;
    private javax.swing.JTextField addEmail;
    private javax.swing.JTextField addFName;
    private javax.swing.JTextField addLName;
    private javax.swing.JTextField addNum;
    private javax.swing.JTextField addState;
    private javax.swing.JTextField addZip;
    private javax.swing.JLabel addedAddress;
    private javax.swing.JLabel addedCity;
    private javax.swing.JLabel addedEmail;
    private javax.swing.JLabel addedFName;
    private javax.swing.JLabel addedLName;
    private javax.swing.JLabel addedNum;
    private javax.swing.JLabel addedState;
    private javax.swing.JLabel addedTag;
    private javax.swing.JLabel addedZip;
    private javax.swing.JTabbedPane contactListPanel;
    private javax.swing.JButton deleteContactButton;
    private javax.swing.JButton editContactButton;
    private javax.swing.JLabel foundAddress;
    private javax.swing.JLabel foundCity;
    private javax.swing.JLabel foundEmail;
    private javax.swing.JLabel foundFName;
    private javax.swing.JLabel foundLName;
    private javax.swing.JLabel foundNum;
    private javax.swing.JLabel foundState;
    private javax.swing.JLabel foundZip;
    private javax.swing.JTable fullContactTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem openContactListFile;
    private javax.swing.JMenuItem saveContactListFile;
    private javax.swing.JButton searchContactButton;
    private javax.swing.JTextField searchName;
    private javax.swing.JScrollPane searchTable;
    private javax.swing.JTable searchTableList;
    private javax.swing.JButton showContactButton;
    // End of variables declaration//GEN-END:variables
}

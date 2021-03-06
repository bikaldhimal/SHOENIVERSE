
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class AddShoe extends javax.swing.JFrame {

    /**
     * Creates new form addShoe
     */
    public AddShoe() {
        initComponents();
    }
    
    public AddShoe(ArrayList<Shoes> shoeList) {
        this.shoeList = shoeList;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        sizeComboBox = new javax.swing.JComboBox<>();
        colorBlack = new javax.swing.JCheckBox();
        colorRed = new javax.swing.JCheckBox();
        colorWhite = new javax.swing.JCheckBox();
        sexMale = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        sexFemale = new javax.swing.JRadioButton();
        modelPrice = new javax.swing.JTextField();
        sexUnisex = new javax.swing.JRadioButton();
        importButton = new javax.swing.JButton();
        addHomeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        brandTextField = new javax.swing.JTextField();
        modelTextField = new javax.swing.JTextField();
        backHomeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        modelQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addTable = new javax.swing.JTable();
        updateButton1 = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shoeniverse");
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(164, 196, 181));
        jPanel5.setMinimumSize(new java.awt.Dimension(1100, 720));
        jPanel5.setPreferredSize(new java.awt.Dimension(1100, 800));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sizeComboBox.setBackground(new java.awt.Color(245, 245, 245));
        sizeComboBox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        sizeComboBox.setForeground(new java.awt.Color(51, 51, 51));
        sizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "35", "36", "37", "38", "39", "40", "41" }));
        sizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeComboBoxActionPerformed(evt);
            }
        });
        jPanel5.add(sizeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, 40));

        colorBlack.setBackground(new java.awt.Color(164, 196, 181));
        buttonGroup2.add(colorBlack);
        colorBlack.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        colorBlack.setForeground(new java.awt.Color(51, 51, 51));
        colorBlack.setText("Black");
        colorBlack.setFocusable(false);
        colorBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBlackActionPerformed(evt);
            }
        });
        jPanel5.add(colorBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, 40));

        colorRed.setBackground(new java.awt.Color(164, 196, 181));
        buttonGroup2.add(colorRed);
        colorRed.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        colorRed.setForeground(new java.awt.Color(51, 51, 51));
        colorRed.setText("Red");
        colorRed.setFocusable(false);
        jPanel5.add(colorRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, 40));

        colorWhite.setBackground(new java.awt.Color(164, 196, 181));
        buttonGroup2.add(colorWhite);
        colorWhite.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        colorWhite.setForeground(new java.awt.Color(51, 51, 51));
        colorWhite.setText("White");
        colorWhite.setFocusable(false);
        jPanel5.add(colorWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, 40));

        sexMale.setBackground(new java.awt.Color(164, 196, 181));
        buttonGroup1.add(sexMale);
        sexMale.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        sexMale.setForeground(new java.awt.Color(51, 51, 51));
        sexMale.setText("Male");
        sexMale.setFocusable(false);
        jPanel5.add(sexMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, 40));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Brand:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        sexFemale.setBackground(new java.awt.Color(164, 196, 181));
        buttonGroup1.add(sexFemale);
        sexFemale.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        sexFemale.setForeground(new java.awt.Color(51, 51, 51));
        sexFemale.setText("Female");
        sexFemale.setFocusable(false);
        jPanel5.add(sexFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, 40));

        modelPrice.setBackground(new java.awt.Color(245, 245, 245));
        modelPrice.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        modelPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                modelPriceFocusLost(evt);
            }
        });
        modelPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelPriceActionPerformed(evt);
            }
        });
        jPanel5.add(modelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 230, 40));

        sexUnisex.setBackground(new java.awt.Color(164, 196, 181));
        buttonGroup1.add(sexUnisex);
        sexUnisex.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        sexUnisex.setForeground(new java.awt.Color(51, 51, 51));
        sexUnisex.setText("Unisex");
        sexUnisex.setFocusable(false);
        jPanel5.add(sexUnisex, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, 40));

        importButton.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        importButton.setForeground(new java.awt.Color(164, 196, 181));
        importButton.setText("IMPORT");
        importButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importButton.setFocusable(false);
        jPanel5.add(importButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 120, 40));

        addHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        addHomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addHomeButton.setFocusable(false);
        addHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHomeButtonActionPerformed(evt);
            }
        });
        jPanel5.add(addHomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 50));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Model:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Size:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 20));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Color:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 20));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Sex:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 20));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Quantity:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, 20));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Price:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, 20));

        brandTextField.setBackground(new java.awt.Color(245, 245, 245));
        brandTextField.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        brandTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                brandTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                brandTextFieldFocusLost(evt);
            }
        });
        brandTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brandTextFieldMouseEntered(evt);
            }
        });
        brandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandTextFieldActionPerformed(evt);
            }
        });
        jPanel5.add(brandTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 230, 40));

        modelTextField.setBackground(new java.awt.Color(245, 245, 245));
        modelTextField.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        modelTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                modelTextFieldFocusLost(evt);
            }
        });
        modelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTextFieldActionPerformed(evt);
            }
        });
        jPanel5.add(modelTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 230, 40));

        backHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backHomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backHomeButton.setFocusable(false);
        backHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backHomeButtonActionPerformed(evt);
            }
        });
        jPanel5.add(backHomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, 50));

        clearButton.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(164, 196, 181));
        clearButton.setText("CLEAR");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.setFocusable(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel5.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 660, 120, 40));

        deleteButton.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(164, 196, 181));
        deleteButton.setText("DELETE");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel5.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 660, 120, 40));

        modelQuantity.setBackground(new java.awt.Color(245, 245, 245));
        modelQuantity.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        modelQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                modelQuantityFocusLost(evt);
            }
        });
        modelQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelQuantityActionPerformed(evt);
            }
        });
        jPanel5.add(modelQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 230, 40));

        addTable.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        addTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model", "Size", "Color", "Sex", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(addTable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 670, 600));

        updateButton1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        updateButton1.setForeground(new java.awt.Color(164, 196, 181));
        updateButton1.setText("UPDATE");
        updateButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton1.setFocusable(false);
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(updateButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 660, 120, 40));

        addButton.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(164, 196, 181));
        addButton.setText("ADD");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setFocusable(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel5.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, 120, 40));

        fileMenu.setText("File");

        newMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newMenuItem.setText("New");
        fileMenu.add(newMenuItem);

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem.setText("Open...");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        fileMenu.add(Save);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Undo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);
        editMenu.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Cut");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Copy");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem4);

        Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Paste.setText("Paste");
        editMenu.add(Paste);

        deleteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        deleteMenuItem.setText("Delete");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        jMenuBar1.add(editMenu);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1119, 793));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void sizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeComboBoxActionPerformed

    private void colorBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorBlackActionPerformed

    private void modelPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelPriceActionPerformed

    private void brandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                         

    private void modelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelTextFieldActionPerformed

    private void modelQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelQuantityActionPerformed

    private void addHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHomeButtonActionPerformed
        this.dispose();
        new MainPage().setVisible(true);
    }//GEN-LAST:event_addHomeButtonActionPerformed

    private void backHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backHomeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ShoeStoreInfo().setVisible(true);
    }//GEN-LAST:event_backHomeButtonActionPerformed

    private void brandTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandTextFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_brandTextFieldMouseEntered

    private void brandTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brandTextFieldFocusGained
    }//GEN-LAST:event_brandTextFieldFocusGained

    private void brandTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brandTextFieldFocusLost
        if (brandTextField.getText().matches("^[A-Z]{1}[a-z]+")) {
            brandTextField.setForeground(Color.black);
        } else {
            brandTextField.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_brandTextFieldFocusLost

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        delete();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        update();
    }//GEN-LAST:event_updateButton1ActionPerformed

    private void modelTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_modelTextFieldFocusLost
        if (modelTextField.getText().matches("^[A-Za-z0-9]+")) {
            modelTextField.setForeground(Color.black);
        } else {
            modelTextField.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_modelTextFieldFocusLost

    private void modelQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_modelQuantityFocusLost
        if (modelQuantity.getText().matches("^[0-9]+")) {
            modelQuantity.setForeground(Color.black);
        } else {
            modelQuantity.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_modelQuantityFocusLost

    private void modelPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_modelPriceFocusLost
        // TODO add your handling code here:
        if (modelPrice.getText().matches("^[0-9]+")) {
            modelPrice.setForeground(Color.black);
        } else {
            modelPrice.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_modelPriceFocusLost

    public void addTable(){{
        String brand = brandTextField.getText();
        String quantityString = modelQuantity.getText();
        String priceString = modelPrice.getText();
        String sizeString = (String) sizeComboBox.getSelectedItem();
        String model = modelTextField.getText();
        int price = 0;
        int size = 0;
        int quantity = 0;
        String color = "";
        String sex = "";
        boolean flag = false;
        try
        {
            price = Integer.parseInt(priceString);
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Please enter a number value for price");
            return;
        }
        try
        {
            quantity = Integer.parseInt(quantityString);
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Please enter a number value for quantiry");
            return;
        }
        try
        {
            size = Integer.valueOf(sizeString);
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Invalid value for size");
            return;
        }
        if (sexFemale.isSelected())
        {
            sex = "Female";
        } else if (sexMale.isSelected())
        {
            sex = "Male";
        } else if (sexUnisex.isSelected())
        {
            sex = "Unisex";
        }

        if (colorBlack.isSelected())
        {
            color = "Black";
        } else if (colorWhite.isSelected())
        {
            color = "White";
        } else if (colorRed.isSelected())
        {
            color = "Red";
        }
        if (brand.equals("") || price == 0 || size == 0 || quantity == 0)
        {
            JOptionPane.showMessageDialog(this, "Please enter value in all fields");
        } else if (sex.equals("") || color.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please select a value for sex or color");
            return;
        } else
        {
            if (shoeList.isEmpty())
            {
                flag = true;
            } else
            {
                for (Shoes shoe : shoeList)
                {
                    if (shoe.getBrand().equalsIgnoreCase(brand) && shoe.getModel().equalsIgnoreCase(model))
                    {
                        JOptionPane.showMessageDialog(this, model + " of " + brand + " is aldrady in the Table");
                        return;
                    } else
                    {
                        flag = true;
                    }
                }
            }
            if (flag)
            {
                shoeList.add(new Shoes(brand, model, price, color, sex, size, quantity));
                DefaultTableModel tablemodule = (DefaultTableModel) addTable.getModel();
                String rowData[] =
                {
                    brand, model, sizeString, color, sex, quantityString, Double.toString(price)
                };
                writeCSV(rowData);
                tablemodule.addRow(rowData);
                clear();
                JOptionPane.showMessageDialog(this, "Data successfully added.");
                return;
            }
        }
        
        }
    }
    
    public void writeCSV(String values[]){
         FileWriter fileWriter = null;
        try {
            File file = new File("File.csv");
            if (!file.isFile()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file,true);
            for (int i = 0; i < values.length; i++) {
                fileWriter.append(values[i]);
                if( i == values.length-1){
                    break;
                }
                fileWriter.append(",");
            }
            fileWriter.append("\n");
        fileWriter.flush();
        fileWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "No file found");
        }
    
    }
    
    public void update(){
        String brand = brandTextField.getText();
        String quantityString = modelQuantity.getText();
        String priceString = modelPrice.getText();
        String sizeString = (String) sizeComboBox.getSelectedItem();
        String model = modelTextField.getText();
        double price = 0;
        int size = 0;
        int quantity = 0;
        String color = "";
        String sex = "";
        boolean flag = false;
        try
        {
            price = Double.parseDouble(priceString);
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Please enter a number value for price");
            return;
        }
        try
        {
            quantity = Integer.parseInt(quantityString);
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Please enter a number value for quantiry");
            return;
        }
        try
        {
            size = Integer.valueOf(sizeString);
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Invalid value for size");
            return;
        }
        if (sexFemale.isSelected())
        {
            sex = "Female";
        } else if (sexMale.isSelected())
        {
            sex = "Male";
        } else if (sexUnisex.isSelected())
        {
            sex = "Unisex";
        }

        if (colorBlack.isSelected())
        {
            color = "Black";
        } else if (colorWhite.isSelected())
        {
            color = "White";
        } else if (colorRed.isSelected())
        {
            color = "Red";
        }
        
        if (brand.equals("") || price == 0 || size == 0 || quantity == 0)
        {
            JOptionPane.showMessageDialog(this, "Please enter value in all fields");
        } else if (sex.equals("") || color.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please select a value for sex or color");
            return;
        } else
        {
            if (shoeList.isEmpty())
            {
                flag = true;
            } else
            {
                for (Shoes shoe : shoeList)
                {
                    if (shoe.getBrand().equalsIgnoreCase(brand) && shoe.getModel().equalsIgnoreCase(model))
                    {
                        JOptionPane.showMessageDialog(this, model + " of " + brand + " is aldrady in the Table");
                        return;
                    } else
                    {
                        flag = true;
                    }
                }
            }
            if (flag){
            String rowData[] =
                {
                    brand, model, sizeString, color, Double.toString(price), sex, quantityString
                };
            int rowNumber = addTable.getSelectedRow();
            int columnNumber = addTable.getColumnCount();
            for(int i= 0; i< columnNumber; i++){
              addTable.setValueAt(rowData[i], rowNumber, i);
            }
            clear();
            }
        }
    }
    
    public void delete(){
        int rowNumber = addTable.getSelectedRow();
            int columnNumber = addTable.getColumnCount();
            for(int i= 0; i< columnNumber; i++){
              addTable.setValueAt("", rowNumber, i);
            }
    }
    
    public void clear() {
        brandTextField.setText("");
        modelTextField.setText("");
        modelQuantity.setText("");
        modelPrice.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        sizeComboBox.setSelectedItem("0");
    }
    
    
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
            java.util.logging.Logger.getLogger(AddShoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddShoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddShoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddShoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddShoe().setVisible(true);
            }
        });
    }

    ArrayList<Shoes> shoeList = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem Save;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addHomeButton;
    private javax.swing.JTable addTable;
    private javax.swing.JButton backHomeButton;
    private javax.swing.JTextField brandTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clearButton;
    private javax.swing.JCheckBox colorBlack;
    private javax.swing.JCheckBox colorRed;
    private javax.swing.JCheckBox colorWhite;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton importButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField modelPrice;
    private javax.swing.JTextField modelQuantity;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JRadioButton sexFemale;
    private javax.swing.JRadioButton sexMale;
    private javax.swing.JRadioButton sexUnisex;
    private javax.swing.JComboBox<String> sizeComboBox;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables
}

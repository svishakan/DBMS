/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author svish
 */

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Employee extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    CallableStatement call_stmt;
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
        this.setSize(650, 1020);
        this.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
       
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            
            try{
                con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-U03B9C9:1521:XE", "vish", "1234");
                JOptionPane.showMessageDialog(this, "Sucessfully connected to database!");
            }
            
            catch(SQLException ex){
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);
            }
        }
        catch(ClassNotFoundException e){
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, e);
        }
        
        
    }
    
    private void clearTextFields(){
        idText.setText("");
        nameText.setText("");
        dobText.setText("");
        sexText.setText("");
        jobText.setText("");
        basicText.setText("");
        hraText.setText("");
        daText.setText("");
        pfText.setText("");
        mcText.setText("");
        netText.setText("");
        deducText.setText("");
        grossText.setText("");
    }
    
    private void disableButtons(){
        addBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        searchBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        nextBtn.setEnabled(false);
        prevBtn.setEnabled(false);
    }
    
    private void disableTextFields(){
        idText.setEnabled(false);
        nameText.setEnabled(false);
        dobText.setEnabled(false);
        sexText.setEnabled(false);
        jobText.setEnabled(false);
        basicText.setEnabled(false);
    }
    
    private void enableTextFields(){
        idText.setEnabled(true);
        nameText.setEnabled(true);
        dobText.setEnabled(true);
        sexText.setEnabled(true);
        jobText.setEnabled(true);
        basicText.setEnabled(true);
    }
    
    private void editableState(boolean flag){
        idText.setEnabled(flag);
        nameText.setEnabled(flag);
        dobText.setEnabled(flag);
        sexText.setEnabled(flag);
        jobText.setEnabled(flag);
        basicText.setEnabled(flag);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        dobText = new javax.swing.JTextField();
        jobText = new javax.swing.JTextField();
        basicText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        sexText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        daText = new javax.swing.JTextField();
        basicText2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hraText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pfText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mcText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        daText4 = new javax.swing.JTextField();
        grossText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        deducText = new javax.swing.JTextField();
        netText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        prevBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database Programming");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE DATABASE");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 340, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 140, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Designation");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 330, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("DOB");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 200, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Basic");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 390, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 90, 100, 30);

        nameText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTextKeyReleased(evt);
            }
        });
        getContentPane().add(nameText);
        nameText.setBounds(310, 140, 310, 40);

        dobText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(dobText);
        dobText.setBounds(310, 200, 310, 40);

        jobText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jobText);
        jobText.setBounds(310, 330, 310, 40);

        basicText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(basicText);
        basicText.setBounds(310, 390, 310, 40);

        idText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idText.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                idTextInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        idText.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                idTextPropertyChange(evt);
            }
        });
        idText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idTextKeyTyped(evt);
            }
        });
        getContentPane().add(idText);
        idText.setBounds(310, 82, 310, 40);

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn);
        deleteBtn.setBounds(330, 870, 130, 40);

        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn);
        clearBtn.setBounds(480, 870, 130, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Sex");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 270, 100, 30);

        sexText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(sexText);
        sexText.setBounds(310, 270, 310, 40);

        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchBtn.setText("SEARCH");
        searchBtn.setEnabled(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn);
        searchBtn.setBounds(30, 930, 180, 40);

        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.setEnabled(false);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn);
        updateBtn.setBounds(180, 870, 130, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("DA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 450, 100, 30);

        daText.setEditable(false);
        daText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(daText);
        daText.setBounds(310, 450, 310, 40);

        basicText2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(basicText2);
        basicText2.setBounds(310, 450, 310, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("DA");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 450, 100, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("HRA");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 510, 100, 30);

        hraText.setEditable(false);
        hraText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(hraText);
        hraText.setBounds(310, 510, 310, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("PF");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 570, 100, 30);

        pfText.setEditable(false);
        pfText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pfText);
        pfText.setBounds(310, 570, 310, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("MC");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 630, 100, 30);

        mcText.setEditable(false);
        mcText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mcText);
        mcText.setBounds(310, 630, 310, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("MC");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 630, 100, 30);

        daText4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(daText4);
        daText4.setBounds(310, 630, 310, 40);

        grossText.setEditable(false);
        grossText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(grossText);
        grossText.setBounds(310, 690, 310, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setText("Gross Pay");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 690, 100, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("Total Deductions");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 750, 170, 30);

        deducText.setEditable(false);
        deducText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(deducText);
        deducText.setBounds(310, 750, 310, 40);

        netText.setEditable(false);
        netText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(netText);
        netText.setBounds(310, 810, 310, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setText("Net Pay");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 810, 100, 30);

        prevBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prevBtn.setText("PREVIOUS RECORD");
        prevBtn.setEnabled(false);
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });
        getContentPane().add(prevBtn);
        prevBtn.setBounds(430, 930, 180, 40);

        nextBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nextBtn.setText("NEXT RECORD");
        nextBtn.setEnabled(false);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextBtn);
        nextBtn.setBounds(230, 930, 180, 40);

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setText("ADD");
        addBtn.setEnabled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn);
        addBtn.setBounds(30, 870, 130, 40);

        jLabel9.setBackground(new java.awt.Color(153, 0, 153));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-60, -80, 780, 1120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearTextFields();
        disableButtons();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        int emp_id = Integer.parseInt(idText.getText());
        boolean record_found = false;
        
        try{
            String sel_stmt = "SELECT * FROM emp_payroll ORDER BY eid ASC";
            //to allow for next and previous record scrolling, Statement obj. should be of this form
            stmt  = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sel_stmt);
            
            
            while(rs.next()){
                if(Integer.parseInt(rs.getString(1)) == emp_id){    //finding the particular employee
                    record_found = true;
                    
                    idText.setText(rs.getString(1));
                    nameText.setText(rs.getString(2));
                    dobText.setText(rs.getString(3).substring(0, 10));
                    sexText.setText(rs.getString(4));
                    jobText.setText(rs.getString(5));
                    basicText.setText(rs.getString(6));
                    daText.setText(rs.getString(7));
                    hraText.setText(rs.getString(8));
                    pfText.setText(rs.getString(9));
                    mcText.setText(rs.getString(10));
                    grossText.setText(rs.getString(11));
                    deducText.setText(rs.getString(12));
                    netText.setText(rs.getString(13));
                
                    JOptionPane.showMessageDialog(this, "Record Found!");
                    
                    if(rs.isLast() == false){
                        nextBtn.setEnabled(true);
                    }
                    if(rs.isFirst() == false){
                        prevBtn.setEnabled(true);
                    }
                    
                    if(rs.isAfterLast()){
                        rs.previous();
                    }
                    if(rs.isBeforeFirst()){
                        rs.next();
                    }
                    
                    break;
                }
            }
            if(record_found == false){
                JOptionPane.showMessageDialog(this, "No Records Found!");
            }
        }
        catch(SQLException ex){
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int emp_id = Integer.parseInt(idText.getText());
        
        try{
            String del_stmt = "DELETE FROM emp_payroll WHERE eid = ?";
            ps  = con.prepareStatement(del_stmt);
            ps.setString(1, Integer.toString(emp_id));
            ps.execute();
            JOptionPane.showMessageDialog(this, "Record Deleted!");
            
        }
        catch(SQLException ex){
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        
        clearTextFields();
        disableButtons();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            String updateQuery = "UPDATE emp_payroll SET ename = ?, dob = ?, sex = ?, designation = ?, basic = ? where eid = ?";
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, nameText.getText());
            ps.setString(2, dobText.getText());
            ps.setString(3, sexText.getText());
            ps.setString(4, jobText.getText());
            ps.setString(5, basicText.getText());
            ps.setString(6, idText.getText());
            ps.execute();
            JOptionPane.showMessageDialog(this, "Record Updated!");
            
            String call_pay_calc = "CALL pay_calc(?,?)";
            call_stmt = con.prepareCall(call_pay_calc);
            call_stmt.setString(1, idText.getText());
            call_stmt.setString(2, basicText.getText());
            call_stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        
        clearTextFields();
        disableButtons();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void idTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextKeyTyped
        
        
    }//GEN-LAST:event_idTextKeyTyped

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        
    }//GEN-LAST:event_nameTextActionPerformed

    private void idTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextKeyPressed
        
    }//GEN-LAST:event_idTextKeyPressed

    private void nameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextKeyPressed

    private void nameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyReleased
        String temp = nameText.getText().trim();
        
        if(temp.isEmpty() == false && updateBtn.isEnabled() == true){
            addBtn.setEnabled(true);
        }
        else{
            addBtn.setEnabled(false);
        }
    }//GEN-LAST:event_nameTextKeyReleased

    private void idTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextKeyReleased
        String temp = idText.getText().trim();
        if(temp.isEmpty() == false){
            updateBtn.setEnabled(true);
            deleteBtn.setEnabled(true);
            searchBtn.setEnabled(true);
        }
        else{
            updateBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
            searchBtn.setEnabled(false);
        }
    }//GEN-LAST:event_idTextKeyReleased

    private void idTextPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_idTextPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextPropertyChange

    private void idTextInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_idTextInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextInputMethodTextChanged

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        try {
            
            rs.previous();
            
            if(rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(this, "Current Record is the First Record!");
                rs.next();
                prevBtn.setEnabled(false);
            }
            
            idText.setText(rs.getString(1));
            nameText.setText(rs.getString(2));
            dobText.setText(rs.getString(3).substring(0, 10));
            sexText.setText(rs.getString(4));
            jobText.setText(rs.getString(5));
            basicText.setText(rs.getString(6));
            daText.setText(rs.getString(7));
            hraText.setText(rs.getString(8));
            pfText.setText(rs.getString(9));
            mcText.setText(rs.getString(10));
            grossText.setText(rs.getString(11));
            deducText.setText(rs.getString(12));
            netText.setText(rs.getString(13));
            //JOptionPane.showMessageDialog(this, "Record Found!");
            nextBtn.setEnabled(true);
        } 
        catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        
    }//GEN-LAST:event_prevBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        try {
            if(rs.next()){
                idText.setText(rs.getString(1));
                nameText.setText(rs.getString(2));
                dobText.setText(rs.getString(3).substring(0, 10));
                sexText.setText(rs.getString(4));
                jobText.setText(rs.getString(5));
                basicText.setText(rs.getString(6));
                daText.setText(rs.getString(7));
                hraText.setText(rs.getString(8));
                pfText.setText(rs.getString(9));
                mcText.setText(rs.getString(10));
                grossText.setText(rs.getString(11));
                deducText.setText(rs.getString(12));
                netText.setText(rs.getString(13));
                //JOptionPane.showMessageDialog(this, "Record Found!");
                prevBtn.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Current Record is the Last Record!");
                rs.previous();
                nextBtn.setEnabled(false);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try{
            String insert = "INSERT INTO Emp_Payroll(eid, ename, dob, sex, designation, basic) VALUES (?,?,?,?,?,?)";
            ps = con.prepareStatement(insert);
            ps.setString(1, idText.getText());
            ps.setString(2, nameText.getText());
            ps.setString(3, dobText.getText());
            ps.setString(4, sexText.getText());
            ps.setString(5, jobText.getText());
            ps.setString(6, basicText.getText());
            ps.execute();
            
            String call_pay_calc = "CALL pay_calc(?,?)";
            call_stmt = con.prepareCall(call_pay_calc);
            call_stmt.setString(1, idText.getText());
            call_stmt.setString(2, basicText.getText());
            call_stmt.execute();
            
            JOptionPane.showMessageDialog(this, "Insertion Successful!");
        }
        catch(HeadlessException | NumberFormatException | SQLException e){
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, e);
        }
        
        clearTextFields();
    }//GEN-LAST:event_addBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField basicText;
    private javax.swing.JTextField basicText2;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField daText;
    private javax.swing.JTextField daText4;
    private javax.swing.JTextField deducText;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField dobText;
    private javax.swing.JTextField grossText;
    private javax.swing.JTextField hraText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jobText;
    private javax.swing.JTextField mcText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField netText;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextField pfText;
    private javax.swing.JButton prevBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField sexText;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}

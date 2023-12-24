/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BMICalcuPackage;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacobe
 */
public class BMICalcuClass extends javax.swing.JFrame {

    
    public BMICalcuClass() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        subPanel = new javax.swing.JPanel();
        heightLbl = new javax.swing.JLabel();
        weightLbl = new javax.swing.JLabel();
        heightTxtField = new javax.swing.JTextField();
        weightTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bmiLbl = new javax.swing.JLabel();
        categLbl = new javax.swing.JLabel();
        bmiResult = new javax.swing.JLabel();
        categResult = new javax.swing.JLabel();
        headerLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BMICalcuJFrame");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("BMICalculator"); // NOI18N
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setForeground(new java.awt.Color(0, 0, 0));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMICalcuPackage/16 Pixel Exit Icon.png"))); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        subPanel.setBackground(new java.awt.Color(255, 95, 31));
        subPanel.setForeground(new java.awt.Color(255, 255, 255));

        heightLbl.setBackground(new java.awt.Color(255, 255, 255));
        heightLbl.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        heightLbl.setForeground(new java.awt.Color(255, 255, 255));
        heightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        heightLbl.setText("Height:");

        weightLbl.setBackground(new java.awt.Color(255, 255, 255));
        weightLbl.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        weightLbl.setForeground(new java.awt.Color(255, 255, 255));
        weightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        weightLbl.setText("Weight:");

        heightTxtField.setBackground(new java.awt.Color(255, 255, 255));
        heightTxtField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        heightTxtField.setForeground(new java.awt.Color(0, 0, 0));
        heightTxtField.setText("Meter");
        heightTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                heightTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                heightTxtFieldFocusLost(evt);
            }
        });

        weightTxtField.setBackground(new java.awt.Color(255, 255, 255));
        weightTxtField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        weightTxtField.setForeground(new java.awt.Color(0, 0, 0));
        weightTxtField.setText("Kilogram");
        weightTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                weightTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                weightTxtFieldFocusLost(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Calculate");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        bmiLbl.setBackground(new java.awt.Color(255, 255, 255));
        bmiLbl.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        bmiLbl.setForeground(new java.awt.Color(255, 255, 255));
        bmiLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bmiLbl.setText("BMI:");

        categLbl.setBackground(new java.awt.Color(255, 255, 255));
        categLbl.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        categLbl.setForeground(new java.awt.Color(255, 255, 255));
        categLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        categLbl.setText("Category:");

        bmiResult.setBackground(new java.awt.Color(255, 255, 255));
        bmiResult.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        bmiResult.setForeground(new java.awt.Color(255, 255, 255));
        bmiResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        categResult.setBackground(new java.awt.Color(255, 255, 255));
        categResult.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        categResult.setForeground(new java.awt.Color(255, 255, 255));
        categResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout subPanelLayout = new javax.swing.GroupLayout(subPanel);
        subPanel.setLayout(subPanelLayout);
        subPanelLayout.setHorizontalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(heightTxtField)
                    .addComponent(weightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bmiLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bmiResult, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categResult, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        subPanelLayout.setVerticalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heightLbl)
                    .addComponent(heightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmiLbl)
                    .addComponent(bmiResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categLbl)
                    .addComponent(categResult))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        headerLbl.setBackground(new java.awt.Color(255, 255, 255));
        headerLbl.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(0, 0, 0));
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("What is your BMI?");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(headerLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(640, 360));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // Exit Button
        System.exit(0);
        
    }//GEN-LAST:event_exitBtnMouseClicked

    private void heightTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightTxtFieldFocusGained
        // Focus Gained
        
        if(heightTxtField.getText().equals("Meter")) {
            heightTxtField.setText("");
            heightTxtField.setForeground(new Color(0, 0, 0));
        }
        
        
    }//GEN-LAST:event_heightTxtFieldFocusGained

    private void heightTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightTxtFieldFocusLost
        // Focus Lost
        
        if(heightTxtField.getText().equals("")) {
            heightTxtField.setText("Meter");
            heightTxtField.setForeground(new Color(0, 0, 0));
        }
        
        
    }//GEN-LAST:event_heightTxtFieldFocusLost

    private void weightTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_weightTxtFieldFocusGained
        // 
        if(weightTxtField.getText().equals("Kilogram")) {
            weightTxtField.setText("");
            weightTxtField.setForeground(new Color(0, 0, 0));
        }
        
    }//GEN-LAST:event_weightTxtFieldFocusGained

    private void weightTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_weightTxtFieldFocusLost
        //
        if(weightTxtField.getText().equals("")) {
            weightTxtField.setText("Kilogram");
            weightTxtField.setForeground(new Color(0, 0, 0));
        }
       
    }//GEN-LAST:event_weightTxtFieldFocusLost

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Calculate Button
        
        // Initialize Variables
        double height = Double.parseDouble(heightTxtField.getText());
        double weight = Double.parseDouble(weightTxtField.getText());
        
        // Formula
        double bmi = weight / (height * height);
        
        
        
        if(bmi < 18.5) {
            bmiResult.setText(Double.toString(bmi));
            bmiResult.setForeground(Color.yellow);
            categResult.setText("Underweight");
            categResult.setForeground(Color.yellow);
        }else if(bmi < 24.9) {
            bmiResult.setText(Double.toString(bmi));
            bmiResult.setForeground(Color.green);
            categResult.setText("Normal");
            categResult.setForeground(Color.green);
        }else if(bmi < 29.9) {
            bmiResult.setText(Double.toString(bmi));
            bmiResult.setForeground(Color.red);
            categResult.setText("Overweight");
            categResult.setForeground(Color.red);
        }else if(bmi < 34.9) {
            bmiResult.setText(Double.toString(bmi));
            bmiResult.setForeground(Color.red);
            categResult.setText("Obese");
            categResult.setForeground(Color.red);
        }else if(bmi > 35) {
            bmiResult.setText(Double.toString(bmi));
            bmiResult.setForeground(Color.red);
            categResult.setText("Extremely Obese");
            categResult.setForeground(Color.red);
        }
        
        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(BMICalcuClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMICalcuClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMICalcuClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMICalcuClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMICalcuClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel bmiLbl;
    public javax.swing.JLabel bmiResult;
    public javax.swing.JLabel categLbl;
    public javax.swing.JLabel categResult;
    public javax.swing.JLabel exitBtn;
    public javax.swing.JLabel headerLbl;
    public javax.swing.JLabel heightLbl;
    public javax.swing.JTextField heightTxtField;
    public javax.swing.JButton jButton1;
    public javax.swing.JPanel mainPanel;
    public javax.swing.JPanel subPanel;
    public javax.swing.JLabel weightLbl;
    public javax.swing.JTextField weightTxtField;
    // End of variables declaration//GEN-END:variables
}

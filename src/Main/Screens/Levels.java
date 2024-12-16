/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main.Screens;

import Main.GAMEPLAY.River;
import static Main.Screens.mainMenu.clip;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Moham
 */
public class Levels extends javax.swing.JFrame {

    /**
     * Creates new form Levels
     */
    public Levels() {
        initComponents();
        setTitle("Select a level");

        setLocationRelativeTo(null); // Center the window

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sp = new javax.swing.JRadioButton();
        mp = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Level1 (easiest)");
        jButton1.setPreferredSize(new java.awt.Dimension(190, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Level2");
        jButton2.setPreferredSize(new java.awt.Dimension(190, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Level3 (hardest)");
        jButton3.setPreferredSize(new java.awt.Dimension(190, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        sp.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(sp);
        sp.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        sp.setForeground(new java.awt.Color(255, 255, 255));
        sp.setSelected(true);
        sp.setText("Single Player");
        sp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spActionPerformed(evt);
            }
        });
        getContentPane().add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 170, 40));

        mp.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(mp);
        mp.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        mp.setForeground(new java.awt.Color(255, 255, 255));
        mp.setText("Multi Player");
        mp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 170, 40));

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("How many Players?");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 280, 60));

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select Deficulity:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 280, 60));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Main Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bground.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static String s1, s2;

    void saveName() {
        s1 = "";
        s2 = "";

        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 18));
        UIManager.put("OptionPane.background", new Color(0, 0, 128)); // Dark blue
        UIManager.put("Panel.background", new Color(0, 0, 128)); // Dark blue
        UIManager.put("OptionPane.messageForeground", new Color(0, 255, 255)); // Bright cyan
        UIManager.put("Button.background", new Color(0, 255, 0)); // Bright green
        UIManager.put("Button.foreground", Color.BLACK); // Text color on buttons
        UIManager.put("TextField.background", new Color(173, 216, 230)); // Light blue
        UIManager.put("TextField.foreground", Color.BLACK); // Text color in text fields
        UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 16));

        while (s1 != null && s1.length() == 0) {
            s1 = JOptionPane.showInputDialog(null, "Enter your Name, Raider");
        }

        while (mp.isSelected() && s1 != null && s2 != null && s2.length() == 0) {
            s2 = JOptionPane.showInputDialog(null, "Enter your Name, Second Raider");
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        saveName();
        if (sp.isSelected()) {
            if (s1 != null) {
//                Action first
                new River(s1, s2, 1, 1);

                clip.stop();
                this.dispose();
            }

        } else if (mp.isSelected()) {

            if (s1 != null && s2 != null) {
//                Action first
                new River(s1, s2, 2, 1);

                clip.stop();
                this.dispose();
            }

        }

//        Anim.reSet();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            new mainMenu().setVisible(true);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
//        clip.start();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        saveName();
        if (sp.isSelected()) {
            if (s1 != null) {
//                Action first
                new River(s1, s2, 1, 2);

                clip.stop();
                this.dispose();
            }

        } else if (mp.isSelected()) {

            if (s1 != null && s2 != null) {
//                Action first
                new River(s1, s2, 2, 2);

                clip.stop();
                this.dispose();
            }

        }

//        Anim.reSet();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        saveName();
        if (sp.isSelected()) {
            if (s1 != null) {
//                Action first
                new River(s1, s2, 1, 3);

                clip.stop();
                this.dispose();
            }

        } else if (mp.isSelected()) {

            if (s1 != null && s2 != null) {
//                Action first
                new River(s1, s2, 2, 3);

                clip.stop();
                this.dispose();
            }

        }

//        Anim.reSet();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton mp;
    private javax.swing.JRadioButton sp;
    // End of variables declaration//GEN-END:variables
}

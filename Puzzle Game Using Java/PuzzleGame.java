
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MODERN
 */
public class PuzzleGame extends javax.swing.JFrame {

   private Timer timer;
    public PuzzleGame() {
        initComponents();
        
         timer= new Timer(2000,new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e){
          gameCounter();
        
        }
        });
        
        timer.start();
    }
    
    int i=50;
    public void gameCounter(){
        i--;
        if(i>=0 ){
        jTextField2.setText(String.valueOf(i));
        } else{
            
            timer.stop();
            String failMusic="C:\\Users\\MODERN\\Documents\\NetBeansProjects\\PuzzleGame\\src\\level-failed-80951.wav";
           MusicPlayer musicPlayer = MusicPlayer.getInstance();
           musicPlayer.playNewMusic(failMusic,false);
          
       
           GameOverTime got = new GameOverTime();

               got.setVisible(true);  
        got.setLocationRelativeTo(null); 
        dispose();
      }
      
        }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 0, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 6, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("1");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 80, 80));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("3");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 80, 80));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("4");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 80, 80));

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("8");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 80, 80));

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("7");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 80, 80));

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("6");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 80, 80));

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("5");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 80, 80));

        jButton9.setBackground(new java.awt.Color(255, 51, 51));
        jButton9.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("9");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 80, 80));

        jButton10.setBackground(new java.awt.Color(255, 51, 51));
        jButton10.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("10");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 80, 80));

        jButton11.setBackground(new java.awt.Color(255, 51, 51));
        jButton11.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("11");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 80, 80));

        jButton12.setBackground(new java.awt.Color(255, 51, 0));
        jButton12.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setText("12");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 80, 80));

        jButton13.setBackground(new java.awt.Color(255, 51, 51));
        jButton13.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 80, 80));

        jButton14.setBackground(new java.awt.Color(255, 51, 51));
        jButton14.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.setText("15");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 80, 80));

        jButton15.setBackground(new java.awt.Color(255, 51, 51));
        jButton15.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setText("14");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 80, 80));

        jButton16.setBackground(new java.awt.Color(255, 51, 51));
        jButton16.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 0, 0));
        jButton16.setText("13");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 80, 80));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("2");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 80, 80));

        jButton17.setBackground(new java.awt.Color(255, 0, 51));
        jButton17.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 0));
        jButton17.setText("Solve");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 545, 200, 70));

        jButton18.setBackground(new java.awt.Color(255, 0, 51));
        jButton18.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setText("Reset");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 200, 70));

        jButton19.setBackground(new java.awt.Color(255, 0, 51));
        jButton19.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 0, 0));
        jButton19.setText("Start Menu");
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 545, 200, 70));

        jLabel4.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("UserName:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 111, 115, -1));

        jTextField3.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 104, 178, -1));

        jLabel2.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("No: of moves:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 109, 137, 33));

        jTextField1.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 104, 86, -1));

        jLabel3.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Time remaining:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 156, -1, -1));

        jTextField2.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 149, 75, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Jokerman", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PuzzleGame Mania...");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 6, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 12, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/109927479-puzzle-wood-block-patterns-wallpaper-background.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        shuffleButtons();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        StartMenu mh= new StartMenu();
        
        mh.show();

        dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        timer.stop();
        counter=0;
        i=50;
        jTextField1.setText(Integer.toString(counter));
        jTextField2.setText(String.valueOf(i));
        timer.start();
        shuffleButtons();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jButton1.setText("1");
        jButton2.setText("2");
        jButton3.setText("3");
        jButton4.setText("4");
        jButton5.setText("8");
        jButton6.setText("7");
        jButton7.setText("6");
        jButton8.setText("5");
        jButton9.setText("9");
        jButton10.setText("10");
        jButton11.setText("11");
        jButton12.setText("12");
        jButton13.setText("");
        jButton14.setText("15");
        jButton15.setText("14");
        jButton16.setText("13");

        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        emptyBlock(jButton2,jButton1);
        emptyBlock(jButton2,jButton3);
        emptyBlock(jButton2,jButton6);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        emptyBlock(jButton16,jButton15);
        emptyBlock(jButton16,jButton12);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        emptyBlock(jButton15,jButton14);
        emptyBlock(jButton15,jButton11);
        emptyBlock(jButton15,jButton16);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        emptyBlock(jButton14,jButton10);
        emptyBlock(jButton14,jButton13);
        emptyBlock(jButton14,jButton15);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        emptyBlock(jButton13,jButton9);
        emptyBlock(jButton13,jButton14);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        emptyBlock(jButton12,jButton8);
        emptyBlock(jButton12,jButton11);
        emptyBlock(jButton12,jButton16);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        emptyBlock(jButton11,jButton7);
        emptyBlock(jButton11,jButton10);
        emptyBlock(jButton11,jButton12);
        emptyBlock(jButton11,jButton15);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        emptyBlock(jButton10,jButton9);
        emptyBlock(jButton10,jButton14);
        emptyBlock(jButton10,jButton6);
        emptyBlock(jButton10,jButton11);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        emptyBlock(jButton9,jButton5);
        emptyBlock(jButton9,jButton10);
        emptyBlock(jButton9,jButton13);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        emptyBlock(jButton8,jButton4);
        emptyBlock(jButton8,jButton7);
        emptyBlock(jButton8,jButton12);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        emptyBlock(jButton7,jButton8);
        emptyBlock(jButton7,jButton3);
        emptyBlock(jButton7,jButton6);
        emptyBlock(jButton7,jButton11);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        emptyBlock(jButton6,jButton2);
        emptyBlock(jButton6,jButton5);
        emptyBlock(jButton6,jButton7);
        emptyBlock(jButton6,jButton10);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        emptyBlock(jButton5,jButton1);
        emptyBlock(jButton5,jButton6);
        emptyBlock(jButton5,jButton9);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        emptyBlock(jButton4,jButton8);
        emptyBlock(jButton4,jButton3);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        emptyBlock(jButton3,jButton2);
        emptyBlock(jButton3,jButton4);
        emptyBlock(jButton3,jButton7);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        emptyBlock(jButton1,jButton2);
        emptyBlock(jButton1,jButton5);
        try {
            solutionChecking();
        } catch (SQLException ex) {
            Logger.getLogger(PuzzleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    int counter=0;
    void emptyBlock(JButton b1,JButton b2){
        String bText= b2.getText();
        if(bText==""){
            b2.setText(b1.getText());
            b1.setText("");
            b2.setBackground(new Color(255,51,51));
            b1.setBackground(Color.BLACK);
             counter=counter+1;
        }
    }
    
    
   
    
    public void shuffleButtons(){
    
    ArrayList <JButton> pButtons= new ArrayList<>();
    
    pButtons.add(jButton1);
    pButtons.add(jButton2);
    pButtons.add(jButton3);
    pButtons.add(jButton4);
    pButtons.add(jButton5);
    pButtons.add(jButton6);
    pButtons.add(jButton7);
    pButtons.add(jButton8);
    pButtons.add(jButton9);
    pButtons.add(jButton10);
    pButtons.add(jButton11);
    pButtons.add(jButton12);
    pButtons.add(jButton13);
    pButtons.add(jButton14);
    pButtons.add(jButton15);
    pButtons.add(jButton16);
    
    Collections.shuffle(pButtons);
    
    for (int i=0;i<pButtons.size();i++){
    JButton b=pButtons.get(i);
    b.setText(String.valueOf(i+1));
    
    if(i==pButtons.size()-1){
    b.setText("");
    }
    
    
   }
    
  }
    String userName;
    String moves;
    String time;
    int timingI;
    String timing;
    int score;
    String backgroundMusic="C:\\Users\\MODERN\\Documents\\NetBeansProjects\\PuzzleGame\\src\\soft-suspense-music-28126.wav";
    void solutionChecking() throws SQLException{
    String b1= jButton1.getText();
    String b2= jButton2.getText();
    String b3= jButton3.getText();
    String b4= jButton4.getText();
    String b5= jButton5.getText();
    String b6= jButton6.getText();
    String b7= jButton7.getText();
    String b8= jButton8.getText();
    String b9= jButton9.getText();
    String b10= jButton10.getText();
    String b11= jButton11.getText();
    String b12= jButton12.getText();
    
    String b14= jButton14.getText();
    String b15= jButton15.getText();
    String b16=jButton16.getText();
    
    
    if(b1=="1"&& b2=="2" && b3=="3" && b4=="4" && b5=="8" && b6=="7" && b7=="6" && b8=="5" && b9=="9" && b10=="10" && b11=="11" && b12=="12"&& b16=="13" && b14=="15" && b15=="14"){
    
    timer.stop();
    String winMusic="C:\\Users\\MODERN\\Documents\\NetBeansProjects\\PuzzleGame\\src\\brass-fanfare-with-timpani-and-winchimes-reverberated-146260.wav";
           MusicPlayer musicPlayer = MusicPlayer.getInstance();
           musicPlayer.playNewMusic(winMusic,false);
           musicPlayer.stop();
      
       userName=jTextField3.getText();
       moves= jTextField1.getText();
       time= jTextField2.getText();
       timingI = 50-Integer.valueOf(time);
       timing= String.valueOf(timingI);
       
     
      
     LeaderBoard l = new LeaderBoard();
     
     l.setUserName(userName);
     l.setMoves(moves);
     l.setTiming(timing);
     l.setScore(timingI);
     
     insertHard(userName,String.valueOf(l.score),moves,timing);
     l.getBestTiming();
     l.getSecondBestTiming();
     l.getThirdBestTiming();
     l.show();
     
     dispose();
    }
    
    
     jTextField1.setText(Integer.toString(counter));
    if(counter>100){
        
        timer.stop();
        String failMusic="C:\\Users\\MODERN\\Documents\\NetBeansProjects\\PuzzleGame\\src\\level-failed-80951.wav";
           MusicPlayer musicPlayer = MusicPlayer.getInstance();
           musicPlayer.playNewMusic(failMusic,false);
           musicPlayer.stop();
    

            GameOver go= new GameOver();
            go.show();


            dispose();
      }
      
       
   }
    
    
    
    
    public  void insertHard(String userName,String score,String moves,String timing){
    
    String sql="INSERT INTO GamersHard(UserName,Marks,Moves,Timing) VALUES(?,?,?,?)";
      try{
      Connection conn=Connect.getConnection();
      PreparedStatement pstmt=conn.prepareStatement(sql);
      
        pstmt.setString(1,userName);
       pstmt.setString(2,score);
       pstmt.setString(3,moves);
        pstmt.setString(4,timing);
      
       pstmt.executeUpdate();
       
       pstmt.close();
      }catch(SQLException e){
          System.out.println(e.getMessage());
      }
    } 
         
    
    public  void addUserName(String text){
   
   jTextField3.setText(text);
   }
    
    
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
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuzzleGame().setVisible(true);
                
                 
            }
        });
        
         MusicPlayer musicPlayer= MusicPlayer.getInstance();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

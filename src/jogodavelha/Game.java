
package jogodavelha;

import java.awt.Color;

public class Game extends javax.swing.JFrame {
    
    boolean playerOne = true;
    boolean playerTwo = true;
    
    int position = 0, i = 0, j = 0;
    String turn = "x";
    String linha1, linha2, linha3, coluna1, coluna2, coluna3, diagonal1, diagonal2;
    String[][] posvetor = new String[3][3];
    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        command.setText("Jogador da vez: (X)");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top1 = new javax.swing.JButton();
        top2 = new javax.swing.JButton();
        top3 = new javax.swing.JButton();
        top4 = new javax.swing.JButton();
        top5 = new javax.swing.JButton();
        top6 = new javax.swing.JButton();
        top7 = new javax.swing.JButton();
        top8 = new javax.swing.JButton();
        top9 = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        command = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        top1.setBackground(java.awt.Color.white);
        top1.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        top1.setForeground(new java.awt.Color(51, 51, 55));
        top1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top1ActionPerformed(evt);
            }
        });

        top2.setBackground(java.awt.Color.white);
        top2.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        top2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top2ActionPerformed(evt);
            }
        });

        top3.setBackground(java.awt.Color.white);
        top3.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        top3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top3ActionPerformed(evt);
            }
        });

        top4.setBackground(java.awt.Color.white);
        top4.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        top4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top4ActionPerformed(evt);
            }
        });

        top5.setBackground(java.awt.Color.white);
        top5.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        top5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top5ActionPerformed(evt);
            }
        });

        top6.setBackground(java.awt.Color.white);
        top6.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        top6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top6ActionPerformed(evt);
            }
        });

        top7.setBackground(java.awt.Color.white);
        top7.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        top7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top7ActionPerformed(evt);
            }
        });

        top8.setBackground(java.awt.Color.white);
        top8.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        top8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top8ActionPerformed(evt);
            }
        });

        top9.setBackground(java.awt.Color.white);
        top9.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        top9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top9ActionPerformed(evt);
            }
        });

        restart.setText("RESTART");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        command.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        command.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        command.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(command, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(top4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(top7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(top2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(top5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(top8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(top3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(top6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(top9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(top3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(top2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(top6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(top9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(top5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(top8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(top4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(top7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(command, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Turn() {
        if(playerOne && playerTwo){
           this.turn = "x"; 
           playerOne = false;
           playerTwo = true;
           command.setText("Jogador da vez: (O)");
        } else if (playerOne && !playerTwo) {
           this.turn = "x"; 
           playerOne = false;
           playerTwo = true;
           command.setText("Jogador da vez: (O)");
        } else {
           this.turn = "ball"; 
           playerOne = true;
           playerTwo = false;
           command.setText("Jogador da vez: (X)");
        }
    }
    
    public void restartArray() {
        position = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                posvetor[i][j] = "";
            }
        }
    }
    
    public void winnerVerify() {
        
        linha1 = posvetor[0][0] + posvetor[0][1] + posvetor[0][2];
        linha2 = posvetor[1][0] + posvetor[1][1] + posvetor[1][2];
        linha3 = posvetor[2][0] + posvetor[2][1] + posvetor[2][2];
        
        coluna1 = posvetor[0][0] + posvetor[1][0] + posvetor[2][0];
        coluna2 = posvetor[0][1] + posvetor[1][1] + posvetor[2][1];
        coluna3 = posvetor[0][2] + posvetor[1][2] + posvetor[2][2];
        
        diagonal1 = posvetor[0][0] + posvetor[1][1] + posvetor[2][2];
        diagonal2 = posvetor[0][2] + posvetor[1][1] + posvetor[2][0];
        
        if (linha1.equals("xxx") | linha2.equals("xxx") | linha3.equals("xxx") |
            coluna1.equals("xxx") | coluna2.equals("xxx") |coluna3.equals("xxx") |
            diagonal1.equals("xxx") | diagonal2.equals("xxx")) {
            
            if (linha1.equals("xxx")) {
                top1.setBackground(Color.green);
                top2.setBackground(Color.green);
                top3.setBackground(Color.green);
            } else if (linha2.equals("xxx")) {
                top4.setBackground(Color.green);
                top5.setBackground(Color.green);
                top6.setBackground(Color.green);
            } else if (linha3.equals("xxx")) {
                top7.setBackground(Color.green);
                top8.setBackground(Color.green);
                top9.setBackground(Color.green);
            }
            
            if (coluna1.equals("xxx")) {
                top1.setBackground(Color.green);
                top4.setBackground(Color.green);
                top7.setBackground(Color.green);
            } else if (coluna2.equals("xxx")) {
                top2.setBackground(Color.green);
                top5.setBackground(Color.green);
                top8.setBackground(Color.green);
            } else if (coluna3.equals("xxx")) {
                top3.setBackground(Color.green);
                top6.setBackground(Color.green);
                top9.setBackground(Color.green);
            }
            
            if (diagonal1.equals("xxx")) {
                top1.setBackground(Color.green);
                top5.setBackground(Color.green);
                top9.setBackground(Color.green);
            } else if (diagonal2.equals("xxx")) {
                top3.setBackground(Color.green);
                top5.setBackground(Color.green);
                top7.setBackground(Color.green);
            }
            
            command.setText("--- VENCEDOR (X)! ---");
            endGame();
            
        } else if (linha1.equals("ooo") | linha2.equals("ooo") | linha3.equals("ooo") |
            coluna1.equals("ooo") | coluna2.equals("ooo") |coluna3.equals("ooo") |
            diagonal1.equals("ooo") | diagonal2.equals("ooo")) {
            
            if (linha1.equals("ooo")) {
                top1.setBackground(Color.green);
                top2.setBackground(Color.green);
                top3.setBackground(Color.green);
            } else if (linha2.equals("ooo")) {
                top4.setBackground(Color.green);
                top5.setBackground(Color.green);
                top6.setBackground(Color.green);
            } else if (linha3.equals("ooo")) {
                top7.setBackground(Color.green);
                top8.setBackground(Color.green);
                top9.setBackground(Color.green);
            }
            
            if (coluna1.equals("ooo")) {
                top1.setBackground(Color.green);
                top4.setBackground(Color.green);
                top7.setBackground(Color.green);
            } else if (coluna2.equals("ooo")) {
                top2.setBackground(Color.green);
                top5.setBackground(Color.green);
                top8.setBackground(Color.green);
            } else if (coluna3.equals("ooo")) {
                top3.setBackground(Color.green);
                top6.setBackground(Color.green);
                top9.setBackground(Color.green);
            }
            
            if (diagonal1.equals("ooo")) {
                top1.setBackground(Color.green);
                top5.setBackground(Color.green);
                top9.setBackground(Color.green);
            } else if (diagonal2.equals("ooo")) {
                top3.setBackground(Color.green);
                top5.setBackground(Color.green);
                top7.setBackground(Color.green);
            }
            
            command.setText("--- VENCEDOR (O)! ---");
            endGame();
        } else if (position == 9) {
            command.setText("VELHA !!");
            top1.setBackground(Color.red);
            top2.setBackground(Color.red);
            top3.setBackground(Color.red);
            top4.setBackground(Color.red);
            top5.setBackground(Color.red);
            top6.setBackground(Color.red);
            top7.setBackground(Color.red);
            top8.setBackground(Color.red);
            top9.setBackground(Color.red);
        }
    }
    
    public void velha(){
        position = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (posvetor[i][j] == "x" | posvetor[i][j] == "o"){
                    position += 1;
                }
            }
        }
    }
    
    public void endGame() {
        top1.setEnabled(false);
        top2.setEnabled(false);
        top3.setEnabled(false);
        top4.setEnabled(false);
        top5.setEnabled(false);
        top6.setEnabled(false);
        top7.setEnabled(false);
        top8.setEnabled(false);
        top9.setEnabled(false);
    }
    
    private void top1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top1ActionPerformed
        Turn();
        
        if (turn.equals("x")) {
           top1.setText("X");
           posvetor[0][0] = "x";
        } else {
           top1.setText("O");
           posvetor[0][0] = "o";
        }
        
        top1.setEnabled(false);
        velha();
        winnerVerify();
    }//GEN-LAST:event_top1ActionPerformed

    private void top2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top2ActionPerformed
        Turn();
        
        if (turn.equals("x")) {
           top2.setText("X");
           posvetor[0][1] = "x";
        } else {
           top2.setText("O");
           posvetor[0][1] = "o";
        }
        
        top2.setEnabled(false);
        velha();
        winnerVerify();
    }//GEN-LAST:event_top2ActionPerformed

    private void top3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top3ActionPerformed
        Turn();
        
        if (turn.equals("x")) {
           top3.setText("X");
           posvetor[0][2] = "x";
        } else {
           top3.setText("O");
           posvetor[0][2] = "o";
        }
        
        top3.setEnabled(false);
        velha();
        winnerVerify();
    }//GEN-LAST:event_top3ActionPerformed

    private void top4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top4ActionPerformed
        Turn();
        
        if (turn.equals("x")) {
           top4.setText("X");
           posvetor[1][0] = "x";
        } else {
           top4.setText("O");
           posvetor[1][0] = "o";
        }
        
        top4.setEnabled(false);
        velha();
        winnerVerify();
    }//GEN-LAST:event_top4ActionPerformed

    private void top5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top5ActionPerformed
        Turn();
        
        if (turn.equals("x")) {
           top5.setText("X");
           posvetor[1][1] = "x";
        } else {
           top5.setText("O");
           posvetor[1][1] = "o";
        }
        
        top5.setEnabled(false);
        velha();
        winnerVerify();
    }//GEN-LAST:event_top5ActionPerformed

    private void top6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top6ActionPerformed
        Turn();
        
        if (turn.equals("x")) {
           top6.setText("X");
           posvetor[1][2] = "x";
        } else {
           top6.setText("O");
           posvetor[1][2] = "o";
        }
        top6.setEnabled(false);
        
        velha();
        winnerVerify();
    }//GEN-LAST:event_top6ActionPerformed

    private void top7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top7ActionPerformed
        Turn();
        
        if (turn.equals("x")) {
           top7.setText("X");
           posvetor[2][0] = "x";
        } else {
           top7.setText("O");
           posvetor[2][0] = "o";
        }
        top7.setEnabled(false);
        
        velha();
        winnerVerify();
    }//GEN-LAST:event_top7ActionPerformed

    private void top8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top8ActionPerformed
        Turn();
        
        if (turn.equals("x")) {
           top8.setText("X");
           posvetor[2][1] = "x";
        } else {
           top8.setText("O");
           posvetor[2][1] = "o";
        }
        
        top8.setEnabled(false);
        velha();
        winnerVerify();
    }//GEN-LAST:event_top8ActionPerformed

    private void top9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top9ActionPerformed
        Turn();
        
        if (turn.equals("x")) {
           top9.setText("X");
           posvetor[2][2] = "x";
        } else {
           top9.setText("O");
           posvetor[2][2] = "o";
        }
        top9.setEnabled(false);
        
        velha();
        winnerVerify();
    }//GEN-LAST:event_top9ActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        top1.setText("");
        top1.setEnabled(true);
        top1.setBackground(Color.white);
        
        top2.setText("");
        top2.setEnabled(true);
        top2.setBackground(Color.white);
        
        top3.setText("");
        top3.setEnabled(true);
        top3.setBackground(Color.white);
        
        top4.setText("");
        top4.setEnabled(true);
        top4.setBackground(Color.white);
        
        top5.setText("");
        top5.setEnabled(true);
        top5.setBackground(Color.white);
        
        top6.setText("");
        top6.setEnabled(true);
        top6.setBackground(Color.white);
        
        top7.setText("");
        top7.setEnabled(true);
        top7.setBackground(Color.white);
        
        top8.setText("");
        top8.setEnabled(true);
        top8.setBackground(Color.white);
        
        top9.setText("");
        top9.setEnabled(true);
        top9.setBackground(Color.white);
        
        restartArray();
        command.setText("");
        playerOne = true;
        playerTwo = true;
    }//GEN-LAST:event_restartActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField command;
    private javax.swing.JButton restart;
    private javax.swing.JButton top1;
    private javax.swing.JButton top2;
    private javax.swing.JButton top3;
    private javax.swing.JButton top4;
    private javax.swing.JButton top5;
    private javax.swing.JButton top6;
    private javax.swing.JButton top7;
    private javax.swing.JButton top8;
    private javax.swing.JButton top9;
    // End of variables declaration//GEN-END:variables
}

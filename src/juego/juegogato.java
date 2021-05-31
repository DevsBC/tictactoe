/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author yo
 */
public class juegogato extends javax.swing.JFrame {

    int v1, v2, v3, v4, v5, v6, v7, v8, v9;
    boolean done = false;
    boolean fin = false;
    
    void reset() {
        v1 = 0;
        v2 = 0;
        v3 = 0;
        v4 = 0;
        v5 = 0;
        v6 = 0;
        v7 = 0;
        v8 = 0;
        v9 = 0;
        
        p1.setText("");
        p1.setEnabled(true);
        p2.setText("");
        p2.setEnabled(true);
        p3.setText("");
        p3.setEnabled(true);
        p4.setText("");
        p4.setEnabled(true);
        p5.setText("");
        p5.setEnabled(true);
        p6.setText("");
        p6.setEnabled(true);
        p7.setText("");
        p7.setEnabled(true);
        p8.setText("");
        p8.setEnabled(true);
        p9.setText("");
        p9.setEnabled(true);
        
        done = false;
        fin = false;
    }
    
    private void centrarVentana() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = getSize();
        setLocation((pantalla.width - ventana.width) / 2,
                (pantalla.height - ventana.height) / 2);
    }
    
    void Marcar(int player, int poss) {
        switch(player) {
            case 1 :
                switch(poss) {
                    case 1:
                        v1 = 1;
                        p1.setText("X");
                        p1.setEnabled(false);
                        break;
                    case 2:
                        v2 = 1;
                        p2.setText("X");
                        p2.setEnabled(false);
                        break;  
                    case 3:
                        v3 = 1;
                        p3.setText("X");
                        p3.setEnabled(false);
                        break;  
                    case 4:
                        v4 = 1;
                        p4.setText("X");
                        p4.setEnabled(false);
                        break;  
                    case 5:
                        v5 = 1;
                        p5.setText("X");
                        p5.setEnabled(false);
                        break;  
                    case 6:
                        v6 = 1;
                        p6.setText("X");
                        p6.setEnabled(false);
                        break; 
                    case 7:
                        v7 = 1;
                        p7.setText("X");
                        p7.setEnabled(false);
                        break;  
                    case 8:
                        v8 = 1;
                        p8.setText("X");
                        p8.setEnabled(false);
                        break;  
                    case 9:
                        v9 = 1;
                        p9.setText("X");
                        p9.setEnabled(false);
                        break;      
                }
                break;
            case 2: 
                 switch(poss) {
                    case 1:
                        v1 = 2;
                        p1.setText("O");
                        p1.setEnabled(false);
                        break;
                    case 2:
                        v2 = 2;
                        p2.setText("O");
                        p2.setEnabled(false);
                        break;  
                    case 3:
                        v3 = 2;
                        p3.setText("O");
                        p3.setEnabled(false);
                        break;  
                    case 4:
                        v4 = 2;
                        p4.setText("O");
                        p4.setEnabled(false);
                        break;  
                    case 5:
                        v5 = 2;
                        p5.setText("O");
                        p5.setEnabled(false);
                        break;  
                    case 6:
                        v6 = 2;
                        p6.setText("O");
                        p6.setEnabled(false);
                        break; 
                    case 7:
                        v7 = 2;
                        p7.setText("O");
                        p7.setEnabled(false);
                        break;  
                    case 8:
                        v8 = 2;
                        p8.setText("O");
                        p8.setEnabled(false);
                        break;  
                    case 9:
                        v9 = 2;
                        p9.setText("O");
                        p9.setEnabled(false);
                        break;      
                }
                break;
        }
    }
    
    
    void Computadora() {
        done = false;
        fin = false;
        
        boolean gano = winner(2);
        
        if (gano) {
            JOptionPane.showMessageDialog(null, "Tu has ganado", "Juego", JOptionPane.PLAIN_MESSAGE);
            reset();
            fin = true;
            return;
        }
        
        if (!done && !fin) {
            System.out.println("Tratando de ganar");
            ganar();
            
            bloqueo();
            
            centro();
            
            allBloqueo();
            
    
            
        }
        
        if (!done  && !fin && v3 == 0) {
            Marcar(1,3);
            done = true;
        }
        
        if (done && !fin) {
            gano = winner(1);
            if (gano) {
                JOptionPane.showMessageDialog(null, "Te he ganado", "Juego", JOptionPane.PLAIN_MESSAGE);
                reset();
                fin = true;
            }
        }
        
        if (v1!=0&&v2!=0&&v3!=0&&v4!=0&&v5!=0&&v6!=0&&v7!=0&&v8!=0&&v9!=0) {
            JOptionPane.showMessageDialog(null, "Nunca podras ganarme", "Juego", JOptionPane.PLAIN_MESSAGE);
            reset();
        }
    }
    
    boolean winner(int player) {
        boolean gano = false;
        switch (player) {
            case 1:
                if (v1 == 1 && v2 == 1 && v3 == 1) {
                    gano = true;
                }
                if (v4 == 1 && v5 == 1 && v6 == 1) {
                    gano = true;
                }
                if (v7 == 1 && v8 == 1 && v9 == 1) {
                    gano = true;
                }
                if (v1 == 1 && v4 == 1 && v7 == 1) {
                    gano = true;
                }
                if (v2 == 1 && v5 == 1 && v8 == 1) {
                    gano = true;
                }
                if (v3 == 1 && v6 == 1 && v9 == 1) {
                    gano = true;
                }
                if (v1 == 1 && v5 == 1 && v9 == 1) {
                    gano = true;
                }
                if (v3 == 1 && v5 == 1 && v7 == 1) {
                    gano = true;
                }
                break;

            case 2:
                if (v1 == 2 && v2 == 2 && v3 == 2) {
                    gano = true;
                }
                if (v4 == 2 && v5 == 2 && v6 == 2) {
                    gano = true;
                }
                if (v7 == 2 && v8 == 2 && v9 == 2) {
                    gano = true;
                }
                if (v1 == 2 && v4 == 2 && v7 == 2) {
                    gano = true;
                }
                if (v2 == 2 && v5 == 2 && v8 == 2) {
                    gano = true;
                }
                if (v3 == 2 && v6 == 2 && v9 == 2) {
                    gano = true;
                }
                if (v1 == 2 && v5 == 2 && v9 == 2) {
                    gano = true;
                }
                if (v3 == 2 && v5 == 2 && v7 == 2) {
                    gano = true;
                }
                break;


        }
        return gano;
    }
    void bloqueo() {
        //primera fila horizontal
        if (v1 == 2 && v2 == 2 && v3 == 0 && !done) {
            Marcar(1, 3);
            done = true;
        }
        if (v1 == 2 && v2 == 0 && v3 == 2 && !done) {
            Marcar(1, 2);
            done = true;

        }
        if (v1 == 0 && v2 == 2 && v3 == 2 && !done) {
            Marcar(1, 1);
            done = true;
        }

        //segunda fila horizontal
        if (v4 == 2 && v5 == 2 && v6 == 0 && !done) {
            Marcar(1, 6);
            done = true;
        }
        if (v4 == 2 && v5 == 0 && v6 == 2 && !done) {
            Marcar(1, 5);
            done = true;
        }
        if (v4 == 0 && v5 == 2 && v6 == 2 && !done) {
            Marcar(1, 4);
            done = true;
        }
        //tercera fila horizontal
        if (v7 == 2 && v8 == 2 && v9 == 0 && !done) {
            Marcar(1, 9);
            done = true;
        }
        if (v7 == 2 && v8 == 0 && v9 == 2 && !done) {
            Marcar(1, 8);
            done = true;
        }
        if (v7 == 0 && v8 == 2 && v9 == 2 && !done) {
            Marcar(1, 7);
            done = true;
        }
        //primera vertical
        if (v1 == 2 && v4 == 2 && v7 == 0 && !done) {
            Marcar(1, 7);
            done = true;
        }
        if (v1 == 2 && v4 == 0 && v7 == 2 && !done) {
            Marcar(1, 4);
            done = true;
        }
        if (v1 == 0 && v4 == 2 && v7 == 2 && !done) {
            Marcar(1, 1);
            done = true;
        }
        //segunda vertical
        if (v2 == 2 && v5 == 2 && v8 == 0 && !done) {
            Marcar(1, 8);
            done = true;
        }
        if (v2 == 2 && v5 == 0 && v8 == 2 && !done) {
            Marcar(1, 5);
            done = true;
        }
        if (v2 == 0 && v5 == 2 && v8 == 2 && !done) {
            Marcar(1, 2);
            done = true;
        }
        //tercera vertical
        if (v3 == 2 && v6 == 2 && v9 == 0 && !done) {
            Marcar(1, 9);
            done = true;
        }
        if (v3 == 2 && v6 == 0 && v9 == 2 && !done) {
            Marcar(1, 6);
            done = true;
        }
        if (v3 == 0 && v6 == 2 && v9 == 2 && !done) {
            Marcar(1, 3);
            done = true;
        }
        //primera diagonal
        if (v1 == 2 && v5 == 2 && v9 == 0 && !done) {
            Marcar(1, 9);
            done = true;
        }
        if (v1 == 2 && v5 == 0 && v9 == 2 && !done) {
            Marcar(1, 5);
            done = true;
        }
        if (v1 == 0 && v5 == 2 && v9 == 2 && !done) {
            Marcar(1, 1);
            done = true;
        }
        //segunda diagonal
        if (v3 == 2 && v5 == 2 && v7 == 0 && !done) {
            Marcar(1, 7);
            done = true;
        }
        if (v3 == 2 && v5 == 0 && v7 == 2 && !done) {
            Marcar(1, 5);
            done = true;
        }
        if (v3 == 0 && v5 == 2 && v7 == 2 && !done) {
            Marcar(1, 3);
            done = true;

        }


    }
    
    void ganar() {    

        if (v1 == 1 && v2 == 1 && v3 == 0 && !done) {
            Marcar(1, 3);

            done = true;
        }
        if (v1 == 1 && v2 == 0 && v3 == 1 && !done) {
            Marcar(1, 2);
            done = true;

        }
        if (v1 == 0 && v2 == 1 && v3 == 1 && !done) {
            Marcar(1, 1);
            done = true;
        }

        //segunda fila horizontal
        if (v4 == 1 && v5 == 1 && v6 == 0 && !done) {
            Marcar(1, 6);
            done = true;
        }
        if (v4 == 1 && v5 == 0 && v6 == 1 && !done) {
            Marcar(1, 5);
            done = true;
        }
        if (v4 == 0 && v5 == 1 && v6 == 1 && !done) {
            Marcar(1, 4);
            done = true;
        }
        //tercera fila horizontal
        if (v7 == 1 && v8 == 1 && v9 == 0 && !done) {
            Marcar(1, 9);
            done = true;
        }
        if (v7 == 1 && v8 == 0 && v9 == 1 && !done) {
            Marcar(1, 8);
            done = true;
        }
        if (v7 == 0 && v8 == 1 && v9 == 1 && !done) {
            Marcar(1, 7);
            done = true;
        }
        //primera vertical
        if (v1 == 1 && v4 == 1 && v7 == 0 && !done) {
            Marcar(1, 7);
            done = true;
        }
        if (v1 == 1 && v4 == 0 && v7 == 1 && !done) {
            Marcar(1, 4);
            done = true;
        }
        if (v1 == 0 && v4 == 1 && v7 == 1 && !done) {
            Marcar(1, 1);
            done = true;
        }
        //segunda vertical
        if (v2 == 1 && v5 == 1 && v8 == 0 && !done) {
            Marcar(1, 8);
            done = true;
        }
        if (v2 == 1 && v5 == 0 && v8 == 1 && !done) {
            Marcar(1, 5);
            done = true;
        }
        if (v2 == 0 && v5 == 1 && v8 == 1 && !done) {
            Marcar(1, 2);
            done = true;
        }
        //tercera vertical
        if (v3 == 1 && v6 == 1 && v9 == 0 && !done) {
            Marcar(1, 9);
            done = true;
        }
        if (v3 == 1 && v6 == 0 && v9 == 1 && !done) {
            Marcar(1, 6);
            done = true;
        }
        if (v3 == 0 && v6 == 1 && v9 == 1 && !done) {
            Marcar(1, 3);

            done = true;
        }
        //primera diagonal
        if (v1 == 1 && v5 == 1 && v9 == 0 && !done) {
            Marcar(1, 9);
            done = true;
        }
        if (v1 == 1 && v5 == 0 && v9 == 1 && !done) {
            Marcar(1, 5);
            done = true;
        }
        if (v1 == 0 && v5 == 1 && v9 == 1 && !done) {
            Marcar(1, 1);
            done = true;
        }
        //segunda diagonal
        if (v3 == 1 && v5 == 1 && v7 == 0 && !done) {
            Marcar(1, 7);
            done = true;
        }
        if (v3 == 1 && v5 == 0 && v7 == 1 && !done) {
            Marcar(1, 5);
            done = true;
        }
        if (v3 == 0 && v5 == 1 && v7 == 1 && !done) {
            Marcar(1, 3);

            done = true;
        }


    }

    void centro() {

        if (v5 == 0 && !done) {
            Marcar(1, 5);
            done = true;
        }

    }

    void recorrer() {
        if (v1 == 0 && !done) {
            Marcar(1, 1);
            done = true;
        }
        if (v2 == 0 && !done) {
            Marcar(1, 2);
            done = true;
           
        }
        if (v3 == 0 && !done) {
            Marcar(1, 3);
            done = true;
            
        }
        if (v4 == 0 && !done) {
            Marcar(1, 4);
            done = true;
        }
        if (v5 == 0 && !done) {
            Marcar(1, 5);
            done = true;
        }
        if (v6 == 0 && !done) {
            Marcar(1, 6);
            done = true;
        }
        if (v7 == 0 && !done) {
            Marcar(1, 7);
            done = true;
        }
        if (v8 == 0 && !done) {
            Marcar(1, 8);
            done = true;
        }
        if (v9 == 0 && !done) {
            Marcar(1, 9);
            done = true;
        }

    }

   void allBloqueo(){
            if(v4==2&&v5==1&&v9==2&&v7==0&&!done){
                Marcar(1,7);
                done=true;
            }
            if(v1==2&&v5==1&&v9==2&&v8==0&& !done){
                Marcar(1,8);
                done=true;
            }
            if(v3==2&&v5==1&&v7==2&&v4==0&& !done){
                Marcar(1,4);
                done=true;
            }
            if(v3==2&&v5==1&&v8==2&&v6==0&&!done){
                Marcar(1,6);
                done=true;
            }
            if(v1==2&&v5==1&&v8==2&&v7==0&&!done){
                Marcar(1,7);
                done=true;
            }

   }
    
    
    /**
     * Creates new form juegogato
     */
    public juegogato() {
        initComponents();
        centrarVentana();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego 3 en raya");

        p1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        p2.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });

        p3.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });

        p4.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });

        p5.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });

        p6.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });

        p7.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });

        p8.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });

        p9.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p4)
                    .addComponent(p1)
                    .addComponent(p7))
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p2)
                    .addComponent(p5)
                    .addComponent(p8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        Marcar(2, 1);
        Computadora();
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
       Marcar(2, 2);
       Computadora();
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
       Marcar(2, 3);
       Computadora();
    }//GEN-LAST:event_p3ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
      Marcar(2, 4);
      Computadora();
    }//GEN-LAST:event_p4ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
      Marcar(2, 5);
      Computadora();
    }//GEN-LAST:event_p5ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
       Marcar(2, 6);
       Computadora();
    }//GEN-LAST:event_p6ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed
       Marcar(2, 7);
       Computadora();
    }//GEN-LAST:event_p7ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
       Marcar(2, 8);
       Computadora();
    }//GEN-LAST:event_p8ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
       Marcar(2, 9);
       Computadora();
    }//GEN-LAST:event_p9ActionPerformed

   
    
    
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
            java.util.logging.Logger.getLogger(juegogato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juegogato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juegogato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juegogato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juegogato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton p1;
    private javax.swing.JButton p2;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    // End of variables declaration//GEN-END:variables
}

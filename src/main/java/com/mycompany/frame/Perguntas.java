/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.frame;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JCheckBox;

/**
 *
 * @author uept42-user
 */
public class Perguntas extends javax.swing.JFrame {

    /**
     * Creates new form Perguntas
     */
    public Perguntas() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vf3lbl = new javax.swing.JComboBox<>();
        vf1lbl = new javax.swing.JComboBox<>();
        vf2lbl = new javax.swing.JComboBox<>();
        vf4lbl = new javax.swing.JComboBox<>();
        vf5lbl = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        somalbl = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btncorreto = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        btnenviar = new javax.swing.JButton();
        ck1 = new javax.swing.JCheckBox();
        ck2 = new javax.swing.JCheckBox();
        ck4 = new javax.swing.JCheckBox();
        ck3 = new javax.swing.JCheckBox();
        ck5 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Questionário valendo biblioteconomia na UEL");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("1) Diga qual dessas é verdadeiro ou falso:");

        vf3lbl.setBackground(new java.awt.Color(255, 255, 255));
        vf3lbl.setForeground(new java.awt.Color(0, 0, 0));
        vf3lbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "F" }));
        vf3lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vf1lbl.setBackground(new java.awt.Color(255, 255, 255));
        vf1lbl.setForeground(new java.awt.Color(0, 0, 0));
        vf1lbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "F" }));
        vf1lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vf1lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vf1lblActionPerformed(evt);
            }
        });

        vf2lbl.setBackground(new java.awt.Color(255, 255, 255));
        vf2lbl.setForeground(new java.awt.Color(0, 0, 0));
        vf2lbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "F" }));
        vf2lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vf2lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vf2lblActionPerformed(evt);
            }
        });

        vf4lbl.setBackground(new java.awt.Color(255, 255, 255));
        vf4lbl.setForeground(new java.awt.Color(0, 0, 0));
        vf4lbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "F" }));
        vf4lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vf4lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vf4lblActionPerformed(evt);
            }
        });

        vf5lbl.setBackground(new java.awt.Color(255, 255, 255));
        vf5lbl.setForeground(new java.awt.Color(0, 0, 0));
        vf5lbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "F" }));
        vf5lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vf5lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vf5lblActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("A Terra é o terceiro planeta a partir do Sol. ");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Saturno é o planeta mais próximo do Sol. ");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vênus é conhecido como o \"planeta vermelho\".");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Júpiter é o maior planeta do sistema solar.");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Mercúrio tem anéis ao seu redor.");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("2) Diga a somatória das alternativas verdadeiras sobre fauna a seguir:");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("02. Os golfinhos são mamíferos.");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("04. Todos os tubarões são peixes de água doce.");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("08. A maioria das aves pode voar.");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("12. Os cangurus são nativos da América do Sul.");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("16. As abelhas são importantes para a polinização.");

        somalbl.setBackground(new java.awt.Color(255, 255, 255));
        somalbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        somalbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somalblActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Digite a soma dos numeros corretos:");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("3) Qual é o maior animal terrestre do mundo?");

        buttonGroup1.add(btncorreto);
        btncorreto.setForeground(new java.awt.Color(0, 0, 0));
        btncorreto.setText("Elefante");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Girafa");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setText("Hipopótamo");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton5.setText("Rinoceronte");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton6.setText("Urso-polar");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("4) Selecione apenas as alternativas ERRADAS:");

        btnenviar.setText("Enviar");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });

        ck1.setText("A capital do Brasil é Brasília.");

        ck2.setText("A Terra é plana.");

        ck4.setText("A água ferve a 100°C ao nível do mar.");

        ck3.setText("O Sol gira em torno da Terra.");
        ck3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ck3ActionPerformed(evt);
            }
        });

        ck5.setText("Os cães são mamíferos.");
        ck5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ck5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(vf4lbl, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                    .addComponent(vf3lbl, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                    .addComponent(vf2lbl, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                    .addComponent(vf5lbl, 0, 1, Short.MAX_VALUE)
                                    .addComponent(vf1lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))))
                            .addComponent(jLabel8)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(ck1)
                            .addComponent(ck2)
                            .addComponent(ck4)
                            .addComponent(ck3)
                            .addComponent(ck5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(somalbl, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(btncorreto)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnenviar)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vf1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vf2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vf3lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vf4lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vf5lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(11, 11, 11)
                .addComponent(somalbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(btncorreto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(ck1)
                .addGap(18, 18, 18)
                .addComponent(ck2)
                .addGap(18, 18, 18)
                .addComponent(ck3)
                .addGap(18, 18, 18)
                .addComponent(ck4)
                .addGap(18, 18, 18)
                .addComponent(ck5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnenviar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vf1lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vf1lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vf1lblActionPerformed

    private void vf2lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vf2lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vf2lblActionPerformed

    private void vf4lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vf4lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vf4lblActionPerformed

    private void vf5lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vf5lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vf5lblActionPerformed

    private void somalblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somalblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_somalblActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void ck3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ck3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ck3ActionPerformed

    private void ck5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ck5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ck5ActionPerformed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        // TODO add your handling code here:
        Respostas respostas = new Respostas();
        Perguntas perguntas = new Perguntas();
        List<String> v_ou_f = new ArrayList<>();
        List<String> v_ou_f_certo = new ArrayList<>(Arrays.asList("V", "F", "F", "V", "F"));
        
        String vf1 = (String) vf1lbl.getSelectedItem();
        v_ou_f.add(vf1);
        String vf2 = (String) vf2lbl.getSelectedItem();
        v_ou_f.add(vf2);
        String vf3 = (String) vf3lbl.getSelectedItem();
        v_ou_f.add(vf3);
        String vf4 = (String) vf4lbl.getSelectedItem();
        v_ou_f.add(vf4);
        String vf5 = (String) vf5lbl.getSelectedItem();
        v_ou_f.add(vf5);
        
        String voufstring = String.join(", ", v_ou_f);
        String voufcertostring = String.join(", ", v_ou_f_certo);
        
        if (voufstring.equals(voufcertostring)) {
            respostas.resposta1.setText("Correto");
        } else {
            respostas.resposta1.setText("Errado");
        }
        
        String somastr = somalbl.getText();
        int soma = Integer.parseInt(somastr);
        if (soma == 26) {
            respostas.resposta2.setText("Correto");
        } else if (somalbl.getText().isEmpty() || soma != 26){
            respostas.resposta2.setText("Errado");
        }
        
        if(btncorreto.isSelected()) {
            respostas.resposta3.setText("Correto");
        } else {
            respostas.resposta3.setText("Errado");
        }
        
        List<JCheckBox> checkboxes = new ArrayList<JCheckBox>(Arrays.asList(ck1, ck2, ck3, ck4, ck5));
        List<JCheckBox> ck_desejados = new ArrayList<JCheckBox>(Arrays.asList(ck2, ck3));
        boolean TodosCkCorretos = true;
        for(JCheckBox checkbox : checkboxes) {
            if(checkbox.isSelected()) {
                if(!ck_desejados.contains(checkbox)) {
                    TodosCkCorretos = false;
                }
            } else {
                TodosCkCorretos = false;
            }
        }
        
        if (TodosCkCorretos) {
            respostas.resposta4.setText("Correto");
        } else {
            respostas.resposta4.setText("Errado");
        }
        
        respostas.setVisible(true);
        perguntas.dispose();
        perguntas = null;
    }//GEN-LAST:event_btnenviarActionPerformed

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
            java.util.logging.Logger.getLogger(Perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btncorreto;
    private javax.swing.JButton btnenviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ck1;
    private javax.swing.JCheckBox ck2;
    private javax.swing.JCheckBox ck3;
    private javax.swing.JCheckBox ck4;
    private javax.swing.JCheckBox ck5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JTextField somalbl;
    public javax.swing.JComboBox<String> vf1lbl;
    private javax.swing.JComboBox<String> vf2lbl;
    private javax.swing.JComboBox<String> vf3lbl;
    private javax.swing.JComboBox<String> vf4lbl;
    private javax.swing.JComboBox<String> vf5lbl;
    // End of variables declaration//GEN-END:variables
}

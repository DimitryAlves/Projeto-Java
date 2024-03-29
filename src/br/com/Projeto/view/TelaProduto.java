/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.Projeto.view;

import br.com.Projeto.dao.ProdutoDao;
import br.com.Projeto.model.Produto;

/**
 *
 * @author silva
 */
public class TelaProduto extends javax.swing.JFrame {

    /**
     * Creates new form Produto
     */
    public TelaProduto() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        btUsuario = new javax.swing.JButton();
        btVenda = new javax.swing.JButton();
        btGerenciamento = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        txtPreco = new javax.swing.JFormattedTextField();
        txtValidade = new javax.swing.JFormattedTextField();
        txtFabricacao = new javax.swing.JFormattedTextField();
        txtLote = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        cbSabor = new javax.swing.JComboBox<>();
        Editar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btUsuario.setText("Usuário");
        btUsuario.setToolTipText("Usuário");
        btUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(btUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 237, 50, 30));

        btVenda.setBackground(new java.awt.Color(204, 204, 204));
        btVenda.setForeground(new java.awt.Color(0, 0, 0));
        btVenda.setText("Venda");
        btVenda.setToolTipText("Venda");
        btVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVendaMouseClicked(evt);
            }
        });
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 50, 26));

        btGerenciamento.setBackground(new java.awt.Color(204, 204, 204));
        btGerenciamento.setForeground(new java.awt.Color(0, 0, 0));
        btGerenciamento.setText("Gerenciamento");
        btGerenciamento.setToolTipText("Gerenciamento");
        btGerenciamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btGerenciamentoMouseClicked(evt);
            }
        });
        getContentPane().add(btGerenciamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 50, 30));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Produto");
        jButton4.setToolTipText("Produto");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 26));

        btCliente.setBackground(new java.awt.Color(204, 204, 204));
        btCliente.setForeground(new java.awt.Color(0, 0, 0));
        btCliente.setText("Cliente");
        btCliente.setToolTipText("Cliente");
        btCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btClienteMouseClicked(evt);
            }
        });
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 50, 26));

        Excluir.setBackground(new java.awt.Color(204, 204, 204));
        Excluir.setForeground(new java.awt.Color(0, 0, 0));
        Excluir.setText("EXCLUIR");
        Excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExcluirMouseClicked(evt);
            }
        });
        getContentPane().add(Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 170, 40));

        btSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 400, 170, 40));

        txtPreco.setBackground(new java.awt.Color(204, 204, 204));
        txtPreco.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$###,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 298, 105, 30));

        txtValidade.setBackground(new java.awt.Color(204, 204, 204));
        txtValidade.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 140, 30));

        txtFabricacao.setBackground(new java.awt.Color(204, 204, 204));
        txtFabricacao.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtFabricacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 222, 140, 30));

        txtLote.setBackground(new java.awt.Color(204, 204, 204));
        txtLote.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 90, 30));

        txtQuantidade.setBackground(new java.awt.Color(204, 204, 204));
        txtQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 185, 110, 30));

        cbSabor.setBackground(new java.awt.Color(204, 204, 204));
        cbSabor.setForeground(new java.awt.Color(0, 0, 0));
        cbSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "....", "Acerola", "Maracujá", "Caju" }));
        getContentPane().add(cbSabor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 148, 110, 30));

        Editar.setBackground(new java.awt.Color(204, 204, 204));
        Editar.setForeground(new java.awt.Color(0, 0, 0));
        Editar.setText("EDITAR");
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarMouseClicked(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 400, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Projeto/imagens/Tela 1 (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVendaActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btClienteActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        Produto pro = new Produto();
        
        pro.setLote(Integer.parseInt(txtLote.getText()));
        pro.setSabor(cbSabor.getSelectedItem().toString());
        pro.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        pro.setFabricacao(txtFabricacao.getText());
        pro.setValidade(txtValidade.getText());
        pro.setPreco(txtPreco.getText());
        
        ProdutoDao dao = new ProdutoDao();
        dao.salvarProduto(pro);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        // TODO add your handling code here:
        
        Produto pro = new Produto();
        
        pro.setLote(Integer.parseInt(txtLote.getText()));
        pro.setSabor(cbSabor.getSelectedItem().toString());
        pro.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        pro.setFabricacao(txtFabricacao.getText());
        pro.setValidade(txtValidade.getText());
        pro.setPreco(txtPreco.getText());
         
         
        ProdutoDao dao = new ProdutoDao();
        dao.editarProduto(pro);
    }//GEN-LAST:event_EditarMouseClicked

    private void ExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExcluirMouseClicked
        // TODO add your handling code here:
        
        Produto pro = new Produto();
        
        pro.setLote(Integer.parseInt(txtLote.getText()));
        
        ProdutoDao dao = new ProdutoDao();
        dao.excluirProduto(pro);
    }//GEN-LAST:event_ExcluirMouseClicked

    private void btClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteMouseClicked
        TelaCliente cli = new TelaCliente();
        cli.setVisible(true);
    }//GEN-LAST:event_btClienteMouseClicked

    private void btVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVendaMouseClicked
         TelaVenda vend = new TelaVenda();
        vend.setVisible(true);
    }//GEN-LAST:event_btVendaMouseClicked

    private void btGerenciamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGerenciamentoMouseClicked
         Gerenciamento g = new Gerenciamento();
        g.setVisible(true);
    }//GEN-LAST:event_btGerenciamentoMouseClicked

    private void btUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUsuarioMouseClicked
        TelaUsuario user = new TelaUsuario();
        user.setVisible(true);
    }//GEN-LAST:event_btUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btGerenciamento;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btUsuario;
    private javax.swing.JButton btVenda;
    public javax.swing.JComboBox<String> cbSabor;
    private javax.swing.JButton jButton4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JFormattedTextField txtFabricacao;
    public javax.swing.JTextField txtLote;
    public javax.swing.JFormattedTextField txtPreco;
    public javax.swing.JTextField txtQuantidade;
    public javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}

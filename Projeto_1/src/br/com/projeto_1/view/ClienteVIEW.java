
package br.com.projeto_1.view;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import br.com.projeto_1.dto.ClienteDTO;
import br.com.projeto_1.ctr.ClienteCTR;

/**
 *
 * @author jessevitorino
 */
public class ClienteVIEW extends javax.swing.JInternalFrame {

    ClienteDTO clienteDTO = new ClienteDTO(); //criar objeto clienteDTO
    ClienteCTR clienteCTR = new ClienteCTR(); //criar objeto clienteCTR

    int gravar_alterar; //Variavel usada para saber se esta alterando ou incluindo
    ResultSet rs; //Variavel usada para prenchimento da tabela e dos campos 
    DefaultTableModel modelo_jtl_consultar_cliente; // variavel para guardar o modelo da tabela 


    public ClienteVIEW() {
        initComponents();

        liberaCampos(false);

        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_cliente = (DefaultTableModel) jtl_consultar_cliente.getModel();
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nome_cli = new javax.swing.JTextField();
        logradouro_cli = new javax.swing.JTextField();
        numero_cli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bairro_cli = new javax.swing.JTextField();
        cidade_cli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cep_cli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cpf_cli = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rg_cli = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        estado_cli = new javax.swing.JComboBox<>();
        pesquisa_nome_cli = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_cliente = new javax.swing.JTable();

        Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setText("Nome:");

        jLabel3.setText("Logradouro:");

        jLabel4.setText("Número:");

        jLabel5.setText("Cidade:");

        jLabel6.setText("CEP:");

        numero_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_cliActionPerformed(evt);
            }
        });

        jLabel7.setText("Bairro:");

        jLabel8.setText("Estado:");

        jLabel9.setText("RG:");

        jLabel10.setText("CPF:");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        btnExcluir.setText("Excluir");

        btnSair.setText("Sair");

        estado_cli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estado_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_cliActionPerformed(evt);
            }
        });

        pesquisa_nome_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_nome_cliActionPerformed(evt);
            }
        });

        btnPesquisar.setText("OK");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel11.setText("Nome:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel12.setText("Consulta");

        jtl_consultar_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_clienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtl_consultar_cliente);
        if (jtl_consultar_cliente.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_cliente.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_cliente.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout LabelLayout = new javax.swing.GroupLayout(Label);
        Label.setLayout(LabelLayout);
        LabelLayout.setHorizontalGroup(
            LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LabelLayout.createSequentialGroup()
                        .addComponent(cidade_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LabelLayout.createSequentialGroup()
                        .addComponent(numero_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairro_cli))
                    .addComponent(logradouro_cli)
                    .addComponent(nome_cli)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelLayout.createSequentialGroup()
                        .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LabelLayout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(btnSalvar))
                            .addGroup(LabelLayout.createSequentialGroup()
                                .addComponent(cep_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)))
                        .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cpf_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(36, 36, 36)
                                .addComponent(rg_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnSair))))
                    .addGroup(LabelLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LabelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesquisa_nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LabelLayout.setVerticalGroup(
            LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelLayout.createSequentialGroup()
                .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LabelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(logradouro_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(bairro_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LabelLayout.createSequentialGroup()
                                .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cidade_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cep_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(cpf_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(rg_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNovo)
                                    .addComponent(btnSalvar)
                                    .addComponent(btnExcluir)
                                    .addComponent(btnSair)
                                    .addComponent(btnCancelar)))
                            .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(estado_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))))
                    .addGroup(LabelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesquisa_nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estado_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_cliActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void numero_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_cliActionPerformed

    }//GEN-LAST:event_numero_cliActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (gravar_alterar == 1) {
            gravar();
            gravar_alterar = 0;
        }
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void pesquisa_nome_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_nome_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisa_nome_cliActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
       preencheTabela(pesquisa_nome_cli.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jtl_consultar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_clienteMouseClicked
        preencheCampos(Integer.parseInt(String.valueOf(
        jtl_consultar_cliente.getValueAt(
        jtl_consultar_cliente.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_clienteMouseClicked

    private void liberaCampos(boolean a) {
        nome_cli.setEnabled(a);
        logradouro_cli.setEnabled(a);
        numero_cli.setEnabled(a);
        bairro_cli.setEnabled(a);
        cidade_cli.setEnabled(a);
        estado_cli.setEnabled(a);
        cep_cli.setEnabled(a);
        cpf_cli.setEnabled(a);
        rg_cli.setEnabled(a);
    }

    private void limpaCampos() {
        nome_cli.setText("");
        logradouro_cli.setText("");
        numero_cli.setText("");
        bairro_cli.setText("");
        cidade_cli.setText("");
        cep_cli.setText("");
        cpf_cli.setText("");
        rg_cli.setText("");
    }

    private void liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e) {

        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnExcluir.setEnabled(d);
        btnSair.setEnabled(e);
    }

    //gravar
    public void gravar() {
        try {
            clienteDTO.setNome_cli(nome_cli.getText());
            clienteDTO.setLogradouro_cli(logradouro_cli.getText());
            clienteDTO.setNumero_cli(Integer.parseInt(numero_cli.getText()));
            clienteDTO.setBairro_cli(bairro_cli.getText());
            clienteDTO.setCidade_cli(cidade_cli.getText());
            clienteDTO.setEstado_cli(estado_cli.getSelectedItem().toString());
            clienteDTO.setCep_cli(cep_cli.getText());
            clienteDTO.setCpf_cli(cpf_cli.getText());
            clienteDTO.setRg_cli(rg_cli.getText());

            JOptionPane.showMessageDialog(null, clienteCTR.inserirCliente(clienteDTO));
        } catch (Exception e) {
            System.out.println("Erro ao gravar " + e.getMessage());
        }
    }

    private void preencheTabela(String nome_cli) {
        try {

            //Limpar todas as linhas 
            modelo_jtl_consultar_cliente.setNumRows(0);
            //Enquanto tiver linhas - faça
            clienteDTO.setNome_cli(nome_cli);
            rs = clienteCTR.consultarCliente(clienteDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_cliente.addRow(new Object []{
                        rs.getString("id_cli"),
                        rs.getString("nome_cli") ,
                        
                
                
            });
        }
    }
        catch(Exception erTab) {
            System.out.println("Erro SQL : "+erTab);
            }
        finally{
                clienteCTR.CloseDB();
                }
    }
    private void preencheCampos(int id_cliente){
        try{
            clienteDTO.setId_cli(id_cliente);
            rs = clienteCTR.consultarCliente(clienteDTO,2);
            if(rs.next()){
                limpaCampos ();
            }
        }
        catch(Exception erTab) {
            System.out.print("Error SQL: "+erTab);
        }
        finally{
            clienteCTR.CloseDB();
        }
    }//Fechar metodo prencheCampos

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Label;
    private javax.swing.JTextField bairro_cli;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cep_cli;
    private javax.swing.JTextField cidade_cli;
    private javax.swing.JTextField cpf_cli;
    private javax.swing.JComboBox<String> estado_cli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtl_consultar_cliente;
    private javax.swing.JTextField logradouro_cli;
    private javax.swing.JTextField nome_cli;
    private javax.swing.JTextField numero_cli;
    private javax.swing.JTextField pesquisa_nome_cli;
    private javax.swing.JTextField rg_cli;
    // End of variables declaration//GEN-END:variables

    
}

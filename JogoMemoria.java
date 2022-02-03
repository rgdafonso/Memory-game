
package jogo;

import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class JogoMemoria extends javax.swing.JFrame {

    boolean Novo_Jogo = true;
    boolean Re_Iniciar = false;
    
    int Cont_Acertos, Primeiro_Click, Segundo_Click;
    int Numero_Click, posi, cont, pontos_Anterior, Maior_Pontuacao_do_Jogador;
    int Partidas_jogadas = 0, Numero_de_Vitorias = 0;
    
    public JButton cartas[] = new JButton[16];
    
    Random RandomNumber = new Random();
    int Aleatorio[] = new int[16];
    int Posicao_do_vetor_Aleatorio[] = new int[16];
    
    public JogoMemoria() {
        initComponents();
        
        panel.setSize(800, 800); // tamanho do painel
        setSize(800, 800); // tamanho do painel
        setLocationRelativeTo(null); // centraliza a tela.
        panel.setLayout(new GridLayout(4, 4)); // Seta o Layout como um 4 por 4 por causa das 16 figurinhas.
        for (int i = 0; i < 16; i++) { // percorre o conjunto de botões
            cartas[i] = new JButton(); // Instancia os botões em ordem, ou seja, agora eles vão existir.
            panel.add(cartas[i]); // adiciona ao painel criado no drag and drop os botões em sequencia
            cartas[i].setVisible(true); // Seta como visivel os botões.
            
        }
        Eventos_JogoDaMemoria Handler = new Eventos_JogoDaMemoria(cartas, RandomNumber, Posicao_do_vetor_Aleatorio, Aleatorio);
        for (int i = 0; i < 16; ++i) {
            cartas[i].addActionListener(Handler);
        }
        
    }
    
    public void Resetar() {
        Novo_Jogo = true;
        Re_Iniciar = false;
        for (int i = 0; i < 16; ++i) {
            cartas[i].setIcon(null);
            cartas[i].setEnabled(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));

        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Resetar();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(JogoMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    class Eventos_JogoDaMemoria implements ActionListener {
        
        public String abobora = "/resources/abobora.png";
        public String frank = "/resources/frank.png";
        public String gato = "/resources/gato.png";
        public String bruxa = "/resources/bruxa.png";
        public String morcego = "/resources/morcego.png";
        public String fantasma = "/resources/fantasma.png";
        public String tucano = "/resources/tucano.jpg";
        public String cavalo = "/resources/candy.jpg";
        
        int Cont_Acertos, Primeiro_Click, Segundo_Click;
        int Numero_Click, posi, cont, pontos_Anterior, Maior_Pontuacao_do_Jogador;
        int Partidas_jogadas = 0, Numero_de_Vitorias = 0;
        
        boolean Fim_de_Jogo = false;
        Random RandomNumber;
        int Aleatorio[];
        int Posicao_do_vetor_Aleatorio[];
        JButton cartas[];
        
        public Eventos_JogoDaMemoria(JButton[] J, Random n, int[] a, int[] b) {
            cartas = J;
            Posicao_do_vetor_Aleatorio = a;
            Aleatorio = b;
            RandomNumber = n;
        }
        
        public void actionPerformed(ActionEvent event) {            
            
            if (Novo_Jogo == true) {                
                
                Cont_Acertos = 0;
                Partidas_jogadas++;
                Numero_Click = 0;
                posi = 0;
                cont = 16;
                Primeiro_Click = 0;
                Segundo_Click = 0;
                
                for (int i = 0; i < 16; ++i) {
                    cartas[i].setText(null);
                    cartas[i].setEnabled(true);
                }
                
                if (Re_Iniciar == false) {
                    
                    for (int i = 0; i < 16; ++i) {
                        Posicao_do_vetor_Aleatorio[i] = i;
                    }
                    
                    for (int i = 0; i < 8; ++i) {
                        for (int j = 0; j < 2; ++j) {
                            posi = RandomNumber.nextInt(cont);
                            Aleatorio[Posicao_do_vetor_Aleatorio[posi]] = i;
                            
                            if (posi < cont) {
                                for (int q = (posi + 1); q < (cont); ++q) {
                                    Posicao_do_vetor_Aleatorio[q - 1] = Posicao_do_vetor_Aleatorio[q];
                                }
                            }
                            cont--;
                        }
                    }
                }
                Novo_Jogo = false;
            }
            
            for (int i = 0; i < 16; ++i) {
                String caminho = "";
                if (event.getSource() == cartas[i]) {                    
                    if (Aleatorio[i] == 0) {
                        caminho = abobora;                        
                        cartas[i].setIcon(new ImageIcon(getClass().getResource(caminho)));                        
                    }
                    if (Aleatorio[i] == 1) {
                        caminho = gato;
                        cartas[i].setIcon(new ImageIcon(getClass().getResource(caminho)));                        
                    }
                    if (Aleatorio[i] == 2) {
                        caminho = bruxa;
                        cartas[i].setIcon(new ImageIcon(getClass().getResource(caminho)));                        
                    }
                    if (Aleatorio[i] == 3) {
                        caminho = frank;
                        cartas[i].setIcon(new ImageIcon(getClass().getResource(caminho)));                        
                    }
                    if (Aleatorio[i] == 4) {
                        caminho = fantasma;
                        cartas[i].setIcon(new ImageIcon(getClass().getResource(caminho)));                        
                    }
                    if (Aleatorio[i] == 5) {
                        caminho = morcego;
                        cartas[i].setIcon(new ImageIcon(getClass().getResource(caminho)));                        
                    }
                    if (Aleatorio[i] == 6) {
                        caminho = tucano;
                        cartas[i].setIcon(new ImageIcon(getClass().getResource(caminho)));                        
                    }
                    
                    if (Aleatorio[i] == 7) {
                        caminho = cavalo;
                        cartas[i].setIcon(new ImageIcon(getClass().getResource(caminho)));                        
                    }

                    cartas[i].setEnabled(false);
                    cartas[i].setVisible(true);
                    Numero_Click++;
                    
                    if (Numero_Click == 1) {
                        Primeiro_Click = i;
                    }
                    if (Numero_Click == 2) {
                        Segundo_Click = i;
                        if (Aleatorio[Primeiro_Click] != Aleatorio[Segundo_Click]) {                            
                            
                            JOptionPane.showMessageDialog(null, "Errado");                            
                            cartas[Primeiro_Click].setText("");
                            cartas[Primeiro_Click].setIcon(null);
                            cartas[Segundo_Click].setText("");
                            cartas[Segundo_Click].setIcon(null);
                            cartas[Primeiro_Click].setEnabled(true);
                            cartas[Segundo_Click].setEnabled(true);                            
                            
                        } else {
                            cartas[Primeiro_Click].setEnabled(false);
                            cartas[Segundo_Click].setEnabled(false);                            
                            Cont_Acertos++;
                        }
                        Numero_Click = 0;
                    }
                }
            }
            
            if (Cont_Acertos == 8) {
                int win = JOptionPane.showConfirmDialog(null, "Parabéns voce ganhou, deseja tentar denovo?");
                if (win == 0) {
                    Resetar();
                } else {
                    System.exit(0);
                }
            }
            
        }
    }
}

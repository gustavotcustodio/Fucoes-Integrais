package integrais;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Integrais extends javax.swing.JFrame {
    int l = 0;
    double valInicial, valFinal, valFuncao, intervaloX, intervaloY, valAtual, area;

    // Cria formulário integrais
    public Integrais() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jLabel1.setText("Área =  0.0");
        jLabel1.setName(""); // NOI18N

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Função:");

        jLabel3.setText("Valor inicial:");

        jLabel4.setText("Valor final:");

        jLabel5.setText("dx");

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("0");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("0");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("0");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("0");

        jLabel10.setText("Volume eixo x = 0.0");
        jLabel10.setName(""); // NOI18N

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText("Logaritmo: l(n)     Seno: s(n)     Cosseno: c(n)     Tangente: t(n)");

        jLabel12.setText("PI: p   Euler: e");

        jLabel13.setText("Campos valor final e inicial apenas valores numéricos");

        jLabel14.setText("Números decimais separados por pontos, não vírgulas");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jButton2)
                        .addGap(8, 8, 8)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(272, 272, 272)
                                .addComponent(jLabel8)))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)))
                .addGap(0, 121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged
    }//GEN-LAST:event_jTextField1InputMethodTextChanged

private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // Se o usuário digitar mais de 80 caracteres, recebe uma mensagem de erro
        if (jTextField1.getText().length() + 1 > 80) {
            JOptionPane.showMessageDialog(null, "Tente uma função menor (Máximo 80 caracteres)",
                "Erro", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
        }
}//GEN-LAST:event_jTextField1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Chama a classe graphics, seleciona a cor branca, e desenha um retângulo
        Graphics g = this.getGraphics();
        g.setColor(new Color(255, 255, 255));
        // Posição  horizontal, vertical, largura, altura
        g.fillRect(453, 33, 304, 304);
        inicio();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Graphics g = this.getGraphics();
        g.setColor(new Color(255, 255, 255));
        // Limpa os campos e o gráfico
        g.fillRect(453, 33, 304, 304);
        jLabel1.setText("Área = 0.0");
        jLabel6.setText("0");
        jLabel7.setText("0");
        jLabel8.setText("0");
        jLabel9.setText("0");
        jLabel10.setText("Volume eixo x = 0.0");       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    // Fecha o formulário    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void limpaCampos() {
        // Zera as variáveis globais e os campos de texto
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        valInicial = 0;
        valFinal = 0;
        intervaloX = 0;
        intervaloY = 0;
        l = 0;
        area = 0;
    }

    public void inicio() {
        // Tenta converter o valor do campo de texto para uma variável double
        try {
            valInicial = Double.parseDouble(jTextField2.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inicial inválido",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            limpaCampos();
        }
        try {
            valFinal = Double.parseDouble(jTextField3.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor final inválido",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            limpaCampos();
        }
        // Calcula os intervalos entre os valores do eixo x
        intervaloX = (valFinal - valInicial) / 120000;
        // Se o intervalo é maior que zero, a integral é calculada normalmente
        if (intervaloX > 0) {
            //Se o valor do campo função for nulo, o usuário recebe uma mensagem de erro
            if (jTextField1.getText() == null || jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Função inválida",
                    "Erro", JOptionPane.ERROR_MESSAGE);
                limpaCampos();
            /* Se o valor final é maior que o inicial e o campo de texto função 
             * não é nulo, o programa segue calculando a integral */
            } else {
                String funcao = jTextField1.getText();
                area = calcula(funcao);
                jLabel1.setText("Área = " + area);
                double volume = Math.PI * Math.pow(area, 2);
                jLabel10.setText("Volume eixo x = " + volume);
                limpaCampos();
            }
        /* Se o intervalo é igual a 0, a função possui um único ponto, portanto 
         * a área e o volume serão iguais a zero */
        } else if (intervaloX == 0) {
            jLabel1.setText("Área = 0.0");
            jLabel10.setText("Volume eixo x = 0.0");
            area = 0;
            limpaCampos();
        // Se o valor final é menor que o inicial, o usuário recebe uma mensagem de erro
        } else {
            JOptionPane.showMessageDialog(null, "Valor final menor que o inicial",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            limpaCampos();
        }
    }
    
    // Módulo calcula a área embaixo da curva e plota o gráfico
    public double calcula(String funcao) {
        Graphics g = this.getGraphics();            
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.MAX_VALUE;
        /* Realiza diversas iterações. Cada uma calucla a área de um pequeno retângulo. 
         * A soma desses retângulos é aproximadamente igual à área embaixo da curva */
        for (int i = 0; i <= 120000; i++) {
            // A variável l é zerada para que seja reutilizada no módulo separaString   
            l = 0;
            // O valor atual do eixo x
            valAtual = valInicial + i * intervaloX;
            // A funçao é armazenada em uma ou mais posições de um vetor
            String[] y1 = separaString(funcao, String.valueOf(valAtual));
            /* A variável y1 recebe o valor de retorno do módulo verifica parênteses. 
             * Se houver algum erro na tentativa de receber o valor, o usuário recebe 
             * uma mensagem de erro e a área será zero */
            try {
                y1 = verificaParenteses(y1);
            } catch (Exception e) {
                return 0;
            }
            /* A funçao recebe o valor de retorno dos módulos que realizam operações 
             * matemáticas. 0 e l-1 são o ponto inicial e final da função */
            y1 = operacaoComplexa(0, l - 1, y1);
            // y1[0] é o valor da função resolvida
            // Durante as várias iterações o maior e o menor resultado da função são armazenados
            try {
                double valCompara = Double.parseDouble(y1[0]);
                if (valCompara > maior) {
                    maior = valCompara;
                }
                if (valCompara < menor) {
                    menor = valCompara;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar resolver a função",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                limpaCampos();
                return 0;
            }
        }
        // Calcula o intervalo do eixo y para poder plotar o gráfico
        intervaloY = (maior - menor);
        // Coloca os valores numéricos no eixo do gráfico
        jLabel6.setText(String.valueOf(valInicial));
        jLabel7.setText(String.valueOf(valFinal));
        if (maior == menor) {
            jLabel9.setText(String.valueOf(menor));
        } else {
            jLabel8.setText(String.valueOf(menor));
            jLabel9.setText(String.valueOf(maior));
        }
        l = 0;
        double eY;
        /* Reinicia o ciclo de 120000 iterações, mas dessa vez, não para armazenar 
         * o maior e o menor valor, e sim para plotar o gráfico */
        for (int i = 0; i <= 120000; i++) {
            l = 0;
            valAtual = valInicial + i * intervaloX;
            String[] y2 = separaString(funcao, String.valueOf(valAtual));
            try {
                y2 = verificaParenteses(y2);
            } catch (Exception e) {
                return 0;
            }
            y2 = operacaoComplexa(0, l - 1, y2);
            try {
                valFuncao = Double.parseDouble(y2[0]);
                /* Marca os pontos no gráfico. A cada 400 iterações adiciona um ponto. 
                 * Isso porque o tamanho dos eixos é 300, então 300 pontos serão adicionados. */
                if (i % 400 == 0) {
                    // O maior e o menor servem como referência para o ponto mínimo e máximo do gráfico 
                    if (intervaloY > 0) {
                        eY = 333 - 300 * (valFuncao - menor) / intervaloY;
                    // Se o intervalo for zero a função será uma constante e o gráfico será uma reta vertical
                    } else {
                        eY = 33;
                    }
                    int eX = 453 + i / 400;
                    //Cria um pequeno círculo (um ponto)(x, y, largura, altura)
                    g.fillOval(eX, (int) eY, 2, 2);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar resolver a função",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                limpaCampos();
                return 0;

            }
            // Soma a área do retângulo à área tota
            area = valFuncao * intervaloX + area;
        }
        return area;
    }

    /* Quebra a função em vários pedaços, separando números de sinais de mais, 
     * divisão etc e substitui x pelo valor atual. Tudo é armazenado em um vetor.
     * Exemplo: 22+x. v[0] = 22, v[1] = +, v[2] = valor atual */ 
    public String[] separaString(String funcao, String valorAtual) {
        String[] y1 = new String[funcao.length()];
        // Cria um vetor com espaçoes em branco que serão preenchidos pelos elementos da função
        for (int i = 0; i < funcao.length(); i++) {
            y1[i] = "";
        }
        int k;
        /* Percorre a função do início ao fim, separa números de sinais e 
         * substitui o valor de x e de constantes */ 
        for (int j = 0; j < funcao.length(); j++) {
            if ((funcao.charAt(j) == 'l') || (funcao.charAt(j) == 's') || (funcao.charAt(j) == 'c') || (funcao.charAt(j) == 't')) {
                y1[l] = String.valueOf(funcao.charAt(j));
                l++;
            } else if (funcao.charAt(j) == '^') {
                y1[l] = "^";
                l++;
            } else if (funcao.charAt(j) == '(') {
                y1[l] = "(";
                l++;
            } else if (funcao.charAt(j) == ')') {
                y1[l] = ")";
                l++;
            // Valor de x
            } else if (funcao.charAt(j) == 'x') {
                y1[l] = valorAtual;
                l++;
            // Valor de PI
            } else if (funcao.charAt(j) == 'p') {
                y1[l] = String.valueOf(Math.PI);
                l++;
            // Valor de Euler
            } else if (funcao.charAt(j) == 'e') {
                y1[l] = String.valueOf(Math.E);
                l++;
            } else if (funcao.charAt(j) == '+') {
                y1[l] = "+";
                l++;
            } else if (funcao.charAt(j) == '-') {
                y1[l] = "-";
                l++;
            } else if (funcao.charAt(j) == '*') {
                y1[l] = "*";
                l++;
            } else if (funcao.charAt(j) == '/') {
                y1[l] = "/";
                l++;
            } else {  
                k = j;
                /* Se encontrar varios núemros juntos, eles são colocados em uma
                 * única posição do vetor. */
                if (funcao.charAt(j) == '0' || funcao.charAt(j) == '1' || funcao.charAt(j) == '2'
                        || funcao.charAt(j) == '3' || funcao.charAt(j) == '4' || funcao.charAt(j) == '5'
                        || funcao.charAt(j) == '6' || funcao.charAt(j) == '7' || funcao.charAt(j) == '8'
                        || funcao.charAt(j) == '9' || funcao.charAt(j) == '.') {
                    while (k < funcao.length() && (funcao.charAt(k) == '0' || funcao.charAt(k) == '1' || funcao.charAt(k) == '2'
                            || funcao.charAt(k) == '3' || funcao.charAt(k) == '4' || funcao.charAt(k) == '5'
                            || funcao.charAt(k) == '6' || funcao.charAt(k) == '7' || funcao.charAt(k) == '8'
                            || funcao.charAt(k) == '9' || funcao.charAt(k) == '.')) {
                        y1[l] = y1[l] + String.valueOf(funcao.charAt(j));
                        k++;
                    }
                    j = k - 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Caracteres inválidos",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                    limpaCampos();
                    return y1;
                }
                l++;
            }
            /* l é igual ao número de posições do vetor diferentes de "". 
             * Exemplo: x + 3 nesse casol l=3 */
        }
        return y1;
    }

    // Procura parênteses e caso os encontre, manda a função para outro método que resolve os parênteses
    public String[] verificaParenteses(String[] y2) {
       /* Não tem sentido a última posição do vetor ser um parênteses porque 
        * não pode haver um fecha parênteses */
        if ("(".equals(y2[l - 1])) {
            JOptionPane.showMessageDialog(null, "Função inválida, parênteses não foram fechados",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            limpaCampos();
        }
        // Se encontrar um abre parênteses entra no módulo chamaParênteses
        for (int i = 0; i < l; i++) {
            if ("(".equals(y2[i])) {
                try {
                    y2 = chamaParenteses(y2, i);
                } catch (Exception e) {
                    return y2;
                }
            }
        }
        return y2;
    }

    /* Verifica onde há o fechamento dos parênteses, e resolve a parte da função
     * da abertura até o fechamneto dos parênteses */
    public String[] chamaParenteses(String[] y2, int inicio) {
        // Início é a posição do abre parênteses
        inicio++;
        int i = inicio;
        // Marca o ponto onde o parênteses é fechado. Se não encontrar, retorna um erro 
        while (i < l && !")".equals(y2[i])) {
            if ("(".equals(y2[i])) {
                /* Se encontrar outro abre parênteses, resolve a função dentro 
                 * daquele parênteses, e depois usa o valor para resolver o parênteses atual */
                chamaParenteses(y2, i);
            }
            i++;
        }
        /* Realiza operações matemáticas dentro dos parênteses, reduzindo tudo 
         * para um único valor que é armazenado na posição 0 do vetor */
        y2 = operacaoComplexa(inicio, i - 1, y2);
        /* Depois que os parênteses são resolvidos, os caracteres abre parênteses 
         * e fecha parêntese são eliminados */
        y2[inicio - 1] = y2[inicio];
        try {
            y2[inicio] = y2[inicio + 1];
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Função inválida, erro nos parênteses",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            limpaCampos();
            return y2;
        }
        // Como os parênteses são eliminados a função perde duas posições
        l -= 2;
        // Exemplo: f=(2) (3 posições relevantes), depois desse for f=2## (1 posição relevante) 
        for (int j = inicio; j < l; j++) {
            y2[j] = y2[j + 2];
        }
        y2[l] = "#";
        y2[l + 1] = "#";
        return y2;
    }
    
    // Resolve seno, cosseno, tangente e logaritmo
    public String[] operacaoComplexa(int inicio, int fim, String[] y2) {
        for (int i = inicio; i <= fim; i++) {
            while ("l".equals(y2[i]) || "s".equals(y2[i]) || "c".equals(y2[i]) || "t".equals(y2[i])) {
                // Logaritmo
                if ("l".equals(y2[i])) {
                    try {
                        // Exemplo: log e = 1 e. "e" não é mais relevante.
                        y2[i] = String.valueOf(Math.log(Double.parseDouble(y2[i + 1])));
                        // Depois que a operação é feita o string precisa ser ajustado
                        y2 = ajustaString(1, i + 1, y2);
                        // Fim é reduzido porque a função perde uma posição relevante.
                        fim--;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Função inválida, erro na função logaritmo",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        limpaCampos();
                        y2[0] = "#";
                        return y2;
                    }
                // Seno
                } else if ("s".equals(y2[i])) {
                    try {
                        y2[i] = String.valueOf(Math.sin(Double.parseDouble(y2[i + 1])));
                        y2 = ajustaString(1, i + 1, y2);
                        fim--;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Função inválida, erro na função seno",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        limpaCampos();
                        y2[0] = "#";
                        return y2;
                    }
                // Cosseno
                } else if ("c".equals(y2[i])) {
                    try {
                        y2[i] = String.valueOf(Math.cos(Double.parseDouble(y2[i + 1])));
                        y2 = ajustaString(1, i + 1, y2);
                        fim--;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Função inválida, erro na função cosseno",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        limpaCampos();
                        y2[0] = "#";
                        return y2;
                    }
                // Tangente
                } else if ("t".equals(y2[i])) {
                    try {
                        y2[i] = String.valueOf(Math.tan(Double.parseDouble(y2[i + 1])));
                        y2 = ajustaString(1, i, y2);
                        fim--;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Função inválida, erro na função tangente",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        limpaCampos();
                        y2[0] = "#";
                        return y2;
                    }
                }
            }
        }
        /* Log, seno e cosseno são resolvidos primeiro, depois potência, depois 
         * vezes e divisão, depois mais e menos */
        String[] y3 = operacaoPotencia(inicio, fim, y2);
        return y3;
    }

    public String[] operacaoPotencia(int inicio, int fim, String[] y2) {
        for (int i = inicio; i <= fim; i++) {
            while ("^".equals(y2[i])) {
                try {
                    y2[i - 1] = String.valueOf(Math.pow(Double.parseDouble(y2[i - 1]), Double.parseDouble(y2[i + 1])));
                    y2 = ajustaString(2, i, y2);
                    fim -= 2;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Função inválida, erro na função potencia",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                    limpaCampos();
                    y2[0] = "#";
                    return y2;
                }
            }
        }
        String[] y3 = operacaoVD(inicio, fim, y2);
        return y3;
    }

    public String[] operacaoVD(int inicio, int fim, String[] y2) {
        for (int i = inicio; i <= fim; i++) {
            while ("*".equals(y2[i]) || "/".equals(y2[i])) {
                if ("*".equals(y2[i])) {
                    try {
                        y2[i - 1] = String.valueOf(Double.parseDouble(y2[i - 1]) * Double.parseDouble(y2[i + 1]));
                        y2 = ajustaString(2, i, y2);
                        fim -= 2;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Função inválida, erro na multiplicação",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        limpaCampos();
                        y2[0] = "#";
                        return y2;
                    }
                } else if ("/".equals(y2[i])) {
                    try {
                        y2[i - 1] = String.valueOf(Double.parseDouble(y2[i - 1]) / Double.parseDouble(y2[i + 1]));
                        y2 = ajustaString(2, i, y2);
                        fim -= 2;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Função inválida, erro na divisão",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        limpaCampos();
                        y2[0] = "#";
                        return y2;
                    }
                }
            }
        }
        String[] y3 = operacaoMM(inicio, fim, y2);
        return y3;
    }

    public String[] operacaoMM(int inicio, int fim, String[] y2) {
        for (int i = inicio; i <= fim; i++) {
            while ("+".equals(y2[i]) || "-".equals(y2[i])) {
                if ("+".equals(y2[i])) {
                    try {
                        y2[i - 1] = String.valueOf(Double.parseDouble(y2[i - 1]) + Double.parseDouble(y2[i + 1]));
                        y2 = ajustaString(2, i, y2);
                        fim -= 2;

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Função inválida, erro na adição",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        limpaCampos();
                        y2[0] = "#";
                        return y2;
                    }
                } else if ("-".equals(y2[i])) {
                    try {
                        y2[i - 1] = String.valueOf(Double.parseDouble(y2[i - 1]) - Double.parseDouble(y2[i + 1]));
                        y2 = ajustaString(2, i, y2);
                        fim -= 2;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Função inválida, erro na subtração",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        limpaCampos();
                        y2[0] = "#";
                        return y2;
                    }
                }
            }
        }
        return y2;
    }

    /* Quando uma operação é feita, os valores do vetor y2 usados na operação
     * são mantidos, para evitar que o sistema realize a mesma operaçao
     * novamente. Os valores da operação, exceto o resultado, são eliminados */
    public String[] ajustaString(int espaco, int inicio, String[] y2) {
        l -= espaco;
        for (int i = inicio; i < l; i++) {
            y2[i] = y2[i + espaco];
        }
        if (espaco == 1) {
            y2[l] = "#";
        } else if (espaco == 2) {
            y2[l] = "#";
            y2[l + 1] = "#";
        }
        return y2;
    }

    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Integrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Integrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Integrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Integrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Integrais().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

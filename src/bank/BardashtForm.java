
package bank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;


public class BardashtForm extends javax.swing.JFrame {


    public BardashtForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(450, 100));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel1.setText("شماره مشتری");

        jLabel2.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel2.setText("شماره سپرده");

        jLabel3.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel3.setText("مبلغ برداشتی");

        jLabel4.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel4.setText("ریال");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jButton1.setText("برداشت");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       MessageBox Pm = new MessageBox();
       boolean check = false;
       String deposit = "";
       try {
                String Path = new File( "." ).getCanonicalPath();
                FileInputStream fstream = new FileInputStream(Path + "\\Deposit.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream, "UTF8"));
                String strLine;
                StringBuilder fileContent = new StringBuilder();

              while ((strLine = br.readLine()) != null) {


                String tokens[] = strLine.split("-");
                if (tokens.length > 0) {

                    if (tokens[0].equals(jTextField2.getText())&& tokens[5].equals(jTextField1.getText())) { 
                        check = true;
                        deposit = strLine;
                }else{

                        fileContent.append(strLine);
                        fileContent.append("\n");
                    }
                }
            }
            if(check = true){
                String tokens[] = deposit.split("-");
                double Money = Double.parseDouble(jTextField3.getText());
                if(Money <0)
                    Money *=-1;
                if(Double.parseDouble(tokens[7])<Money){

                    Pm.setVisible(true);
                    Pm.ShowMessage("موجودی سپرده کافی نیست.");
                    fileContent.append(strLine);
                    fileContent.append("\n");
                }
                else{
                    double ReplacedMoney = Double.parseDouble(tokens[7])- Money ;
                    String newLine = tokens[0] + "-" + tokens[1] + "-" + tokens[2] + "-" + tokens[3]+ "-" + tokens[4]+ "-" + tokens[5]+ "-" + tokens[6] + "-" +  ReplacedMoney;
                    fileContent.append(newLine);
                    fileContent.append("\n");
                    Pm.setVisible(true);
                    Pm.ShowMessage("عملیات با موفقیت انجام شد.");
                }
                fstream.close();
                File file = new File(Path+"\\Deposit.txt");
                Writer fw = null;
                fw  = new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8);
                BufferedWriter bw = null;
                bw = new BufferedWriter(fw);
                bw.write(fileContent.toString());
                bw.close();
            }
            else{
                Pm.setVisible(true);
                Pm.ShowMessage("مشتری و سپرده مورد نظر یافت نشد.");
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

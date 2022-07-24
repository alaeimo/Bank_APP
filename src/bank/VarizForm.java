
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


public class VarizForm extends javax.swing.JFrame {

   
    public VarizForm() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(450, 100));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel1.setText("شماره سپرده");

        jLabel2.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel2.setText("مبلغ واریزی");

        jButton1.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jButton1.setText("واریز");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel3.setText("ریال");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))))
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
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
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
                BufferedReader br = new BufferedReader( new InputStreamReader( fstream, "UTF8"));
                String strLine;
                StringBuilder fileContent = new StringBuilder();
          
              
              while ((strLine = br.readLine()) != null) {
                
              
                String tokens[] = strLine.split("-");
                if (tokens.length > 0) {
                 
                    if (tokens[0].equals(jTextField1.getText())) {
                        check = true;
                        deposit = strLine;
                    } else {
                       
                        fileContent.append(strLine);
                        fileContent.append("\n");
                    }
                }
            }
              
            if(check == true){
                String tokens[] = deposit.split("-");
                double Money = Double.parseDouble(jTextField2.getText());
                if(Money <0)
                    Money *=-1;
                double ReplacedMoney = Double.parseDouble(tokens[7])+ Money ;
                String newLine = tokens[0] + "-" + tokens[1] + "-" + tokens[2] + "-" + tokens[3]+ "-" + tokens[4]+ "-" + tokens[5]+ "-" + tokens[6] + "-" +  ReplacedMoney;
                fileContent.append(newLine);
                fileContent.append("\n");
                fstream.close();
                File file = new File(Path+"\\Deposit.txt");
                Writer fw = null;
                fw  = new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8);
                BufferedWriter bw = null;
                bw = new BufferedWriter(fw);
                bw.write(fileContent.toString());
                bw.close();
                Pm.setVisible(true);
                Pm.ShowMessage("عملیات با موفقیت انجام شد.");
            }
            else
            {
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}


package bank;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CustomerInfoForm extends javax.swing.JFrame {

  
    public CustomerInfoForm() {
        initComponents();
    }

  

    public ArrayList<Deposit> getCustDeposit(String CustNumber){
        MessageBox Pm = new MessageBox();
        ArrayList<Deposit> deposits = new ArrayList<>();
        try {
            
            String Path = new File( "." ).getCanonicalPath();
            File fstream = new File(Path + "\\Deposit.txt");
            
            if(!fstream.exists()){
                
              Pm.setVisible(true);
              Pm.ShowMessage("فایل Deposit.txt پیدا نشد.");

            }
            else{
            BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream(Path + "\\Deposit.txt"), "UTF8"));
            String strLine;    
            strLine = br.readLine();
            while (strLine != null) {
                
                String tokens[] = strLine.split("-");
                if (tokens.length > 0) {
        
                    if (tokens[5].equals(CustNumber)){
                        
                        int DepositNumber = Integer.parseInt(tokens[0]);
                        String DepositType = tokens[1] ;
                        int DepositTypeCode = Integer.parseInt(tokens[2]);
                        Deposit Support = new Deposit();
                        Support.setDepositNumber(Integer.parseInt(tokens[3]));
                        Support.setDepositType(tokens[4]);
                        Customer Owner = new Customer();
                        Owner.setCustNumber(Long.parseLong(tokens[5]));
                        Date OpenDate = new Date();
                        String date = tokens[6];
                        String dateInfo[] = date.split("/");
                        OpenDate.setYear(Integer.parseInt(dateInfo[0]));
                        OpenDate.setMonth(Integer.parseInt(dateInfo[1]));
                        OpenDate.setDay(Integer.parseInt(dateInfo[2])); 
                        Double InitialAmount = Double.parseDouble(tokens[7]);
                        deposits.add(new Deposit(DepositType,DepositTypeCode,Support,DepositNumber,Owner,InitialAmount,OpenDate));
                         
                         
                    } // EOF if2
                } //EOF if1
                
                strLine = br.readLine(); 
                
            } //EOF while
            
           br.close();}
  
        } catch (IOException ex) {
            Logger.getLogger(CustomerInfoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         return deposits;
    }
        

    
                
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(450, 100));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel1.setText("شماره مشتری ");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jButton1.setText("جستجو");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel2.setText("نام");

        jLabel3.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel3.setText("نام خانوادگی");

        jLabel4.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel4.setText("شماره مشتری");

        jLabel5.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel5.setText("کد ملی");

        jLabel6.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel6.setText("تاریخ تولد");

        jLabel7.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("-");

        jLabel8.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("-");

        jLabel9.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("-");

        jLabel10.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("-");

        jLabel11.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("-");

        jTable1.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, "", null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "موجودی سپرده", "تاریخ افتتاح سپرده", "نوع سپرده دوم", "شماره سپرده دوم", "نوع سپرده", "شماره سپرده"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
      
        MessageBox Pm = new MessageBox();
        boolean check = false;
        for(int i=0;i<100;i++){
          jTable1.setValueAt("", i,5);
          jTable1.setValueAt("", i,4);
          jTable1.setValueAt("", i,3);
          jTable1.setValueAt("", i,2);
          jTable1.setValueAt("", i,1);
          jTable1.setValueAt("", i,0);
        }
        
        jLabel7.setText("-");
        jLabel8.setText("-");
        jLabel9.setText("-");
        jLabel10.setText("-");
        jLabel11.setText("-");
       
        try {
         
            String Path = new File( "." ).getCanonicalPath(); 
            File fstream = new File(Path + "\\Customer.txt");
              if(!fstream.exists()){
                
              Pm.setVisible(true);
              Pm.ShowMessage("فایل Customer.txt پیدا نشد.");

            }
            else{
            BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream(Path + "\\Customer.txt"), "UTF8"));
            String strLine;         
            strLine = br.readLine();
            while (strLine != null) {
                
                String tokens[] = strLine.split("-");
                if (tokens.length > 0) {
                   
                    if (tokens[2].equals(jTextField1.getText())) {
                        jLabel7.setText(tokens[0]);
                        jLabel8.setText(tokens[1]);
                        jLabel9.setText(tokens[2]);
                        jLabel10.setText(tokens[3]);
                        jLabel11.setText(tokens[4]);
                        
                        ArrayList<Deposit> depositList = getCustDeposit(tokens[2]);
                      
                       for(int i = 0; i<depositList.size();i++){
                            Deposit deposit = depositList.get(i);
                            
                            jTable1.setValueAt(deposit.getDepositNumber(), i,5);
                            jTable1.setValueAt(deposit.getDepositType(), i,4);
                            jTable1.setValueAt(deposit.getSupport().getDepositNumber(), i,3);
                            jTable1.setValueAt(deposit.getSupport().getDepositType(), i,2);
                            jTable1.setValueAt(deposit.getOpenDate(), i,1);
                            jTable1.setValueAt(deposit.getBalance(), i,0);

                          }
                        strLine = null;
                        check = true;
                    } else {
                      
                        strLine = br.readLine();
                    }
                }
                
            }
            
            br.close();
            Pm.setVisible(true);
            if(check == true)
            Pm.ShowMessage("عملیات با موفقیت انجام شد ."); 
            else
            Pm.ShowMessage("مشتری با این شماره یافت نشد.");
            }
           
        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

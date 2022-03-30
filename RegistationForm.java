/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JOptionPane;
public class RegistationForm extends javax.swing.JFrame {
   
    
    public RegistationForm() {
        initComponents();
    }
    
    String getinitialname()
    {
       boolean back=false;
       String findname=txtName.getText();
       int namelength=findname.length();
       for(int why=0;why<namelength;why++)
       {
           char hello=findname.charAt(why);
           if(Character.isSpaceChar(hello))
           {
               back=true;
           }
           
       }
       String projectname;
       if(back==true)
    {      
       
       char firstletter=findname.charAt(0);
       String then=Character.toString(firstletter);  
       projectname=then.toUpperCase();
       for(int zp=0;zp<namelength;zp++)
       {
           char nameletters=findname.charAt(zp);
           if(Character.isSpaceChar(nameletters))
           {   
               char before=findname.charAt(zp+1);
               String A4=findname.substring(zp+1);
               int A4length=A4.length();
               for(int a1=0;a1<A4length;a1++)
               {
                   char C4=A4.charAt(a1);
                   if(Character.isSpaceChar(C4))
                   {
                        String add=Character.toString(before);
                        String addAgain=add.toUpperCase();
                        projectname+="."+addAgain;
                        break;
                   }
                   if(a1==A4length-1)
                   {
                        String minus=Character.toString(before);
                        String addminus=minus.toUpperCase();
                        String A5=A4.substring(1);
                        projectname=projectname+"."+addminus+A5;
                        int footballplay= projectname.length();
                        if(footballplay<8)
                        {
                             projectname=projectname+"."+addminus+A5+"\t";
                        }
                        
                   }
               }
             
           }
         
       }
    }  
     else
       { 
         char interview=findname.charAt(0);
         String examend=Character.toString(interview);
         String rabbit=examend.toUpperCase();
         String dog=findname.substring(1);
         projectname=rabbit+dog;
         int weakpointlength=projectname.length();
         if( weakpointlength<8)
        {
           projectname=rabbit+dog+"\t"; 
        }
      
       }
        
         return projectname;
    }
    
    boolean notleap_or_leap_checking()
    {
        boolean LEAPYEAR;  
        String mode=txtId.getText();
        String firsttwo=mode.substring(0, 2);
        int qew=Integer.parseInt(firsttwo);
       
       qew+=1900;
 
       int leapyearcheck=qew%400;
      
       if((leapyearcheck==0)||(qew%4==0&&qew%100!=0))
       {
        LEAPYEAR=true;
       }
       else
       {
        LEAPYEAR=false;
       } 
        return LEAPYEAR;
        
    }

   String getbirthday()
   {
       int  month=0,bcd=0;
       String getdays=txtId.getText();
       String ghy=getdays.substring(2, 5);
       int xyz=Integer.parseInt(ghy);
      
       
       if(xyz>500)
       {
           xyz-=500;
       }
       
       
       if(notleap_or_leap_checking())
       {
             if(xyz<=31) 
                {
                    bcd=xyz;
                    month=1;
                     
                }
                 else if(xyz<=60)
                {
                    bcd=xyz-31;
                    month=2;
                }
                 else if(xyz<=91)
                {
                    bcd=xyz-60;
                    month=3;
                }
                 else if(xyz<=121)
                {
                    bcd=xyz-91;
                    month=4;
                }
                 else if(xyz<=152)
                {
                    bcd=xyz-121;
                    month=5;
                }
                 else if(xyz<=182)
                {
                    bcd=xyz-152;
                    month=6;
                }
                 else if(xyz<=213)
                {
                    bcd=xyz-182;
                    month=7;
                }
                 else if(xyz<=244)
                {
                    bcd=xyz-213;
                    month=8;
                }
                 else if(xyz<=274)
                {
                    bcd=xyz-244;
                    month=9;
                }
                 else if(xyz<=305)
                {
                    bcd=xyz-274;
                    month=10;
                }
                 else if(xyz<=335)
                {
                    bcd=xyz-305;
                    month=11;
                }
                 else if(xyz<=366)
                {
                    bcd=xyz-335;
                    month=12;
                }
           
       }
       else 
       {
            if(xyz<=31) 
                {
                    bcd=xyz;
                    month=1;
                     
                }
                 else if(xyz<=59)
                {
                    bcd=xyz-31;
                    month=2;
                }
                 else if(xyz<=90)
                {
                    bcd=xyz-59;
                    month=3;
                }
                 else if(xyz<=120)
                {
                    bcd=xyz-90;
                    month=4;
                }
                 else if(xyz<=151)
                {
                    bcd=xyz-120;
                    month=5;
                }
                 else if(xyz<=181)
                {
                    bcd=xyz-151;
                    month=6;
                }
                 else if(xyz<=212)
                {
                    bcd=xyz-181;
                    month=7;
                }
                 else if(xyz<=243)
                {
                    bcd=xyz-212;
                    month=8;
                }
                 else if(xyz<=273)
                {
                    bcd=xyz-243;
                    month=9;
                }
                 else if(xyz<=304)
                {
                    bcd=xyz-273;
                    month=10;
                }
                 else if(xyz<=334)
                {
                    bcd=xyz-304;
                    month=11;
                }
                 else if(xyz<=365)
                {
                    bcd=xyz-334;
                    month=12;
                }
       }
        String mode=txtId.getText();
        String firsttwo=mode.substring(0, 2);
        int qew=Integer.parseInt(firsttwo);
       
       qew+=1900;
 
       String bcd_Last=Integer.toString(bcd);
       String month_Last=Integer.toString(month);
      
       String year_final=Integer.toString(qew);
       String last=year_final+"/"+month_Last+"/"+bcd_Last;
       
       return last;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();
        lblErrorName = new javax.swing.JLabel();
        lblErrorId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("Registration Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name in Full");

        txtName.setBackground(new java.awt.Color(204, 204, 255));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(102, 0, 102));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("National ID Card Number");

        txtId.setBackground(new java.awt.Color(204, 204, 255));
        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(102, 0, 102));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("count");

        txtCount.setText("0");

        btnSubmit.setBackground(new java.awt.Color(0, 153, 51));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 51));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtResult.setEditable(false);
        txtResult.setBackground(new java.awt.Color(204, 204, 255));
        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtResult.setForeground(new java.awt.Color(102, 0, 102));
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        btnDelete.setBackground(new java.awt.Color(204, 255, 204));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 0, 51));
        btnDelete.setText("Delete All");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblErrorName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorName.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorId.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblErrorId, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorName)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblErrorId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
try{  
        String name=txtName.getText();
        int length=name.length();
        for(int x=0;x<length;x++)
        {
            char ch=name.charAt(x);
            if(!Character.isLetter(ch)&&!Character.isSpaceChar(ch))
            {
                lblErrorName.setText("invalid name");
                break; 
            }
            else
            {
                lblErrorName.setText("");
            }
        }
    } 
catch(Exception e)
   {
       
   }
            
        
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
     
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
          
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
   
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
    
         
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        String name=txtName.getText();
        if(name.isEmpty())
        {
            lblErrorName.setText("please add your name");
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
try{
        boolean abc=true;
        String name=txtName.getText();
        if(name.isEmpty()&&txtId.getText().isEmpty())
        {
            lblErrorName.setText("please add your name");
            lblErrorId.setText("please add your ID number");
            abc=false;
        }
        else if(txtId.getText().isEmpty())
        {
            lblErrorId.setText("please add your ID number");
            abc=false;
        }
        else if(name.isEmpty())
        {
            lblErrorName.setText("please add your name");
            abc=false;
        }
        else if(!txtId.getText().contains("V"))
        {
            lblErrorId.setText("INVALID ID NUMBER");
            abc=false;
        }
        else if(!lblErrorName.getText().equals("")&&!lblErrorId.getText().equals(""))
        {
            abc=false;
        }
        else  if(!lblErrorName.getText().equals(""))
        {
            abc=false;
        }
        else if(!lblErrorId.getText().equals(""))
        {
            abc=false;
        }
        else if(abc==true)
        {
           
          String samith=  txtCount.getText();
          int chathura=Integer.parseInt(samith);
          chathura+=1;
          String vinura=Integer.toString(chathura);
          txtCount.setText(vinura);
            
        
        String output_birthday=  getbirthday() ;
        String name_with_initials=getinitialname();
        String isuraproject="\t"+"\t"+ "Registration Records"+"\n"+"\n"+"\n";
        isuraproject+="No"+"\t"+"Name With Initials"+"\t"+"\t"+"Date of Birth"+"\n"+"\n";
            if(chathura==1)
            {
                 String enterData=isuraproject+vinura+"\t"+name_with_initials+"\t"+"\t"+"\t"+output_birthday+"\n";
                 txtResult.setText(enterData);
            }    
            else
            {
                
                txtResult.setText(txtResult.getText()+vinura+"\t"+name_with_initials+"\t"+"\t"+"\t"+output_birthday+"\n");
            }
        }
        if(abc==false)
        {
            JOptionPane.showMessageDialog(null, "Not submited your data."); 
        }
        
    }  
   catch(Exception e)
   {
         JOptionPane.showMessageDialog(null, "Not submited your data."); 
   }
        
    }//GEN-LAST:event_btnSubmitActionPerformed
      
    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
try{
    String id=txtId.getText();
    boolean w=true;
    if(id.contains("V"))
    {
        if(id.length()!=10)  
        {
            lblErrorId.setText("INVALID ID NUMBER");
            w=false;
        }
        else 
        {
            boolean b=true;
            for(int y=0;y<9;y++)
           {
              char ch=id.charAt(y);
              if(!Character.isDigit(ch))
               {
                  lblErrorId.setText("INVALID ID NUMBER");
                  b=false;
                  w=b;
                  break;
               }
              
           }
          if(b==true)
           {
              boolean teacher =notleap_or_leap_checking();
              String p=id.substring(2, 5);
              int s=Integer.parseInt(p);
              if(s<500)
               {
                  if(s>366)
                   {
                      lblErrorId.setText("INVALID ID NUMBER");
                      w=false;
                   }
                  else if(s==366&&teacher!=true)
                   {
                      lblErrorId.setText("INVALID ID NUMBER");
                      w=false;
                   }
                
               }
              else
               {
                  if(s>866 )
                   {
                      lblErrorId.setText("INVALID ID NUMBER"); 
                      w=false;
                   }
                  else if( s==866 &&teacher!=true)
                   {
                       lblErrorId.setText("INVALID ID NUMBER"); 
                       w=false;
                   }
                 
               }
           }
          
          
          
        }    
            
            
    }  
      if(w==true)
       {
           lblErrorId.setText(""); 
       }
} 
catch(Exception e)
{
    
}
    }//GEN-LAST:event_txtIdKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtName.setText("");
        txtId.setText("");
        lblErrorName.setText("");
        lblErrorId.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        txtName.setText("");
        txtId.setText("");
        lblErrorName.setText("");
        lblErrorId.setText("");
        txtResult.setText("");
        txtCount.setText("0");
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(RegistationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorId;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
}

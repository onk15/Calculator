
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

/*

Cześć Szymon, programujesz

 */

/**
 *
 * @author Szymoon
 */
public class Kalkulator extends javax.swing.JFrame {

    
    public Kalkulator() {
        int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        initComponents();
        int widthFrame = (int) this.getSize().getWidth();
        int heightFrame = (int) this.getSize().getHeight();
        this.setLocation(((width/2)-(widthFrame)/2), ((height - this.getSize().height)/2+ 1/4*height));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        subtraction = new javax.swing.JButton();
        addition = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        division = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();

        int[] arrayOfEverySignsExceptNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,45,47,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255};

        textField.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {

                if(e.getKeyCode()==KeyEvent.VK_ADD)
                {
                    addition.doClick();
                }
                else if(e.getKeyCode() == KeyEvent.VK_MULTIPLY)
                {
                    multiplication.doClick();
                }
                else if(e.getKeyCode() == KeyEvent.VK_DIVIDE)
                {
                    division.doClick();
                }
                else if(e.getKeyCode() == KeyEvent.VK_SUBTRACT)
                {
                    subtraction.doClick();
                }
                else if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    enter.doClick();
                }
            }
        });

        textField.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                for(int i = 0; i < arrayOfEverySignsExceptNumbers.length;i++)
                {
                    if(e.getKeyChar() == arrayOfEverySignsExceptNumbers[i])
                    {
                        e.consume();
                    }
                }

            }
        });


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText()+"1");
            }
        });

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText()+"2");
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText()+"3");
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText()+"4");
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText()+"5");
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText()+"6");
            }
        });

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText()+"7");
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText()+"8");
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText()+"9");
            }
        });


        subtraction.setText("-");
        subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdejmowanieActionPerformed(evt);
            }
        });

        addition.setText("+");
        addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodawanieActionPerformed(evt);
            }
        });

        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });




        clear.setText("Usuń");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {

                int i = textField.getText().length() - 1;

                if(textField.getText().length()>0)
                    try
                    {
                        textField.setText(textField.getText(0, i));
                    }
                    catch (BadLocationException ex)
                    {
                        Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                else if(textField.getText().length()<0)
                {
                    clear.addKeyListener(new KeyAdapter() {
                        public void keyPressed(KeyEvent ke) {
                            ke.consume();
                        }
                    });
                }
            }
        });

        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        multiplication.setText("*");
        multiplication.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                MnożenieActionPerformed(e);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addition, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(division))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(enter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiplication))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clear)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {four, addition, two, nine, enter, one, subtraction, five, three, clear, division, multiplication, seven, six, eight});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three)
                    .addComponent(subtraction)
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six)
                    .addComponent(addition)
                    .addComponent(division))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine)
                    .addComponent(enter)
                    .addComponent(multiplication))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void OdejmowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdejmowanieActionPerformed
     
        OdejmowanieHandler odejmowanie = new OdejmowanieHandler();
        odejmowanie.actionPerformed(evt);
    }//GEN-LAST:event_OdejmowanieActionPerformed
   int długośćsek;

    private void setLocation()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class OdejmowanieHandler implements ActionListener
    {

        public OdejmowanieHandler() 
        {
         int długość = textField.getText().length() ;
         długośćsek = długość;
        }

        @Override
        public void actionPerformed(ActionEvent ae)
        {
          textField.setText(textField.getText()+ "-" );
        }

    }
    
    class DodawanieHandler implements ActionListener
    {

        public DodawanieHandler() 
        {
         int długość = textField.getText().length() ;
         długośćsek = długość;
        }

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            textField.setText(textField.getText()+ "+" );
        }
            
    }
    
     class DzielenieHandler implements ActionListener
     {

        public DzielenieHandler() 
        {
         int długość = textField.getText().length() ;
         długośćsek = długość;
        }

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            textField.setText(textField.getText()+ "/" );
        }

     }

    class MnożenieHandler implements ActionListener
    {

        public MnożenieHandler()
        {
            int długość = textField.getText().length() ;
            długośćsek = długość;
        }

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            textField.setText(textField.getText()+ "*" );
        }

    }
    
    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        try
        {                                      
            if(textField.getText(długośćsek, 1).equals("-"))
            {
                try
                {
                    String tekst = null;
                    try
                    {
                        tekst = textField.getText(0,długośćsek);
                    }
                    catch (BadLocationException ex)
                    {
                        Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    int coś = Integer.valueOf(tekst);
                    int sekwecnja = textField.getText().length();
                    int przesłany = (sekwecnja - długośćsek)-1;
                    
                    String nazwa2 = textField.getText(długośćsek+1,przesłany );
                    
                    int coś2 = Integer.valueOf(nazwa2);
                    
                    int wynik =coś - coś2;
                    String wynik2 = String.valueOf(wynik);
                    textField.setText(wynik2);
                }
                catch (BadLocationException ex)
                {
                    Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             if(textField.getText().contains("+"))
            {

                String tekst = null;
                try
                {
                    tekst = textField.getText(0,długośćsek);
                }
                catch (BadLocationException ex)
                {
                    Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                int coś = Integer.valueOf(tekst);
                int sekwecnja = textField.getText().length();
                int przesłany = (sekwecnja - długośćsek)-1;
             
                String nazwa2 = null;
                try
                {
                    nazwa2 = textField.getText(długośćsek+1,przesłany );
                }
                catch (BadLocationException ex)
                {
                    Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                int coś2 = Integer.valueOf(nazwa2);
                
                int wynik =coś + coś2;
                String wynik2 = String.valueOf(wynik);
                textField.setText(wynik2);
            }
            if(textField.getText(długośćsek, 1).equals("/"))

            {
            String tekst = null;
                try
                {
                    tekst = textField.getText(0,długośćsek);
                }
                catch (BadLocationException ex)
                {
                    Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
                }
                int coś = Integer.valueOf(tekst);
                int sekwecnja = textField.getText().length();
                int przesłany = (sekwecnja - długośćsek)-1;
             
                String nazwa2 = null;
                try
                {
                    nazwa2 = textField.getText(długośćsek+1,przesłany );
                }
                catch (BadLocationException ex)
                {
                    Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                int coś2 = Integer.valueOf(nazwa2);
                
                int wynik =coś / coś2;
                String wynik2 = String.valueOf(wynik);
                textField.setText(wynik2);
            }

            if(textField.getText().contains("*"))
            {

                String tekst = null;
                try
                {
                    tekst = textField.getText(0,długośćsek);
                }
                catch (BadLocationException ex)
                {
                    Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
                }

                int coś = Integer.valueOf(tekst);
                int sekwecnja = textField.getText().length();
                int przesłany = (sekwecnja - długośćsek)-1;

                String nazwa2 = null;
                try
                {
                    nazwa2 = textField.getText(długośćsek+1,przesłany );
                }
                catch (BadLocationException ex)
                {
                    Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
                }

                int coś2 = Integer.valueOf(nazwa2);

                int wynik =coś * coś2;
                String wynik2 = String.valueOf(wynik);
                textField.setText(wynik2);
            }
            
        }
        catch (BadLocationException ex)
        {
            Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EnterActionPerformed

    private void DodawanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodawanieActionPerformed
       DodawanieHandler dodawanie = new DodawanieHandler();
        dodawanie.actionPerformed(evt);
    }//GEN-LAST:event_DodawanieActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DzielenieHandler dzielenie = new DzielenieHandler();
       dzielenie.actionPerformed(evt);
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MnożenieActionPerformed(ActionEvent evt)
    {
        MnożenieHandler mnożenie = new MnożenieHandler();
        mnożenie.actionPerformed(evt);
    }

    public int Odejmowaniex2()
    {
    int a = PobieraniePierwszejSekwencji();
        textField.setText(textField.getText()+ "-" );
    int długość = textField.getText().length() -1;
        return długość;
    }
    
    public int PobieraniePierwszejSekwencji()
    {
        String tekst = textField.getText();
        int liczba = Integer.valueOf(tekst);
        return liczba;
    }
    
    public int PobieranieDrugiejSekwencji(int dłguość) throws BadLocationException
    {
    String nazwa = textField.getText(dłguość, 5);
    int liczba = Integer.valueOf(nazwa);
    return liczba;
    
    }
   
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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton four;
    private javax.swing.JButton addition;
    private javax.swing.JButton two;
    private javax.swing.JButton nine;
    private javax.swing.JButton enter;
    private javax.swing.JButton one;
    private javax.swing.JButton subtraction;
    private javax.swing.JButton five;
    private javax.swing.JTextField textField;
    private javax.swing.JButton three;
    private javax.swing.JButton clear;
    private javax.swing.JButton division;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton eight;
    // End of variables declaration//GEN-END:variables
}

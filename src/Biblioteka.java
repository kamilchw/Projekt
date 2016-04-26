
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Biblioteka extends javax.swing.JFrame {

    public Biblioteka() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private String wczytaj(){
        String linia="";
        JFileChooser jfc=new JFileChooser(); 
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Pliki tekstowe", "txt", "teks");
        jfc.setFileFilter(filter);
        int odp=jfc.showOpenDialog(this); 
        if (odp==JFileChooser.APPROVE_OPTION) { 
            try { 
                File plik=jfc.getSelectedFile();
                nazwaPliku = plik.toString();
                Scanner skaner=new Scanner(plik);
                while(skaner.hasNextLine()){
                    linia = skaner.nextLine();
                    StringTokenizer token = new StringTokenizer(linia);
                    lista.add(token.nextToken(";"));
                    while (token.hasMoreTokens()) {
                            lista.add((String) token.nextElement());
                        }//while tokenizer
                
                    }// while
                skaner.close();
                jbDalej.setEnabled(true);
            } catch (FileNotFoundException ex) { 
                JOptionPane.showMessageDialog(this, "Błąd pliku", "Błąd", JOptionPane.WARNING_MESSAGE); 
            }// catch    
            
        }//if      
       return nazwaPliku;
    }

    private boolean zapisz(){
        int ileLini, ktoryElement=0, warunek=0;
        ileLini = (lista.size()/9);
        try {
            System.out.println("Nazwa pliku przed zapisem"+nazwaPliku);
            BufferedWriter zapis = new BufferedWriter(new FileWriter(nazwaPliku));
            while(warunek<ileLini){
                System.out.println("Warunek: "+warunek);
                System.out.println("Ile jest lini/9: "+ileLini);
                System.out.println("Który element: "+ktoryElement);
                zapis.write(lista.get(ktoryElement)+";"+lista.get(ktoryElement+1)+";"+lista.get(ktoryElement+2)+";"+lista.get(ktoryElement+3)+";"+lista.get(ktoryElement+4)+";"+lista.get(ktoryElement+5)+";"+lista.get(ktoryElement+6)+";"+lista.get(ktoryElement+7)+";"+lista.get(ktoryElement+8)+";");
                zapis.newLine();
                ktoryElement=ktoryElement+9;
                warunek++;
            }// while
            zapis.close();
            zapisano=true;
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(this, "Błąd zapisu pliku", "Błąd", JOptionPane.ERROR_MESSAGE);
           zapisano=false;
        }//catch
        
        return zapisano;
    }
    
    private void dodajKsiążkę(){
        if(!jtfTytuł.getText().equals("") && !jtfAutor1.getText().equals("") && !jtfGatunek.getText().equals("") && !jtfISBN.getText().equals("")){
            lista.add(jtfTytuł.getText());
            lista.add(jtfAutor1.getText());
            if(!jtfAutor2.getText().equals("")){
                lista.add(jtfAutor2.getText());
            }else{
                lista.add(" ");
            }
            if(!jtfAutor3.getText().equals("")){
                lista.add(jtfAutor3.getText());
            }else{
                lista.add(" ");
            }
            lista.add(jtfGatunek.getText());
            lista.add(jtfISBN.getText());
            lista.add(" ");
            lista.add(" ");
            lista.add(" ");
            jtfTytuł.setText(null);
            jtfAutor1.setText(null);
            jtfAutor2.setText(null);
            jtfAutor3.setText(null);
            jtfGatunek.setText(null);
            jtfISBN.setText(null);
            JOptionPane.showMessageDialog(this, "Książka została dodana", "Udana operacja", JOptionPane.NO_OPTION);
            System.out.println(lista);
        }else{
            JOptionPane.showMessageDialog(this, "Następujęce pola muszą być wypełnione:\nTytuł\nAutor 1\nGatunek\nISBN", "Błąd", JOptionPane.WARNING_MESSAGE);
        }// else 
    }
    
    private void wszystkie(){
        int ileLini, ktoryElement=0, warunek=0;
        ileLini = (lista.size()/9);
            while(warunek<ileLini){
                
                //zapis.write(lista.get(ktoryElement)+";"+lista.get(ktoryElement+1)+";"+lista.get(ktoryElement+2)+";"+lista.get(ktoryElement+3)+";"+lista.get(ktoryElement+4)+";"+lista.get(ktoryElement+5)+";"+lista.get(ktoryElement+6)+";"+lista.get(ktoryElement+7)+";"+lista.get(ktoryElement+8)+";");
                //zapis.newLine();
                ktoryElement=ktoryElement+9;
                warunek++;
            }// while
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfMenu = new javax.swing.JFrame();
        jbWypożyczenie = new javax.swing.JButton();
        jbDodawanie = new javax.swing.JButton();
        jbUsuwanie = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbZakończ = new javax.swing.JButton();
        jbWszystkie = new javax.swing.JButton();
        jbLista = new javax.swing.JButton();
        jbWyszukiwanie = new javax.swing.JButton();
        jfDodawanie = new javax.swing.JFrame();
        jbZatwiedź = new javax.swing.JButton();
        jbPowrót = new javax.swing.JButton();
        jtfTytuł = new javax.swing.JTextField();
        jtfAutor1 = new javax.swing.JTextField();
        jtfAutor2 = new javax.swing.JTextField();
        jtfAutor3 = new javax.swing.JTextField();
        jtfGatunek = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfISBN = new javax.swing.JTextField();
        jlnapis1 = new javax.swing.JLabel();
        jbOtwórz = new javax.swing.JButton();
        jlnapis = new javax.swing.JLabel();
        jlWczytaj = new javax.swing.JLabel();
        jbDalej = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jfMenu.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jfMenu.setTitle("Biblioteka domowa - menu");
        jfMenu.setResizable(false);
        jfMenu.setSize(new java.awt.Dimension(600, 400));

        jbWypożyczenie.setText("Wypożyczenie");
        jbWypożyczenie.setMaximumSize(new java.awt.Dimension(265, 50));
        jbWypożyczenie.setMinimumSize(new java.awt.Dimension(265, 50));
        jbWypożyczenie.setPreferredSize(new java.awt.Dimension(265, 50));
        jbWypożyczenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbWypożyczenieActionPerformed(evt);
            }
        });

        jbDodawanie.setText("Dodanie książki");
        jbDodawanie.setMaximumSize(new java.awt.Dimension(265, 50));
        jbDodawanie.setMinimumSize(new java.awt.Dimension(265, 50));
        jbDodawanie.setPreferredSize(new java.awt.Dimension(265, 50));
        jbDodawanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDodawanieActionPerformed(evt);
            }
        });

        jbUsuwanie.setText("Usuwanie książki");
        jbUsuwanie.setMaximumSize(new java.awt.Dimension(265, 50));
        jbUsuwanie.setMinimumSize(new java.awt.Dimension(265, 50));
        jbUsuwanie.setPreferredSize(new java.awt.Dimension(265, 50));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel3.setText("Program biblioteka domowa");

        jbZakończ.setText("Zakończ");
        jbZakończ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbZakończActionPerformed(evt);
            }
        });

        jbWszystkie.setText("Lista wszystkich książek");
        jbWszystkie.setMaximumSize(new java.awt.Dimension(265, 50));
        jbWszystkie.setMinimumSize(new java.awt.Dimension(265, 50));
        jbWszystkie.setPreferredSize(new java.awt.Dimension(265, 50));

        jbLista.setText("Lista książek w zależości od stanu wypożyczenia");
        jbLista.setMaximumSize(new java.awt.Dimension(265, 50));
        jbLista.setMinimumSize(new java.awt.Dimension(265, 50));
        jbLista.setPreferredSize(new java.awt.Dimension(265, 50));

        jbWyszukiwanie.setText("Wyszukiwarka");
        jbWyszukiwanie.setMaximumSize(new java.awt.Dimension(265, 50));
        jbWyszukiwanie.setMinimumSize(new java.awt.Dimension(265, 50));
        jbWyszukiwanie.setPreferredSize(new java.awt.Dimension(265, 50));

        javax.swing.GroupLayout jfMenuLayout = new javax.swing.GroupLayout(jfMenu.getContentPane());
        jfMenu.getContentPane().setLayout(jfMenuLayout);
        jfMenuLayout.setHorizontalGroup(
            jfMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfMenuLayout.createSequentialGroup()
                .addGroup(jfMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfMenuLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jfMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jfMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jfMenuLayout.createSequentialGroup()
                                .addComponent(jbWypożyczenie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jbWszystkie, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jfMenuLayout.createSequentialGroup()
                                .addGroup(jfMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbUsuwanie, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbDodawanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jfMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbWyszukiwanie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbZakończ)))
                .addContainerGap())
        );
        jfMenuLayout.setVerticalGroup(
            jfMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfMenuLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jfMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbWypożyczenie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbWszystkie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jfMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDodawanie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jfMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbUsuwanie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbWyszukiwanie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jbZakończ)
                .addContainerGap())
        );

        jfDodawanie.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jfDodawanie.setTitle("Biblioteka domowa - dodawanie książki do bazy");
        jfDodawanie.setResizable(false);
        jfDodawanie.setSize(new java.awt.Dimension(600, 400));

        jbZatwiedź.setText("Zatwierdź");
        jbZatwiedź.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbZatwiedźActionPerformed(evt);
            }
        });

        jbPowrót.setText("Powrót");
        jbPowrót.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPowrótActionPerformed(evt);
            }
        });

        jLabel1.setText("Tytuł:");
        jLabel1.setToolTipText("");

        jLabel2.setText("Autor 1:");

        jLabel4.setText("Autor 3:");

        jLabel5.setText("Autor 2:");

        jLabel6.setText("Gatunek:");

        jLabel7.setText("ISBN:");

        jlnapis1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jlnapis1.setText("Program biblioteka domowa");

        javax.swing.GroupLayout jfDodawanieLayout = new javax.swing.GroupLayout(jfDodawanie.getContentPane());
        jfDodawanie.getContentPane().setLayout(jfDodawanieLayout);
        jfDodawanieLayout.setHorizontalGroup(
            jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfDodawanieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfDodawanieLayout.createSequentialGroup()
                        .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jfDodawanieLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jlnapis1))
                            .addComponent(jLabel5)
                            .addGroup(jfDodawanieLayout.createSequentialGroup()
                                .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfAutor3)
                                        .addComponent(jtfISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addComponent(jtfGatunek, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfTytuł, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(jfDodawanieLayout.createSequentialGroup()
                        .addComponent(jbPowrót)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbZatwiedź)))
                .addContainerGap())
        );
        jfDodawanieLayout.setVerticalGroup(
            jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfDodawanieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlnapis1)
                .addGap(50, 50, 50)
                .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfTytuł, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAutor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfGatunek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jfDodawanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPowrót)
                    .addComponent(jbZatwiedź))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteka domowa");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jbOtwórz.setText("Otwórz plik...");
        jbOtwórz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOtwórzActionPerformed(evt);
            }
        });

        jlnapis.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jlnapis.setText("Program biblioteka domowa");

        jlWczytaj.setText("Wczytaj plik ewidencyjny:");

        jbDalej.setText("Dalej");
        jbDalej.setEnabled(false);
        jbDalej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDalejActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Witaj w programie biblioteka domowa!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbDalej))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlWczytaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbOtwórz)
                        .addGap(0, 355, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlnapis)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlnapis)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlWczytaj)
                    .addComponent(jbOtwórz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(jbDalej)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbOtwórzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOtwórzActionPerformed
        wczytaj();
    }//GEN-LAST:event_jbOtwórzActionPerformed

    private void jbDalejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDalejActionPerformed
        jfMenu.setLocationRelativeTo(null);
        jfMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbDalejActionPerformed

    private void jbWypożyczenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbWypożyczenieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbWypożyczenieActionPerformed

    private void jbZakończActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZakończActionPerformed
        zapisz();
        if(zapisano){
            System.exit(0);
        } 
    }//GEN-LAST:event_jbZakończActionPerformed

    private void jbZatwiedźActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZatwiedźActionPerformed
        dodajKsiążkę();
    }//GEN-LAST:event_jbZatwiedźActionPerformed

    private void jbDodawanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDodawanieActionPerformed
        jfDodawanie.setLocationRelativeTo(null);
        jfDodawanie.setVisible(true);
        jfMenu.setVisible(false);
    }//GEN-LAST:event_jbDodawanieActionPerformed

    private void jbPowrótActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPowrótActionPerformed
        jfMenu.setLocationRelativeTo(null);
        jfMenu.setVisible(true);
        jfDodawanie.setVisible(false);
    }//GEN-LAST:event_jbPowrótActionPerformed

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
            java.util.logging.Logger.getLogger(Biblioteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteka().setVisible(true);
            }
        });
    }
    
    boolean zapisano;
    String nazwaPliku;
    List<String> lista = new ArrayList<String>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbDalej;
    private javax.swing.JButton jbDodawanie;
    private javax.swing.JButton jbLista;
    private javax.swing.JButton jbOtwórz;
    private javax.swing.JButton jbPowrót;
    private javax.swing.JButton jbUsuwanie;
    private javax.swing.JButton jbWszystkie;
    private javax.swing.JButton jbWypożyczenie;
    private javax.swing.JButton jbWyszukiwanie;
    private javax.swing.JButton jbZakończ;
    private javax.swing.JButton jbZatwiedź;
    private javax.swing.JFrame jfDodawanie;
    private javax.swing.JFrame jfMenu;
    private javax.swing.JLabel jlWczytaj;
    private javax.swing.JLabel jlnapis;
    private javax.swing.JLabel jlnapis1;
    private javax.swing.JTextField jtfAutor1;
    private javax.swing.JTextField jtfAutor2;
    private javax.swing.JTextField jtfAutor3;
    private javax.swing.JTextField jtfGatunek;
    private javax.swing.JTextField jtfISBN;
    private javax.swing.JTextField jtfTytuł;
    // End of variables declaration//GEN-END:variables
}
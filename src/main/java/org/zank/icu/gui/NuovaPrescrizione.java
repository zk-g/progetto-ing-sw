package org.zank.icu.gui;

import org.zank.icu.data.CartellaClinica;
import org.zank.icu.data.Paziente;
import org.zank.icu.data.Prescrizione;
import org.zank.icu.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

public class NuovaPrescrizione extends javax.swing.JPanel implements ActionListener {

    MainWindow main;
    Paziente paziente;

    public NuovaPrescrizione(Paziente paziente, MainWindow main) {
        this.main = main;
        this.paziente = paziente;
        initComponents();

        dataInizioSpinner.setEditor(new JSpinner.DateEditor(dataInizioSpinner, "dd/MM/yyyy"));
        dataFineSpinner.setEditor(new JSpinner.DateEditor(dataFineSpinner, "dd/MM/yyyy"));
        confermaButton.addActionListener(this);
        annullaButton.addActionListener(this);
        pazienteLabel.setText(paziente.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        farmacoField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dataInizioSpinner = new javax.swing.JSpinner();
        dataFineSpinner = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantitaDoseSpinner = new javax.swing.JSpinner();
        numeroDosiSpinnner = new javax.swing.JSpinner();
        confermaButton = new javax.swing.JButton();
        annullaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pazienteLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 330));

        jLabel2.setText("Nome farmaco");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Durata prescrizione"));

        jLabel3.setText("Data inizio");

        jLabel4.setText("Data fine");

        dataInizioSpinner.setModel(new javax.swing.SpinnerDateModel());

        dataFineSpinner.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataFineSpinner)
                    .addComponent(dataInizioSpinner))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataInizioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dataFineSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dosologia"));

        jLabel6.setText("Dose (g)");

        jLabel5.setText("Dosi giornaliere");

        quantitaDoseSpinner.setModel(new javax.swing.SpinnerNumberModel(1.0f, 0.0f, null, 0.1f));

        numeroDosiSpinnner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numeroDosiSpinnner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quantitaDoseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numeroDosiSpinnner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(quantitaDoseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        confermaButton.setText("Conferma");

        annullaButton.setText("Annulla");

        jLabel1.setText("Paziente");

        pazienteLabel.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(confermaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(annullaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(farmacoField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pazienteLabel))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pazienteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(farmacoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confermaButton)
                    .addComponent(annullaButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annullaButton;
    private javax.swing.JButton confermaButton;
    private javax.swing.JSpinner dataFineSpinner;
    private javax.swing.JSpinner dataInizioSpinner;
    private javax.swing.JTextField farmacoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner numeroDosiSpinnner;
    private javax.swing.JLabel pazienteLabel;
    private javax.swing.JSpinner quantitaDoseSpinner;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch (command) {
            case "Conferma":
                if (convalidaCampi()) {
                    salvaPrescrizione(creaPrescrizione());
                    Utility.chiudiDialog(ae);
                }
                break;
            case "Annulla":
                Utility.chiudiDialog(ae);
                break;
        }
    }

    private CartellaClinica getCartella() {
        for (CartellaClinica cartella : main.pazientiInCura) {
            if (cartella.getPaziente().toString().equals(paziente.toString())) {
                return cartella;
            }
        }
        return null;
    }

    private boolean convalidaCampi() {
        return convalidaNome() && convalidaData();
    }

    private boolean convalidaNome() {
        String nomeFarmaco = farmacoField.getText();
        if (nomeFarmaco.isBlank()) {
            return false;
        } else {
            return true;
        }
    }

    private boolean convalidaData() {
        Date dataInizio = (Date) dataInizioSpinner.getValue();
        Date dataFine = (Date) dataFineSpinner.getValue();
        if (dataInizio.after(dataFine)) {
            JOptionPane.showMessageDialog(null, "Durata terapia impossibile", "Errore", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    private Prescrizione creaPrescrizione() {
        Prescrizione prescrizione;
        prescrizione = new Prescrizione.PrescrizioneBuilderImpl()
                .setNomeFarmaco(farmacoField.getText())
                .setDataPrescrizione((Date) dataInizioSpinner.getValue())
                .setDataFineTerapia((Date) dataFineSpinner.getValue())
                .setNumeroDosiGiornaliere((int) numeroDosiSpinnner.getValue())
                .setQuantitaDose((float) quantitaDoseSpinner.getValue())
                .setMedico(main.getUtenteCorrente().getNome())
                .build();
        return prescrizione;
    }

    private void salvaPrescrizione(Prescrizione prescrizione) {
        CartellaClinica cartellaPaziente = getCartella();
        cartellaPaziente.addPrescrizione(prescrizione);
    }
}
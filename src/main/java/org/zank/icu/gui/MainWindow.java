package org.zank.icu.gui;

import org.zank.icu.analysis.AnalisiManager;
import org.zank.icu.data.CartellaClinica;
import org.zank.icu.data.Paziente;
import org.zank.icu.data.Utente;
import org.zank.icu.utility.CSVManager;
import org.zank.icu.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class MainWindow extends javax.swing.JFrame implements ActionListener {

    private Utente utenteCorrente;  //utente loggato, null se ospite
    public List<CartellaClinica> pazientiInCura = new ArrayList<>();

    private TelemetriaDettagliata telemetriaDettagliata = null;

    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        setUtenteCorrente(null);
        loadPazienti();

        loginButton.addActionListener(this);
        nuovoPazienteButton.addActionListener(this);
        prescrizioneButton.addActionListener(this);
        somministrazioneButton.addActionListener(this);
        storicoButton.addActionListener(this);
        rapportoButton.addActionListener(this);
        dimettiButton.addActionListener(this);
        diagnosiButton.addActionListener(this);
        reportButton.addActionListener(this);
        propertiesButton.addActionListener(this);
        setVisible(true);
        updateGUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        utenteLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ruoloLabel = new javax.swing.JLabel();
        propertiesButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nuovoPazienteButton = new javax.swing.JButton();
        somministrazioneButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        diagnosiButton = new javax.swing.JButton();
        prescrizioneButton = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dimettiButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabellaTelemetria = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        pazienteLabel = new javax.swing.JLabel();
        rapportoButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaPazienti = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        numeroPazientiLabel = new javax.swing.JLabel();
        storicoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monitoraggio Terapia Intensiva");
        setBackground(new java.awt.Color(255, 247, 247));

        jPanel6.setBackground(new java.awt.Color(61, 0, 61));

        jLabel2.setText("Utente");

        utenteLabel.setText("Guest");

        jLabel4.setText("Ruolo");

        ruoloLabel.setText("Guest");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(utenteLabel)
                    .addComponent(jLabel4)
                    .addComponent(ruoloLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(utenteLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(ruoloLabel)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        propertiesButton.setText("Properties");

        loginButton.setText("Login");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(propertiesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(loginButton)
                .addGap(18, 18, 18)
                .addComponent(propertiesButton)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(102, 0, 102));

        jLabel7.setText("Opzioni infermiere");

        nuovoPazienteButton.setText("Nuovo Paziente");

        somministrazioneButton.setText("Aggiungi somministrazione");
        somministrazioneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somministrazioneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(nuovoPazienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somministrazioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(nuovoPazienteButton)
                .addGap(18, 18, 18)
                .addComponent(somministrazioneButton)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jLabel8.setText("Opzioni medico");

        diagnosiButton.setText("Diagnosi");

        prescrizioneButton.setText("Aggiungi prescrizione");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diagnosiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(prescrizioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(diagnosiButton)
                .addGap(18, 18, 18)
                .addComponent(prescrizioneButton)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jLabel9.setText("Opzioni primario");

        dimettiButton.setText("Dimetti paziente");

        reportButton.setText("Report settimanale");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(dimettiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(dimettiButton)
                .addGap(18, 18, 18)
                .addComponent(reportButton)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Telemetria Paziente"));

        tabellaTelemetria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SBP", "DBP", "BPM", "Temp (C)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabellaTelemetria);

        jLabel6.setText("Paziente: ");

        pazienteLabel.setText("selezionare paz.");

        rapportoButton.setText("Rapp. dettagliato");

        jLabel3.setText("Status:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pazienteLabel)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rapportoButton)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pazienteLabel)
                    .addComponent(rapportoButton)
                    .addComponent(jLabel3)
                    .addComponent(statusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tabellaPazienti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Paziente", "SBP", "DBP", "BPM", "Temp (C)", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabellaPazienti.getTableHeader().setReorderingAllowed(false);
        tabellaPazienti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabellaPazientiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabellaPazienti);
        if (tabellaPazienti.getColumnModel().getColumnCount() > 0) {
            tabellaPazienti.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        jLabel1.setText("Numero pazienti: ");

        numeroPazientiLabel.setText("0");

        storicoButton.setText("Visualizza storico");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(numeroPazientiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(storicoButton)
                .addGap(124, 124, 124))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroPazientiLabel)
                            .addComponent(jLabel1))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(storicoButton)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(155, 155, 155)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void somministrazioneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somministrazioneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_somministrazioneButtonActionPerformed

    private void tabellaPazientiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellaPazientiMouseClicked

        updateTelemetria();
    }//GEN-LAST:event_tabellaPazientiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton diagnosiButton;
    private javax.swing.JButton dimettiButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel numeroPazientiLabel;
    private javax.swing.JButton nuovoPazienteButton;
    private javax.swing.JLabel pazienteLabel;
    private javax.swing.JButton prescrizioneButton;
    private javax.swing.JButton propertiesButton;
    private javax.swing.JButton rapportoButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JLabel ruoloLabel;
    private javax.swing.JButton somministrazioneButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton storicoButton;
    private javax.swing.JTable tabellaPazienti;
    private javax.swing.JTable tabellaTelemetria;
    private javax.swing.JLabel utenteLabel;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "Nuovo Paziente":
                doNuovoPaziente();
                break;
            case "Login":
                doLogin();
                break;
            case "Logout":
                doLogout();
                break;
            case "Aggiungi prescrizione":
                doNuovaPrescrizione();
                updateGUI();
                break;
            case "Aggiungi somministrazione":
                doNuovaSomministrazione();
                updateGUI();
                break;
            case "Visualizza storico":
                new DefaultJDialog(new Storico(), "Storico pazienti");
                break;
            case "Rapp. dettagliato":
                doTelemetriaDettagliata();
                break;
            case "Dimetti paziente":
                doDimettiPaziente();
                updateGUI();
                break;
            case "Diagnosi":
                doDiagnosi();
                break;
            case "Report settimanale":
                new DefaultJDialog(new ReportTest(this), "Report settimanale");
                break;
            case "Properties":
                doProperties();
                break;
        }
    }

    private void doNuovoPaziente() {
        if (pazientiInCura.size() >= 10) {
            JOptionPane.showMessageDialog(null,
                    "Impossibile inserire oltre 10 pazienti in reparto",
                    "Errore",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        new DefaultJDialog(new NuovoPaziente(this), "Nuovo paziente");
        updateGUI();
    }

    private void doProperties() {
        new DefaultJDialog(new PropertiesSetter(), "Properties");
        for (CartellaClinica cartella : pazientiInCura) {
            cartella.getManager().aggiornaTimer();
        }
    }

    private void doLogin() {
        new DefaultJDialog(new Login(this), "Login");
        updateGUI();
    }

    private void doLogout() {
        utenteCorrente = null;
        updateGUI();
    }

    private void doTelemetriaDettagliata() {
        Paziente paziente = getPazienteSelezionato();
        if (paziente != null) {
            telemetriaDettagliata = new TelemetriaDettagliata(paziente, this);
            new DefaultJDialog(telemetriaDettagliata, "Telemetria " + paziente.toString());
        } else {
            mostraDialogErrore();
        }
    }

    private void doNuovaPrescrizione() {
        Paziente paziente = getPazienteSelezionato();
        if (paziente != null) {
            new DefaultJDialog(new NuovaPrescrizione(paziente, this), "Nuova Prescrizione");
        } else {
            mostraDialogErrore();
        }
    }

    private void doNuovaSomministrazione() {
        Paziente paziente = getPazienteSelezionato();
        if (paziente != null) {
            new DefaultJDialog(new NuovaSomministrazione(paziente, this), "Nuova Somministrazione");
        } else {
            mostraDialogErrore();
        }
    }

    private void doDimettiPaziente() {
        Paziente paziente = getPazienteSelezionato();
        if (paziente != null) {
            new DefaultJDialog(new DimettiPaziente(this, paziente), "Dimetti paziente");
        } else {
            mostraDialogErrore();
        }
    }

    private Paziente getPazienteSelezionato() {
        int row = tabellaPazienti.getSelectedRow();
        if (row < 0) {
            return null;
        }
        Paziente paziente = (Paziente) tabellaPazienti.getValueAt(row, 0);
        return paziente;
    }

    private void mostraDialogErrore() {
        JOptionPane.showMessageDialog(null,
                "Seleziona un paziente dalla Tabella Pazienti",
                "Errore",
                JOptionPane.WARNING_MESSAGE);
    }

    private void doDiagnosi() {
        Paziente paziente = getPazienteSelezionato();
        if (paziente != null) {
            new DefaultJDialog(new Diagnosi(paziente), "Diagnosi paziente");
        } else {
            mostraDialogErrore();
        }
    }

    public void setUtenteCorrente(Utente utente) {
        this.utenteCorrente = utente;
    }

    public Utente getUtenteCorrente() {
        return this.utenteCorrente;
    }

    // Aggiorna i dati su schermo dell'utente loggato, null = guest
    private void updateUtente() {
        if (utenteCorrente != null) {
            this.utenteLabel.setText(utenteCorrente.getNome());
            this.ruoloLabel.setText(utenteCorrente.getRuolo().toString());
            loginButton.setText("Logout");
        } else {
            utenteLabel.setText("Guest");
            ruoloLabel.setText("Guest");
            loginButton.setText("Login");
        }
    }

    // Aggiorna lo stato dei pulsanti in base ai privilegi dell'utente loggato
    private void updateButtons() {

        if (utenteCorrente == null) {
            dimettiButton.setEnabled(false);
            diagnosiButton.setEnabled(false);
            prescrizioneButton.setEnabled(false);
            storicoButton.setEnabled(false);
            somministrazioneButton.setEnabled(false);
            nuovoPazienteButton.setEnabled(false);
            reportButton.setEnabled(false);
            rapportoButton.setEnabled(false);
            return;
        }

        switch (utenteCorrente.getRuolo()) {
            case PRM:
                dimettiButton.setEnabled(true);
                reportButton.setEnabled(true);
            case MED:
                diagnosiButton.setEnabled(true);
                prescrizioneButton.setEnabled(true);
                rapportoButton.setEnabled(true);
                storicoButton.setEnabled(true);
                somministrazioneButton.setEnabled(false);
                nuovoPazienteButton.setEnabled(false);
                break;
            case INF:
                rapportoButton.setEnabled(true);
                storicoButton.setEnabled(true);
                rapportoButton.setEnabled(true);
                somministrazioneButton.setEnabled(true);
                nuovoPazienteButton.setEnabled(true);
                break;
        }
    }

    /*
        Funzione da usare al primo avvio dell'applicazione, carica i pazienti precedentemente salvati
     */
    private void loadPazienti() {
        String path = path = "resources" + File.separator + "Pazienti";
        try {
            File[] file = new File(path).listFiles(File::isDirectory);
            for (File name : file) {
                String dataPaziente = new CSVManager(path + File.separator + name.getName() + File.separator + "Analisi.csv", ";").getLineAt(0);
                CartellaClinica paziente = new CartellaClinica(Utility.string2Paziente(dataPaziente));

                AnalisiManager manager = new AnalisiManager(paziente.getPaziente(), this);
                paziente.setManager(manager);
                pazientiInCura.add(paziente);
                manager.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
        Funzione da usare per aggiungere a runtime un paziente alla lista dei pazienti in cura
     */
    public void aggiungiPazienteInCura(CartellaClinica paziente) {
        AnalisiManager manager = new AnalisiManager(paziente.getPaziente(), this);
        paziente.setManager(manager);
        pazientiInCura.add(paziente);
        manager.start();
    }

    public void rimuoviPazienteInCura(Paziente paziente) {
        CartellaClinica cartellaDaRimuovere = null;
        for (CartellaClinica cartella : pazientiInCura) {
            if (cartella.getPaziente().toString().equals(paziente.toString())) {
                cartellaDaRimuovere = cartella;
            }
        }
        cartellaDaRimuovere.getManager().getTimer().cancel();
        pazientiInCura.remove(cartellaDaRimuovere);
    }

    // Aggiorna la tabella principale con i dati dell'oggetto
    private void updateTable() {
        int count = 0;
        for (CartellaClinica cartella : pazientiInCura) {
            tabellaPazienti.setValueAt(cartella.getPaziente(), count, 0);
            tabellaPazienti.setValueAt(cartella.getPaziente().getStatus(), count, 5);
            count++;
        }
        numeroPazientiLabel.setText(String.valueOf(count));
        for (int i = count; i < 10; i++) {
            tabellaPazienti.setValueAt(null, i, 0);
            tabellaPazienti.setValueAt(null, i, 1);
            tabellaPazienti.setValueAt(null, i, 2);
            tabellaPazienti.setValueAt(null, i, 3);
            tabellaPazienti.setValueAt(null, i, 4);
            tabellaPazienti.setValueAt(null, i, 5);
        }
    }

    private void updateTelemetria() {
        String path = "resources" + File.separator + "Pazienti" + File.separator;
        int row = tabellaPazienti.getSelectedRow();
        if (row < 0) {
            return;
        }
        Paziente paziente = (Paziente) tabellaPazienti.getValueAt(row, 0);
        if (paziente != null) {
            String nomePaziente = paziente.toString();
            pazienteLabel.setText(nomePaziente);
            path += paziente + File.separator;
            CSVManager wr = new CSVManager(path + "SBP.csv", ";");

            int i;
            for (i = 0; i < 7 && i < wr.getNumberOfRows(); i++) {
                tabellaTelemetria.setValueAt(Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - i - 1)), i, 0);
            }
            for (; i < 7; i++) {
                tabellaTelemetria.setValueAt(null, i, 0);
            }
            wr.setPathToFile(path + "DBP.csv");
            for (i = 0; i < 7 && i < wr.getNumberOfRows(); i++) {
                tabellaTelemetria.setValueAt(Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - i - 1)), i, 1);
            }
            for (; i < 7; i++) {
                tabellaTelemetria.setValueAt(null, i, 1);
            }
            wr.setPathToFile(path + "BPM.csv");
            for (i = 0; i < 7 && i < wr.getNumberOfRows(); i++) {
                tabellaTelemetria.setValueAt(Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - i - 1)), i, 2);
            }
            for (; i < 7; i++) {
                tabellaTelemetria.setValueAt(null, i, 2);
            }
            wr.setPathToFile(path + "TEMP.csv");
            for (i = 0; i < 7 && i < wr.getNumberOfRows(); i++) {
                tabellaTelemetria.setValueAt(Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - i - 1)), i, 3);
            }
            for (; i < 7; i++) {
                tabellaTelemetria.setValueAt(null, i, 3);
            }
            statusLabel.setText(paziente.getStatus());
        }
    }

    //read this https://www.javamex.com/tutorials/threads/invokelater.shtml
    public void updateAnalisi(String path, int position, String key, String nomePaziente) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CSVManager wr = new CSVManager(path, ";");

                for (int i = 0; i < 10; i++) {
                    Paziente paziente = (Paziente) tabellaPazienti.getValueAt(i, 0);
                    if (paziente != null) {
                        if (paziente.toString().equals(nomePaziente)) {
                            int number = Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - 1));
                            tabellaPazienti.setValueAt(number, i, position);

                            if (tabellaPazienti.getSelectedRow() == i) {
                                updateTelemetria();
                            }

                            if (telemetriaDettagliata != null) {
                                if (telemetriaDettagliata.getPaziente().toString().equals(nomePaziente)) {
                                    telemetriaDettagliata.aggiorna();
                                }
                            }
                            return;
                        }
                    }
                }
            }
        });
    }

    public void updateGUI() {
        updateUtente();
        updateButtons();
        updateTable();
        updateTelemetria();
    }
}

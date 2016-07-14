
import java.awt.Color;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandra
 */
public class PokerGameGUI extends javax.swing.JFrame {

    /**
     * Creates new form PokerGameGUI
     */
    private static JLabel[] myCards;
    private static JLabel[] compCards;
    private static GameState newGame;
    
    public PokerGameGUI() {
        initComponents();
        myCards = new JLabel[] {myCardLabel1, myCardLabel2, myCardLabel3, myCardLabel4, myCardLabel5};
        compCards = new JLabel[] {compCardLabel1, compCardLabel2, compCardLabel3, compCardLabel4, compCardLabel5};
        newGame = new GameState();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ex2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        compCard1 = new javax.swing.JPanel();
        compCardLabel1 = new javax.swing.JLabel();
        compCard2 = new javax.swing.JPanel();
        compCardLabel2 = new javax.swing.JLabel();
        compCard3 = new javax.swing.JPanel();
        compCardLabel3 = new javax.swing.JLabel();
        compCard4 = new javax.swing.JPanel();
        compCardLabel4 = new javax.swing.JLabel();
        compCard5 = new javax.swing.JPanel();
        compCardLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        yourCards = new javax.swing.JLabel();
        myCard1 = new javax.swing.JPanel();
        myCardLabel1 = new javax.swing.JLabel();
        myCard2 = new javax.swing.JPanel();
        myCardLabel2 = new javax.swing.JLabel();
        myCard3 = new javax.swing.JPanel();
        myCardLabel3 = new javax.swing.JLabel();
        myCard4 = new javax.swing.JPanel();
        myCardLabel4 = new javax.swing.JLabel();
        myCard5 = new javax.swing.JPanel();
        myCardLabel5 = new javax.swing.JLabel();
        DealCards = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        ex2.setText("another example");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Poker Game");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Computer's Cards");

        compCard1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        compCard1.setPreferredSize(new java.awt.Dimension(80, 109));

        compCardLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout compCard1Layout = new javax.swing.GroupLayout(compCard1);
        compCard1.setLayout(compCard1Layout);
        compCard1Layout.setHorizontalGroup(
            compCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(compCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compCard1Layout.setVerticalGroup(
            compCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(compCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        compCard2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        compCard2.setPreferredSize(new java.awt.Dimension(80, 109));

        compCardLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout compCard2Layout = new javax.swing.GroupLayout(compCard2);
        compCard2.setLayout(compCard2Layout);
        compCard2Layout.setHorizontalGroup(
            compCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(compCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compCard2Layout.setVerticalGroup(
            compCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(compCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        compCard3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        compCard3.setPreferredSize(new java.awt.Dimension(80, 109));

        compCardLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout compCard3Layout = new javax.swing.GroupLayout(compCard3);
        compCard3.setLayout(compCard3Layout);
        compCard3Layout.setHorizontalGroup(
            compCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(compCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compCard3Layout.setVerticalGroup(
            compCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(compCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        compCard4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        compCard4.setPreferredSize(new java.awt.Dimension(80, 109));

        compCardLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout compCard4Layout = new javax.swing.GroupLayout(compCard4);
        compCard4.setLayout(compCard4Layout);
        compCard4Layout.setHorizontalGroup(
            compCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(compCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compCard4Layout.setVerticalGroup(
            compCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(compCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        compCard5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        compCard5.setPreferredSize(new java.awt.Dimension(80, 109));

        compCardLabel5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout compCard5Layout = new javax.swing.GroupLayout(compCard5);
        compCard5.setLayout(compCard5Layout);
        compCard5Layout.setHorizontalGroup(
            compCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(compCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compCard5Layout.setVerticalGroup(
            compCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(compCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(282, 282, 282))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(compCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(compCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(compCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(compCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(compCard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compCard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        yourCards.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        yourCards.setText("Your Cards");

        myCard1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myCard1.setMinimumSize(new java.awt.Dimension(100, 100));
        myCard1.setName(""); // NOI18N
        myCard1.setPreferredSize(new java.awt.Dimension(80, 109));

        myCardLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout myCard1Layout = new javax.swing.GroupLayout(myCard1);
        myCard1.setLayout(myCard1Layout);
        myCard1Layout.setHorizontalGroup(
            myCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(myCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard1Layout.createSequentialGroup()
                    .addGap(0, 39, Short.MAX_VALUE)
                    .addComponent(myCardLabel1)
                    .addGap(0, 39, Short.MAX_VALUE)))
        );
        myCard1Layout.setVerticalGroup(
            myCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(myCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard1Layout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(myCardLabel1)
                    .addGap(0, 54, Short.MAX_VALUE)))
        );

        myCard2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myCard2.setPreferredSize(new java.awt.Dimension(80, 109));

        myCardLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout myCard2Layout = new javax.swing.GroupLayout(myCard2);
        myCard2.setLayout(myCard2Layout);
        myCard2Layout.setHorizontalGroup(
            myCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(myCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        myCard2Layout.setVerticalGroup(
            myCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(myCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        myCard3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myCard3.setPreferredSize(new java.awt.Dimension(80, 109));

        myCardLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout myCard3Layout = new javax.swing.GroupLayout(myCard3);
        myCard3.setLayout(myCard3Layout);
        myCard3Layout.setHorizontalGroup(
            myCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(myCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        myCard3Layout.setVerticalGroup(
            myCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(myCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        myCard4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myCard4.setPreferredSize(new java.awt.Dimension(80, 109));

        myCardLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout myCard4Layout = new javax.swing.GroupLayout(myCard4);
        myCard4.setLayout(myCard4Layout);
        myCard4Layout.setHorizontalGroup(
            myCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(myCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        myCard4Layout.setVerticalGroup(
            myCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(myCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        myCard5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myCard5.setPreferredSize(new java.awt.Dimension(80, 109));

        myCardLabel5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout myCard5Layout = new javax.swing.GroupLayout(myCard5);
        myCard5.setLayout(myCard5Layout);
        myCard5Layout.setHorizontalGroup(
            myCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(myCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        myCard5Layout.setVerticalGroup(
            myCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(myCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        DealCards.setText("Deal Cards");
        DealCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DealCardsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DealCards)
                        .addGap(185, 185, 185)
                        .addComponent(yourCards))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(myCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(myCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(myCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(myCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(myCard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myCard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yourCards)
                    .addComponent(DealCards))
                .addGap(11, 11, 11))
        );

        jMenu1.setBorder(null);
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem3.setText("New Game");
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Load Game");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save Game");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DealCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DealCardsActionPerformed
        // TODO add your handling code here:
        newGame.dealCards();
        Card[] c = newGame.getMyCards();
        for (int i = 0; i < 5; i = i + 1){
            javax.swing.JLabel tempLabel = myCards[i];
            tempLabel.setText(c[i].getNumber()+ " "+c[i].getSuitCode());
            tempLabel.setForeground(c[i].getColor());
        }
        DealCards.setEnabled(false);

    }//GEN-LAST:event_DealCardsActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PokerGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokerGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokerGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokerGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokerGameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DealCards;
    private javax.swing.JPanel compCard1;
    private javax.swing.JPanel compCard2;
    private javax.swing.JPanel compCard3;
    private javax.swing.JPanel compCard4;
    private javax.swing.JPanel compCard5;
    private javax.swing.JLabel compCardLabel1;
    private javax.swing.JLabel compCardLabel2;
    private javax.swing.JLabel compCardLabel3;
    private javax.swing.JLabel compCardLabel4;
    private javax.swing.JLabel compCardLabel5;
    private javax.swing.JLabel ex2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel myCard1;
    private javax.swing.JPanel myCard2;
    private javax.swing.JPanel myCard3;
    private javax.swing.JPanel myCard4;
    private javax.swing.JPanel myCard5;
    private javax.swing.JLabel myCardLabel1;
    private javax.swing.JLabel myCardLabel2;
    private javax.swing.JLabel myCardLabel3;
    private javax.swing.JLabel myCardLabel4;
    private javax.swing.JLabel myCardLabel5;
    private javax.swing.JLabel yourCards;
    // End of variables declaration//GEN-END:variables
    
}

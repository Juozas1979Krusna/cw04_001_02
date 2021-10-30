
import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;


import java.awt.event.*;
import  javax.swing.*;
import  java.sql.*;
import  java.util.*;

public class cw04_001_02 extends JPanel {

    // JTextField

    static JTextField tcw04_01_001_d;
    static JTextField tcw04_01_001_b;
    static JTextField tcw04_01_001_l;
    static JTextField tcw04_01_001_res;

    static JTextField tcw05_01_001_f;
    static JTextField tcw05_01_001_f_rnd;
    static JTextField tcw05_01_001_i;
    static JTextField tcw05_01_001_res;

    static JTextField tcw06_01_001_f01 ;
    static JTextField tcw06_01_001_f02 ;
    static JTextField tcw06_01_001_res ;

    static JTextField thw03_01_001_inpt ;
    static JTextField thw03_01_001_gvnn ;
    static JTextField thw03_01_001_fmln ;


    static JTextField tEmpRgLogIn;
    static JTextField tEmpRgPssw1;
    static JTextField tEmpRgPssw2;

    static JTextField tDevRgDevNm;
    static JTextField tDevRgDescr;
    static JTextField tDevRgSrNum;

    static JTextField tSpPrtSPtNm;
    static JTextField tSpPrtDescr;
    static JTextField tSpPrtSrNum;

    // JButton
    static JButton bcw04_01_001_sbmt;
    static JButton bcw05_01_001_gene;
    static JButton bcw06_01_001_gene;

    static JButton bcw06_01_001_add;
    static JButton bcw06_01_001_sub;
    static JButton bcw06_01_001_mlt;
    static JButton bcw06_01_001_dvd;
    static JButton bhw03_01_001_sbmt ;



    static JButton bEmpRgSubmit;

    static JButton bDevRgSubmit;

    static JButton bSpPrtSubmit;

    //    static JButton bEvRegSubmit;
    // JComboBox
    static JComboBox xSpPrtPtType;
//    static JComboBox bcw05_01_001_sbmt;
//    static JComboBox xEvnRgDevSNm;
    /* */

//    static JComboBox xExDevNumLst;
//    static JComboBox xspPrtItmLst;
//    static JComboBox xspPartSrNum;
//    static JComboBox xExEventList;

    /* */
    public cw04_001_02() {
        initializeUI();
    }

    //    cw04_001_01() {
//    }
    public static void showFrame() {
        JPanel panel = new cw04_001_02();
        panel.setOpaque(true);

        JFrame frame = new JFrame("Cumulative Work");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(cw04_001_02::showFrame);
    }

    private void initializeUI() {

        JTabbedPane tabbedPane = new JTabbedPane();
        /* V cw04_01_001 */
        JPanel cw04_01_001Panel = new JPanel();

        tcw04_01_001_d = new JTextField(10);
        tcw04_01_001_b = new JTextField(10);
        tcw04_01_001_l = new JTextField(10);
        tcw04_01_001_res = new JTextField(10);

        cw04_01_001Panel.add(new JLabel("Ievadi skaitli (punkti-10): "));
        cw04_01_001Panel.add(tcw04_01_001_d);
        cw04_01_001Panel.add(new JLabel("Ievadi boolean true (punkti-100): "));
        cw04_01_001Panel.add(tcw04_01_001_b);
        cw04_01_001Panel.add(new JLabel("Ievadi netuksu string (punkti-1000): "));
        cw04_01_001Panel.add(tcw04_01_001_l);

        bcw04_01_001_sbmt = new JButton("Get Account");
        bcw04_01_001_sbmt.addActionListener (
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String X_double  = tcw04_01_001_d.getText();

                        String outStrPrint="";
                        int result =0;
                        try {
                            double X_double_out = Double.parseDouble(X_double);

                            result =10;

                        } catch(NumberFormatException ev){}

                        String X_boolean = tcw04_01_001_b.getText();

                        try {
                            boolean X_boolean_out = Boolean.parseBoolean(X_boolean);

                            if (X_boolean_out == true)
                            result =result +100;
                        } catch(NumberFormatException ev){}
                        String X_text = "";
                        X_text = tcw04_01_001_l.getText();
                        try {
                            if (X_text.length()!= 0)
                                result =result +1000;
                        } catch(NumberFormatException ev){}
                        outStrPrint=String.valueOf(result);
                        tcw04_01_001_res.setText(outStrPrint);
                    }
                }
        );
        cw04_01_001Panel.add(bcw04_01_001_sbmt);
        cw04_01_001Panel.add(tcw04_01_001_res);

        // Add Log In Tab
        tabbedPane.addTab("cw04_01_001", cw04_01_001Panel);
        /* A cw04_01_001 */
        /* V cw05_01_001 */
        JPanel cw05_01_001Panel = new JPanel();

        tcw05_01_001_f = new JTextField(10);
        tcw05_01_001_f_rnd = new JTextField(10);
        tcw05_01_001_i = new JTextField(10);
        tcw05_01_001_res = new JTextField(10);
        bcw05_01_001_gene = new JButton("Get Account");
        bcw05_01_001_gene.addActionListener (
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        Random rand = new Random();
                        float X_05_float = 1000*rand.nextFloat();

                        String f_outStrPrint="";
                        f_outStrPrint=String.valueOf(X_05_float);
                        tcw05_01_001_f.setText(f_outStrPrint);

                        X_05_float = Math.round(X_05_float);
                        String f_rnd_outStrPrint="";
                        f_rnd_outStrPrint=String.valueOf(X_05_float);
                        tcw05_01_001_f_rnd.setText(f_rnd_outStrPrint);

                        int X_05_int = (int) X_05_float ;
                        String i_outStrPrint="";
                        i_outStrPrint=String.valueOf(X_05_int);
                        tcw05_01_001_i.setText(i_outStrPrint);
                        String res_outStrPrint="";
                            if ((X_05_int ^ 1) == X_05_int + 1)
                                res_outStrPrint="even";
                            else
                                res_outStrPrint="odd";
                        tcw05_01_001_res.setText(res_outStrPrint);
                    }
                }
        );
        cw05_01_001Panel.add(bcw05_01_001_gene);

        cw05_01_001Panel.add(new JLabel("cw05_01_001 "));
        cw05_01_001Panel.add(new JLabel("Generated float"));
        cw05_01_001Panel.add(tcw05_01_001_f);
        cw05_01_001Panel.add(new JLabel("Rounded float"));
        cw05_01_001Panel.add(tcw05_01_001_f_rnd);
        cw05_01_001Panel.add(new JLabel("Converted integer"));
        cw05_01_001Panel.add(tcw05_01_001_i);
        cw05_01_001Panel.add(new JLabel("even vs odd"));
        cw05_01_001Panel.add(tcw05_01_001_res);

        // Add Employ Register Tab
        tabbedPane.addTab("cw05_01_001", cw05_01_001Panel);
        /* A cw05_01_001 */
        /* V cw06_01_001 */
        JPanel cw06_01_001Panel = new JPanel();

        tcw06_01_001_f01 = new JTextField(10);
        tcw06_01_001_f02 = new JTextField(10);
        tcw06_01_001_res = new JTextField(10);
        bcw06_01_001_gene = new JButton("Generate");
        bcw06_01_001_gene.addActionListener (
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String f_outStrPrint="";
                        Random rand = new Random();
                        float X_06_float01 = 1000*rand.nextFloat();
                        f_outStrPrint=String.valueOf(X_06_float01);
                        tcw06_01_001_f01.setText(f_outStrPrint);
                        float X_06_float02 = 1000*rand.nextFloat();
                        f_outStrPrint=String.valueOf(X_06_float02);
                        tcw06_01_001_f02.setText(f_outStrPrint);
                        /**/

                        bcw06_01_001_add = new JButton("+");
                        bcw06_01_001_add.addActionListener (
                                new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        String f_outStrPrint="";
                                        f_outStrPrint=String.valueOf(X_06_float01 + X_06_float02);
                                        tcw06_01_001_res.setText(f_outStrPrint);
                                    }
                                }
                        );
                        cw06_01_001Panel.add(bcw06_01_001_add);
                        /**/
                        bcw06_01_001_sub = new JButton("-");
                        bcw06_01_001_sub.addActionListener (
                                new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        String f_outStrPrint="";
                                        f_outStrPrint=String.valueOf(X_06_float01 - X_06_float02);
                                        tcw06_01_001_res.setText(f_outStrPrint);
                                    }
                                }
                        );
                        cw06_01_001Panel.add(bcw06_01_001_sub);
                        /**/
                        bcw06_01_001_mlt = new JButton("*");
                        bcw06_01_001_mlt.addActionListener (
                                new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        String f_outStrPrint="";
                                        f_outStrPrint=String.valueOf(X_06_float01 * X_06_float02);
                                        tcw06_01_001_res.setText(f_outStrPrint);
                                    }
                                }
                        );
                        cw06_01_001Panel.add(bcw06_01_001_mlt);
                        /**/
                        bcw06_01_001_dvd = new JButton("/");
                        bcw06_01_001_dvd.addActionListener (
                                new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        String f_outStrPrint="";
                                        f_outStrPrint=String.valueOf(X_06_float01 / X_06_float02);
                                        tcw06_01_001_res.setText(f_outStrPrint);
                                    }
                                }
                        );
                        cw06_01_001Panel.add(bcw06_01_001_dvd);
                        /**/
                    }
                }
        );
        cw06_01_001Panel.add(bcw06_01_001_gene);
        cw06_01_001Panel.add(new JLabel("float_01"));
        cw06_01_001Panel.add(tcw06_01_001_f01);
        cw06_01_001Panel.add(new JLabel("float_02"));
        cw06_01_001Panel.add(tcw06_01_001_f02);

        cw06_01_001Panel.add(new JLabel("Result"));
        cw06_01_001Panel.add(tcw06_01_001_res);

        // Add Device Register Tab
        tabbedPane.addTab("cw06_01_001", cw06_01_001Panel);
        /* A cw06_01_001*/
        /* V hw03_01_001*/
        JPanel hw03_01_001Panel = new JPanel();
//
        thw03_01_001_inpt = new JTextField(30);
        thw03_01_001_gvnn = new JTextField(15);
        thw03_01_001_fmln = new JTextField(15);

        hw03_01_001Panel.add(new JLabel("Ievadi vardu un uzvardu: "));
        hw03_01_001Panel.add(thw03_01_001_inpt);

        bhw03_01_001_sbmt = new JButton("Submit Input");
        bhw03_01_001_sbmt.addActionListener (
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        String X_stringRaw  = thw03_01_001_inpt.getText();
                        String array1[]= X_stringRaw.split(" ");
                        String X_string_gvnn  = array1[0];
                        String X_string_fmln  = array1[1];

                        X_string_fmln = (X_string_fmln.toUpperCase());
                        X_string_gvnn = (X_string_gvnn.toLowerCase());
                        String output = X_string_gvnn.substring(0, 1).toUpperCase() + X_string_gvnn.substring(1);

                        thw03_01_001_gvnn.setText(output);
                        thw03_01_001_fmln.setText(X_string_fmln);


                    }
                }
        );
        hw03_01_001Panel.add(bhw03_01_001_sbmt);
/*


        bcw04_01_001_sbmt = new JButton("Get Account");
        bcw04_01_001_sbmt.addActionListener (
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String X_double  = tcw04_01_001_d.getText();

                        String outStrPrint="";
                        int result =0;
                        try {
                            double X_double_out = Double.parseDouble(X_double);

                            result =10;

                        } catch(NumberFormatException ev){}

                        String X_boolean = tcw04_01_001_b.getText();

                        try {
                            boolean X_boolean_out = Boolean.parseBoolean(X_boolean);

                            if (X_boolean_out == true)
                                result =result +100;
                        } catch(NumberFormatException ev){}
                        String X_text = "";
                        X_text = tcw04_01_001_l.getText();
                        try {
                            if (X_text.length()!= 0)
                                result =result +1000;
                        } catch(NumberFormatException ev){}
                        outStrPrint=String.valueOf(result);
                        tcw04_01_001_res.setText(outStrPrint);
                    }
                }
        );
        cw04_01_001Panel.add(bcw04_01_001_sbmt);


/**/
        hw03_01_001Panel.add(new JLabel("Vards: "));
        hw03_01_001Panel.add(thw03_01_001_gvnn);
        hw03_01_001Panel.add(new JLabel("Uzvards: "));
        hw03_01_001Panel.add(thw03_01_001_fmln);

        // Add Account Tab
        tabbedPane.addTab("hw03_01_001", hw03_01_001Panel);
        /* A hw03_01_001*/

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 200));
        this.add(tabbedPane, BorderLayout.CENTER);
    }
}



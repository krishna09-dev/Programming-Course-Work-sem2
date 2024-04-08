// Purpose: This file contains the GUI for the Teacher Management System

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
// import javax.swing.JTextField;

// import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class TeacherGUI implements ActionListener{

    JFrame frame;
    JButton LoginButton, loginButton2;
    JPanel mainPanel;
    JPanel Background;
    JPanel Background2, DashBoard;

    public TeacherGUI() {
        frame = new JFrame();
        frame.setTitle("Teacher Management System");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1280,832);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 1280, 832);
        mainPanel.setLayout(null);
        frame.add(mainPanel);

        Background = new JPanel();
        Background.setBounds(0, 0, 1280, 832);
        Background.setLayout(null);
        mainPanel.add(Background);

        showLoginPage();
        showDashBoard();

        // Add components here

        

        JPanel LeftSidePanel = new JPanel();
        LeftSidePanel.setBounds(0, 0, 692, 832);
        LeftSidePanel.setLayout(null);
        LeftSidePanel.setBackground(new java.awt.Color(164, 196, 181));
        Background.add(LeftSidePanel);

         // add image
        // Load and display image
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\startingpage.png"));
            ImageIcon imageIcon = new ImageIcon(image);
            JLabel imageLabel = new JLabel(imageIcon);
            // Adjust position and size of image label
            imageLabel.setBounds(0, 62, imageIcon.getIconWidth(), imageIcon.getIconHeight());
            LeftSidePanel.add(imageLabel);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error loading image: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    


        // JLabel LeftSideH1 = new JLabel("Welcome");
        // LeftSideH1.setBounds(238, 273, 216, 58);
        // LeftSideH1.setFont(new java.awt.Font("Arial", 1, 48));
        // LeftSideH1.setForeground(new java.awt.Color(105, 105, 105));
        // LeftSidePanel.add(LeftSideH1);

        // JLabel LeftSideH2 = new JLabel("to");
        // LeftSideH2.setBounds(320, 319, 52, 58);
        // LeftSideH2.setFont(new java.awt.Font("Arial", 1, 48));
        // LeftSideH2.setForeground(new java.awt.Color(105, 105, 105));
        // LeftSidePanel.add(LeftSideH2);

        // JLabel LeftSideH3 = new JLabel("Teacher");
        // LeftSideH3.setBounds(251, 367, 190, 58);
        // LeftSideH3.setFont(new java.awt.Font("Arial", 1, 48));
        // LeftSideH3.setForeground(new java.awt.Color(105, 105, 105));
        // LeftSidePanel.add(LeftSideH3);

        // JLabel LeftSideH4 = new JLabel("Management System");
        // LeftSideH4.setBounds(92, 418, 507, 67);
        // LeftSideH4.setFont(new java.awt.Font("Arial", 1, 48));
        // LeftSideH4.setForeground(new java.awt.Color(105, 105, 105));
        // LeftSidePanel.add(LeftSideH4);

        

        // JLabel LeftSideH5 = new JLabel("Mange all the records in easy way possible.....");
        // LeftSideH5.setBounds(120, 490, 523, 40);
        // LeftSideH5.setFont(new java.awt.Font("Arial", 1, 18));
        // LeftSideH5.setForeground(new java.awt.Color(105, 105, 105));
        // LeftSidePanel.add(LeftSideH5);
        // add underline below this label

        JLabel RightSideH1 = new JLabel("Islington College");
        RightSideH1.setBounds(1100, 32, 228, 38);
        RightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        RightSideH1.setForeground(new java.awt.Color(101, 151, 128));
        Background.add(RightSideH1);

        LoginButton = new JButton("Log in");
        LoginButton.setBounds(858, 367, 276, 80);
        LoginButton.setFont(new java.awt.Font("Arial", 1, 25));
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setBackground(new java.awt.Color(105, 105, 105));
        LoginButton.addActionListener(this);
        Background.add(LoginButton);

        JLabel RightSideH2 = new JLabel("Please Log in to continue");
        RightSideH2.setBounds(907, 468, 237, 26);
        RightSideH2.setFont(new java.awt.Font("Arial", 1, 15));
        RightSideH2.setForeground(new java.awt.Color(101, 151, 128));
        Background.add(RightSideH2);

        JLabel RightSideH3 = new JLabel("Note : Only for authorities staffs");
        RightSideH3.setBounds(880, 494, 294, 26);
        RightSideH3.setFont(new java.awt.Font("Arial", 1, 15));
        RightSideH3.setForeground(new java.awt.Color(101, 151, 128));
        Background.add(RightSideH3);
        
    }

    

    public void showLoginPage(){
        // Add components here
        Background2 = new JPanel();
        Background2.setBounds(0, 0, 1280, 832);
        Background2.setBackground(new java.awt.Color(164, 196, 181));
        Background2.setLayout(null);
        
        

        JLabel RightSideH1 = new JLabel("Islington College");
        RightSideH1.setBounds(1100, 32, 228, 38);
        RightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        RightSideH1.setForeground(new java.awt.Color(101, 151, 128));
        Background2.add(RightSideH1);

        JLabel centerH1 = new JLabel("Welcome to TMS");
        centerH1.setBounds(490, 180, 330, 47);
        centerH1.setFont(new java.awt.Font("Arial", 1, 35));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        Background2.add(centerH1);

        JLabel centerH2 = new JLabel("Log in Form");
        centerH2.setBounds(558, 235, 228, 47);
        centerH2.setFont(new java.awt.Font("Arial", 1, 25));
        centerH2.setForeground(new java.awt.Color(105, 105, 105));
        Background2.add(centerH2);

        JLabel name = new JLabel("Name");
        name.setBounds(434, 317, 223, 42);
        name.setFont(new java.awt.Font("Arial", 1, 23));
        name.setForeground(new java.awt.Color(105, 105, 105));
        Background2.add(name);

        // JTextField nameField = new JTextField();
        // nameField.setBounds(524, 317, 250, 40);
        // nameField.setFont(new java.awt.Font("Arial", 1, 20));
        // nameField.setForeground(new java.awt.Color(105, 105, 105));
        // Background2.add(nameField);

        JLabel staffID = new JLabel("Staff ID");
        staffID.setBounds(434, 395, 213, 42);
        staffID.setFont(new java.awt.Font("Arial", 1, 23));
        staffID.setForeground(new java.awt.Color(105, 105, 105));
        Background2.add(staffID);

        // JTextField staffIDField = new JTextField();
        // staffIDField.setBounds(524, 395, 250, 40);
        // staffIDField.setFont(new java.awt.Font("Arial", 1, 20));
        // staffIDField.setForeground(new java.awt.Color(105, 105, 105));
        // Background2.add(staffIDField);

        loginButton2 = new JButton("Log in");
        loginButton2.setBounds(520, 477, 205, 63);
        loginButton2.setFont(new java.awt.Font("Arial", 1, 20));
        loginButton2.setForeground(new java.awt.Color(255, 255, 255));
        loginButton2.setBackground(new java.awt.Color(105, 105, 105));
        loginButton2.addActionListener(this);
        Background2.add(loginButton2);

        JLabel centerSideH3 = new JLabel("Note : Only for authorities staff ");
        centerSideH3.setBounds(510, 566, 294, 26);
        centerSideH3.setFont(new java.awt.Font("Arial", 1, 15));
        centerSideH3.setForeground(new java.awt.Color(101, 151, 128));
        Background2.add(centerSideH3);

        

    }

    public void showDashBoard(){
        // Add components here
        DashBoard = new JPanel();
        DashBoard.setBounds(0, 0, 1280, 832);
        DashBoard.setBackground(new java.awt.Color(255, 255, 255));
        DashBoard.setLayout(null);

        JPanel leftSidePanel = new JPanel();
        leftSidePanel.setBounds(0, 0, 321, 832);
        leftSidePanel.setLayout(null);
        leftSidePanel.setBackground(new java.awt.Color(164, 196, 181));
        DashBoard.add(leftSidePanel);

        JLabel leftSideH1 = new JLabel("Dashboard");
        leftSideH1.setBounds(75, 48, 172, 49);
        leftSideH1.setFont(new java.awt.Font("Arial", 1, 30));
        leftSideH1.setForeground(new java.awt.Color(105, 105, 105));
        leftSidePanel.add(leftSideH1);

        //buttons

        JButton home = new JButton("Home");
        home.setBounds(75, 150, 172, 49);
        home.setFont(new java.awt.Font("Arial", 1, 15));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setBackground(new java.awt.Color(105, 105, 105));
        DashBoard.add(home);

        JButton lecturer = new JButton("Lecturer");
        lecturer.setBounds(75, 200, 172, 49);
        lecturer.setFont(new java.awt.Font("Arial", 1, 15));
        lecturer.setForeground(new java.awt.Color(255, 255, 255));
        lecturer.setBackground(new java.awt.Color(105, 105, 105));
        DashBoard.add(lecturer);

        JButton tutor = new JButton("Tutor");
        tutor.setBounds(75, 250, 172, 49);
        tutor.setFont(new java.awt.Font("Arial", 1, 15));
        tutor.setForeground(new java.awt.Color(255, 255, 255));
        tutor.setBackground(new java.awt.Color(105, 105, 105));
        DashBoard.add(tutor);

        JButton assignments = new JButton("Assignments");
        assignments.setBounds(75, 300, 172, 49);
        assignments.setFont(new java.awt.Font("Arial", 1, 15));
        assignments.setForeground(new java.awt.Color(255, 255, 255));
        assignments.setBackground(new java.awt.Color(105, 105, 105));
        DashBoard.add(assignments);

        JButton LogOut = new JButton("Log Out");
        LogOut.setBounds(75, 350, 172, 49);
        LogOut.setFont(new java.awt.Font("Arial", 1, 15));
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setBackground(new java.awt.Color(105, 105, 105));
        DashBoard.add(LogOut);


        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(101, 151, 128));
        DashBoard.add(rightSideH1);

        JLabel rightSideH2 = new JLabel("Welcome to TMS");
        rightSideH2.setBounds(583, 176, 469, 58);
        rightSideH2.setFont(new java.awt.Font("Arial", 1, 35));
        rightSideH2.setForeground(new java.awt.Color(105, 105, 105));
        DashBoard.add(rightSideH2);

        JButton teacherData = new JButton("Show Teacher Data");
        teacherData.setBounds(394, 288, 266, 88);
        teacherData.setFont(new java.awt.Font("Arial", 1, 20));
        teacherData.setForeground(new java.awt.Color(255, 255, 255));
        teacherData.setBackground(new java.awt.Color(105, 105, 105));
        DashBoard.add(teacherData);

        JButton tutorData = new JButton("Show Tutor Data");
        tutorData.setBounds(394, 388, 266, 88);
        tutorData.setFont(new java.awt.Font("Arial", 1, 20));
        tutorData.setForeground(new java.awt.Color(255, 255, 255));
        tutorData.setBackground(new java.awt.Color(105, 105, 105));
        DashBoard.add(tutorData);

        JButton lecturerData = new JButton("Show Lecturer Data");
        lecturerData.setBounds(394, 488, 266, 88);
        lecturerData.setFont(new java.awt.Font("Arial", 1, 20));
        lecturerData.setForeground(new java.awt.Color(255, 255, 255));
        lecturerData.setBackground(new java.awt.Color(105, 105, 105));
        DashBoard.add(lecturerData);



        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Add action listeners here
        if (e.getSource() == LoginButton) {
            // Remove the current background panel and show the login page
            mainPanel.remove(Background);
            mainPanel.add(Background2);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == loginButton2) {
            // Remove the current background panel and show the login page
            mainPanel.remove(Background2);
            mainPanel.add(DashBoard);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
    }

    public static void main(String[] args) {
        new TeacherGUI();
    }


    

}

    


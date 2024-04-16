// Purpose: This file contains the GUI for the Teacher Management System

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class TeacherGUI implements ActionListener{

    JFrame frame;
    JTextField userIDField, passwordField;
    JButton startLoginButton, mainLoginButton, displayData, lecturer, addLecturer, tutor, addTutor, gradeAssignment, profile,menuHome,menuLecturer,menuTutor,menuAssignments,menuProfile,menuLogOut,
    assignment, setSalaryOfTutor,removeTutor,displayTutorData,displayTutorSalary, displayTutorSalaryDisplayMethod, displayGradedAssignments ;
    JPanel mainPanel;
    JPanel startBackground, loginPageBackground, dashBoardBackground, displayDataPanel, addlecturerPanel, lecturerPanel, leftSideMenuPanel, tutorPanel
    , addTutorPanel, removeTutorPanel, displayTutorSalaryPanel, setSalaryPanel, assignmentPanel, DisplayGradedAssignmentsPanel, profilePanel, profileGUIPanel;
    
    int user;
    //Constructor
    public TeacherGUI() {

        //Creating Frame and settinf its title
        frame = new JFrame();
        frame.setTitle("Teacher Management System");
        
        //creating a Main Panel to add components and added it to the frame by setting its sizes and layout
        mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 1280, 832);
        mainPanel.setLayout(null);
        frame.add(mainPanel);

        //Sub panel for each pages(Starting point of the UI)
        startBackground = new JPanel();
        startBackground.setBounds(0, 0, 1280, 832);
        startBackground.setLayout(null);
        mainPanel.add(startBackground);

        // adding components and setting up there size,color,positions etc 

        JPanel leftSidePanel = new JPanel();
        leftSidePanel.setBounds(0, 0, 692, 832);
        leftSidePanel.setLayout(null);
        leftSidePanel.setBackground(new java.awt.Color(164, 196, 181));
        startBackground.add(leftSidePanel);

        JLabel leftSideH1 = new JLabel("Welcome");
        leftSideH1.setBounds(271, 487, 149, 46);
        leftSideH1.setFont(new java.awt.Font("Arial", 1, 30));
        leftSideH1.setForeground(new java.awt.Color(105, 105, 105));
        leftSidePanel.add(leftSideH1);

        JLabel leftSideH2 = new JLabel("to");
        leftSideH2.setBounds(329, 518, 34, 41);
        leftSideH2.setFont(new java.awt.Font("Arial", 1, 30));
        leftSideH2.setForeground(new java.awt.Color(105, 105, 105));
        leftSidePanel.add(leftSideH2);

        JLabel leftSideH3 = new JLabel("Teacher");
        leftSideH3.setBounds(279, 549, 134, 40);
        leftSideH3.setFont(new java.awt.Font("Arial", 1, 30));
        leftSideH3.setForeground(new java.awt.Color(105, 105, 105));
        leftSidePanel.add(leftSideH3);

        JLabel leftSideH4 = new JLabel("Management System");
        leftSideH4.setBounds(179, 581, 333, 42);
        leftSideH4.setFont(new java.awt.Font("Arial", 1, 30));
        leftSideH4.setForeground(new java.awt.Color(105, 105, 105));
        leftSidePanel.add(leftSideH4);

        JLabel leftSideH5 = new JLabel("Manage all the records in easy way possible.....");
        leftSideH5.setBounds(196, 620, 308, 30);
        leftSideH5.setFont(new java.awt.Font("Arial", 1, 12));
        leftSideH5.setForeground(new java.awt.Color(105, 105, 105));
        leftSidePanel.add(leftSideH5);
        // add underline below this label <-----------------------pending to do

        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(101, 151, 128));
        startBackground.add(rightSideH1);

        startLoginButton = new JButton("Log in");
        startLoginButton.setBounds(858, 367, 276, 80);
        startLoginButton.setFont(new java.awt.Font("Arial", 1, 25));
        startLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        startLoginButton.setBackground(new java.awt.Color(105, 105, 105));
        startLoginButton.addActionListener(this);
        startBackground.add(startLoginButton);

        JLabel rightSideH2 = new JLabel("Please Log in to continue");
        rightSideH2.setBounds(907, 468, 237, 26);
        rightSideH2.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH2.setForeground(new java.awt.Color(101, 151, 128));
        startBackground.add(rightSideH2);

        JLabel rightSideH3 = new JLabel("Note : Only for authorities staffs");
        rightSideH3.setBounds(880, 494, 294, 26);
        rightSideH3.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH3.setForeground(new java.awt.Color(101, 151, 128));
        startBackground.add(rightSideH3);

        // Loadong and displaying image with expection handeling by using try Catch
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\startingpage.png"));
            ImageIcon imageIcon = new ImageIcon(image);
            JLabel imageLabel = new JLabel(imageIcon);
            // Adjust position and size of image label
            imageLabel.setBounds(0, 62, imageIcon.getIconWidth(), imageIcon.getIconHeight());
            leftSidePanel.add(imageLabel);
            // Repaint the panel to reflect the changes
            leftSidePanel.repaint();
        } catch (IOException ex) {
            // if failed to load image display label as image failed to load 
            JLabel imageText = new JLabel("Image Failed to Load");
            imageText.setBounds(0, 29, 100, 100);
            leftSidePanel.add(imageText);
        }

        //setting up  frame with required layout and settingsz
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1280,832);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        //calling the user-defined methods in constructor
        showLoginPage();
        sideMenu();
        showDashBoard();
        displayData();
        LecturerGUI();
        AddLecturer();
        TutorGUI();
        AddTutor();
        RemoveTutor();
        DisplayTutorSalary();
        SetSalary();
        AssignmentGUI();
        DisplayGradedAssignments();
        ProfileGUI();
    }

    //Login page GUI in user-defined Method
    public void showLoginPage(){
        
        //BackgroundPannel for Login page
        loginPageBackground = new JPanel();

        // adding components and setting up there size,color,positions etc 
        JLabel RightSideH1 = new JLabel("Islington College");
        RightSideH1.setBounds(1100, 32, 228, 38);
        RightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        RightSideH1.setForeground(new java.awt.Color(101, 151, 128));
        loginPageBackground.add(RightSideH1);

        JLabel centerH1 = new JLabel("Welcome to TMS");
        centerH1.setBounds(490, 180, 330, 47);
        centerH1.setFont(new java.awt.Font("Arial", 1, 35));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        loginPageBackground.add(centerH1);

        JLabel centerH2 = new JLabel("Log in Form");
        centerH2.setBounds(558, 235, 228, 47);
        centerH2.setFont(new java.awt.Font("Arial", 1, 25));
        centerH2.setForeground(new java.awt.Color(105, 105, 105));
        loginPageBackground.add(centerH2);

        JLabel userID = new JLabel("User ID");
        userID.setBounds(412, 317, 223, 42);
        userID.setFont(new java.awt.Font("Arial", 1, 23));
        userID.setForeground(new java.awt.Color(105, 105, 105));
        loginPageBackground.add(userID);

        userIDField = new JTextField();
        userIDField.setBounds(530, 317, 250, 40);
        userIDField.setFont(new java.awt.Font("Arial", 1, 20));
        userIDField.setForeground(new java.awt.Color(105, 105, 105));
        loginPageBackground.add(userIDField);

        JLabel password = new JLabel("Password");
        password.setBounds(412, 395, 213, 42);
        password.setFont(new java.awt.Font("Arial", 1, 23));
        password.setForeground(new java.awt.Color(105, 105, 105));
        loginPageBackground.add(password);

        passwordField = new JTextField();
        passwordField.setBounds(530, 395, 250, 40);
        passwordField.setFont(new java.awt.Font("Arial", 1, 20));
        passwordField.setForeground(new java.awt.Color(105, 105, 105));
        loginPageBackground.add(passwordField);

        mainLoginButton = new JButton("Log in");
        mainLoginButton.setBounds(520, 477, 205, 63);
        mainLoginButton.setFont(new java.awt.Font("Arial", 1, 20));
        mainLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        mainLoginButton.setBackground(new java.awt.Color(105, 105, 105));
        mainLoginButton.addActionListener(this);
        loginPageBackground.add(mainLoginButton);

        JLabel centerSideH3 = new JLabel("Note : Only for authorities staff ");
        centerSideH3.setBounds(510, 566, 294, 26);
        centerSideH3.setFont(new java.awt.Font("Arial", 1, 15));
        centerSideH3.setForeground(new java.awt.Color(101, 151, 128));
        loginPageBackground.add(centerSideH3);


        //Panel Setting
        loginPageBackground.setBounds(0, 0, 1280, 832);
        loginPageBackground.setBackground(new java.awt.Color(164, 196, 181));
        loginPageBackground.setLayout(null);

    }

    //Side Menu GUI User-defined Method 
    public void sideMenu(){

        leftSideMenuPanel = new JPanel();

        // adding components and setting up there size,color,positions etc 
        JLabel leftSideH1 = new JLabel("Dashboard");
        leftSideH1.setBounds(75, 48, 172, 49);
        leftSideH1.setFont(new java.awt.Font("Arial", 1, 30));
        leftSideH1.setForeground(new Color(105, 105, 105));
        leftSideMenuPanel.add(leftSideH1);

        BufferedImage homeimage = null;
        try {
            homeimage = ImageIO.read(new File("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\Home.png")); 
        }catch (IOException e) {
            // if failed to load image display label as image failed to load 
            JLabel imageText = new JLabel("Image Failed to Load");
            imageText.setBounds(0, 29, 10, 3);
            leftSideMenuPanel.add(imageText);
        }

        int newWidth = 25; // New width of the image
        int newHeight = 25; // New height of the image
        Image scaledhomeImage = homeimage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        

        //Buttons for Menu
        menuHome = new JButton("Home", new ImageIcon(scaledhomeImage));
        menuHome.setBounds(0, 150, 321, 49);
        menuHome.setFont(new java.awt.Font("Arial", 1, 15));
        menuHome.setForeground(new java.awt.Color(105, 105, 105));
        menuHome.setBackground(new java.awt.Color(164, 196, 181));
        menuHome.addActionListener(this);
        leftSideMenuPanel.add(menuHome);

        BufferedImage lecturerimage = null;
        try {
            lecturerimage = ImageIO.read(new File("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\Lecturer.png")); 
        }catch (IOException e) {
            // if failed to load image display label as image failed to load 
            JLabel imageText = new JLabel("Image Failed to Load");
            imageText.setBounds(0, 29, 10, 3);
            leftSideMenuPanel.add(imageText);
        }
        Image scaledLecturerImage = lecturerimage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        menuLecturer = new JButton("Lecturer", new ImageIcon(scaledLecturerImage));
        menuLecturer.setBounds(0, 200, 321, 49);
        menuLecturer.setFont(new java.awt.Font("Arial", 1, 15));
        menuLecturer.setForeground(new java.awt.Color(105, 105, 105));
        menuLecturer.setBackground(new java.awt.Color(164, 196, 181));
        menuLecturer.addActionListener(this);
        leftSideMenuPanel.add(menuLecturer);

        BufferedImage tutorimage = null;
        try {
            tutorimage = ImageIO.read(new File("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\Tutor.png")); 
        }catch (IOException e) {
            // if failed to load image display label as image failed to load 
            JLabel imageText = new JLabel("Image Failed to Load");
            imageText.setBounds(0, 29, 10, 3);
            leftSideMenuPanel.add(imageText);
        }
        Image scaledTutorImage = tutorimage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        menuTutor = new JButton("Tutor", new ImageIcon(scaledTutorImage));
        menuTutor.setBounds(0, 250, 321, 49);
        menuTutor.setFont(new java.awt.Font("Arial", 1, 15));
        menuTutor.setForeground(new java.awt.Color(105, 105, 105));
        menuTutor.setBackground(new java.awt.Color(164, 196, 181));
        menuTutor.addActionListener(this);
        leftSideMenuPanel.add(menuTutor);

        BufferedImage assignmentimage = null;
        try {
            assignmentimage = ImageIO.read(new File("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\Assignment.png")); 
        }catch (IOException e) {
            // if failed to load image display label as image failed to load 
            JLabel imageText = new JLabel("Image Failed to Load");
            imageText.setBounds(0, 29, 10, 3);
            leftSideMenuPanel.add(imageText);
        }
        Image scaledAssignmentImage = assignmentimage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        menuAssignments = new JButton("Assignments", new ImageIcon(scaledAssignmentImage));
        menuAssignments.setBounds(0, 300, 321, 49);
        menuAssignments.setFont(new java.awt.Font("Arial", 1, 15));
        menuAssignments.setForeground(new java.awt.Color(105, 105, 105));
        menuAssignments.setBackground(new java.awt.Color(164, 196, 181));
        menuAssignments.addActionListener(this);
        leftSideMenuPanel.add(menuAssignments);

        BufferedImage profileimage = null;
        try {
            profileimage = ImageIO.read(new File("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\Profile.png")); 
        }catch (IOException e) {
            // if failed to load image display label as image failed to load 
            JLabel imageText = new JLabel("Image Failed to Load");
            imageText.setBounds(0, 29, 10, 3);
            leftSideMenuPanel.add(imageText);
        }
        Image scaledProfileImage = profileimage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        menuProfile = new JButton("Profile", new ImageIcon(scaledProfileImage));
        menuProfile.setBounds(0, 350, 321, 49);
        menuProfile.setFont(new java.awt.Font("Arial", 1, 15));
        menuProfile.setForeground(new java.awt.Color(105, 105, 105));
        menuProfile.setBackground(new java.awt.Color(164, 196, 181));
        menuProfile.addActionListener(this);
        leftSideMenuPanel.add(menuProfile);

        BufferedImage logoutimage = null;
        try {
            logoutimage = ImageIO.read(new File("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\Logout.png")); 
        }catch (IOException e) {
            // if failed to load image display label as image failed to load 
            JLabel imageText = new JLabel("Image Failed to Load");
            imageText.setBounds(0, 29, 10, 3);
            leftSideMenuPanel.add(imageText);
        }
        Image scaledLogOutImage = logoutimage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        
        menuLogOut = new JButton("Log Out", new ImageIcon(scaledLogOutImage));
        menuLogOut.setBounds(0, 400, 321, 49);
        menuLogOut.setFont(new java.awt.Font("Arial", 1, 15));
        menuLogOut.setForeground(new java.awt.Color(105, 105, 105));
        menuLogOut.setBackground(new java.awt.Color(164, 196, 181));
        menuLogOut.addActionListener(this);
        leftSideMenuPanel.add(menuLogOut);

        //Menu-Panel setting
        leftSideMenuPanel.setBounds(0, 0, 321, 832);
        leftSideMenuPanel.setLayout(null);
        leftSideMenuPanel.setBackground(new Color(164, 196, 181));

    }
    
    //Dashoard GUI User-defined Method 
    public void showDashBoard(){
        //backgroundpanel for DashBoard
        dashBoardBackground = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc 
        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(101, 151, 128));
        rightSidePanel.add(rightSideH1);

        JLabel rightSideH2 = new JLabel("Welcome UserName");
        rightSideH2.setBounds(576, 118, 469, 58);
        rightSideH2.setFont(new java.awt.Font("Arial", 1, 35));
        rightSideH2.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH2);

        displayData = new JButton("<html> <h1 text-align:center;> Display <br> Data </h1></html>");
        displayData.setBounds(379, 224, 222, 118);
        displayData.setFont(new java.awt.Font("Arial", 1, 20));
        displayData.setForeground(new java.awt.Color(105, 105, 105));
        displayData.setBackground(new java.awt.Color(164, 196, 181));
        displayData.addActionListener(this);
        rightSidePanel.add(displayData);

        lecturer = new JButton("Lecturer");
        lecturer.setBounds(659, 224, 222, 118);
        lecturer.setFont(new java.awt.Font("Arial", 1, 20));
        lecturer.setForeground(new java.awt.Color(105,105,105));
        lecturer.setBackground(new java.awt.Color(164, 196, 181));
        lecturer.addActionListener(this);
        rightSidePanel.add(lecturer);

        tutor = new JButton("Tutor");
        tutor.setBounds(939, 224, 222, 118);
        tutor.setFont(new java.awt.Font("Arial", 1, 20));
        tutor.setForeground(new java.awt.Color(105,105,105));
        tutor.setBackground(new java.awt.Color(164, 196, 181));
        tutor.addActionListener(this);
        rightSidePanel.add(tutor);

        assignment = new JButton("Assignments");
        assignment.setBounds(379, 390, 222, 118);
        assignment.setFont(new java.awt.Font("Arial", 1, 20));
        assignment.setForeground(new java.awt.Color(105,105,105));
        assignment.setBackground(new java.awt.Color(164, 196, 181));
        assignment.addActionListener(this);
        rightSidePanel.add(assignment);

        profile = new JButton("Profile");
        profile.setBounds(659, 390, 222, 118);
        profile.setFont(new java.awt.Font("Arial", 1, 20));
        profile.setForeground(new java.awt.Color(105,105,105));
        profile.setBackground(new java.awt.Color(164, 196, 181));
        profile.addActionListener(this);
        rightSidePanel.add(profile);

        //Panel Settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        dashBoardBackground.add(rightSidePanel);

        dashBoardBackground.setLayout(null);
        dashBoardBackground.setBounds(0, 0, 1280, 832);
        dashBoardBackground.setBackground(new java.awt.Color(255, 255, 255));

    }

    //DisplayData GUI User-defined Method 
    public void displayData(){

        //backgroundpanel for DIsplayDataPanel
        displayDataPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc 
        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(101, 151, 128));
        rightSidePanel.add(rightSideH1);

        JLabel rightSideH2 = new JLabel("Display Data");
        rightSideH2.setBounds(600, 118, 469, 58);
        rightSideH2.setFont(new java.awt.Font("Arial", 1, 35));
        rightSideH2.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH2);

        JButton displayTeacherData = new JButton("<html><h1 text-align:center;>Display <br> Teacher Data</h1></html>");
        displayTeacherData.setBounds(379, 224, 222, 118);
        displayTeacherData.setFont(new java.awt.Font("Arial", 1, 20));
        displayTeacherData.setForeground(new java.awt.Color(105, 105, 105));
        displayTeacherData.setBackground(new java.awt.Color(164, 196, 181));
        rightSidePanel.add(displayTeacherData);

        JButton displayLecturerData = new JButton("<html><h1 text-align:center;>Display <br> Lecturer Data</h1></html>");
        displayLecturerData.setBounds(659, 224, 222, 118);
        displayLecturerData.setFont(new java.awt.Font("Arial", 1, 20));
        displayLecturerData.setForeground(new java.awt.Color(105,105,105));
        displayLecturerData.setBackground(new java.awt.Color(164, 196, 181));
        rightSidePanel.add(displayLecturerData);

        JButton displayTutorData = new JButton("<html><h1 text-align:center;>Display <br> Tutor Data</h1></html>");
        displayTutorData.setBounds(939, 224, 222, 118);
        displayTutorData.setFont(new java.awt.Font("Arial", 1, 20));
        displayTutorData.setForeground(new java.awt.Color(105,105,105));
        displayTutorData.setBackground(new java.awt.Color(164, 196, 181));
        rightSidePanel.add(displayTutorData);

        displayGradedAssignments = new JButton("<html><h1 text-align:center;>Display Graded <br> Assignments</h1></html>");
        displayGradedAssignments.setBounds(379, 390, 222, 118);
        displayGradedAssignments.setFont(new java.awt.Font("Arial", 1, 20));
        displayGradedAssignments.setForeground(new java.awt.Color(105,105,105));
        displayGradedAssignments.setBackground(new java.awt.Color(164, 196, 181));
        displayGradedAssignments.addActionListener(this);
        rightSidePanel.add(displayGradedAssignments);

        displayTutorSalaryDisplayMethod = new JButton("<html><h1 text-align:center;>Display Tutor <br> Salary</h1></html>");
        displayTutorSalaryDisplayMethod.setBounds(659, 390, 222, 118);
        displayTutorSalaryDisplayMethod.setFont(new java.awt.Font("Arial", 1, 20));
        displayTutorSalaryDisplayMethod.setForeground(new java.awt.Color(105,105,105));
        displayTutorSalaryDisplayMethod.setBackground(new java.awt.Color(164, 196, 181));
        displayTutorSalaryDisplayMethod.addActionListener(this);
        rightSidePanel.add(displayTutorSalaryDisplayMethod);

        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);

        //Panel Settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        displayDataPanel.add(rightSidePanel);

        displayDataPanel.setLayout(null);
        displayDataPanel.setBounds(0, 0, 1280, 832);
        displayDataPanel.setBackground(new java.awt.Color(255, 255, 255));

    }

    public void LecturerGUI(){

        //backgroundpanel for DIsplayDataPanel
        lecturerPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(101, 151, 128));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Lecturer");
        centerH1.setBounds(675, 222, 248, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 45));
        centerH1.setForeground(new java.awt.Color(101, 151, 128));
        rightSidePanel.add(centerH1);

        addLecturer = new JButton("<html><h1 text-align:center;>Add<br>Lecturer</h1><html>");
        addLecturer.setBounds(512, 335, 222, 118);
        addLecturer.setFont(new java.awt.Font("Arial", 1, 20));
        addLecturer.setForeground(new java.awt.Color(105,105,105));
        addLecturer.setBackground(new java.awt.Color(164, 196, 181));
        addLecturer.addActionListener(this);
        rightSidePanel.add(addLecturer);

        JButton displayLecturerData = new JButton("<html><h1 text-align:center;>Display<br>Lecturer Data</h1><html>");
        displayLecturerData.setBounds(788, 335, 222, 118);
        displayLecturerData.setFont(new java.awt.Font("Arial", 1, 20));
        displayLecturerData.setForeground(new java.awt.Color(105,105,105));
        displayLecturerData.setBackground(new java.awt.Color(164, 196, 181));
        rightSidePanel.add(displayLecturerData);

        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        lecturerPanel.add(rightSidePanel);

        lecturerPanel.setLayout(null);
        lecturerPanel.setBounds(0, 0, 1280, 832);
        lecturerPanel.setBackground(new java.awt.Color(255, 255, 255));

    }

    public void AddLecturer(){

        //backgroundpanel for DIsplayDataPanel
        addlecturerPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Lecturer");
        centerH1.setBounds(469, 97, 248, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 45));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(centerH1);

        JLabel centerH2 = new JLabel("Add a Lecturer");
        centerH2.setBounds(379, 164, 282, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 224, 282, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        JLabel teacherName = new JLabel("Teacher Name :");
        teacherName.setBounds(379, 264, 282, 30);
        teacherName.setFont(new Font("Arial", 1, 20));
        teacherName.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherName);

        JLabel address = new JLabel("Address :");
        address.setBounds(379, 303, 282, 30);
        address.setFont(new Font("Arial", 1, 20));
        address.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(address);

        JLabel workingType = new JLabel("Working Type :");
        workingType.setBounds(379, 343, 282, 30);
        workingType.setFont(new Font("Arial", 1, 20));
        workingType.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(workingType);

        JLabel employmentStatus = new JLabel("Employment Status :");
        employmentStatus.setBounds(379, 384, 282, 30);
        employmentStatus.setFont(new Font("Arial", 1, 20));
        employmentStatus.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(employmentStatus);

        JLabel workingHours = new JLabel("Working Hours :");
        workingHours.setBounds(379, 423, 282, 30);
        workingHours.setFont(new Font("Arial", 1, 20));
        workingHours.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(workingHours);

        JLabel yearsOfExperience = new JLabel("Years Of Experience :");
        yearsOfExperience.setBounds(379, 463, 282, 30);
        yearsOfExperience.setFont(new Font("Arial", 1, 20));
        yearsOfExperience.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(yearsOfExperience);
        
        JTextField teacherIDField = new JTextField();
        teacherIDField.setBounds(593, 228, 282, 30);
        teacherIDField.setFont(new Font("Arial", 1, 20));
        teacherIDField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherIDField);

        JTextField teacherNameField = new JTextField();
        teacherNameField.setBounds(593, 268, 282, 30);
        teacherNameField.setFont(new Font("Arial", 1, 20));
        teacherNameField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherNameField);

        JTextField addressField = new JTextField();
        addressField.setBounds(593, 307, 282, 30);
        addressField.setFont(new Font("Arial", 1, 20));
        addressField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(addressField);

        JTextField workingTypeField = new JTextField();
        workingTypeField.setBounds(593, 347, 282, 30);
        workingTypeField.setFont(new Font("Arial", 1, 20));
        workingTypeField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(workingTypeField);

        JTextField employmentStatusField = new JTextField();
        employmentStatusField.setBounds(593, 388, 282, 30);
        employmentStatusField.setFont(new Font("Arial", 1, 20));
        employmentStatusField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(employmentStatusField);

        JTextField workingHoursField = new JTextField();
        workingHoursField.setBounds(593, 427, 282, 30);
        workingHoursField.setFont(new Font("Arial", 1, 20));
        workingHoursField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(workingHoursField);

        JTextField yearsOfExperienceField = new JTextField();
        yearsOfExperienceField.setBounds(593, 467, 282, 30);
        yearsOfExperienceField.setFont(new Font("Arial", 1, 20));
        yearsOfExperienceField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(yearsOfExperienceField);

        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        addlecturerPanel.add(rightSidePanel);

        addlecturerPanel.setLayout(null);
        addlecturerPanel.setBounds(0, 0, 1280, 832);
        addlecturerPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    public void TutorGUI(){

        //backgroundpanel for DIsplayDataPanel
        tutorPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc 
        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Tutor");
        centerH1.setBounds(692, 150, 172, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 35));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(centerH1);

        addTutor = new JButton("Add Tutor");
        addTutor.setBounds(379, 224, 222, 118);
        addTutor.setFont(new java.awt.Font("Arial", 1, 20));
        addTutor.setForeground(new java.awt.Color(105, 105, 105));
        addTutor.setBackground(new java.awt.Color(164, 196, 181));
        addTutor.addActionListener(this);
        rightSidePanel.add(addTutor);

        setSalaryOfTutor = new JButton("<html><h1 text-align:center;>Set Salary of<br>Tutor</h1></html>");
        setSalaryOfTutor.setBounds(659, 224, 222, 118);
        setSalaryOfTutor.setFont(new java.awt.Font("Arial", 1, 15));
        setSalaryOfTutor.setForeground(new java.awt.Color(105,105,105));
        setSalaryOfTutor.setBackground(new java.awt.Color(164, 196, 181));
        setSalaryOfTutor.addActionListener(this);
        rightSidePanel.add(setSalaryOfTutor);

        removeTutor = new JButton("Remove Tutor");
        removeTutor.setBounds(939, 224, 222, 118);
        removeTutor.setFont(new java.awt.Font("Arial", 1, 20));
        removeTutor.setForeground(new java.awt.Color(105,105,105));
        removeTutor.setBackground(new java.awt.Color(164, 196, 181));
        removeTutor.addActionListener(this);
        rightSidePanel.add(removeTutor);

        displayTutorData = new JButton("<html><h1 text-align:center;>Display Tutor<br>Data</h1></html>");
        displayTutorData.setBounds(379, 390, 222, 118);
        displayTutorData.setFont(new java.awt.Font("Arial", 1, 15));
        displayTutorData.setForeground(new java.awt.Color(105,105,105));
        displayTutorData.setBackground(new java.awt.Color(164, 196, 181));
        displayTutorData.addActionListener(this);
        rightSidePanel.add(displayTutorData);

        displayTutorSalary = new JButton("<html><h1 text-align:center;>Display Tutor <br> Salary</h1></html>");
        displayTutorSalary.setBounds(659, 390, 222, 118);
        displayTutorSalary.setFont(new java.awt.Font("Arial", 1, 15));
        displayTutorSalary.setForeground(new java.awt.Color(105,105,105));
        displayTutorSalary.setBackground(new java.awt.Color(164, 196, 181));
        displayTutorSalary.addActionListener(this);
        rightSidePanel.add(displayTutorSalary);

        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);

        //Panel Settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        tutorPanel.add(rightSidePanel);

        tutorPanel.setLayout(null);
        tutorPanel.setBounds(0, 0, 1280, 832);
        tutorPanel.setBackground(new java.awt.Color(255, 255, 255));

    }

    public void AddTutor(){

        //backgroundpanel for DIsplayDataPanel
        addTutorPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Tutor");
        centerH1.setBounds(469, 97, 248, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 45));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(centerH1);

        JLabel centerH2 = new JLabel("Add a Tutor");
        centerH2.setBounds(379, 164, 282, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 224, 250, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        JLabel teacherName = new JLabel("Teacher Name :");
        teacherName.setBounds(379, 264, 282, 30);
        teacherName.setFont(new Font("Arial", 1, 20));
        teacherName.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherName);

        JLabel address = new JLabel("Address :");
        address.setBounds(379, 303, 282, 30);
        address.setFont(new Font("Arial", 1, 20));
        address.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(address);

        JLabel workingType = new JLabel("Working Type :");
        workingType.setBounds(379, 343, 282, 30);
        workingType.setFont(new Font("Arial", 1, 20));
        workingType.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(workingType);

        JLabel employmentStatus = new JLabel("Employment Status :");
        employmentStatus.setBounds(379, 384, 282, 30);
        employmentStatus.setFont(new Font("Arial", 1, 20));
        employmentStatus.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(employmentStatus);

        JLabel workingHours = new JLabel("Working Hours :");
        workingHours.setBounds(379, 423, 282, 30);
        workingHours.setFont(new Font("Arial", 1, 20));
        workingHours.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(workingHours);

        JLabel salary = new JLabel("Salary :");
        salary.setBounds(379, 463, 282, 30);
        salary.setFont(new Font("Arial", 1, 20));
        salary.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(salary);

        JLabel specialization = new JLabel("Employment Status :");
        specialization.setBounds(379, 503, 282, 30);
        specialization.setFont(new Font("Arial", 1, 20));
        specialization.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(specialization);

        JLabel academicQualifications = new JLabel("Academic Qualifications :");
        academicQualifications.setBounds(379, 543, 282, 30);
        academicQualifications.setFont(new Font("Arial", 1, 20));
        academicQualifications.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(academicQualifications);

        JLabel performanceIndex = new JLabel("PerformanceIndex :");
        performanceIndex.setBounds(379, 583, 282, 30);
        performanceIndex.setFont(new Font("Arial", 1, 20));
        performanceIndex.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(performanceIndex);
        
        JTextField teacherIDField = new JTextField();
        teacherIDField.setBounds(630, 228, 282, 30);
        teacherIDField.setFont(new Font("Arial", 1, 20));
        teacherIDField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherIDField);

        JTextField teacherNameField = new JTextField();
        teacherNameField.setBounds(630, 268, 282, 30);
        teacherNameField.setFont(new Font("Arial", 1, 20));
        teacherNameField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherNameField);

        JTextField addressField = new JTextField();
        addressField.setBounds(630, 307, 282, 30);
        addressField.setFont(new Font("Arial", 1, 20));
        addressField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(addressField);

        JTextField workingTypeField = new JTextField();
        workingTypeField.setBounds(630, 347, 282, 30);
        workingTypeField.setFont(new Font("Arial", 1, 20));
        workingTypeField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(workingTypeField);

        JTextField employmentStatusField = new JTextField();
        employmentStatusField.setBounds(630, 388, 282, 30);
        employmentStatusField.setFont(new Font("Arial", 1, 20));
        employmentStatusField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(employmentStatusField);

        JTextField workingHoursField = new JTextField();
        workingHoursField.setBounds(630, 427, 282, 30);
        workingHoursField.setFont(new Font("Arial", 1, 20));
        workingHoursField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(workingHoursField);

        JTextField salaryField = new JTextField();
        salaryField.setBounds(630, 467, 282, 30);
        salaryField.setFont(new Font("Arial", 1, 20));
        salaryField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(salaryField);

        JTextField specializationField = new JTextField();
        specializationField.setBounds(630, 507, 282, 30);
        specializationField.setFont(new Font("Arial", 1, 20));
        specializationField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(specializationField);

        JTextField academicQualificationsField = new JTextField();
        academicQualificationsField.setBounds(630, 547, 282, 30);
        academicQualificationsField.setFont(new Font("Arial", 1, 20));
        academicQualificationsField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(academicQualificationsField);

        JTextField performanceIndexField = new JTextField();
        performanceIndexField.setBounds(630, 587, 282, 30);
        performanceIndexField.setFont(new Font("Arial", 1, 20));
        performanceIndexField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(performanceIndexField);

        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        addTutorPanel.add(rightSidePanel);

        addTutorPanel.setLayout(null);
        addTutorPanel.setBounds(0, 0, 1280, 832);
        addTutorPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    public void RemoveTutor(){

        //backgroundpanel for DIsplayDataPanel
        removeTutorPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Tutor");
        centerH1.setBounds(469, 97, 248, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 45));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(centerH1);

        JLabel centerH2 = new JLabel("Remove a Tutor");
        centerH2.setBounds(379, 164, 282, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 224, 250, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        JTextField teacherIDField = new JTextField();
        teacherIDField.setBounds(630, 228, 282, 30);
        teacherIDField.setFont(new Font("Arial", 1, 20));
        teacherIDField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherIDField);

        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        removeTutorPanel.add(rightSidePanel);

        removeTutorPanel.setLayout(null);
        removeTutorPanel.setBounds(0, 0, 1280, 832);
        removeTutorPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    public void DisplayTutorSalary(){

        //backgroundpanel for DIsplayDataPanel
        displayTutorSalaryPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Tutor");
        centerH1.setBounds(469, 97, 248, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 45));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(centerH1);

        JLabel centerH2 = new JLabel("Display Salary");
        centerH2.setBounds(379, 164, 282, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 224, 250, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        JTextField teacherIDField = new JTextField();
        teacherIDField.setBounds(630, 228, 282, 30);
        teacherIDField.setFont(new Font("Arial", 1, 20));
        teacherIDField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherIDField);

        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        displayTutorSalaryPanel.add(rightSidePanel);

        displayTutorSalaryPanel.setLayout(null);
        displayTutorSalaryPanel.setBounds(0, 0, 1280, 832);
        displayTutorSalaryPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    public void SetSalary(){

        //backgroundpanel for DIsplayDataPanel
        setSalaryPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Tutor");
        centerH1.setBounds(469, 97, 248, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 45));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(centerH1);

        JLabel centerH2 = new JLabel("Set Salary");
        centerH2.setBounds(379, 164, 282, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 224, 250, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        JLabel newSalary = new JLabel("New Salary :");
        newSalary.setBounds(379, 264, 282, 30);
        newSalary.setFont(new Font("Arial", 1, 20));
        newSalary.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(newSalary);

        JLabel newPerformanceIndex = new JLabel("New Performance Index :");
        newPerformanceIndex.setBounds(379, 303, 282, 30);
        newPerformanceIndex.setFont(new Font("Arial", 1, 20));
        newPerformanceIndex.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(newPerformanceIndex);

        JTextField teacherIDField = new JTextField();
        teacherIDField.setBounds(630, 228, 282, 30);
        teacherIDField.setFont(new Font("Arial", 1, 20));
        teacherIDField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherIDField);

        JTextField newSalaryField = new JTextField();
        newSalaryField.setBounds(630, 268, 282, 30);
        newSalaryField.setFont(new Font("Arial", 1, 20));
        newSalaryField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(newSalaryField);

        JTextField newPerformanceIndexField = new JTextField();
        newPerformanceIndexField.setBounds(630, 307, 282, 30);
        newPerformanceIndexField.setFont(new Font("Arial", 1, 20));
        newPerformanceIndexField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(newPerformanceIndexField);

        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        setSalaryPanel.add(rightSidePanel);

        setSalaryPanel.setLayout(null);
        setSalaryPanel.setBounds(0, 0, 1280, 832);
        setSalaryPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    public void AssignmentGUI(){

        //backgroundpanel for DIsplayDataPanel
        assignmentPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(101, 151, 128));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Assignment");
        centerH1.setBounds(675, 222, 300, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 35));
        centerH1.setForeground(new java.awt.Color(101, 151, 128));
        rightSidePanel.add(centerH1);

        gradeAssignment = new JButton("<html><h1 text-align:center;>Grade<br>Assignment</h1><html>");
        gradeAssignment.setBounds(512, 335, 222, 118);
        gradeAssignment.setFont(new java.awt.Font("Arial", 1, 20));
        gradeAssignment.setForeground(new java.awt.Color(105,105,105));
        gradeAssignment.setBackground(new java.awt.Color(164, 196, 181));
        gradeAssignment.addActionListener(this);
        rightSidePanel.add(gradeAssignment);

        JButton displayGradedScore = new JButton("<html><h1 text-align:center;>Display<br>Graded Score</h1><html>");
        displayGradedScore.setBounds(788, 335, 222, 118);
        displayGradedScore.setFont(new java.awt.Font("Arial", 1, 20));
        displayGradedScore.setForeground(new java.awt.Color(105,105,105));
        displayGradedScore.setBackground(new java.awt.Color(164, 196, 181));
        rightSidePanel.add(displayGradedScore);

        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);
        
        //panel settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        assignmentPanel.add(rightSidePanel);

        assignmentPanel.setLayout(null);
        assignmentPanel.setBounds(0, 0, 1280, 832);
        assignmentPanel.setBackground(new java.awt.Color(255, 255, 255));

    }

    public void DisplayGradedAssignments(){

        //backgroundpanel for DIsplayDataPanel
        DisplayGradedAssignmentsPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Assignments");
        centerH1.setBounds(469, 97, 248, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 45));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(centerH1);

        JLabel centerH2 = new JLabel("Display Graded Score");
        centerH2.setBounds(379, 164, 282, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 224, 250, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        JTextField teacherIDField = new JTextField();
        teacherIDField.setBounds(630, 228, 282, 30);
        teacherIDField.setFont(new Font("Arial", 1, 20));
        teacherIDField.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherIDField);

        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);

        //panel settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        DisplayGradedAssignmentsPanel.add(rightSidePanel);

        DisplayGradedAssignmentsPanel.setLayout(null);
        DisplayGradedAssignmentsPanel.setBounds(0, 0, 1280, 832);
        DisplayGradedAssignmentsPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    public void ProfileGUI() {
        //backgroundpanel for DIsplayDataPanel
        profileGUIPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Profile");
        centerH1.setBounds(469, 97, 248, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 30));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(centerH1);

        // Loadong and displaying image with expection handeling by using try Catch
        
        JLabel userID = new JLabel("User ID :");
        userID.setBounds(470, 389, 70, 30);
        userID.setFont(new java.awt.Font("Arial", 1, 15));
        userID.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(userID);

        JLabel userName = new JLabel("User Name :");
        userName.setBounds(470, 429, 100, 30);
        userName.setFont(new java.awt.Font("Arial", 1,15));
        userName.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(userName);

        JLabel staffID = new JLabel("Staff ID :");
        staffID.setBounds(470, 469, 70, 30);
        staffID.setFont(new java.awt.Font("Arial", 1, 15));
        staffID.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(staffID);

        JLabel staffEmail = new JLabel("Staff Email :");
        staffEmail.setBounds(470, 509, 100, 30);
        staffEmail.setFont(new java.awt.Font("Arial", 1, 15));
        staffEmail.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(staffEmail);

        JLabel staffPhone = new JLabel("Staff Phone :");
        staffPhone.setBounds(470, 549, 100, 30);
        staffPhone.setFont(new java.awt.Font("Arial", 1, 15));
        staffPhone.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(staffPhone);

        JLabel university = new JLabel("University :");
        university.setBounds(470, 589, 100, 30);
        university.setFont(new java.awt.Font("Arial", 1, 15));
        university.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(university);

        JLabel college = new JLabel("College :");
        college.setBounds(470, 629, 100, 30);
        college.setFont(new java.awt.Font("Arial", 1, 15));
        college.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(college);

        JLabel collegeAddress = new JLabel("College Address :");
        collegeAddress.setBounds(470, 669, 150, 30);
        collegeAddress.setFont(new java.awt.Font("Arial", 1, 15));
        collegeAddress.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(collegeAddress);

        //<-----------------------------------------------to be tested---------------------------------------------------------------------------------->
        System.out.println(user);
        if (user == 100) {

            System.out.println("worked");
            JLabel userIDValue = new JLabel("User ID :");
            userIDValue.setBounds(635, 389, 70, 30);
            userIDValue.setFont(new java.awt.Font("Arial", 1, 15));
            userIDValue.setForeground(new java.awt.Color(105, 105, 105));
            rightSidePanel.add(userIDValue);

            JLabel userNameValue = new JLabel("User Name :");
            userNameValue.setBounds(635, 429, 100, 30);
            userNameValue.setFont(new java.awt.Font("Arial", 1,15));
            userNameValue.setForeground(new java.awt.Color(105, 105, 105));
            rightSidePanel.add(userNameValue);

            JLabel staffIDValue = new JLabel("Staff ID :");
            staffIDValue.setBounds(635, 469, 70, 30);
            staffIDValue.setFont(new java.awt.Font("Arial", 1, 15));
            staffIDValue.setForeground(new java.awt.Color(105, 105, 105));
            rightSidePanel.add(staffIDValue);

            JLabel staffEmailValue = new JLabel("Staff Email :");
            staffEmailValue.setBounds(635, 509, 100, 30);
            staffEmailValue.setFont(new java.awt.Font("Arial", 1, 15));
            staffEmailValue.setForeground(new java.awt.Color(105, 105, 105));
            rightSidePanel.add(staffEmailValue);

            JLabel staffPhoneValue = new JLabel("Staff Phone :");
            staffPhoneValue.setBounds(635, 549, 100, 30);
            staffPhoneValue.setFont(new java.awt.Font("Arial", 1, 15));
            staffPhoneValue.setForeground(new java.awt.Color(105, 105, 105));
            rightSidePanel.add(staffPhoneValue);

            JLabel universityValue = new JLabel("University :");
            university.setBounds(635, 589, 100, 30);
            university.setFont(new java.awt.Font("Arial", 1, 15));
            university.setForeground(new java.awt.Color(105, 105, 105));
            rightSidePanel.add(universityValue);

            JLabel collegeValue = new JLabel("College :");
            collegeValue.setBounds(635, 629, 100, 30);
            collegeValue.setFont(new java.awt.Font("Arial", 1, 15));
            collegeValue.setForeground(new java.awt.Color(105, 105, 105));
            rightSidePanel.add(collegeValue);

            JLabel collegeAddressValue = new JLabel("College Address :");
            collegeAddressValue.setBounds(635, 669, 150, 30);
            collegeAddressValue.setFont(new java.awt.Font("Arial", 1, 15));
            collegeAddressValue.setForeground(new java.awt.Color(105, 105, 105));
            rightSidePanel.add(collegeAddressValue);
        }

        try {
            BufferedImage profileimage = ImageIO.read(new File("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\profilepic.png"));
            ImageIcon imageIcon = new ImageIcon(profileimage);
            JLabel imageLabel = new JLabel(imageIcon);
            // Adjust position and size of image label
            imageLabel.setBounds(470, 157, imageIcon.getIconWidth(), imageIcon.getIconHeight());
            rightSidePanel.add(imageLabel);
            // Repaint the panel to reflect the changes
            rightSidePanel.repaint();
        } catch (IOException ex) {
            // if failed to load image display label as image failed to load 
            JLabel imageText = new JLabel("Image Failed to Load");
            imageText.setBounds(470, 157, 100, 100);
            rightSidePanel.add(imageText);
        }
        
        // Load image from file
        ImageIcon icon = new ImageIcon("C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png"); // Replace with the path to your image file
        
        // Resize the image
        int width = 50; // Desired width of the image
        int height = 50; // Desired height of the image
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        JButton assignmentBackButton = new JButton(scaledIcon);
        assignmentBackButton.setBounds(378, 91, width, height); // Adjust position and size of the button
        // Make the button transparent
        assignmentBackButton.setOpaque(false);
        assignmentBackButton.setContentAreaFilled(false);
        assignmentBackButton.setBorderPainted(false);
        rightSidePanel.add(assignmentBackButton);

        //panel settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        profileGUIPanel.add(rightSidePanel);

        profileGUIPanel.setLayout(null);
        profileGUIPanel.setBounds(0, 0, 1280, 832);
        profileGUIPanel.setBackground(new java.awt.Color(255, 255, 255));
        
    }

    // Adding action 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == startLoginButton) {
            // Remove the current pannel and add new panel
            mainPanel.remove(startBackground);
            mainPanel.add(loginPageBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }

        if (e.getSource() == mainLoginButton) {
            try {
            int userID = Integer.parseInt(userIDField.getText());
            String password = passwordField.getText();
            
            if ((userID == 100 && password.equals("admin1"))) {
                    user = 100;  
                    System.out.println(user);
                // Clear text fields
                userIDField.setText("");
                passwordField.setText("");
                
                // Remove the current panel and add the new panels
                mainPanel.remove(loginPageBackground);
                mainPanel.add(leftSideMenuPanel);
                mainPanel.add(dashBoardBackground);
                mainPanel.revalidate();
                mainPanel.repaint();
            }else if ((userID == 101 && password.equals("admin2"))) {
                user = 101;  
                // Clear text fields
                userIDField.setText("");
                passwordField.setText("");
                
                // Remove the current panel and add the new panels
                mainPanel.remove(loginPageBackground);
                mainPanel.add(leftSideMenuPanel);
                mainPanel.add(dashBoardBackground);
                mainPanel.revalidate();
                mainPanel.repaint();
            }else if ((userID == 102 && password.equals("admin3"))) {
                user = 102;  
                // Clear text fields
                userIDField.setText("");
                passwordField.setText("");
                
                // Remove the current panel and add the new panels
                mainPanel.remove(loginPageBackground);
                mainPanel.add(leftSideMenuPanel);
                mainPanel.add(dashBoardBackground);
                mainPanel.revalidate();
                mainPanel.repaint();
            }else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid user ID (numeric value)");
            }
        }
        
        if (e.getSource() == displayData) {
            // Remove the current pannel and add new panel
            mainPanel.remove(dashBoardBackground);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayDataPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayGradedAssignments) {
            // Remove the current pannel and add new panel
            mainPanel.remove(displayDataPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(DisplayGradedAssignmentsPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == lecturer) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(dashBoardBackground);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(lecturerPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == addLecturer) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(lecturerPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(addlecturerPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == tutor) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(dashBoardBackground);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(tutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        
        if (e.getSource() == addTutor) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(tutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(addTutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == setSalaryOfTutor) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(tutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(setSalaryPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == removeTutor) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(tutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(removeTutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayTutorSalary) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(tutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayTutorSalaryPanel); 
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayTutorSalaryDisplayMethod) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(displayDataPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayTutorSalaryPanel); 
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == assignment) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(dashBoardBackground);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(assignmentPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == profile) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(dashBoardBackground);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(profileGUIPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
            
        }
        if (e.getSource() == menuHome) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(lecturerPanel);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(tutorPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(assignmentPanel);
            mainPanel.remove(profileGUIPanel);
            mainPanel.remove(DisplayGradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(dashBoardBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuLecturer) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(dashBoardBackground);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(tutorPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(assignmentPanel);
            mainPanel.remove(profileGUIPanel);
            mainPanel.remove(DisplayGradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(lecturerPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuTutor) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(dashBoardBackground);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(lecturerPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(assignmentPanel);
            mainPanel.remove(profileGUIPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(DisplayGradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(tutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuAssignments) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(dashBoardBackground);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(lecturerPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(tutorPanel);
            mainPanel.remove(profileGUIPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(DisplayGradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(assignmentPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuProfile) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(dashBoardBackground);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(lecturerPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(tutorPanel);
            mainPanel.remove(assignmentPanel);
            mainPanel.remove(DisplayGradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(profileGUIPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuLogOut) {
            // Remove the current pannel and add new panel    
            mainPanel.remove(dashBoardBackground);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(lecturerPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(tutorPanel);
            mainPanel.remove(assignmentPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(DisplayGradedAssignmentsPanel);
            mainPanel.remove(leftSideMenuPanel);
            mainPanel.remove(profileGUIPanel);
            mainPanel.add(loginPageBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
    }

    // Main Method
    public static void main(String[] args) {
        new TeacherGUI();
    }
}
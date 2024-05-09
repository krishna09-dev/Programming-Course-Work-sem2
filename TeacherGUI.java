// Purpose: This file contains the GUI for the Teacher Management System

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
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
import java.util.ArrayList;


public class TeacherGUI implements ActionListener{

    private JFrame frame;

    private JButton startLoginButton,mainLoginButton,displayData,lecturer,addLecturer,tutor,addTutor,profile,gradeAssignmentOfAssignmentGUI,
    menuHome,menuLecturer,menuTutor,menuAssignments,menuProfile,menuLogOut,assignment,setSalaryOfTutor,removeTutor,displayTutorDataOfTutorGUI,
    displayTutorSalaryOfDisplayGUI,displayTutorSalaryOfTutorGUI,displayGradedAssignmentsOfDisplayGUI,displayTutorDataOfDisplayGUI,displayLecturerDataOfLecturerGUI,
    displayLecturerDataOfDisplayGUI,displayGradedScoreOfAssignmentGUI,addLecturerButton,displayLecturerButton,clearButtonOfAddTutorOfAddTutor,addTutorButtonOfAddTutor,
    removeTutorButtonOfRemoveTutor,clearButtonOfRemoveTutor,displayTutorSalaryButton,clearButtonOfDisplayTutorSalary,displayTutorDataButton,clearButtonOfDisplayTutorData,
    setTutorSalaryButtonOfSetSalary,clearButtonOfSetTutorSalary,displayGradeAssignmentButton,gradeAssignmentButton,clearButtonOfGradeAssignment,
    clearButtonOfDisplayGradeAssignment,clearButtonOfDisplayLecturer,displayDataBackButton,lecturerGUIBackButton,addLecturerBackButton,displayLecturerDataBackButton,
    tutorGUIBackButton,addTutorBackButton,removeTutorBackButton,displayTutorSalaryBackButton,displayTutorDataBackButton,setSalaryBackButton,assignmentGUIBackButton,
    gradeAssignmentBackButton,displayGradedAssignmentsBackButton,profileGUIBackButton,clearButtonOfAddLecturer,showLoginPageBackButton;
    
    private JPanel mainPanel,startBackground,loginPageBackground,dashBoardBackground,displayDataPanel,addlecturerPanel,lecturerPanel,leftSideMenuPanel,tutorPanel
    ,addTutorPanel,removeTutorPanel,displayTutorSalaryPanel,setSalaryPanel,assignmentPanel,displayGradedAssignmentsPanel,profileGUIPanel,displayTutorDataPanel,
    displayLecturerDataPanel,gradedAssignmentsPanel;
    
    private JTextField userIDField,passwordField,teacherIDFieldOfAddLecturer,teacherNameFieldOfAddLecturer,addressFieldOfAddLecturer,workingTypeFieldOfAddLecturer,employmentStatusFieldOfAddLecturer,
    workingHoursFieldOfAddLecturer,yearsOfExperienceFieldOfAddLecturer,departmentFieldOfAddLecturer,teacherIDFieldDisplayLecturerData,addressFieldOfAddTutor,
    teacherNameFieldOfAddTutor,teacherIDFieldOfAddTutor,workingTypeFieldOfAddTutor,employmentStatusFieldOfAddTutor,workingHoursFieldOfAddTutor,salaryFieldOfAddTutor,
    specializationFieldOfAddTutor,performanceIndexFieldOfAddTutor,academicQualificationsFieldOfAddTutor,teacherIDFieldOfRemoveTutor,teacherIDFieldOfDisplayTutorSalary,
    teacherIDFieldDisplayTutorData,teacherIDFieldOfSetSalary,newSalaryFieldOfSetSalary,newPerformanceIndexFieldOfSetSalary,teacherIDFieldOfDisplayGradedAssignment,
    teacherIDFieldOfGradeAssignment,gradedScoreFieldOfGradeAssignment,departmentFieldOfGradeAssignment,yearsOfExperienceFieldOfGradeAssignment;
    
    private ArrayList<Teacher> teachersList;

    private String imagePathOfMainImage = "C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\startingpage.png";
    private String imagePathOfProfileImage = "C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\newprofile.png";
    private String imagePathOfBackButton = "C:\\Users\\offic\\OneDrive\\Documents\\GitHub\\Programming-Course-Work-sem2\\images\\backicon.png";
    private int thickness = 2;

    //Constructor
    public TeacherGUI() {

        //Creating Frame and settinf its title
        frame = new JFrame();
        frame.setTitle("Teacher Management System");
        frame.setResizable(false);

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
        startLoginButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness)); // Set the border
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
            BufferedImage image = ImageIO.read(new File(imagePathOfMainImage));
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
        DisplayLecturerData();
        TutorGUI();
        AddTutorGUI();
        RemoveTutorGUI();
        DisplayTutorSalaryGUI();
        DisplayTutorDataGUI();
        SetSalaryGUI();
        AssignmentGUI();
        GradedAssignments();
        DisplayGradedAssignments();
        ProfileGUI();

        teachersList = new ArrayList<>();
    }

    //Login page GUI in user-defined Method
    private void showLoginPage(){
        
        //BackgroundPannel for Login page
        loginPageBackground = new JPanel();

        // adding components and setting up there size,color,positions etc 
        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(101, 151, 128));
        loginPageBackground.add(rightSideH1);

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
        userIDField.setFont(new Font("Arial", 1, 20));
        userIDField.setForeground(new Color(105, 105, 105));
        userIDField.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        loginPageBackground.add(userIDField);

        JLabel password = new JLabel("Password");
        password.setBounds(412, 395, 213, 42);
        password.setFont(new java.awt.Font("Arial", 1, 23));
        password.setForeground(new java.awt.Color(105, 105, 105));
        loginPageBackground.add(password);

        passwordField = new JTextField();
        passwordField.setBounds(530, 395, 250, 40);
        passwordField.setFont(new Font("Arial", 1, 20));
        passwordField.setForeground(new Color(105, 105, 105));
        passwordField.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        loginPageBackground.add(passwordField);

        mainLoginButton = new JButton("Log in");
        mainLoginButton.setBounds(520, 477, 205, 63);
        mainLoginButton.setFont(new Font("Arial", 1, 20));
        mainLoginButton.setForeground(new Color(255, 255, 255));
        mainLoginButton.setBackground(new Color(105, 105, 105));
        mainLoginButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness)); // Set the border
        mainLoginButton.addActionListener(this);
        loginPageBackground.add(mainLoginButton);

        JLabel centerSideH3 = new JLabel("Note : Only for authorities staff ");
        centerSideH3.setBounds(510, 566, 294, 26);
        centerSideH3.setFont(new java.awt.Font("Arial", 1, 15));
        centerSideH3.setForeground(new java.awt.Color(101, 151, 128));
        loginPageBackground.add(centerSideH3);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);
        int width = 50;
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        showLoginPageBackButton = new JButton(scaledIcon);
        showLoginPageBackButton.setBounds(51, 70, width, height);
        // Make the button transparent
        showLoginPageBackButton.setOpaque(false);
        showLoginPageBackButton.setContentAreaFilled(false);
        showLoginPageBackButton.setBorderPainted(false);
        showLoginPageBackButton.addActionListener(this);
        loginPageBackground.add(showLoginPageBackButton);

        //Panel Setting
        loginPageBackground.setBounds(0, 0, 1280, 832);
        loginPageBackground.setBackground(new java.awt.Color(164, 196, 181));
        loginPageBackground.setLayout(null);

    }

    //Side Menu GUI User-defined Method 
    private void sideMenu(){

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

        int newWidth = 25;
        int newHeight = 25; 
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
    private void showDashBoard(){
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

        JLabel rightSideH2 = new JLabel("Welcome Admin");
        rightSideH2.setBounds(576, 118, 469, 58);
        rightSideH2.setFont(new java.awt.Font("Arial", 1, 35));
        rightSideH2.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH2);

        displayData = new JButton("<html> <center> Display <br> Data </center></html>");
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
    private void displayData(){

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

        displayLecturerDataOfDisplayGUI = new JButton("<html><center>Display <br> Lecturer Data</center></html>");
        displayLecturerDataOfDisplayGUI.setBounds(379, 224, 222, 118);
        displayLecturerDataOfDisplayGUI.setFont(new java.awt.Font("Arial", 1, 20));
        displayLecturerDataOfDisplayGUI.setForeground(new java.awt.Color(105,105,105));
        displayLecturerDataOfDisplayGUI.setBackground(new java.awt.Color(164, 196, 181));
        displayLecturerDataOfDisplayGUI.addActionListener(this);
        rightSidePanel.add(displayLecturerDataOfDisplayGUI);

        displayTutorDataOfDisplayGUI = new JButton("<html><center>Display <br> Tutor Data</center></html>");
        displayTutorDataOfDisplayGUI.setBounds(659, 224, 222, 118);
        displayTutorDataOfDisplayGUI.setFont(new java.awt.Font("Arial", 1, 20));
        displayTutorDataOfDisplayGUI.setForeground(new java.awt.Color(105,105,105));
        displayTutorDataOfDisplayGUI.setBackground(new java.awt.Color(164, 196, 181));
        displayTutorDataOfDisplayGUI.addActionListener(this);
        rightSidePanel.add(displayTutorDataOfDisplayGUI);

        displayGradedAssignmentsOfDisplayGUI = new JButton("<html><center>Display Graded <br> Assignments</center></html>");
        displayGradedAssignmentsOfDisplayGUI.setBounds(939, 224, 222, 118);
        displayGradedAssignmentsOfDisplayGUI.setFont(new java.awt.Font("Arial", 1, 20));
        displayGradedAssignmentsOfDisplayGUI.setForeground(new java.awt.Color(105,105,105));
        displayGradedAssignmentsOfDisplayGUI.setBackground(new java.awt.Color(164, 196, 181));
        displayGradedAssignmentsOfDisplayGUI.addActionListener(this);
        rightSidePanel.add(displayGradedAssignmentsOfDisplayGUI);

        displayTutorSalaryOfDisplayGUI = new JButton("<html><center>Display Tutor <br> Salary</center></html>");
        displayTutorSalaryOfDisplayGUI.setBounds(379, 390, 222, 118);
        displayTutorSalaryOfDisplayGUI.setFont(new java.awt.Font("Arial", 1, 20));
        displayTutorSalaryOfDisplayGUI.setForeground(new java.awt.Color(105,105,105));
        displayTutorSalaryOfDisplayGUI.setBackground(new java.awt.Color(164, 196, 181));
        displayTutorSalaryOfDisplayGUI.addActionListener(this);
        rightSidePanel.add(displayTutorSalaryOfDisplayGUI);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);
        int width = 50;
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        displayDataBackButton = new JButton(scaledIcon);
        displayDataBackButton.setBounds(378, 91, width, height);
        // Make the button transparent
        displayDataBackButton.setOpaque(false);
        displayDataBackButton.setContentAreaFilled(false);
        displayDataBackButton.setBorderPainted(false);
        displayDataBackButton.addActionListener(this);
        rightSidePanel.add(displayDataBackButton);

        //Panel Settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        displayDataPanel.add(rightSidePanel);

        displayDataPanel.setLayout(null);
        displayDataPanel.setBounds(0, 0, 1280, 832);
        displayDataPanel.setBackground(new java.awt.Color(255, 255, 255));

    }

    private void LecturerGUI(){

        //backgroundpanel for DIsplayDataPanel
        lecturerPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
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

        addLecturer = new JButton("<html><center>Add<br>Lecturer</center><html>");
        addLecturer.setBounds(512, 335, 222, 118);
        addLecturer.setFont(new java.awt.Font("Arial", 1, 20));
        addLecturer.setForeground(new java.awt.Color(105,105,105));
        addLecturer.setBackground(new java.awt.Color(164, 196, 181));
        addLecturer.addActionListener(this);
        rightSidePanel.add(addLecturer);

        displayLecturerDataOfLecturerGUI = new JButton("<html><center>Display<br>Lecturer Data</center><html>");
        displayLecturerDataOfLecturerGUI.setBounds(788, 335, 222, 118);
        displayLecturerDataOfLecturerGUI.setFont(new java.awt.Font("Arial", 1, 20));
        displayLecturerDataOfLecturerGUI.setForeground(new java.awt.Color(105,105,105));
        displayLecturerDataOfLecturerGUI.setBackground(new java.awt.Color(164, 196, 181));
        displayLecturerDataOfLecturerGUI.addActionListener(this);
        rightSidePanel.add(displayLecturerDataOfLecturerGUI);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);
        int width = 50;
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        lecturerGUIBackButton = new JButton(scaledIcon);
        lecturerGUIBackButton.setBounds(378, 91, width, height); 
        // Make the button transparent
        lecturerGUIBackButton.setOpaque(false);
        lecturerGUIBackButton.setContentAreaFilled(false);
        lecturerGUIBackButton.setBorderPainted(false);
        lecturerGUIBackButton.addActionListener(this);
        rightSidePanel.add(lecturerGUIBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        lecturerPanel.add(rightSidePanel);

        lecturerPanel.setLayout(null);
        lecturerPanel.setBounds(0, 0, 1280, 832);
        lecturerPanel.setBackground(new java.awt.Color(255, 255, 255));

    }

    private void AddLecturer(){

        //backgroundpanel for DIsplayDataPanel
        addlecturerPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
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

        JLabel department = new JLabel("Department :");
        department.setBounds(379, 463, 282, 30);
        department.setFont(new Font("Arial", 1, 20));
        department.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(department);

        JLabel yearsOfExperience = new JLabel("Years Of Experience :");
        yearsOfExperience.setBounds(379, 503, 282, 30);
        yearsOfExperience.setFont(new Font("Arial", 1, 20));
        yearsOfExperience.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(yearsOfExperience);
        
        teacherIDFieldOfAddLecturer = new JTextField();
        teacherIDFieldOfAddLecturer.setBounds(593, 228, 282, 30);
        teacherIDFieldOfAddLecturer.setFont(new Font("Arial", 1, 20));
        teacherIDFieldOfAddLecturer.setForeground(new Color(105, 105, 105));
        teacherIDFieldOfAddLecturer.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherIDFieldOfAddLecturer);

        teacherNameFieldOfAddLecturer = new JTextField();
        teacherNameFieldOfAddLecturer.setBounds(593, 268, 282, 30);
        teacherNameFieldOfAddLecturer.setFont(new Font("Arial", 1, 20));
        teacherNameFieldOfAddLecturer.setForeground(new Color(105, 105, 105));
        teacherNameFieldOfAddLecturer.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherNameFieldOfAddLecturer);

        addressFieldOfAddLecturer = new JTextField();
        addressFieldOfAddLecturer.setBounds(593, 307, 282, 30);
        addressFieldOfAddLecturer.setFont(new Font("Arial", 1, 20));
        addressFieldOfAddLecturer.setForeground(new Color(105, 105, 105));
        addressFieldOfAddLecturer.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(addressFieldOfAddLecturer);

        workingTypeFieldOfAddLecturer = new JTextField();
        workingTypeFieldOfAddLecturer.setBounds(593, 347, 282, 30);
        workingTypeFieldOfAddLecturer.setFont(new Font("Arial", 1, 20));
        workingTypeFieldOfAddLecturer.setForeground(new Color(105, 105, 105));
        workingTypeFieldOfAddLecturer.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(workingTypeFieldOfAddLecturer);

        employmentStatusFieldOfAddLecturer = new JTextField();
        employmentStatusFieldOfAddLecturer.setBounds(593, 388, 282, 30);
        employmentStatusFieldOfAddLecturer.setFont(new Font("Arial", 1, 20));
        employmentStatusFieldOfAddLecturer.setForeground(new Color(105, 105, 105));
        employmentStatusFieldOfAddLecturer.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(employmentStatusFieldOfAddLecturer);

        workingHoursFieldOfAddLecturer = new JTextField();
        workingHoursFieldOfAddLecturer.setBounds(593, 427, 282, 30);
        workingHoursFieldOfAddLecturer.setFont(new Font("Arial", 1, 20));
        workingHoursFieldOfAddLecturer.setForeground(new Color(105, 105, 105));
        workingHoursFieldOfAddLecturer.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(workingHoursFieldOfAddLecturer);

        departmentFieldOfAddLecturer = new JTextField();
        departmentFieldOfAddLecturer.setBounds(593, 467, 282, 30);
        departmentFieldOfAddLecturer.setFont(new Font("Arial", 1, 20));
        departmentFieldOfAddLecturer.setForeground(new Color(105, 105, 105));
        departmentFieldOfAddLecturer.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(departmentFieldOfAddLecturer);

        yearsOfExperienceFieldOfAddLecturer = new JTextField();
        yearsOfExperienceFieldOfAddLecturer.setBounds(593, 507, 282, 30);
        yearsOfExperienceFieldOfAddLecturer.setFont(new Font("Arial", 1, 20));
        yearsOfExperienceFieldOfAddLecturer.setForeground(new Color(105, 105, 105));
        yearsOfExperienceFieldOfAddLecturer.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(yearsOfExperienceFieldOfAddLecturer);


        addLecturerButton = new JButton("Add");
        addLecturerButton.setBounds(794, 545, 92, 30);
        addLecturerButton.setFont(new Font("Arial", 1, 15));
        addLecturerButton.setForeground(new Color(255,255,255));
        addLecturerButton.setBackground(new Color(105, 105, 105));
        addLecturerButton.addActionListener(this);
        rightSidePanel.add(addLecturerButton);

        clearButtonOfAddLecturer = new JButton("Clear");
        clearButtonOfAddLecturer.setBounds(378, 545, 92, 30);
        clearButtonOfAddLecturer.setFont(new Font("Arial", 1, 15));
        clearButtonOfAddLecturer.setForeground(new Color(255,255,255));
        clearButtonOfAddLecturer.setBackground(new Color(105, 105, 105));
        clearButtonOfAddLecturer.addActionListener(this);
        rightSidePanel.add(clearButtonOfAddLecturer);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);
        int width = 50;
        int height = 50;
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Create JButton with just the image
        addLecturerBackButton = new JButton(scaledIcon);
        addLecturerBackButton.setBounds(378, 91, width, height); 
        // Make the button transparent
        addLecturerBackButton.setOpaque(false);
        addLecturerBackButton.setContentAreaFilled(false);
        addLecturerBackButton.setBorderPainted(false);
        addLecturerBackButton.addActionListener(this);
        rightSidePanel.add(addLecturerBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        addlecturerPanel.add(rightSidePanel);

        addlecturerPanel.setLayout(null);
        addlecturerPanel.setBounds(0, 0, 1280, 832);
        addlecturerPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    private void DisplayLecturerData(){

        //backgroundpanel for DIsplayDataPanel
        displayLecturerDataPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
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

        JLabel centerH2 = new JLabel("Display Lecturer Data");
        centerH2.setBounds(379, 176, 401, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 236, 200, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        teacherIDFieldDisplayLecturerData = new JTextField();
        teacherIDFieldDisplayLecturerData.setBounds(526, 240, 282, 30);
        teacherIDFieldDisplayLecturerData.setFont(new Font("Arial", 1, 20));
        teacherIDFieldDisplayLecturerData.setForeground(new Color(105, 105, 105));
        teacherIDFieldDisplayLecturerData.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherIDFieldDisplayLecturerData);

        displayLecturerButton = new JButton("Display");
        displayLecturerButton.setBounds(726, 283, 92, 30);
        displayLecturerButton.setFont(new Font("Arial", 1, 15));
        displayLecturerButton.setForeground(new Color(255,255,255));
        displayLecturerButton.setBackground(new Color(105, 105, 105));
        displayLecturerButton.addActionListener(this);
        rightSidePanel.add(displayLecturerButton);

        clearButtonOfDisplayLecturer = new JButton("Clear");
        clearButtonOfDisplayLecturer.setBounds(378, 283, 92, 30);
        clearButtonOfDisplayLecturer.setFont(new Font("Arial", 1, 15));
        clearButtonOfDisplayLecturer.setForeground(new Color(255,255,255));
        clearButtonOfDisplayLecturer.setBackground(new Color(105, 105, 105));
        clearButtonOfDisplayLecturer.addActionListener(this);
        rightSidePanel.add(clearButtonOfDisplayLecturer);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);    
        int width = 50; 
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        displayLecturerDataBackButton = new JButton(scaledIcon);
        displayLecturerDataBackButton.setBounds(378, 91, width, height);
        // Make the button transparent
        displayLecturerDataBackButton.setOpaque(false);
        displayLecturerDataBackButton.setContentAreaFilled(false);
        displayLecturerDataBackButton.setBorderPainted(false);
        displayLecturerDataBackButton.addActionListener(this);
        rightSidePanel.add(displayLecturerDataBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        displayLecturerDataPanel.add(rightSidePanel);

        displayLecturerDataPanel.setLayout(null);
        displayLecturerDataPanel.setBounds(0, 0, 1280, 832);
        displayLecturerDataPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    private void TutorGUI(){

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

        setSalaryOfTutor = new JButton("<html><center>Set Salary of<br>Tutor</center></html>");
        setSalaryOfTutor.setBounds(659, 224, 222, 118);
        setSalaryOfTutor.setFont(new java.awt.Font("Arial", 1, 20));
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

        displayTutorDataOfTutorGUI = new JButton("<html><center>Display Tutor<br>Data</center></html>");
        displayTutorDataOfTutorGUI.setBounds(379, 390, 222, 118);
        displayTutorDataOfTutorGUI.setFont(new java.awt.Font("Arial", 1, 20));
        displayTutorDataOfTutorGUI.setForeground(new java.awt.Color(105,105,105));
        displayTutorDataOfTutorGUI.setBackground(new java.awt.Color(164, 196, 181));
        displayTutorDataOfTutorGUI.addActionListener(this);
        rightSidePanel.add(displayTutorDataOfTutorGUI);

        displayTutorSalaryOfTutorGUI = new JButton("<html><center>Display Tutor <br> Salary</center></html>");
        displayTutorSalaryOfTutorGUI.setBounds(659, 390, 222, 118);
        displayTutorSalaryOfTutorGUI.setFont(new java.awt.Font("Arial", 1, 20));
        displayTutorSalaryOfTutorGUI.setForeground(new java.awt.Color(105,105,105));
        displayTutorSalaryOfTutorGUI.setBackground(new java.awt.Color(164, 196, 181));
        displayTutorSalaryOfTutorGUI.addActionListener(this);
        rightSidePanel.add(displayTutorSalaryOfTutorGUI);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);        
        int width = 50; 
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        tutorGUIBackButton = new JButton(scaledIcon);
        tutorGUIBackButton.setBounds(378, 91, width, height);
        // Make the button transparent
        tutorGUIBackButton.setOpaque(false);
        tutorGUIBackButton.setContentAreaFilled(false);
        tutorGUIBackButton.setBorderPainted(false);
        tutorGUIBackButton.addActionListener(this);
        rightSidePanel.add(tutorGUIBackButton);

        //Panel Settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        tutorPanel.add(rightSidePanel);

        tutorPanel.setLayout(null);
        tutorPanel.setBounds(0, 0, 1280, 832);
        tutorPanel.setBackground(new java.awt.Color(255, 255, 255));

    }

    private void AddTutorGUI(){

        //backgroundpanel for DIsplayDataPanel
        addTutorPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
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

        JLabel specialization = new JLabel("specialization :");
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
        
        teacherIDFieldOfAddTutor = new JTextField();
        teacherIDFieldOfAddTutor.setBounds(630, 228, 282, 30);
        teacherIDFieldOfAddTutor.setFont(new Font("Arial", 1, 20));
        teacherIDFieldOfAddTutor.setForeground(new Color(105, 105, 105));
        teacherIDFieldOfAddTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherIDFieldOfAddTutor);

        teacherNameFieldOfAddTutor = new JTextField();
        teacherNameFieldOfAddTutor.setBounds(630, 268, 282, 30);
        teacherNameFieldOfAddTutor.setFont(new Font("Arial", 1, 20));
        teacherNameFieldOfAddTutor.setForeground(new Color(105, 105, 105));
        teacherNameFieldOfAddTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherNameFieldOfAddTutor);

        addressFieldOfAddTutor = new JTextField();
        addressFieldOfAddTutor.setBounds(630, 307, 282, 30);
        addressFieldOfAddTutor.setFont(new Font("Arial", 1, 20));
        addressFieldOfAddTutor.setForeground(new Color(105, 105, 105));
        addressFieldOfAddTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(addressFieldOfAddTutor);

        workingTypeFieldOfAddTutor = new JTextField();
        workingTypeFieldOfAddTutor.setBounds(630, 347, 282, 30);
        workingTypeFieldOfAddTutor.setFont(new Font("Arial", 1, 20));
        workingTypeFieldOfAddTutor.setForeground(new Color(105, 105, 105));
        workingTypeFieldOfAddTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(workingTypeFieldOfAddTutor);

        employmentStatusFieldOfAddTutor = new JTextField();
        employmentStatusFieldOfAddTutor.setBounds(630, 388, 282, 30);
        employmentStatusFieldOfAddTutor.setFont(new Font("Arial", 1, 20));
        employmentStatusFieldOfAddTutor.setForeground(new Color(105, 105, 105));
        employmentStatusFieldOfAddTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(employmentStatusFieldOfAddTutor);

        workingHoursFieldOfAddTutor = new JTextField();
        workingHoursFieldOfAddTutor.setBounds(630, 427, 282, 30);
        workingHoursFieldOfAddTutor.setFont(new Font("Arial", 1, 20));
        workingHoursFieldOfAddTutor.setForeground(new Color(105, 105, 105));
        workingHoursFieldOfAddTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(workingHoursFieldOfAddTutor);

        salaryFieldOfAddTutor = new JTextField();
        salaryFieldOfAddTutor.setBounds(630, 467, 282, 30);
        salaryFieldOfAddTutor.setFont(new Font("Arial", 1, 20));
        salaryFieldOfAddTutor.setForeground(new Color(105, 105, 105));
        salaryFieldOfAddTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(salaryFieldOfAddTutor);

        specializationFieldOfAddTutor = new JTextField();
        specializationFieldOfAddTutor.setBounds(630, 507, 282, 30);
        specializationFieldOfAddTutor.setFont(new Font("Arial", 1, 20));
        specializationFieldOfAddTutor.setForeground(new Color(105, 105, 105));
        specializationFieldOfAddTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(specializationFieldOfAddTutor);

        academicQualificationsFieldOfAddTutor = new JTextField();
        academicQualificationsFieldOfAddTutor.setBounds(630, 547, 282, 30);
        academicQualificationsFieldOfAddTutor.setFont(new Font("Arial", 1, 20));
        academicQualificationsFieldOfAddTutor.setForeground(new Color(105, 105, 105));
        academicQualificationsFieldOfAddTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(academicQualificationsFieldOfAddTutor);

        performanceIndexFieldOfAddTutor = new JTextField();
        performanceIndexFieldOfAddTutor.setBounds(630, 587, 282, 30);
        performanceIndexFieldOfAddTutor.setFont(new Font("Arial", 1, 20));
        performanceIndexFieldOfAddTutor.setForeground(new Color(105, 105, 105));
        performanceIndexFieldOfAddTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(performanceIndexFieldOfAddTutor);

        addTutorButtonOfAddTutor = new JButton("Add");
        addTutorButtonOfAddTutor.setBounds(816, 628, 92, 30);
        addTutorButtonOfAddTutor.setFont(new Font("Arial", 1, 15));
        addTutorButtonOfAddTutor.setForeground(new Color(255,255,255));
        addTutorButtonOfAddTutor.setBackground(new Color(105, 105, 105));
        addTutorButtonOfAddTutor.addActionListener(this);
        rightSidePanel.add(addTutorButtonOfAddTutor);

        clearButtonOfAddTutorOfAddTutor = new JButton("Clear");
        clearButtonOfAddTutorOfAddTutor.setBounds(378, 628, 92, 30);
        clearButtonOfAddTutorOfAddTutor.setFont(new Font("Arial", 1, 15));
        clearButtonOfAddTutorOfAddTutor.setForeground(new Color(255,255,255));
        clearButtonOfAddTutorOfAddTutor.setBackground(new Color(105, 105, 105));
        clearButtonOfAddTutorOfAddTutor.addActionListener(this);
        rightSidePanel.add(clearButtonOfAddTutorOfAddTutor);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);
        int width = 50;
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        addTutorBackButton = new JButton(scaledIcon);
        addTutorBackButton.setBounds(378, 91, width, height);
        // Make the button transparent
        addTutorBackButton.setOpaque(false);
        addTutorBackButton.setContentAreaFilled(false);
        addTutorBackButton.setBorderPainted(false);
        addTutorBackButton.addActionListener(this);
        rightSidePanel.add(addTutorBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        addTutorPanel.add(rightSidePanel);

        addTutorPanel.setLayout(null);
        addTutorPanel.setBounds(0, 0, 1280, 832);
        addTutorPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    private void RemoveTutorGUI(){

        //backgroundpanel for DIsplayDataPanel
        removeTutorPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
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

        teacherIDFieldOfRemoveTutor = new JTextField();
        teacherIDFieldOfRemoveTutor.setBounds(526, 228, 282, 30);
        teacherIDFieldOfRemoveTutor.setFont(new Font("Arial", 1, 20));
        teacherIDFieldOfRemoveTutor.setForeground(new Color(105, 105, 105));
        teacherIDFieldOfRemoveTutor.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherIDFieldOfRemoveTutor);

        removeTutorButtonOfRemoveTutor = new JButton("Remove");
        removeTutorButtonOfRemoveTutor.setBounds(726, 283, 92, 30);
        removeTutorButtonOfRemoveTutor.setFont(new Font("Arial", 1, 15));
        removeTutorButtonOfRemoveTutor.setForeground(new Color(255,255,255));
        removeTutorButtonOfRemoveTutor.setBackground(new Color(105, 105, 105));
        removeTutorButtonOfRemoveTutor.addActionListener(this);
        rightSidePanel.add(removeTutorButtonOfRemoveTutor);

        clearButtonOfRemoveTutor = new JButton("Clear");
        clearButtonOfRemoveTutor.setBounds(378, 283, 92, 30);
        clearButtonOfRemoveTutor.setFont(new Font("Arial", 1, 15));
        clearButtonOfRemoveTutor.setForeground(new Color(255,255,255));
        clearButtonOfRemoveTutor.setBackground(new Color(105, 105, 105));
        clearButtonOfRemoveTutor.addActionListener(this);
        rightSidePanel.add(clearButtonOfRemoveTutor);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);        
        int width = 50;
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        removeTutorBackButton = new JButton(scaledIcon);
        removeTutorBackButton.setBounds(378, 91, width, height);
        // Make the button transparent
        removeTutorBackButton.setOpaque(false);
        removeTutorBackButton.setContentAreaFilled(false);
        removeTutorBackButton.setBorderPainted(false);
        removeTutorBackButton.addActionListener(this);
        rightSidePanel.add(removeTutorBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        removeTutorPanel.add(rightSidePanel);

        removeTutorPanel.setLayout(null);
        removeTutorPanel.setBounds(0, 0, 1280, 832);
        removeTutorPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    private void DisplayTutorSalaryGUI(){

        //backgroundpanel for DIsplayDataPanel
        displayTutorSalaryPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
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

        JLabel centerH2 = new JLabel("Display Tutor Salary");
        centerH2.setBounds(379, 176, 282, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 224, 250, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        teacherIDFieldOfDisplayTutorSalary = new JTextField();
        teacherIDFieldOfDisplayTutorSalary.setBounds(526, 228, 282, 30);
        teacherIDFieldOfDisplayTutorSalary.setFont(new Font("Arial", 1, 20));
        teacherIDFieldOfDisplayTutorSalary.setForeground(new Color(105, 105, 105));
        teacherIDFieldOfDisplayTutorSalary.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherIDFieldOfDisplayTutorSalary);

        displayTutorSalaryButton = new JButton("Display");
        displayTutorSalaryButton.setBounds(726, 283, 92, 30);
        displayTutorSalaryButton.setFont(new Font("Arial", 1, 15));
        displayTutorSalaryButton.setForeground(new Color(255,255,255));
        displayTutorSalaryButton.setBackground(new Color(105, 105, 105));
        displayTutorSalaryButton.addActionListener(this);
        rightSidePanel.add(displayTutorSalaryButton);

        clearButtonOfDisplayTutorSalary = new JButton("Clear");
        clearButtonOfDisplayTutorSalary.setBounds(378, 283, 92, 30);
        clearButtonOfDisplayTutorSalary.setFont(new Font("Arial", 1, 15));
        clearButtonOfDisplayTutorSalary.setForeground(new Color(255,255,255));
        clearButtonOfDisplayTutorSalary.setBackground(new Color(105, 105, 105));
        clearButtonOfDisplayTutorSalary.addActionListener(this);
        rightSidePanel.add(clearButtonOfDisplayTutorSalary);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);        
        int width = 50; 
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        displayTutorSalaryBackButton = new JButton(scaledIcon);
        displayTutorSalaryBackButton.setBounds(378, 91, width, height);
        // Make the button transparent
        displayTutorSalaryBackButton.setOpaque(false);
        displayTutorSalaryBackButton.setContentAreaFilled(false);
        displayTutorSalaryBackButton.setBorderPainted(false);
        displayTutorSalaryBackButton.addActionListener(this);
        rightSidePanel.add(displayTutorSalaryBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        displayTutorSalaryPanel.add(rightSidePanel);

        displayTutorSalaryPanel.setLayout(null);
        displayTutorSalaryPanel.setBounds(0, 0, 1280, 832);
        displayTutorSalaryPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    private void DisplayTutorDataGUI(){

        //backgroundpanel for DIsplayDataPanel
        displayTutorDataPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
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

        JLabel centerH2 = new JLabel("Display Tutor Data");
        centerH2.setBounds(379, 176, 401, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 236, 250, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        teacherIDFieldDisplayTutorData = new JTextField();
        teacherIDFieldDisplayTutorData.setBounds(526, 238, 282, 30);
        teacherIDFieldDisplayTutorData.setFont(new Font("Arial", 1, 20));
        teacherIDFieldDisplayTutorData.setForeground(new Color(105, 105, 105));
        teacherIDFieldDisplayTutorData.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherIDFieldDisplayTutorData);

        displayTutorDataButton = new JButton("Display");
        displayTutorDataButton.setBounds(726, 283, 92, 30);
        displayTutorDataButton.setFont(new Font("Arial", 1, 15));
        displayTutorDataButton.setForeground(new Color(255,255,255));
        displayTutorDataButton.setBackground(new Color(105, 105, 105));
        displayTutorDataButton.addActionListener(this);
        rightSidePanel.add(displayTutorDataButton);

        clearButtonOfDisplayTutorData = new JButton("Clear");
        clearButtonOfDisplayTutorData.setBounds(378, 283, 92, 30);
        clearButtonOfDisplayTutorData.setFont(new Font("Arial", 1, 15));
        clearButtonOfDisplayTutorData.setForeground(new Color(255,255,255));
        clearButtonOfDisplayTutorData.setBackground(new Color(105, 105, 105));
        clearButtonOfDisplayTutorData.addActionListener(this);
        rightSidePanel.add(clearButtonOfDisplayTutorData);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);        
        int width = 50; 
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        displayTutorDataBackButton = new JButton(scaledIcon);
        displayTutorDataBackButton.setBounds(378, 91, width, height);
        // Make the button transparent
        displayTutorDataBackButton.setOpaque(false);
        displayTutorDataBackButton.setContentAreaFilled(false);
        displayTutorDataBackButton.setBorderPainted(false);
        displayTutorDataBackButton.addActionListener(this);
        rightSidePanel.add(displayTutorDataBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        displayTutorDataPanel.add(rightSidePanel);

        displayTutorDataPanel.setLayout(null);
        displayTutorDataPanel.setBounds(0, 0, 1280, 832);
        displayTutorDataPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    private void SetSalaryGUI(){

        //backgroundpanel for DIsplayDataPanel
        setSalaryPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc  
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

        teacherIDFieldOfSetSalary = new JTextField();
        teacherIDFieldOfSetSalary.setBounds(625, 228, 282, 30);
        teacherIDFieldOfSetSalary.setFont(new Font("Arial", 1, 20));
        teacherIDFieldOfSetSalary.setForeground(new Color(105, 105, 105));
        teacherIDFieldOfSetSalary.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherIDFieldOfSetSalary);

        newSalaryFieldOfSetSalary = new JTextField();
        newSalaryFieldOfSetSalary.setBounds(625, 268, 282, 30);
        newSalaryFieldOfSetSalary.setFont(new Font("Arial", 1, 20));
        newSalaryFieldOfSetSalary.setForeground(new Color(105, 105, 105));
        newSalaryFieldOfSetSalary.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(newSalaryFieldOfSetSalary);

        newPerformanceIndexFieldOfSetSalary = new JTextField();
        newPerformanceIndexFieldOfSetSalary.setBounds(625, 307, 282, 30);
        newPerformanceIndexFieldOfSetSalary.setFont(new Font("Arial", 1, 20));
        newPerformanceIndexFieldOfSetSalary.setForeground(new Color(105, 105, 105));
        newPerformanceIndexFieldOfSetSalary.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(newPerformanceIndexFieldOfSetSalary);

        setTutorSalaryButtonOfSetSalary = new JButton("Update");
        setTutorSalaryButtonOfSetSalary.setBounds(825, 369, 92, 30);
        setTutorSalaryButtonOfSetSalary.setFont(new Font("Arial", 1, 15));
        setTutorSalaryButtonOfSetSalary.setForeground(new Color(255,255,255));
        setTutorSalaryButtonOfSetSalary.setBackground(new Color(105, 105, 105));
        setTutorSalaryButtonOfSetSalary.addActionListener(this);
        rightSidePanel.add(setTutorSalaryButtonOfSetSalary);

        clearButtonOfSetTutorSalary = new JButton("Clear");
        clearButtonOfSetTutorSalary.setBounds(378, 369, 92, 30);
        clearButtonOfSetTutorSalary.setFont(new Font("Arial", 1, 15));
        clearButtonOfSetTutorSalary.setForeground(new Color(255,255,255));
        clearButtonOfSetTutorSalary.setBackground(new Color(105, 105, 105));
        clearButtonOfSetTutorSalary.addActionListener(this);
        rightSidePanel.add(clearButtonOfSetTutorSalary);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);
        int width = 50;
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        setSalaryBackButton = new JButton(scaledIcon);
        setSalaryBackButton.setBounds(378, 91, width, height);
        // Make the button transparent
        setSalaryBackButton.setOpaque(false);
        setSalaryBackButton.setContentAreaFilled(false);
        setSalaryBackButton.setBorderPainted(false);
        setSalaryBackButton.addActionListener(this);
        rightSidePanel.add(setSalaryBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        setSalaryPanel.add(rightSidePanel);

        setSalaryPanel.setLayout(null);
        setSalaryPanel.setBounds(0, 0, 1280, 832);
        setSalaryPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    private void AssignmentGUI(){

        //backgroundpanel for DIsplayDataPanel
        assignmentPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
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

        gradeAssignmentOfAssignmentGUI = new JButton("<html><center>Grade<br>Assignment</center><html>");
        gradeAssignmentOfAssignmentGUI.setBounds(512, 335, 222, 118);
        gradeAssignmentOfAssignmentGUI.setFont(new java.awt.Font("Arial", 1, 20));
        gradeAssignmentOfAssignmentGUI.setForeground(new java.awt.Color(105,105,105));
        gradeAssignmentOfAssignmentGUI.setBackground(new java.awt.Color(164, 196, 181));
        gradeAssignmentOfAssignmentGUI.addActionListener(this);
        rightSidePanel.add(gradeAssignmentOfAssignmentGUI);

        displayGradedScoreOfAssignmentGUI = new JButton("<html><center>Display<br>Graded Score</center><html>");
        displayGradedScoreOfAssignmentGUI.setBounds(788, 335, 222, 118);
        displayGradedScoreOfAssignmentGUI.setFont(new java.awt.Font("Arial", 1, 20));
        displayGradedScoreOfAssignmentGUI.setForeground(new java.awt.Color(105,105,105));
        displayGradedScoreOfAssignmentGUI.setBackground(new java.awt.Color(164, 196, 181));
        displayGradedScoreOfAssignmentGUI.addActionListener(this);
        rightSidePanel.add(displayGradedScoreOfAssignmentGUI);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);
        int width = 50; 
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        assignmentGUIBackButton = new JButton(scaledIcon);
        assignmentGUIBackButton.setBounds(378, 91, width, height); 
        // Make the button transparent
        assignmentGUIBackButton.setOpaque(false);
        assignmentGUIBackButton.setContentAreaFilled(false);
        assignmentGUIBackButton.setBorderPainted(false);
        assignmentGUIBackButton.addActionListener(this);
        rightSidePanel.add(assignmentGUIBackButton);
        
        //panel settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        assignmentPanel.add(rightSidePanel);

        assignmentPanel.setLayout(null);
        assignmentPanel.setBounds(0, 0, 1280, 832);
        assignmentPanel.setBackground(new java.awt.Color(255, 255, 255));

    }
    
    private void GradedAssignments(){

        //backgroundpanel for DIsplayDataPanel
        gradedAssignmentsPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Assignments");
        centerH1.setBounds(469, 97, 306, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 45));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(centerH1);

        JLabel centerH2 = new JLabel("Grade Assignment");
        centerH2.setBounds(386, 183, 282, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 224, 250, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        JLabel gradedScore = new JLabel("Graded Score :");
        gradedScore.setBounds(379, 264, 282, 30);
        gradedScore.setFont(new Font("Arial", 1, 20));
        gradedScore.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(gradedScore);

        JLabel department = new JLabel("Department :");
        department.setBounds(379, 303, 282, 30);
        department.setFont(new Font("Arial", 1, 20));
        department.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(department);

        JLabel yearsOfExperience = new JLabel("Years Of Experience :");
        yearsOfExperience.setBounds(379, 343, 282, 30);
        yearsOfExperience.setFont(new Font("Arial", 1, 20));
        yearsOfExperience.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(yearsOfExperience);
        
        teacherIDFieldOfGradeAssignment = new JTextField();
        teacherIDFieldOfGradeAssignment.setBounds(630, 228, 282, 30);
        teacherIDFieldOfGradeAssignment.setFont(new Font("Arial", 1, 20));
        teacherIDFieldOfGradeAssignment.setForeground(new Color(105, 105, 105));
        teacherIDFieldOfGradeAssignment.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherIDFieldOfGradeAssignment);

        gradedScoreFieldOfGradeAssignment = new JTextField();
        gradedScoreFieldOfGradeAssignment.setBounds(630, 268, 282, 30);
        gradedScoreFieldOfGradeAssignment.setFont(new Font("Arial", 1, 20));
        gradedScoreFieldOfGradeAssignment.setForeground(new Color(105, 105, 105));
        gradedScoreFieldOfGradeAssignment.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(gradedScoreFieldOfGradeAssignment);

        departmentFieldOfGradeAssignment = new JTextField();
        departmentFieldOfGradeAssignment.setBounds(630, 307, 282, 30);
        departmentFieldOfGradeAssignment.setFont(new Font("Arial", 1, 20));
        departmentFieldOfGradeAssignment.setForeground(new Color(105, 105, 105));
        departmentFieldOfGradeAssignment.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(departmentFieldOfGradeAssignment);

        yearsOfExperienceFieldOfGradeAssignment = new JTextField();
        yearsOfExperienceFieldOfGradeAssignment.setBounds(630, 347, 282, 30);
        yearsOfExperienceFieldOfGradeAssignment.setFont(new Font("Arial", 1, 20));
        yearsOfExperienceFieldOfGradeAssignment.setForeground(new Color(105, 105, 105));
        yearsOfExperienceFieldOfGradeAssignment.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(yearsOfExperienceFieldOfGradeAssignment);

        gradeAssignmentButton = new JButton("Grade");
        gradeAssignmentButton.setBounds(820, 395, 92, 30);
        gradeAssignmentButton.setFont(new Font("Arial", 1, 15));
        gradeAssignmentButton.setForeground(new Color(255,255,255));
        gradeAssignmentButton.setBackground(new Color(105, 105, 105));
        gradeAssignmentButton.addActionListener(this);
        rightSidePanel.add(gradeAssignmentButton);

        clearButtonOfGradeAssignment = new JButton("Clear");
        clearButtonOfGradeAssignment.setBounds(379, 395, 92, 30);
        clearButtonOfGradeAssignment.setFont(new Font("Arial", 1, 15));
        clearButtonOfGradeAssignment.setForeground(new Color(255,255,255));
        clearButtonOfGradeAssignment.setBackground(new Color(105, 105, 105));
        clearButtonOfGradeAssignment.addActionListener(this);
        rightSidePanel.add(clearButtonOfGradeAssignment);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);    
        int width = 50; 
        int height = 50;
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        gradeAssignmentBackButton = new JButton(scaledIcon);
        gradeAssignmentBackButton.setBounds(378, 91, width, height);
        // Make the button transparent
        gradeAssignmentBackButton.setOpaque(false);
        gradeAssignmentBackButton.setContentAreaFilled(false);
        gradeAssignmentBackButton.setBorderPainted(false);
        gradeAssignmentBackButton.addActionListener(this);
        rightSidePanel.add(gradeAssignmentBackButton);

        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        gradedAssignmentsPanel.add(rightSidePanel);

        gradedAssignmentsPanel.setLayout(null);
        gradedAssignmentsPanel.setBounds(0, 0, 1280, 832);
        gradedAssignmentsPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    private void DisplayGradedAssignments(){

        //backgroundpanel for DIsplayDataPanel
        displayGradedAssignmentsPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
        JLabel rightSideH1 = new JLabel("Islington College");
        rightSideH1.setBounds(1100, 32, 228, 38);
        rightSideH1.setFont(new java.awt.Font("Arial", 1, 15));
        rightSideH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(rightSideH1);

        JLabel centerH1 = new JLabel("Assignments");
        centerH1.setBounds(469, 97, 300, 49);
        centerH1.setFont(new java.awt.Font("Arial", 1, 45));
        centerH1.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(centerH1);

        JLabel centerH2 = new JLabel("Display Graded Score");
        centerH2.setBounds(379, 169, 282, 30);
        centerH2.setFont(new Font("Arial", 1, 25));
        centerH2.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(centerH2);

        JLabel teacherID = new JLabel("Teacher ID :");
        teacherID.setBounds(379, 227, 250, 30);
        teacherID.setFont(new Font("Arial", 1, 20));
        teacherID.setForeground(new Color(105, 105, 105));
        rightSidePanel.add(teacherID);

        teacherIDFieldOfDisplayGradedAssignment = new JTextField();
        teacherIDFieldOfDisplayGradedAssignment.setBounds(520, 228, 282, 30);
        teacherIDFieldOfDisplayGradedAssignment.setFont(new Font("Arial", 1, 20));
        teacherIDFieldOfDisplayGradedAssignment.setForeground(new Color(105, 105, 105));
        teacherIDFieldOfDisplayGradedAssignment.setBorder(BorderFactory.createLineBorder(Color.BLACK,thickness));
        rightSidePanel.add(teacherIDFieldOfDisplayGradedAssignment);

        displayGradeAssignmentButton = new JButton("Display");
        displayGradeAssignmentButton.setBounds(720, 275, 92, 30);
        displayGradeAssignmentButton.setFont(new Font("Arial", 1, 15));
        displayGradeAssignmentButton.setForeground(new Color(255,255,255));
        displayGradeAssignmentButton.setBackground(new Color(105, 105, 105));
        displayGradeAssignmentButton.addActionListener(this);
        rightSidePanel.add(displayGradeAssignmentButton);

        clearButtonOfDisplayGradeAssignment = new JButton("Clear");
        clearButtonOfDisplayGradeAssignment.setBounds(379, 275, 92, 30);
        clearButtonOfDisplayGradeAssignment.setFont(new Font("Arial", 1, 15));
        clearButtonOfDisplayGradeAssignment.setForeground(new Color(255,255,255));
        clearButtonOfDisplayGradeAssignment.setBackground(new Color(105, 105, 105));
        clearButtonOfDisplayGradeAssignment.addActionListener(this);
        rightSidePanel.add(clearButtonOfDisplayGradeAssignment);

        // Load image from file
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);     
        int width = 50; 
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        displayGradedAssignmentsBackButton = new JButton(scaledIcon);
        displayGradedAssignmentsBackButton.setBounds(378, 91, width, height);
        displayGradedAssignmentsBackButton.addActionListener(this);
        // Make the button transparent
        displayGradedAssignmentsBackButton.setOpaque(false);
        displayGradedAssignmentsBackButton.setContentAreaFilled(false);
        displayGradedAssignmentsBackButton.setBorderPainted(false);
        rightSidePanel.add(displayGradedAssignmentsBackButton);

        //panel settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        displayGradedAssignmentsPanel.add(rightSidePanel);

        displayGradedAssignmentsPanel.setLayout(null);
        displayGradedAssignmentsPanel.setBounds(0, 0, 1280, 832);
        displayGradedAssignmentsPanel.setBackground(new java.awt.Color(255, 255, 255));
    }

    private void ProfileGUI() {
        //backgroundpanel for DIsplayDataPanel
        profileGUIPanel = new JPanel();

        //main panel where  components are added
        JPanel rightSidePanel = new JPanel();

        // adding components and setting up there size,color,positions etc
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

        JLabel UserIDValue = new JLabel("100");
        UserIDValue.setBounds(640, 389, 100, 30);
        UserIDValue.setFont(new java.awt.Font("Arial", 1, 15));
        UserIDValue.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(UserIDValue);

        JLabel UserNameValue = new JLabel("Admin");
        UserNameValue.setBounds(640, 429, 100, 30);
        UserNameValue.setFont(new java.awt.Font("Arial", 1, 15));
        UserNameValue.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(UserNameValue);

        JLabel StaffIDValue = new JLabel("1001");
        StaffIDValue.setBounds(640, 469, 100, 30);
        StaffIDValue.setFont(new java.awt.Font("Arial", 1, 15));
        StaffIDValue.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(StaffIDValue);

        JLabel StaffEmailValue = new JLabel("admin1@gmail.com");
        StaffEmailValue.setBounds(640, 509, 150, 30);
        StaffEmailValue.setFont(new java.awt.Font("Arial", 1, 15));
        StaffEmailValue.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(StaffEmailValue);

        JLabel StaffPhoneValue = new JLabel("9841234567");
        StaffPhoneValue.setBounds(640, 549, 100, 30);
        StaffPhoneValue.setFont(new java.awt.Font("Arial", 1, 15));
        StaffPhoneValue.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(StaffPhoneValue);

        JLabel UniversityValue = new JLabel("London Metropolitan University");
        UniversityValue.setBounds(640, 589, 300, 30);
        UniversityValue.setFont(new java.awt.Font("Arial", 1, 15));
        UniversityValue.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(UniversityValue);

        JLabel CollegeValue = new JLabel("Islington College");
        CollegeValue.setBounds(640, 629, 150, 30);
        CollegeValue.setFont(new java.awt.Font("Arial", 1, 15));
        CollegeValue.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(CollegeValue);

        JLabel CollegeAddressValue = new JLabel("Kathmandu, Nepal");
        CollegeAddressValue.setBounds(640, 669, 150, 30);
        CollegeAddressValue.setFont(new java.awt.Font("Arial", 1, 15));
        CollegeAddressValue.setForeground(new java.awt.Color(105, 105, 105));
        rightSidePanel.add(CollegeAddressValue);

        try {
            BufferedImage profileImage = ImageIO.read(new File(imagePathOfProfileImage));
            int desiredWidth = 200; 
            int desiredHeight = 200; 
            Image scaledImage = profileImage.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);
            // Create ImageIcon from scaled image
            ImageIcon imageIcon = new ImageIcon(scaledImage);
            JLabel imageLabel = new JLabel(imageIcon);
            // Adjust position of image label
            imageLabel.setBounds(470, 157, desiredWidth, desiredHeight);
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
        ImageIcon icon = new ImageIcon(imagePathOfBackButton);     
        int width = 50; 
        int height = 50; 
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Create ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create JButton with just the image
        profileGUIBackButton = new JButton(scaledIcon);
        profileGUIBackButton.setBounds(378, 91, width, height); 
        // Make the button transparent
        profileGUIBackButton.addActionListener(this);
        profileGUIBackButton.setOpaque(false);
        profileGUIBackButton.setContentAreaFilled(false);
        profileGUIBackButton.setBorderPainted(false);
        rightSidePanel.add(profileGUIBackButton);

        //panel settings
        rightSidePanel.setBounds(0, 0, 1500, 832);
        rightSidePanel.setLayout(null);
        rightSidePanel.setBackground(new Color(255,255,255));
        profileGUIPanel.add(rightSidePanel);

        profileGUIPanel.setLayout(null);
        profileGUIPanel.setBounds(0, 0, 1280, 832);
        profileGUIPanel.setBackground(new java.awt.Color(255, 255, 255));
        
    }

    // Method to clear input fields
    private void clearInputFields() {
        userIDField.setText("");
        passwordField.setText("");
        teacherIDFieldOfAddLecturer.setText("");
        teacherNameFieldOfAddLecturer.setText("");
        addressFieldOfAddLecturer.setText("");
        workingTypeFieldOfAddLecturer.setText("");
        employmentStatusFieldOfAddLecturer.setText("");
        workingHoursFieldOfAddLecturer.setText("");
        departmentFieldOfAddLecturer.setText("");
        yearsOfExperienceFieldOfAddLecturer.setText("");
        teacherIDFieldDisplayLecturerData.setText("");
        addressFieldOfAddTutor.setText("");
        teacherNameFieldOfAddTutor.setText("");
        teacherIDFieldOfAddTutor.setText("");
        workingTypeFieldOfAddTutor.setText("");
        employmentStatusFieldOfAddTutor.setText("");
        workingHoursFieldOfAddTutor.setText("");
        salaryFieldOfAddTutor.setText("");
        specializationFieldOfAddTutor.setText("");
        performanceIndexFieldOfAddTutor.setText("");
        academicQualificationsFieldOfAddTutor.setText("");
        teacherIDFieldOfRemoveTutor.setText("");
        teacherIDFieldOfDisplayTutorSalary.setText("");
        teacherIDFieldDisplayTutorData.setText("");
        teacherIDFieldOfSetSalary.setText("");
        newSalaryFieldOfSetSalary.setText("");
        newPerformanceIndexFieldOfSetSalary.setText("");
        teacherIDFieldOfGradeAssignment.setText("");
        gradedScoreFieldOfGradeAssignment.setText("");
        departmentFieldOfGradeAssignment.setText("");
        yearsOfExperienceFieldOfGradeAssignment.setText("");
        teacherIDFieldOfDisplayGradedAssignment.setText("");
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
            
            if ((userID == 100 && password.equals("admin"))) {
                // Clear text fields
                clearInputFields();
                // Remove the current panel and add the new panels
                mainPanel.remove(loginPageBackground);
                mainPanel.add(leftSideMenuPanel);
                mainPanel.add(dashBoardBackground);
                mainPanel.revalidate();
                mainPanel.repaint();
            }else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                // Clear text fields
                clearInputFields();
            }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid user ID (numeric value)");
                // Clear text fields
                clearInputFields();
            }
        }  
        if (e.getSource() == displayData) {
            mainPanel.remove(dashBoardBackground);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayDataPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayGradedAssignmentsOfDisplayGUI) {
            mainPanel.remove(displayDataPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayGradedAssignmentsPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayGradedScoreOfAssignmentGUI) {
            mainPanel.remove(assignmentPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayGradedAssignmentsPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == gradeAssignmentOfAssignmentGUI) {
            mainPanel.remove(assignmentPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(gradedAssignmentsPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayTutorDataOfDisplayGUI) {
            mainPanel.remove(displayDataPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayTutorDataPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayLecturerDataOfDisplayGUI) {
            mainPanel.remove(displayDataPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayLecturerDataPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayTutorSalaryOfDisplayGUI) {
            mainPanel.remove(displayDataPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayTutorSalaryPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == lecturer) {
            mainPanel.remove(dashBoardBackground);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(lecturerPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == addLecturer) {
            mainPanel.remove(lecturerPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(addlecturerPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayLecturerDataOfLecturerGUI) {
            mainPanel.remove(lecturerPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayLecturerDataPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == tutor) {
            mainPanel.remove(dashBoardBackground);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(tutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayTutorDataOfTutorGUI){
            mainPanel.remove(tutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayTutorDataPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == addTutor) {
            mainPanel.remove(tutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(addTutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == setSalaryOfTutor) {
            mainPanel.remove(tutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(setSalaryPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == removeTutor) {
            mainPanel.remove(tutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(removeTutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayTutorSalaryOfTutorGUI) {
            mainPanel.remove(tutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(displayTutorSalaryPanel); 
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == assignment) {
            mainPanel.remove(dashBoardBackground);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(assignmentPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == profile) {
            mainPanel.remove(dashBoardBackground);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(profileGUIPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuHome) { 
            mainPanel.remove(lecturerPanel);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(displayLecturerDataPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(tutorPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(assignmentPanel);
            mainPanel.remove(profileGUIPanel);
            mainPanel.remove(displayTutorDataPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(displayGradedAssignmentsPanel);
            mainPanel.remove(gradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(dashBoardBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuLecturer) {
            mainPanel.remove(dashBoardBackground);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(tutorPanel);
            mainPanel.remove(displayLecturerDataPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(displayTutorDataPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(gradedAssignmentsPanel);
            mainPanel.remove(assignmentPanel);
            mainPanel.remove(profileGUIPanel);
            mainPanel.remove(displayGradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(lecturerPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuTutor) {
            mainPanel.remove(dashBoardBackground);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(lecturerPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(displayLecturerDataPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(assignmentPanel);
            mainPanel.remove(profileGUIPanel);
            mainPanel.remove(displayTutorDataPanel);
            mainPanel.remove(gradedAssignmentsPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(displayGradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(tutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuAssignments) {
            mainPanel.remove(dashBoardBackground);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(lecturerPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(displayLecturerDataPanel);
            mainPanel.remove(tutorPanel);
            mainPanel.remove(displayTutorDataPanel);
            mainPanel.remove(profileGUIPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(gradedAssignmentsPanel);
            mainPanel.remove(displayGradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(assignmentPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuProfile) {
            mainPanel.remove(dashBoardBackground);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(lecturerPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(displayTutorDataPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(displayLecturerDataPanel);
            mainPanel.remove(gradedAssignmentsPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(tutorPanel);
            mainPanel.remove(assignmentPanel);
            mainPanel.remove(displayGradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(profileGUIPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == menuLogOut) {   
            mainPanel.remove(dashBoardBackground);
            mainPanel.remove(displayDataPanel);
            mainPanel.remove(addlecturerPanel);
            mainPanel.remove(addTutorPanel);
            mainPanel.remove(lecturerPanel);
            mainPanel.remove(removeTutorPanel);
            mainPanel.remove(setSalaryPanel);
            mainPanel.remove(tutorPanel);
            mainPanel.remove(displayLecturerDataPanel);
            mainPanel.remove(displayTutorDataPanel);
            mainPanel.remove(gradedAssignmentsPanel);
            mainPanel.remove(assignmentPanel);
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.remove(displayGradedAssignmentsPanel);
            mainPanel.remove(leftSideMenuPanel);
            mainPanel.remove(profileGUIPanel);
            mainPanel.add(loginPageBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == showLoginPageBackButton){
            mainPanel.remove(loginPageBackground);
            mainPanel.add(startBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == lecturerGUIBackButton){
            mainPanel.remove(lecturerPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(dashBoardBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayDataBackButton){
            mainPanel.remove(displayDataPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(dashBoardBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == addLecturerBackButton){
            mainPanel.remove(addlecturerPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(lecturerPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayLecturerDataBackButton){
            mainPanel.remove(displayLecturerDataPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(lecturerPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == tutorGUIBackButton){
            mainPanel.remove(tutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(dashBoardBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == addTutorBackButton){
            mainPanel.remove(addTutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(tutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == removeTutorBackButton){
            mainPanel.remove(removeTutorPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(tutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayTutorSalaryBackButton){
            mainPanel.remove(displayTutorSalaryPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(tutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayTutorDataBackButton){
            mainPanel.remove(displayTutorDataPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(tutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == setSalaryBackButton){
            mainPanel.remove(setSalaryPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(tutorPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == assignmentGUIBackButton){
            mainPanel.remove(assignmentPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(dashBoardBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == gradeAssignmentBackButton){
            mainPanel.remove(gradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(assignmentPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == displayGradedAssignmentsBackButton){
            mainPanel.remove(displayGradedAssignmentsPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(assignmentPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
        if (e.getSource() == profileGUIBackButton){
            mainPanel.remove(profileGUIPanel);
            mainPanel.add(leftSideMenuPanel);
            mainPanel.add(dashBoardBackground);
            mainPanel.revalidate();
            mainPanel.repaint();
        }

        if (e.getSource() == addLecturerButton) {
            try {
                // Storing input values from text fields to the local variables
                String teacherIdString = teacherIDFieldOfAddLecturer.getText();
                int teacherId = Integer.parseInt(teacherIdString);
                String teacherName = teacherNameFieldOfAddLecturer.getText();
                String address = addressFieldOfAddLecturer.getText();
                String workingType = workingTypeFieldOfAddLecturer.getText();
                String employmentStatus = employmentStatusFieldOfAddLecturer.getText();
                String workingHoursString = workingHoursFieldOfAddLecturer.getText();
                int workingHours = Integer.parseInt(workingHoursString);
                String department = departmentFieldOfAddLecturer.getText();
                String yearsOfExperienceString = yearsOfExperienceFieldOfAddLecturer.getText();
                int yearsOfExperience = Integer.parseInt(yearsOfExperienceString);
                // Check if any text field is empty
                if (teacherIdString.isEmpty() || teacherName.isEmpty() || address.isEmpty() ||workingHoursString.isEmpty() || workingType.isEmpty() || employmentStatus.isEmpty() ||
                        department.isEmpty() || yearsOfExperienceString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // Create a message to show the user the details they are about to add
                String confirmMessage = "Are you sure you want to add the following lecturer?\n\n" +
                "Teacher ID: " + teacherId + "\n" +
                "Name: " + teacherName + "\n" +
                "Address: " + address + "\n" +
                "Working Type: " + workingType + "\n" +
                "Employment Status: " + employmentStatus + "\n" +
                "Working Hours: " + workingHours + "\n" +
                "Department: " + department + "\n" +
                "Years of Experience: " + yearsOfExperience;

                // Customize the buttons to "Yes" and "Edit"
                Object[] options = {"Yes", "Edit"};
                // Show confirm dialog with customized buttons
                int option = JOptionPane.showOptionDialog(null, confirmMessage, "Are you sure to add Lecturer", JOptionPane.YES_NO_OPTION, 
                                                   JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                // Check user's choice
                if (option == JOptionPane.YES_OPTION) {
                    // Check if the ArrayList is empty
                    if (teachersList.isEmpty()) {
                        // Create a new Lecturer object
                        Lecturer newLecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus,
                                                            workingHours, department, yearsOfExperience);
                        // Add the new Lecturer to the ArrayList
                        teachersList.add(newLecturer);
                        // Clear the input fields after adding the Lecturer
                        clearInputFields();
                        // Display success message
                        JOptionPane.showMessageDialog(null, "Lecturer added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        // Check for duplicate teacher ID
                        for (Teacher teacher : teachersList) {
                            if (teacher.getTeacherId() == teacherId) {
                                if (teacher instanceof Lecturer) {
                                    JOptionPane.showMessageDialog(null, "Teacher ID already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                }
                            }
                        }
                        // Create a new Lecturer object
                        Lecturer newLecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus,
                                                            workingHours, department, yearsOfExperience);
                        // Add the new Lecturer to the ArrayList
                        teachersList.add(newLecturer);
                        // Clear the input fields after adding the Lecturer
                        clearInputFields();
                        // Display success message
                        JOptionPane.showMessageDialog(null, "Lecturer added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input format for numeric fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource() == clearButtonOfAddLecturer){
            clearInputFields();
        }

        if (e.getSource() == addTutorButtonOfAddTutor) {
            try {
                // Retrieve input values from text fields
                String teacherIdString = teacherIDFieldOfAddTutor.getText();
                int teacherId = Integer.parseInt(teacherIdString);
                String teacherName = teacherNameFieldOfAddTutor.getText();
                String address = addressFieldOfAddTutor.getText();
                String workingType = workingTypeFieldOfAddTutor.getText();
                String employmentStatus = employmentStatusFieldOfAddTutor.getText();
                String workingHoursString = workingHoursFieldOfAddTutor.getText();
                int workingHours = Integer.parseInt(workingHoursString);
                String salaryString = salaryFieldOfAddTutor.getText();
                double salary = Double.parseDouble(salaryString);
                String specialization = specializationFieldOfAddTutor.getText();
                String academicQualifications = academicQualificationsFieldOfAddTutor.getText();
                String performanceIndexString = performanceIndexFieldOfAddTutor.getText();
                int performanceIndex = Integer.parseInt(performanceIndexString);
        
                // Check if any text field is empty
                if (teacherIdString.isEmpty() || teacherName.isEmpty() || address.isEmpty() || workingType.isEmpty() || employmentStatus.isEmpty() || workingHoursString.isEmpty() ||
                    salaryString.isEmpty() || specialization.isEmpty() || academicQualifications.isEmpty() || performanceIndexString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                // Create a message to show the user the details they are about to add
                String confirmMessage = "Are you sure you want to add the following tutor?\n\n" +
                    "Teacher ID: " + teacherId + "\n" +
                    "Name: " + teacherName + "\n" +
                    "Address: " + address + "\n" +
                    "Working Type: " + workingType + "\n" +
                    "Employment Status: " + employmentStatus + "\n" +
                    "Working Hours: " + workingHours + "\n" +
                    "Salary: " + salary + "\n" +
                    "Specialization: " + specialization + "\n" +
                    "Academic Qualifications: " + academicQualifications + "\n" +
                    "Performance Index: " + performanceIndex;
        
                // Customize the buttons to "Yes" and "Edit"
                Object[] options = {"Yes", "Edit"};
                // Show confirm dialog with customized buttons
                int option = JOptionPane.showOptionDialog(null, confirmMessage, "Are you sure to add Tutor", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
                // Check user's choice
                if (option == JOptionPane.YES_OPTION) {
                    // Check if the ArrayList is empty
                    if (teachersList.isEmpty()) {
                        // Create a new Tutor object
                        Tutor newTutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours,
                                                    salary, specialization, academicQualifications, performanceIndex);
                        // Add the new Tutor to the ArrayList
                        teachersList.add(newTutor);
                        // Clear the input fields after adding the Tutor
                        clearInputFields();
                        // Display success message
                        JOptionPane.showMessageDialog(null, "Tutor added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        // Check for duplicate teacher ID
                        for (Teacher teacher : teachersList) {
                            if (teacher.getTeacherId() == teacherId) {
                                if (teacher instanceof Tutor) {
                                    JOptionPane.showMessageDialog(null, "Teacher ID already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                }
                            }
                        }
                        // Create a new Tutor object
                        Tutor newTutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours,
                                                    salary, specialization, academicQualifications, performanceIndex);
                        // Add the new Tutor to the ArrayList
                        teachersList.add(newTutor);
                        // Clear the input fields after adding the Tutor
                        clearInputFields();
                        // Display success message
                        JOptionPane.showMessageDialog(null, "Tutor added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
        
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input format for numeric fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }       
        if(e.getSource() == clearButtonOfAddTutorOfAddTutor){
            clearInputFields();
        }

        if (e.getSource() == removeTutorButtonOfRemoveTutor) {
            try {
                String teacherIdString = teacherIDFieldOfRemoveTutor.getText();
                int teacherId = Integer.parseInt(teacherIdString);
                if (teacherIdString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please keep the TeacherID", "Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // Check if the ArrayList is empty
                if (teachersList.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No tutors available to remove.", "Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // Create a message to show the user the details they are about to add
                String confirmMessage = "Are you sure you want to add the following tutor?\n\n" + "Teacher ID: " + teacherId;
                // Customize the buttons to "Yes" and "Edit"
                Object[] options = {"Yes", "Edit"};
                // Show confirm dialog with customized buttons
                int option = JOptionPane.showOptionDialog(null, confirmMessage, "Are you sure to add Tutor", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
                // Check user's choice
                if (option == JOptionPane.YES_OPTION) {
                    // Check if the teacher ID exists
                    Teacher tutorToRemove = null; // Variable to store the tutor to be removed
                    for (Teacher teacher : teachersList) {
                        if (teacher.getTeacherId() == teacherId) {
                            // Check if the teacher is a Tutor by checking the instance of the object
                            if (teacher instanceof Tutor) {
                                // Cast the teacher object to a Tutor object(Downcasting)
                                Tutor tutor = (Tutor) teacher;
                                if (tutor.getIsCertified()) {
                                    // If the tutor is certified, inform the user that they cannot be removed
                                    JOptionPane.showMessageDialog(null, "Certified tutors cannot be removed.", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                } else {
                                    // If the tutor is not certified, store it for removal
                                    tutorToRemove = teacher;
                                    break; // Exit the loop once the tutor is found
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Teacher ID does not belong to a Tutor.", "Error",JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                    if (tutorToRemove == null) {
                        JOptionPane.showMessageDialog(null, "Teacher ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    // Remove the tutor
                    ((Tutor) tutorToRemove).removeTutor(); // Call the method to remove the tutor
                    teachersList.remove(tutorToRemove);
                    JOptionPane.showMessageDialog(null, "Tutor removed successfully.", "Success",JOptionPane.INFORMATION_MESSAGE);
                    // Clear the input field after removing the Tutor
                    clearInputFields();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input format for teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        } 
        if(e.getSource() == clearButtonOfRemoveTutor){
            clearInputFields();
        }     

        if (e.getSource() == setTutorSalaryButtonOfSetSalary) {
            try {
                String teacherIdString = teacherIDFieldOfSetSalary.getText();
                int teacherId = Integer.parseInt(teacherIdString);
                String newSalaryString = newSalaryFieldOfSetSalary.getText();
                double newSalary = Double.parseDouble(newSalaryString);
                String newPerformanceIndexString = newPerformanceIndexFieldOfSetSalary.getText();
                int newPerformanceIndex = Integer.parseInt(newPerformanceIndexString);
                
                if (teacherIdString.isEmpty() || newSalaryString.isEmpty() || newPerformanceIndexString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Fill All the Feilds.", "Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Check if the ArrayList is empty
                if (teachersList.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No tutors available to set salary.", "Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // Create a message to show the user the details they are about to add
                String confirmMessage = "Are you sure you want to add the following tutor?\n\n"
                + "Teacher ID: " + teacherId + "\n" 
                + "New Salary: " + newSalary + "\n" 
                + "New Performance Index: " + newPerformanceIndex;
                // Customize the buttons to "Yes" and "Edit"
                Object[] options = {"Yes", "Edit"};
                // Show confirm dialog with customized buttons
                int option = JOptionPane.showOptionDialog(null, confirmMessage, "Are you sure to add Tutor", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
                // Check user's choice
                if (option == JOptionPane.YES_OPTION) {
                    // Check if the teacher ID exists
                    boolean teacherFound = false;
                    for (Teacher teacher : teachersList) {
                        if (teacher.getTeacherId() == teacherId) {
                            // Check if the teacher is a Tutor by checking the instance of the object
                            if (teacher instanceof Tutor) {
                                teacherFound = true;
                                // Cast the teacher object to a Tutor object(Downcasting)
                                Tutor tutor = (Tutor) teacher;
                                tutor.setSalary(newSalary, newPerformanceIndex); // Call the method to set the salary
                                JOptionPane.showMessageDialog(null, "Salary updated successfully.", "Success",JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Teacher ID does not belong to a Tutor.", "Error",JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        }
                    }
                    if (!teacherFound) {
                        JOptionPane.showMessageDialog(null, "Teacher ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    // Clear the input fields after updating the salary
                    clearInputFields();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input format for numeric fields.", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource() == clearButtonOfSetTutorSalary){
            clearInputFields();
        }   

        if (e.getSource() == gradeAssignmentButton) {
            try {
                String teacherIdString = teacherIDFieldOfGradeAssignment.getText();
                int teacherId = Integer.parseInt(teacherIdString);
                String gradedScoreString = gradedScoreFieldOfGradeAssignment.getText();
                int gradedScore = Integer.parseInt(gradedScoreString);
                String department = departmentFieldOfGradeAssignment.getText();
                String yearsOfExperienceString = yearsOfExperienceFieldOfGradeAssignment.getText();
                int yearsOfExperience = Integer.parseInt(yearsOfExperienceString);

                if (teacherIdString.isEmpty() || gradedScoreString.isEmpty() || department.isEmpty() || yearsOfExperienceString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Fill all the TextFeilds.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (gradedScore < 0 || gradedScore > 100) {
                    JOptionPane.showMessageDialog(null, "Graded score must be between or Equal to 0 and 100.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (yearsOfExperience < 0) {
                    JOptionPane.showMessageDialog(null, "Years of experience must be a Greater or Equal to Zero.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                // Create a message to show the user the details they are about to add
                String confirmMessage = "Are you sure you want to add the following tutor?\n\n"
                + "Teacher ID: " + teacherId + "\n" 
                + "Graded Score: " + gradedScore + "\n"
                + "Department: " + department + "\n"
                + "Years of Experience: " + yearsOfExperience;
                // Customize the buttons to "Yes" and "Edit"
                Object[] options = {"Yes", "Edit"};
                // Show confirm dialog with customized buttons
                int option = JOptionPane.showOptionDialog(null, confirmMessage, "Are you sure to add Tutor", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                // Check user's choice
                if (option == JOptionPane.YES_OPTION) {
                    // Check if the ArrayList is empty
                    if (teachersList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No teachers available to grade assignments.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    // Check if the teacher ID exists
                    boolean teacherFound = false;
                    for (Teacher teacher : teachersList) {
                        if (teacher.getTeacherId() == teacherId) {
                            // Check if the teacher is a Lecturer by checking the instance of the object
                            if (teacher instanceof Lecturer) {
                                teacherFound = true;
                                // Cast the teacher object to a Lecturer object (Downcasting)
                                Lecturer lecturer = (Lecturer) teacher;
                                lecturer.gradeAssignment(gradedScore, department, yearsOfExperience); // Call the method to grade assignments
                                JOptionPane.showMessageDialog(null, "Assignments graded successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Teacher ID does not belong to a Lecturer.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        }
                    }
                    if (!teacherFound) {
                        JOptionPane.showMessageDialog(null, "Teacher ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    clearInputFields(); // Clear the input fields after grading assignments
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input format for numeric fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource() == clearButtonOfGradeAssignment){
            clearInputFields();
        }        
      
        if (e.getSource() == displayTutorDataButton) {
            try {
                String teacherIdString = teacherIDFieldDisplayTutorData.getText();
                int teacherId = Integer.parseInt(teacherIdString);
                Teacher tutor = null;
                if (teacherIdString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // Find tutor by ID in the ArrayList
                for (Teacher teacher : teachersList) {
                    if (teacher.getTeacherId() == teacherId && teacher instanceof Tutor) {
                        tutor = teacher;
                        break;
                    }
                }
        
                if (tutor != null) {
                    JFrame tutorDataFrame = new JFrame("Tutor Data");

                    JPanel panel = new JPanel();
                    panel.setLayout(null);
                    panel.setBackground(Color.BLACK);

                    JLabel heading = new JLabel("Teacher Details");
                    heading.setForeground(Color.WHITE);
                    heading.setFont(new Font("Arial", Font.BOLD, 25));
                    heading.setBounds(271, 54, 358, 57);
                    panel.add(heading);

                    // Add other components similarly
                    JLabel IDLabel = new JLabel("Teacher ID: ");
                    IDLabel.setForeground(Color.WHITE); 
                    IDLabel.setBounds(200, 170, 120, 30);
                    IDLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(IDLabel);

                    JLabel nameLabel = new JLabel("Teacher Name: ");
                    nameLabel.setForeground(Color.WHITE); 
                    nameLabel.setBounds(200, 199, 120, 30);
                    nameLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(nameLabel);

                    JLabel addressLabel = new JLabel("Address: ");
                    addressLabel.setForeground(Color.WHITE);
                    addressLabel.setBounds(200, 228, 120, 30);
                    addressLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(addressLabel);

                    JLabel workingTypeLabel = new JLabel("Working Type: ");
                    workingTypeLabel.setForeground(Color.WHITE); 
                    workingTypeLabel.setBounds(200, 257, 120, 30);
                    workingTypeLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(workingTypeLabel);

                    JLabel employmentStatusLabel = new JLabel("Employment Status: ");
                    employmentStatusLabel.setForeground(Color.WHITE);
                    employmentStatusLabel.setBounds(200, 286, 200, 30);
                    employmentStatusLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(employmentStatusLabel);

                    JLabel workingHoursLabel = new JLabel("Working Hours: ");
                    workingHoursLabel.setForeground(Color.WHITE);
                    workingHoursLabel.setBounds(200, 315, 200, 30);
                    workingHoursLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(workingHoursLabel);

                    JLabel salaryLabel = new JLabel("Salary: ");
                    salaryLabel.setForeground(Color.WHITE); 
                    salaryLabel.setBounds(200, 344, 120, 30);
                    salaryLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(salaryLabel);

                    JLabel specializationLabel = new JLabel("Specialization: ");
                    specializationLabel.setForeground(Color.WHITE);
                    specializationLabel.setBounds(200, 373, 200, 30);
                    specializationLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(specializationLabel);

                    JLabel qualificationsLabel = new JLabel("Qualifications: ");
                    qualificationsLabel.setForeground(Color.WHITE); 
                    qualificationsLabel.setBounds(200, 402, 200, 30);
                    qualificationsLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(qualificationsLabel);

                    JLabel performanceIndexLabel = new JLabel("Performance Index: ");
                    performanceIndexLabel.setForeground(Color.WHITE);
                    performanceIndexLabel.setBounds(200, 431, 200, 30);
                    performanceIndexLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(performanceIndexLabel);

                    JLabel teacherID = new JLabel(Integer.toString(tutor.getTeacherId()));
                    teacherID.setForeground(Color.WHITE); 
                    teacherID.setBounds(380, 170, 120, 30);
                    teacherID.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(teacherID);

                    JLabel teacherName = new JLabel(tutor.getTeacherName());
                    teacherName.setForeground(Color.WHITE); 
                    teacherName.setBounds(380, 199, 120, 30);
                    teacherName.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(teacherName);

                    JLabel address = new JLabel(tutor.getAddress());
                    address.setForeground(Color.WHITE); 
                    address.setBounds(380, 228, 120, 30);
                    address.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(address);

                    JLabel workingType = new JLabel(tutor.getWorkingType());
                    workingType.setForeground(Color.WHITE);
                    workingType.setBounds(380, 257, 120, 30);
                    workingType.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(workingType);

                    JLabel employmentStatus = new JLabel(tutor.getEmploymentStatus());
                    employmentStatus.setForeground(Color.WHITE); 
                    employmentStatus.setBounds(380, 286, 120, 30);
                    employmentStatus.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(employmentStatus);

                    JLabel workingHours = new JLabel(Integer.toString(tutor.getWorkingHours()));
                    workingHours.setForeground(Color.WHITE); 
                    workingHours.setBounds(380, 315, 120, 30);
                    workingHours.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(workingHours);

                    JLabel salary = new JLabel(Double.toString(((Tutor) tutor).getSalary()));
                    salary.setForeground(Color.WHITE);
                    salary.setBounds(380, 344, 120, 30);
                    salary.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(salary);

                    JLabel specialization = new JLabel(((Tutor) tutor).getSpecialization());
                    specialization.setForeground(Color.WHITE);
                    specialization.setBounds(380, 373, 120, 30);
                    specialization.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(specialization);

                    JLabel qualifications = new JLabel(((Tutor) tutor).getAcademicQualifications());
                    qualifications.setForeground(Color.WHITE); 
                    qualifications.setBounds(380, 402, 120, 30);
                    qualifications.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(qualifications);

                    JLabel performanceIndex = new JLabel(Integer.toString(((Tutor) tutor).getPerformanceIndex()));
                    performanceIndex.setForeground(Color.WHITE);
                    performanceIndex.setBounds(380, 431, 120, 30);
                    performanceIndex.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(performanceIndex);

                    tutorDataFrame.getContentPane().add(panel); // Add panel to the frame's content pane
                    tutorDataFrame.setSize(900, 550);
                    tutorDataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    tutorDataFrame.setLocationRelativeTo(null); // Center the frame
                    tutorDataFrame.setVisible(true);

                    clearInputFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Teacher ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input format for teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource() == clearButtonOfDisplayTutorData){
            clearInputFields();
        }
        
        if (e.getSource() == displayLecturerButton) {
            try {
                int teacherId = Integer.parseInt(teacherIDFieldDisplayLecturerData.getText());
                Teacher lecturer = null;
        
                // Find lecturer by ID 
                for (Teacher teacher : teachersList) {
                    if (teacher.getTeacherId() == teacherId && teacher instanceof Lecturer) {
                        lecturer = teacher;
                        break;
                    }
                }
        
                if (lecturer != null) {
                    JFrame lecturerDataFrame = new JFrame("Lecturer Data");
                    
                    JPanel panel = new JPanel();
                    panel.setBackground(Color.BLACK);
                    panel.setLayout(null);

                    JLabel heading = new JLabel("Teacher Details");
                    heading.setForeground(Color.WHITE);
                    heading.setFont(new Font("Arial", Font.BOLD, 20)); 
                    heading.setBounds(271, 54, 358, 57);
                    panel.add(heading);

                    JLabel IDLabel = new JLabel("Teacher ID: ");
                    IDLabel.setForeground(Color.WHITE); 
                    IDLabel.setBounds(200, 170, 120, 30);
                    IDLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(IDLabel);

                    JLabel nameLabel = new JLabel("Teacher Name: ");
                    nameLabel.setForeground(Color.WHITE); 
                    nameLabel.setBounds(200, 199, 120, 30);
                    nameLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(nameLabel);

                    JLabel addressLabel = new JLabel("Address : ");
                    addressLabel.setForeground(Color.WHITE); 
                    addressLabel.setBounds(200, 228, 120, 30);
                    addressLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(addressLabel);

                    JLabel workingTypeLabel = new JLabel("Working Type: ");
                    workingTypeLabel.setForeground(Color.WHITE); 
                    workingTypeLabel.setBounds(200, 257, 200, 30);
                    workingTypeLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(workingTypeLabel);

                    JLabel employmentStatusLabel = new JLabel("Employment Status: ");
                    employmentStatusLabel.setForeground(Color.WHITE); 
                    employmentStatusLabel.setBounds(200, 286, 200, 30);
                    employmentStatusLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    panel.add(employmentStatusLabel);

                    JLabel workingHoursLabel = new JLabel("Working Hours: ");
                    workingHoursLabel.setForeground(Color.WHITE); 
                    workingHoursLabel.setBounds(200, 315, 120, 30);
                    workingHoursLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(workingHoursLabel);

                    JLabel departmentLabel = new JLabel("Department: ");
                    departmentLabel.setForeground(Color.WHITE); 
                    departmentLabel.setBounds(200, 344, 120, 30);
                    departmentLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(departmentLabel);

                    JLabel yearsOfExperienceLabel = new JLabel("Years of Experience: ");
                    yearsOfExperienceLabel.setForeground(Color.WHITE); 
                    yearsOfExperienceLabel.setBounds(200, 373, 200, 30);
                    yearsOfExperienceLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(yearsOfExperienceLabel);

                    JLabel GradedAssignments = new JLabel("Graded Assignments: ");
                    GradedAssignments.setForeground(Color.WHITE);
                    GradedAssignments.setBounds(200, 402, 200, 30);
                    GradedAssignments.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(GradedAssignments);

                    JLabel teacherID = new JLabel(Integer.toString(lecturer.getTeacherId()));
                    teacherID.setForeground(Color.WHITE); 
                    teacherID.setBounds(410, 170, 120, 30);
                    teacherID.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(teacherID);

                    JLabel teacherName = new JLabel(lecturer.getTeacherName());
                    teacherName.setForeground(Color.WHITE); 
                    teacherName.setBounds(380, 199, 200, 30);
                    teacherName.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(teacherName);

                    JLabel address = new JLabel(lecturer.getAddress());
                    address.setForeground(Color.WHITE); 
                    address.setBounds(380, 228, 300, 30);
                    address.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(address);

                    JLabel workingType = new JLabel(lecturer.getWorkingType());
                    workingType.setForeground(Color.WHITE); 
                    workingType.setBounds(380, 257, 120, 30);
                    workingType.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(workingType);

                    JLabel employmentStatus = new JLabel(lecturer.getEmploymentStatus());
                    employmentStatus.setForeground(Color.WHITE); 
                    employmentStatus.setBounds(380, 286, 120, 30);
                    employmentStatus.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(employmentStatus);

                    JLabel workingHours = new JLabel(Integer.toString(lecturer.getWorkingHours()));
                    workingHours.setForeground(Color.WHITE); 
                    workingHours.setBounds(380, 315, 120, 30);
                    workingHours.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(workingHours);

                    JLabel department = new JLabel(((Lecturer) lecturer).getDepartment());
                    department.setForeground(Color.WHITE); 
                    department.setBounds(380, 344, 200, 30);
                    department.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(department);

                    JLabel yearsOfExperience = new JLabel(Integer.toString(((Lecturer) lecturer).getYearsOfExperience()));
                    yearsOfExperience.setForeground(Color.WHITE);
                    yearsOfExperience.setBounds(380, 373, 120, 30);
                    yearsOfExperience.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(yearsOfExperience);

                    if (((Lecturer) lecturer).getHasGraded()) {
                        JLabel gradedScoreLabel = new JLabel(String.valueOf(((Lecturer) lecturer).getGradedScore()));
                        gradedScoreLabel.setForeground(Color.WHITE); 
                        gradedScoreLabel.setBounds(380, 402, 120, 30);
                        gradedScoreLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                        panel.add(gradedScoreLabel);
                    } else {
                        JLabel gradedScoreLabel = new JLabel("Assignments not yet graded.");
                        gradedScoreLabel.setForeground(Color.WHITE);
                        gradedScoreLabel.setBounds(380, 402, 300, 30);
                        gradedScoreLabel.setFont(new Font("Arial", Font.BOLD, 15));
                        panel.add(gradedScoreLabel);
                    }
                    
                    lecturerDataFrame.getContentPane().add(panel); 
                    lecturerDataFrame.setSize(900, 550);
                    lecturerDataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    lecturerDataFrame.setLocationRelativeTo(null); 
                    lecturerDataFrame.setVisible(true);

                    clearInputFields();

                } else {
                    JOptionPane.showMessageDialog(null, "Teacher ID not found or is not a lecturer.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input format for teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource() == clearButtonOfDisplayLecturer){
            clearInputFields();
        }
        
        if (e.getSource() == displayTutorSalaryButton) {
            try {
                int teacherId = Integer.parseInt(teacherIDFieldOfDisplayTutorSalary.getText());
                Tutor tutor = null;
        
                // Find tutor by ID
                for (Teacher teacher : teachersList) {
                    if (teacher.getTeacherId() == teacherId && teacher instanceof Tutor) {
                        tutor = (Tutor) teacher;
                        break;
                    }
                }
        
                if (tutor != null) {
                    JFrame displaySalaryFrame = new JFrame("Tutor Salary");
                    
                    JPanel panel = new JPanel();
                    panel.setBackground(Color.BLACK);
                    displaySalaryFrame.add(panel);
                    panel.setLayout(null);

                    JLabel heading = new JLabel("Teacher Salary");
                    heading.setForeground(Color.WHITE); 
                    heading.setFont(new Font("Arial", Font.BOLD, 20)); 
                    heading.setBounds(300, 150, 358, 57);
                    panel.add(heading);

                    JLabel IDLabel = new JLabel("Teacher ID: ");
                    IDLabel.setForeground(Color.WHITE); 
                    IDLabel.setBounds(310, 231, 120, 30);
                    IDLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(IDLabel);

                    JLabel nameLabel = new JLabel("Teacher Name: ");
                    nameLabel.setForeground(Color.WHITE); 
                    nameLabel.setBounds(310, 260, 120, 30);
                    nameLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(nameLabel);

                    JLabel salaryLabel = new JLabel("Salary: ");
                    salaryLabel.setForeground(Color.WHITE); 
                    salaryLabel.setBounds(310, 289, 120, 30);
                    salaryLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(salaryLabel);

                    JLabel teacherID = new JLabel(Integer.toString(tutor.getTeacherId()));
                    teacherID.setForeground(Color.WHITE); 
                    teacherID.setBounds(469, 231, 120, 30);
                    teacherID.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(teacherID);

                    JLabel teacherName = new JLabel(tutor.getTeacherName());
                    teacherName.setForeground(Color.WHITE); 
                    teacherName.setBounds(469, 260, 200, 30);
                    teacherName.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(teacherName);

                    JLabel salary = new JLabel(Double.toString(tutor.getSalary()));
                    salary.setForeground(Color.WHITE); 
                    salary.setBounds(469, 289, 200, 30);
                    salary.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(salary);
        
                    displaySalaryFrame.getContentPane().add(panel); 
                    displaySalaryFrame.setSize(900, 550);
                    displaySalaryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    displaySalaryFrame.setLocationRelativeTo(null); 
                    displaySalaryFrame.setVisible(true);

                    clearInputFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Teacher ID not found or not a Tutor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input format for teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource() == clearButtonOfDisplayTutorSalary){
            clearInputFields();
        }

        if (e.getSource() == displayGradeAssignmentButton) {
            try {
                int teacherId = Integer.parseInt(teacherIDFieldOfDisplayGradedAssignment.getText());
                Lecturer lecturer = null;
        
                // Find teacher by ID
                for (Teacher teacher : teachersList) {
                    if (teacher.getTeacherId() == teacherId && teacher instanceof Lecturer) {
                        lecturer = (Lecturer) teacher;
                        break;
                    }
                }
                
                if (lecturer != null) {
                    JFrame gradedFrame = new JFrame("Graded Assignments");
                    
                    JPanel panel = new JPanel();
                    panel.setBackground(Color.BLACK);
                    panel.setLayout(null);

                    JLabel heading = new JLabel("Graded Assignments");
                    heading.setForeground(Color.WHITE);
                    heading.setFont(new Font("Arial", Font.BOLD, 20)); 
                    heading.setBounds(300, 150, 358, 57);
                    panel.add(heading);

                    JLabel IDLabel = new JLabel("Teacher ID: ");
                    IDLabel.setForeground(Color.WHITE); 
                    IDLabel.setBounds(310, 231, 120, 30);
                    IDLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(IDLabel);

                    JLabel nameLabel = new JLabel("Teacher Name: ");
                    nameLabel.setForeground(Color.WHITE); 
                    nameLabel.setBounds(310, 260, 300, 30);
                    nameLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(nameLabel);

                    JLabel gradedScoreLabel = new JLabel("Graded Score: ");
                    gradedScoreLabel.setForeground(Color.WHITE); 
                    gradedScoreLabel.setBounds(310, 289, 120, 30);
                    gradedScoreLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(gradedScoreLabel);

                    JLabel teacherIDLabel = new JLabel(Integer.toString(lecturer.getTeacherId()));
                    teacherIDLabel.setForeground(Color.WHITE); 
                    teacherIDLabel.setBounds(469, 231, 120, 30);
                    teacherIDLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(teacherIDLabel);

                    JLabel teacherNameLabel = new JLabel(lecturer.getTeacherName());
                    teacherNameLabel.setForeground(Color.WHITE); 
                    teacherNameLabel.setBounds(469, 260, 200, 30);
                    teacherNameLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
                    panel.add(teacherNameLabel);

                    if (lecturer.getHasGraded()) {
                        JLabel gradedScore = new JLabel(Integer.toString((lecturer.getGradedScore())));
                        gradedScore.setForeground(Color.WHITE); 
                        gradedScore.setBounds(469, 289, 120, 30);
                        gradedScore.setFont(new Font("Arial", Font.BOLD, 15)); 
                        panel.add(gradedScore);
                    }else {
                        JLabel gradedScore = new JLabel("Assignments not yet graded.");
                        gradedScore.setForeground(Color.WHITE); 
                        gradedScore.setBounds(469, 289, 300, 30);
                        gradedScore.setFont(new Font("Arial", Font.BOLD, 15)); 
                        panel.add(gradedScore);
                    }
                    
                    gradedFrame.getContentPane().add(panel); 
                    gradedFrame.setSize(900, 550);
                    gradedFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    gradedFrame.setLocationRelativeTo(null); 
                    gradedFrame.setVisible(true);

                    clearInputFields();

                }else {
                    JOptionPane.showMessageDialog(null, "Teacher ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input format for teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource() == clearButtonOfDisplayGradeAssignment){
            clearInputFields();
        }
    }
         
    // Main Method
    public static void main(String[] args) {
        new TeacherGUI();
    }
}
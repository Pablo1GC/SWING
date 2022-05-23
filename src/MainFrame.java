import javax.swing.*;

public class MainFrame extends  JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JLabel lblWelcome;
    private JPanel mainPanel;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("Hol");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
    }
}

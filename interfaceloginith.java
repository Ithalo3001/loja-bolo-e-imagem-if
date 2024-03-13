
public class interfacelogin {
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginProgram extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginProgram() {
        super("Login Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Criando componentes
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        JButton okButton = new JButton("OK");

        // Adicionando componentes ao painel
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(okButton);

        // Adicionando o painel ao frame
        add(panel);

        // Criando o listener para o botão OK
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                JOptionPane.showMessageDialog(LoginProgram.this, "Username: " + username + "\nPassword: " + password);
            }
        });

        pack();
        setLocationRelativeTo(null); // Centralizar o frame na tela
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginProgram().setVisible(true);
            }
        });
    }
}

}

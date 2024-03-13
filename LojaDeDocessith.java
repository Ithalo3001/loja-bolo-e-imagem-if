
public class LojaDeDocesith {
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VendaDoces extends JFrame {
    private JLabel labelTitulo, labelQuantidade, labelTotal;
    private JTextField campoQuantidade;
    private JButton botaoPedir;

    public VendaDoces() {
        setTitle("Venda de Doces");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        labelTitulo = new JLabel("Bem-vindo à loja de doces!");
        labelQuantidade = new JLabel("Quantidade:");
        campoQuantidade = new JTextField();
        botaoPedir = new JButton("Pedir");
        labelTotal = new JLabel();

        panel.add(labelTitulo);
        panel.add(labelQuantidade);
        panel.add(campoQuantidade);
        panel.add(botaoPedir);
        panel.add(labelTotal);

        add(panel);

        botaoPedir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularTotal();
            }
        });
    }

    private void calcularTotal() {
        try {
            int quantidade = Integer.parseInt(campoQuantidade.getText());
            double precoUnitario = 1.50; // Preço de cada doce
            double total = quantidade * precoUnitario;
            labelTotal.setText("Total da compra: R$ " + String.format("%.2f", total));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma quantidade válida.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VendaDoces().setVisible(true);
            }
        });
    }
}

}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBinario {
    private JPanel VentanaBinario;
    private JLabel Label1;
    private JButton BotonTransformar;
    private JTextArea textArea1;
    private JTextField textField1;

    public VentanaBinario() {
        BotonTransformar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Binario binario1 = new Binario();
                Pila pila = binario1.TransformarBinario(Integer.parseInt(textField1.getText()));
                textArea1.setText(pila.toString());

               String binario= pila.sacar();
               JOptionPane.showMessageDialog(null,"El numero en binario es: "+binario);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaBinario");
        frame.setContentPane(new VentanaBinario().VentanaBinario);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

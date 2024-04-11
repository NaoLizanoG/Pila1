import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*public class Ventana {

    private JPanel Ventana;
    private JTextField textnNumero;
    private JButton apliarButton;
    private JButton desapilarButton;
    private JButton cimaButton;
    private JButton buscarButton;
    private JTextArea textArea1;
    private Pila pila = new Pila();

    public Ventana() {
        apliarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pila.apilar(Integer.parseInt(textnNumero.getText()));
                textArea1.setText(pila.toString());
                textnNumero.setText(""); //LIMPIA EL CAMPO DE TEXTO

            }
        });
        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    JOptionPane.showMessageDialog(null, "Elemento desapilado: " + pila.desapilar());
                    textArea1.setText(pila.toString());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

        }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int indice = pila.buscarElemento(Integer.parseInt(textnNumero.getText()));

                    if (pila.buscarElemento(Integer.parseInt(textnNumero.getText())) == -1) {
                        JOptionPane.showMessageDialog(null, "Elemento no encontrado");

                    } else {
                        JOptionPane.showMessageDialog(null, "El elementon: " + textnNumero.getText() + "seencuentra en la posicion" + indice);
                    }
                }
            catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    public static void main(String[] args) {

        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    }
    }*/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel ventana;
    private JTextField textNumero;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JButton cimaButton;
    private JButton buscarButton;
    private JTextArea textArea1;
    private Pila pila = new Pila();

    public Ventana(){

        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pila.apilar(Integer.parseInt(textNumero.getText()));
                textArea1.setText(pila.toString());
                textNumero.setText("");
            }
        });
        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    JOptionPane.showMessageDialog(null,"El dato sacado es "+pila.desapilar());
                    textArea1.setText(pila.toString());
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        cimaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    JOptionPane.showMessageDialog(null,"El dato de la cima es "+pila.cima());
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int indice = pila.buscarElemento(Integer.parseInt(textNumero.getText()));
                    if(indice == -1){
                        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
                    }else
                        JOptionPane.showMessageDialog(null, "El elemento "+textNumero.getText()+
                                "se encuentra en la posicion "+indice);
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(null, exc.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}



import javax.swing.*;

public class AttAcai {
    public static void main(String[] args) {
        Double sorvete = 2.0;

        Acai acai1 = new Acai();
        Acai acai2 = new Acai();
        Acai acai3 = new Acai();

        acai1.tamanho = 300;
        acai2.tamanho = 500;
        acai3.tamanho = 700;

        acai1.valor = 8.0;
        acai2.valor = 10.0;
        acai3.valor = 12.0;

        String acai = JOptionPane.showInputDialog("Qual o açai que você quer? \n 1-300ml \n 2-500ml \n 3-700ml");
        if (acai.equals("300") || acai.equals("1")) {
            acai1.complemento = JOptionPane.showInputDialog("Você vai querer sorvete?\n digite Sim ou não");
            Double valortotal = acai1.valor;
            if (acai1.complemento.equalsIgnoreCase("sim")) {
                valortotal = acai1.valor += sorvete;
                JOptionPane.showMessageDialog(null,"O valor total deu " + valortotal);
            } else
                JOptionPane.showMessageDialog(null,"O valor total deu " + valortotal);

        }
        else if (acai.equals("500") || acai.equals("2")) {
            acai1.complemento = JOptionPane.showInputDialog("Você vai querer sorvete?\n digite Sim ou não");
            Double valortotal = acai2.valor;
            if (acai1.complemento.equalsIgnoreCase("sim")) {
                valortotal = acai2.valor += sorvete;
                JOptionPane.showMessageDialog(null,"O valor total deu " + valortotal);
            } else
                JOptionPane.showMessageDialog(null,"O valor total deu " + valortotal);
        }
        else if (acai.equals("700") || acai.equals("3")) {
            acai1.complemento = JOptionPane.showInputDialog("Você vai querer sorvete?\n digite Sim ou não");
            Double valortotal = acai3.valor;
            if (acai1.complemento.equalsIgnoreCase("sim")) {
                valortotal = acai3.valor += sorvete;
                JOptionPane.showMessageDialog(null,"O valor total deu " + valortotal);
            } else
                JOptionPane.showMessageDialog(null,"O valor total deu " + valortotal);
        }
        else
            JOptionPane.showMessageDialog(null,"Opção não encontrada");
    }
}
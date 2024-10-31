package tela;

import javax.swing.*;
import java.awt.*;

public class ModeloTela {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("AWT Test"); // Cria uma janela com o nome AWT Test
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200); // define os tamanhos das janelas
		frame.setLayout(new BorderLayout()); //Define o Layout da janela
		
		JLabel label1 = new JLabel("Label1"); // adiciona um campo de texto com a legenda "Label1"
		JTextField textField1 = new JTextField(15); //Parte de inseir o texto
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.add(label1); // adiciona a informacao de label1 na tela
		topPanel.add(textField1); // adicona a informacao de textFild1 na tela 
		
		// Cria 03 botões com textos
		JButton button1 = new JButton("Button1"); // Botão 01
		JButton button2 = new JButton("Button2"); // Botão 02
		JButton button3 = new JButton("Button3"); // Botão 03

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout());
		bottomPanel.add(button1); // Adiciona o botão na tela
		bottomPanel.add(button2); // adiociona o botão na tela
		bottomPanel.add(button3); // Adiciona o botão na tela
		
		// Configura os paines
		frame.add(topPanel, BorderLayout.NORTH); 
		frame.add(bottomPanel, BorderLayout.CENTER);
		
		frame.setVisible(true); // faz ser possivel aparecer a janela
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseWordsOfSentence extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseWordsOfSentence frame = new ReverseWordsOfSentence();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReverseWordsOfSentence() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reverse Words of Sentence");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(101, 10, 210, 19);
		contentPane.add(lblNewLabel);
		
		JLabel label2 = new JLabel("Enter a Sentence");
		label2.setForeground(new Color(128, 128, 0));
		label2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label2.setBounds(34, 78, 121, 15);
		contentPane.add(label2);
		
		JTextArea txta1 = new JTextArea();
		txta1.setBounds(196, 74, 176, 19);
		contentPane.add(txta1);
		
		JTextArea txta2 = new JTextArea();
		txta2.setBounds(196, 175, 176, 19);
		contentPane.add(txta2);
		
		JButton btn1 = new JButton("Reverse Sentence");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence = txta1.getText();
				char[] arr = sentence.toCharArray();
				String reverse = " ";
				
				for(int i=arr.length-1; i>=0; i--)
				{
					reverse = reverse + arr[i];
				}
				txta2.setText(reverse);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(123, 123, 163, 25);
		contentPane.add(btn1);
		
		JLabel label3 = new JLabel("Reversed Sentence");
		label3.setForeground(new Color(128, 128, 0));
		label3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label3.setBounds(34, 175, 121, 15);
		contentPane.add(label3);
		
		
	}
}

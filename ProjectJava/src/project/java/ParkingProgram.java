package project.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.Rectangle;
import java.awt.Component;
import java.awt.Insets;

public class ParkingProgram extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNo;
	private JTextField textcheckout;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingProgram frame = new ParkingProgram();
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
	public ParkingProgram() {
		setResizable(false);
		setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 5, 1080, 760);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFghgfhfh = new JLabel("Parking Program");
		lblFghgfhfh.setFont(new Font("Vineta BT", Font.PLAIN, 29));
		lblFghgfhfh.setHorizontalAlignment(SwingConstants.CENTER);
		lblFghgfhfh.setBounds(361, 10, 410, 71);
		contentPane.add(lblFghgfhfh);
		
		txtNo = new JTextField();
		txtNo.setMargin(new Insets(2, 5, 2, 2));
		txtNo.setEditable(false);
		txtNo.setHorizontalAlignment(SwingConstants.LEFT);
		txtNo.setForeground(new Color(0, 0, 0));
		txtNo.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		txtNo.setText("xxxxx");
		txtNo.setBounds(890, 84, 96, 37);
		contentPane.add(txtNo);
		txtNo.setColumns(10);
		
		JLabel lblNo = new JLabel("No :");
		lblNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo.setForeground(new Color(0, 0, 0));
		lblNo.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		lblNo.setBounds(833, 88, 45, 30);
		contentPane.add(lblNo);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.RED);
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setFont(new Font("AngsanaUPC", Font.PLAIN, 25));
		textPane.setEditable(false);
		textPane.setText("\r\nการคิดค่าจอดรถ ให้เป็นดังนี้\r\n     - 6 ชม.แรก คิดค่าจอดรถ 20 บาทต่อชม. เศษของชม.มากกว่า 30 นาที ปัดขึ้น เป็น 1 ชม. ถ้าน้อยกว่า ปัดทิ้ง\r\n     - จอดรถมากกว่า 6 ชม. คิดค่าจอดรถชั่วโมงที่เกิน 6 ชั่งโมงแรก เป็นชั่วโมงละ 30 บาท เศษมากกว่า 20 นาทีปัดขึ้น น้อยกว่าหรือเท่ากับ 20 นาที ปัดทิ้ง\r\n     - จอดรถมากกว่า 24 ชม. คิดค่าจอดเป็นวัน วันละ 550 บาท เศษชม. ที่เหลือใช้ตามกฎข้างต้น");
		textPane.setBounds(668, 319, 368, 342);
		contentPane.add(textPane);
		
		JPanel checkIn = new JPanel();
		checkIn.setBounds(40, 119, 587, 287);
		contentPane.add(checkIn);
		checkIn.setLayout(null);
		
		JRadioButton rdbtnRealTime = new JRadioButton("Real time");
		rdbtnRealTime.setBounds(36, 20, 103, 21);
		checkIn.add(rdbtnRealTime);
		rdbtnRealTime.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		rdbtnRealTime.setForeground(new Color(0, 0, 0));
		rdbtnRealTime.setBackground(Color.WHITE);
		
		JRadioButton radioButton = new JRadioButton("Real time");
		radioButton.setBounds(36, 58, 103, 21);
		checkIn.add(radioButton);
		radioButton.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		radioButton.setForeground(new Color(0, 0, 0));
		radioButton.setBackground(Color.WHITE);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(102, 167, 45, 30);
		checkIn.add(lblId);
		lblId.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
		
		JLabel lblLicensePlate = new JLabel("License Plate :");
		lblLicensePlate.setBounds(25, 208, 113, 29);
		checkIn.add(lblLicensePlate);
		lblLicensePlate.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
		
		JButton btnOk = new JButton("OK");
		btnOk.setMargin(new Insets(2, 14, 6, 14));
		btnOk.setBounds(381, 247, 85, 30);
		checkIn.add(btnOk);
		btnOk.setForeground(new Color(0, 0, 0));
		btnOk.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 102, 185, 30);
		checkIn.add(textField_1);
		textField_1.setMargin(new Insets(2, 4, 3, 2));
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(157, 167, 185, 30);
		checkIn.add(textField_2);
		textField_2.setMargin(new Insets(2, 4, 3, 2));
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(158, 53, 185, 30);
		checkIn.add(textField);
		textField.setMargin(new Insets(2, 4, 3, 2));
		textField.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		textField.setForeground(new Color(0, 0, 0));
		textField.setColumns(10);
		
		JLabel lblCheckIn = new JLabel("Check in");
		lblCheckIn.setBounds(36, 133, 78, 24);
		checkIn.add(lblCheckIn);
		lblCheckIn.setForeground(Color.RED);
		lblCheckIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckIn.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		
		textField_4 = new JTextField();
		textField_4.setMargin(new Insets(2, 4, 3, 2));
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		textField_4.setColumns(10);
		textField_4.setBounds(157, 207, 185, 30);
		checkIn.add(textField_4);
		
		JPanel CheckOut = new JPanel();
		CheckOut.setBounds(40, 416, 587, 295);
		contentPane.add(CheckOut);
		CheckOut.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setBounds(116, 71, 185, 30);
		CheckOut.add(textField_3);
		textField_3.setMargin(new Insets(2, 4, 3, 2));
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		textField_3.setColumns(10);
		
		textcheckout = new JTextField();
		textcheckout.setBounds(33, 121, 528, 112);
		CheckOut.add(textcheckout);
		textcheckout.setColumns(10);
		
		JButton bsearch = new JButton("Search");
		bsearch.setMargin(new Insets(1, 14, 6, 14));
		bsearch.setBounds(311, 71, 103, 30);
		CheckOut.add(bsearch);
		bsearch.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
		
		JLabel lblCheckOut = new JLabel("Check out");
		lblCheckOut.setBounds(33, 10, 83, 36);
		CheckOut.add(lblCheckOut);
		lblCheckOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckOut.setForeground(Color.RED);
		lblCheckOut.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		
		JLabel Search = new JLabel("Search :");
		Search.setBounds(45, 66, 103, 30);
		CheckOut.add(Search);
		Search.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
	}
}

package project.java;

import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.JComboBox;

public class ParkingProgram extends JFrame {

	private JPanel contentPane;
	private JTextField textUsertime;
	private JTextField textNo;
	private JTextField textID;
	private JTextField textSearch;
	private JTextField textLicense;

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
	 ParkingProgram() {
		
		Time time = new Time();
	
		
		setResizable(false);
		setTitle("Parking Program");
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
		
		textNo = new JTextField();
		textNo.setMargin(new Insets(2, 5, 2, 2));
		textNo.setEditable(false);
		textNo.setHorizontalAlignment(SwingConstants.LEFT);
		textNo.setForeground(new Color(0, 0, 0));
		textNo.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		textNo.setText("xxxxx");
		textNo.setBounds(890, 84, 96, 37);
		contentPane.add(textNo);
		textNo.setColumns(10);
		
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
		checkIn.setBounds(40, 108, 587, 287);
		contentPane.add(checkIn);
		checkIn.setLayout(null);
		
		// radio real time
		JRadioButton rRealTime = new JRadioButton("Real time");
		rRealTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textUsertime.setEnabled(false);	
				time.setChooseTime(1);
				System.out.println(time.getChooseTime());
			}
		});
		rRealTime.setBounds(22, 20, 103, 21);
		checkIn.add(rRealTime);
		rRealTime.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		rRealTime.setForeground(new Color(0, 0, 0));
		rRealTime.setBackground(Color.WHITE);
		rRealTime.setSelected(true);
		
		
		// radio user time
		JRadioButton rUsertime = new JRadioButton("User time :");
		rUsertime.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent arg0) {
				textUsertime.setEnabled(true);
				time.setChooseTime(2);
				System.out.println(time.getChooseTime());
				}
		});
		rUsertime.setBounds(22, 58, 117, 21);
		checkIn.add(rUsertime);
		rUsertime.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		rUsertime.setForeground(new Color(0, 0, 0));
		rUsertime.setBackground(Color.WHITE);
		rUsertime.setSelected(false);
		
		
		
		
		
		
		// set groub radio
		ButtonGroup groub = new ButtonGroup();
		groub.add(rUsertime);
		groub.add(rRealTime);
		
		
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(99, 145, 45, 30);
		checkIn.add(lblId);
		lblId.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
		
		JLabel lblLicensePlate = new JLabel("License Plate :");
		lblLicensePlate.setBounds(22, 186, 113, 29);
		checkIn.add(lblLicensePlate);
		lblLicensePlate.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
		
		JButton bOk = new JButton("OK");
		bOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				JOptionPane.showMessageDialog(null, "susseed full , thank you.\n"+time.getToday()+"");
			
			}
		});
		bOk.setMargin(new Insets(2, 14, 6, 14));
		bOk.setBounds(451, 234, 85, 30);
		checkIn.add(bOk);
		bOk.setForeground(new Color(0, 0, 0));
		bOk.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
		
		textID = new JTextField();
		textID.setBounds(154, 143, 185, 35);
		checkIn.add(textID);
		textID.setMargin(new Insets(1, 4, 3, 2));
		textID.setForeground(Color.BLACK);
		textID.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		textID.setColumns(10);
		
		textUsertime = new JTextField();
		textUsertime.setBounds(154, 51, 185, 35);
		checkIn.add(textUsertime);
		textUsertime.setMargin(new Insets(1, 4, 3, 2));
		textUsertime.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		textUsertime.setForeground(new Color(0, 0, 0));
		textUsertime.setColumns(10);
		textUsertime.setEnabled(false);
		
		JLabel lblCheckIn = new JLabel("Check in");
		lblCheckIn.setBounds(33, 111, 78, 24);
		checkIn.add(lblCheckIn);
		lblCheckIn.setForeground(Color.RED);
		lblCheckIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckIn.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		
		textLicense = new JTextField();
		textLicense.setMargin(new Insets(1, 4, 3, 2));
		textLicense.setForeground(Color.BLACK);
		textLicense.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		textLicense.setColumns(10);
		textLicense.setBounds(154, 183, 185, 35);
		checkIn.add(textLicense);
		
		JButton bClear = new JButton("CLEAR");
		bClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textUsertime.setText(null);
				textID.setText(null);
				textLicense.setText(null);
			}
		});
		bClear.setMargin(new Insets(2, 14, 6, 14));
		bClear.setForeground(Color.BLACK);
		bClear.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
		bClear.setBounds(302, 234, 106, 30);
		checkIn.add(bClear);
		
		JPanel CheckOut = new JPanel();
		CheckOut.setBounds(40, 416, 587, 295);
		contentPane.add(CheckOut);
		CheckOut.setLayout(null);
		
		textSearch = new JTextField();
		textSearch.setBounds(116, 71, 185, 35);
		CheckOut.add(textSearch);
		textSearch.setMargin(new Insets(1, 4, 3, 2));
		textSearch.setForeground(Color.BLACK);
		textSearch.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		textSearch.setColumns(10);
		
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
		
		JButton bChevkOut = new JButton("Check out");
		bChevkOut.setMargin(new Insets(1, 14, 6, 14));
		bChevkOut.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
		bChevkOut.setBounds(444, 260, 117, 30);
		CheckOut.add(bChevkOut);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setMargin(new Insets(3, 6, 3, 3));
		textPane_1.setFont(new Font("AngsanaUPC", Font.PLAIN, 28));
		textPane_1.setBounds(33, 116, 528, 135);
		CheckOut.add(textPane_1);
	}
}

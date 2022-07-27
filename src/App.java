import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class App extends JFrame {

	private JPanel contentPane;
	private JTextField mm;
	private JTextField cm;
	private JTextField dm;
	private JTextField m;
	private JTextField km;
	private JTextField mile;
	private JTextField inch;
	private JTextField feet;
	private JTextField tfMsg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Main Menu");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				App home = new App();
				home.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(Color.BLUE);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(12, 499, 162, 41);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("Length Conversion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(12, 13, 458, 54);
		contentPane.add(lblNewLabel);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		exit.setBackground(Color.RED);
		exit.setBounds(341, 499, 129, 41);
		contentPane.add(exit);
		
		JButton button = new JButton("Clear");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfMsg.setText(null);
				mm.setText(null);
				cm.setText(null);
				dm.setText(null);
				m.setText(null);
				km.setText(null);
				mile.setText(null);
				inch.setText(null);
				feet.setText(null);
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBackground(new Color(0, 100, 0));
		button.setBounds(200, 499, 129, 41);
		contentPane.add(button);
		
		JButton btnMm = new JButton("Convert");
		btnMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(mm.getText().isEmpty()) {
					tfMsg.setText("Your input is emty");
				}
				else {
					tfMsg.setText(null);
					double MM = Double.parseDouble(mm.getText());
					double CM = MM/10;
					double DM = CM/10;
					double M = DM/10;
					double KM = M/1000;
					double ML= KM/1.609;
					double FT = ML*5280;
					double INCH =FT/12;
					
					String cM = String.format("%.4f", CM);
					String dM = String.format("%.4f", DM);
					String Mt = String.format("%.4f", M);
					String kM = String.format("%.4f", KM);
					String mL = String.format("%.4f", ML);
					String fT = String.format("%.4f", FT);
					String inCH = String.format("%.4f", INCH);
					
					cm.setText(cM);
					dm.setText(dM);
					m.setText(Mt);
					km.setText(kM);
					mile.setText(mL);
					feet.setText(fT);
					inch.setText(inCH);
					
					
					
				}
			}
		});
		btnMm.setForeground(Color.YELLOW);
		btnMm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMm.setBackground(new Color(25, 25, 112));
		btnMm.setBounds(359, 80, 100, 40);
		contentPane.add(btnMm);
		
		JLabel lblNewLabel_1 = new JLabel("Millimeter");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(20, 80, 107, 40);
		contentPane.add(lblNewLabel_1);
		
		mm = new JTextField();
		mm.setHorizontalAlignment(SwingConstants.CENTER);
		mm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mm.setBounds(139, 80, 147, 40);
		contentPane.add(mm);
		mm.setColumns(10);
		
		JLabel lblMm = new JLabel("mm");
		lblMm.setForeground(Color.WHITE);
		lblMm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMm.setBackground(Color.BLACK);
		lblMm.setBounds(292, 80, 55, 40);
		contentPane.add(lblMm);
		
		JLabel lblCentimeter = new JLabel("Centimeter");
		lblCentimeter.setForeground(Color.WHITE);
		lblCentimeter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCentimeter.setBackground(Color.BLACK);
		lblCentimeter.setBounds(20, 124, 107, 40);
		contentPane.add(lblCentimeter);
		
		cm = new JTextField();
		cm.setHorizontalAlignment(SwingConstants.CENTER);
		cm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cm.setColumns(10);
		cm.setBounds(139, 124, 147, 40);
		contentPane.add(cm);
		
		JLabel lblCm = new JLabel("cm");
		lblCm.setForeground(Color.WHITE);
		lblCm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCm.setBackground(Color.BLACK);
		lblCm.setBounds(292, 124, 55, 40);
		contentPane.add(lblCm);
		
		JButton btnCm = new JButton("Convert");
		btnCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cm.getText().isEmpty()) {
					tfMsg.setText("Your input is emty");
				}
				else {
					tfMsg.setText(null);
					double CM = Double.parseDouble(cm.getText());
					double MM = CM*10;
					double DM = CM/10;
					double M = DM/10;
					double KM = M/1000;
					double ML= KM/1.609;
					double FT = ML*5280;
					double INCH =FT/12;
					
					String mM = String.format("%.4f", MM);
					String dM = String.format("%.4f", DM);
					String Mt = String.format("%.4f", M);
					String kM = String.format("%.4f", KM);
					String mL = String.format("%.4f", ML);
					String fT = String.format("%.4f", FT);
					String inCH = String.format("%.4f", INCH);
					
					mm.setText(mM);
					dm.setText(dM);
					m.setText(Mt);
					km.setText(kM);
					mile.setText(mL);
					feet.setText(fT);
					inch.setText(inCH);
					
				}
			}
		});
		btnCm.setForeground(Color.YELLOW);
		btnCm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCm.setBackground(new Color(25, 25, 112));
		btnCm.setBounds(359, 124, 100, 40);
		contentPane.add(btnCm);
		
		JLabel lblMeter = new JLabel("Meter");
		lblMeter.setForeground(Color.WHITE);
		lblMeter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMeter.setBackground(Color.BLACK);
		lblMeter.setBounds(20, 169, 107, 40);
		contentPane.add(lblMeter);
		
		JLabel lblDecimeter = new JLabel("Decimeter");
		lblDecimeter.setForeground(Color.WHITE);
		lblDecimeter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDecimeter.setBackground(Color.BLACK);
		lblDecimeter.setBounds(20, 213, 107, 40);
		contentPane.add(lblDecimeter);
		
		dm = new JTextField();
		dm.setHorizontalAlignment(SwingConstants.CENTER);
		dm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dm.setColumns(10);
		dm.setBounds(139, 213, 147, 40);
		contentPane.add(dm);
		
		m = new JTextField();
		m.setHorizontalAlignment(SwingConstants.CENTER);
		m.setFont(new Font("Tahoma", Font.PLAIN, 20));
		m.setColumns(10);
		m.setBounds(139, 169, 147, 40);
		contentPane.add(m);
		
		JLabel lblM = new JLabel("m");
		lblM.setForeground(Color.WHITE);
		lblM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblM.setBackground(Color.BLACK);
		lblM.setBounds(292, 169, 55, 40);
		contentPane.add(lblM);
		
		JLabel lblDm = new JLabel("dm");
		lblDm.setForeground(Color.WHITE);
		lblDm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDm.setBackground(Color.BLACK);
		lblDm.setBounds(292, 213, 55, 40);
		contentPane.add(lblDm);
		
		JButton btnDm = new JButton("Convert");
		btnDm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dm.getText().isEmpty()) {
					tfMsg.setText("Your input is emty");
				}
				else {
					tfMsg.setText(null);
					double DM = Double.parseDouble(dm.getText());
					double CM = DM*10;
					double MM = CM*10;
					double M = DM/10;
					double KM = M/1000;
					double ML= KM/1.609;
					double FT = ML*5280;
					double INCH =FT/12;
					
					String cM = String.format("%.4f", CM);
					String mM = String.format("%.4f", MM);
					String Mt = String.format("%.4f", M);
					String kM = String.format("%.4f", KM);
					String mL = String.format("%.4f", ML);
					String fT = String.format("%.4f", FT);
					String inCH = String.format("%.4f", INCH);
					
					cm.setText(cM);
					mm.setText(mM);
					m.setText(Mt);
					km.setText(kM);
					mile.setText(mL);
					feet.setText(fT);
					inch.setText(inCH);
					
				}
			}
		});
		btnDm.setForeground(Color.YELLOW);
		btnDm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDm.setBackground(new Color(25, 25, 112));
		btnDm.setBounds(359, 213, 100, 40);
		contentPane.add(btnDm);
		
		JButton btnM = new JButton("Convert");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(m.getText().isEmpty()) {
					tfMsg.setText("Your input is emty");
				}
				else {
					tfMsg.setText(null);
					double M = Double.parseDouble(m.getText());
					double CM = M*100;
					double DM = CM/10;
					double MM = CM*10;
					double KM = M/1000;
					double ML= KM/1.609;
					double FT = ML*5280;
					double INCH =FT/12;
					
					String cM = String.format("%.4f", CM);
					String dM = String.format("%.4f", DM);
					String Mm = String.format("%.4f", MM);
					String kM = String.format("%.4f", KM);
					String mL = String.format("%.4f", ML);
					String fT = String.format("%.4f", FT);
					String inCH = String.format("%.4f", INCH);
					
					cm.setText(cM);
					dm.setText(dM);
					mm.setText(Mm);
					km.setText(kM);
					mile.setText(mL);
					feet.setText(fT);
					inch.setText(inCH);
					
				}
			}
		});
		btnM.setForeground(Color.YELLOW);
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnM.setBackground(new Color(25, 25, 112));
		btnM.setBounds(359, 169, 100, 40);
		contentPane.add(btnM);
		
		JLabel lblKilometer = new JLabel("Kilometer");
		lblKilometer.setForeground(Color.WHITE);
		lblKilometer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblKilometer.setBackground(Color.BLACK);
		lblKilometer.setBounds(20, 260, 107, 40);
		contentPane.add(lblKilometer);
		
		km = new JTextField();
		km.setHorizontalAlignment(SwingConstants.CENTER);
		km.setFont(new Font("Tahoma", Font.PLAIN, 20));
		km.setColumns(10);
		km.setBounds(139, 260, 147, 40);
		contentPane.add(km);
		
		JLabel lblKm = new JLabel("km");
		lblKm.setForeground(Color.WHITE);
		lblKm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblKm.setBackground(Color.BLACK);
		lblKm.setBounds(292, 260, 55, 40);
		contentPane.add(lblKm);
		
		JButton btnKm = new JButton("Convert");
		btnKm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(km.getText().isEmpty()) {
					tfMsg.setText("Your input is emty");
				}
				else {
					tfMsg.setText(null);
					double KM = Double.parseDouble(km.getText());
					double CM = KM*100000;
					double DM = CM/10;
					double M = DM/10;
					double MM = CM*10;
					double ML= KM/1.609;
					double FT = ML*5280;
					double INCH =FT/12;
					
					String cM = String.format("%.4f", CM);
					String dM = String.format("%.4f", DM);
					String Mt = String.format("%.4f", M);
					String mM = String.format("%.4f", MM);
					String mL = String.format("%.4f", ML);
					String fT = String.format("%.4f", FT);
					String inCH = String.format("%.4f", INCH);
					
					cm.setText(cM);
					dm.setText(dM);
					m.setText(Mt);
					mm.setText(mM);
					mile.setText(mL);
					feet.setText(fT);
					inch.setText(inCH);
					
				}
			}
		});
		btnKm.setForeground(Color.YELLOW);
		btnKm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnKm.setBackground(new Color(25, 25, 112));
		btnKm.setBounds(359, 260, 100, 40);
		contentPane.add(btnKm);
		
		JButton btnMile = new JButton("Convert");
		btnMile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mile.getText().isEmpty()) {
					tfMsg.setText("Your input is emty");
				}
				else {
					tfMsg.setText(null);
					double ML = Double.parseDouble(mile.getText());
					double CM = ML*160934;
					double DM = CM/10;
					double M = DM/10;
					double KM = M/1000;
					double MM= CM*10;
					double FT = ML*5280;
					double INCH =FT/12;
					
					String cM = String.format("%.4f", CM);
					String dM = String.format("%.4f", DM);
					String Mt = String.format("%.4f", M);
					String kM = String.format("%.4f", KM);
					String mM = String.format("%.4f", MM);
					String fT = String.format("%.4f", FT);
					String inCH = String.format("%.4f", INCH);
					
					cm.setText(cM);
					dm.setText(dM);
					m.setText(Mt);
					km.setText(kM);
					mm.setText(mM);
					feet.setText(fT);
					inch.setText(inCH);
					
				}
			}
		});
		btnMile.setForeground(Color.YELLOW);
		btnMile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMile.setBackground(new Color(25, 25, 112));
		btnMile.setBounds(359, 304, 100, 40);
		contentPane.add(btnMile);
		
		JLabel lblMile_1 = new JLabel("mile");
		lblMile_1.setForeground(Color.WHITE);
		lblMile_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMile_1.setBackground(Color.BLACK);
		lblMile_1.setBounds(292, 304, 55, 40);
		contentPane.add(lblMile_1);
		
		mile = new JTextField();
		mile.setHorizontalAlignment(SwingConstants.CENTER);
		mile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mile.setColumns(10);
		mile.setBounds(139, 304, 147, 40);
		contentPane.add(mile);
		
		JLabel lblMile = new JLabel("Mile");
		lblMile.setForeground(Color.WHITE);
		lblMile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMile.setBackground(Color.BLACK);
		lblMile.setBounds(20, 304, 107, 40);
		contentPane.add(lblMile);
		
		JLabel lblFeet = new JLabel("Feet");
		lblFeet.setForeground(Color.WHITE);
		lblFeet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFeet.setBackground(Color.BLACK);
		lblFeet.setBounds(20, 349, 107, 40);
		contentPane.add(lblFeet);
		
		JLabel lblInchi = new JLabel("Inchi");
		lblInchi.setForeground(Color.WHITE);
		lblInchi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInchi.setBackground(Color.BLACK);
		lblInchi.setBounds(20, 393, 107, 40);
		contentPane.add(lblInchi);
		
		inch = new JTextField();
		inch.setHorizontalAlignment(SwingConstants.CENTER);
		inch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		inch.setColumns(10);
		inch.setBounds(139, 393, 147, 40);
		contentPane.add(inch);
		
		JButton btnInch = new JButton("Convert");
		btnInch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inch.getText().isEmpty()) {
					tfMsg.setText("Your input is emty");
				}
				else {
					tfMsg.setText(null);
					double INCH = Double.parseDouble(inch.getText());
					double CM = 2.54*INCH;
					double DM = CM/10;
					double M = DM/10;
					double KM = M/1000;
					double ML= KM/1.609;
					double FT = ML*5280;
					double MM =CM*10;
					
					String cM = String.format("%.4f", CM);
					String dM = String.format("%.4f", DM);
					String Mt = String.format("%.4f", M);
					String kM = String.format("%.4f", KM);
					String mL = String.format("%.4f", ML);
					String fT = String.format("%.4f", FT);
					String mM = String.format("%.4f", MM);
					
					cm.setText(cM);
					dm.setText(dM);
					m.setText(Mt);
					km.setText(kM);
					mile.setText(mL);
					feet.setText(fT);
					mm.setText(mM);
					
				}
			}
		});
		btnInch.setForeground(Color.YELLOW);
		btnInch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnInch.setBackground(new Color(25, 25, 112));
		btnInch.setBounds(359, 393, 100, 40);
		contentPane.add(btnInch);
		
		JLabel lblFt = new JLabel("inch");
		lblFt.setForeground(Color.WHITE);
		lblFt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFt.setBackground(Color.BLACK);
		lblFt.setBounds(292, 393, 55, 40);
		contentPane.add(lblFt);
		
		JLabel lblFt_1 = new JLabel("ft");
		lblFt_1.setForeground(Color.WHITE);
		lblFt_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFt_1.setBackground(Color.BLACK);
		lblFt_1.setBounds(292, 349, 55, 40);
		contentPane.add(lblFt_1);
		
		JButton btnFeet = new JButton("Convert");
		btnFeet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(feet.getText().isEmpty()) {
					tfMsg.setText("Your input is emty");
				}
				else {
					tfMsg.setText(null);
					double FT = Double.parseDouble(feet.getText());
					double CM = FT*30.48;
					double DM = CM/10;
					double M = DM/10;
					double KM = M/1000;
					double ML= KM/1.609;
					double MM = CM*10;
					double INCH =FT/12;
					
					String cM = String.format("%.4f", CM);
					String dM = String.format("%.4f", DM);
					String Mt = String.format("%.4f", M);
					String kM = String.format("%.4f", KM);
					String mL = String.format("%.4f", ML);
					String mM = String.format("%.4f", MM);
					String inCH = String.format("%.4f", INCH);
					
					cm.setText(cM);
					dm.setText(dM);
					m.setText(Mt);
					km.setText(kM);
					mile.setText(mL);
					mm.setText(mM);
					inch.setText(inCH);
					
				}
			}
		});
		btnFeet.setForeground(Color.YELLOW);
		btnFeet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFeet.setBackground(new Color(25, 25, 112));
		btnFeet.setBounds(359, 349, 100, 40);
		contentPane.add(btnFeet);
		
		feet = new JTextField();
		feet.setText(null);
		feet.setHorizontalAlignment(SwingConstants.CENTER);
		feet.setFont(new Font("Tahoma", Font.PLAIN, 20));
		feet.setColumns(10);
		feet.setBounds(139, 349, 147, 40);
		contentPane.add(feet);
		
		tfMsg = new JTextField();
		tfMsg.setBackground(Color.BLACK);
		tfMsg.setHorizontalAlignment(SwingConstants.CENTER);
		tfMsg.setForeground(Color.RED);
		tfMsg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfMsg.setBounds(20, 446, 439, 40);
		contentPane.add(tfMsg);
		tfMsg.setColumns(10);
	}
}
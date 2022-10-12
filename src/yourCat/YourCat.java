package yourCat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class YourCat extends JFrame {

	private JPanel contentPane;
	private JTextField txtMoney;
	private JTextField txtSnack;
	private JTextField txtName;
	private JTextField txtBreed;
	private JTextField txtLife;
	private JTextField txtHappy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YourCat frame = new YourCat();
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
	public YourCat() {
		setBackground(new Color(81, 66, 201));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelName = new JPanel();
		panelName.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Decide your cat name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panelName.setBounds(12, 12, 310, 122);
		contentPane.add(panelName);
		panelName.setLayout(null);
		
		JButton btnNameFelix = new JButton("Félix");
		btnNameFelix.setForeground(new Color(255, 255, 255));
		btnNameFelix.setBackground(new Color(81, 66, 201));
		btnNameFelix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNameFelix.setBounds(166, 29, 117, 25);
		panelName.add(btnNameFelix);
		
		JButton btnNameBurton = new JButton("Burton");
		btnNameBurton.setForeground(new Color(255, 255, 255));
		btnNameBurton.setBackground(new Color(81, 66, 201));
		btnNameBurton.setBounds(12, 29, 117, 25);
		panelName.add(btnNameBurton);
		
		JButton btnNameBorin = new JButton("Borin");
		btnNameBorin.setForeground(new Color(255, 255, 255));
		btnNameBorin.setBackground(new Color(81, 66, 201));
		btnNameBorin.setBounds(12, 66, 117, 25);
		panelName.add(btnNameBorin);
		
		JButton btnNameAnakin = new JButton("Anakin");
		btnNameAnakin.setForeground(new Color(255, 255, 255));
		btnNameAnakin.setBackground(new Color(81, 66, 201));
		btnNameAnakin.setBounds(166, 66, 117, 25);
		panelName.add(btnNameAnakin);
		
		JPanel panelBreed = new JPanel();
		panelBreed.setBorder(new TitledBorder(null, "Decide your cat's breed", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelBreed.setBounds(12, 144, 310, 122);
		contentPane.add(panelBreed);
		panelBreed.setLayout(null);
		
		JButton btnBreedSphynx = new JButton("Sphynx");
		btnBreedSphynx.setBackground(new Color(81, 66, 201));
		btnBreedSphynx.setForeground(new Color(255, 255, 255));
		btnBreedSphynx.setBounds(12, 26, 117, 25);
		panelBreed.add(btnBreedSphynx);
		
		JButton btnBreedPersa = new JButton("Persa");
		btnBreedPersa.setBackground(new Color(81, 66, 201));
		btnBreedPersa.setForeground(new Color(255, 255, 255));
		btnBreedPersa.setBounds(171, 26, 117, 25);
		panelBreed.add(btnBreedPersa);
		
		JButton btnBreedRagdoll = new JButton("Ragdoll");
		btnBreedRagdoll.setBackground(new Color(81, 66, 201));
		btnBreedRagdoll.setForeground(new Color(255, 255, 255));
		btnBreedRagdoll.setBounds(12, 72, 117, 25);
		panelBreed.add(btnBreedRagdoll);
		
		JButton btnBreedSiames = new JButton("Siamês");
		btnBreedSiames.setBackground(new Color(81, 66, 201));
		btnBreedSiames.setForeground(new Color(255, 255, 255));
		btnBreedSiames.setBounds(171, 72, 117, 25);
		panelBreed.add(btnBreedSiames);
		
		JPanel panelShop = new JPanel();
		panelShop.setBorder(new TitledBorder(null, "Shop", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelShop.setBounds(352, 12, 310, 159);
		contentPane.add(panelShop);
		panelShop.setLayout(null);
		
		JRadioButton rdbtnCatNip = new JRadioButton("CatNip");
		rdbtnCatNip.setBounds(21, 22, 97, 23);
		panelShop.add(rdbtnCatNip);
		
		JRadioButton rdbtnPortion = new JRadioButton("Portion");
		rdbtnPortion.setBounds(21, 49, 97, 23);
		panelShop.add(rdbtnPortion);
		
		JRadioButton rdbtnToy = new JRadioButton("Toy");
		rdbtnToy.setBounds(135, 22, 149, 23);
		panelShop.add(rdbtnToy);
		
		JRadioButton rdbtnBed = new JRadioButton("Cat's bed");
		rdbtnBed.setBounds(135, 49, 149, 23);
		panelShop.add(rdbtnBed);
		
		JRadioButton rdbtnSnack = new JRadioButton("Snack");
		rdbtnSnack.setBounds(21, 76, 149, 23);
		panelShop.add(rdbtnSnack);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.setForeground(new Color(255, 255, 255));
		btnBuy.setBackground(new Color(81, 66, 201));
		btnBuy.setBounds(86, 107, 117, 25);
		panelShop.add(btnBuy);
		
		JPanel panelWallet = new JPanel();
		panelWallet.setBorder(new TitledBorder(null, "Wallet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelWallet.setBounds(352, 189, 310, 159);
		contentPane.add(panelWallet);
		panelWallet.setLayout(null);
		
		txtMoney = new JTextField();
		txtMoney.setEditable(false);
		txtMoney.setBounds(12, 24, 173, 41);
		panelWallet.add(txtMoney);
		txtMoney.setColumns(10);
		
		txtSnack = new JTextField();
		txtSnack.setEditable(false);
		txtSnack.setBounds(12, 89, 173, 47);
		panelWallet.add(txtSnack);
		txtSnack.setColumns(10);
		
		JLabel lblIconCat = new JLabel("New label");
		lblIconCat.setBounds(1, 250, 333, 316);
		contentPane.add(lblIconCat);
		lblIconCat.setIcon(new ImageIcon(YourCat.class.getResource("/image/catIcon.png")));
		
		JPanel paneProfile = new JPanel();
		paneProfile.setBorder(new TitledBorder(null, "Profile", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		paneProfile.setBounds(352, 372, 295, 153);
		contentPane.add(paneProfile);
		paneProfile.setLayout(null);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setBounds(12, 54, 114, 19);
		paneProfile.add(txtName);
		txtName.setColumns(10);
		
		txtBreed = new JTextField();
		txtBreed.setEditable(false);
		txtBreed.setBounds(12, 115, 114, 19);
		paneProfile.add(txtBreed);
		txtBreed.setColumns(10);
		
		txtLife = new JTextField();
		txtLife.setEditable(false);
		txtLife.setBounds(169, 54, 114, 19);
		paneProfile.add(txtLife);
		txtLife.setColumns(10);
		
		txtHappy = new JTextField();
		txtHappy.setEditable(false);
		txtHappy.setBounds(169, 115, 114, 19);
		paneProfile.add(txtHappy);
		txtHappy.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 27, 70, 15);
		paneProfile.add(lblName);
		
		JLabel lblBreed = new JLabel("Breed");
		lblBreed.setBounds(12, 88, 70, 15);
		paneProfile.add(lblBreed);
		
		JLabel lblLife = new JLabel("Life");
		lblLife.setBounds(174, 27, 70, 15);
		paneProfile.add(lblLife);
		
		JLabel lblNewLabel_1 = new JLabel("Happiness");
		lblNewLabel_1.setBounds(169, 85, 114, 15);
		paneProfile.add(lblNewLabel_1);
	}
}

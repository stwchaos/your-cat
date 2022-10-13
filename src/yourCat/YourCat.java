package yourCat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;

public class YourCat extends JFrame {

	private JPanel contentPane;
	private JTextField txtMoney;
	private JTextField txtName;
	private JTextField txtBreed;
	private JTextField txtHunger;
	private JTextField txtHappy;
	private JTextField txtPortion;

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

	public static void death(JTextField txtHunger, JTextField txtHappy) {

		if (Integer.valueOf(txtHunger.getText()) > 99) {
			JOptionPane.showMessageDialog(null, "Seu gato morreu :(");
			System.exit(0);
		}
		if (Integer.valueOf(txtHappy.getText()) < 0) {
			JOptionPane.showMessageDialog(null, "Seu gato morreu :(");
			System.exit(0);
		}

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
		panelName.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Decide your cat name",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panelName.setBounds(12, 12, 310, 122);
		contentPane.add(panelName);
		panelName.setLayout(null);

		JPanel panelBreed = new JPanel();
		panelBreed.setBorder(
				new TitledBorder(null, "Decide your cat's breed", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelBreed.setBounds(12, 144, 310, 122);
		contentPane.add(panelBreed);
		panelBreed.setLayout(null);

		JPanel panelShop = new JPanel();
		panelShop.setBorder(new TitledBorder(null, "Shop", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelShop.setBounds(352, 12, 310, 159);
		contentPane.add(panelShop);
		panelShop.setLayout(null);

		JRadioButton rdbtnCatNip = new JRadioButton("CatNip");
		rdbtnCatNip.setBounds(21, 22, 62, 23);
		panelShop.add(rdbtnCatNip);

		JRadioButton rdbtnPortion = new JRadioButton("Portion");
		rdbtnPortion.setBounds(21, 49, 69, 23);
		panelShop.add(rdbtnPortion);

		JRadioButton rdbtnToy = new JRadioButton("Toy");
		rdbtnToy.setBounds(135, 22, 46, 23);
		panelShop.add(rdbtnToy);

		JRadioButton rdbtnBed = new JRadioButton("Cat's bed");
		rdbtnBed.setBounds(135, 49, 81, 23);
		panelShop.add(rdbtnBed);

		JRadioButton rdbtnSnack = new JRadioButton("Snack");
		rdbtnSnack.setBounds(21, 76, 62, 23);
		panelShop.add(rdbtnSnack);

		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnSnack.isSelected()) {
					if (Integer.valueOf(txtMoney.getText()) < 15) {
						JOptionPane.showMessageDialog(null, "Dinheiros insuficiente. Mande seu gato trabalhar.");
					} else {
						txtMoney.setText(String.valueOf(Integer.valueOf(txtMoney.getText()) - 15));
						txtPortion.setText(String.valueOf(Integer.valueOf(txtPortion.getText()) + 1));
					}

				}

				if (rdbtnBed.isSelected()) {
					if (Integer.valueOf(txtMoney.getText()) < 5) {
						JOptionPane.showMessageDialog(null, "Dinheiros insuficiente. Mande seu gato trabalhar.");
					}
					txtHappy.setText(String.valueOf(Integer.valueOf(txtHappy.getText()) + 5));
					txtMoney.setText(String.valueOf(Integer.valueOf(txtMoney.getText()) - 5));
				}

				if (rdbtnToy.isSelected()) {
					if (Integer.valueOf(txtMoney.getText()) < 10) {
						JOptionPane.showMessageDialog(null, "Dinheiros insuficiente. Mande seu gato trabalhar.");
					}
					txtHappy.setText(String.valueOf(Integer.valueOf(txtHappy.getText()) + 5));
					txtMoney.setText(String.valueOf(Integer.valueOf(txtMoney.getText()) - 10));
				}

				if (rdbtnPortion.isSelected()) {
					if (Integer.valueOf(txtMoney.getText()) < 10) {
						JOptionPane.showMessageDialog(null, "Dinheiros insuficiente. Mande seu gato trabalhar.");
					}
					txtHappy.setText(String.valueOf(Integer.valueOf(txtHappy.getText()) + 5));
					txtMoney.setText(String.valueOf(Integer.valueOf(txtMoney.getText()) - 10));
				}

				if (rdbtnCatNip.isSelected()) {
					if (Integer.valueOf(txtMoney.getText()) < 5) {
						JOptionPane.showMessageDialog(null, "Dinheiros insuficiente. Mande seu gato trabalhar.");
					}
					txtHappy.setText(String.valueOf(Integer.valueOf(txtHappy.getText()) + 5));
					txtMoney.setText(String.valueOf(Integer.valueOf(txtMoney.getText()) - 5));
				}
			}
		});
		btnBuy.setForeground(new Color(255, 255, 255));
		btnBuy.setBackground(new Color(81, 66, 201));
		btnBuy.setBounds(86, 107, 117, 25);
		panelShop.add(btnBuy);

		JLabel lblNewLabel_3 = new JLabel("R$5");
		lblNewLabel_3.setForeground(new Color(128, 64, 64));
		lblNewLabel_3.setBounds(83, 26, 46, 14);
		panelShop.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("R$10");
		lblNewLabel_4.setForeground(new Color(128, 64, 64));
		lblNewLabel_4.setBounds(184, 26, 46, 14);
		panelShop.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("R$10");
		lblNewLabel_5.setForeground(new Color(128, 64, 64));
		lblNewLabel_5.setBounds(96, 53, 46, 14);
		panelShop.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("R$15");
		lblNewLabel_6.setForeground(new Color(128, 64, 64));
		lblNewLabel_6.setBounds(83, 80, 46, 14);
		panelShop.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("R$5");
		lblNewLabel_7.setForeground(new Color(128, 64, 64));
		lblNewLabel_7.setBounds(222, 53, 46, 14);
		panelShop.add(lblNewLabel_7);

		JPanel panelWallet = new JPanel();
		panelWallet.setBorder(new TitledBorder(null, "Wallet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelWallet.setBounds(352, 189, 310, 82);
		contentPane.add(panelWallet);
		panelWallet.setLayout(null);

		txtMoney = new JTextField();
		txtMoney.setHorizontalAlignment(SwingConstants.CENTER);
		txtMoney.setText("20");
		txtMoney.setEditable(false);
		txtMoney.setBounds(12, 24, 124, 41);
		panelWallet.add(txtMoney);
		txtMoney.setColumns(10);

		txtPortion = new JTextField();
		txtPortion.setText("0");
		txtPortion.setHorizontalAlignment(SwingConstants.CENTER);
		txtPortion.setEditable(false);
		txtPortion.setBounds(176, 24, 124, 41);
		panelWallet.add(txtPortion);
		txtPortion.setColumns(10);

		JLabel lblNewLabel = new JLabel("Money");
		lblNewLabel.setBounds(54, 11, 46, 14);
		panelWallet.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Snack");
		lblNewLabel_2.setBounds(221, 11, 46, 14);
		panelWallet.add(lblNewLabel_2);

		JLabel lblIconCat = new JLabel("New label");
		lblIconCat.setBounds(1, 250, 333, 316);
		contentPane.add(lblIconCat);
		lblIconCat.setIcon(new ImageIcon(YourCat.class.getResource("/image/catIcon.png")));

		JPanel paneProfile = new JPanel();
		paneProfile.setBorder(new TitledBorder(null, "Profile", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		paneProfile.setBounds(352, 401, 295, 153);
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

		txtHunger = new JTextField();
		txtHunger.setText("25");
		txtHunger.setEditable(false);
		txtHunger.setBounds(169, 54, 114, 19);
		paneProfile.add(txtHunger);
		txtHunger.setColumns(10);

		txtHappy = new JTextField();
		txtHappy.setText("25");
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

		JLabel lblLife = new JLabel("Hunger");
		lblLife.setBounds(174, 27, 70, 15);
		paneProfile.add(lblLife);

		JLabel lblNewLabel_1 = new JLabel("Happiness");
		lblNewLabel_1.setBounds(169, 85, 114, 15);
		paneProfile.add(lblNewLabel_1);

		JButton btnNameBurton = new JButton("Burton");
		btnNameBurton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("Burton");
			}
		});
		btnNameBurton.setForeground(new Color(255, 255, 255));
		btnNameBurton.setBackground(new Color(81, 66, 201));
		btnNameBurton.setBounds(12, 29, 117, 25);
		panelName.add(btnNameBurton);

		JButton btnNameFelix = new JButton("Félix");
		btnNameFelix.setForeground(new Color(255, 255, 255));
		btnNameFelix.setBackground(new Color(81, 66, 201));
		btnNameFelix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtName.setText("Félix");

			}
		});
		btnNameFelix.setBounds(166, 29, 117, 25);
		panelName.add(btnNameFelix);

		JButton btnNameBorin = new JButton("Borin");
		btnNameBorin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("Borin");
			}
		});
		btnNameBorin.setForeground(new Color(255, 255, 255));
		btnNameBorin.setBackground(new Color(81, 66, 201));
		btnNameBorin.setBounds(12, 66, 117, 25);
		panelName.add(btnNameBorin);

		JButton btnNameAnakin = new JButton("Anakin");
		btnNameAnakin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("Anakin");
			}
		});
		btnNameAnakin.setForeground(new Color(255, 255, 255));
		btnNameAnakin.setBackground(new Color(81, 66, 201));
		btnNameAnakin.setBounds(166, 66, 117, 25);
		panelName.add(btnNameAnakin);

		JButton btnBreedSphynx = new JButton("Sphynx");
		btnBreedSphynx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBreed.setText("Sphynx");
			}
		});
		btnBreedSphynx.setBackground(new Color(81, 66, 201));
		btnBreedSphynx.setForeground(new Color(255, 255, 255));
		btnBreedSphynx.setBounds(12, 26, 117, 25);
		panelBreed.add(btnBreedSphynx);

		JButton btnBreedPersa = new JButton("Persa");
		btnBreedPersa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBreed.setText("Persa");
			}
		});
		btnBreedPersa.setBackground(new Color(81, 66, 201));
		btnBreedPersa.setForeground(new Color(255, 255, 255));
		btnBreedPersa.setBounds(171, 26, 117, 25);
		panelBreed.add(btnBreedPersa);

		JButton btnBreedRagdoll = new JButton("Ragdoll");
		btnBreedRagdoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBreed.setText("Ragdoll");
			}
		});
		btnBreedRagdoll.setBackground(new Color(81, 66, 201));
		btnBreedRagdoll.setForeground(new Color(255, 255, 255));
		btnBreedRagdoll.setBounds(12, 72, 117, 25);
		panelBreed.add(btnBreedRagdoll);

		JButton btnBreedSiames = new JButton("Siamês");
		btnBreedSiames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBreed.setText("Siamês");
			}
		});
		btnBreedSiames.setBackground(new Color(81, 66, 201));
		btnBreedSiames.setForeground(new Color(255, 255, 255));
		btnBreedSiames.setBounds(171, 72, 117, 25);
		panelBreed.add(btnBreedSiames);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Action",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(352, 289, 234, 90);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnFood = new JButton("");
		btnFood.setBackground(new Color(128, 128, 192));
		btnFood.setIcon(new ImageIcon(YourCat.class.getResource("/image/snack (1).png")));
		btnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.valueOf(txtPortion.getText()) > 0) {
					JOptionPane.showMessageDialog(btnFood, "Você alimentou " + txtName.getText()
							+ ". \nA fome diminuiu -5. \n A felicidade aumentou +5.");
					txtHunger.setText(String.valueOf(Integer.valueOf(txtHunger.getText()) - 5));
					txtHappy.setText(String.valueOf(Integer.valueOf(txtHappy.getText()) + 5));
					txtPortion.setText(String.valueOf(Integer.valueOf(txtPortion.getText()) -1));
					death(txtHunger, txtHappy);
				} else {
					JOptionPane.showMessageDialog(btnFood, "Sem comida. Compre mais.");
				}
			}
		});
		btnFood.setBounds(43, 30, 36, 38);
		panel.add(btnFood);

		JButton btnWorking = new JButton("");
		btnWorking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(btnWorking, "Você mandou seu gato trabalhar " + txtName.getText()
						+ "\nA felicidade diminuiu -10.\n A fome aumentou +10.\nVocê ganhou 10 dinheiros.");
				txtHappy.setText(String.valueOf(Integer.valueOf(txtHappy.getText()) - 10));
				txtHunger.setText(String.valueOf(Integer.valueOf(txtHunger.getText()) + 10));
				txtMoney.setText(String.valueOf(Integer.valueOf(txtMoney.getText()) + 10));
				death(txtHunger, txtHappy);
			}
		});
		btnWorking.setBackground(new Color(128, 128, 192));
		btnWorking.setIcon(new ImageIcon(YourCat.class.getResource("/image/working (1).png")));
		btnWorking.setBounds(96, 30, 46, 38);
		panel.add(btnWorking);

		JButton btnBall = new JButton("");
		btnBall.setBackground(new Color(128, 128, 192));
		btnBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnBall,
						"Você brincou com " + txtName.getText() + ". A fome aumentou +5.\n A felicidade aumentou +5.");
				txtHunger.setText(String.valueOf(Integer.valueOf(txtHunger.getText()) + 5));
				txtHappy.setText(String.valueOf(Integer.valueOf(txtHappy.getText()) + 5));
				death(txtHunger, txtHappy);

			}
		});
		btnBall.setIcon(new ImageIcon(YourCat.class.getResource("/image/ball (1).png")));
		btnBall.setBounds(152, 30, 43, 38);
		panel.add(btnBall);
	}
}

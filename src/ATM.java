import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM");
        frame.setSize(1024,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        panelMain.setBackground(Color.BLUE);
        GridBagConstraints consMain = new GridBagConstraints();
        consMain.insets = new Insets(50, 50, 50, 50);

        JPanel panelPass = new JPanel();
        panelPass.setLayout(new GridBagLayout());
        panelPass.setBackground(Color.BLUE);
        GridBagConstraints consPass = new GridBagConstraints();

        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(new GridBagLayout());
        panelMenu.setBackground(Color.BLUE);
        GridBagConstraints consMenu = new GridBagConstraints();
        consMenu.insets = new Insets(20, 80, 20, 80);

        JPanel panelError = new JPanel();
        panelError.setLayout(new GridBagLayout());
        panelError.setBackground(Color.BLUE);
        GridBagConstraints consError = new GridBagConstraints();
        consError.insets = new Insets(10, 10, 10, 10);

        JPanel panelInvalid = new JPanel();
        panelInvalid.setLayout(new GridBagLayout());
        panelInvalid.setBackground(Color.BLUE);
        GridBagConstraints consInvalid = new GridBagConstraints();
        consInvalid.insets = new Insets(10, 10, 10, 10);

        JPanel panelConfirm = new JPanel();
        panelConfirm.setLayout(new GridBagLayout());
        panelConfirm.setBackground(Color.BLUE);
        GridBagConstraints consConfirm = new GridBagConstraints();
        consConfirm.insets = new Insets(10, 10, 10, 10);

        JPanel panelSuccess = new JPanel();
        panelSuccess.setLayout(new GridBagLayout());
        panelSuccess.setBackground(Color.BLUE);
        GridBagConstraints consSuccess = new GridBagConstraints();
        consSuccess.insets = new Insets(10, 10, 10, 10);

        JPanel panelChange = new JPanel();
        panelChange.setLayout(new GridBagLayout());
        panelChange.setBackground(Color.BLUE);
        GridBagConstraints consChange = new GridBagConstraints();
        consChange.insets = new Insets(10, 10, 10, 10);

        JPanel panelWithdrawal = new JPanel();
        panelWithdrawal.setLayout(new GridBagLayout());
        panelWithdrawal.setBackground(Color.BLUE);
        GridBagConstraints consWithdrawal = new GridBagConstraints();
        consWithdrawal.insets = new Insets(10, 10, 10, 10);

        JPanel panelBalance = new JPanel();
        panelBalance.setLayout(new GridBagLayout());
        panelBalance.setBackground(Color.BLUE);
        GridBagConstraints consBalance = new GridBagConstraints();
        consBalance.insets = new Insets(10, 10, 10, 10);

        JPanel panelTransfer = new JPanel();
        panelTransfer.setLayout(new GridBagLayout());
        panelTransfer.setBackground(Color.BLUE);
        GridBagConstraints consTransfer = new GridBagConstraints();
        consTransfer.insets = new Insets(10, 10, 10, 10);
// Main Page
        JButton faButton = new JButton("فارسی");
        consMain.gridx = 0;
        consMain.gridy = 0;
        panelMain.add(faButton,consMain);

        JButton enButton = new JButton("English");
        consMain.gridx = 1;
        consMain.gridy = 0;
        panelMain.add(enButton,consMain);
        enButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelMain);
                frame.add(panelPass);
                frame.revalidate();
                frame.repaint();
            }
        });

        JLabel lanFaText = new JLabel("زبان خود را انتخاب کنید");
        consMain.gridx = 0;
        consMain.gridy = -1;
        lanFaText.setForeground(Color.WHITE);
        panelMain.add(lanFaText,consMain);

        JLabel lanEnText = new JLabel("Choose Your Language");
        consMain.gridx = 1;
        consMain.gridy = -1;
        lanEnText.setForeground(Color.WHITE);
        panelMain.add(lanEnText,consMain);
// Error Page
        JLabel errorText = new JLabel("Wrong Password");
        consError.gridx = 0;
        consError.gridy = 0;
        errorText.setForeground(Color.WHITE);
        panelError.add(errorText,consError);

        JButton eBackButton = new JButton("Back");
        consError.gridy = -1;
        panelError.add(eBackButton,consError);
        eBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    frame.remove(panelError);
                    frame.add(panelPass);
                    frame.revalidate();
                    frame.repaint();
            }
        });

// Password Page
        JLabel passText = new JLabel("Enter Your Password!");
        consPass.gridx = 0;
        consPass.gridy = 0;
        passText.setForeground(Color.WHITE);
        panelPass.add(passText,consPass);

        consPass.insets = new Insets(10, 10, 10, 10);
        JTextField pass = new JTextField(3);
        consPass.gridy = -1;
        panelPass.add(pass,consPass);

        consPass.insets = new Insets(50, 10, 10, 10);
        JButton enterButton = new JButton("Enter");
        consPass.gridy = -2;
        panelPass.add(enterButton,consPass);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int passCheck = Integer.parseInt(pass.getText());
                if (999 < passCheck && passCheck < 10000) {
                    frame.remove(panelPass);
                    frame.add(panelMenu);
                    frame.revalidate();
                    frame.repaint();
                } else {
                    frame.remove(panelPass);
                    frame.add(panelError);
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });
// Menu Page
        JButton changeButton = new JButton("Change Password");
        consMenu.gridx = 0;
        consMenu.gridy = 0;
        panelMenu.add(changeButton,consMenu);
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelMenu);
                frame.add(panelChange);
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton withdrawalButton = new JButton("Withdrawal");
        consMenu.gridx = 1;
        consMenu.gridy = 0;
        panelMenu.add(withdrawalButton,consMenu);
        withdrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelMenu);
                frame.add(panelWithdrawal);
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton balanceButton = new JButton("Balance");
        consMenu.gridx = 0;
        consMenu.gridy = -1;
        panelMenu.add(balanceButton,consMenu);
        balanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelMenu);
                frame.add(panelBalance);
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton transferButton = new JButton("Transfer");
        consMenu.gridx = 1;
        consMenu.gridy = -1;
        panelMenu.add(transferButton,consMenu);
        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelMenu);
                frame.add(panelTransfer);
                frame.revalidate();
                frame.repaint();
            }
        });
// Invalidation Page
        JLabel nErrorText = new JLabel("Invalid Password");
        consInvalid.gridx = 0;
        consInvalid.gridy = 0;
        nErrorText.setForeground(Color.WHITE);
        panelInvalid.add(nErrorText,consInvalid);

        JButton nBackButton = new JButton("Back");
        consInvalid.gridy = -1;
        panelInvalid.add(nBackButton,consInvalid);
        nBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelInvalid);
                frame.add(panelChange);
                frame.revalidate();
                frame.repaint();
            }
        });
// Confirmation Page
        JLabel cPassText = new JLabel("Confirm The New Password");
        consConfirm.gridx = 0;
        consConfirm.gridy = 0;
        cPassText.setForeground(Color.WHITE);
        panelConfirm.add(cPassText,consConfirm);

        consConfirm.insets = new Insets(10, 10, 10, 10);
        JTextField cPass = new JTextField(3);
        consConfirm.gridy = -1;
        panelConfirm.add(cPass,consConfirm);

        consConfirm.insets = new Insets(50, 10, 10, 10);
        JButton cEnterButton = new JButton("Enter");
        consConfirm.gridy = -2;
        panelConfirm.add(cEnterButton,consConfirm);
        cEnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cPassCheck = Integer.parseInt(cPass.getText());

                if (999 < cPassCheck && cPassCheck < 10000) {
                    frame.remove(panelConfirm);
                    frame.add(panelSuccess);
                    frame.revalidate();
                    frame.repaint();
                } else {
                    frame.remove(panelConfirm);
                    frame.add(panelInvalid);
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });
// Change Password Page
        JLabel nPassText = new JLabel("Enter Your New Password");
        consChange.gridx = 0;
        consChange.gridy = 0;
        nPassText.setForeground(Color.WHITE);
        panelChange.add(nPassText,consChange);

        consChange.insets = new Insets(10, 10, 10, 10);
        JTextField nPass = new JTextField(3);
        consChange.gridy = -1;
        panelChange.add(nPass,consChange);

        consChange.insets = new Insets(50, 10, 10, 10);
        JButton nEnterButton = new JButton("Enter");
        consChange.gridy = -2;
        panelChange.add(nEnterButton,consChange);
        nEnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nPassCheck = Integer.parseInt(nPass.getText());
                if (999 < nPassCheck && nPassCheck < 10000) {
                    frame.remove(panelChange);
                    frame.add(panelConfirm);
                    frame.revalidate();
                    frame.repaint();
                } else {
                    frame.remove(panelChange);
                    frame.add(panelInvalid);
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });
// Withdrawal Page
        JLabel amountText = new JLabel("Enter The Amount You Wish To Withdraw");
        consWithdrawal.gridx = 0;
        consWithdrawal.gridy = 0;
        amountText.setForeground(Color.WHITE);
        panelWithdrawal.add(amountText,consWithdrawal);

        consWithdrawal.insets = new Insets(10, 10, 10, 10);
        JTextField amount = new JTextField(10);
        consWithdrawal.gridy = -1;
        panelWithdrawal.add(amount,consWithdrawal);

        consWithdrawal.insets = new Insets(50, 10, 10, 10);
        JButton wEnterButton = new JButton("Enter");
        consWithdrawal.gridy = -2;
        panelWithdrawal.add(wEnterButton,consWithdrawal);
        wEnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelWithdrawal);
                frame.add(panelSuccess);
                frame.revalidate();
                frame.repaint();
            }
        });
// Balance Page
        JLabel balanceText = new JLabel("Account Balance: 1,000,000$");
        consBalance.gridx = 0;
        consBalance.gridy = 0;
        balanceText.setForeground(Color.WHITE);
        panelBalance.add(balanceText,consBalance);

        consBalance.insets = new Insets(50, 10, 10, 10);
        JButton bEnterButton = new JButton("Back");
        consBalance.gridy = -2;
        panelBalance.add(bEnterButton,consBalance);
        bEnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelBalance);
                frame.add(panelMenu);
                frame.revalidate();
                frame.repaint();
            }
        });
// Transfer Page
        JLabel outText = new JLabel("Enter The Amount You Wish To Transfer");
        consTransfer.gridx = 0;
        consTransfer.gridy = 0;
        outText.setForeground(Color.WHITE);
        panelTransfer.add(outText,consTransfer);

        JTextField outAmount = new JTextField(10);
        consTransfer.gridy = -1;
        panelTransfer.add(outAmount,consTransfer);

        JLabel cardText = new JLabel("Enter The Destination Card");
        consTransfer.gridy = -2;
        cardText.setForeground(Color.WHITE);
        panelTransfer.add(cardText,consTransfer);

        JTextField outCard = new JTextField(10);
        consTransfer.gridy = -3;
        panelTransfer.add(outCard,consTransfer);

        JButton tEnterButton = new JButton("Enter");
        consTransfer.gridy = -4;
        panelTransfer.add(tEnterButton,consTransfer);
        tEnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelTransfer);
                frame.add(panelSuccess);
                frame.revalidate();
                frame.repaint();
            }
        });
// Success Page
        JLabel finalText = new JLabel("Transaction Successful");
        consSuccess.gridx = 0;
        consSuccess.gridy = 0;
        finalText.setForeground(Color.WHITE);
        panelSuccess.add(finalText,consSuccess);

        JButton finalBack = new JButton("Back");
        consSuccess.gridy = -1;
        panelSuccess.add(finalBack,consSuccess);
        finalBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            frame.remove(panelSuccess);
            frame.add(panelMenu);
            frame.revalidate();
            frame.repaint();
            }
        });

        frame.add(panelMain);
        frame.setVisible(true);
    }
}

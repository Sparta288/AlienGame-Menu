import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class main {


    public static class AlienIsolation extends JFrame implements ActionListener {

        TextField textField;
        JLabel label;

        public AlienIsolation(){
            initUI();
        }

        private void initUI() {
            setTitle("ALIEN ISOLATION");
            setSize(500, 300);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            // controls
            JButton calculateButton = new JButton("Would you like to play Alien Isolation?");
            calculateButton.addActionListener(this);
            textField = new TextField("Enter yes or no:  ", 10);
            label = new JLabel("");
            // container
            Box box = Box.createVerticalBox();
            box.add(textField);
            box.add(Box.createVerticalStrut(25));
            box.add(calculateButton);
            box.add(Box.createVerticalStrut(25));
            box.add(label);
            getContentPane().add(box, BorderLayout.CENTER);
            getContentPane().setSize(300, 200);
        }

        public static void main(String[] args){
            AlienIsolation calculator = new AlienIsolation();
            calculator.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String data = textField.getText();
            data = data.replace("Enter yes or no:  ", "");
            String gamePlayAnswer = String.format(data);
            label.setText("Your answer is: " + (gamePlayAnswer));


        }
    }


    public static void main(String[] args) {
        // Alien Isolation Start Menu
        Scanner sc = new Scanner(System.in);
        // Scanner input

        String gamePlayAnswer;
        int selectionChoice = 0;

        // The loop will continue until the player chooses to enter the game.
        do {

            System.out.println("Would you like to play Alien Isolation?\nEnter yes or no: ");
            gamePlayAnswer = sc.next();


            //When player chooses yes they will enter the game menu with a list of options
            if (gamePlayAnswer.equalsIgnoreCase("yes")) {
                System.out.println("------ALIEN ISOLATION MENU------");
                System.out.println();

                System.out.println("1. Play Game");
                System.out.println("2. Options");
                System.out.println("3. Extras");
                System.out.println("4. Xbox Store");
                System.out.println("5. Quit Game");

                System.out.println("Enter selection:");
                selectionChoice = sc.nextInt();
            } else {
                System.out.println("You did not select the correct input.\nTry again.");
            }
            System.out.println();
        } while (gamePlayAnswer.equalsIgnoreCase("no"));

        // a decision control structure that will allow the player to select specific menu items
        switch (selectionChoice) {
            case 1:
                Campaign.campaign();
                break;
            case 2:
                Campaign.options();
                break;
            case 3:
                Campaign.extras();
                break;
            case 4:
                Campaign.xboxStore();
                break;
            case 5:
                Campaign.quitGame();
                break;
            default:
                System.out.println("Wrong input.");
                break;

        }

    }
}



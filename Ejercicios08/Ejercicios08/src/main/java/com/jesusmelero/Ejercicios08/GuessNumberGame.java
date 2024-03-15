package com.jesusmelero.Ejercicios08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

    public class GuessNumberGame extends JFrame {
        private int attemptsLeft = 5;
        private int randomNumber;

        private JLabel attemptsLabel;
        private JTextField numberField;
        private JButton guessButton;

        public GuessNumberGame() {
            setTitle("Guess the Number Game");
            setSize(1024, 768);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 1));

            attemptsLabel = new JLabel("Attempts left: " + attemptsLeft);
            panel.add(attemptsLabel);

            numberField = new JTextField();
            panel.add(numberField);

            guessButton = new JButton("Guess");
            guessButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    checkGuess();
                }
            });
            panel.add(guessButton);

            setContentPane(panel);
            setVisible(true);

            startNewGame();
        }

        private void startNewGame() {
            Random random = new Random();
            randomNumber = random.nextInt(101); // Generar número aleatorio entre 0 y 100
            attemptsLeft = 5;
            updateAttemptsLabel();
        }

        private void checkGuess() {
            try {
                int guessedNumber = Integer.parseInt(numberField.getText());
                if (guessedNumber == randomNumber) {
                    JOptionPane.showMessageDialog(this, "Congratulations! You guessed the number.", "You Win!", JOptionPane.INFORMATION_MESSAGE);
                    if (playAgain()) {
                        startNewGame();
                    } else {
                        System.exit(0);
                    }
                } else {
                    attemptsLeft--;
                    updateAttemptsLabel();
                    if (attemptsLeft == 0) {
                        JOptionPane.showMessageDialog(this, "Sorry, you've run out of attempts. The number was " + randomNumber + ".", "Game Over", JOptionPane.INFORMATION_MESSAGE);
                        if (playAgain()) {
                            startNewGame();
                        } else {
                            System.exit(0);
                        }
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        private void updateAttemptsLabel() {
            attemptsLabel.setText("Attempts left: " + attemptsLeft);
        }

        private boolean playAgain() {
            int choice = JOptionPane.showConfirmDialog(this, "Do you want to play again?", "Play Again", JOptionPane.YES_NO_OPTION);
            return choice == JOptionPane.YES_OPTION;
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new GuessNumberGame();
                }
            });
        }
    }


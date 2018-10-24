# Tic-Tac-Toe
This project is to help me get a additional experience with the Gradle build system and implement a working two-player Tic-Tac-Toe game.

## Tech/framework used

Command Prompt

git and github

Netbeans

## Installation
1.Fork and clone the following GitHub repository: https://github.com/jsnellen/cs310-tic-tac-toe

2.Use the command git clone https://github.com/ChaoLin30/cs310-tic-tac-toe

3.Open a Command Prompt or terminal window, and switch the working directory to the root of the Git project folder from the previous step.  Run the Gradle build tool, including all unit/acceptance tests, by entering the following command at the prompt.
    
    gradle clean build jacocoTestReport runrobot

4. To complete the implementation, using the incomplete versions provided in the repository as a starting point.

    TicTacToe.java
    
    TicTacToeModel.java
    
    TicTacToeView.java
    
    TicTacToeController.java

    will find them in the following folder :

    src/main/java/edu/jsu/mcis/
    
## Test

To test this project after a successful build, enter the following command from the root of your project folder:

java -jar build\libs\cs310-tic-tac-toe-1.0.jar 

When game is finished, the output should precisely match the following:

  012

0 ---

1 ---

2 ---

Player 1 (X) Move:

Enter the row and column numbers, separated by a space: 1 1


  012

0 ---

1 -X-

2 ---

Player 2 (O) Move:

Enter the row and column numbers, separated by a space: 0 1


  012

0 -O-

1 -X-

2 ---

Player 1 (X) Move:

Enter the row and column numbers, separated by a space: 0 0


  012

0 XO-

1 -X-

2 ---

Player 2 (O) Move:

Enter the row and column numbers, separated by a space: 1 2


  012

0 XO-

1 -XO

2 ---

Player 1 (X) Move:

Enter the row and column numbers, separated by a space: 2 2


  012

0 XO-

1 -XO

2 --X

X!

## Credit

    Jay Snellen
    
    https://github.com/jsnellen/cs310-tic-tac-toe

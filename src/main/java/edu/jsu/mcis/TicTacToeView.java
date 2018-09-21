package edu.jsu.mcis;

import edu.jsu.mcis.TicTacToeModel.Mark;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        System.out.println(" \n");
        for(int i =0; i <model.getWidth() ; i++){
                System.out.println(i);
                }
                System.out.println("\n\n");
        for(int i =0; i< model.getWidth(); i++){
                System.out.println(i + " ");
                for(int j =0; j< model.getWidth() ; j++){
                        if(model.getMark(i,j) == TicTacToeModel.Mark.EMPTY ){
                            System.out.println("-");

                        }
                        else{
                                System.out.println(model.getMark(i,j));
                        }
                }
        System.out.println("\n");

        }
        System.out.println("\n\n\n");      
        
        System.out.print("\n  012\n\n0 ---\n1 ---\n2 ---\n\n\n\n");
        }


    

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        if(model.isXTurn()){
                System.out.println("Player 1 (X) Move: ");
        }
        else{
                System.out.println("Player 2 (O) Move:");
        }
        
        System.out.println("Enter the row and column numbers, separated by a space:");

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        System.out.println("input is invalid");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}
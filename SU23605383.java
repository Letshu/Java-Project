
public class SU23605383 {
	
	public static void DrawBoard(String[][] board){
/**
 * This method draws pictures in a coordinate grid system using StdDraw library
 * The pictures are drawn according to there position in the board array using nested for loop
 * The pictures are drawn at the center their point hence (j+0.5,i+0.5) and resized to 0.8
 * There's two mean if statements to check how many pieces are in the array cell:
 * if(board[i][j].length()==1) this draws the only piece that is in that cell
 * else if(board[i][j].length()>1) this draws the last piece that is in that cell 	
 */
		for(int i =0;i< board.length;i++){    	
			for(int j=0;j< board[i].length;j++){
				if(board[i][j].length()==1){
					if(board[i][j].contains("Y")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_s.png",0.8,0.8);
					}
					else if(board[i][j].contains(".")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_e.png",0.8,0.8);
					}
					else if(board[i][j].contains("u")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_uh.png",0.8,0.8);
					}
					else if(board[i][j].contains("U")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_uv.png",0.8,0.8);
					}
					else if(board[i][j].contains("d")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_dh.png",0.8,0.8);
					}
					else if(board[i][j].contains("D")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_dv.png",0.8,0.8);
					}
					else if(board[i][j].contains("X")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_x.png",0.8,0.8);
					}
					else if(board[i][j].contains("x")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_x.png",0.8,0.8);
					}
					else if(board[i][j].contains("t")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_t.png",0.8,0.8);
					}
	                
					else if(board[i][j].contains("T")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_t.png",0.8,0.8);
					}
					else if(board[i][j].contains("V")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_sv1.png",0.8,0.8);
					}
					else if(board[i][j].contains("v")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_sv0.png",0.8,0.8);
					}
					else if(board[i][j].contains("H")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_sh1.png",0.8,0.8);
					}
					else if(board[i][j].contains("h")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_sh0.png",0.8,0.8);
					}
					else if(board[i][j].contains("L")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_lv.png",0.8,0.8);
					}
					else if(board[i][j].contains("l")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_lh.png",0.8,0.8);
					}
					else if(board[i][j].contains("R")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_rv.png",0.8,0.8);
					}
					else if(board[i][j].contains("r")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_rh.png",0.8,0.8);
					}
					else if(board[i][j].contains("P")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_p1.png",0.8,0.8);
					}
					else if(board[i][j].contains("p")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_p0.png",0.8,0.8);
					}
					else if(board[i][j].contains("k")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_k0.png",0.8,0.8);
					}
					else if(board[i][j].contains("K")){
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_k1.png",0.8,0.8);
					}
				}
				else if(board[i][j].length() >1) {
					if(board[i][j].charAt(board[i][j].length()-1) == 'H') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_sh0.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'h') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_sh1.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'L') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_lv.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'l') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_lh.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'r') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_rh.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'R') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_rv.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'V') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_sv1.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'v') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_sv0.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'H') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_sh1.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'h') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_sh0.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 't') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_t.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'x') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_x.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'D') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_dv.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'd') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_dh.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'U') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_uv.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'u') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_uh.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'Y') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_s.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'p') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_p0.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'P') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_p1.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'k') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_k0.png",0.8,0.8);
					}
					else if(board[i][j].charAt(board[i][j].length()-1) == 'K') {
						StdDraw.picture(j+0.5,i+0.5,"images/tvl_k1.png",0.8,0.8);
					}
				}
			}
		}
	}
	
public static boolean checkKeys(String[][] board) {
/**
 * This method is to check if a player moved into an available key
 * The method takes in 2D string array and use nested for loop to go through the array
 * returns true if player moved in the same cell is available key otherwise returns false
 */
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[0].length;j++) {
			if(board[i][j].contains("Y") && board[i][j].contains("K")) {
				board[i][j] = board[i][j].replace("K","k"); //Replace K to k , making it unavailable
				return true;
			}
		}
	}
	return false;
}

public static void UpdatePorts(String[][] board) {
/**
 * 	The method changes the port once a player moves into an available key
 * The method takes in an 2d String array and uses nested for loop to locate P and p.
 * Once P or p is located its changed to P or p respectively
 */
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[0].length;j++) {
			if(board[i][j].contains("p")) {
				board[i][j] = board[i][j].replace("p","P"); //toggle port from off to on
			}
			else if(board[i][j].contains("P")) {
				board[i][j] = board[i][j].replace("P","p"); //toggle port from on to off
			}
		}
	}
}

public static void hSwitchers(String [][] board) {
	/**
	 * This method takes in 2d string array and toggle's horizontal switcher when player makes horizontal move
	 */
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[0].length;j++) {
			if(board[i][j].contains("H")) {
				board[i][j] = board[i][j].replace("H", "h");
			}
			else if(board[i][j].contains("h")) {
				board[i][j]= board[i][j].replace("h", "H");
			}
		}
	}
}

public static void vSwitchers(String [][] board) {
	/**
	 * This method takes in 2d string array and toggle's horizontal switcher when player makes horizontal move
	 */
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[0].length;j++) {
			if(board[i][j].contains("V")) {
				board[i][j] = board[i][j].replace("V", "v");
			}
			else if(board[i][j].contains("v")) {
				board[i][j]= board[i][j].replace("v", "V");
			}
		}
	}
}
	
public static void main(String[] args) {
		if (args.length == 2) {

			String boardfile = args[0]; 
			
			String movefile = args[1]; 
			
			In file = new In(boardfile); //reading the board file

	        file.readLine();//This is skipping the first line of the text;

	        int row = file.readInt();//Getting the first integer from the file

	        int column = file.readInt(); //Getting the second one on the file

	        String[][] board = new String[row][column]; //creating the board for the game
	        String s3 = "";
	        String[] s2 = file.readAllStrings(); //putting all elements in a String array
	        for (int i = 0; i < s2.length; i++) {
	            s3 += s2[i];
	        }
	        
	        String[] s4 = s3.split(""); //Putting all the elements in a array of strings
	        int PlayerRow=0;
	        int PlayerColumn=0;

	        int check = 0; //this is to check that I got everything in the array;
	        while (check < column * row) {  //Putting all the elements in the board
	            for (int i = 0; i < row; i++) {
	                for (int j = 0; j < column; j++) {
	                    board[i][j] = s4[check];
	                    check++;
	                }
	            }
	        }
	        //This variables check if the program terminated within the switch statement
	        boolean Xmove = false;
	        boolean GameOver = false;
	        boolean InvalidMove = false;
	        //This boolean and numbers here are used to keep track which movers and how many are their in the text file 
	        boolean R = false; 
	        boolean L = false; 
	        boolean D= false; 
	        boolean U = false;
	        boolean r = false; 
	        boolean l = false; 
	        boolean d= false; 
	        boolean u=false;
	        for (int i = 0; i < row; i = i + 1) {
	            for (int j = 0; j < column; j++) {
/**
 *The following is happening in this for loop
 *Finding the starting position of the player and replacing s/S with Y
 *replacing all X with x
 *checking which horizontal or vertical mover is in the board and storing it in boolean variable
 * 	            	
 */
	                if (board[i][j].equals("s") || board[i][j].equals("S")) {
	                    PlayerRow = i;
	                    PlayerColumn = j;
	                    board[i][j] = "Y";
	                }
	                else if(board[i][j].contains("X")) {
	                	board[i][j]= "x";
	                }
	                else if(board[i][j].contains("k")) {
	                	board[i][j]= "K";
	                }
	                else if(board[i][j].contains("T")) {
	                	board[i][j]="t";
	                }
	                else if(board[i][j].contains("D")) {
	                	D=true;
	                }	                
	                else if(board[i][j].contains("d")) {	                	
	                	d = true;
	                }	                
	                else if(board[i][j].contains("U")) {	                	
	                	U= true ;
	                }	                
	                else if(board[i][j].contains("u")) {                	
	                	u=true;
	                }	                
	                else if(board[i][j].contains("L")) {	                	
	                	L = true;
	                }	                
	                else if(board[i][j].contains("l")) {	                	
	                	l=true;
	                }	                
	                else if(board[i][j].contains("R")) {	                	
	                	R= true;
	                }	                
	                else if(board[i][j].contains("r")) {
	              	      r=true;
	                }	                	                
	            }	        
	        }
	        //reading in move text file from argument
	        In moveFile = new In(movefile);
	        String moves = moveFile.readLine();
	      
				for (int i=0;i<moves.length();i++) {
					switch (moves.charAt(i)) {
						case 'h': // left move
							if (PlayerColumn > 0) {
								board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
								PlayerColumn--;
								board[PlayerRow][PlayerColumn] += "Y";
								if (u) {
									HorizontalUpMover(board);
								}
								if (d) {
									HorizontalDownMover(board);
								}
								if (l) {
									HorizontalLeftMover(board);
								}
								if (r) {
									HorizontalRightMover(board);
								}

							}
							if(checkKeys(board)) {
								UpdatePorts(board);
							}
							hSwitchers(board);
							
							//This check that the player hasn't moved into a wall
							if (gameLose(board)) {
								StdOut.println("You lost!");
								GameOver = true;
								ChangeMovers(board);
								printBoard(board);
								i= moves.length();
							}
							if (GameOver(board)) {
								StdOut.println("You won!");
								GameOver = true;
								ChangeMovers(board);
								printBoard(board);
								i= moves.length();
							}

							break;

						case 'l': //right move
							if (PlayerColumn < board[0].length - 1) {
								board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
								PlayerColumn++;
								board[PlayerRow][PlayerColumn] += "Y";
								if (u) {
									HorizontalUpMover(board);
								}
								if (d) {
									HorizontalDownMover(board);
								}
								if (l) {
									HorizontalLeftMover(board);
								}
								if (r) {
									HorizontalRightMover(board);
								}
							}
							if(checkKeys(board)) {
								UpdatePorts(board);
							}
							hSwitchers(board);
							if (gameLose(board)) {
								StdOut.println("You lost!");
								GameOver = true;
								ChangeMovers(board);
								printBoard(board);
								i= moves.length();
							}
							if (GameOver(board)) {
								StdOut.println("You won!");
								GameOver = true;
								ChangeMovers(board);
								printBoard(board);
								i= moves.length();
							}

							break;
						case 'k': // up move
							if (PlayerRow >= 1) {
								board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
								PlayerRow--;
								board[PlayerRow][PlayerColumn] += "Y";

							} else {
								board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
								board[board.length - 1][PlayerColumn] += "Y";
								PlayerRow = board.length - 1;

							}
							if (U) {
								VerticalUpMover(board);
							}
							if (D) {
								VerticalDownMover(board);
							}
							if (L) {
								VerticalLeftMover(board);
							}
							if (R) {
								VerticalRightMover(board);
							}
							
							if(checkKeys(board)) {
								UpdatePorts(board);
							}
							vSwitchers(board);
							if (gameLose(board)) {
								StdOut.println("You lost!");
								ChangeMovers(board);
								GameOver = true;
								printBoard(board);
								i= moves.length();
							}
							if (GameOver(board)) {
								StdOut.println("You won!");
								GameOver = true;
								ChangeMovers(board);
								printBoard(board);
								i= moves.length();
							}

							break;

						case 'j': //down move
							if (PlayerRow < board.length - 1) {
								board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
								PlayerRow++;
								board[PlayerRow][PlayerColumn] += "Y";
								
							} else {
								board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
								board[0][PlayerColumn] += "Y";
								PlayerRow = 0;

							}
							if (U) {
								VerticalUpMover(board);
							}
							if (D) {
								VerticalDownMover(board);
							}
							if (L) {
								VerticalLeftMover(board);
							}
							if (R) {
								VerticalRightMover(board);
							}
							
							if(checkKeys(board)) {
								UpdatePorts(board);
							}
							vSwitchers(board);

							if (gameLose(board)) {
								StdOut.println("You lost!");
								GameOver = true;
								ChangeMovers(board);
								printBoard(board);
								i= moves.length();
							}
							if (GameOver(board)) {
								StdOut.println("You won!");
								GameOver = true;
								ChangeMovers(board);
								printBoard(board);
								i= moves.length();
							}

							break;

						case 'x':
							 Xmove = true;
							ChangeMovers(board);
							printBoard(board);
							i= moves.length();
							break;

						default:
							StdOut.println("Incorrect move");
							InvalidMove = true;
							ChangeMovers(board);
							printBoard(board);
							i= moves.length();

							break;
					}

				}
				
				//This is used to check the state of the game after all the moves has been made
				if(GameOver == false && Xmove==false && InvalidMove==false) {
					if(!GameOver(board)) {
						StdOut.println("You lost!");
						ChangeMovers(board);
						printBoard(board);
					}
					
					else if(GameOver(board)) {
						StdOut.println("You won!");
						ChangeMovers(board);
						printBoard(board);
					}
				}
		} 
		else if (args.length == 1) {			
			String in = args[0];			
			In boardFile = new In(in);		
			boardFile.readLine();//This is skipping the first line of the text;
	        int row = boardFile.readInt();//Getting the first integer from the file
	        int column = boardFile.readInt(); //Getting the second one on the file
	        String[][] board = new String[row][column]; //creating the board for the game
	        String s3 = "";
	        String[] s2 = boardFile.readAllStrings(); //putting all elements in a String array
	        for (int i = 0; i < s2.length; i++) {
	            s3 += s2[i];
	        }
	        String[] s4 = s3.split(""); //Putting all the elements in a array of strings
	        int PlayerRow=0;
	        int PlayerColumn=0;
	        int check = 0; //this is to check that I got everything in the array;
	        while (check < column * row) {  //Putting all the elements in the board
	            for (int i = 0; i < row; i++) {
	                for (int j = 0; j < column; j++) {
	                    board[i][j] = s4[check];
	                    check++;
	                }
	            }
	        }
	        //This is used to check the presence of movers,switchers and ports
	        boolean R = false; 
	        boolean D= false;
	        boolean L = false; 
	        boolean U = false;
	        boolean r = false; 
	        boolean l = false; 
	        boolean d= false; 
	        boolean u=false; 
	        for (int i = 0; i < row; i = i + 1) {
	        	/**
	        	 *The following is happening in this for loop
	        	 *Finding the starting position of the player and replacing s/S with Y
	        	 *replacing all X with x and all T to t
	        	 *checking which horizontal or vertical mover is in the board and storing it in boolean variable
	        	 * 	            	
	        	 */
	            for (int j = 0; j < column; j++) {
	                if (board[i][j].equals("s") || board[i][j].equals("S")) {//Finding the starting position of the player and replacing it
	                    PlayerRow = i;
	                    PlayerColumn = j;
	                    board[i][j] = "Y";
	                }
	                else if(board[i][j].contains("k")) {
	                	board[i][j] = "K"; //Change lower case k into K so that was the key is used I won't use it again
	                }
	                else if(board[i][j].contains("T")) {
	                	board[i][j]="t"; //change all T to t
	                }
	                else if(board[i][j].contains("X")) {
	                	board[i][j]= "x";
	                }
	                else if(board[i][j].contains("D")) {
	                	D=true;
	                }	                
	                else if(board[i][j].contains("d")) {	                	
	                	d = true;
	                }	                
	                else if(board[i][j].contains("U")) {	                	
	                	U= true ;
	                }	                
	                else if(board[i][j].contains("u")) {                	
	                	u=true;
	                }	                
	                else if(board[i][j].contains("L")) {	                	
	                	L = true;
	                }	                
	                else if(board[i][j].contains("l")) {	                	
	                	l=true;
	                }	                
	                else if(board[i][j].contains("R")) {	                	
	                	R= true;
	                }	                
	                else if(board[i][j].contains("r")) {
	              	      r=true;
	                }	                	                
	            }	        
	        }
	        
	        StdDraw.setCanvasSize(column*90,row*90);
	        StdDraw.setXscale(0.0,column);
	        StdDraw.setYscale(0.0,row);
	        StdDraw.clear(StdDraw.LIGHT_GRAY);//This is used to represent empty space
	        StdDraw.setPenRadius(0.02);//setting pen thickness 
			StdDraw.setPenColor(StdDraw.BLACK);//Draw border around the board, setting pen to black first
			StdDraw.line(0, 0, 0, row);
			StdDraw.line(0, row, column, row);
			StdDraw.line(column, row, column, 0);
			StdDraw.line(0, 0, column, 0);//Drawing four lines around the board
	        DrawBoard(reverse_it(board));
	        StdDraw.show(20);
	        

	        while(true) {
	        	while(StdDraw.hasNextKeyTyped()) {
	        		switch(StdDraw.nextKeyTyped()) {
	        		/**
	        		 * This is used to make the moves
	        		 * The player's moves are made without a function
	        		 * All horizontal movers and switchers are made within the horizontal player moves
	        		 * All vertical movers and switchers are made within the vertical player moves
	        		 * There's a sound for every time a player makes a move and when the game is over
	        		 * The board is updated after every move along with the border around the board
	        		 */
	        			case 'h': //left
	        				if(PlayerColumn >0 ) {
	        					board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
	        					board[PlayerRow][PlayerColumn-1] += "Y";
	        					PlayerColumn--;
	        					if (u) {
	        						HorizontalUpMover(board);
								}
								if (d) {
									HorizontalDownMover(board);
								}
								if (l) {
									HorizontalLeftMover(board);
								}
								if (r) {
									HorizontalRightMover(board);
								}
								hSwitchers(board); //horizontal switchers when a player makes an horizontal move
	        				}
	        				if(checkKeys(board)) { //checking if player moved into an open port
								UpdatePorts(board);
							}
	        				if (gameLose(board)) {
								StdOut.println("You lost!");
								StdAudio.play("sounds/lose.wav");
								StdDraw.close(); // to close the StdDraw canvas 
								exit(); //this here is used to allow for the lose.wav to play before exiting
								System.exit(0);
							}
							if (GameOver(board)) {
								StdOut.println("You won!");
								StdAudio.play("sounds/win.wav");
								StdDraw.close();
								exit(); //this here is used to allow for the win.wav to play before exiting
								System.exit(0);
							}
	        				StdDraw.clear(StdDraw.LIGHT_GRAY);
	        				StdDraw.setPenRadius(0.02);
	        				StdDraw.setPenColor(StdDraw.BLACK);
	        				StdDraw.line(0, 0, 0, row);
	        				StdDraw.line(0, row, column, row);
	        				StdDraw.line(column, row, column, 0);
	        				StdDraw.line(0, 0, column, 0);
	    				    DrawBoard(reverse_it(board));
	    				    StdAudio.play("sounds/moves.wav");
	    				    StdDraw.show(20);
	        				break;
	        			case 'l': //right
	        				if(PlayerColumn <column-1 ) {
	        					board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
	        					board[PlayerRow][PlayerColumn+1] += "Y";
	        					PlayerColumn++;
	        					if (u) {
	        						HorizontalUpMover(board);
								}
								if (d) {
									HorizontalDownMover(board);
								}
								if (l) {
									HorizontalLeftMover(board);
								}
								if (r) {
									HorizontalRightMover(board);
								}
								hSwitchers(board);
	        				}
	        				if(checkKeys(board)) { //checking if player moved into an open port
								UpdatePorts(board);
							}
	        				if (gameLose(board)) {
	        					StdAudio.play("sounds/lose.wav");
	        					StdOut.println("You lost!");
								StdDraw.close();
								exit();
								System.exit(0);
							}
							if (GameOver(board)) {
								StdOut.println("You won!");
								StdAudio.play("sounds/win.wav");
								StdDraw.close();
								exit();
								System.exit(0);
							}
	        				StdDraw.clear(StdDraw.LIGHT_GRAY);
	        				StdDraw.setPenRadius(0.02);
	        				StdDraw.setPenColor(StdDraw.BLACK);
	        				StdDraw.line(0, 0, 0, row);
	        				StdDraw.line(0, row, column, row);
	        				StdDraw.line(column, row, column, 0);
	        				StdDraw.line(0, 0, column, 0);
	        				DrawBoard(reverse_it(board));
	        				StdAudio.play("sounds/moves.wav");
	    				    StdDraw.show(20);
	        				break;
	        			case 'k'://up
	        				if (PlayerRow >= 1) {
								board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
								PlayerRow--;
								board[PlayerRow][PlayerColumn] += "Y";
							} else {
								board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
								board[board.length - 1][PlayerColumn] += "Y";
								PlayerRow = board.length - 1;
							}
	        				if (U) {
								VerticalUpMover(board);
							}
							if (D) {
								VerticalDownMover(board);
							}
							if (L) {
								VerticalLeftMover(board);
							}
							if (R) {
								VerticalRightMover(board);
							}
							vSwitchers(board); //implementing vertical switcher
	        				
							if(checkKeys(board)) { //Checking if player moved into an available key
								UpdatePorts(board);
							}
							
							if (gameLose(board)) { //checking if player moved into any obstacles
								StdAudio.play(StdAudio.read("sounds/lose.wav"));
								StdOut.println("You lost!");
								StdDraw.close();
								exit();
								System.exit(0);
							}
							if (GameOver(board)) {
								StdOut.println("You won!");
								StdAudio.play("sounds/win.wav");
								StdDraw.close();
								exit();
								System.exit(0);
							}
							StdDraw.clear(StdDraw.LIGHT_GRAY);
							StdDraw.setPenRadius(0.02);
							StdDraw.setPenColor(StdDraw.BLACK);
							StdDraw.line(0, 0, 0, row);
							StdDraw.line(0, row, column, row);
							StdDraw.line(column, row, column, 0);
							StdDraw.line(0, 0, column, 0);
	        				DrawBoard(reverse_it(board));
	        				StdAudio.play("sounds/moves.wav");
	    				    StdDraw.show(20);
	    				    
	        				break;
	        			case 'j'://down
	        				if (PlayerRow < board.length - 1) {
								board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
								PlayerRow++;
								board[PlayerRow][PlayerColumn] += "Y";
								
							} else {
								board[PlayerRow][PlayerColumn] = removeCharAt(board[PlayerRow][PlayerColumn],board[PlayerRow][PlayerColumn].indexOf("Y"));
								board[0][PlayerColumn] += "Y";
								PlayerRow = 0;
							}
	        				if (U) {
								VerticalUpMover(board);
							}
							if (D) {
								VerticalDownMover(board);
							}
							if (L) {
								VerticalLeftMover(board);
							}
							if (R) {
								VerticalRightMover(board);
							}
	        				if(checkKeys(board)) {
								UpdatePorts(board);
							}
							vSwitchers(board);
							if (gameLose(board)) { //checking if player moved into any obstacles
								StdAudio.play("sounds/lose.wav");
								StdOut.println("You lost!");
								StdDraw.close();
								exit();
								System.exit(0);
							}
							if (GameOver(board)) {
								StdOut.println("You won!");
								StdAudio.play("sounds/win.wav");
								StdDraw.close();
								exit();
								System.exit(0);
							}
	        				StdDraw.clear(StdDraw.LIGHT_GRAY);
	        				
	        				StdDraw.setPenRadius(0.02);
	        				StdDraw.setPenColor(StdDraw.BLACK);
	        				StdDraw.line(0, 0, 0, row);
	        				StdDraw.line(0, row, column, row);
	        				StdDraw.line(column, row, column, 0);
	        				StdDraw.line(0, 0, column, 0);
	        				DrawBoard(reverse_it(board));
	        				StdAudio.play("sounds/moves.wav");
	    				    StdDraw.show(20);
	        				
	        				break;
	        			case 'q': //quit
	        				StdDraw.close();
	        				exit();
	        				System.exit(0);
	        				break;        				
	        		}
	        	}
	        }
		}
}
public static  void exit() {
	//This method is used to pause the game for 3 seconds to allow for the lose/win sound to play
	try {
		Thread.sleep(3000); // for this code to work it has to be in a try and catch blocks
	}catch(Exception e) {
		
	}
	
}

public static String[][] reverse_it(String[][] my_array){
/**
 * This function is used to reverse the board so that the pieces are drawn according the specifications
 * The function takes in an 2D string array and return the reverse 2D array
 */
	int my_rows = my_array.length;
	    int my_cols = my_array[0].length;
	    String array[][]=new String [my_rows][my_cols];
	    for(int i = my_rows-1; i >= 0; i--) {
	        for(int j = my_cols-1; j >= 0; j--) {
	            array[my_rows-1-i][j] = my_array[i][j];
	        }
	    }
	    return array;
}

public static boolean GameOver(String[][] board) {
	//This method checks if the player has moved into the target
	for(int i=0;i< board.length;i++) {
		for(int j=0; j< board[i].length;j++) {						
			if(board[i][j].contains("Y") && board[i][j].contains("t")) {
				return true; //return true if its true
			} 
		}
	}
	return false; //else false
}

public static void ChangeMovers(String[][] board){
	//This method is used to change all movers to m
	for(int i=0;i<board.length;i++){
		for(int j=0;j<board[0].length;j++){
			if(board[i][j].contains("U")){
				board[i][j] = board[i][j].replace('U','m');
			}
			if(board[i][j].contains("u")){
				board[i][j] = board[i][j].replace('u','m');
			}
			if(board[i][j].contains("D")){
				board[i][j] = board[i][j].replace('D','m');
			}
			if(board[i][j].contains("d")){
				board[i][j] = board[i][j].replace('d','m');
			}
			if(board[i][j].contains("R")){
				board[i][j] = board[i][j].replace('R','m');
			}
			if(board[i][j].contains("r")){
				board[i][j] = board[i][j].replace('r','m');
			}
			if(board[i][j].contains("L")){
				board[i][j] = board[i][j].replace('L','m');
			}
			if(board[i][j].contains("l")){
				board[i][j] = board[i][j].replace('l','m');
			}
			if(board[i][j].contains("v")) {
				board[i][j] = board[i][j].replace("v", "s");
			}
			if(board[i][j].contains("h")) {
				board[i][j] = board[i][j].replace("h", "s");
			}
			if(board[i][j].contains("V")) {
				board[i][j] = board[i][j].replace("V", "S");
			}
			if(board[i][j].contains("H")) {
				board[i][j] = board[i][j].replace("H", "S");
			}
			
		}
	}
}

public static void printBoard(String[][] array) {
/**
 * The method takes in a 2D string array and prints out the elements in a table format	
 */
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			//Printing out last element in the cell
			if(array[i][j].length()>1){
				if(array[i][j].contains("Y")){
					StdOut.print("Y");
				}
				else{
					System.out.print(array[i][j].charAt(array[i][j].length()-1));
				}
			}
			else if(array[i][j].length()==1){
				//In case Y is not the last piece in the cell    	
				if(array[i][j].contains("Y")){ 
					StdOut.print("Y");
				}
				else if(array[i][j].contains("t") && !array[i][j].contains("Y")) {
					StdOut.print("t");
				}
				else if(array[i][j].equals(" ")) { //If the cell is null because I removed everything
					StdOut.print(".");
				}
				else{
					System.out.print(array[i][j]);}
			}
			else if (array[i][j].length()==0) {
				StdOut.print(".");
			}
		}
		System.out.println();
	}
}

	
public static boolean gameLose(String[][] board) {
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[0].length;j++) {
/**
 * This method checks if the player moved in the same cell as an dangerous pieces
 * Takes 2d string array and returns true if player is in the same cell as an dangerous piece otherwise false
 * as well as making sure the player didn't move in the same cell as			
 */
			if(board[i][j].contains("Y")&& (board[i][j].contains("x") )) {
				return true;
			}
			if(board[i][j].contains("u") && board[i][j].contains("Y")&& !( board[i][j].contains("t"))){
				return true;
			}
			if(board[i][j].contains("U") && board[i][j].contains("Y")&& !( board[i][j].contains("t"))){
				return true;
			}
			if(board[i][j].contains("D") && board[i][j].contains("Y")&& !( board[i][j].contains("t"))){
				return true;
			}
			if(board[i][j].contains("d") && board[i][j].contains("Y")&& !( board[i][j].contains("t"))){
				return true;
			}
			if(board[i][j].contains("R") && board[i][j].contains("Y")&& !( board[i][j].contains("t"))){
				return true;
			}
			if(board[i][j].contains("r") && board[i][j].contains("Y")&& !( board[i][j].contains("t"))){
				return true;
			}
			if(board[i][j].contains("L") && board[i][j].contains("Y")&& !( board[i][j].contains("t"))){
				return true;
			}
			if(board[i][j].contains("l") && board[i][j].contains("Y") && !( board[i][j].contains("t"))){
				return true;
			}
			if(board[i][j].contains("v") && board[i][j].contains("Y") && !( board[i][j].contains("t"))){
				return true;
			}
			if(board[i][j].contains("h") && board[i][j].contains("Y") && !( board[i][j].contains("t"))){
				return true;
			}
			if(board[i][j].contains("p") && board[i][j].contains("Y") && !( board[i][j].contains("t"))){
				return true;
			}
		}
	}
	return false;
}

public static String removeCharAt(String s, int i) {
	if (i == 0) {
		return s.substring(1);
	}
	if (i == s.length() - 1) {
		return s.substring(0, s.length() - 1); // up to and excluding the last char
	}
	// up to and excluding char at i, then concatenate from char at i + 1 to the end of the String
	return s.substring(0, i) + s.substring(i + 1);
}
//horizontal movers
public static void HorizontalDownMover(String[][] board) {
	  String[] temp = new String[board[0].length];
    for(int k=0;k<temp.length;k++) {
    	temp[k]= ".";
    }
    for (int i = 0; i < board[0].length; i ++) {//storing top row in temp array for wrapping
        if ( board[board.length-1][i].contains("d")) {
            temp[i] = "d";
            board[board.length-1][i] = SU23605383.removeCharAt(board[board.length-1][i], board[board.length-1][i].indexOf("d"));
        }
    }
    for (int j =board.length-2; j >= 0; j--) {//moving U's in non-top-rows
        for (int i = 0; i < board[0].length; i ++) {
            if (board[j][i].contains("d")) {
                    board[j + 1][i] += "d";
                    board[j][i] = SU23605383.removeCharAt(board[j][i], board[j][i].indexOf("d"));
            }
        }
    }

    for (int i = 0; i < board[0].length; i++) {//placing wrapped d's in top row
        if (temp[i].contains("d")) {
            board[0][i] += "d";
        }
    }
}
 
public static void HorizontalLeftMover(String[][] board) {
	int MoverRow=0; int MoverColumn=0;
	for(int i =0;i< board.length;i++){ //Finding the position of the Mover first
		for(int j=0;j< board[0].length;j++) {
			if(board[i][j].contains("l")) {
				MoverRow=i; MoverColumn=j;}}}
	if(MoverColumn>0) {
		board[MoverRow][MoverColumn] = SU23605383.removeCharAt(board[MoverRow][MoverColumn], board[MoverRow][MoverColumn].indexOf("l"));
		board[MoverRow][MoverColumn-1] += "l";
	}
	else {
		board[MoverRow][MoverColumn]= SU23605383.removeCharAt(board[MoverRow][MoverColumn], board[MoverRow][MoverColumn].indexOf("l"));
		board[MoverRow][board[1].length-1] += "l";
	} 
}

public static void HorizontalUpMover(String[][] board) { 
	  int MoverRow=0; int MoverColumn=0;
    //Well I did this method like this so that I can keep my previous code that worked for the other board files except board 14
    boolean[][] temp = new boolean[board.length][board[0].length];
    
    for(int i=0;i<temp.length;i++){
        for(int j=0;j<temp[i].length;j++){
            temp[i][j]= true;
        }
    }
    
    String[] FirstRow = new String[board[0].length];

    for(int a =0;a < FirstRow.length;a++) {
    	FirstRow[a] = ".";
    }

    for(int w=0;w<FirstRow.length;w++){
        if(board[0][w].contains("u")){
            FirstRow[w] = "u";
        }
    }
    for(int k=1;k<board.length;k++){
        for(int l=0;l<board[k].length;l++){
            if(temp[k][l]){
                if(board[k][l].contains("u")){
                    MoverRow= k; MoverColumn=l;
                    board[MoverRow][MoverColumn] = SU23605383.removeCharAt( board[MoverRow][MoverColumn],board[MoverRow][MoverColumn].indexOf("u"));
                    board[MoverRow-1][MoverColumn] += "u";
                    temp[MoverRow-1][MoverColumn] = false;
                }
            }
        }
    }
    for(int r=0;r< FirstRow.length;r++){
        if(FirstRow[r].contains("u")){
            board[0][r] = SU23605383.removeCharAt( board[0][r],board[0][r].indexOf("u"));
            board[board.length-1][r] += "u";
            temp[board.length-1][r] = false;
        }
    }
}

public static void HorizontalRightMover(String[][] board) {
	 int MoverRow=0; int MoverColumn=0;
	 for(int i =0;i< board.length;i++){ //Finding the position of the Mover first
	    	
		 for(int j=0;j< board[0].length;j++) {
	    
			 if(board[i][j].contains("r")) {
	 
				 MoverRow=i; MoverColumn=j;}}}
	 if(MoverColumn< board[0].length-1) {
		 board[MoverRow][MoverColumn] =SU23605383.removeCharAt(board[MoverRow][MoverColumn], board[MoverRow][MoverColumn].indexOf("r"));
		 board[MoverRow][MoverColumn+1] += "r";
	 }
	    
	 else {
		 board[MoverRow][MoverColumn]= SU23605383.removeCharAt(board[MoverRow][MoverColumn], board[MoverRow][MoverColumn].indexOf("r"));
		 board[MoverRow][0] += "r";
	 }
}

//Vertical movers
public static void VerticalLeftMover(String[][] board) {
	int MoverRow=0; int MoverColumn=0;
	for(int i =0;i< board.length;i++){ //Finding the position of the Mover first
		for(int j=0;j< board[0].length;j++) {
			if(board[i][j].contains("L")) {
				MoverRow=i; MoverColumn=j;}}}
	if(MoverColumn>0) {
		board[MoverRow][MoverColumn] = SU23605383.removeCharAt(board[MoverRow][MoverColumn], board[MoverRow][MoverColumn].indexOf("L"));
		board[MoverRow][MoverColumn-1] += "L";
	}
	else {
		board[MoverRow][MoverColumn]= SU23605383.removeCharAt(board[MoverRow][MoverColumn], board[MoverRow][MoverColumn].indexOf("L"));
		board[MoverRow][board[0].length-1] += "L";
	} 
}
	  
public static void VerticalRightMover(String[][] board) {
		 
		 int MoverRow=0; int MoverColumn=0;
		 for(int i =0;i< board.length;i++){ //Finding the position of the Mover first
		    	
			 for(int j=0;j< board[0].length;j++) {
		    
				 if(board[i][j].contains("R")) {
					 MoverRow=i; MoverColumn=j;}}}
		 if(MoverColumn< board[0].length-1) {
			 board[MoverRow][MoverColumn] = SU23605383.removeCharAt(board[MoverRow][MoverColumn], board[MoverRow][MoverColumn].indexOf("R"));
			 board[MoverRow][MoverColumn+1] += "R";
		 }
		    
		 else {
			 board[MoverRow][MoverColumn]= SU23605383.removeCharAt(board[MoverRow][MoverColumn], board[MoverRow][MoverColumn].indexOf("R"));
			 board[MoverRow][0] += "R";
		 }
	 }
	 	 
public static void VerticalDownMover(String[][] board) { //Vertical down mover
		 
			 String[] temp = new String[board[0].length];
			 for(int i=0;i<temp.length;i++){
	            temp[i]= ".";
			 }
			 for (int i = 0; i < board[0].length; i ++) {//storing top row in temp array for wrapping
				 if ( board[board.length-1][i].contains("D")) {
					 temp[i] = "D";
					 board[board.length-1][i] = removeCharAt(board[board.length-1][i], board[board.length-1][i].indexOf("D"));
				 }
			 }
			 for (int j =board.length-2; j >= 0; j--) {//moving U's in non-top-rows
				 for (int i = 0; i < board[0].length; i ++) {
					 if (board[j][i].contains("D")) {
						 board[j + 1][i] += "D";
						 board[j][i] = removeCharAt(board[j][i], board[j][i].indexOf("D"));
					 }  
				 }
			 }
			 for (int i = 0; i < board[0].length; i++) {//placing wrapped d's in top row
				 if (temp[i].contains("D")) {
					 board[0][i] += "D";
				 }
			 }
	 }

public static void VerticalUpMover(String[][] board) {
	 
		 String[] temp = new String[board[0].length];
	        for(int i=0;i<temp.length;i++){
	            temp[i]= ".";
	        }
	        for (int i = 0; i < board[0].length; i ++) {//storing top row in temp array for wrapping
	            if ( board[0][i].contains("U")) {
	                temp[i] = "U";
	                board[0][i] = removeCharAt(board[0][i], board[0][i].indexOf("U"));
	            }
	        }
	        for (int j = 1; j < board.length; j++) {//moving U's in non-top-rows
	            for (int i = 0; i < board[0].length; i ++) {
	                if (board[j][i].contains("U")) {
	                    board[j-1][i] += "U";
	                    board[j][i] = removeCharAt(board[j][i], board[j][i].indexOf("U"));
	                }
	            }
	        }

	        for (int i = 0; i < board[0].length; i++) {//placing wrapped u's in bottom row
	            if (temp[i].contains("U")) {
	                board[board.length-1][i] += "U";
	            }
	        }
	
}

	

}

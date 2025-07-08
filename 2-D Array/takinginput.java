Scanner sc = new Scanner(System.in);
		System.out.println("How many rows?");
		int row = sc.nextInt();
		System.out.println("How many columns?");
		int column = sc.nextInt();
		int [][] matrix1 = new int [row][column];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
                 System.out.print("Enter the element at " + i + "th row" + j +"th column");
				matrix1[i][j]=sc.nextInt();
			}
		}
import java.awt.Rectangle;

import javax.swing.JFrame;

public class DominoTest 
{

	public static void main(String[] args) 
	{
		DominoTile Domino_plate_1 = new DominoTile(4, 5 );
		DominoTile Domino_plate_2 = new DominoTile(5, 5 );
		DominoTile Domino_plate_3 = new DominoTile(5, 6 );
		DominoTile Domino_plate_4 = new DominoTile(2, 4 );

		
		
		DominoTable tbl = new DominoTable();
		tbl.addLeft(Domino_plate_1);
		tbl.addRight(Domino_plate_2);
		tbl.addRight(Domino_plate_3);
		//tbl.addLeft(Domino_plate_4);

	
		JFrame window = new JFrame();
		window.setBounds(400, 60, 700, 700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLayout(null);

		DominoTableView table = new DominoTableView(new Rectangle(90,70,500,500),tbl);
		window.add(table);
		window.repaint();
		
		//DominoAction da = new DominoAction();
		//tbl.addTableEventListener(da);
		
		
	}

}

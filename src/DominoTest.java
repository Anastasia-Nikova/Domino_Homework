
public class DominoTest 
{

	public static void main(String[] args) 
	{
		DominoTile Domino_plate_1 = new DominoTile(4, 5 );
		DominoTile Domino_plate_2 = new DominoTile(4, 5 );
		Domino_plate_1.swapValues();
		System.out.println(Domino_plate_1.toString());
		System.out.println(Domino_plate_1.equals(Domino_plate_2));
		
	}

}

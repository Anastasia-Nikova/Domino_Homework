import java.util.Random;
public class DominoTable 
{
	public static final int Domino_Tile_Max_Counter = 28;
	DominoTile[] domino_tiles = new DominoTile[Domino_Tile_Max_Counter];
	DominoTile[] domino_tiles_table = new DominoTile[Domino_Tile_Max_Counter];
	Random random = new Random();
	int random_tile = random.nextInt(29);
	int counter = 0;
	
	public void initializeTiles()
	{//
		for (int i = 0; i < domino_tiles.length; i++ )
		{
			for ( int k = DominoTile.Min_Tile_Value ; k <= DominoTile.Max_Tile_Value; k++ )
			{
				for ( int g = DominoTile.Min_Tile_Value; g <= DominoTile.Max_Tile_Value; g++ )
				{
					domino_tiles[i] = new DominoTile(k, g); 
				}
			}
		}
	}
	
	public DominoTable()
	{
		int counter = Domino_Tile_Max_Counter;
		this.initializeTiles();
		domino_tiles[random_tile] = domino_tiles_table[0];
		while( counter > 0 )
		{
			if (addLeft() )
			{	
				counter--;
				continue;
			}
			if (addRight() )
			{	
				counter--;
				continue;
			}
			else 
				break;
		}
		
	}
	
	
	public boolean addLeft()
	{
		random_tile = random.nextInt(29);
		if (domino_tiles[random_tile].getIsCheck() == false)
		{
			if  ( domino_tiles_table[0].getLeftValue() == domino_tiles[random_tile].getLeftValue())
			{
				domino_tiles[random_tile].swapValues();
				for (int i = 0; i < domino_tiles_table.length; i++) 
				{                
					domino_tiles_table[i+1] = domino_tiles_table[i];
				}
				domino_tiles_table[0] = domino_tiles[random_tile]; 
				domino_tiles[random_tile] = new DominoTile(domino_tiles[random_tile].getLeftValue(),
						domino_tiles[random_tile].getRightValue(), true	);
				counter++;
				return true;
			}
			else if  ( domino_tiles_table[1].getLeftValue() == domino_tiles[random_tile].getRightValue())
			{
				for (int i = 0; i < domino_tiles_table.length; i++) 
				{                
					domino_tiles_table[i+1] = domino_tiles_table[i];
				}
				domino_tiles_table[0] = domino_tiles[random_tile];
				domino_tiles[random_tile] = new DominoTile(domino_tiles[random_tile].getLeftValue(),
														domino_tiles[random_tile].getRightValue(), true	);
				counter++;
				return true;
			}
			return false;
	
		}
		return true;
	}
	
	
	public boolean addRight()
	{
		for (int i = counter; i< domino_tiles_table.length; i++)
		{
			random_tile = random.nextInt(29);
			if  ( domino_tiles_table[i].getRightValue() == domino_tiles[random_tile].getLeftValue())
			{
				domino_tiles_table[i+1]= domino_tiles[random_tile];
				return true;
			}
			if  ( domino_tiles_table[i].getRightValue() == domino_tiles[random_tile].getRightValue())
			{
				domino_tiles[random_tile].swapValues();
				domino_tiles_table[i+1]= domino_tiles[random_tile];
				return true;
			}
		}
		return false;
	}

	
	
	

}

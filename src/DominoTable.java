
public class DominoTable 
{
	public static final int Domino_Tile_Max_Counter = 28;
	DominoTile[] domino_table;
	//TableEventListener listener;
	
	public DominoTable()
	{
		domino_table = new DominoTile[Domino_Tile_Max_Counter];
		
	}
	
	public boolean addLeft(DominoTile domino)
	{
	
			if (domino_table[0] == null)
			{ 	
				//if(listener != null)
				//{
					domino_table[0] = domino;
					return true;
				//}
			}
			if ( domino_table[0].getLeftValue() == domino.getLeftValue())
			{	
				//if(listener != null)
				//{
					domino.swapValues();
					for( int i = 0; i < domino_table.length-1; i++ ) 
					{                
						domino_table[i+1] = domino_table[i];
					}
					domino_table[0] = domino; 
					//listener.onTableChanged(this);
					return true;
				//}
			}
			else if ( domino_table[0].getLeftValue() == domino.getRightValue())
			{
				//if(listener != null)
				//{
					for( int i = 0; i < domino_table.length-1; i++ ) 
					{                
						domino_table[i+1] = domino_table[i];
					}
					domino_table[0] = domino;
				//	listener.onTableChanged(this);
					return true;
				//}
			}
			return false;
	}
	
	
	public boolean addRight(DominoTile domino)
	{
		for( int i = 0; i < domino_table.length; i++ )
		{
			if (domino_table[i] == null)
			{
				//if(listener != null)
				//{
					if (domino_table[i-1].getRightValue() == domino.getLeftValue())
					{
						domino_table[i] = domino;
						return true;
					}
					else if (domino_table[i-1].getRightValue() == domino.getRightValue())
					{
						domino.swapValues();
						domino_table[i] = domino;
						return true;
					}
				//	listener.onTableChanged(this);
				//}
				return false;
			}
		} return false;
	}


	
//	public void addTableEventListener(TableEventListener listener)
//	{
//		this.listener = listener;
//	}
	

}


public class DominoPlayer 
{
	private String nickname;
	private DominoTile[] tiles;
	private int tilesInHands;
	private DominoTable table;
	
	public DominoPlayer(String name, DominoTile[] tiles, int tilesInHands, DominoTable table)
	{
		setNickname(nickname);
		this.tiles = tiles;
		this.tilesInHands = tilesInHands;
		this.table = table;
	}
	
	public void setNickname(String nickname)
	{
		if( nickname != null || nickname.length() !=0 )
		{
			this.nickname = nickname;
		}
	}
	
	public String getNickname() 
	{
		return this.nickname;
	}
	
	public DominoTile[] getTiles()
	{
		return this.tiles;
	}
	
	public int getTilesInHands()
	{
		return this.tilesInHands;
	}
	
	public DominoTable getTable()
	{
		return this.table;
	}
	
	private int getTileIndex(DominoTile t)
	{
		for( int i = 0; i < tiles.length; i++ )
		{
			if( tiles[i] == t )
				return i;
		}
		return -1;
	}
	
	public void addTileAtLeft(DominoTile t)
	{
		if( getTileIndex(t) != -1 )
		{
			if(table.addLeft(t))
			{
				int t_index =  getTileIndex(t);
				tiles[t_index] = null;
				tilesInHands-- ;
			}
		}
	}
	
	public void addTileAtRight(DominoTile t)
	{
		if( getTileIndex(t) != -1 )
		{
			if(table.addRight(t))
			{
				int t_index =  getTileIndex(t);
				tiles[t_index] = null;
				tilesInHands-- ;
			}
		}	
	}
}

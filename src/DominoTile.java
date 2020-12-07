
public class DominoTile 
{
	private int left_value ;
	private int right_value ;
	 
	public static final int Max_Tile_Value = 6;
	public static final int Min_Tile_Value = 0;
	
	public DominoTile()
	{
		
	}
	
	public DominoTile(int left_value, int right_value )
	{
		setLeftValue(left_value);
		setRightValue(right_value);
	}
	
	public DominoTile(int left_value, int right_value, boolean isCheck )
	{
		setLeftValue(left_value);
		setRightValue(right_value);
	}
	
	private void setLeftValue (int left_value)
	{
		if (left_value >= Min_Tile_Value && left_value <=Max_Tile_Value)
		{
			this.left_value = left_value;
		}
	}
	
	private void setRightValue (int  right_value)
	{
		if (right_value >= Min_Tile_Value && right_value <=Max_Tile_Value)
		{
			this.right_value = right_value;
		}
	}
	
	public int getLeftValue()
	{
		return left_value;
	}
	
	public int getRightValue()
	{
		return right_value;
	}

	public String toString()
	{
		return "[" + left_value + "|" + right_value +"]";
	}
	
	public void swapValues()
	{
		int swap_value = left_value;
		left_value = right_value;
		right_value = swap_value;
	}
	
	public boolean equals(DominoTile domino)
	{
		if (( this.left_value == domino.right_value ) && (this.right_value == domino.left_value))
		{
			return true;	
		}
		else if (( this.left_value == domino.left_value ) && ( this.right_value == domino.right_value ))
		{
			return true;
		}
		else return false;	
	}
	
	
	
	//
}

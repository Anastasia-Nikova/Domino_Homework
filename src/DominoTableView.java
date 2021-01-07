import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.JComponent;

public class DominoTableView extends JComponent
{
	private DominoTable table;
	private final static Color BACKGROUND_COLOR = new Color(192,192,192);
	private final static Color BOARD_LINES_COLOR = new Color(83,83,83);
	
	public DominoTableView(Rectangle r,DominoTable table)
	{
		this.table = table;
		setBounds(r);
	}
	
	public void paintComponent(Graphics graphics)
	{
		
		super.paintComponent(graphics);
		Graphics2D g= (Graphics2D)graphics;

		g.setColor(BACKGROUND_COLOR);
		g.fill((new Rectangle2D.Double(5, 5, getBounds().width-10, getBounds().height-8)));
		g.setStroke(new BasicStroke(5));
		g.setColor(BOARD_LINES_COLOR);
		g.draw((new Rectangle2D.Double(5, 5, getBounds().width-10, getBounds().height-8)));
		
		g.setColor(BOARD_LINES_COLOR);
		g.fill(new Rectangle2D.Double(5, 100 , getBounds().width-10 , 5));
		g.fill(new Rectangle2D.Double(5, 390 , getBounds().width-10 , 5));
		
		this.drawTiles(g);

	}
	
	private void drawTiles(Graphics graphics)
	{
		Graphics2D g= (Graphics2D)graphics;
		for(int i = 0; i < table.domino_table.length; i++)
		{
			if(table.domino_table[i] != null)
			{
				g.setColor(Color.WHITE);
				g.fill(new Rectangle2D.Double(14+(i*60),14,50,25));
				g.setColor(Color.BLACK);
				g.setStroke(new BasicStroke(1));
				g.draw(new Rectangle2D.Double(14+(i*60),14,50,25));
				g.fill(new Rectangle2D.Double(39+(i*60),14,1,25));
				String tileInfo = String.format("%d       %d",table.domino_table[i].getLeftValue() ,
						table.domino_table[i].getRightValue());
				g.drawString(tileInfo, 20 +(i*60), 30);
			}
		}
	}
	
	
}
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.util.Random;

/**
 * Created by akhilthampy on 10/10/14.
 */
public class Game extends JApplet {
   /*
   *    int matrix to store values of tiles
   *    add_tile()
   *    merge_tiles(char dir)
   *    paint()
   * */
    public void init()
    {
     board = new Tile[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                board[i][j]= new Tile();
            }
        }
    }
    Tile[][] board;
    public void add_tile()
    {
        Random rand = new Random();
        boolean flag = false;
        int i,j;
        while(!flag)
        {
            i = rand.nextInt(3);
            j = rand.nextInt(3);
            if(board[i][j].isempty)
            {
                board[i][j].setValue(2);
                board[i][j].isempty = false;
            }
        }
    }
    public void merge(char dir)
    {}
    public void paint(Graphics g)
     {
         this.setSize(320,320);
         Color BG = new Color(0xBBADA0);
         Color empty_tile = new Color(0xCCC0B3);
         Color default_tile = new Color(0xEEE4DA);
         g.setColor(BG);
         g.drawRect(0,0,320,320);
         g.setColor(empty_tile);
         for (int i = 0; i < board.length; i++) {
             for (int j = 0; j < board[i].length; j++) {
                 if(!board[i][j].isempty)
                 {
                     g.setColor(default_tile);
                 }
                 else
                 {
                     g.setColor(empty_tile);
                 }
                 g.fillRect(i*100 + 10,j*100+ 10, 100,100);
             }
         }
     }
 }

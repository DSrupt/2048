import java.applet.Applet;
import java.awt.*;
import java.util.Random;

/**
 * Created by akhilthampy on 10/10/14.
 */
public class Game extends Applet {
    private int[][] board;

    public void init() {
        board = new int[3][3];
    }
    public void paint(Graphics g) {
        Color background = new Color(187, 173, 160);
        Color empty_tile = new Color(204, 192, 179);
        Color tile_color = new Color(238, 228, 218);

        g.setColor(background);
        g.fillRect(0, 0, 900, 900);
        g.setColor(empty_tile);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != -1) {
                    g.setColor(tile_color);
                    g.fillRect(i * 10, j * 10, 100, 100);
                }
                g.setColor(empty_tile);
                g.drawRect(i * 10, j * 10, 100, 100);
            }
        }
        repaint();
    }
    public void add_tile() {
        Random rand = new Random();
        boolean flag = false;
        while (!flag) {
            int i = rand.nextInt(3);
            int j = rand.nextInt(3);
            if (board[i][j] == -1) {
                board[i][j] = 2;
                flag = true;
            }
        }


    }

    public void merge(int x1, int y1, int x2, int y2, char dir) {
    }
}

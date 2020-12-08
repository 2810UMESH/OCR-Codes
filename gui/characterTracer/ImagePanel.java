package net.umeshgarg.javaocr.gui.characterTracer;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 * JPanel for showing images.
 */
public class ImagePanel extends JPanel
{
    private BufferedImage img;
    public static final long serialVersionUID = 0;

    public ImagePanel(BufferedImage img)
    {
        this.img = img;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.drawImage(img, 0, 0, null);
    }
    private static final Logger LOG = Logger.getLogger(ImagePanel.class.getName());
}

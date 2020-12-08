package net.umeshgarg.javaocr;

import java.util.logging.Logger;
import net.umeshgarg.javaocr.gui.GUIController;

/**
 * Launches the GUI controller for the javaocr toolkit.
 */
public class main
{

    public main()
    {
    }

    /**
     * Main method of application.
     * @param args none needed
     */
    public static void main(String[] args)
    {
        //Create GUI Controller
        GUIController guiController = new GUIController();
        guiController.showGUI();
    }
    private static final Logger LOG = Logger.getLogger(main.class.getName());
}

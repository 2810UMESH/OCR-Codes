package net.umeshgarg.javaocr.gui.meanSquareOCR;

import java.util.logging.Logger;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.CharacterRange;

/**
 * A data structure to hold the file name and character range of training data.
 */
public class TrainingImageSpec
{

    private String fileLocation;
    private CharacterRange charRange;

    /**
     * @return the charRange
     */
    public CharacterRange getCharRange()
    {
        return charRange;
    }

    /**
     * @param charRange the charRange to set
     */
    public void setCharRange(CharacterRange charRange)
    {
        this.charRange = charRange;
    }

    /**
     * @return the fileLocation
     */
    public String getFileLocation()
    {
        return fileLocation;
    }

    /**
     * @param fileLocation the fileLocation to set
     */
    public void setFileLocation(String fileLocation)
    {
        this.fileLocation = fileLocation;
    }
    private static final Logger LOG = Logger.getLogger(TrainingImageSpec.class.getName());
}

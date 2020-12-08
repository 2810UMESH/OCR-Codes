package net.umeshgarg.javaocr.ocrPlugins.aspectRatio;

import java.util.logging.Logger;

/**
 * Provides a way to store information about a character and its ratio.
 */
public class CharacterRatio implements Comparable<CharacterRatio>
{

    private char character;
    private double ratio;
    private static final Logger LOG = Logger.getLogger(CharacterRatio.class.getName());

    public CharacterRatio(char character, double ratio)
    {
        this.character = character;
        this.ratio = ratio;
    }

    public char getCharacter()
    {
        return character;
    }

    public double getRatio()
    {
        return ratio;
    }

    public int compareTo(CharacterRatio other)
    {
        if (ratio < other.getRatio())
        {
            return -1;
        }
        else if (ratio == other.getRatio())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}

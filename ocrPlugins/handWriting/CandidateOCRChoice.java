package net.umeshgarg.javaocr.ocrPlugins.handWriting;

import java.util.ArrayList;
import java.util.logging.Logger;
import net.sourceforge.javaocr.scanner.accuracy.OCRIdentification;

/**
 * Provides the different choices you have to determine a character.
 */
public class CandidateOCRChoice
{

    private ArrayList<OCRIdentification> rankedIdentList = new ArrayList<OCRIdentification>();
    private static final Logger LOG = Logger.getLogger(CandidateOCRChoice.class.getName());

    public ArrayList<OCRIdentification> getRankedIdentList()
    {
        return rankedIdentList;
    }

    public void addOCRIdent(OCRIdentification currIdent)
    {
        rankedIdentList.add(currIdent);
    }
  
}

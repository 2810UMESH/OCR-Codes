package net.umeshgarg.javaocr.scanner.accuracy;

/**
 * Provides an interface that allows implementers to receive information
 * char by char about the quality of the recognition.
 */
public interface AccuracyListener
{
    public void processCharOrSpace(OCRIdentification identAccuracy);
}

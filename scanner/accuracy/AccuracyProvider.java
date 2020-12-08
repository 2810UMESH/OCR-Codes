package net.umeshgarg.javaocr.scanner.accuracy;

/**
 * Interface to be used by OCR recognizers to accept an accuracy listener to
 * report information to.
 */
public interface AccuracyProvider
{

    public void acceptAccuracyListener(AccuracyListener listener);
}

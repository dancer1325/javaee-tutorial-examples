package javaeetutorial.batch.simple;

import java.io.Serializable;

/**
 * Uses
 *  1. keep tracking of the line number in a .txt
 */
public class MyCheckpoint implements Serializable {
    private long lineNum = 0;
    public void increase() { lineNum++; }
    public long getLineNum() { return lineNum; }
}

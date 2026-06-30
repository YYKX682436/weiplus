package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

/* loaded from: classes8.dex */
public class ParseException extends java.lang.Exception {
    public int curline;

    public ParseException(java.lang.String str, java.lang.Exception exc, int i17) {
        super(str, exc);
        this.curline = i17;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return super.getMessage() + " line: " + this.curline;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "ParseException{message = " + getMessage() + "}";
    }
}

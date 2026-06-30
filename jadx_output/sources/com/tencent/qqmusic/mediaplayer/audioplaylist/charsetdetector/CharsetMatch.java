package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

/* loaded from: classes16.dex */
public class CharsetMatch implements java.lang.Comparable<com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch> {
    private java.lang.String fCharsetName;
    private int fConfidence;
    private java.io.InputStream fInputStream;
    private java.lang.String fLang;
    private byte[] fRawInput;
    private int fRawLength;

    public CharsetMatch(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer charsetRecognizer, int i17) {
        this.fRawInput = null;
        this.fInputStream = null;
        this.fConfidence = i17;
        java.io.InputStream inputStream = charsetDetector.fInputStream;
        if (inputStream == null) {
            this.fRawInput = charsetDetector.fRawInput;
            this.fRawLength = charsetDetector.fRawLength;
        }
        this.fInputStream = inputStream;
        this.fCharsetName = charsetRecognizer.getName();
        this.fLang = charsetRecognizer.getLanguage();
    }

    public int getConfidence() {
        return this.fConfidence;
    }

    public java.lang.String getLanguage() {
        return this.fLang;
    }

    public java.lang.String getName() {
        return this.fCharsetName;
    }

    public java.io.Reader getReader() {
        java.io.InputStream inputStream = this.fInputStream;
        if (inputStream == null) {
            inputStream = new java.io.ByteArrayInputStream(this.fRawInput, 0, this.fRawLength);
        }
        try {
            inputStream.reset();
            return new java.io.InputStreamReader(inputStream, getName());
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public java.lang.String getString() {
        return getString(-1);
    }

    @Override // java.lang.Comparable
    public int compareTo(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch charsetMatch) {
        int i17 = this.fConfidence;
        int i18 = charsetMatch.fConfidence;
        if (i17 > i18) {
            return 1;
        }
        return i17 < i18 ? -1 : 0;
    }

    public java.lang.String getString(int i17) {
        if (this.fInputStream != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            char[] cArr = new char[1024];
            java.io.Reader reader = getReader();
            if (i17 < 0) {
                i17 = Integer.MAX_VALUE;
            }
            while (true) {
                int read = reader.read(cArr, 0, java.lang.Math.min(i17, 1024));
                if (read >= 0) {
                    sb6.append(cArr, 0, read);
                    i17 -= read;
                } else {
                    reader.close();
                    return sb6.toString();
                }
            }
        } else {
            java.lang.String name = getName();
            int indexOf = name.indexOf(name.indexOf("_rtl") < 0 ? "_ltr" : "_rtl");
            if (indexOf > 0) {
                name = name.substring(0, indexOf);
            }
            return new java.lang.String(this.fRawInput, name);
        }
    }

    public CharsetMatch(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer charsetRecognizer, int i17, java.lang.String str, java.lang.String str2) {
        this.fRawInput = null;
        this.fInputStream = null;
        this.fConfidence = i17;
        java.io.InputStream inputStream = charsetDetector.fInputStream;
        if (inputStream == null) {
            this.fRawInput = charsetDetector.fRawInput;
            this.fRawLength = charsetDetector.fRawLength;
        }
        this.fInputStream = inputStream;
        this.fCharsetName = str;
        this.fLang = str2;
    }
}

package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

/* loaded from: classes13.dex */
public abstract class AudioPlayListItemParser {
    public static final java.lang.String TAG = "AudioListItemParser";
    protected com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector = new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector();
    protected java.lang.String mUri;

    public static java.lang.String delSeprator(java.lang.String str) {
        return str.substring(str.indexOf("\"") + 1, str.lastIndexOf("\""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x003f -> B:12:0x0056). Please report as a decompilation issue!!! */
    public java.lang.String guessCharsetEncoding(java.io.InputStream inputStream) {
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.String str = "unicode";
        java.io.BufferedInputStream bufferedInputStream2 = null;
        java.io.BufferedInputStream bufferedInputStream3 = null;
        java.io.BufferedInputStream bufferedInputStream4 = null;
        bufferedInputStream2 = null;
        try {
            try {
                try {
                    bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            } catch (java.io.IOException e17) {
                e = e17;
            }
        } catch (java.io.IOException e18) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "guess encoding close fis ex", e18);
            bufferedInputStream2 = bufferedInputStream2;
        }
        try {
            this.charsetDetector.setText(bufferedInputStream);
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch detect = this.charsetDetector.detect();
            if (detect != null) {
                int confidence = detect.getConfidence();
                str = detect.getName();
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "Audio list file encode: " + str + " ,confidence: " + confidence);
                bufferedInputStream3 = confidence;
            }
            bufferedInputStream.close();
            bufferedInputStream2 = bufferedInputStream3;
        } catch (java.io.IOException e19) {
            e = e19;
            bufferedInputStream4 = bufferedInputStream;
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "guess encoding ex", e);
            bufferedInputStream2 = bufferedInputStream4;
            if (bufferedInputStream4 != null) {
                bufferedInputStream4.close();
                bufferedInputStream2 = bufferedInputStream4;
            }
            return str;
        } catch (java.lang.Throwable th7) {
            th = th7;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (java.io.IOException e27) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "guess encoding close fis ex", e27);
                }
            }
            throw th;
        }
        return str;
    }

    public abstract boolean isParseSuccess();

    public abstract java.util.Iterator<com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo> iterator();

    public abstract void parse();
}

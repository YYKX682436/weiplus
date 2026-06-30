package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public abstract class CharsetRecognizer {
    public java.lang.String getLanguage() {
        return null;
    }

    public abstract java.lang.String getName();

    public abstract com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector);
}

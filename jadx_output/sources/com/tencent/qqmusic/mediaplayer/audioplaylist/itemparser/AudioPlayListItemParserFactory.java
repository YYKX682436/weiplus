package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

/* loaded from: classes13.dex */
public class AudioPlayListItemParserFactory {
    public static com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser createParser(java.lang.String str) {
        if (str.startsWith("http") || !str.endsWith(".cue")) {
            return null;
        }
        return new com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.CueItemParser(str);
    }
}

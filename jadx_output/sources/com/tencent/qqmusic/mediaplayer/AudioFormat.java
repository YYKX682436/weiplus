package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class AudioFormat {
    private static final java.lang.String EXTENSION_AAC = "aac";
    private static final java.lang.String EXTENSION_AMR = "amr";
    private static final java.lang.String EXTENSION_APE = "ape";
    private static final java.lang.String EXTENSION_FLAC = "flac";
    private static final java.lang.String EXTENSION_M4A = "m4a";
    private static final java.lang.String EXTENSION_MP3 = "mp3";
    private static final java.lang.String EXTENSION_MP4 = "mp4";
    private static final java.lang.String EXTENSION_OGG = "ogg";
    private static final java.lang.String EXTENSION_WAV = "wav";
    private static final java.lang.String EXTENSION_WMA = "wma";
    private static final int VALUE_AAC = 11;
    private static final int VALUE_AMR = 6;
    private static final int VALUE_APE = 5;
    private static final int VALUE_FLAC = 2;
    private static final int VALUE_M4A = 3;
    private static final int VALUE_MP3 = 9;
    private static final int VALUE_MP4 = 10;
    private static final int VALUE_OGG = 4;
    private static final int VALUE_UNSUPPORT = 1;
    private static final int VALUE_WAV = 8;
    private static final int VALUE_WMA = 7;

    /* loaded from: classes13.dex */
    public enum AudioType {
        UNSUPPORT(1, "Unknown"),
        MP3(9, com.tencent.qqmusic.mediaplayer.AudioFormat.EXTENSION_MP3),
        OGG(4, com.tencent.qqmusic.mediaplayer.AudioFormat.EXTENSION_OGG),
        M4A(3, com.tencent.qqmusic.mediaplayer.AudioFormat.EXTENSION_M4A),
        FLAC(2, com.tencent.qqmusic.mediaplayer.AudioFormat.EXTENSION_FLAC),
        APE(5, com.tencent.qqmusic.mediaplayer.AudioFormat.EXTENSION_APE),
        WAV(8, com.tencent.qqmusic.mediaplayer.AudioFormat.EXTENSION_WAV),
        WMA(7, com.tencent.qqmusic.mediaplayer.AudioFormat.EXTENSION_WMA),
        AMR(6, com.tencent.qqmusic.mediaplayer.AudioFormat.EXTENSION_AMR),
        MP4(10, com.tencent.qqmusic.mediaplayer.AudioFormat.EXTENSION_MP4),
        AAC(11, com.tencent.qqmusic.mediaplayer.AudioFormat.EXTENSION_AAC);

        private java.lang.String extension;
        private int value;

        AudioType(int i17, java.lang.String str) {
            this.value = i17;
            this.extension = str;
        }

        public java.lang.String getExtension() {
            return this.extension;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(int i17) {
        for (com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType : com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.values()) {
            if (audioType.value == i17) {
                return audioType;
            }
        }
        return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
    }

    public static boolean isAudioType(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType) {
        return (audioType == null || com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT.equals(audioType)) ? false : true;
    }
}

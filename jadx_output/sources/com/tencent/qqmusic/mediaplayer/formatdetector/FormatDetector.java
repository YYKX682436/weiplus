package com.tencent.qqmusic.mediaplayer.formatdetector;

/* loaded from: classes13.dex */
public class FormatDetector {
    private static final java.lang.String TAG = "FormatDetector";
    private static final com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector mInstance = new com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector();
    public static boolean sIsLoadSuccess;

    static {
        sIsLoadSuccess = false;
        sIsLoadSuccess = com.tencent.qqmusic.mediaplayer.NativeLibs.loadAll(com.tencent.qqmusic.mediaplayer.NativeLibs.audioCommon, com.tencent.qqmusic.mediaplayer.NativeLibs.formatDetector);
    }

    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioFormat(java.lang.String str) {
        return getAudioFormat(str, true);
    }

    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String str) {
        com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType = null;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (sIsLoadSuccess) {
            com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioFormat = getAudioFormat(str);
            if (com.tencent.qqmusic.mediaplayer.AudioFormat.isAudioType(audioFormat)) {
                audioType = audioFormat;
            }
        }
        return !com.tencent.qqmusic.mediaplayer.AudioFormat.isAudioType(audioType) ? getAudioTypeFromExtension(str.substring(str.lastIndexOf(46) + 1).toLowerCase()) : audioType;
    }

    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioTypeFromExtension(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType : com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.values()) {
            if (audioType.getExtension().equalsIgnoreCase(str)) {
                return audioType;
            }
        }
        return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
    }

    private native int getFormat(java.lang.String str, boolean z17);

    private native int getFormatFromDataSource(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource, boolean z17);

    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioFormat(java.lang.String str, boolean z17) {
        if (str != null) {
            try {
                return com.tencent.qqmusic.mediaplayer.AudioFormat.getAudioType(mInstance.getFormat(str, z17));
            } catch (java.lang.UnsatisfiedLinkError e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
                return com.tencent.qqmusic.mediaplayer.AudioRecognition.guessFormat(str);
            }
        }
        throw new java.lang.IllegalArgumentException("filePath can't be null!");
    }

    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioFormat(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource, boolean z17) {
        if (iDataSource != null) {
            com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
            try {
                return com.tencent.qqmusic.mediaplayer.AudioFormat.getAudioType(mInstance.getFormatFromDataSource(iDataSource, z17));
            } catch (java.lang.UnsatisfiedLinkError e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
                return audioType;
            }
        }
        throw new java.lang.IllegalArgumentException("dataSource can't be null!");
    }

    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        if (iDataSource != null) {
            com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
            if (!sIsLoadSuccess) {
                return audioType;
            }
            com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioFormat = getAudioFormat(iDataSource, false);
            return com.tencent.qqmusic.mediaplayer.AudioFormat.isAudioType(audioFormat) ? audioFormat : audioType;
        }
        throw new java.lang.IllegalArgumentException("dataSource can't be null!");
    }
}

package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class AudioPlayerConfigure {
    private static final java.lang.String LIB_PREFIX = "lib";
    private static final java.lang.String LIB_SUFFIX = ".so";
    private static final java.lang.String TAG = "AudioPlayerConfigure";
    static com.tencent.qqmusic.mediaplayer.ISoLibraryLoader mISoLibraryLoader = new com.tencent.qqmusic.mediaplayer.ISoLibraryLoader() { // from class: com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.1
        private byte _hellAccFlag_;

        @Override // com.tencent.qqmusic.mediaplayer.ISoLibraryLoader
        public java.lang.String findLibPath(java.lang.String str) {
            if (!str.startsWith("lib")) {
                str = "lib".concat(str);
            }
            return !str.endsWith(com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.LIB_SUFFIX) ? str.concat(com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.LIB_SUFFIX) : str;
        }

        @Override // com.tencent.qqmusic.mediaplayer.ISoLibraryLoader
        public boolean load(java.lang.String str) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/qqmusic/mediaplayer/AudioPlayerConfigure$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/qqmusic/mediaplayer/AudioPlayerConfigure$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return true;
        }
    };
    static int minAudioTrackWaitTimeMs = 300;
    private static com.tencent.qqmusic.mediaplayer.IAudioTrackCreator sAudioTrackCreator;
    private static boolean sIsNlogEnabled;

    public static boolean enableNativeLog(java.lang.String str) {
        return enableNativeLog(com.tencent.qqmusic.mediaplayer.NativeLibs.nlog.getName(), str);
    }

    private static byte[] findLibPath(byte[] bArr) {
        return mISoLibraryLoader.findLibPath(new java.lang.String(bArr)).getBytes();
    }

    public static com.tencent.qqmusic.mediaplayer.IAudioTrackCreator getAudioTrackCreator() {
        return sAudioTrackCreator;
    }

    public static com.tencent.qqmusic.mediaplayer.ISoLibraryLoader getSoLibraryLoader() {
        return mISoLibraryLoader;
    }

    public static void setAudioTrackCreator(com.tencent.qqmusic.mediaplayer.IAudioTrackCreator iAudioTrackCreator) {
        sAudioTrackCreator = iAudioTrackCreator;
    }

    public static void setAudioTrackMinWaitTimeMs(int i17) {
        minAudioTrackWaitTimeMs = i17;
    }

    public static void setLog(com.tencent.qqmusic.mediaplayer.ILog iLog) {
        if (iLog != null) {
            iLog.i(TAG, "QQMusicAudioPlayer codec version:1.30.31");
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.setLog(iLog);
    }

    public static void setSoLibraryLoader(com.tencent.qqmusic.mediaplayer.ISoLibraryLoader iSoLibraryLoader) {
        if (iSoLibraryLoader != null) {
            mISoLibraryLoader = iSoLibraryLoader;
        }
    }

    public static boolean enableNativeLog(java.lang.String str, java.lang.String str2) {
        if (sIsNlogEnabled) {
            return true;
        }
        java.lang.String findLibPath = getSoLibraryLoader().findLibPath(str);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[enableNativeLog] loading log lib: " + findLibPath);
        boolean z17 = str2 == null;
        if (com.tencent.qqmusic.mediaplayer.NLog.init(str, str2, 0) && com.tencent.qqmusic.mediaplayer.NativeLog.init(findLibPath) == 0) {
            sIsNlogEnabled = true;
            com.tencent.qqmusic.mediaplayer.NLog.setWriteCallback(z17);
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[enableNativeLog] succeed");
        } else {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[enableNativeLog] failed");
        }
        return sIsNlogEnabled;
    }
}

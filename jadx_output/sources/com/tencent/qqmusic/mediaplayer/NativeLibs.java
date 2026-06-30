package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public enum NativeLibs {
    nlog("NLog", 1),
    audioCommon("audio_common", 1),
    QmNativeDataSource("QmNativeDataSource", 1),
    formatDetector("FormatDetector", 1),
    codecFactory("codec_factory", 3),
    decoderJni("qqmusic_decoder_jni", 3),
    xFFmpeg("xffmpeg", 3),
    cppShared("c++_shared", 3),
    xlog("wechatxlog", 3);

    private static final android.util.SparseArray<java.lang.String> SUFFIX;
    private static final java.lang.String TAG = "NativeLibs";
    private boolean mHasLoadSoSuccess;
    private final java.lang.String name;
    private final long supportedAbi;

    static {
        android.util.SparseArray<java.lang.String> sparseArray = new android.util.SparseArray<>();
        SUFFIX = sparseArray;
        sparseArray.put(1, "");
        sparseArray.put(2, "");
    }

    NativeLibs(java.lang.String str, long j17) {
        this.name = str;
        this.supportedAbi = j17;
    }

    public static boolean loadAll(com.tencent.qqmusic.mediaplayer.NativeLibs... nativeLibsArr) {
        return loadAll(java.util.Arrays.asList(nativeLibsArr));
    }

    private boolean loadLibrary(java.lang.String str) {
        boolean z17 = false;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[loadLibrary] loading: " + str);
            z17 = com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.getSoLibraryLoader().load(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[loadLibrary] failed: " + str, th6);
        }
        if (z17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[loadLibrary] succeed: " + str);
        } else {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[loadLibrary] failed: " + str);
        }
        return z17;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public boolean load() {
        if (this.mHasLoadSoSuccess) {
            return true;
        }
        boolean loadLibrary = loadLibrary(getName());
        this.mHasLoadSoSuccess = loadLibrary;
        return loadLibrary;
    }

    public boolean supportAbi(int i17) {
        long j17 = i17;
        return (this.supportedAbi & j17) == j17;
    }

    public static boolean loadAll(java.lang.Iterable<com.tencent.qqmusic.mediaplayer.NativeLibs> iterable) {
        java.util.Iterator<com.tencent.qqmusic.mediaplayer.NativeLibs> it = iterable.iterator();
        while (it.hasNext()) {
            if (!it.next().load()) {
                return false;
            }
        }
        return true;
    }
}

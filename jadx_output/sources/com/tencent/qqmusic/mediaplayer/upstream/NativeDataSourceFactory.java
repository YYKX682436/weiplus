package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class NativeDataSourceFactory {
    private static final java.lang.String TAG = "NativeDataSourceFactory";
    private static final boolean soLoaded;

    static {
        boolean loadAll = com.tencent.qqmusic.mediaplayer.NativeLibs.loadAll(java.util.Arrays.asList(com.tencent.qqmusic.mediaplayer.NativeLibs.audioCommon, com.tencent.qqmusic.mediaplayer.NativeLibs.formatDetector, com.tencent.qqmusic.mediaplayer.NativeLibs.codecFactory, com.tencent.qqmusic.mediaplayer.NativeLibs.decoderJni, com.tencent.qqmusic.mediaplayer.NativeLibs.cppShared, com.tencent.qqmusic.mediaplayer.NativeLibs.xlog, com.tencent.qqmusic.mediaplayer.NativeLibs.xFFmpeg));
        soLoaded = loadAll;
        if (loadAll) {
            return;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[static initializer] failed to load so!");
    }

    public static com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource fileDataSource(final java.lang.String str) {
        return new com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource() { // from class: com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.1
            @Override // com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
            public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
                return null;
            }

            @Override // com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
            public long getNativeInstance() {
                if (!com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.soLoaded) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.w(com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.TAG, "[getNativeInstance] so not loaded properly!");
                    return 0L;
                }
                try {
                    return com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.localFile(str, 0);
                } catch (java.lang.Throwable th6) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.TAG, "[getNativeInstance] failed to create native data source!", th6);
                    return 0L;
                }
            }
        };
    }

    public static native long localFile(java.lang.String str, int i17);

    public static com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource fileDataSource(final java.lang.String str, final int i17) {
        return new com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource() { // from class: com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.2
            @Override // com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
            public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
                return null;
            }

            @Override // com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
            public long getNativeInstance() {
                if (!com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.soLoaded) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.w(com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.TAG, "[getNativeInstance] so not loaded properly!");
                    return 0L;
                }
                try {
                    return com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.localFile(str, i17 > 0 ? 1 : 0);
                } catch (java.lang.Throwable th6) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.TAG, "[getNativeInstance] failed to create native data source!", th6);
                    return 0L;
                }
            }
        };
    }
}

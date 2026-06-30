package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class TracerDataSource implements com.tencent.qqmusic.mediaplayer.upstream.IDataSource {
    private static final java.lang.String TAG = "TracerDataSource";
    private final com.tencent.qqmusic.mediaplayer.upstream.IDataSource impl;

    public TracerDataSource(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        this.impl = iDataSource;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.impl.close();
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[close] failed!", th6);
            throw th6;
        }
    }

    public boolean equals(java.lang.Object obj) {
        return this.impl.equals(obj);
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        try {
            return this.impl.getAudioType();
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[getAudioType] failed!", th6);
            throw th6;
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public long getSize() {
        try {
            return this.impl.getSize();
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[getSize] failed!", th6);
            throw th6;
        }
    }

    public int hashCode() {
        return this.impl.hashCode();
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public void open() {
        try {
            this.impl.open();
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[open] failed!", th6);
            throw th6;
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        try {
            return this.impl.readAt(j17, bArr, i17, i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[readAt] failed! pos = " + j17 + ", offset = " + i17 + ", size = " + i18, th6);
            throw th6;
        }
    }

    public java.lang.String toString() {
        return this.impl.toString();
    }
}

package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes7.dex */
public class DefaultNativeDataSource implements com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource {
    private final com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType;
    private final long nativeInstance;

    public DefaultNativeDataSource(long j17, com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType) {
        this.nativeInstance = j17;
        this.audioType = audioType;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        return this.audioType;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
    public long getNativeInstance() {
        return this.nativeInstance;
    }

    public java.lang.String toString() {
        return "DefaultNativeDataSource";
    }
}

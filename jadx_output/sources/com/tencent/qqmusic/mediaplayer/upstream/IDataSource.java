package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public interface IDataSource extends java.io.Closeable {
    com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType();

    long getSize();

    void open();

    int readAt(long j17, byte[] bArr, int i17, int i18);
}

package com.tencent.qqmusic.mediaplayer.downstream;

/* loaded from: classes13.dex */
public interface IDataSink extends java.io.Closeable {
    void open();

    int write(long j17, byte[] bArr, int i17, int i18);
}

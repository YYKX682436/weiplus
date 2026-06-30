package com.tencent.qqmusic.mediaplayer.network;

/* loaded from: classes13.dex */
public interface IMediaHTTPConnection {
    boolean connect(java.net.URL url, java.util.Map<java.lang.String, java.lang.String> map);

    void disconnect();

    java.lang.String getMIMEType();

    long getSize();

    java.lang.String getUri();

    int readAt(long j17, byte[] bArr, int i17, int i18);
}

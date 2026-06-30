package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class StreamingRequest {
    public final java.util.Map<java.lang.String, java.lang.String> headers;
    public final android.net.Uri uri;

    public StreamingRequest(android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> map) {
        this.uri = uri;
        this.headers = map;
    }

    public java.lang.String toString() {
        return "StreamingRequest{uri='" + this.uri + "', headers=" + this.headers + '}';
    }
}

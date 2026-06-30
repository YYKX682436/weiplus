package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class HttpDataSource implements com.tencent.qqmusic.mediaplayer.upstream.IDataSource {
    private final java.util.Map<java.lang.String, java.lang.String> headers;
    private com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection mediaHTTPConnection;
    private final com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService service;
    private final android.net.Uri uri;

    public HttpDataSource(android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> map, com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService iMediaHTTPService) {
        this.uri = uri;
        this.headers = map;
        this.service = iMediaHTTPService;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection iMediaHTTPConnection = this.mediaHTTPConnection;
        if (iMediaHTTPConnection != null) {
            iMediaHTTPConnection.disconnect();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        return com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector.getAudioFormat((com.tencent.qqmusic.mediaplayer.upstream.IDataSource) this, false);
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public long getSize() {
        return this.mediaHTTPConnection.getSize();
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public void open() {
        com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection makeHTTPConnection = this.service.makeHTTPConnection();
        this.mediaHTTPConnection = makeHTTPConnection;
        makeHTTPConnection.connect(new java.net.URL(this.uri.toString()), this.headers);
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        int i19 = 0;
        do {
            int i27 = i17 + i19;
            int readAt = this.mediaHTTPConnection.readAt(i19 + j17, bArr, i27, i18 - i27);
            if (readAt < 0) {
                return readAt;
            }
            if (readAt == 0) {
                break;
            }
            i19 += readAt;
        } while (i19 < i18);
        return i19;
    }
}

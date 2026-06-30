package com.tencent.qqmusic.mediaplayer.network;

/* loaded from: classes13.dex */
public class DefaultMediaHTTPService implements com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService {
    private static final java.lang.String TAG = "DefaultMediaHTTPService";

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService
    public com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection makeHTTPConnection() {
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "makeHTTPConnection");
        return new com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPConnection();
    }
}

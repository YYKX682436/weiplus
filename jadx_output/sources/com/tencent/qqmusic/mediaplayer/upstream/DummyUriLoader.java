package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class DummyUriLoader implements com.tencent.qqmusic.mediaplayer.upstream.UriLoader {
    private final android.net.Uri uri;

    public DummyUriLoader() {
        this(null);
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader
    public void cancelLoading() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader
    public boolean isLoading() {
        return false;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader
    public void startLoading(int i17, java.util.concurrent.TimeUnit timeUnit, com.tencent.qqmusic.mediaplayer.upstream.UriLoader.Callback callback) {
        android.net.Uri uri = this.uri;
        if (uri == null) {
            callback.onSucceed(null);
        } else {
            callback.onSucceed(new com.tencent.qqmusic.mediaplayer.upstream.StreamingRequest(uri, null));
        }
    }

    public DummyUriLoader(android.net.Uri uri) {
        this.uri = uri;
    }
}

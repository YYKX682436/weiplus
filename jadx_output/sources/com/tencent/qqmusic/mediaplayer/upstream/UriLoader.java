package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public interface UriLoader {

    /* loaded from: classes13.dex */
    public interface Callback {
        void onCancelled();

        void onFailed(java.lang.Throwable th6);

        void onSucceed(com.tencent.qqmusic.mediaplayer.upstream.StreamingRequest streamingRequest);
    }

    void cancelLoading();

    boolean isLoading();

    void startLoading(int i17, java.util.concurrent.TimeUnit timeUnit, com.tencent.qqmusic.mediaplayer.upstream.UriLoader.Callback callback);
}

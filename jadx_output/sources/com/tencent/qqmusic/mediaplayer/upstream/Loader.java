package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public interface Loader {

    /* loaded from: classes13.dex */
    public interface Factory {
        com.tencent.qqmusic.mediaplayer.upstream.Loader createLoader(com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener listener);
    }

    /* loaded from: classes13.dex */
    public interface Listener {
        void onLoadCancelled(boolean z17);

        void onLoadCompleted();

        void onLoadError(java.io.IOException iOException);

        void onLoadProgress(long j17, long j18);
    }

    void cancelLoading();

    long getUpstreamSize();

    boolean isLoading();

    void prepare();

    void shutdown();

    void startLoading(com.tencent.qqmusic.mediaplayer.upstream.Chunk chunk);
}

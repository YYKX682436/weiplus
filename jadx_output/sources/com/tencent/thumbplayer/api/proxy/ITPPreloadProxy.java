package com.tencent.thumbplayer.api.proxy;

/* loaded from: classes15.dex */
public interface ITPPreloadProxy {

    /* loaded from: classes15.dex */
    public interface IPreloadListener {
        void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18);

        void onPrepareError();

        void onPrepareSuccess();
    }

    java.lang.String getPlayErrorCodeStr(int i17);

    boolean isAvailable();

    void pushEvent(int i17);

    void setPreloadListener(com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener iPreloadListener);

    int startClipPreload(java.lang.String str, java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> arrayList);

    int startPreload(java.lang.String str, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData);

    int startPreload(java.lang.String str, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData, java.util.Map<java.lang.String, java.lang.String> map);

    void stopPreload(int i17);
}

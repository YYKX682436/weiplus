package com.tencent.thumbplayer.core.downloadproxy.api;

/* loaded from: classes16.dex */
public interface ITPOfflineDownloadListener {
    void onDownloadCdnUrlExpired(java.util.Map<java.lang.String, java.lang.String> map);

    void onDownloadCdnUrlInfoUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    void onDownloadCdnUrlUpdate(java.lang.String str);

    void onDownloadError(int i17, int i18, java.lang.String str);

    void onDownloadFinish();

    void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str);

    void onDownloadProtocolUpdate(java.lang.String str, java.lang.String str2);

    void onDownloadStatusUpdate(int i17);
}

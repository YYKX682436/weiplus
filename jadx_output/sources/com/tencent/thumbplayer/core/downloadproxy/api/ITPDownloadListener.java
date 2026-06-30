package com.tencent.thumbplayer.core.downloadproxy.api;

/* loaded from: classes16.dex */
public interface ITPDownloadListener {
    void didReleaseMemory(java.lang.String str);

    void onQuicQualityReportUpdate(java.lang.String str);

    void willReleaseMemory(java.lang.String str);
}

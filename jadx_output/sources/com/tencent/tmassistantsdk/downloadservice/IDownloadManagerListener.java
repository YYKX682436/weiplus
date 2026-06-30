package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public interface IDownloadManagerListener {
    void OnDownloadProgressChanged(java.lang.String str, long j17, long j18);

    void OnDownloadStateChanged(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18);
}

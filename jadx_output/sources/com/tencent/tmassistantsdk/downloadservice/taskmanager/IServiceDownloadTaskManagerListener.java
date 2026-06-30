package com.tencent.tmassistantsdk.downloadservice.taskmanager;

/* loaded from: classes13.dex */
public interface IServiceDownloadTaskManagerListener {
    void OnDownloadProgressChanged(java.lang.String str, java.lang.String str2, long j17, long j18);

    void OnDownloadStateChanged(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, boolean z17, boolean z18);
}

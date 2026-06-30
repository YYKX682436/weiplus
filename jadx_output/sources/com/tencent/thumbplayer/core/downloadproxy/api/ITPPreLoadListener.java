package com.tencent.thumbplayer.core.downloadproxy.api;

/* loaded from: classes16.dex */
public interface ITPPreLoadListener {
    void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str);

    void onPrepareError(int i17, int i18, java.lang.String str);

    void onPrepareOK();
}

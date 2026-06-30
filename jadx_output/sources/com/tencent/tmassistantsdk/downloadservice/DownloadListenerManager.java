package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class DownloadListenerManager {
    protected static com.tencent.tmassistantsdk.downloadservice.DownloadListenerManager mDownloadListenerManager;
    protected final java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener> mListeners = new java.util.ArrayList<>();

    public static com.tencent.tmassistantsdk.downloadservice.DownloadListenerManager getInstance() {
        if (mDownloadListenerManager == null) {
            mDownloadListenerManager = new com.tencent.tmassistantsdk.downloadservice.DownloadListenerManager();
        }
        return mDownloadListenerManager;
    }

    public synchronized void Add(com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener iDownloadManagerListener) {
        if (!this.mListeners.contains(iDownloadManagerListener)) {
            this.mListeners.add(iDownloadManagerListener);
        }
    }

    public synchronized void OnDownloadProgressChanged(java.lang.String str, long j17, long j18) {
        java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().OnDownloadProgressChanged(str, j17, j18);
        }
    }

    public synchronized void OnDownloadStateChanged(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
        java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().OnDownloadStateChanged(str, i17, i18, str2, z17, z18);
        }
    }

    public synchronized void Remove(com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener iDownloadManagerListener) {
        this.mListeners.remove(iDownloadManagerListener);
    }
}

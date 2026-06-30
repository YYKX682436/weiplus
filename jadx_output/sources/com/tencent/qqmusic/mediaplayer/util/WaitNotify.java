package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: classes16.dex */
public class WaitNotify {
    private static final java.lang.String TAG = "WaitNotify";
    private final com.tencent.qqmusic.mediaplayer.util.MonitorObject myMonitorObject = new com.tencent.qqmusic.mediaplayer.util.MonitorObject();
    private volatile boolean wasSignalled = false;
    private volatile boolean isWaiting = false;

    /* loaded from: classes16.dex */
    public interface WaitListener {
        boolean keepWaiting();
    }

    public void doNotify() {
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "doNotify " + java.lang.Thread.currentThread().getName());
        synchronized (this.myMonitorObject) {
            this.wasSignalled = true;
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "doNotify internal " + java.lang.Thread.currentThread().getName());
            this.myMonitorObject.notifyAll();
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "doNotify over " + java.lang.Thread.currentThread().getName());
        }
    }

    public void doWait() {
        doWait(com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0, new com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener() { // from class: com.tencent.qqmusic.mediaplayer.util.WaitNotify.1
            @Override // com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener
            public boolean keepWaiting() {
                return true;
            }
        });
    }

    public boolean isWaiting() {
        return this.isWaiting;
    }

    public void doWait(long j17, int i17, com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener waitListener) {
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "doWait " + java.lang.Thread.currentThread().getName());
        synchronized (this.myMonitorObject) {
            this.wasSignalled = false;
            int i18 = 0;
            while (!this.wasSignalled) {
                try {
                    com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "doWait internal " + java.lang.Thread.currentThread().getName() + " " + i18);
                    this.isWaiting = true;
                    if (i18 < i17) {
                        this.myMonitorObject.wait(j17, 0);
                        if (!waitListener.keepWaiting()) {
                            doNotify();
                            break;
                        }
                    } else {
                        this.myMonitorObject.wait();
                    }
                    com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "doWait wake " + java.lang.Thread.currentThread().getName() + " " + i18);
                } catch (java.lang.InterruptedException e17) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17.toString());
                }
                i18++;
            }
            this.isWaiting = false;
        }
    }
}

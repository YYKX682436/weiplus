package com.tencent.thumbplayer.core.downloadproxy.utils;

/* loaded from: classes13.dex */
public class TVKThreadUtil {
    private static volatile java.util.concurrent.ScheduledExecutorService mScheduler;

    public static java.util.concurrent.ScheduledExecutorService getScheduledExecutorServiceInstance() {
        if (mScheduler == null) {
            synchronized (com.tencent.thumbplayer.core.downloadproxy.utils.TVKThreadUtil.class) {
                if (mScheduler == null) {
                    mScheduler = java.util.concurrent.Executors.newScheduledThreadPool(4);
                }
            }
        }
        return mScheduler;
    }
}

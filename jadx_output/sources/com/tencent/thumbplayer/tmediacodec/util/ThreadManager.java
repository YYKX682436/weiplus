package com.tencent.thumbplayer.tmediacodec.util;

/* loaded from: classes12.dex */
public final class ThreadManager {
    private static final android.os.HandlerThread mHandlerThread;
    private static android.os.Handler sSubHandler;
    private static final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private static final java.util.concurrent.ExecutorService mThreadPool = java.util.concurrent.Executors.newCachedThreadPool();

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("tmediacodec-sub");
        mHandlerThread = handlerThread;
        handlerThread.start();
        sSubHandler = new android.os.Handler(handlerThread.getLooper());
    }

    private ThreadManager() {
    }

    public static void execute(java.lang.Runnable runnable) {
        mThreadPool.execute(runnable);
    }

    public static void postOnSubThread(java.lang.Runnable runnable) {
        sSubHandler.post(runnable);
    }

    public static void runOnSubThread(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            mThreadPool.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThread(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            mHandler.post(runnable);
        }
    }
}

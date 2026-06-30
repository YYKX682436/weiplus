package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPThreadPool {
    private static final int CORE_POOL_SIZE = 4;
    private static final int MAX_POOL_SIZE = 20;
    private static final java.lang.String PRE_THREAD_NAME = "TP-HandlerThread";
    private static final java.lang.String SHARE_THREAD_NAME = "TP-ShareThreadPool";
    private static final java.lang.String TAG = "TPPlayer[TPThreadPool]";
    private static volatile java.util.concurrent.ExecutorService sCustomExecutor;
    private static volatile android.os.HandlerThread sHandlerThread;
    private static volatile com.tencent.thumbplayer.utils.TPThreadPool sInstance;
    private static volatile android.os.Handler sMainThreadHandler;
    private static volatile java.util.concurrent.ScheduledExecutorService sScheduler;
    private static volatile java.util.concurrent.ExecutorService sShareSingleExecutor;
    private static int sShareThreadCount;

    private TPThreadPool() {
    }

    public static com.tencent.thumbplayer.utils.TPThreadPool getInstance() {
        if (sInstance == null) {
            synchronized (com.tencent.thumbplayer.utils.TPThreadPool.class) {
                if (sInstance == null) {
                    sInstance = new com.tencent.thumbplayer.utils.TPThreadPool();
                }
            }
        }
        return sInstance;
    }

    private static void initHandlerThread() {
        synchronized (com.tencent.thumbplayer.utils.TPThreadPool.class) {
            if (sHandlerThread == null) {
                sHandlerThread = new android.os.HandlerThread(SHARE_THREAD_NAME);
                sHandlerThread.start();
            } else if (!sHandlerThread.isAlive()) {
                sHandlerThread.start();
            }
            if (sHandlerThread.getLooper() == null) {
                sHandlerThread.quit();
                sHandlerThread = new android.os.HandlerThread(SHARE_THREAD_NAME);
                sHandlerThread.start();
            }
        }
    }

    private static void initMainThreadHandler() {
        if (sMainThreadHandler != null) {
            return;
        }
        synchronized (com.tencent.thumbplayer.utils.TPThreadPool.class) {
            if (sMainThreadHandler != null) {
                return;
            }
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper != null) {
                sMainThreadHandler = new android.os.Handler(mainLooper);
            } else {
                sMainThreadHandler = null;
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "cannot get thread looper");
            }
        }
    }

    public android.os.HandlerThread obtainHandleThread(java.lang.String str) {
        return obtainHandleThread(str, 0);
    }

    public java.util.concurrent.ScheduledExecutorService obtainScheduledExecutorService() {
        if (sScheduler == null) {
            synchronized (com.tencent.thumbplayer.utils.TPThreadPool.class) {
                if (sScheduler == null) {
                    sScheduler = java.util.concurrent.Executors.newScheduledThreadPool(4);
                }
            }
        }
        return sScheduler;
    }

    public android.os.HandlerThread obtainShareThread() {
        android.os.HandlerThread handlerThread;
        initHandlerThread();
        synchronized (com.tencent.thumbplayer.utils.TPThreadPool.class) {
            sShareThreadCount++;
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "handlerThread obtainShareThread mShareThreadCount:" + sShareThreadCount);
            handlerThread = sHandlerThread;
        }
        return handlerThread;
    }

    public java.util.concurrent.ExecutorService obtainSingleThreadExecutor() {
        if (sShareSingleExecutor == null) {
            synchronized (com.tencent.thumbplayer.utils.TPThreadPool.class) {
                if (sShareSingleExecutor == null) {
                    sShareSingleExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
                }
            }
        }
        return sShareSingleExecutor;
    }

    public java.util.concurrent.ExecutorService obtainThreadExecutor() {
        if (sCustomExecutor == null) {
            synchronized (com.tencent.thumbplayer.utils.TPThreadPool.class) {
                if (sCustomExecutor == null) {
                    sCustomExecutor = com.tencent.thumbplayer.utils.TPThreadPoolExecutor.newCustomThreadExecutor(4, 20);
                }
            }
        }
        return sCustomExecutor;
    }

    public void postDelayRunnableOnMainThread(java.lang.Runnable runnable, long j17) {
        initMainThreadHandler();
        if (sMainThreadHandler != null) {
            sMainThreadHandler.postDelayed(runnable, j17);
        }
    }

    public void postRunnableOnMainThread(java.lang.Runnable runnable) {
        initMainThreadHandler();
        if (sMainThreadHandler != null) {
            sMainThreadHandler.post(runnable);
        }
    }

    public void postRunnableOnMainThreadFront(java.lang.Runnable runnable) {
        initMainThreadHandler();
        if (sMainThreadHandler != null) {
            sMainThreadHandler.postAtFrontOfQueue(runnable);
        }
    }

    public void recycle(android.os.HandlerThread handlerThread, android.os.Handler handler) {
        if (handlerThread == null) {
            return;
        }
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (!handlerThread.equals(sHandlerThread)) {
            handlerThread.quit();
            return;
        }
        synchronized (com.tencent.thumbplayer.utils.TPThreadPool.class) {
            sShareThreadCount--;
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "handlerThread recycle mShareThreadCount:" + sShareThreadCount);
        }
    }

    public android.os.HandlerThread obtainHandleThread(java.lang.String str, int i17) {
        if (i17 >= 19 || i17 <= -19) {
            i17 = 0;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = PRE_THREAD_NAME;
        }
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(str, i17);
        handlerThread.start();
        return handlerThread;
    }
}

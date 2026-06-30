package com.tencent.youtu.ytcommon.tools;

/* loaded from: classes16.dex */
public class YTThreadOperate {
    private static android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private static java.util.concurrent.ExecutorService mExecutorService = java.util.concurrent.Executors.newFixedThreadPool(3);

    /* loaded from: classes16.dex */
    public interface UiThreadCallback<T> {
        void callback(T t17);
    }

    public static void runOnSubThread(final java.lang.Runnable runnable) {
        mExecutorService.submit(new java.lang.Runnable() { // from class: com.tencent.youtu.ytcommon.tools.YTThreadOperate.1
            @Override // java.lang.Runnable
            public void run() {
                runnable.run();
            }
        });
    }

    public static void runOnUiThread(java.lang.Runnable runnable) {
        mHandler.post(runnable);
    }

    public static void runOnUiThreadDelay(java.lang.Runnable runnable, long j17) {
        mHandler.postDelayed(runnable, j17);
    }

    public static <T> java.util.concurrent.Future<T> runOnSubThread(final java.util.concurrent.Callable<T> callable) {
        return mExecutorService.submit(new java.util.concurrent.Callable<T>() { // from class: com.tencent.youtu.ytcommon.tools.YTThreadOperate.2
            @Override // java.util.concurrent.Callable
            public T call() {
                try {
                    return (T) callable.call();
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }
        });
    }

    public static <T> void runOnSubThread(final java.util.concurrent.Callable<T> callable, final com.tencent.youtu.ytcommon.tools.YTThreadOperate.UiThreadCallback<T> uiThreadCallback) {
        mExecutorService.submit(new java.lang.Runnable() { // from class: com.tencent.youtu.ytcommon.tools.YTThreadOperate.3
            @Override // java.lang.Runnable
            public void run() {
                final java.lang.Object obj;
                try {
                    obj = callable.call();
                } catch (java.lang.Exception unused) {
                    obj = null;
                }
                com.tencent.youtu.ytcommon.tools.YTThreadOperate.mHandler.post(new java.lang.Runnable() { // from class: com.tencent.youtu.ytcommon.tools.YTThreadOperate.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.youtu.ytcommon.tools.YTThreadOperate.UiThreadCallback uiThreadCallback2 = uiThreadCallback;
                        if (uiThreadCallback2 != null) {
                            try {
                                uiThreadCallback2.callback(obj);
                            } catch (java.lang.Exception e17) {
                                com.tencent.youtu.ytcommon.tools.YTException.report(e17);
                            }
                        }
                    }
                });
            }
        });
    }
}

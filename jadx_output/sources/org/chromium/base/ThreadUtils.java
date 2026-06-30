package org.chromium.base;

/* loaded from: classes13.dex */
public class ThreadUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.Object sLock = new java.lang.Object();
    private static boolean sThreadAssertsDisabledForTesting;
    private static volatile android.os.Handler sUiThreadHandler;
    private static volatile boolean sWillOverride;

    /* loaded from: classes13.dex */
    public static class ThreadChecker {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final long mThreadId = android.os.Process.myTid();

        public void assertOnValidThread() {
        }
    }

    public static void assertOnBackgroundThread() {
    }

    public static void assertOnUiThread() {
    }

    public static void checkUiThread() {
        if (!sThreadAssertsDisabledForTesting && !runningOnUiThread()) {
            throw new java.lang.IllegalStateException("Must be called on the UI thread.");
        }
    }

    public static void clearUiThreadForTesting() {
        sWillOverride = false;
        org.chromium.base.task.PostTask.resetUiThreadForTesting();
        sUiThreadHandler = null;
    }

    public static android.os.Handler getUiThreadHandler() {
        if (sUiThreadHandler != null) {
            return sUiThreadHandler;
        }
        if (sWillOverride) {
            throw new java.lang.RuntimeException("Did not yet override the UI thread");
        }
        setUiThread(android.os.Looper.getMainLooper());
        return sUiThreadHandler;
    }

    public static android.os.Looper getUiThreadLooper() {
        return getUiThreadHandler().getLooper();
    }

    private static boolean isThreadPriorityAudio(int i17) {
        return android.os.Process.getThreadPriority(i17) == -16;
    }

    public static <T> java.util.concurrent.FutureTask<T> postOnUiThread(java.util.concurrent.FutureTask<T> futureTask) {
        org.chromium.base.task.PostTask.postTask(7, futureTask);
        return futureTask;
    }

    public static void postOnUiThreadDelayed(java.lang.Runnable runnable, long j17) {
        org.chromium.base.task.PostTask.postDelayedTask(7, runnable, j17);
    }

    public static <T> java.util.concurrent.FutureTask<T> runOnUiThread(java.util.concurrent.FutureTask<T> futureTask) {
        org.chromium.base.task.PostTask.runOrPostTask(7, futureTask);
        return futureTask;
    }

    public static void runOnUiThreadBlocking(java.lang.Runnable runnable) {
        org.chromium.base.task.PostTask.runSynchronously(7, runnable);
    }

    public static <T> T runOnUiThreadBlockingNoException(java.util.concurrent.Callable<T> callable) {
        try {
            return (T) runOnUiThreadBlocking(callable);
        } catch (java.util.concurrent.ExecutionException e17) {
            throw new java.lang.RuntimeException("Error occurred waiting for callable", e17);
        }
    }

    public static boolean runningOnUiThread() {
        return getUiThreadHandler().getLooper() == android.os.Looper.myLooper();
    }

    public static void setThreadAssertsDisabledForTesting(boolean z17) {
        sThreadAssertsDisabledForTesting = z17;
        org.chromium.base.ResettersForTesting.register(new org.chromium.base.ThreadUtils$$a());
    }

    public static void setThreadPriorityAudio(int i17) {
        android.os.Process.setThreadPriority(i17, -16);
    }

    public static void setUiThread(android.os.Looper looper) {
        synchronized (sLock) {
            if (sUiThreadHandler == null) {
                android.os.Handler handler = new android.os.Handler(looper);
                org.chromium.base.task.PostTask.onUiThreadReady(handler);
                sUiThreadHandler = handler;
                org.chromium.base.TraceEvent.onUiThreadReady();
            } else if (sUiThreadHandler.getLooper() != looper) {
                throw new java.lang.RuntimeException("UI thread looper is already set to " + sUiThreadHandler.getLooper() + " (Main thread looper is " + android.os.Looper.getMainLooper() + "), cannot set to new looper " + looper);
            }
        }
    }

    public static void setWillOverrideUiThread() {
        sWillOverride = true;
    }

    public static void postOnUiThread(java.lang.Runnable runnable) {
        org.chromium.base.task.PostTask.postTask(7, runnable);
    }

    public static <T> java.util.concurrent.FutureTask<T> runOnUiThread(java.util.concurrent.Callable<T> callable) {
        return runOnUiThread(new java.util.concurrent.FutureTask(callable));
    }

    public static <T> T runOnUiThreadBlocking(java.util.concurrent.Callable<T> callable) {
        return (T) org.chromium.base.task.PostTask.runSynchronously(7, callable);
    }

    public static void runOnUiThread(java.lang.Runnable runnable) {
        org.chromium.base.task.PostTask.runOrPostTask(7, runnable);
    }
}

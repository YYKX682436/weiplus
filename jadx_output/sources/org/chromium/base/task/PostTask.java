package org.chromium.base.task;

@org.chromium.base.annotations.JNINamespace(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE)
/* loaded from: classes13.dex */
public class PostTask {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "PostTask";
    private static volatile boolean sNativeInitialized;
    private static volatile java.util.concurrent.Executor sPrenativeThreadPoolExecutorForTesting;
    static int sTestIterationForTesting;
    private static org.chromium.base.task.UiThreadTaskExecutor sUiThreadTaskExecutor;
    private static final java.lang.Object sPreNativeTaskRunnerLock = new java.lang.Object();
    private static java.util.List<org.chromium.base.task.TaskRunnerImpl> sPreNativeTaskRunners = new java.util.ArrayList();
    private static org.chromium.base.task.ChromeThreadPoolExecutor sPrenativeThreadPoolExecutor = new org.chromium.base.task.ChromeThreadPoolExecutor();
    private static final org.chromium.base.task.ThreadPoolTaskExecutor sThreadPoolTaskExecutor = new org.chromium.base.task.ThreadPoolTaskExecutor();

    public static boolean canRunTaskImmediately(int i17) {
        return getTaskExecutorForTraits(i17).canRunTaskImmediately(i17);
    }

    public static org.chromium.base.task.SequencedTaskRunner createSequencedTaskRunner(int i17) {
        return getTaskExecutorForTraits(i17).createSequencedTaskRunner(i17);
    }

    public static org.chromium.base.task.SingleThreadTaskRunner createSingleThreadTaskRunner(int i17) {
        return getTaskExecutorForTraits(i17).createSingleThreadTaskRunner(i17);
    }

    public static org.chromium.base.task.TaskRunner createTaskRunner(int i17) {
        return getTaskExecutorForTraits(i17).createTaskRunner(i17);
    }

    public static void flushJobsAndResetForTesting() {
        org.chromium.base.task.ChromeThreadPoolExecutor chromeThreadPoolExecutor = sPrenativeThreadPoolExecutor;
        int size = chromeThreadPoolExecutor.getQueue().size() + chromeThreadPoolExecutor.getActiveCount();
        if (size > 0) {
            chromeThreadPoolExecutor.shutdownNow();
            chromeThreadPoolExecutor.awaitTermination(1L, java.util.concurrent.TimeUnit.SECONDS);
            sPrenativeThreadPoolExecutor = new org.chromium.base.task.ChromeThreadPoolExecutor();
        }
        synchronized (sPreNativeTaskRunnerLock) {
            java.util.List<org.chromium.base.task.TaskRunnerImpl> list = sPreNativeTaskRunners;
            if (list != null) {
                java.util.Iterator<org.chromium.base.task.TaskRunnerImpl> it = list.iterator();
                while (it.hasNext()) {
                    size += it.next().clearTaskQueueForTesting();
                }
            }
            sTestIterationForTesting++;
        }
        resetPrenativeThreadPoolExecutorForTesting();
        if (size > 0) {
            org.chromium.base.Log.w(TAG, "%d background task(s) existed after test finished.", java.lang.Integer.valueOf(size));
        }
    }

    public static java.util.concurrent.Executor getPrenativeThreadPoolExecutor() {
        return sPrenativeThreadPoolExecutorForTesting != null ? sPrenativeThreadPoolExecutorForTesting : sPrenativeThreadPoolExecutor;
    }

    private static org.chromium.base.task.TaskExecutor getTaskExecutorForTraits(int i17) {
        if (i17 < 6) {
            return sThreadPoolTaskExecutor;
        }
        if (sUiThreadTaskExecutor == null) {
            org.chromium.base.ThreadUtils.getUiThreadHandler();
        }
        return sUiThreadTaskExecutor;
    }

    private static void onNativeSchedulerReady() {
        java.util.List<org.chromium.base.task.TaskRunnerImpl> list;
        if (sNativeInitialized) {
            return;
        }
        sNativeInitialized = true;
        synchronized (sPreNativeTaskRunnerLock) {
            list = sPreNativeTaskRunners;
            sPreNativeTaskRunners = null;
        }
        java.util.Iterator<org.chromium.base.task.TaskRunnerImpl> it = list.iterator();
        while (it.hasNext()) {
            it.next().initNativeTaskRunner();
        }
    }

    public static void onUiThreadReady(android.os.Handler handler) {
        sUiThreadTaskExecutor = new org.chromium.base.task.UiThreadTaskExecutor(handler);
    }

    public static void postDelayedTask(int i17, java.lang.Runnable runnable, long j17) {
        getTaskExecutorForTraits(i17).postDelayedTask(i17, runnable, j17);
    }

    public static void postTask(int i17, java.lang.Runnable runnable) {
        postDelayedTask(i17, runnable, 0L);
    }

    public static boolean registerPreNativeTaskRunner(org.chromium.base.task.TaskRunnerImpl taskRunnerImpl) {
        synchronized (sPreNativeTaskRunnerLock) {
            java.util.List<org.chromium.base.task.TaskRunnerImpl> list = sPreNativeTaskRunners;
            if (list == null) {
                return false;
            }
            list.add(taskRunnerImpl);
            return true;
        }
    }

    public static void resetPrenativeThreadPoolExecutorForTesting() {
        sPrenativeThreadPoolExecutorForTesting = null;
    }

    public static void resetUiThreadForTesting() {
        sUiThreadTaskExecutor = null;
    }

    public static void runOrPostTask(int i17, java.lang.Runnable runnable) {
        if (getTaskExecutorForTraits(i17).canRunTaskImmediately(i17)) {
            runnable.run();
        } else {
            postTask(i17, runnable);
        }
    }

    @java.lang.Deprecated
    public static <T> T runSynchronously(int i17, java.util.concurrent.Callable<T> callable) {
        return (T) runSynchronouslyInternal(i17, new java.util.concurrent.FutureTask(callable));
    }

    private static <T> T runSynchronouslyInternal(int i17, java.util.concurrent.FutureTask<T> futureTask) {
        runOrPostTask(i17, futureTask);
        try {
            return futureTask.get();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public static void setPrenativeThreadPoolExecutorForTesting(java.util.concurrent.Executor executor) {
        sPrenativeThreadPoolExecutorForTesting = executor;
        org.chromium.base.ResettersForTesting.register(new org.chromium.base.task.PostTask$$a());
    }

    @java.lang.Deprecated
    public static void runSynchronously(int i17, java.lang.Runnable runnable) {
        runSynchronouslyInternal(i17, new java.util.concurrent.FutureTask(runnable, null));
    }
}

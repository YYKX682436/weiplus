package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPThreadPoolExecutor {
    private static final int QUEUE_CAPACITY = 20;
    private static final java.lang.String TAG = "TPPlayer[TPThreadPoolExecutor]";
    private static final long THREAD_KEEP_ALIVE_TIME = 60;
    private static final java.lang.String THREAD_POOL_NAME = "TP-Thread";

    /* loaded from: classes13.dex */
    public static class CustomRejectedExecutionHandler implements java.util.concurrent.RejectedExecutionHandler {
        private CustomRejectedExecutionHandler() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.utils.TPThreadPoolExecutor.TAG, "rejectedExecution put task to queue");
            } catch (java.lang.InterruptedException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.utils.TPThreadPoolExecutor.TAG, "rejectedExecution has exception:" + e17.toString());
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class CustomThreadFactory implements java.util.concurrent.ThreadFactory {
        private java.util.concurrent.atomic.AtomicInteger threadAtomicCount;

        private CustomThreadFactory() {
            this.threadAtomicCount = new java.util.concurrent.atomic.AtomicInteger(0);
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setName(com.tencent.thumbplayer.utils.TPThreadPoolExecutor.THREAD_POOL_NAME + this.threadAtomicCount.incrementAndGet());
            return thread;
        }
    }

    public static java.util.concurrent.ExecutorService newCustomThreadExecutor(int i17, int i18) {
        return new java.util.concurrent.ThreadPoolExecutor(i17, i18, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(20), new com.tencent.thumbplayer.utils.TPThreadPoolExecutor.CustomThreadFactory(), new com.tencent.thumbplayer.utils.TPThreadPoolExecutor.CustomRejectedExecutionHandler());
    }
}

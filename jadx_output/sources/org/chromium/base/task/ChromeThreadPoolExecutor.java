package org.chromium.base.task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class ChromeThreadPoolExecutor extends java.util.concurrent.ThreadPoolExecutor {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    private static final int RUNNABLE_WARNING_COUNT = 32;
    private static final java.util.concurrent.BlockingQueue<java.lang.Runnable> sPoolWorkQueue;
    private static final java.util.concurrent.ThreadFactory sThreadFactory;

    static {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = java.lang.Math.max(2, java.lang.Math.min(availableProcessors - 1, 4));
        MAXIMUM_POOL_SIZE = (availableProcessors * 2) + 1;
        sThreadFactory = new java.util.concurrent.ThreadFactory() { // from class: org.chromium.base.task.ChromeThreadPoolExecutor.1
            private final java.util.concurrent.atomic.AtomicInteger mCount = new java.util.concurrent.atomic.AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                return new java.lang.Thread(runnable, "CrAsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        sPoolWorkQueue = new java.util.concurrent.ArrayBlockingQueue(128);
    }

    public ChromeThreadPoolExecutor() {
        this(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, java.util.concurrent.TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
    }

    private java.lang.String findClassNamesWithTooManyRunnables(java.util.Map<java.lang.String, java.lang.Integer> map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() > 32) {
                sb6.append(entry.getKey());
                sb6.append(' ');
            }
        }
        return sb6.length() == 0 ? "NO CLASSES FOUND" : sb6.toString();
    }

    private static java.lang.String getClassName(java.lang.Runnable runnable) {
        java.lang.Class cls;
        java.lang.Class cls2 = runnable.getClass();
        try {
        } catch (java.lang.IllegalAccessException e17) {
            if (org.chromium.build.BuildConfig.ENABLE_ASSERTS) {
                throw new java.lang.RuntimeException(e17);
            }
        } catch (java.lang.NoSuchFieldException e18) {
            if (org.chromium.build.BuildConfig.ENABLE_ASSERTS) {
                throw new java.lang.RuntimeException(e18);
            }
        }
        if (cls2 != org.chromium.base.task.AsyncTask.NamedFutureTask.class) {
            if (cls2.getEnclosingClass() == android.os.AsyncTask.class) {
                java.lang.reflect.Field declaredField = cls2.getDeclaredField("this$0");
                declaredField.setAccessible(true);
                cls = declaredField.get(runnable).getClass();
            }
            return cls2.getName();
        }
        cls = ((org.chromium.base.task.AsyncTask.NamedFutureTask) runnable).getBlamedClass();
        cls2 = cls;
        return cls2.getName();
    }

    private java.util.Map<java.lang.String, java.lang.Integer> getNumberOfClassNameOccurrencesInQueue() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.Runnable runnable : (java.lang.Runnable[]) getQueue().toArray(new java.lang.Runnable[0])) {
            java.lang.String className = getClassName(runnable);
            hashMap.put(className, java.lang.Integer.valueOf((hashMap.containsKey(className) ? ((java.lang.Integer) hashMap.get(className)).intValue() : 0) + 1));
        }
        return hashMap;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            throw new java.util.concurrent.RejectedExecutionException("Prominent classes in AsyncTask: " + findClassNamesWithTooManyRunnables(getNumberOfClassNameOccurrencesInQueue()), e17);
        }
    }

    public ChromeThreadPoolExecutor(int i17, int i18, long j17, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue, java.util.concurrent.ThreadFactory threadFactory) {
        super(i17, i18, j17, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }
}

package org.chromium.base.task;

/* loaded from: classes13.dex */
public abstract class AsyncTask<Result> {
    private static final java.lang.String GET_STATUS_UMA_HISTOGRAM = "Android.Jank.AsyncTaskGetOnUiThreadStatus";
    private static final java.lang.String TAG = "AsyncTask";
    private final org.chromium.base.task.AsyncTask<Result>.NamedFutureTask mFuture;
    private final java.util.concurrent.Callable<Result> mWorker;
    public static final java.util.concurrent.Executor THREAD_POOL_EXECUTOR = new org.chromium.base.task.AsyncTask$$b();
    public static final java.util.concurrent.Executor SERIAL_EXECUTOR = new org.chromium.base.task.SerialExecutor();
    private static final org.chromium.base.task.AsyncTask.StealRunnableHandler STEAL_RUNNABLE_HANDLER = new org.chromium.base.task.AsyncTask.StealRunnableHandler();
    private volatile int mStatus = 0;
    private final java.util.concurrent.atomic.AtomicBoolean mCancelled = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean mTaskInvoked = new java.util.concurrent.atomic.AtomicBoolean();
    private int mIterationIdForTesting = org.chromium.base.task.PostTask.sTestIterationForTesting;

    /* loaded from: classes13.dex */
    public class NamedFutureTask extends java.util.concurrent.FutureTask<Result> {
        public NamedFutureTask(java.util.concurrent.Callable<Result> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                org.chromium.base.task.AsyncTask.this.postResultIfNotInvoked(get());
            } catch (java.lang.InterruptedException e17) {
                org.chromium.base.Log.w(org.chromium.base.task.AsyncTask.TAG, e17.toString());
            } catch (java.util.concurrent.CancellationException unused) {
                org.chromium.base.task.AsyncTask.this.postResultIfNotInvoked(null);
            } catch (java.util.concurrent.ExecutionException e18) {
                throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e18.getCause());
            }
        }

        public java.lang.Class getBlamedClass() {
            return org.chromium.base.task.AsyncTask.this.getClass();
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            try {
                org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("AsyncTask.run: ".concat(org.chromium.base.task.AsyncTask.this.mFuture.getBlamedClass().getName()));
                try {
                    super.run();
                    if (scoped != null) {
                        scoped.close();
                    }
                } finally {
                }
            } finally {
                java.lang.Thread.interrupted();
            }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Status {
        public static final int FINISHED = 2;
        public static final int NUM_ENTRIES = 3;
        public static final int PENDING = 0;
        public static final int RUNNING = 1;
    }

    /* loaded from: classes13.dex */
    public static class StealRunnableHandler implements java.util.concurrent.RejectedExecutionHandler {
        private StealRunnableHandler() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            org.chromium.base.task.AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        }
    }

    public AsyncTask() {
        java.util.concurrent.Callable<Result> callable = new java.util.concurrent.Callable<Result>() { // from class: org.chromium.base.task.AsyncTask.1
            @Override // java.util.concurrent.Callable
            public Result call() {
                org.chromium.base.task.AsyncTask.this.mTaskInvoked.set(true);
                Result result = null;
                try {
                    result = (Result) org.chromium.base.task.AsyncTask.this.doInBackground();
                    android.os.Binder.flushPendingCommands();
                    return result;
                } finally {
                }
            }
        };
        this.mWorker = callable;
        this.mFuture = new org.chromium.base.task.AsyncTask.NamedFutureTask(callable);
    }

    private void executionPreamble() {
        if (this.mStatus != 0) {
            int i17 = this.mStatus;
            if (i17 == 1) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i17 == 2) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.mStatus = 1;
        onPreExecute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void lambda$postResult$1(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.mStatus = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postResult(final Result result) {
        if (this instanceof org.chromium.base.task.BackgroundOnlyAsyncTask) {
            this.mStatus = 2;
        } else if (this.mIterationIdForTesting == org.chromium.base.task.PostTask.sTestIterationForTesting) {
            org.chromium.base.ThreadUtils.postOnUiThread(new java.lang.Runnable() { // from class: org.chromium.base.task.AsyncTask$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.chromium.base.task.AsyncTask.this.lambda$postResult$1(result);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postResultIfNotInvoked(Result result) {
        if (this.mTaskInvoked.get()) {
            return;
        }
        postResult(result);
    }

    public static void takeOverAndroidThreadPool() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = (java.util.concurrent.ThreadPoolExecutor) android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        threadPoolExecutor.setRejectedExecutionHandler(STEAL_RUNNABLE_HANDLER);
        threadPoolExecutor.shutdown();
    }

    public final boolean cancel(boolean z17) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(z17);
    }

    public abstract Result doInBackground();

    public final org.chromium.base.task.AsyncTask<Result> executeOnExecutor(java.util.concurrent.Executor executor) {
        executionPreamble();
        executor.execute(this.mFuture);
        return this;
    }

    public final org.chromium.base.task.AsyncTask<Result> executeOnTaskRunner(org.chromium.base.task.TaskRunner taskRunner) {
        executionPreamble();
        taskRunner.postTask(this.mFuture);
        return this;
    }

    public final org.chromium.base.task.AsyncTask<Result> executeWithTaskTraits(int i17) {
        executionPreamble();
        org.chromium.base.task.PostTask.postTask(i17, this.mFuture);
        return this;
    }

    public final Result get() {
        java.lang.String str;
        int umaStatus = getUmaStatus();
        if (umaStatus != 2 && org.chromium.base.ThreadUtils.runningOnUiThread()) {
            org.chromium.base.metrics.RecordHistogram.recordEnumeratedHistogram(GET_STATUS_UMA_HISTOGRAM, umaStatus, 3);
            java.lang.StackTraceElement[] stackTrace = new java.lang.Exception().getStackTrace();
            if (stackTrace.length > 1) {
                str = stackTrace[1].getClassName() + "." + stackTrace[1].getMethodName() + ".";
            } else {
                str = "";
            }
            org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped(str + "AsyncTask.get");
            try {
                Result result = this.mFuture.get();
                if (scoped == null) {
                    return result;
                }
                scoped.close();
                return result;
            } catch (java.lang.Throwable th6) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        return this.mFuture.get();
    }

    public final int getStatus() {
        return this.mStatus;
    }

    public final int getUmaStatus() {
        if (this.mStatus != 1 || this.mTaskInvoked.get()) {
            return this.mStatus;
        }
        return 0;
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    public void onCancelled() {
    }

    public abstract void onPostExecute(Result result);

    public void onPreExecute() {
    }

    public void onCancelled(Result result) {
        onCancelled();
    }

    public final Result get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.String str;
        int umaStatus = getUmaStatus();
        if (umaStatus != 2 && org.chromium.base.ThreadUtils.runningOnUiThread()) {
            org.chromium.base.metrics.RecordHistogram.recordEnumeratedHistogram(GET_STATUS_UMA_HISTOGRAM, umaStatus, 3);
            java.lang.StackTraceElement[] stackTrace = new java.lang.Exception().getStackTrace();
            if (stackTrace.length > 1) {
                str = stackTrace[1].getClassName() + "." + stackTrace[1].getMethodName() + ".";
            } else {
                str = "";
            }
            org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped(str + "AsyncTask.get");
            try {
                Result result = this.mFuture.get(j17, timeUnit);
                if (scoped == null) {
                    return result;
                }
                scoped.close();
                return result;
            } catch (java.lang.Throwable th6) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        return this.mFuture.get(j17, timeUnit);
    }
}

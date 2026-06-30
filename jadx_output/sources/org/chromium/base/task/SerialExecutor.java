package org.chromium.base.task;

/* loaded from: classes13.dex */
class SerialExecutor implements java.util.concurrent.Executor {
    java.lang.Runnable mActive;
    final java.util.ArrayDeque<java.lang.Runnable> mTasks = new java.util.ArrayDeque<>();

    @Override // java.util.concurrent.Executor
    public synchronized void execute(final java.lang.Runnable runnable) {
        this.mTasks.offer(new java.lang.Runnable() { // from class: org.chromium.base.task.SerialExecutor.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } finally {
                    org.chromium.base.task.SerialExecutor.this.scheduleNext();
                }
            }
        });
        if (this.mActive == null) {
            scheduleNext();
        }
    }

    public synchronized void scheduleNext() {
        java.lang.Runnable poll = this.mTasks.poll();
        this.mActive = poll;
        if (poll != null) {
            org.chromium.base.task.AsyncTask.THREAD_POOL_EXECUTOR.execute(poll);
        }
    }
}

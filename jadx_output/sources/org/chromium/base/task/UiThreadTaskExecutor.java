package org.chromium.base.task;

/* loaded from: classes13.dex */
public class UiThreadTaskExecutor implements org.chromium.base.task.TaskExecutor {
    private static boolean sRegistered;
    private final org.chromium.base.task.SingleThreadTaskRunner mBestEffortTaskRunner;
    private final org.chromium.base.task.SingleThreadTaskRunner mUserBlockingTaskRunner;
    private final org.chromium.base.task.SingleThreadTaskRunner mUserVisibleTaskRunner;

    public UiThreadTaskExecutor(android.os.Handler handler) {
        this.mBestEffortTaskRunner = new org.chromium.base.task.SingleThreadTaskRunnerImpl(handler, 6);
        this.mUserVisibleTaskRunner = new org.chromium.base.task.SingleThreadTaskRunnerImpl(handler, 7);
        this.mUserBlockingTaskRunner = new org.chromium.base.task.SingleThreadTaskRunnerImpl(handler, 8);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public boolean canRunTaskImmediately(int i17) {
        return createSingleThreadTaskRunner(i17).belongsToCurrentThread();
    }

    @Override // org.chromium.base.task.TaskExecutor
    public org.chromium.base.task.SequencedTaskRunner createSequencedTaskRunner(int i17) {
        return createSingleThreadTaskRunner(i17);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public org.chromium.base.task.SingleThreadTaskRunner createSingleThreadTaskRunner(int i17) {
        if (6 == i17) {
            return this.mBestEffortTaskRunner;
        }
        if (7 == i17) {
            return this.mUserVisibleTaskRunner;
        }
        if (8 == i17) {
            return this.mUserBlockingTaskRunner;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // org.chromium.base.task.TaskExecutor
    public org.chromium.base.task.TaskRunner createTaskRunner(int i17) {
        return createSingleThreadTaskRunner(i17);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public void postDelayedTask(int i17, java.lang.Runnable runnable, long j17) {
        createSingleThreadTaskRunner(i17).postDelayedTask(runnable, j17);
    }
}

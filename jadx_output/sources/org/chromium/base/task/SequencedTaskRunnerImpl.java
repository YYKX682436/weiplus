package org.chromium.base.task;

/* loaded from: classes13.dex */
public class SequencedTaskRunnerImpl extends org.chromium.base.task.TaskRunnerImpl implements org.chromium.base.task.SequencedTaskRunner {
    private java.util.concurrent.atomic.AtomicInteger mPendingTasks;
    private volatile boolean mReadyToCreateNativeTaskRunner;

    public SequencedTaskRunnerImpl(int i17) {
        super(i17, "SequencedTaskRunnerImpl", 1);
        this.mPendingTasks = new java.util.concurrent.atomic.AtomicInteger();
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    public void initNativeTaskRunner() {
        this.mReadyToCreateNativeTaskRunner = true;
        if (this.mPendingTasks.getAndIncrement() == 0) {
            super.initNativeTaskRunner();
        }
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    public void runPreNativeTask() {
        super.runPreNativeTask();
        if (this.mPendingTasks.decrementAndGet() > 0) {
            if (this.mReadyToCreateNativeTaskRunner) {
                super.initNativeTaskRunner();
            } else {
                super.schedulePreNativeTask();
            }
        }
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    public void schedulePreNativeTask() {
        if (this.mPendingTasks.getAndIncrement() == 0) {
            super.schedulePreNativeTask();
        }
    }
}

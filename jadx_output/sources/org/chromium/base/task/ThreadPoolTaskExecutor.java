package org.chromium.base.task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class ThreadPoolTaskExecutor implements org.chromium.base.task.TaskExecutor {
    private static final int TRAITS_COUNT = 6;
    private final org.chromium.base.task.TaskRunner[] mTraitsToRunnerMap = new org.chromium.base.task.TaskRunner[6];

    public ThreadPoolTaskExecutor() {
        for (int i17 = 0; i17 < 6; i17++) {
            this.mTraitsToRunnerMap[i17] = createTaskRunner(i17 + 0);
        }
    }

    @Override // org.chromium.base.task.TaskExecutor
    public boolean canRunTaskImmediately(int i17) {
        return false;
    }

    @Override // org.chromium.base.task.TaskExecutor
    public org.chromium.base.task.SequencedTaskRunner createSequencedTaskRunner(int i17) {
        return new org.chromium.base.task.SequencedTaskRunnerImpl(i17);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public org.chromium.base.task.SingleThreadTaskRunner createSingleThreadTaskRunner(int i17) {
        return new org.chromium.base.task.SingleThreadTaskRunnerImpl(null, i17);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public org.chromium.base.task.TaskRunner createTaskRunner(int i17) {
        return new org.chromium.base.task.TaskRunnerImpl(i17);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public void postDelayedTask(int i17, java.lang.Runnable runnable, long j17) {
        this.mTraitsToRunnerMap[i17 + 0].postDelayedTask(runnable, j17);
    }
}

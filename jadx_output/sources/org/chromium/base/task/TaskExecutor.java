package org.chromium.base.task;

/* loaded from: classes13.dex */
public interface TaskExecutor {
    boolean canRunTaskImmediately(int i17);

    org.chromium.base.task.SequencedTaskRunner createSequencedTaskRunner(int i17);

    org.chromium.base.task.SingleThreadTaskRunner createSingleThreadTaskRunner(int i17);

    org.chromium.base.task.TaskRunner createTaskRunner(int i17);

    void postDelayedTask(int i17, java.lang.Runnable runnable, long j17);
}

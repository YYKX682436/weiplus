package org.chromium.base.task;

/* loaded from: classes13.dex */
public interface SingleThreadTaskRunner extends org.chromium.base.task.SequencedTaskRunner {
    boolean belongsToCurrentThread();
}

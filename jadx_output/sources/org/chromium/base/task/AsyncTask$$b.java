package org.chromium.base.task;

/* loaded from: classes13.dex */
public final /* synthetic */ class AsyncTask$$b implements java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        org.chromium.base.task.PostTask.postTask(1, runnable);
    }
}

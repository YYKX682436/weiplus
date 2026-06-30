package org.chromium.base.task;

@org.chromium.base.annotations.JNINamespace(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE)
/* loaded from: classes13.dex */
public class SingleThreadTaskRunnerImpl extends org.chromium.base.task.TaskRunnerImpl implements org.chromium.base.task.SingleThreadTaskRunner {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final android.os.Handler mHandler;

    public SingleThreadTaskRunnerImpl(android.os.Handler handler, int i17) {
        super(i17, "SingleThreadTaskRunnerImpl", 2);
        this.mHandler = handler;
    }

    @Override // org.chromium.base.task.SingleThreadTaskRunner
    public boolean belongsToCurrentThread() {
        java.lang.Boolean belongsToCurrentThreadInternal = belongsToCurrentThreadInternal();
        return belongsToCurrentThreadInternal != null ? belongsToCurrentThreadInternal.booleanValue() : this.mHandler.getLooper().getThread() == java.lang.Thread.currentThread();
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    public boolean schedulePreNativeDelayedTask(java.lang.Runnable runnable, long j17) {
        android.os.Handler handler = this.mHandler;
        if (handler == null) {
            return false;
        }
        handler.postDelayed(runnable, j17);
        return true;
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    public void schedulePreNativeTask() {
        android.os.Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.post(this.mRunPreNativeTaskClosure);
    }
}

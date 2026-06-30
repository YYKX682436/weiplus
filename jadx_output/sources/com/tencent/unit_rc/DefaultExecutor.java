package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/tencent/unit_rc/DefaultExecutor;", "Lcom/tencent/unit_rc/Executor;", "Ljava/lang/Runnable;", "runnable", "Ljz5/f0;", "execute", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes13.dex */
public final class DefaultExecutor implements com.tencent.unit_rc.Executor {
    private final java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newCachedThreadPool();

    @Override // com.tencent.unit_rc.Executor
    public void execute(java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(runnable, "runnable");
        java.lang.String arrays = java.util.Arrays.toString(java.lang.Thread.currentThread().getStackTrace());
        kotlin.jvm.internal.o.f(arrays, "toString(this)");
        com.tencent.unit_rc.UnitRCLog.info("DefaultExecutor execute, stack: ".concat(arrays));
        this.executor.execute(runnable);
    }
}

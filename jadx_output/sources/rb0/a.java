package rb0;

/* loaded from: classes9.dex */
public final class a extends h04.a {
    @Override // h04.a
    public void onTaskCanceled() {
    }

    @Override // h04.a
    public boolean onTaskExecute(android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.o.g(cancellationSignal, "cancellationSignal");
        com.tencent.mars.xlog.Log.i("MicroMsg.VFSMaintainTask", "VFSMaintainTask invoked, wait for account ready...");
        com.tencent.mm.feature.performance.scheduler.c cVar = com.tencent.mm.feature.performance.scheduler.c.f67677d;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("INSTANCE");
            throw null;
        }
        cVar.requireAccountInitialized();
        com.tencent.mars.xlog.Log.i("MicroMsg.VFSMaintainTask", "VFSMaintainTask account ready");
        com.tencent.mm.vfs.a3.f212781a.i(cancellationSignal);
        com.tencent.mars.xlog.Log.i("MicroMsg.VFSMaintainTask", "VFSMaintainTask done: canceled = " + cancellationSignal.isCanceled());
        return !cancellationSignal.isCanceled();
    }
}

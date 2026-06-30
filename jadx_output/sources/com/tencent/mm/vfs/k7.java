package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class k7 implements com.tencent.mm.vfs.x2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f213035a;

    public k7(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.f213035a = atomicBoolean;
    }

    @Override // com.tencent.mm.vfs.x2
    public void a(android.os.CancellationSignal cancellationSignal) {
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.VFSApplier", "onMaintenanceBegin");
        this.f213035a.set(true);
    }

    @Override // com.tencent.mm.vfs.x2
    public boolean b(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, android.os.CancellationSignal cancellationSignal) {
        return true;
    }

    @Override // com.tencent.mm.vfs.x2
    public void c(boolean z17, boolean z18, android.os.CancellationSignal cancellationSignal) {
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.VFSApplier", "onMaintenanceEnd");
        this.f213035a.set(false);
    }
}

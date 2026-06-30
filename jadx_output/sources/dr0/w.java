package dr0;

/* loaded from: classes12.dex */
public final class w extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.t0 f242567d;

    public w(dr0.t0 t0Var) {
        this.f242567d = t0Var;
    }

    @Override // hm0.t
    public void b() {
        long e17 = com.tencent.mm.app.u6.INSTANCE.e(com.tencent.mm.app.t6.UNTIL_INVOKE_KERNEL_EXTENSION_END);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "load kernelStartUpCostMs: " + e17);
        this.f242567d.i().collectStartUpCost(e17);
    }
}

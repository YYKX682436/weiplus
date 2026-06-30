package k14;

/* loaded from: classes11.dex */
public class r0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k14.x0 f303371e;

    public r0(k14.x0 x0Var) {
        this.f303371e = x0Var;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.UnfamiliarContactEngineAwait";
    }

    @Override // java.lang.Runnable
    public void run() {
        k14.x0 x0Var = this.f303371e;
        try {
            x0Var.f303405d.await();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            x0Var.f303408g.clear();
            x0Var.f303409h.remove(c01.z1.r());
            x0Var.f303408g.addAll(x0Var.f303409h);
            x0Var.f303408g.addAll(x0Var.f303410i);
            x0Var.f303408g.addAll(x0Var.f303411j);
            if (x0Var.f303403b) {
                x0Var.f303408g.retainAll(x0Var.f303411j);
            }
            if (x0Var.f303404c) {
                x0Var.f303408g.retainAll(x0Var.f303410i);
            }
            if (x0Var.f303402a) {
                x0Var.f303408g.retainAll(x0Var.f303409h);
            }
            ((com.tencent.mm.plugin.setting.ui.setting.vp) x0Var.f303413l).b(x0Var.f303408g);
            com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "[onResult] :%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            x0Var.f303406e.postUI(new k14.p0(this));
            com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "all cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - x0Var.f303414m));
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UnfamiliarContactEngine", e17, "", new java.lang.Object[0]);
            x0Var.f303406e.postUI(new k14.q0(this));
        }
    }
}

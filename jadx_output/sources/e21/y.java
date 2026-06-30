package e21;

/* loaded from: classes11.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f246599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e21.e0 f246600e;

    public y(xg3.q0 q0Var, e21.e0 e0Var) {
        this.f246599d = q0Var;
        this.f246600e = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg3.q0 q0Var = this.f246599d;
        if (q0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OplogReportHelper", "clearRecord: op is null");
            return;
        }
        e21.e0 e0Var = this.f246600e;
        e0Var.f246511a.remove(java.lang.Integer.valueOf(q0Var.f454423b));
        e0Var.f246512b.remove(java.lang.Integer.valueOf(q0Var.f454423b));
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogReportHelper", "clearRecord: op: " + e21.a1.a(q0Var));
    }
}

package gi;

/* loaded from: classes12.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.q1 f272101d;

    public r1(gi.q1 q1Var) {
        this.f272101d = q1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gi.q1 q1Var = this.f272101d;
        q1Var.f272094b++;
        com.tencent.mars.xlog.Log.i("MicroMsg.ThermalExceptionMonitor", "finish, loop count: " + q1Var.f272094b);
        rh.c1 c1Var = q1Var.f272095c;
        if (c1Var != null) {
            c1Var.l();
            rh.c1 c1Var2 = q1Var.f272095c;
            if (c1Var2.f395330l != null && ((gi.w0) c1Var2).P()) {
                qh.u uVar = new qh.u();
                uVar.i();
                uVar.a("| AlertBattTest\n");
                new ri.m().a(q1Var.f272095c, uVar);
                uVar.f();
                uVar.d();
                new ri.n("alertBatt").a(q1Var.f272095c);
            }
            q1Var.f272095c.b();
            q1Var.f272095c = null;
        }
        if (q1Var.f272094b >= 5) {
            q1Var.f272093a = false;
            return;
        }
        ph.u uVar2 = q1Var.f272096d;
        if (uVar2 != null) {
            ph.u e17 = gi.d.e();
            rh.c1 c1Var3 = e17 != null ? new gi.s1(e17.f354296h, "alertBatt").f272021a : null;
            q1Var.f272095c = c1Var3;
            if (c1Var3 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ThermalExceptionMonitor", "start, loop count: " + (q1Var.f272094b + 1));
                q1Var.f272095c.I();
                uVar2.f354296h.f363337f.postDelayed(this, 60000L);
            }
        }
    }
}

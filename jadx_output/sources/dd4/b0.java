package dd4;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dd4.e0 f228972d;

    public b0(dd4.e0 e0Var) {
        this.f228972d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc4.p a17;
        r45.jj4 R0;
        dd4.e0 e0Var = this.f228972d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$reportExportAsync$1");
        try {
            a17 = dd4.e0.a(e0Var);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlexibleShareHelper", th6, "[-] Exception was thrown when report.", new java.lang.Object[0]);
        }
        if (a17 != null && (R0 = a17.R0()) != null) {
            com.tencent.mm.app.t0 t0Var = new com.tencent.mm.app.t0(3, com.tencent.mm.app.s0.VIDEO, null);
            xc4.p a18 = dd4.e0.a(e0Var);
            t0Var.f53779b = a18 != null ? a18.getUserName() : null;
            xc4.p a19 = dd4.e0.a(e0Var);
            t0Var.f53781d = a19 != null ? a19.y0() : 0L;
            t0Var.f53783f = R0.f377858g;
            r45.lj4 lj4Var = R0.f377865p;
            t0Var.f53784g = (int) lj4Var.f379520d;
            t0Var.f53785h = (int) lj4Var.f379521e;
            t0Var.f53786i = R0.f377860i;
            t0Var.f53787j = (int) R0.R;
            t0Var.f53790m = R0.M;
            com.tencent.mm.app.u0.a(t0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$reportExportAsync$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$reportExportAsync$1");
    }
}

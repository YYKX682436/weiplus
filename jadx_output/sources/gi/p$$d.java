package gi;

/* loaded from: classes12.dex */
public final /* synthetic */ class p$$d implements wh.t0 {
    @Override // wh.t0
    public final void accept(java.lang.Object obj) {
        rh.h2 h2Var = (rh.h2) obj;
        h2Var.getClass();
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper() || android.os.Looper.myLooper() == h2Var.f395294a.f363337f.getLooper()) {
            throw new java.lang.IllegalStateException("'#configureMonitorConsuming' should work within worker thread except matrix thread!");
        }
        if (h2Var.f395408b > 0) {
            oj.j.c("Matrix.battery.InternalMonitorFeature", "#configureMonitorConsuming, tid = " + h2Var.f395408b, new java.lang.Object[0]);
            int i17 = h2Var.f395408b;
            rh.g2 g2Var = new rh.g2();
            g2Var.f395374d = i17;
            g2Var.f395378h = wh.m.d(h2Var.f395294a.d(), h2Var.f395294a.f363343o);
            g2Var.f395379i = wh.m.r(h2Var.f395294a.d());
            try {
                java.util.concurrent.Callable callable = h2Var.f395294a.f363335d.f363284c;
                g2Var.f395380j = callable == null ? "" : (java.lang.String) callable.call();
            } catch (java.lang.Exception unused) {
                g2Var.f395380j = "";
            }
            wh.t1 e17 = wh.u1.e(android.os.Process.myPid(), i17);
            if (e17 == null) {
                g2Var = null;
            } else {
                g2Var.f395377g = rh.x2.b(java.lang.Long.valueOf(e17.a()));
                g2Var.f395375e = e17.f445873a;
            }
            if (g2Var != null) {
                rh.f fVar = h2Var.f395409c;
                if (fVar != null) {
                    h2Var.f395294a.f363335d.f363283b.f(new rh.e(g2Var, fVar, g2Var));
                }
                h2Var.f395409c = g2Var;
            }
        }
    }
}

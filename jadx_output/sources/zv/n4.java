package zv;

/* loaded from: classes11.dex */
public final class n4 extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginBrandEcs", "onAppBackground");
        zv.e0 e0Var = zv.e0.f475937a;
        if (zv.e0.f475938b && ((java.lang.Boolean) ((jz5.n) zv.e0.f475943g).getValue()).booleanValue()) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            zv.x xVar = zv.x.f476127d;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(xVar, 3000L, null);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginBrandEcs", "onAppForeground");
        zv.e0.f475937a.a("onAppForeground");
        zv.e2 e2Var = (zv.e2) ((bw.k) i95.n0.c(bw.k.class));
        if (e2Var.Ui()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.biz.q.f93870d;
            if (currentTimeMillis >= e2Var.f475957r) {
                ((ku5.t0) ku5.t0.f312615d).h(new zv.t1(e2Var), "onAppForeground");
            } else {
                ku5.u0 u0Var = ku5.t0.f312615d;
                zv.s1 s1Var = new zv.s1(e2Var);
                long j17 = e2Var.f475957r - currentTimeMillis;
                if (j17 < 5000) {
                    j17 = 5000;
                }
                ((ku5.t0) u0Var).l(s1Var, j17, "onAppForeground");
            }
        }
    }
}

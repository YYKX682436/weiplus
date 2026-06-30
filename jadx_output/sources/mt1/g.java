package mt1;

/* loaded from: classes10.dex */
public final class g extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CalcWxNewService", "onAppBackground activity=" + str);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CalcWxNewService", "onAppForeground activity=" + str);
        ku5.u0 u0Var = ku5.t0.f312615d;
        mt1.f fVar = mt1.f.f331216d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(fVar, 2000L, "Calc-reportDaily");
    }
}

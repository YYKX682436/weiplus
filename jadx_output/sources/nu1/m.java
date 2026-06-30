package nu1;

/* loaded from: classes13.dex */
public final class m implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu1.n f340169d;

    public m(nu1.n nVar) {
        this.f340169d = nVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCast", "onAppBackground " + this.f340169d.Ai());
        ku5.u0 u0Var = ku5.t0.f312615d;
        nu1.k kVar = new nu1.k(this.f340169d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(kVar, 2000L, false);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCast", "onAppForeground " + this.f340169d.Ai());
        ku5.u0 u0Var = ku5.t0.f312615d;
        nu1.l lVar = new nu1.l(this.f340169d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(lVar, 2000L, false);
    }
}

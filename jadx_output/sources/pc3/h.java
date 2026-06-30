package pc3;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.m f353378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pc3.m mVar, java.lang.String str) {
        super(0);
        this.f353378d = mVar;
        this.f353379e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.magicbrush.n4 n4Var = this.f353378d.f353385d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("connect biz server for ");
        sb6.append(this.f353379e);
        sb6.append(", has service?");
        sb6.append(n4Var != null);
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", sb6.toString());
        if (n4Var == null) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            final pc3.m mVar = this.f353378d;
            ((ku5.t0) u0Var).a(new java.lang.Runnable() { // from class: pc3.g
                @Override // java.lang.Runnable
                public final void run() {
                    pc3.m mVar2 = pc3.m.this;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindServiceIfNeeded: ");
                    sb7.append(mVar2.f353385d == null);
                    com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", sb7.toString());
                    ((ku5.t0) ku5.t0.f312615d).q(new pc3.d(mVar2));
                    ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
                    mVar2.b();
                }
            });
        } else {
            rc3.w0 w0Var = (rc3.w0) this.f353378d.f353383b.get(this.f353379e);
            if (w0Var != null) {
                w0Var.T(new rc3.f0(w0Var, n4Var));
            }
        }
        return jz5.f0.f302826a;
    }
}

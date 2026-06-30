package sc3;

/* loaded from: classes7.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(sc3.k1 k1Var) {
        super(1);
        this.f406522d = k1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List mainScripts = (java.util.List) obj;
        kotlin.jvm.internal.o.g(mainScripts, "mainScripts");
        com.tencent.mars.xlog.Log.i(this.f406522d.Q, "hy: on main scripts provided from parallel setup!");
        oc3.a N0 = this.f406522d.N0();
        sc3.k1 k1Var = this.f406522d;
        if (((java.lang.Boolean) ((jz5.n) k1Var.F).getValue()).booleanValue()) {
            for (java.lang.String str : N0.f344328b.keySet()) {
                com.tencent.mars.xlog.Log.i(k1Var.Q, "hy: preloading public service " + str);
                k1Var.f406477f.f(str, true);
            }
        } else {
            com.tencent.mars.xlog.Log.i(k1Var.Q, "hy: not preload public service, just load");
        }
        sc3.k1 k1Var2 = this.f406522d;
        synchronized (k1Var2) {
            yz5.l lVar = k1Var2.C;
            if (lVar != null) {
                lVar.invoke(mainScripts);
            } else {
                k1Var2.B = mainScripts;
            }
        }
        return jz5.f0.f302826a;
    }
}

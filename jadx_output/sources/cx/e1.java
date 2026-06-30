package cx;

/* loaded from: classes7.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f224398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(cx.j1 j1Var) {
        super(0);
        this.f224398d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String pj6;
        java.lang.String pj7;
        boolean z17;
        java.lang.String pj8;
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
        cx.j1 j1Var = this.f224398d;
        pj6 = j1Var.pj();
        com.tencent.mars.xlog.Log.i(pj6, "is appbrand so open true");
        boolean fj6 = j1Var.fj();
        pj7 = j1Var.pj();
        com.tencent.mars.xlog.Log.i(pj7, "is biz open " + fj6);
        if (fj6) {
            boolean Ai = cx.j1.Ai(j1Var);
            pj8 = j1Var.pj();
            com.tencent.mars.xlog.Log.i(pj8, "is stability open " + Ai);
            if (Ai) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}

package hg2;

/* loaded from: classes3.dex */
public final class r implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f281387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.vf f281388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f281389c;

    public r(android.content.Context context, dk2.vf vfVar, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        this.f281387a = context;
        this.f281388b = vfVar;
        this.f281389c = k0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        r45.ce0 ce0Var;
        java.lang.String string;
        r45.ce0 ce0Var2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        hg2.q qVar = new hg2.q(this.f281388b);
        l81.b1 b1Var = new l81.b1();
        r45.y23 y23Var = (r45.y23) ((r45.bv1) fVar.f70618d).getCustom(3);
        java.lang.String str2 = "";
        if (y23Var == null || (ce0Var2 = (r45.ce0) y23Var.getCustom(9)) == null || (str = ce0Var2.getString(0)) == null) {
            str = "";
        }
        b1Var.f317014b = str;
        r45.y23 y23Var2 = (r45.y23) ((r45.bv1) fVar.f70618d).getCustom(3);
        if (y23Var2 != null && (ce0Var = (r45.ce0) y23Var2.getCustom(9)) != null && (string = ce0Var.getString(1)) != null) {
            str2 = string;
        }
        b1Var.f317022f = str2;
        b1Var.f317032k = 1205;
        b1Var.f317016c = zl2.q4.f473933a.x();
        k91.y3 y3Var = k91.y3.DISABLED;
        b1Var.S = y3Var;
        b1Var.T = y3Var;
        b1Var.H = k91.z3.TRANSPARENT;
        java.lang.String appId = b1Var.f317014b;
        kotlin.jvm.internal.o.f(appId, "appId");
        b1Var.f317037o = new st2.h2(this.f281389c, appId);
        b1Var.f317028i = qVar;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f281387a, b1Var);
        return jz5.f0.f302826a;
    }
}

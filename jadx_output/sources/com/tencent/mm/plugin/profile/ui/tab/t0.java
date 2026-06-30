package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public class t0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.u0 f154594d;

    public t0(com.tencent.mm.plugin.profile.ui.tab.u0 u0Var) {
        this.f154594d = u0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String Bi = ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Bi();
        java.lang.String str = "pages/appmsg_editor/appmsg_editor.html?biz=" + android.net.Uri.encode(Bi) + "&from=profile";
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = 1338;
        b1Var.f317016c = ((java.lang.Integer) obj).intValue();
        b1Var.f317034l = "4";
        b1Var.f317014b = "wx0b2ec076ec39c786";
        b1Var.f317022f = str;
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        sr3.a aVar = sr3.a.f411829e;
        b1Var.f317028i = l1Var.Bi(1, Bi);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi()) {
            b1Var.f317018d = 447;
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f154594d.f154603a.f154456h, b1Var);
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154594d.f154603a;
        ((ku5.t0) ku5.t0.f312615d).k(new gr3.a(0L, "", 0L, 0L, 0L, 201L, m0Var.f154467v, m0Var.L, 0), 100L);
        return jz5.f0.f302826a;
    }
}

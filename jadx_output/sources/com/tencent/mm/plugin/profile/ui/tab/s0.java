package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public class s0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr3.a f154539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.u0 f154540e;

    public s0(com.tencent.mm.plugin.profile.ui.tab.u0 u0Var, sr3.a aVar) {
        this.f154540e = u0Var;
        this.f154539d = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        sr3.a aVar = sr3.a.f411829e;
        sr3.a aVar2 = this.f154539d;
        java.lang.String Bi = aVar2 == aVar ? ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Bi() : ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Di();
        java.lang.String str = "pages/setting/new_edit/new_edit.html?biz=" + android.net.Uri.encode(Bi) + "&field=intro";
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = aVar2 == aVar ? 1338 : 1414;
        b1Var.f317016c = num.intValue();
        b1Var.f317034l = "2";
        b1Var.f317014b = "wx0b2ec076ec39c786";
        b1Var.f317022f = str;
        b1Var.f317028i = ((r01.l1) i95.n0.c(r01.l1.class)).Bi(aVar2.f411832d, Bi);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi()) {
            b1Var.f317018d = 447;
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f154540e.f154603a.f154456h, b1Var);
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ov2 f124582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f124583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124584f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.l1 f124585g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(r45.ov2 ov2Var, r45.h32 h32Var, com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, com.tencent.mm.plugin.finder.profile.widget.l1 l1Var) {
        super(1);
        this.f124582d = ov2Var;
        this.f124583e = h32Var;
        this.f124584f = s1Var;
        this.f124585g = l1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.view.dd couponCallback = (com.tencent.mm.plugin.finder.view.dd) obj;
        kotlin.jvm.internal.o.g(couponCallback, "couponCallback");
        zl2.g gVar = zl2.g.f473770a;
        java.lang.String string = this.f124582d.getString(1);
        if (string == null) {
            string = "";
        }
        r45.h32 h32Var2 = this.f124583e;
        java.lang.String string2 = h32Var2.getString(4);
        gVar.c(string, string2 != null ? string2 : "", false);
        r45.ov2 ov2Var = couponCallback.f131889a;
        r45.l1 l1Var = (r45.l1) ov2Var.getCustom(19);
        if (l1Var != null) {
            com.tencent.mm.plugin.finder.assist.a.b(l1Var);
        }
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124584f;
        kk.l lVar = s1Var.f124721e;
        com.tencent.mm.plugin.finder.profile.widget.l1 l1Var2 = this.f124585g;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(l1Var2.f124607d.invoke());
        if (l2Var != null && (h32Var = l2Var.f123916e) != null) {
            zl2.t.f(h32Var, ov2Var);
        }
        s1Var.l((java.lang.String) l1Var2.f124607d.invoke(), h32Var2, (((java.lang.Boolean) l1Var2.f124608e.invoke()).booleanValue() || s1Var.f124720d) ? false : true);
        return jz5.f0.f302826a;
    }
}

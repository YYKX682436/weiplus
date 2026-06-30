package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class l1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f124607d = com.tencent.mm.plugin.finder.profile.widget.k1.f124597d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f124608e = com.tencent.mm.plugin.finder.profile.widget.h1.f124565d;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f124609f = com.tencent.mm.plugin.finder.profile.widget.i1.f124573d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124610g;

    public l1(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var) {
        this.f124610g = s1Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.h32 h32Var;
        boolean z17;
        boolean z18;
        if ((m1Var instanceof db2.e5) && kotlin.jvm.internal.o.b(((db2.e5) m1Var).f227957h, this.f124609f.invoke())) {
            gm0.j1.d().q(6276, this);
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124610g;
                com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) s1Var.f124721e.get(this.f124607d.invoke());
                if (l2Var == null || (h32Var = l2Var.f123916e) == null) {
                    return;
                }
                r45.ov2 a17 = zl2.t.a(h32Var);
                if (a17 != null) {
                    if (!com.tencent.mm.plugin.finder.assist.o7.a(a17)) {
                        a17 = null;
                    }
                    if (a17 != null) {
                        r45.l1 l1Var = (r45.l1) a17.getCustom(19);
                        if ((l1Var != null && !com.tencent.mm.plugin.finder.assist.a.a(l1Var) ? a17 : null) != null) {
                            zl2.g gVar = zl2.g.f473770a;
                            java.lang.String string = a17.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            java.lang.String string2 = h32Var.getString(4);
                            gVar.d(string, string2 != null ? string2 : "", false);
                        }
                        z17 = false;
                        z18 = true;
                        com.tencent.mm.plugin.finder.view.ed.b(com.tencent.mm.plugin.finder.view.ed.f131999a, s1Var.f124718b, h32Var, h32Var.getString(3), h32Var.getInteger(0) * 1000, kz5.b0.c(new com.tencent.mm.plugin.finder.view.dd(a17, (java.lang.String) this.f124609f.invoke())), (java.lang.String) this.f124607d.invoke(), false, null, new com.tencent.mm.plugin.finder.profile.widget.j1(a17, h32Var, s1Var, this), 128, null);
                        s1Var.l((java.lang.String) this.f124607d.invoke(), h32Var, (!((java.lang.Boolean) this.f124608e.invoke()).booleanValue() || s1Var.f124720d) ? z17 : z18);
                    }
                }
                z17 = false;
                z18 = true;
                s1Var.l((java.lang.String) this.f124607d.invoke(), h32Var, (!((java.lang.Boolean) this.f124608e.invoke()).booleanValue() || s1Var.f124720d) ? z17 : z18);
            }
        }
    }
}

package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class e1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124523b;

    public e1(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, java.lang.String str) {
        this.f124522a = s1Var;
        this.f124523b = str;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        int i17;
        r45.h32 h32Var;
        java.lang.String string;
        r45.ov2 a17;
        java.lang.String string2;
        java.lang.String string3;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124522a;
        boolean z18 = s1Var.B;
        java.lang.String str = this.f124523b;
        if (z18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("finder_username", str);
            hashMap.put("activityId", s1Var.C);
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.K1, hashMap, s1Var.f124719c.getString(1), java.lang.String.valueOf(s1Var.f124719c.getInteger(5)), null, null, false, 112, null);
        }
        if (z17) {
            java.lang.String str2 = this.f124523b;
            if (s1Var.f124725i.getVisibility() == 0) {
                com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) s1Var.f124721e.get(str2);
                java.lang.String str3 = null;
                r45.h32 h32Var2 = l2Var != null ? l2Var.f123916e : null;
                java.lang.String str4 = (h32Var2 == null || (string3 = h32Var2.getString(3)) == null) ? "" : string3;
                java.lang.String str5 = (h32Var2 == null || (string2 = h32Var2.getString(4)) == null) ? "" : string2;
                cl0.g gVar = new cl0.g();
                if (h32Var2 != null && (a17 = zl2.t.a(h32Var2)) != null) {
                    str3 = a17.getString(1);
                }
                gVar.h("coupon_id", str3);
                gVar.o("ui_position", 1);
                cl0.g gVar2 = new cl0.g();
                gVar2.s("source_type", 0);
                gVar2.o("notice_type", 1);
                gVar2.s("ref_page_type", s1Var.H);
                c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
                ml2.i5 i5Var = ml2.i5.f327570e;
                java.lang.String str6 = s1Var.f124722f;
                java.lang.String gVar3 = gVar2.toString();
                java.lang.String gVar4 = gVar.toString();
                long e17 = s1Var.e();
                int d17 = s1Var.d();
                kotlin.jvm.internal.o.d(c1Var);
                i17 = 4;
                c50.c1.l9(c1Var, i5Var, str2, 0L, 0, str6, null, null, null, null, str4, gVar3, str5, gVar4, e17, d17, null, 33248, null);
            } else {
                i17 = 4;
            }
            if (s1Var.e() != 0) {
                com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
                r45.qt2 qt2Var = s1Var.f124719c;
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(s1Var.e());
                com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = (com.tencent.mm.plugin.finder.profile.uic.l2) s1Var.f124721e.get(str);
                com.tencent.mm.plugin.finder.report.l0.e(l0Var, qt2Var, h17, 82, (l2Var2 == null || (h32Var = l2Var2.f123916e) == null || (string = h32Var.getString(i17)) == null) ? "" : string, 0, 16, null);
            }
        }
    }
}

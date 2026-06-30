package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f124774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124777g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f124778h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124779i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(r45.h32 h32Var, com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        super(2);
        this.f124774d = h32Var;
        this.f124775e = s1Var;
        this.f124776f = str;
        this.f124777g = str2;
        this.f124778h = z17;
        this.f124779i = str3;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var;
        java.lang.String str;
        int i17;
        int i18;
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        r45.h32 h32Var = this.f124774d;
        java.lang.String str2 = this.f124776f;
        java.lang.String str3 = this.f124777g;
        java.lang.String str4 = this.f124779i;
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var2 = this.f124775e;
        if (intValue != -1) {
            h32Var.set(1, 0);
            if (intValue == 1) {
                ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).wi(s1Var2.f124718b, 2, false, new com.tencent.mm.plugin.finder.profile.widget.v0(h32Var, s1Var2));
                cl0.g gVar = new cl0.g();
                gVar.s("source_type", 0);
                gVar.s("ref_page_type", str2);
                cl0.g gVar2 = new cl0.g();
                r45.ov2 a17 = zl2.t.a(h32Var);
                gVar2.h("coupon_id", a17 != null ? a17.getString(1) : null);
                gVar2.o("ui_position", 1);
                gVar.o("notice_type", 1);
                i95.m c17 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c50.c1 c1Var = (c50.c1) c17;
                ml2.i5 i5Var = ml2.i5.f327571f;
                java.lang.String str5 = s1Var2.f124722f;
                java.lang.String string = h32Var.getString(3);
                if (string == null) {
                    string = "";
                }
                c50.c1.l9(c1Var, i5Var, str3, 0L, 0, str5, null, null, null, null, string, gVar.toString(), h32Var.getString(4), gVar2.toString(), s1Var2.e(), s1Var2.d(), null, 33248, null);
                com.tencent.mm.plugin.finder.profile.widget.w0 w0Var = new com.tencent.mm.plugin.finder.profile.widget.w0(str3);
                com.tencent.mm.plugin.finder.profile.widget.l1 l1Var = s1Var2.f124716J;
                l1Var.getClass();
                l1Var.f124607d = w0Var;
                l1Var.f124608e = new com.tencent.mm.plugin.finder.profile.widget.x0(this.f124778h);
                l1Var.f124609f = new com.tencent.mm.plugin.finder.profile.widget.y0(h32Var);
                gm0.j1.d().a(6276, l1Var);
                if (s1Var2.B) {
                    s1Var2.f124742z = h32Var.getInteger(1);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("finder_username", str3);
                    java.lang.String string2 = h32Var.getString(8);
                    if (string2 == null) {
                        string2 = "";
                    }
                    hashMap.put("activityId", string2);
                    i95.m c18 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    ml2.t1 t1Var = ml2.t1.R1;
                    r45.qt2 qt2Var = s1Var2.f124719c;
                    zy2.zb.T8((zy2.zb) c18, t1Var, hashMap, qt2Var.getString(1), java.lang.String.valueOf(qt2Var.getInteger(5)), null, null, false, 112, null);
                    i95.m c19 = i95.n0.c(c61.zb.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    c61.zb zbVar = (c61.zb) c19;
                    java.lang.String string3 = h32Var.getString(4);
                    kotlin.jvm.internal.o.d(string3);
                    androidx.appcompat.app.AppCompatActivity activity = s1Var2.f124718b;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    pf5.z zVar = pf5.z.f353948a;
                    gm0.j1.d().g(c61.zb.x3(zbVar, str3, string3, 1, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), activity.getIntent().getStringExtra("key_promotion_token"), java.lang.Integer.valueOf(str2 == null || str2.length() == 0 ? 0 : 901), null, null, str4, null, null, null, null, 7872, null));
                    c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String string4 = h32Var.getString(4);
                    if (string4 == null) {
                        string4 = "";
                    }
                    if (((b92.d1) zbVar2).bj(str3, string4) == null) {
                        c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String string5 = h32Var.getString(4);
                        if (string5 == null) {
                            string5 = "";
                        }
                        ((b92.d1) zbVar3).Ai(str3, string5, h32Var);
                    } else {
                        c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String string6 = h32Var.getString(4);
                        if (string6 == null) {
                            string6 = "";
                        }
                        r45.h32 bj6 = ((b92.d1) zbVar4).bj(str3, string6);
                        if (bj6 != null) {
                            bj6.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
                        }
                    }
                    ((te2.e4) ((zy2.g8) zVar.a(activity).c(zy2.g8.class))).f417974d.M0(str3);
                    com.tencent.mm.plugin.finder.profile.widget.s1.i(s1Var2, str3, h32Var);
                    com.tencent.mm.plugin.finder.profile.widget.s1.h(s1Var2, h32Var, 1);
                    i17 = 4;
                    s1Var = s1Var2;
                    str = str3;
                    i18 = 8;
                } else {
                    i17 = 4;
                    i18 = 8;
                    s1Var = s1Var2;
                    str = str3;
                    com.tencent.mm.plugin.finder.profile.widget.s1.g(s1Var2, str3, str2, str4, h32Var, h32Var, 1);
                }
            } else {
                s1Var = s1Var2;
                str = str3;
                i17 = 4;
                i18 = 8;
            }
            if (s1Var.B) {
                java.lang.String string7 = h32Var.getString(i18);
                java.lang.String str6 = string7 == null ? "" : string7;
                java.lang.String string8 = h32Var.getString(i17);
                pq5.g l17 = new db2.b2(str6, null, null, 0L, 0L, string8 == null ? "" : string8, 1, false, 158, null).l();
                androidx.appcompat.app.AppCompatActivity appCompatActivity = s1Var.f124718b;
                kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) appCompatActivity);
                l17.K(new com.tencent.mm.plugin.finder.profile.widget.g1(s1Var, str));
            }
        } else if (!s1Var2.B) {
            com.tencent.mm.plugin.finder.profile.widget.z0 z0Var = new com.tencent.mm.plugin.finder.profile.widget.z0(h32Var, s1Var2, str3, str2, str4);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) s1Var2.f124718b, 1, true);
            k0Var.f211872n = new com.tencent.mm.plugin.finder.profile.widget.q1(s1Var2);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.profile.widget.r1(h32Var, s1Var2, str3, z0Var);
            k0Var.v();
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class d implements t25.a, l75.z0, c01.y8 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f162248d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f162249e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f162250f;

    public d(android.content.Context context) {
        this.f162249e = context;
    }

    public static void a(android.content.Context context, boolean z17, com.tencent.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.shake.ui.c(db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(z17 ? com.tencent.mm.R.string.iwq : com.tencent.mm.R.string.iww), true, true, null), new com.tencent.mm.plugin.shake.ui.b(z17, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.tencent.mm.storage.z3.C4(z3Var.d1()));
        c01.d9.b().p().a(this);
        c01.d9.b().a(this);
        this.f162250f = z3Var;
        this.f162248d = rVar;
        ((com.tencent.mm.ui.base.preference.h0) rVar).g(com.tencent.mm.R.xml.f494856a0);
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_shake_go_shake");
        android.content.Context context = this.f162249e;
        if (equals) {
            ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(context, new android.content.Intent(), true);
            ((android.app.Activity) context).finish();
            return true;
        }
        if (str.equals("contact_info_shake_install")) {
            a(context, true, null);
            return true;
        }
        if (!str.equals("contact_info_shake_uninstall")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetShake", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Context context2 = this.f162249e;
        db5.e1.A(context2, context2.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.shake.ui.a(this), null);
        return true;
    }

    @Override // c01.y8
    public void a0() {
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void b() {
        ?? r07 = (c01.z1.n() & 256) == 0 ? 1 : 0;
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f162248d).h("contact_info_header_helper");
        if (helperHeaderPreference != 0) {
            helperHeaderPreference.M(this.f162250f.d1(), this.f162250f.g2(), this.f162249e.getString(com.tencent.mm.R.string.bha));
            helperHeaderPreference.N(r07);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f162248d).m("contact_info_shake_install", r07);
        ((com.tencent.mm.ui.base.preference.h0) this.f162248d).m("contact_info_shake_go_shake", r07 ^ 1);
        ((com.tencent.mm.ui.base.preference.h0) this.f162248d).m("contact_info_shake_uninstall", r07 ^ 1);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetShake", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 7 || o17 == 34) {
            b();
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        c01.d9.b().p().e(this);
        c01.d9.b().G(this);
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}

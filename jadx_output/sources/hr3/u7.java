package hr3;

/* loaded from: classes9.dex */
public class u7 implements t25.a, l75.z0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f284046g;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f284047d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f284048e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f284049f;

    public u7(android.content.Context context) {
        this.f284048e = context;
    }

    public static void a(android.content.Context context) {
        f284046g = false;
        c01.w9.h("medianote", new hr3.t7(db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, true, new hr3.s7())));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I("medianote", 15);
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).k("medianote");
    }

    public static void b(boolean z17) {
        int p17 = c01.z1.p();
        c01.d9.b().p().w(7, java.lang.Integer.valueOf(z17 ? p17 | 16384 : p17 & (-16385)));
        ((e21.z0) c01.d9.b().w()).c(new e21.o(13, z17 ? 1 : 2));
    }

    public static void c(android.content.Context context, boolean z17, com.tencent.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f312615d).k(new hr3.r7(db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(z17 ? com.tencent.mm.R.string.iwq : com.tencent.mm.R.string.iww), true, true, null), new hr3.q7(z17, context, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.tencent.mm.storage.z3.e4(z3Var.d1()));
        c01.d9.b().p().a(this);
        this.f284049f = z3Var;
        this.f284047d = rVar;
        ((com.tencent.mm.ui.base.preference.h0) rVar).g(com.tencent.mm.R.xml.f494849v);
        d();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_medianote_view");
        android.content.Context context = this.f284048e;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", "medianote");
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, context);
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
            return true;
        }
        if (str.equals("contact_info_medianote_sync_to_qqmail")) {
            if (c01.z1.s()) {
                b(((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284047d).h(str)).N());
            } else {
                db5.e1.n(context, com.tencent.mm.R.string.f490972bf0, com.tencent.mm.R.string.bez, new hr3.n7(this), null);
                d();
            }
            return true;
        }
        if (str.equals("contact_info_medianote_clear_data")) {
            android.content.Context context2 = this.f284048e;
            db5.e1.A(context2, context2.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.o7(this), null);
            return true;
        }
        if (str.equals("contact_info_medianote_install")) {
            c(context, true, null);
            return true;
        }
        if (!str.equals("contact_info_medianote_uninstall")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetMediaNote", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Context context3 = this.f284048e;
        db5.e1.A(context3, context3.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.p7(this), null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void d() {
        boolean z17;
        boolean z18;
        ?? r07 = (c01.z1.n() & 16) == 0 ? 1 : 0;
        int p17 = c01.z1.p();
        if (c01.z1.s()) {
            if ((p17 & 16384) != 0) {
                z17 = true;
                com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284047d).h("contact_info_header_helper");
                helperHeaderPreference.M(this.f284049f.d1(), this.f284049f.g2(), this.f284048e.getString(com.tencent.mm.R.string.f490973bf1));
                helperHeaderPreference.N(r07);
                ((com.tencent.mm.ui.base.preference.h0) this.f284047d).m("contact_info_medianote_install", r07);
                ((com.tencent.mm.ui.base.preference.h0) this.f284047d).m("contact_info_medianote_view", r07 ^ 1);
                if (r07 != 0 || c01.z1.s()) {
                    z18 = r07;
                } else {
                    z18 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) == 1;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetMediaNote", "summerqq BindQQSwitch off");
                }
                ((com.tencent.mm.ui.base.preference.h0) this.f284047d).m("contact_info_medianote_sync_to_qqmail", !z18);
                ((com.tencent.mm.ui.base.preference.h0) this.f284047d).m("contact_info_medianote_clear_data", r07 ^ 1);
                ((com.tencent.mm.ui.base.preference.h0) this.f284047d).m("contact_info_medianote_uninstall", r07 ^ 1);
                ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284047d).h("contact_info_medianote_sync_to_qqmail")).O(z17);
            }
        } else if ((p17 & 16384) != 0) {
            c01.d9.b().p().w(7, java.lang.Integer.valueOf(p17 & (-16385)));
        }
        z17 = false;
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference2 = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284047d).h("contact_info_header_helper");
        helperHeaderPreference2.M(this.f284049f.d1(), this.f284049f.g2(), this.f284048e.getString(com.tencent.mm.R.string.f490973bf1));
        helperHeaderPreference2.N(r07);
        ((com.tencent.mm.ui.base.preference.h0) this.f284047d).m("contact_info_medianote_install", r07);
        ((com.tencent.mm.ui.base.preference.h0) this.f284047d).m("contact_info_medianote_view", r07 ^ 1);
        if (r07 != 0) {
        }
        z18 = r07;
        ((com.tencent.mm.ui.base.preference.h0) this.f284047d).m("contact_info_medianote_sync_to_qqmail", !z18);
        ((com.tencent.mm.ui.base.preference.h0) this.f284047d).m("contact_info_medianote_clear_data", r07 ^ 1);
        ((com.tencent.mm.ui.base.preference.h0) this.f284047d).m("contact_info_medianote_uninstall", r07 ^ 1);
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f284047d).h("contact_info_medianote_sync_to_qqmail")).O(z17);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetMediaNote", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
            d();
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        c01.d9.b().p().e(this);
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}

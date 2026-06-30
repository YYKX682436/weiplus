package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class l implements t25.a, l75.z0, com.tencent.mm.modelbase.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f152155n = true;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f152156d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f152157e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f152158f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f152159g;

    /* renamed from: h, reason: collision with root package name */
    public an3.f f152160h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f152161i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f152162m = null;

    public l(android.content.Context context) {
        this.f152157e = context;
        this.f152161i = android.view.View.inflate(context, com.tencent.mm.R.layout.bpr, null);
        gm0.j1.d().a(148, this);
    }

    public static void a(android.content.Context context, boolean z17, com.tencent.mm.ui.z9 z9Var) {
        java.lang.String string = context.getString(z17 ? com.tencent.mm.R.string.iwq : com.tencent.mm.R.string.iww);
        f152155n = z17;
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.nearby.ui.j(db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), string, true, true, null), new com.tencent.mm.plugin.nearby.ui.i(z17, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.tencent.mm.storage.z3.c4(z3Var.d1()));
        gm0.j1.u().c().a(this);
        this.f152158f = z3Var;
        this.f152156d = rVar;
        f152155n = true;
        ((com.tencent.mm.ui.base.preference.h0) rVar).g(com.tencent.mm.R.xml.f494846s);
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_lbs_go_lbs");
        android.content.Context context = this.f152157e;
        if (!equals) {
            if (str.equals("contact_info_lbs_install")) {
                a(context, true, null);
                return true;
            }
            if (str.equals("contact_info_lbs_clear_info")) {
                db5.e1.n(context, com.tencent.mm.R.string.h5w, com.tencent.mm.R.string.h5v, new com.tencent.mm.plugin.nearby.ui.g(this), new com.tencent.mm.plugin.nearby.ui.h(this));
                return true;
            }
            if (str.equals("contact_info_lbs_uninstall")) {
                db5.e1.A(context, context.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.nearby.ui.c(this), null);
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetLBS", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        java.lang.Boolean bool = (java.lang.Boolean) gm0.j1.u().c().l(4103, null);
        if (bool == null || !bool.booleanValue()) {
            j45.l.h(context, "nearby", ".ui.NearbyFriendsIntroUI");
        } else {
            c01.fb b17 = c01.fb.b();
            if (b17 == null) {
                j45.l.h(context, "nearby", ".ui.NearbyPersonalInfoUI");
            } else {
                java.lang.String d17 = b17.d();
                if (d17 == null) {
                    d17 = "";
                }
                java.lang.String c17 = b17.c();
                if (c17 == null) {
                    c17 = "";
                }
                int i17 = b17.f37188b;
                if (d17.equals("") || c17.equals("") || i17 == 0) {
                    j45.l.h(context, "nearby", ".ui.NearbyPersonalInfoUI");
                } else {
                    java.lang.Boolean bool2 = (java.lang.Boolean) gm0.j1.u().c().l(4104, null);
                    if (bool2 == null || !bool2.booleanValue()) {
                        m25.a.a(context, new android.content.Intent());
                        ((android.app.Activity) context).finish();
                    } else {
                        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f152162m;
                        if (j0Var == null) {
                            this.f152162m = db5.e1.x(context, context.getString(com.tencent.mm.R.string.f490573yv), null, this.f152161i, new com.tencent.mm.plugin.nearby.ui.d(this), new com.tencent.mm.plugin.nearby.ui.e(this));
                        } else {
                            j0Var.show();
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void b() {
        ?? r07 = (c01.z1.n() & 512) == 0 ? 1 : 0;
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f152156d).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f152158f.d1(), this.f152158f.g2(), this.f152157e.getString(com.tencent.mm.R.string.bea));
        helperHeaderPreference.N(r07);
        ((com.tencent.mm.ui.base.preference.h0) this.f152156d).m("contact_info_lbs_install", r07);
        ((com.tencent.mm.ui.base.preference.h0) this.f152156d).m("contact_info_lbs_go_lbs", r07 ^ 1);
        ((com.tencent.mm.ui.base.preference.h0) this.f152156d).m("contact_info_lbs_clear_info", r07 ^ 1);
        ((com.tencent.mm.ui.base.preference.h0) this.f152156d).m("contact_info_lbs_uninstall", r07 ^ 1);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetLBS", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
            b();
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        gm0.j1.u().c().e(this);
        gm0.j1.d().q(148, this);
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        if (this.f152160h == null && ((an3.f) m1Var).I() == 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetLBS", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.getType() != 148) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f152159g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f152159g = null;
        }
        if (i17 == 0 && i18 == 0) {
            gm0.j1.u().c().w(4104, java.lang.Boolean.TRUE);
            i19 = com.tencent.mm.R.string.h5y;
        } else {
            i19 = com.tencent.mm.R.string.h5x;
        }
        if (((an3.f) m1Var).I() == 2 && f152155n) {
            db5.e1.m(this.f152157e, i19, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.nearby.ui.k(this));
            this.f152160h = null;
        }
    }
}

package kf3;

/* loaded from: classes9.dex */
public class e implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f307334d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f307335e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f307336f;

    public e(android.content.Context context) {
        new java.util.HashMap();
        this.f307335e = context;
    }

    public static void a() {
        if3.z Ai = if3.k0.Ai();
        if (Ai.f291232d.A("massendinfo", "delete from massendinfo")) {
            Ai.doNotify();
        }
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).k("masssendapp");
    }

    public static void b(android.content.Context context, boolean z17, com.tencent.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f312615d).k(new kf3.d(db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(z17 ? com.tencent.mm.R.string.iwq : com.tencent.mm.R.string.iww), true, true, null), new kf3.c(z17, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.tencent.mm.storage.z3.d4(z3Var.d1()));
        c01.d9.b().p().a(this);
        this.f307336f = z3Var;
        this.f307334d = rVar;
        ((com.tencent.mm.ui.base.preference.h0) rVar).g(com.tencent.mm.R.xml.f494848u);
        c();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_masssend_view");
        android.content.Context context = this.f307335e;
        if (equals) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.class);
            android.content.Context context2 = this.f307335e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/masssend/ui/ContactWidgetMassSend", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/masssend/ui/ContactWidgetMassSend", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("contact_info_masssend_clear_data")) {
            android.content.Context context3 = this.f307335e;
            db5.e1.A(context3, context3.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new kf3.a(this), null);
            return true;
        }
        if (str.equals("contact_info_masssend_install")) {
            b(context, true, null);
            return true;
        }
        if (!str.equals("contact_info_masssend_uninstall")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetMassSend", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Context context4 = this.f307335e;
        db5.e1.A(context4, context4.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new kf3.b(this), null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void c() {
        ?? r07 = (c01.z1.n() & 65536) == 0 ? 1 : 0;
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f307334d).h("contact_info_masssend_header_helper");
        helperHeaderPreference.M(this.f307336f.d1(), this.f307336f.g2(), this.f307335e.getString(com.tencent.mm.R.string.bex));
        helperHeaderPreference.N(r07);
        ((com.tencent.mm.ui.base.preference.h0) this.f307334d).m("contact_info_masssend_install", r07);
        ((com.tencent.mm.ui.base.preference.h0) this.f307334d).m("contact_info_masssend_view", r07 ^ 1);
        ((com.tencent.mm.ui.base.preference.h0) this.f307334d).m("contact_info_masssend_clear_data", r07 ^ 1);
        ((com.tencent.mm.ui.base.preference.h0) this.f307334d).m("contact_info_masssend_uninstall", r07 ^ 1);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetMassSend", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
            c();
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

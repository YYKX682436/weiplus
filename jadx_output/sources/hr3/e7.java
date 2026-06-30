package hr3;

/* loaded from: classes9.dex */
public class e7 implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f283513d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f283514e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f283515f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f283516g = new java.util.HashMap();

    public e7(android.content.Context context) {
        this.f283514e = context;
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).b0("facebookapp");
    }

    public static void a(android.content.Context context, boolean z17, com.tencent.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f312615d).k(new hr3.d7(db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(z17 ? com.tencent.mm.R.string.iwq : com.tencent.mm.R.string.iww), true, true, null), new hr3.c7(z17, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.tencent.mm.storage.z3.Q3(z3Var.d1()));
        c01.d9.b().p().a(this);
        this.f283515f = z3Var;
        this.f283513d = rVar;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494843p);
        com.tencent.mm.ui.base.preference.Preference h17 = h0Var.h("contact_info_header_helper");
        java.util.Map map = this.f283516g;
        if (h17 != null) {
            ((java.util.HashMap) map).put("contact_info_header_helper", h17);
        }
        com.tencent.mm.ui.base.preference.Preference h18 = h0Var.h("contact_info_facebookapp_listfriend");
        if (h18 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_listfriend", h18);
        }
        com.tencent.mm.ui.base.preference.Preference h19 = h0Var.h("contact_info_facebookapp_account");
        if (h19 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_account", h19);
        }
        com.tencent.mm.ui.base.preference.PreferenceCategory preferenceCategory = (com.tencent.mm.ui.base.preference.PreferenceCategory) h0Var.h("contact_info_facebookapp_cat");
        if (preferenceCategory != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_cat", preferenceCategory);
        }
        com.tencent.mm.ui.base.preference.Preference h27 = h0Var.h("contact_info_facebookapp_addr");
        if (h27 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_addr", h27);
        }
        com.tencent.mm.ui.base.preference.PreferenceCategory preferenceCategory2 = (com.tencent.mm.ui.base.preference.PreferenceCategory) h0Var.h("contact_info_facebookapp_cat2");
        if (preferenceCategory2 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_cat2", preferenceCategory2);
        }
        com.tencent.mm.ui.base.preference.Preference h28 = h0Var.h("contact_info_facebookapp_install");
        if (h28 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_install", h28);
        }
        com.tencent.mm.ui.base.preference.Preference h29 = h0Var.h("contact_info_facebookapp_uninstall");
        if (h29 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_uninstall", h29);
        }
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_facebookapp_install");
        android.content.Context context = this.f283514e;
        if (equals) {
            a(context, true, null);
            return true;
        }
        if (str.equals("contact_info_facebookapp_uninstall")) {
            android.content.Context context2 = this.f283514e;
            db5.e1.A(context2, context2.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.b7(this), null);
            return true;
        }
        if (!str.equals("contact_info_facebookapp_listfriend")) {
            if (str.equals("contact_info_facebookapp_account")) {
                j45.l.j(context, "account", ".ui.FacebookAuthUI", new android.content.Intent(), null);
                return true;
            }
            if (str.equals("contact_info_facebookapp_addr")) {
                j45.l.j(context, "account", ".ui.FacebookAuthUI", new android.content.Intent(), null);
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetFacebookapp", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MMFBFriendUI.class);
        android.content.Context context3 = this.f283514e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetFacebookapp", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context3.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context3, "com/tencent/mm/plugin/profile/ui/ContactWidgetFacebookapp", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public final void b() {
        ((com.tencent.mm.ui.base.preference.h0) this.f283513d).t();
        java.util.HashMap hashMap = (java.util.HashMap) this.f283516g;
        if (hashMap.containsKey("contact_info_header_helper")) {
            com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) hashMap.get("contact_info_header_helper");
            ((com.tencent.mm.ui.base.preference.h0) this.f283513d).d(helperHeaderPreference, -1);
            helperHeaderPreference.M(this.f283515f.d1(), this.f283515f.f2(), this.f283514e.getString(com.tencent.mm.R.string.bdg));
            helperHeaderPreference.N((c01.z1.n() & 8192) == 0 ? 1 : 0);
        }
        if (hashMap.containsKey("contact_info_facebookapp_cat")) {
            ((com.tencent.mm.ui.base.preference.h0) this.f283513d).d((com.tencent.mm.ui.base.preference.Preference) hashMap.get("contact_info_facebookapp_cat"), -1);
        }
        if (!((c01.z1.n() & 8192) == 0)) {
            if (hashMap.containsKey("contact_info_facebookapp_install")) {
                ((com.tencent.mm.ui.base.preference.h0) this.f283513d).d((com.tencent.mm.ui.base.preference.Preference) hashMap.get("contact_info_facebookapp_install"), -1);
                return;
            }
            return;
        }
        if (hashMap.containsKey("contact_info_facebookapp_account")) {
            com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) hashMap.get("contact_info_facebookapp_account");
            ((com.tencent.mm.ui.base.preference.h0) this.f283513d).d(preference, -1);
            if (c01.z1.u()) {
                preference.G(com.tencent.mm.R.string.f492979ij3);
            } else {
                preference.G(com.tencent.mm.R.string.inp);
            }
        }
        if (c01.z1.u() && hashMap.containsKey("contact_info_facebookapp_addr")) {
            com.tencent.mm.ui.base.preference.Preference preference2 = (com.tencent.mm.ui.base.preference.Preference) hashMap.get("contact_info_facebookapp_addr");
            ((com.tencent.mm.ui.base.preference.h0) this.f283513d).d(preference2, -1);
            preference2.H((java.lang.String) c01.d9.b().p().l(65826, null));
        }
        if (hashMap.containsKey("contact_info_facebookapp_cat2")) {
            ((com.tencent.mm.ui.base.preference.h0) this.f283513d).d((com.tencent.mm.ui.base.preference.Preference) hashMap.get("contact_info_facebookapp_cat2"), -1);
        }
        if (hashMap.containsKey("contact_info_facebookapp_uninstall")) {
            ((com.tencent.mm.ui.base.preference.h0) this.f283513d).d((com.tencent.mm.ui.base.preference.Preference) hashMap.get("contact_info_facebookapp_uninstall"), -1);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetFacebookapp", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 65825) {
            b();
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

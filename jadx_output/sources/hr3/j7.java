package hr3;

/* loaded from: classes11.dex */
public class j7 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f283673d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f283674e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f283675f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f283676g;

    /* renamed from: h, reason: collision with root package name */
    public int f283677h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f283678i;

    /* renamed from: m, reason: collision with root package name */
    public int f283679m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f283680n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f283681o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference f283682p;

    public j7(android.content.Context context) {
        this.f283673d = context;
        this.f283682p = new com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference(context, 0);
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        boolean z18;
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (d17 == null) {
            d17 = "";
        }
        iz5.a.g(null, d17.length() > 0);
        iz5.a.g(null, rVar != null);
        this.f283674e = rVar;
        this.f283675f = z3Var;
        this.f283676g = z17;
        this.f283677h = i17;
        android.content.Context context = this.f283673d;
        android.app.Activity activity = (android.app.Activity) context;
        this.f283678i = activity.getIntent().getBooleanExtra("User_Verify", false);
        this.f283679m = activity.getIntent().getIntExtra("Kdel_from", -1);
        this.f283680n = z3Var.d1();
        this.f283681o = ((com.tencent.mm.storage.b3) c01.d9.b().l()).W0(this.f283680n);
        ((com.tencent.mm.ui.base.preference.h0) this.f283674e).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f283674e).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(context, null), -1);
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f283682p;
        contactListExpandPreference.C("roominfo_contact_anchor");
        ((com.tencent.mm.ui.base.preference.h0) this.f283674e).d(contactListExpandPreference, -1);
        ((com.tencent.mm.ui.base.preference.h0) this.f283674e).d(new com.tencent.mm.ui.base.preference.PreferenceCategory(context), -1);
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = new com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference(context);
        normalUserFooterPreference.G = com.tencent.mm.R.layout.a1y;
        normalUserFooterPreference.C("contact_info_footer_normal");
        com.tencent.mm.storage.z3 z3Var2 = this.f283675f;
        boolean z27 = this.f283676g;
        boolean z28 = this.f283678i;
        int i18 = this.f283677h;
        int i19 = this.f283679m;
        hr3.va vaVar = normalUserFooterPreference.f153732p0;
        if (vaVar != null) {
            vaVar.i();
        }
        l75.v0 v0Var = normalUserFooterPreference.M1;
        synchronized (v0Var) {
            v0Var.f316971b.clear();
        }
        iz5.a.g(null, z3Var2 != null);
        java.lang.String d18 = z3Var2.d1();
        if (d18 == null) {
            d18 = "";
        }
        iz5.a.g(null, d18.length() > 0);
        if (com.tencent.mm.storage.z3.Y4(c01.z1.r()).equals(z3Var2.d1())) {
            z18 = false;
        } else {
            normalUserFooterPreference.L = z3Var2;
            normalUserFooterPreference.U = "";
            normalUserFooterPreference.M = z27;
            normalUserFooterPreference.N = i18;
            normalUserFooterPreference.P = i19;
            normalUserFooterPreference.W = com.tencent.mm.sdk.platformtools.t8.m1(java.lang.Boolean.valueOf(c01.e2.M(z3Var2.d1())), false);
            normalUserFooterPreference.Q = false;
            normalUserFooterPreference.R = false;
            normalUserFooterPreference.S = 0L;
            normalUserFooterPreference.T = "";
            normalUserFooterPreference.V = z3Var2.F0() == 1;
            com.tencent.mm.ui.MMActivity mMActivity = normalUserFooterPreference.K1;
            normalUserFooterPreference.I1 = mMActivity.getIntent().getBooleanExtra("Contact_AlwaysShowSnsPreBtn", false);
            normalUserFooterPreference.J1 = mMActivity.getIntent().getIntExtra("add_more_friend_search_scene", 0);
            normalUserFooterPreference.Y = mMActivity.getIntent().getBooleanExtra("Contact_IsLbsChattingProfile", false);
            normalUserFooterPreference.Z = mMActivity.getIntent().getBooleanExtra("Contact_IsLbsGotoChatting", false);
            normalUserFooterPreference.L1 = mMActivity.getIntent().getStringExtra("lbs_ticket");
            if (!c01.z1.J(z3Var2.d1())) {
                if (!((com.tencent.mm.storage.ka) c01.d9.b().y()).s0(z3Var2.d1())) {
                    if (com.tencent.mm.storage.z3.G4(z3Var2.d1())) {
                        normalUserFooterPreference.f153732p0 = new hr3.jb(normalUserFooterPreference);
                    } else if (com.tencent.mm.storage.z3.z4(z3Var2.d1())) {
                        normalUserFooterPreference.f153732p0 = new hr3.fb(normalUserFooterPreference);
                    } else if (c01.e2.M(z3Var2.d1())) {
                        normalUserFooterPreference.f153732p0 = new hr3.ib(normalUserFooterPreference);
                    } else {
                        java.lang.String d19 = z3Var2.d1();
                        if (d19 != null && d19.endsWith("@qr")) {
                            normalUserFooterPreference.f153732p0 = new hr3.hb(normalUserFooterPreference);
                        } else if (z3Var2.r2() && !com.tencent.mm.storage.z3.H3(z3Var2.d1())) {
                            normalUserFooterPreference.f153732p0 = new hr3.eb(normalUserFooterPreference);
                        } else if (z28) {
                            normalUserFooterPreference.f153732p0 = new hr3.rb(normalUserFooterPreference);
                        } else if (com.tencent.mm.storage.z3.H3(z3Var2.d1())) {
                            normalUserFooterPreference.f153732p0 = new hr3.ya(normalUserFooterPreference);
                        } else {
                            normalUserFooterPreference.f153732p0 = new hr3.eb(normalUserFooterPreference);
                        }
                    }
                    normalUserFooterPreference.O();
                    z18 = true;
                }
            }
            normalUserFooterPreference.f153732p0 = new hr3.eb(normalUserFooterPreference);
            normalUserFooterPreference.O();
            z18 = true;
        }
        if (z18) {
            ((com.tencent.mm.ui.base.preference.h0) this.f283674e).d(normalUserFooterPreference, -1);
        }
        contactListExpandPreference.R(this.f283674e, contactListExpandPreference.f197780q);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str = this.f283680n;
        ((py.a) iVar).getClass();
        java.util.List m17 = c01.v1.m(str);
        contactListExpandPreference.T(false);
        contactListExpandPreference.V(false);
        contactListExpandPreference.O(this.f283680n, m17, true);
        contactListExpandPreference.Z(new hr3.i7(this));
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        if (n17 != null && ((int) n17.E2) > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this.f283673d, com.tencent.mm.plugin.profile.ui.ContactInfoUI.class);
            intent.putExtra("Contact_User", n17.d1());
            android.content.Context context = this.f283673d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetGroupCard", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/profile/ui/ContactWidgetGroupCard", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = (com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283674e).h("contact_info_footer_normal");
        if (normalUserFooterPreference == null) {
            return true;
        }
        hr3.va vaVar = normalUserFooterPreference.f153732p0;
        if (vaVar != null) {
            vaVar.i();
        }
        l75.v0 v0Var = normalUserFooterPreference.M1;
        synchronized (v0Var) {
            v0Var.f316971b.clear();
        }
        return true;
    }
}

package hr3;

/* loaded from: classes9.dex */
public class m7 implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f283793d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f283794e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f283795f;

    /* renamed from: g, reason: collision with root package name */
    public final hr3.i9 f283796g;

    public m7(android.content.Context context) {
        this.f283794e = context;
        this.f283796g = new hr3.k9(context);
    }

    public static void a(android.content.Context context, boolean z17, com.tencent.mm.ui.z9 z9Var) {
        new com.tencent.mm.sdk.platformtools.b4(new hr3.l7(db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(z17 ? com.tencent.mm.R.string.iwq : com.tencent.mm.R.string.iww), true, true, null), z17, z9Var), false).c(1500L, 1500L);
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        boolean z18 = false;
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        if (d17 != null && d17.equalsIgnoreCase("linkedinplugin")) {
            z18 = true;
        }
        iz5.a.g(null, z18);
        c01.d9.b().p().a(this);
        this.f283795f = z3Var;
        this.f283793d = rVar;
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_linkedin_install");
        android.content.Context context = this.f283794e;
        if (equals) {
            a(context, true, null);
            return true;
        }
        if (str.equals("contact_info_linkedin_uninstall")) {
            android.content.Context context2 = this.f283794e;
            db5.e1.A(context2, context2.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.k7(this), null);
            return true;
        }
        if (str.equals("contact_info_linkedin_account")) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI.class);
            android.app.Activity activity = (android.app.Activity) context;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetLinkedIn", "handleEvent", "(Ljava/lang/String;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetLinkedIn", "handleEvent : unExpected key = ".concat(str));
        return false;
    }

    public final void b() {
        boolean z17 = (c01.z1.n() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0;
        ((com.tencent.mm.ui.base.preference.h0) this.f283793d).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f283793d).g(com.tencent.mm.R.xml.f494847t);
        ((com.tencent.mm.plugin.profile.ui.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283793d).h("contact_info_header_helper")).N(this.f283795f, this.f283796g);
        if (z17) {
            ((com.tencent.mm.ui.base.preference.h0) this.f283793d).m("contact_info_linkedin_account", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f283793d).w("contact_info_linkedin_install");
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f283793d).m("contact_info_linkedin_account", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f283793d).w("contact_info_linkedin_uninstall");
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            boolean z17 = obj instanceof java.lang.String;
            return;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        if (intValue == 40 || intValue == 34) {
            b();
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            b();
        }
    }

    @Override // t25.a
    public boolean onDetach() {
        hr3.i9 i9Var;
        c01.d9.b().p().e(this);
        com.tencent.mm.plugin.profile.ui.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.plugin.profile.ui.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283793d).h("contact_info_header_helper");
        if (helperHeaderPreference != null && (i9Var = helperHeaderPreference.R) != null) {
            i9Var.onDetach();
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}

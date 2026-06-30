package hr3;

/* loaded from: classes9.dex */
public class l8 implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f283750d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f283751e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f283752f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f283753g;

    public l8(android.content.Context context) {
        this.f283750d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        c01.d9.b().p().a(this);
        this.f283751e = rVar;
        this.f283752f = z3Var;
        ((com.tencent.mm.ui.base.preference.h0) rVar).g(com.tencent.mm.R.xml.f494853y);
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = "contact_info_go_to_sync".equals(str);
        android.content.Context context = this.f283750d;
        if (equals) {
            if (com.tencent.mm.pluginsdk.model.app.j1.f(context, "com.tencent.qqpim")) {
                android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.tencent.qqpim");
                launchIntentForPackage.addFlags(268435456);
                android.content.Context context2 = this.f283750d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(launchIntentForPackage);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetQQSync", "goToSync", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/profile/ui/ContactWidgetQQSync", "goToSync", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                db5.e1.j(this.f283750d, com.tencent.mm.R.string.f490983bg5, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.f490375t8, com.tencent.mm.R.string.f490347sg, new hr3.i8(this), null);
            }
            return true;
        }
        if ("contact_info_remind_me_syncing".equals(str)) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283751e).h("contact_info_remind_me_syncing");
            c01.d9.b().p().w(65792, java.lang.Boolean.valueOf(checkBoxPreference.N()));
            c01.sc.b(6, checkBoxPreference.N() ? "1" : "2");
            return true;
        }
        if (str.equals("contact_info_qqsync_install")) {
            a(context, true);
            return true;
        }
        if (!str.equals("contact_info_qqsync_uninstall")) {
            return false;
        }
        android.content.Context context3 = this.f283750d;
        db5.e1.A(context3, context3.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.h8(this), null);
        return true;
    }

    public final void a(android.content.Context context, boolean z17) {
        gm0.j1.e().j(new hr3.k8(this, z17, db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(z17 ? com.tencent.mm.R.string.iwq : com.tencent.mm.R.string.iww), true, true, null)));
    }

    public final void b() {
        this.f283753g = (c01.z1.n() & 128) == 0;
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283751e).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f283752f.d1(), this.f283752f.g2(), this.f283750d.getString(com.tencent.mm.R.string.bg6));
        helperHeaderPreference.N(this.f283753g ? 1 : 0);
        ((com.tencent.mm.ui.base.preference.h0) this.f283751e).m("contact_info_go_to_sync", !this.f283753g);
        ((com.tencent.mm.ui.base.preference.h0) this.f283751e).m("contact_info_remind_me_syncing_tip", !this.f283753g);
        ((com.tencent.mm.ui.base.preference.h0) this.f283751e).m("contact_info_qqsync_install", this.f283753g);
        ((com.tencent.mm.ui.base.preference.h0) this.f283751e).m("contact_info_qqsync_uninstall", true ^ this.f283753g);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (this.f283753g != ((c01.z1.n() & 128) == 0)) {
            b();
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        c01.d9.b().p().e(this);
        return true;
    }
}

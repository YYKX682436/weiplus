package hr3;

/* loaded from: classes9.dex */
public abstract class d8 implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f283476d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f283477e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f283478f;

    /* renamed from: g, reason: collision with root package name */
    public final hr3.i9 f283479g;

    public d8(android.content.Context context, hr3.i9 i9Var) {
        this.f283476d = context;
        this.f283479g = i9Var;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (d17 == null) {
            d17 = "";
        }
        iz5.a.g(null, d17.length() > 0);
        iz5.a.g(null, rVar != null);
        c01.d9.b().p().a(this);
        this.f283477e = z3Var;
        this.f283478f = rVar;
        b();
        return true;
    }

    public abstract void a(boolean z17);

    public void b() {
        ((com.tencent.mm.ui.base.preference.h0) this.f283478f).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f283478f).g(com.tencent.mm.R.xml.f494844q);
        boolean z17 = (c01.z1.n() & 32768) == 0;
        com.tencent.mm.plugin.profile.ui.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.plugin.profile.ui.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283478f).h("contact_info_header_helper");
        if (helperHeaderPreference != null) {
            helperHeaderPreference.N(this.f283477e, this.f283479g);
        }
        if (z17) {
            ((com.tencent.mm.ui.base.preference.h0) this.f283478f).w("contact_info_plugin_install");
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f283478f).w("contact_info_plugin_view");
        ((com.tencent.mm.ui.base.preference.h0) this.f283478f).w("contact_info_plugin_clear_data");
        ((com.tencent.mm.ui.base.preference.h0) this.f283478f).w("contact_info_plugin_uninstall");
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetPlugin", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
            b();
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        hr3.i9 i9Var;
        c01.d9.b().p().e(this);
        com.tencent.mm.plugin.profile.ui.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.plugin.profile.ui.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283478f).h("contact_info_header_helper");
        if (helperHeaderPreference == null || (i9Var = helperHeaderPreference.R) == null) {
            return true;
        }
        i9Var.onDetach();
        return true;
    }
}

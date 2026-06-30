package hr3;

/* loaded from: classes11.dex */
public class v6 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f284101d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f284102e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f284103f;

    /* renamed from: g, reason: collision with root package name */
    public cr3.d0 f284104g;

    public v6(android.content.Context context) {
        this.f284101d = context;
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
        this.f284102e = z3Var;
        android.content.Context context = this.f284101d;
        ((com.tencent.mm.ui.MMActivity) context).getIntent().putExtra("Contact_Scene", 25);
        if (this.f284104g == null) {
            this.f284104g = new cr3.d0((com.tencent.mm.ui.MMActivity) context, z3Var);
        }
        onDetach();
        this.f284103f = rVar;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.t();
        h0Var.g(com.tencent.mm.R.xml.f494840n);
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) h0Var.h("contact_info_header_normal");
        if (normalProfileHeaderPreference != null) {
            normalProfileHeaderPreference.S = h0Var;
            normalProfileHeaderPreference.M(z3Var, 25, z17, null);
        }
        com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference = (com.tencent.mm.ui.base.preference.KeyValuePreference) h0Var.h("contact_info_signature");
        java.lang.String str = z3Var.V;
        if (str == null || str.trim().equals("")) {
            h0Var.v(keyValuePreference);
        } else if (keyValuePreference != null) {
            keyValuePreference.P = false;
            keyValuePreference.L(context.getString(com.tencent.mm.R.string.bhc));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = z3Var.V;
            ((ke0.e) xVar).getClass();
            keyValuePreference.H(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
            keyValuePreference.O(false);
            keyValuePreference.E(8);
        }
        com.tencent.mm.plugin.profile.ui.MultiButtonPreference multiButtonPreference = (com.tencent.mm.plugin.profile.ui.MultiButtonPreference) h0Var.h("contact_profile_multi_button");
        java.lang.String string = context.getString(com.tencent.mm.R.string.ak6);
        hr3.u6 u6Var = new hr3.u6(this);
        multiButtonPreference.L = string;
        multiButtonPreference.N = u6Var;
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        if (!str.equals("contact_profile_say_hi")) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f284102e.d1());
        intent.putExtra("Contact_Scene", 25);
        intent.putExtra("AntispamTicket", this.f284102e.F1);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.z(intent, this.f284101d);
        return true;
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        com.tencent.mm.ui.base.preference.r rVar = this.f284103f;
        if (rVar == null) {
            return true;
        }
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_info_header_normal");
        if (normalProfileHeaderPreference != null) {
            normalProfileHeaderPreference.T();
        }
        cr3.d0 d0Var = this.f284104g;
        if (d0Var != null) {
            ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(d0Var);
        }
        return true;
    }
}

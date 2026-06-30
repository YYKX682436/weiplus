package hr3;

/* loaded from: classes9.dex */
public class a7 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f283378d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f283379e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f283380f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f283381g;

    /* renamed from: i, reason: collision with root package name */
    public final hr3.i9 f283383i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f283384m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f283385n = false;

    /* renamed from: h, reason: collision with root package name */
    public int f283382h = -1;

    public a7(android.content.Context context) {
        this.f283378d = context;
        this.f283383i = new hr3.b9(context);
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.tencent.mm.storage.z3.Y3(z3Var.d1()));
        this.f283379e = rVar;
        this.f283380f = z17;
        this.f283381g = z3Var;
        if (this.f283382h == -1) {
            this.f283382h = c01.z1.p();
        }
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494845r);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_recommend_qqfriends_to_me");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_recommend_mobilefriends_to_me");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_recommend_fbfriends_to_me");
        checkBoxPreference2.O(!((this.f283382h & 256) != 0));
        checkBoxPreference.O(!((this.f283382h & 128) != 0));
        checkBoxPreference3.O((c01.z1.o() & 4) != 0);
        ((com.tencent.mm.plugin.profile.ui.HelperHeaderPreference) h0Var.h("contact_info_header_helper")).N(z3Var, this.f283383i);
        if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c01.d9.b().p().l(9, null)) != 0) {
            h0Var.v(h0Var.h("contact_info_bind_qq_entry"));
            h0Var.v(h0Var.h("contact_info_bind_qq_entry_tip"));
        } else {
            h0Var.v(checkBoxPreference);
            if (!u11.c.d()) {
                h0Var.v(h0Var.h("contact_info_bind_qq_entry"));
                h0Var.v(h0Var.h("contact_info_bind_qq_entry_tip"));
            }
        }
        if (r61.q0.b() == js.x0.SUCC) {
            h0Var.v(h0Var.h("contact_info_bind_mobile_entry"));
            h0Var.v(h0Var.h("contact_info_bind_mobile_entry_tip"));
        } else {
            h0Var.v(checkBoxPreference2);
            h0Var.h("contact_info_bind_mobile_entry").G(com.tencent.mm.R.string.ipy);
        }
        if ((c01.z1.n() & 8192) == 0) {
            boolean u17 = c01.z1.u();
            h0Var.v(checkBoxPreference3);
            if (u17) {
                h0Var.h("contact_info_bind_fb_entry").G(com.tencent.mm.R.string.bde);
            } else {
                h0Var.h("contact_info_bind_fb_entry").G(com.tencent.mm.R.string.ipy);
            }
        } else {
            h0Var.v(h0Var.h("contact_info_bind_fb_entry"));
            h0Var.v(h0Var.h("contact_info_bind_fb_entry_tip"));
            h0Var.v(checkBoxPreference3);
        }
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        if (str.equals("contact_info_recommend_qqfriends_to_me")) {
            a(!((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283379e).h("contact_info_recommend_qqfriends_to_me")).N(), 128, 6);
            return true;
        }
        if (str.equals("contact_info_recommend_mobilefriends_to_me")) {
            a(!((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283379e).h("contact_info_recommend_mobilefriends_to_me")).N(), 256, 7);
            return true;
        }
        if (str.equals("contact_info_recommend_fbfriends_to_me")) {
            boolean N = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283379e).h("contact_info_recommend_fbfriends_to_me")).N();
            int o17 = c01.z1.o();
            c01.d9.b().p().w(40, java.lang.Integer.valueOf(N ? o17 | 4 : o17 & (-5)));
            ((e21.z0) c01.d9.b().w()).c(new e21.o(18, N ? 1 : 2));
            return true;
        }
        boolean equals = str.equals("contact_info_view_message");
        android.content.Context context = this.f283378d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            if (this.f283380f) {
                intent.putExtra("Chat_User", this.f283381g.d1());
                intent.putExtra("Chat_Mode", 1);
                intent.addFlags(67108864);
                android.app.Activity activity = (android.app.Activity) context;
                activity.setResult(-1, intent);
                activity.finish();
            } else {
                intent.putExtra("Chat_User", this.f283381g.d1());
                intent.putExtra("Chat_Mode", 1);
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, context);
                ((android.app.Activity) context).finish();
            }
            return true;
        }
        if (str.equals("contact_info_bind_mobile_entry")) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.g(new android.content.Intent(), context, -1);
            return true;
        }
        if (str.equals("contact_info_bind_qq_entry")) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.i(new android.content.Intent(), context);
            return true;
        }
        if (str.equals("contact_info_bind_fb_entry")) {
            j45.l.j(context, "account", ".ui.FacebookAuthUI", new android.content.Intent(), null);
            return true;
        }
        if (!str.equals("contact_info_fmessage_clear_data")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetFMessage", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Context context2 = this.f283378d;
        db5.e1.A(context2, context2.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.x6(this), null);
        return true;
    }

    public final void a(boolean z17, int i17, int i18) {
        if (z17) {
            this.f283382h = i17 | this.f283382h;
        } else {
            this.f283382h = (~i17) & this.f283382h;
        }
        c01.d9.b().p().w(7, java.lang.Integer.valueOf(this.f283382h));
        ((e21.z0) c01.d9.b().w()).c(new e21.o(i18, z17 ? 1 : 2));
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        hr3.i9 i9Var;
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        com.tencent.mm.plugin.profile.ui.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.plugin.profile.ui.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283379e).h("contact_info_header_helper");
        if (helperHeaderPreference == null || (i9Var = helperHeaderPreference.R) == null) {
            return true;
        }
        i9Var.onDetach();
        return true;
    }
}

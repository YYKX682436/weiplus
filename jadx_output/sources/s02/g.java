package s02;

/* loaded from: classes9.dex */
public class g implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f401954d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f401955e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f401956f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f401957g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f401958h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f401959i;

    public g(android.content.Context context) {
        this.f401954d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        this.f401956f = rVar;
        this.f401955e = z3Var;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494842o);
        this.f401958h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_top_downloader");
        this.f401959i = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_not_disturb");
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean equals = "contact_info_go_to_downloader".equals(str);
        android.content.Context context = this.f401954d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f401955e.d1());
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            return true;
        }
        if ("contact_info_downloader_manager".equals(str)) {
            ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(context, null, null);
            return true;
        }
        if ("contact_info_common_problem".equals(str)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KPublisherId", "custom_menu");
            intent2.putExtra("pre_username", this.f401955e.d1());
            intent2.putExtra("prePublishId", "custom_menu");
            intent2.putExtra("preUsername", this.f401955e.d1());
            intent2.putExtra("preChatName", this.f401955e.d1());
            intent2.putExtra("preChatTYPE", c01.h2.a(this.f401955e.d1(), this.f401955e.d1()));
            intent2.putExtra("rawUrl", "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=wechat_movement_faq/index");
            intent2.putExtra("geta8key_username", this.f401955e.d1());
            intent2.putExtra("from_scence", 1);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
            return true;
        }
        if ("contact_info_top_downloader".equals(str)) {
            if (this.f401958h.N()) {
                c01.e2.t0(this.f401955e.d1(), true, true);
            } else {
                c01.e2.B0(this.f401955e.d1(), true, true);
            }
            return true;
        }
        if ("contact_info_not_disturb".equals(str)) {
            if (this.f401959i.N()) {
                c01.e2.p0(this.f401955e, true);
            } else {
                c01.e2.z0(this.f401955e, true);
            }
            return true;
        }
        if ("contact_info_clear_data".equals(str)) {
            android.content.Context context2 = this.f401954d;
            db5.e1.A(context2, context2.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new s02.a(this), null);
            return true;
        }
        if ("contact_info_downloader_install".equals(str)) {
            a(context, true);
            return true;
        }
        if (!"contact_info_downloader_uninstall".equals(str)) {
            return false;
        }
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).getClass();
        com.tencent.mm.plugin.downloader_app.model.s0.d();
        if (com.tencent.mm.plugin.downloader_app.model.s0.f97329a.size() > 0) {
            android.content.Context context3 = this.f401954d;
            db5.e1.A(context3, context3.getString(com.tencent.mm.R.string.bsr), context.getString(com.tencent.mm.R.string.bss), context.getString(com.tencent.mm.R.string.bsq), context.getString(com.tencent.mm.R.string.bse), new s02.b(this), new s02.c(this));
        } else {
            android.content.Context context4 = this.f401954d;
            db5.e1.A(context4, context4.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new s02.d(this), null);
        }
        return true;
    }

    public final void a(android.content.Context context, boolean z17) {
        gm0.j1.e().j(new s02.f(this, z17, db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(z17 ? com.tencent.mm.R.string.iwq : com.tencent.mm.R.string.iww), true, true, null), context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int, boolean] */
    public final void b() {
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f401956f).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f401955e.d1(), this.f401955e.g2(), this.f401954d.getString(com.tencent.mm.R.string.bsa));
        ?? r17 = (c01.z1.n() & 134217728) == 0 ? 1 : 0;
        this.f401957g = r17;
        helperHeaderPreference.N(r17);
        ((com.tencent.mm.ui.base.preference.h0) this.f401956f).m("contact_info_downloader_install", this.f401957g);
        ((com.tencent.mm.ui.base.preference.h0) this.f401956f).m("contact_info_downloader_uninstall", !this.f401957g);
        ((com.tencent.mm.ui.base.preference.h0) this.f401956f).m("contact_info_go_to_downloader", !this.f401957g);
        ((com.tencent.mm.ui.base.preference.h0) this.f401956f).m("contact_info_downloader_manager", !this.f401957g);
        ((com.tencent.mm.ui.base.preference.h0) this.f401956f).m("contact_info_common_problem", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f401956f).m("contact_info_top_downloader", !this.f401957g);
        ((com.tencent.mm.ui.base.preference.h0) this.f401956f).m("contact_info_not_disturb", !this.f401957g);
        ((com.tencent.mm.ui.base.preference.h0) this.f401956f).m("contact_info_clear_data", !this.f401957g);
        if (this.f401957g) {
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f401955e.d1())) {
                this.f401958h.O(true);
            } else {
                this.f401958h.O(false);
            }
            if (c01.e2.P(this.f401955e)) {
                this.f401959i.O(true);
            } else {
                this.f401959i.O(false);
            }
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        return true;
    }
}

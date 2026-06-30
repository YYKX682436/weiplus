package hr3;

/* loaded from: classes9.dex */
public class a8 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f283386d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f283388f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f283389g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f283390h;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f283387e = null;

    /* renamed from: i, reason: collision with root package name */
    public hr3.z7 f283391i = null;

    public a8(android.content.Context context) {
        this.f283386d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetMiniShopHelper", "onAttach");
        this.f283388f = rVar;
        this.f283387e = z3Var;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494850w);
        this.f283389g = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_mini_shop_helper_top");
        this.f283390h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_mini_shop_helper_not_disturb");
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetMiniShopHelper", "handleEvent, key: " + str);
        if (str == null) {
            return false;
        }
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -2027998924:
                if (str.equals("contact_info_mini_shop_helper_go_to")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1521942243:
                if (str.equals("contact_info_mini_shop_helper_install")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1450872065:
                if (str.equals("contact_info_mini_shop_helper_help")) {
                    c17 = 2;
                    break;
                }
                break;
            case 154744730:
                if (str.equals("contact_info_mini_shop_helper_clear_data")) {
                    c17 = 3;
                    break;
                }
                break;
            case 1338682839:
                if (str.equals("contact_info_mini_shop_helper_top")) {
                    c17 = 4;
                    break;
                }
                break;
            case 1342712804:
                if (str.equals("contact_info_mini_shop_helper_uninstall")) {
                    c17 = 5;
                    break;
                }
                break;
            case 1848846101:
                if (str.equals("contact_info_mini_shop_helper_not_disturb")) {
                    c17 = 6;
                    break;
                }
                break;
        }
        android.content.Context context = this.f283386d;
        switch (c17) {
            case 0:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", this.f283387e.d1());
                intent.putExtra("finish_direct", true);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                a().a(1, 1);
                return true;
            case 1:
                com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.iwq), true, true, null);
                Q.show();
                gm0.j1.d().a(30, new hr3.x7(this, Q));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("gh_579db1f2cf89");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(1);
                gm0.j1.d().g(new com.tencent.mm.pluginsdk.model.m3(1, arrayList, arrayList2, "", ""));
                return true;
            case 2:
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("rawUrl", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_minishop_plugin_helpcenter, "https://developers.weixin.qq.com/community/minihome/article/doc/000000208c8018662cda04cf35b813", true));
                intent2.putExtra("showShare", true);
                intent2.putExtra("allow_mix_content_mode", false);
                j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent2, null);
                a().a(5, 1);
                return true;
            case 3:
                db5.e1.A(context, context.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.w7(this), null);
                return true;
            case 4:
                boolean N = this.f283389g.N();
                hr3.z7 a17 = a();
                a17.getClass();
                a17.a(3, N ? 2 : 3);
                if (N) {
                    c01.e2.t0(this.f283387e.d1(), true, true);
                } else {
                    c01.e2.B0(this.f283387e.d1(), true, true);
                }
                return true;
            case 5:
                db5.e1.A(context, context.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.y7(this), null);
                return true;
            case 6:
                boolean N2 = this.f283390h.N();
                hr3.z7 a18 = a();
                a18.getClass();
                a18.a(4, N2 ? 2 : 3);
                if (N2) {
                    c01.e2.p0(this.f283387e, true);
                } else {
                    c01.e2.z0(this.f283387e, true);
                }
                return true;
            default:
                return false;
        }
    }

    public final hr3.z7 a() {
        if (this.f283391i == null) {
            this.f283391i = new hr3.z7(null);
        }
        return this.f283391i;
    }

    public final void b() {
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283388f).h("contact_info_mini_shop_helper_header_helper");
        helperHeaderPreference.M(this.f283387e.d1(), this.f283387e.f2(), this.f283386d.getString(com.tencent.mm.R.string.bf6));
        if (!this.f283387e.r2()) {
            helperHeaderPreference.N(0);
            ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_install", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_uninstall", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_go_to", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_top", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_not_disturb", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_help", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_clear_data", true);
            return;
        }
        helperHeaderPreference.N(1);
        ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_install", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_uninstall", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_go_to", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_top", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_not_disturb", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_help", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f283388f).m("contact_info_mini_shop_helper_clear_data", false);
        this.f283389g.O(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f283387e.d1()));
        this.f283390h.O(c01.e2.P(this.f283387e));
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetMiniShopHelper", "onDetach");
        return true;
    }
}

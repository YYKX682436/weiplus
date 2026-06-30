package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class c implements t25.a, com.tencent.mm.modelbase.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f180155n = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2) + "/touch/product/wechatpay_app.html?scene_id=kf594";

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f180156d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f180157e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f180158f;

    /* renamed from: g, reason: collision with root package name */
    public int f180159g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f180160h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f180161i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f180162m;

    public c(android.content.Context context) {
        this.f180156d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        this.f180158f = rVar;
        this.f180157e = z3Var;
        this.f180159g = i17;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494861a5);
        this.f180160h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_wxpay_business_collection_top");
        this.f180161i = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_wxpay_business_collection_not_disturb");
        a();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "handleEvent key:%s", str);
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_business_collection_go_to", str);
        android.content.Context context = this.f180156d;
        if (D0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f180157e.d1());
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_business_collection_top", str)) {
            if (this.f180160h.N()) {
                c01.e2.t0(this.f180157e.d1(), true, true);
                return false;
            }
            c01.e2.B0(this.f180157e.d1(), true, true);
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_business_collection_not_disturb", str)) {
            if (this.f180161i.N()) {
                c01.e2.p0(this.f180157e, true);
                return false;
            }
            c01.e2.z0(this.f180157e, true);
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_business_collection_help", str)) {
            com.tencent.mm.wallet_core.ui.r1.V(context, f180155n, true);
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_business_collection_clear_data", str)) {
            android.content.Context context2 = this.f180156d;
            db5.e1.A(context2, context2.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet_core.ui.a(this), null);
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_business_collection_install", str)) {
            if (!com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_business_collection_uninstall", str)) {
                return false;
            }
            db5.e1.A(context, context.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet_core.ui.b(this), null);
            return false;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.iwq), true, true, null);
        this.f180162m = Q;
        Q.show();
        gm0.j1.d().a(30, this);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("gh_e087bb5b95e6");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(java.lang.Integer.valueOf(this.f180159g));
        gm0.j1.d().g((com.tencent.mm.modelbase.m1) ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).wi(1, linkedList, linkedList2, "", ""));
        return false;
    }

    public final void a() {
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f180158f).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f180157e.d1(), this.f180157e.g2(), this.f180156d.getString(com.tencent.mm.R.string.bjm));
        if (!this.f180157e.r2()) {
            helperHeaderPreference.N(0);
            ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_install", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_uninstall", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_go_to", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_top", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_not_disturb", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_help", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_clear_data", true);
            return;
        }
        helperHeaderPreference.N(1);
        ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_install", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_uninstall", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_go_to", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_top", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_not_disturb", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_help", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180158f).m("contact_info_wxpay_business_collection_clear_data", false);
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f180157e.d1())) {
            this.f180160h.O(true);
        } else {
            this.f180160h.O(false);
        }
        if (c01.e2.P(this.f180157e)) {
            this.f180161i.O(true);
        } else {
            this.f180161i.O(false);
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        qk.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        if (m1Var instanceof ns.l) {
            gm0.j1.d().q(30, this);
            if (i17 == 0 && i18 == 0) {
                java.lang.String J2 = ((com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var)).J();
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "bind fitness contact %s success", J2);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_e087bb5b95e6", true);
                if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(J2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "respUsername == " + J2 + ", contact = " + n17);
                } else {
                    if (com.tencent.mm.storage.z3.E4(n17.d1())) {
                        java.lang.String d17 = n17.d1();
                        if (d17 == null) {
                            d17 = "";
                        }
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
                        oVar = r01.z.b(d17);
                        if (oVar != null) {
                            oVar.field_username = J2;
                        }
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).wi(d17);
                        n17.K1(d17);
                    } else {
                        oVar = null;
                    }
                    n17.X1(J2);
                    if (((int) n17.E2) == 0) {
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n17);
                    }
                    if (((int) n17.E2) <= 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "addContact : insert contact failed");
                    } else {
                        c01.e2.m0(n17);
                        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.d1(), true);
                        if (oVar != null) {
                            ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(oVar);
                        } else {
                            rv.v2 v2Var = (rv.v2) i95.n0.c(rv.v2.class);
                            java.lang.String d18 = n18.d1();
                            ((qv.q) v2Var).getClass();
                            qk.o b17 = r01.z.b(d18);
                            if (b17 == null || b17.U0()) {
                                c01.n8.a().c(n18.d1(), 4);
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            } else if (n18.X4()) {
                                c01.n8.a().c(n18.d1(), 4);
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            }
                        }
                    }
                }
                rv.v2 v2Var2 = (rv.v2) i95.n0.c(rv.v2.class);
                java.lang.String d19 = n17.d1();
                ((qv.q) v2Var2).getClass();
                qk.o b18 = r01.z.b(d19);
                if (b18 != null) {
                    ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(b18);
                }
                gm0.j1.u().c().w(327825, java.lang.Boolean.TRUE);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
                }
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f180162m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            a();
        }
    }
}

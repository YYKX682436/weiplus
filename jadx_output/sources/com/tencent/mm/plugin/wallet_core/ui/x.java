package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class x implements t25.a, com.tencent.mm.modelbase.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f180775n = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2) + "/touch/scene_product.html?scene_id=kf1";

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f180776d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f180777e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f180778f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f180779g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f180780h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f180781i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f180782m;

    public x(android.content.Context context) {
        this.f180776d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        this.f180778f = rVar;
        this.f180777e = z3Var;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494864a8);
        this.f180779g = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_wxpay_notify_top");
        this.f180780h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_wxpay_notify_not_disturb");
        b();
        gm0.j1.d().a(1820, this);
        gm0.j1.d().g(new ss4.j());
        android.content.Context context = this.f180776d;
        if (!(context instanceof com.tencent.mm.ui.base.preference.MMPreference)) {
            return true;
        }
        ((com.tencent.mm.ui.base.preference.MMPreference) context).getBottomMask().getLayoutParams().height = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        ((com.tencent.mm.ui.base.preference.MMPreference) context).getBottomMask().setBackgroundResource(com.tencent.mm.R.drawable.cyi);
        android.view.View bottomMask = ((com.tencent.mm.ui.base.preference.MMPreference) context).getBottomMask();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bottomMask, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayNotify", "onAttach", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/storage/Contact;ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bottomMask.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(bottomMask, "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayNotify", "onAttach", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/storage/Contact;ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "handleEvent key:%s", str);
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_notify_go_to", str);
        android.content.Context context = this.f180776d;
        if (D0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f180777e.d1());
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_notify_top", str)) {
            if (this.f180779g.N()) {
                c01.e2.t0(this.f180777e.d1(), true, true);
                a(3);
            } else {
                c01.e2.B0(this.f180777e.d1(), true, true);
                a(4);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_notify_not_disturb", str)) {
            if (this.f180780h.N()) {
                c01.e2.p0(this.f180777e, true);
                a(5);
            } else {
                c01.e2.z0(this.f180777e, true);
                a(6);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_notify_help", str)) {
            com.tencent.mm.wallet_core.ui.r1.V(context, f180775n, true);
            a(7);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_notify_customer_support", str)) {
            com.tencent.mm.wallet_core.ui.r1.b0("gh_21958f90f0d7@app", "/user-service/pages/im/index.html?sceneCode=WxpayPluginSetting", 0, com.tencent.mm.plugin.appbrand.jsapi.webview.d0.CTRL_INDEX);
            a(7);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_notify_clear_data", str)) {
            android.content.Context context2 = this.f180776d;
            db5.e1.A(context2, context2.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet_core.ui.z(this), null);
            a(8);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_notify_install", str)) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.iwq), true, true, null);
            this.f180782m = Q;
            Q.show();
            gm0.j1.d().a(30, this);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("gh_3dfda90e39d6");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(1);
            gm0.j1.d().g((com.tencent.mm.modelbase.m1) ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).wi(1, linkedList, linkedList2, "", ""));
            a(10);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_notify_uninstall", str)) {
            db5.e1.A(context, context.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet_core.ui.a0(this), null);
            a(9);
        }
        return false;
    }

    @Override // t25.a
    public android.view.View S() {
        com.tencent.mm.plugin.wallet_core.utils.z0 z0Var = com.tencent.mm.plugin.wallet_core.utils.z0.f181008a;
        if (!z0Var.a()) {
            return null;
        }
        android.content.Context context = this.f180776d;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e3m, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.szd);
        this.f180781i = textView;
        if (textView != null) {
            if (z0Var.b()) {
                this.f180781i.setText(context.getString(com.tencent.mm.R.string.f492687oc3));
            } else {
                this.f180781i.setText(context.getString(com.tencent.mm.R.string.f492688oc4));
            }
            com.tencent.mm.ui.fk.b(this.f180781i);
            com.tencent.mm.pluginsdk.ui.span.f1.a(this.f180781i, new yz5.l() { // from class: com.tencent.mm.plugin.wallet_core.ui.x$$a
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    com.tencent.mm.plugin.wallet_core.ui.x xVar = com.tencent.mm.plugin.wallet_core.ui.x.this;
                    xVar.getClass();
                    com.tencent.mm.plugin.wallet_core.utils.z0 z0Var2 = com.tencent.mm.plugin.wallet_core.utils.z0.f181008a;
                    if (z0Var2.b()) {
                        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("checkServiceCloseUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.wallet_core.ui.y(xVar));
                    } else {
                        z0Var2.c(xVar.f180776d, new com.tencent.mm.plugin.wallet_core.ui.x$$b(xVar));
                    }
                    return jz5.f0.f302826a;
                }
            });
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "[getBottomView] payBottomTips:" + this.f180781i.hashCode() + ", root:" + inflate.hashCode() + ",this:" + hashCode());
        }
        return inflate;
    }

    public final void a(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.WeChatPayPluginReportStruct weChatPayPluginReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WeChatPayPluginReportStruct();
        weChatPayPluginReportStruct.f62896d = i17;
        weChatPayPluginReportStruct.k();
    }

    public final void b() {
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f180778f).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f180777e.d1(), this.f180777e.g2(), this.f180776d.getString(com.tencent.mm.R.string.f491011bk3));
        if (!this.f180777e.r2()) {
            helperHeaderPreference.N(0);
            ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_install", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_uninstall", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_go_to", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_top", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_not_disturb", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_help", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_customer_support", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_clear_data", true);
            return;
        }
        helperHeaderPreference.N(1);
        ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_install", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_uninstall", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_go_to", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_top", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_not_disturb", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_help", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_customer_support", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180778f).m("contact_info_wxpay_notify_clear_data", false);
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f180777e.d1())) {
            this.f180779g.O(true);
        } else {
            this.f180779g.O(false);
        }
        if (c01.e2.P(this.f180777e)) {
            this.f180780h.O(true);
        } else {
            this.f180780h.O(false);
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
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        qk.o oVar = null;
        if (!(m1Var instanceof ns.l)) {
            if (m1Var instanceof ss4.j) {
                gm0.j1.d().q(1820, this);
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "NetSceneGetPayPlugin fail!");
                    return;
                }
                r45.u65 u65Var = ((ss4.j) m1Var).f412070f;
                if (u65Var == null) {
                    u65Var = new r45.u65();
                }
                r45.yj6 yj6Var = u65Var.f387088d;
                if (yj6Var == null || (linkedList = yj6Var.f391160e) == null || linkedList.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "NetSceneGetPayPlugin no data");
                    return;
                }
                int n17 = ((com.tencent.mm.ui.base.preference.h0) this.f180778f).n("contact_info_wxpay_notify_clear_data");
                java.util.Iterator it = u65Var.f387088d.f391160e.iterator();
                while (it.hasNext()) {
                    r45.e14 e14Var = (r45.e14) it.next();
                    if (e14Var.f372904e.isEmpty()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "ItemSectionViewData is null");
                    } else {
                        n17++;
                        android.content.Context context = this.f180776d;
                        ((com.tencent.mm.ui.base.preference.h0) this.f180778f).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(context, null), n17);
                        java.util.Iterator it6 = e14Var.f372904e.iterator();
                        while (it6.hasNext()) {
                            r45.xj6 xj6Var = (r45.xj6) it6.next();
                            if (!xj6Var.f390167e.isEmpty()) {
                                java.util.LinkedList linkedList2 = xj6Var.f390168f;
                                if (!linkedList2.isEmpty()) {
                                    r45.rl6 rl6Var = (r45.rl6) xj6Var.f390167e.get(0);
                                    r45.rl6 rl6Var2 = (r45.rl6) linkedList2.get(0);
                                    r45.yt5 yt5Var = xj6Var.f390173n;
                                    if (!rl6Var.f384987d.isEmpty()) {
                                        java.util.LinkedList linkedList3 = rl6Var.f384987d;
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(((r45.hl6) linkedList3.get(0)).f376273f) && yt5Var != null) {
                                            n17++;
                                            com.tencent.mm.plugin.wallet_core.ui.c0 c0Var = new com.tencent.mm.plugin.wallet_core.ui.c0(this, context, rl6Var);
                                            c0Var.L(((r45.hl6) linkedList3.get(0)).f376273f);
                                            c0Var.G = com.tencent.mm.R.layout.byv;
                                            if (!rl6Var2.f384987d.isEmpty()) {
                                                java.util.LinkedList linkedList4 = rl6Var2.f384987d;
                                                if (!com.tencent.mm.sdk.platformtools.t8.K0(((r45.hl6) linkedList4.get(0)).f376273f)) {
                                                    c0Var.H(((r45.hl6) linkedList4.get(0)).f376273f);
                                                }
                                            }
                                            ((com.tencent.mm.ui.base.preference.h0) this.f180778f).d(c0Var, n17);
                                            c0Var.f197772f = new com.tencent.mm.plugin.wallet_core.ui.d0(this, rl6Var, yt5Var);
                                        }
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "TableCellViewData inner data null");
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "TableCellViewData data null");
                        }
                    }
                }
                ((com.tencent.mm.ui.base.preference.h0) this.f180778f).notifyDataSetChanged();
                return;
            }
            return;
        }
        gm0.j1.d().q(30, this);
        if (i17 == 0 && i18 == 0) {
            java.lang.String J2 = ((com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var)).J();
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "bind fitness contact %s success", J2);
            com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_3dfda90e39d6", true);
            if (n18 == null || com.tencent.mm.sdk.platformtools.t8.K0(J2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayNotify", "respUsername == " + J2 + ", contact = " + n18);
            } else {
                if (com.tencent.mm.storage.z3.E4(n18.d1())) {
                    java.lang.String d17 = n18.d1();
                    if (d17 == null) {
                        d17 = "";
                    }
                    ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
                    qk.o b17 = r01.z.b(d17);
                    if (b17 != null) {
                        b17.field_username = J2;
                    }
                    ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).wi(d17);
                    n18.K1(d17);
                    oVar = b17;
                }
                n18.X1(J2);
                if (((int) n18.E2) == 0) {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n18);
                }
                if (((int) n18.E2) <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayNotify", "addContact : insert contact failed");
                } else {
                    c01.e2.m0(n18);
                    com.tencent.mm.storage.z3 n19 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n18.d1(), true);
                    if (oVar != null) {
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(oVar);
                    } else {
                        rv.v2 v2Var = (rv.v2) i95.n0.c(rv.v2.class);
                        java.lang.String d18 = n19.d1();
                        ((qv.q) v2Var).getClass();
                        qk.o b18 = r01.z.b(d18);
                        if (b18 == null || b18.U0()) {
                            c01.n8.a().c(n19.d1(), 4);
                            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n19.d1());
                        } else if (n19.X4()) {
                            c01.n8.a().c(n19.d1(), 4);
                            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n19.d1());
                        }
                    }
                }
            }
            rv.v2 v2Var2 = (rv.v2) i95.n0.c(rv.v2.class);
            java.lang.String d19 = n18.d1();
            ((qv.q) v2Var2).getClass();
            qk.o b19 = r01.z.b(d19);
            if (b19 != null) {
                ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(b19);
            }
            gm0.j1.u().c().w(327825, java.lang.Boolean.TRUE);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayNotify", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
            }
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f180782m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        b();
    }
}

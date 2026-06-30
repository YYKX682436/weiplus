package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class l implements t25.a, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f180384d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f180385e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f180386f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f180387g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f180388h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f180389i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f180390m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f180391n;

    public l(android.content.Context context) {
        this.f180384d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "onAttach");
        this.f180386f = rVar;
        this.f180385e = z3Var;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494863a7);
        this.f180387g = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_wxpay_hk_notify_top");
        this.f180388h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_wxpay_hk_notify_not_disturb");
        a();
        gm0.j1.d().a(6855, this);
        gm0.j1.d().g(new ss4.i());
        android.content.Context context = this.f180384d;
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
        yj0.a.d(bottomMask, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayHKNotify", "onAttach", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/storage/Contact;ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bottomMask.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(bottomMask, "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayHKNotify", "onAttach", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/storage/Contact;ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "handleEvent key:%s", str);
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_hk_notify_go_to", str);
        android.content.Context context = this.f180384d;
        if (D0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f180385e.d1());
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_hk_notify_top", str)) {
            if (this.f180387g.N()) {
                c01.e2.t0(this.f180385e.d1(), true, true);
            } else {
                c01.e2.B0(this.f180385e.d1(), true, true);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_hk_notify_not_disturb", str)) {
            if (this.f180388h.N()) {
                c01.e2.p0(this.f180385e, true);
            } else {
                c01.e2.z0(this.f180385e, true);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_hk_notify_help", str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "click Help button ");
            gm0.j1.i();
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WX_PAY_HK_PLUGIN_HELP_URL_STRING_SYNC, null);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                db5.e1.y(context, context.getString(com.tencent.mm.R.string.l0g), "", context.getString(com.tencent.mm.R.string.ke6), new com.tencent.mm.plugin.wallet_core.ui.w(this));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "jump to h5:%s ", str2);
                com.tencent.mm.wallet_core.ui.r1.V(context, str2, true);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_hk_notify_clear_data", str)) {
            db5.e1.A(context, context.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet_core.ui.n(this), null);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_hk_notify_install", str)) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.iwq), true, true, null);
            this.f180391n = Q;
            Q.show();
            gm0.j1.d().a(30, this);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("gh_b4af18eac3d5");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(1);
            gm0.j1.d().g((com.tencent.mm.modelbase.m1) ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).wi(1, linkedList, linkedList2, "", ""));
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_hk_notify_uninstall", str)) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setGravity(17);
            textView.setHeight(i65.a.b(context, 56));
            textView.setTextSize(12.0f);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_1));
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.bju));
            k0Var.s(textView, false);
            k0Var.Z1 = true;
            k0Var.f211872n = new com.tencent.mm.plugin.wallet_core.ui.r(this);
            k0Var.f211881s = new com.tencent.mm.plugin.wallet_core.ui.s(this);
            k0Var.v();
        }
        return false;
    }

    @Override // t25.a
    public android.view.View S() {
        com.tencent.mm.plugin.wallet_core.utils.z0 z0Var = com.tencent.mm.plugin.wallet_core.utils.z0.f181008a;
        if (!z0Var.a()) {
            return null;
        }
        android.content.Context context = this.f180384d;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e3m, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.szd);
        this.f180390m = textView;
        if (textView != null) {
            if (z0Var.b()) {
                this.f180390m.setText(context.getString(com.tencent.mm.R.string.f492687oc3));
            } else {
                this.f180390m.setText(context.getString(com.tencent.mm.R.string.f492688oc4));
            }
            com.tencent.mm.ui.fk.b(this.f180390m);
            com.tencent.mm.pluginsdk.ui.span.f1.a(this.f180390m, new yz5.l() { // from class: com.tencent.mm.plugin.wallet_core.ui.l$$a
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    android.view.View view = (android.view.View) obj;
                    com.tencent.mm.plugin.wallet_core.ui.l lVar = com.tencent.mm.plugin.wallet_core.ui.l.this;
                    lVar.getClass();
                    com.tencent.mm.plugin.wallet_core.utils.z0 z0Var2 = com.tencent.mm.plugin.wallet_core.utils.z0.f181008a;
                    if (z0Var2.b()) {
                        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("checkServiceCloseUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.wallet_core.ui.m(lVar, view));
                    } else {
                        z0Var2.c(lVar.f180384d, new com.tencent.mm.plugin.wallet_core.ui.l$$b(lVar, view));
                    }
                    return jz5.f0.f302826a;
                }
            });
        }
        return inflate;
    }

    public final void a() {
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f180386f).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f180385e.d1(), this.f180385e.g2(), this.f180384d.getString(com.tencent.mm.R.string.bjy));
        if (!this.f180385e.r2()) {
            helperHeaderPreference.N(0);
            ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_install", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_uninstall", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_go_to", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_top", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_not_disturb", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_help", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_clear_data", true);
            return;
        }
        helperHeaderPreference.N(1);
        ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_install", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_uninstall", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_go_to", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_top", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_not_disturb", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_help", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180386f).m("contact_info_wxpay_hk_notify_clear_data", false);
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f180385e.d1())) {
            this.f180387g.O(true);
        } else {
            this.f180387g.O(false);
        }
        if (c01.e2.P(this.f180385e)) {
            this.f180388h.O(true);
        } else {
            this.f180388h.O(false);
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "onActivityResult");
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "requestCode == REQUEST_CODE_DISABLE_PAY_HK");
            if (this.f180389i == null) {
                android.content.Context context = this.f180384d;
                this.f180389i = db5.e1.O(context, null, 3, com.tencent.mm.R.style.f494256i6, context.getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.wallet_core.ui.o(this));
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.wallet_core.ui.q qVar = new com.tencent.mm.plugin.wallet_core.ui.q(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(qVar, 1000L, false);
        }
    }

    @Override // t25.a
    public boolean onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "onDetach");
        gm0.j1.d().q(30, this);
        gm0.j1.d().q(6855, this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        qk.o oVar = null;
        if (m1Var instanceof ns.l) {
            gm0.j1.d().q(30, this);
            if (i17 == 0 && i18 == 0) {
                java.lang.String J2 = ((com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var)).J();
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "bind fitness contact %s success", J2);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_b4af18eac3d5", true);
                if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(J2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "respUsername == " + J2 + ", contact = " + n17);
                } else {
                    if (com.tencent.mm.storage.z3.E4(n17.d1())) {
                        java.lang.String d17 = n17.d1();
                        if (d17 == null) {
                            d17 = "";
                        }
                        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                        qk.o b17 = r01.z.b(d17);
                        if (b17 != null) {
                            b17.field_username = J2;
                        }
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).wi(d17);
                        n17.K1(d17);
                        oVar = b17;
                    }
                    n17.X1(J2);
                    if (((int) n17.E2) == 0) {
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n17);
                    }
                    if (((int) n17.E2) <= 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "addContact : insert contact failed");
                    } else {
                        c01.e2.m0(n17);
                        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.d1(), true);
                        if (oVar != null) {
                            ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(oVar);
                        } else {
                            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                            java.lang.String d18 = n18.d1();
                            ((qv.o) u2Var).getClass();
                            qk.o b18 = r01.z.b(d18);
                            if (b18 == null || b18.U0()) {
                                c01.n8.a().c(n18.d1(), 4);
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            } else if (n18.X4()) {
                                c01.n8.a().c(n18.d1(), 4);
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            }
                        }
                    }
                }
                rv.u2 u2Var2 = (rv.u2) i95.n0.c(rv.u2.class);
                java.lang.String d19 = n17.d1();
                ((qv.o) u2Var2).getClass();
                qk.o b19 = r01.z.b(d19);
                if (b19 != null) {
                    ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(b19);
                }
                gm0.j1.u().c().w(327825, java.lang.Boolean.TRUE);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
                }
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f180391n;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            a();
            return;
        }
        if (m1Var instanceof ss4.i) {
            gm0.j1.d().q(6855, this);
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "NetSceneGetPayHKPlugin fail!");
                return;
            }
            r45.yu3 yu3Var = ((ss4.i) m1Var).f412066f;
            if (yu3Var == null) {
                yu3Var = new r45.yu3();
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(yu3Var.f391373f)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "response.support_center_url：%s", yu3Var.f391373f);
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WX_PAY_HK_PLUGIN_HELP_URL_STRING_SYNC, yu3Var.f391373f);
                gm0.j1.i();
                gm0.j1.u().c().i(true);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(yu3Var.f391372e)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "response.disable_hk_wallet_url：%s", yu3Var.f391372e);
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WX_PAY_HK_PLUGIN_DISABLE_URL_STRING_SYNC, yu3Var.f391372e);
                gm0.j1.i();
                gm0.j1.u().c().i(true);
            }
            r45.yj6 yj6Var = yu3Var.f391371d;
            if (yj6Var == null || (linkedList = yj6Var.f391160e) == null || linkedList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "NetSceneGetPayHKPlugin no data");
                return;
            }
            int n19 = ((com.tencent.mm.ui.base.preference.h0) this.f180386f).n("contact_info_wxpay_hk_notify_go_to");
            java.util.Iterator it = yu3Var.f391371d.f391160e.iterator();
            while (it.hasNext()) {
                r45.e14 e14Var = (r45.e14) it.next();
                if (e14Var.f372904e.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "ItemSectionViewData is null");
                } else {
                    n19++;
                    android.content.Context context = this.f180384d;
                    ((com.tencent.mm.ui.base.preference.h0) this.f180386f).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(context, null), n19);
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
                                        n19++;
                                        com.tencent.mm.plugin.wallet_core.ui.u uVar = new com.tencent.mm.plugin.wallet_core.ui.u(this, context);
                                        uVar.L(((r45.hl6) linkedList3.get(0)).f376273f);
                                        uVar.G = com.tencent.mm.R.layout.byv;
                                        if (!rl6Var2.f384987d.isEmpty()) {
                                            java.util.LinkedList linkedList4 = rl6Var2.f384987d;
                                            if (!com.tencent.mm.sdk.platformtools.t8.K0(((r45.hl6) linkedList4.get(0)).f376273f)) {
                                                uVar.H(((r45.hl6) linkedList4.get(0)).f376273f);
                                            }
                                        }
                                        ((com.tencent.mm.ui.base.preference.h0) this.f180386f).d(uVar, n19);
                                        uVar.f197772f = new com.tencent.mm.plugin.wallet_core.ui.v(this, rl6Var, yt5Var);
                                    }
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "TableCellViewData inner data null");
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "TableCellViewData data null");
                    }
                }
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f180386f).notifyDataSetChanged();
        }
    }
}

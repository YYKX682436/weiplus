package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class k implements t25.a, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f180364d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f180365e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f180366f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f180367g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f180368h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f180369i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f180370m = new java.util.ArrayList();

    public k(android.content.Context context) {
        this.f180364d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        this.f180366f = rVar;
        this.f180365e = z3Var;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494862a6);
        this.f180367g = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_wxpay_collection_top");
        this.f180368h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_wxpay_collection_not_disturb");
        e();
        r45.pm3 pm3Var = new r45.pm3();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_CONFIG_STRING_SYNC, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "etReceiptAssisPluginResponse failed");
        } else {
            try {
                pm3Var.parseFrom(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WxPay.ContactWidgetWxPayCollection", "parseConfig exp, " + e17.getLocalizedMessage());
            }
        }
        d(pm3Var);
        gm0.j1.d().a(2860, this);
        gm0.j1.d().g(new ss4.l());
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "handleEvent key:%s", str);
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_collection_go_to", str);
        android.content.Context context = this.f180364d;
        if (D0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f180365e.d1());
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            a(3);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_collection_top", str)) {
            if (this.f180367g.N()) {
                c01.e2.t0(this.f180365e.d1(), true, true);
                a(4);
            } else {
                c01.e2.B0(this.f180365e.d1(), true, true);
                a(5);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_collection_not_disturb", str)) {
            if (this.f180368h.N()) {
                c01.e2.p0(this.f180365e, true);
                a(6);
            } else {
                c01.e2.z0(this.f180365e, true);
                a(7);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_collection_help", str)) {
            com.tencent.mm.wallet_core.ui.r1.b0("gh_106decc2eec5@app", "/pages/product/productInfo/product.html?code=A4075&producttitle=收款小账本&scene_id=kf5662", 0, com.tencent.mm.plugin.appbrand.jsapi.webview.d0.CTRL_INDEX);
            a(8);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_collection_clear_data", str)) {
            android.content.Context context2 = this.f180364d;
            db5.e1.A(context2, context2.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet_core.ui.e(this), null);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_collection_install", str)) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.iwq), true, true, null);
            this.f180369i = Q;
            Q.show();
            gm0.j1.d().a(30, this);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("gh_f0a92aa7146c");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(1);
            gm0.j1.d().g((com.tencent.mm.modelbase.m1) ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).wi(1, linkedList, linkedList2, "", ""));
            com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
            rv.q2 q2Var = (rv.q2) i95.n0.c(rv.q2.class);
            com.tencent.mm.plugin.wallet_core.ui.j jVar = new com.tencent.mm.plugin.wallet_core.ui.j(this);
            ((qv.i) q2Var).getClass();
            r1Var.g(new r01.k3(jVar));
            a(11);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("contact_info_wxpay_collection_uninstall", str)) {
            db5.e1.A(context, context.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet_core.ui.f(this), null);
        }
        return false;
    }

    public final void a(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.WeChatPayCollectionPluginReportStruct weChatPayCollectionPluginReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WeChatPayCollectionPluginReportStruct();
        weChatPayCollectionPluginReportStruct.f62895d = i17;
        weChatPayCollectionPluginReportStruct.k();
    }

    public final void b() {
        java.util.List list = this.f180370m;
        if (list == null || ((java.util.ArrayList) list).size() <= 0) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f180366f).v((com.tencent.mm.ui.base.preference.Preference) it.next());
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f180366f).notifyDataSetChanged();
        ((java.util.ArrayList) list).clear();
    }

    public final void c(r45.pm3 pm3Var) {
        java.lang.String str;
        r45.yj6 yj6Var;
        java.util.LinkedList linkedList;
        if (pm3Var != null && (yj6Var = pm3Var.f383178d) != null && (linkedList = yj6Var.f391160e) != null && !linkedList.isEmpty()) {
            try {
                str = new java.lang.String(pm3Var.toByteArray(), com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "save config exp, " + e17.getLocalizedMessage());
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_CONFIG_STRING_SYNC, str);
            gm0.j1.i();
            gm0.j1.u().c().i(true);
        }
        str = " ";
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_CONFIG_STRING_SYNC, str);
        gm0.j1.i();
        gm0.j1.u().c().i(true);
    }

    public final void d(r45.pm3 pm3Var) {
        r45.yj6 yj6Var;
        java.util.LinkedList linkedList;
        if (!this.f180365e.r2()) {
            b();
            return;
        }
        b();
        if (pm3Var == null || (yj6Var = pm3Var.f383178d) == null || (linkedList = yj6Var.f391160e) == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "NetSceneGetPayPlugin no data");
            return;
        }
        int n17 = ((com.tencent.mm.ui.base.preference.h0) this.f180366f).n("contact_info_wxpay_collection_go_to");
        java.util.Iterator it = pm3Var.f383178d.f391160e.iterator();
        while (it.hasNext()) {
            r45.e14 e14Var = (r45.e14) it.next();
            if (e14Var.f372904e.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "ItemSectionViewData is null");
            } else {
                n17++;
                android.content.Context context = this.f180364d;
                com.tencent.mm.ui.base.preference.PreferenceSmallCategory preferenceSmallCategory = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(context, null);
                ((com.tencent.mm.ui.base.preference.h0) this.f180366f).d(preferenceSmallCategory, n17);
                java.util.List list = this.f180370m;
                ((java.util.ArrayList) list).add(preferenceSmallCategory);
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
                                    com.tencent.mm.plugin.wallet_core.ui.h hVar = new com.tencent.mm.plugin.wallet_core.ui.h(this, context);
                                    hVar.L(((r45.hl6) linkedList3.get(0)).f376273f);
                                    hVar.G = com.tencent.mm.R.layout.byv;
                                    if (!rl6Var2.f384987d.isEmpty()) {
                                        java.util.LinkedList linkedList4 = rl6Var2.f384987d;
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(((r45.hl6) linkedList4.get(0)).f376273f)) {
                                            hVar.H(((r45.hl6) linkedList4.get(0)).f376273f);
                                        }
                                    }
                                    ((com.tencent.mm.ui.base.preference.h0) this.f180366f).d(hVar, n17);
                                    ((java.util.ArrayList) list).add(hVar);
                                    hVar.f197772f = new com.tencent.mm.plugin.wallet_core.ui.i(this, rl6Var, yt5Var);
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "TableCellViewData inner data null");
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "TableCellViewData data null");
                }
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f180366f).notifyDataSetChanged();
    }

    public final void e() {
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f180366f).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f180365e.d1(), this.f180365e.g2(), this.f180364d.getString(com.tencent.mm.R.string.bjr));
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "contact.getUsername():%s", this.f180365e.d1());
        if (!this.f180365e.r2()) {
            helperHeaderPreference.N(0);
            ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_install", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_uninstall", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_go_to", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_top", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_not_disturb", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_help", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_clear_data", true);
            return;
        }
        helperHeaderPreference.N(1);
        ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_install", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_uninstall", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_go_to", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_top", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_not_disturb", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_help", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f180366f).m("contact_info_wxpay_collection_clear_data", false);
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f180365e.d1())) {
            this.f180367g.O(true);
        } else {
            this.f180367g.O(false);
        }
        if (c01.e2.P(this.f180365e)) {
            this.f180368h.O(true);
        } else {
            this.f180368h.O(false);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        if (!(m1Var instanceof ns.l)) {
            if (m1Var instanceof ss4.l) {
                gm0.j1.d().q(2860, this);
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "NetSceneGetPayPlugin fail!");
                    return;
                }
                r45.pm3 pm3Var = ((ss4.l) m1Var).f412087f;
                if (pm3Var == null) {
                    pm3Var = new r45.pm3();
                }
                d(pm3Var);
                c(pm3Var);
                return;
            }
            return;
        }
        gm0.j1.d().q(30, this);
        if (i17 == 0 && i18 == 0) {
            java.lang.String J2 = ((com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var)).J();
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "bind fitness contact %s success", J2);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_f0a92aa7146c", true);
            if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(J2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "respUsername == " + J2 + ", contact = " + n17);
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
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "addContact : insert contact failed");
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
            com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
            }
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f180369i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        e();
    }
}

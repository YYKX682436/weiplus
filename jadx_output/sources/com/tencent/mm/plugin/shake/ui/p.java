package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class p implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeItemListUI f162319e;

    public p(com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI, int i17) {
        this.f162319e = shakeItemListUI;
        this.f162318d = i17;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        c34.r rVar = (c34.r) this.f162319e.f162095f.getItem(i17);
        if (rVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        c34.s Ni = c34.h0.Ni();
        Ni.getClass();
        rVar.field_insertBatch = 1;
        rVar.f38237p0 = 1024;
        if (-1 != Ni.f38240d.p("shakeitem1", rVar.convertTo(), "shakeItemID=? and insertBatch=?", new java.lang.String[]{"" + rVar.field_shakeItemID, "2"})) {
            Ni.doNotify();
        }
        int i18 = rVar.field_type;
        if (i18 == 4) {
            java.lang.String str3 = rVar.field_reserved3;
            if (str3 == null || !str3.equals("newShake")) {
                com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI = this.f162319e;
                shakeItemListUI.getClass();
                if (h34.v.b(rVar.field_lvbuffer, 0L) == null) {
                    shakeItemListUI.U6(rVar);
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    if (b21.q.a()) {
                        b21.m.i(h34.v.b(rVar.field_lvbuffer, 0L));
                    } else {
                        b21.m.j();
                        intent.putExtra("key_mode", 1);
                        intent.putExtra("KGlobalShakeMusic", true);
                        com.tencent.mm.sdk.platformtools.u3.h(new b21.a(h34.v.b(rVar.field_lvbuffer, 0L)));
                    }
                    intent.putExtra("key_scene", 3);
                    intent.putExtra("session_id", y24.b.f459122a);
                    j45.l.j(shakeItemListUI, "music", ".ui.MusicMainUI", intent, null);
                    com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    y24.a aVar = new y24.a(shakeActionReportStruct, 103);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.w(aVar, 100L, null);
                }
            } else {
                this.f162319e.U6(rVar);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i18 == 11) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI2 = this.f162319e;
            if (currentTimeMillis - shakeItemListUI2.f162093d > 2000) {
                shakeItemListUI2.f162093d = java.lang.System.currentTimeMillis();
                java.lang.String str4 = rVar.field_reserved3;
                if (str4 == null || str4.split(",").length != 3 || rVar.field_reserved3.split(",")[0] == null || rVar.field_reserved3.split(",")[0].equals("")) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", rVar.t0());
                    intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 27);
                    intent2.putExtra("stastic_scene", 5);
                    j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent2, null);
                } else {
                    java.lang.String[] split = rVar.field_reserved3.split(",");
                    com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                    am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                    nxVar.f7466a = split[0];
                    java.lang.String str5 = split[1];
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    nxVar.f7467b = str5 != null ? str5 : "";
                    nxVar.f7468c = java.lang.Integer.parseInt(split[2]);
                    startAppBrandUIFromOuterEvent.f54857g.f7469d = mc1.l.CTRL_INDEX;
                    startAppBrandUIFromOuterEvent.e();
                }
                if (this.f162319e.f162094e) {
                    h34.r.g(rVar);
                    try {
                        str2 = new java.lang.String(rVar.field_lvbuffer, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    } catch (java.io.UnsupportedEncodingException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShakeIbeaconService", e17, "%s", "Unsupported");
                        str2 = null;
                    }
                    if (str2 != null) {
                        java.lang.String[] split2 = str2.split(",");
                        if (split2.length == 4) {
                            java.lang.String str6 = split2[1];
                            java.lang.String str7 = split2[2];
                            java.lang.String str8 = split2[3];
                            com.tencent.mm.sdk.platformtools.t8.P(str7, 0);
                            com.tencent.mm.sdk.platformtools.t8.P(str8, 0);
                        }
                    }
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (h34.z.d(i18)) {
            h34.z.c(rVar, this.f162319e, true);
            com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
            ku5.u0 u0Var2 = ku5.t0.f312615d;
            y24.a aVar2 = new y24.a(shakeActionReportStruct2, 104);
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.w(aVar2, 100L, null);
            yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        java.lang.String str9 = rVar.field_username;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str9, true);
        n17.getClass();
        if (n17.r2()) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Contact_User", str9);
            str = "onItemClick";
            intent3.putExtra("Contact_Scene", this.f162318d == rVar.field_sex ? 23 : 24);
            intent3.putExtra("Sns_from_Scene", 22);
            if (str9 != null && str9.length() > 0) {
                if (n17.k2()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, rVar.field_username + "," + intent3.getIntExtra("Contact_Scene", 23));
                    intent3.putExtra("Contact_Scene", 23);
                }
                intent3.putExtra("CONTACT_INFO_UI_SOURCE", 31);
                intent3.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 3104);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent3, this.f162319e);
            }
        } else {
            str = "onItemClick";
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("Contact_User", rVar.field_username);
            intent4.putExtra("Contact_Nick", rVar.field_nickname);
            intent4.putExtra("Contact_Distance", rVar.field_distance);
            intent4.putExtra("Contact_Signature", rVar.field_signature);
            intent4.putExtra("Contact_Province", rVar.u0());
            intent4.putExtra("Contact_City", rVar.t0());
            intent4.putExtra("Contact_Sex", rVar.field_sex);
            intent4.putExtra("Contact_IsLBSFriend", true);
            intent4.putExtra("Contact_VUser_Info", rVar.field_reserved3);
            intent4.putExtra("Contact_VUser_Info_Flag", rVar.field_reserved1);
            intent4.putExtra("Contact_Scene", this.f162318d == rVar.field_sex ? 23 : 24);
            intent4.putExtra("Sns_from_Scene", 22);
            intent4.putExtra("Contact_KSnsIFlag", rVar.field_snsFlag);
            intent4.putExtra("Contact_KSnsBgUrl", rVar.field_sns_bgurl);
            if ((rVar.field_reserved1 & 8) > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, rVar.field_username + "," + intent4.getIntExtra("Contact_Scene", 23));
            }
            intent4.putExtra("CONTACT_INFO_UI_SOURCE", 31);
            intent4.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 3104);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent4, this.f162319e);
        }
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
        shakeActionReportStruct3.f60328h = i17 + 1;
        shakeActionReportStruct3.f60326f = shakeActionReportStruct3.b("ToUsername", rVar.field_username, true);
        shakeActionReportStruct3.f60331k = com.tencent.mm.sdk.platformtools.t8.K0(rVar.field_signature) ? 1L : 2L;
        shakeActionReportStruct3.f60329i = rVar.field_sex;
        shakeActionReportStruct3.f60330j = shakeActionReportStruct3.b("ToUinDistanceStr", rVar.field_distance, true);
        ku5.u0 u0Var3 = ku5.t0.f312615d;
        y24.a aVar3 = new y24.a(shakeActionReportStruct3, 101);
        ku5.t0 t0Var3 = (ku5.t0) u0Var3;
        t0Var3.getClass();
        t0Var3.w(aVar3, 100L, null);
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", str, "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

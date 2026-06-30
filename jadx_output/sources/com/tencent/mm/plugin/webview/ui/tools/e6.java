package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class e6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f184132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jd f184133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.JsapiPermissionWrapper f184134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f184135g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f184136h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f184137i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f184138m;

    public e6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, java.util.ArrayList arrayList, com.tencent.mm.plugin.webview.ui.tools.jd jdVar, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, boolean z17, long j17, int i17) {
        this.f184138m = c6Var;
        this.f184132d = arrayList;
        this.f184133e = jdVar;
        this.f184134f = jsapiPermissionWrapper;
        this.f184135g = z17;
        this.f184136h = j17;
        this.f184137i = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v162 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v97 */
    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean f07;
        ?? r27;
        db5.h4 h4Var;
        boolean z27;
        if (this.f184138m.d()) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(480L, 0L, 1L, false);
        g4Var.clear();
        if (this.f184138m.N.booleanValue()) {
            return;
        }
        boolean z28 = false;
        if (!this.f184132d.isEmpty()) {
            for (int i17 = 0; i17 < this.f184132d.size(); i17++) {
                try {
                    java.lang.String str = (java.lang.String) this.f184132d.get(i17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "menuItem:" + str);
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    java.lang.String obj = jSONObject.opt(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE).toString();
                    byte[] decode = android.util.Base64.decode(jSONObject.opt("iconData").toString(), 0);
                    int length = decode.length;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(length));
                    arrayList.add(0);
                    arrayList.add(decode);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$11", "onCreateMMMenu", "(Lcom/tencent/mm/ui/base/MMMenu;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                    yj0.a.e(obj2, decodeByteArray, "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$11", "onCreateMMMenu", "(Lcom/tencent/mm/ui/base/MMMenu;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    g4Var.m(1000, obj, new android.graphics.drawable.BitmapDrawable(decodeByteArray));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e17, "", new java.lang.Object[0]);
                }
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f184138m;
        c6Var.getClass();
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di() && c6Var.c().F2 != null && c6Var.c().F2.f441317x.m8() && c6Var.m(58) && c6Var.n(58)) {
            g4Var.k(58, c6Var.c().getString(com.tencent.mm.R.string.hrh), com.tencent.mm.R.raw.floating_window_regular, c6Var.c().getColor(com.tencent.mm.R.color.abw), c6Var.f184060q.a(c6Var.K, c6Var.f184056m ? pv.b0.f358480e : pv.b0.f358481f), false);
        }
        if (!((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() && this.f184138m.c().F2 != null && this.f184138m.c().F2.f441317x.m8() && this.f184138m.m(35) && this.f184138m.n(35)) {
            g4Var.g(35, this.f184138m.c().getString(com.tencent.mm.R.string.hrh), com.tencent.mm.R.raw.icons_outlined_multitask);
        }
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var2 = this.f184138m;
        com.tencent.mm.plugin.webview.ui.tools.jd jdVar = this.f184133e;
        c6Var2.getClass();
        if (jdVar != null && jdVar.f184881k) {
            g4Var.b(51, com.tencent.mm.R.string.lg_, com.tencent.mm.R.raw.icons_outlined_listen);
            boolean Ai = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ai();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "isEnableStarMode = " + ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai());
            if (Ai) {
                g4Var.b(50, com.tencent.mm.R.string.jyv, com.tencent.mm.R.raw.icons_outlined_listen_later_regural);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("view_id", "tyt_listen_later");
                bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                hashMap.put("currscene", 1104);
                hashMap.put("which_button", 21);
                hashMap.put("actionbizinfo", rk4.j5.f(c6Var2.c().x7()));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_exp", null, hashMap, 5, false);
                z27 = true;
            } else {
                z27 = false;
            }
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.webview.ui.tools.j6(c6Var2, true, z27));
        }
        int i18 = this.f184138m.c().U2;
        if (i18 == 1) {
            g4Var.g(40, this.f184138m.c().getString(com.tencent.mm.R.string.l7j), com.tencent.mm.R.raw.icon_outlined_talk);
        } else if (i18 == 2) {
            g4Var.g(41, this.f184138m.c().getString(com.tencent.mm.R.string.l7h), com.tencent.mm.R.raw.icon_outlined_stoptalking);
        } else if (i18 == 3) {
            g4Var.g(42, this.f184138m.c().getString(com.tencent.mm.R.string.l7i), com.tencent.mm.R.raw.icon_outlined_talk);
        }
        java.util.List z76 = this.f184138m.c().z7();
        if (z76 != null && !z76.isEmpty() && !this.f184138m.D()) {
            int i19 = 0;
            while (i19 < z76.size() && i19 < 8) {
                com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem dynamicMenuItem = (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) z76.get(i19);
                java.lang.String id6 = dynamicMenuItem.getId();
                boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str2 = id6 == null ? "" : id6;
                switch (str2.hashCode()) {
                    case -1950288693:
                        if (str2.equals("pdd_categories")) {
                            r27 = z28;
                            break;
                        }
                        break;
                    case -1077769574:
                        if (str2.equals("member")) {
                            r27 = 1;
                            break;
                        }
                        break;
                    case -1007892285:
                        if (str2.equals("pdd_index")) {
                            r27 = 2;
                            break;
                        }
                        break;
                    case -863994664:
                        if (str2.equals("pdd_bybt")) {
                            r27 = 3;
                            break;
                        }
                        break;
                    case -309425751:
                        if (str2.equals(com.google.android.gms.common.Scopes.PROFILE)) {
                            r27 = 4;
                            break;
                        }
                        break;
                    case -174591654:
                        if (str2.equals("pdd_profile")) {
                            r27 = 5;
                            break;
                        }
                        break;
                    case 3046176:
                        if (str2.equals("cart")) {
                            r27 = 6;
                            break;
                        }
                        break;
                    case 100346066:
                        if (str2.equals(ya.b.INDEX)) {
                            r27 = 7;
                            break;
                        }
                        break;
                    case 935680011:
                        if (str2.equals("pdd_favorite")) {
                            r27 = 8;
                            break;
                        }
                        break;
                    case 1296516636:
                        if (str2.equals("categories")) {
                            r27 = 9;
                            break;
                        }
                        break;
                }
                r27 = -1;
                switch (r27) {
                    case 0:
                        h4Var = (db5.h4) g4Var.g(53, this.f184138m.c().getString(com.tencent.mm.R.string.lyk), com.tencent.mm.R.raw.icons_webview_custom_menu_pdd_categories);
                        break;
                    case 1:
                        h4Var = (db5.h4) g4Var.g(19, this.f184138m.c().getString(com.tencent.mm.R.string.l6a), com.tencent.mm.R.raw.bottomsheet_icon_jd_member);
                        break;
                    case 2:
                        h4Var = (db5.h4) g4Var.g(52, this.f184138m.c().getString(com.tencent.mm.R.string.lyl), com.tencent.mm.R.raw.icons_webview_custom_menu_pdd_index);
                        break;
                    case 3:
                        h4Var = (db5.h4) g4Var.g(56, this.f184138m.c().getString(com.tencent.mm.R.string.lyi), com.tencent.mm.R.raw.icons_webview_custom_menu_pdd_bybt);
                        break;
                    case 4:
                        h4Var = (db5.h4) g4Var.g(18, this.f184138m.c().getString(com.tencent.mm.R.string.l6b), com.tencent.mm.R.raw.bottomsheet_icon_profile);
                        break;
                    case 5:
                        h4Var = (db5.h4) g4Var.g(55, this.f184138m.c().getString(com.tencent.mm.R.string.lym), com.tencent.mm.R.raw.icons_webview_custom_menu_pdd_profile);
                        break;
                    case 6:
                        h4Var = (db5.h4) g4Var.g(17, this.f184138m.c().getString(com.tencent.mm.R.string.l68), com.tencent.mm.R.raw.bottomsheet_icon_jd_cart);
                        break;
                    case 7:
                        h4Var = (db5.h4) g4Var.g(15, this.f184138m.c().getString(com.tencent.mm.R.string.l6_), com.tencent.mm.R.raw.bottomsheet_icon_jd_index);
                        break;
                    case 8:
                        h4Var = (db5.h4) g4Var.g(54, this.f184138m.c().getString(com.tencent.mm.R.string.lyj), com.tencent.mm.R.raw.icons_webview_custom_menu_pdd_favorite);
                        break;
                    case 9:
                        h4Var = (db5.h4) g4Var.g(16, this.f184138m.c().getString(com.tencent.mm.R.string.l69), com.tencent.mm.R.raw.bottomsheet_icon_jd_collect_list);
                        break;
                    default:
                        h4Var = null;
                        break;
                }
                if (h4Var != null) {
                    h4Var.A = dynamicMenuItem.getUrl();
                }
                i19++;
                z28 = false;
            }
        }
        java.lang.String stringExtra = this.f184138m.b().getStringExtra("srcUsername");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            try {
                z17 = this.f184138m.c().L1.A.j8(stringExtra);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "sharebtn click fail isBizContact, ex = " + e18.getMessage());
                z17 = false;
            }
            if (z17) {
                try {
                    z18 = this.f184138m.c().L1.A.Mb(stringExtra);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "sharebtn click fail, ex = " + e19.getMessage());
                    z18 = false;
                }
                if (z18) {
                    z19 = this.f184138m.z(this.f184134f, 19);
                    f07 = this.f184138m.f0(this.f184134f, 19);
                } else {
                    z19 = this.f184138m.z(this.f184134f, 20);
                    f07 = this.f184138m.f0(this.f184134f, 20);
                }
                boolean t17 = this.f184138m.c().L1.t1();
                if (this.f184138m.m(5) && z19 && this.f184138m.n(5)) {
                    if (t17) {
                        g4Var.l(5, this.f184138m.c().getString(com.tencent.mm.R.string.laj), com.tencent.mm.R.raw.icons_outlined_person_tie, f07);
                    } else {
                        com.tencent.mm.plugin.webview.ui.tools.jd jdVar2 = this.f184133e;
                        if (jdVar2 == null || !jdVar2.f184876f) {
                            g4Var.l(5, this.f184138m.c().getString(com.tencent.mm.R.string.lai), com.tencent.mm.R.raw.icons_outlined_person_tie, f07);
                        }
                    }
                }
            } else {
                try {
                    this.f184138m.c().L1.A.Dd(stringExtra);
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "sharebtn click fail triggerGetContact, ex = " + e27.getMessage());
                }
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var3 = this.f184138m;
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = this.f184134f;
        c6Var3.getClass();
        boolean z37 = j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairerConfigWebviewSaveScreenshot()) == 1;
        boolean z38 = gm0.m.i() != 0;
        boolean f08 = c6Var3.f0(jsapiPermissionWrapper, 21);
        boolean f09 = c6Var3.f0(jsapiPermissionWrapper, com.tencent.mm.plugin.appbrand.jsapi.xe.CTRL_INDEX);
        if (!z38 || f09 || f08 || !c6Var3.n(57) || !c6Var3.z(jsapiPermissionWrapper, 456) || !z37 || c6Var3.c() == null || java.lang.Boolean.TRUE.equals(c6Var3.c().Q1.get(c6Var3.c().x7())) || c6Var3.c().f183815f == null || !c6Var3.c().f183815f.z0()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MENU_SAVE_SCREENSHOT: ");
            sb6.append(z38 ? "hadLogin" : "noLogin");
            sb6.append(", isForbidShare = ");
            sb6.append(f08);
            sb6.append(", isForbidFav = ");
            sb6.append(f09);
            sb6.append(", canShowLongScreenshot = ");
            sb6.append(z37);
            sb6.append(", canShowMenuItem = ");
            sb6.append(c6Var3.n(57));
            sb6.append("isXwebKernel = ");
            sb6.append((c6Var3.c() == null || c6Var3.c().f183815f == null || !c6Var3.c().f183815f.z0()) ? false : true);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", sb6.toString());
        } else {
            g4Var.g(57, c6Var3.c().getString(com.tencent.mm.R.string.n3n), com.tencent.mm.R.raw.icons_outlined_download);
            com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct webviewFullSnapshotActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct();
            webviewFullSnapshotActionReportStruct.f62947e = 1L;
            webviewFullSnapshotActionReportStruct.f62949g = 2L;
            webviewFullSnapshotActionReportStruct.p(c6Var3.c().x7());
            webviewFullSnapshotActionReportStruct.k();
        }
        if (this.f184138m.n(10)) {
            g4Var.g(10, this.f184138m.c().getString(com.tencent.mm.R.string.ak6), com.tencent.mm.R.raw.icons_outlined_report_problem);
        }
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var4 = this.f184138m;
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper2 = this.f184134f;
        if (c6Var4.m(6) && c6Var4.z(jsapiPermissionWrapper2, 44) && c6Var4.n(6)) {
            g4Var.l(6, c6Var4.c().getString(com.tencent.mm.R.string.la_), com.tencent.mm.R.raw.icons_outlined_link, c6Var4.f0(jsapiPermissionWrapper2, 44));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var5 = this.f184138m;
        boolean z39 = this.f184135g;
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper3 = this.f184134f;
        if (!z39) {
            c6Var5.getClass();
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(c6Var5.f184069z) && c6Var5.z(jsapiPermissionWrapper3, nd1.i2.CTRL_INDEX) && c6Var5.n(59)) {
            g4Var.l(59, c6Var5.c().getString(com.tencent.mm.R.string.oov), com.tencent.mm.R.raw.clock_regular, c6Var5.f0(jsapiPermissionWrapper3, nd1.i2.CTRL_INDEX));
            zq1.i0 i0Var = new zq1.i0();
            i0Var.f474983a = c6Var5.f184069z;
            i0Var.f474985c = 176;
            arrayList2.add(i0Var);
        }
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var6 = this.f184138m;
        boolean z47 = this.f184135g;
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper4 = this.f184134f;
        if (!z47) {
            c6Var6.getClass();
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(c6Var6.A) && c6Var6.z(jsapiPermissionWrapper4, be1.x0.CTRL_INDEX) && c6Var6.n(60)) {
            g4Var.l(60, c6Var6.c().getString(com.tencent.mm.R.string.oow), com.tencent.mm.R.raw.icons_outlined_underline_marker, c6Var6.f0(jsapiPermissionWrapper4, be1.x0.CTRL_INDEX));
            zq1.i0 i0Var2 = new zq1.i0();
            i0Var2.f474983a = c6Var6.A;
            i0Var2.f474985c = 176;
            arrayList2.add(i0Var2);
        }
        if (!arrayList2.isEmpty()) {
            ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList2);
        }
        if (this.f184138m.m(28) && this.f184138m.n(28)) {
            g4Var.g(28, this.f184138m.c().getString(com.tencent.mm.R.string.l5c), com.tencent.mm.R.raw.icons_outlined_refresh);
        }
        if ((this.f184136h & 1) == 0 && this.f184138m.m(31) && this.f184138m.n(31)) {
            g4Var.g(31, this.f184138m.c().getString(com.tencent.mm.R.string.f493693lb3), com.tencent.mm.R.raw.search_in_page);
        }
        if (this.f184134f.f192180d != null && this.f184138m.c().T && !com.tencent.mm.sdk.platformtools.t8.K0(this.f184138m.c().L1.f181964y) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f184138m.c().f183833l3) && this.f184138m.c().L1.f181964y.startsWith(this.f184138m.c().f183833l3) && this.f184138m.b().getBooleanExtra("key_detail_can_delete", true) && com.tencent.mm.plugin.webview.ui.tools.c6.f(this.f184138m) && !this.f184138m.D()) {
            if (this.f184138m.m(12) && this.f184138m.n(12)) {
                g4Var.g(12, this.f184138m.c().getString(com.tencent.mm.R.string.c_a), com.tencent.mm.R.raw.bottomsheet_icon_addtag);
            }
            if (this.f184138m.m(9)) {
                g4Var.g(9, this.f184138m.c().getString(com.tencent.mm.R.string.f490367t0), com.tencent.mm.R.raw.bottomsheet_icon_del);
            }
        }
        if (this.f184138m.m(37) && this.f184138m.n(37)) {
            if (((cw4.p0) this.f184138m.c().f183866w2.f185656g.f181745h.getValue()) == cw4.p0.f224265f) {
                g4Var.g(37, this.f184138m.c().getString(com.tencent.mm.R.string.l6w), com.tencent.mm.R.raw.icons_outlined_stoptranslate);
                this.f184138m.c().f183866w2.f185656g.f(cw4.n0.f224254d, cw4.o0.f224259f);
            } else {
                g4Var.g(37, this.f184138m.c().getString(com.tencent.mm.R.string.l6u), com.tencent.mm.R.raw.icons_outlined_translate);
                this.f184138m.c().f183866w2.f185656g.f(cw4.n0.f224254d, cw4.o0.f224258e);
            }
        }
        if ((this.f184136h & 2) == 0 && this.f184138m.m(11) && this.f184138m.z(this.f184134f, 18) && this.f184138m.n(11)) {
            if (hy4.b0.c(this.f184138m.c().x7())) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_biz_mp_page_use_global_font_android, false) && hy4.i.l(this.f184138m.c().x7())) {
                    if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ban_biz_mp_page_show_new_font_android, false)) {
                        boolean booleanExtra = this.f184138m.c().getIntent().getBooleanExtra("show_mp_page_new_font", false);
                        boolean z48 = this.f184138m.c().v7() == 0;
                        if (booleanExtra && z48) {
                            g4Var.l(11, this.f184138m.c().getString(com.tencent.mm.R.string.f493842pb2), com.tencent.mm.R.raw.icons_outlined_font, this.f184138m.f0(this.f184134f, 18));
                        }
                    }
                }
            } else {
                g4Var.l(11, this.f184138m.c().getString(com.tencent.mm.R.string.hr9), com.tencent.mm.R.raw.icons_outlined_font, this.f184138m.f0(this.f184134f, 18));
            }
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_debug, 0) == 1) {
            g4Var.l(99, this.f184138m.c().getString(nw4.w2.a() ? com.tencent.mm.R.string.l6o : com.tencent.mm.R.string.l6p), com.tencent.mm.R.raw.webview_menu_enable_debug, false);
        }
        this.f184138m.u(this.f184137i, g4Var);
        this.f184138m.f184044J.j();
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var7 = this.f184138m;
        com.tencent.mm.plugin.webview.ui.tools.c6.h(c6Var7, g4Var, c6Var7.f184066w, 2);
        this.f184138m.f184068y.clear();
        this.f184138m.f184068y = (java.util.List) g4Var.f228344d.stream().map(new com.tencent.mm.plugin.webview.ui.tools.d6$$a()).collect(java.util.stream.Collectors.toList());
    }
}

package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class n0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f208530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qj5.q f208532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208533g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f208534h;

    public n0(qj5.n nVar, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var, qj5.q qVar, android.app.Activity activity, java.util.HashMap hashMap) {
        this.f208530d = nVar;
        this.f208531e = j1Var;
        this.f208532f = qVar;
        this.f208533g = activity;
        this.f208534h = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        p15.x l17;
        k91.v5 b17;
        p15.m j17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.String str3;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime;
        java.lang.String str4 = this.f208530d.f363986t2;
        if (str4 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotShareService", "image is null");
            return;
        }
        int itemId = menuItem.getItemId();
        boolean z17 = false;
        switch (itemId) {
            case 910524417:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "shareToFriend onClick");
                this.f208531e.Bi(com.tencent.mm.ui.feature.api.screenshot.w.f208565g);
                com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208531e;
                qj5.q qVar = this.f208532f;
                android.app.Activity activity = this.f208533g;
                boolean z18 = this.f208530d.f363987u2;
                j1Var.getClass();
                jd5.a aVar = new jd5.a();
                aVar.p(str4);
                aVar.q(qVar.b(!z18));
                n13.r rVar = new n13.r();
                rVar.f334117a = true;
                rVar.f334118b = 910524417;
                rVar.f334119c = j1Var;
                ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activity, aVar, rVar);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(kz5.c1.n(this.f208534h, new jz5.l("forward_method", 2)), new jz5.l("is_with_jump", java.lang.Integer.valueOf(qj5.q.g(this.f208532f, false, 1, null) != null ? 1 : 2))), 36458);
                return;
            case 910524418:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "shareToSns onClick");
                this.f208531e.Bi(com.tencent.mm.ui.feature.api.screenshot.w.f208563e);
                com.tencent.mm.ui.feature.api.screenshot.j1 j1Var2 = this.f208531e;
                android.app.Activity activity2 = this.f208533g;
                j1Var2.getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Ksnsupload_source", 1);
                intent.putExtra("need_result", true);
                intent.putExtra("Ksnsupload_type", 0);
                intent.putExtra("sns_kemdia_path", str4);
                if (activity2 instanceof com.tencent.mm.ui.MMFragmentActivity) {
                    j45.l.x((com.tencent.mm.ui.MMFragmentActivity) activity2, ".plugin.sns.ui.SnsUploadUI", intent, 910524418, j1Var2);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotShareService", "shareToSns, context is not MMFragmentActivity, drop \"Hide when success\" logic");
                    j45.l.n(activity2, "sns", ".ui.SnsUploadUI", intent, 910524418);
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(this.f208534h, new jz5.l("screenshot_share_type", 3)), 36458);
                return;
            case 910524419:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "saveToFav onClick, imagePath: ".concat(str4));
                this.f208531e.Bi(com.tencent.mm.ui.feature.api.screenshot.w.f208567i);
                com.tencent.mm.ui.feature.api.screenshot.j1 j1Var3 = this.f208531e;
                android.app.Activity activity3 = this.f208533g;
                j1Var3.getClass();
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str4), com.tencent.mm.ui.feature.api.screenshot.m.class, new com.tencent.mm.ui.feature.api.screenshot.a1(activity3, j1Var3));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(this.f208534h, new jz5.l("screenshot_share_type", 2)), 36458);
                return;
            default:
                switch (itemId) {
                    case 910524425:
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "image search onClick, imagePath: ".concat(str4));
                        this.f208531e.Bi(com.tencent.mm.ui.feature.api.screenshot.w.f208568m);
                        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var4 = this.f208531e;
                        qj5.q qVar2 = this.f208532f;
                        android.app.Activity activity4 = this.f208533g;
                        j1Var4.getClass();
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        linkedHashMap.put("imgPath", str4);
                        p15.n g17 = qj5.q.g(qVar2, false, 1, null);
                        if (g17 != null && (j17 = g17.j()) != null) {
                            switch (j17.j()) {
                                case 10:
                                case 12:
                                    java.lang.String k17 = j17.k();
                                    if (k17 != null) {
                                        try {
                                            android.net.Uri parse = android.net.Uri.parse(k17);
                                            java.lang.String queryParameter = parse.getQueryParameter(dm.i4.COL_USERNAME);
                                            if (queryParameter != null) {
                                                linkedHashMap.put("finderUserName", queryParameter);
                                            }
                                            java.lang.String queryParameter2 = parse.getQueryParameter("feedid");
                                            if (queryParameter2 != null) {
                                                linkedHashMap.put("referrerFeedId", queryParameter2);
                                                break;
                                            }
                                        } catch (java.lang.IllegalArgumentException e17) {
                                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScreenShotShareService", e17, "parse source fail", new java.lang.Object[0]);
                                            break;
                                        }
                                    }
                                    break;
                                case 11:
                                    linkedHashMap.put("sourceUrl", j17.k());
                                    break;
                            }
                        }
                        p15.n g18 = qj5.q.g(qVar2, false, 1, null);
                        if (g18 != null && (l17 = g18.l()) != null && (b17 = k91.w5.f305813b.b(l17.getAppId(), new java.lang.String[0])) != null) {
                            linkedHashMap.put("wxaUserName", b17.field_username);
                        }
                        ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ai(activity4, 15, 2, linkedHashMap);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(this.f208534h, new jz5.l("screenshot_share_type", 1)), 36458);
                        return;
                    case 910524426:
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "shareToBiz onClick");
                        this.f208531e.Bi(com.tencent.mm.ui.feature.api.screenshot.w.f208563e);
                        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var5 = this.f208531e;
                        android.app.Activity activity5 = this.f208533g;
                        j1Var5.getClass();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        tk.t tVar = tk.u.f419871e;
                        jSONObject.put("mpPublishAction", 2);
                        jSONObject.put("publishScene", "screenShot");
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1401);
                        jSONObject.put("weAppParam", jSONObject2);
                        if (com.tencent.mm.sdk.platformtools.x2.n()) {
                            str = "share_type_btn";
                            str2 = "view_clk";
                            obj = "screenshot_share_type";
                            ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Di(activity5, jSONObject, kz5.b0.c(new com.tencent.pigeon.biz_base.PersonalCenterJumpPhotoInfo(str4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null)), new com.tencent.mm.ui.feature.api.screenshot.b1(j1Var5));
                        } else {
                            str = "share_type_btn";
                            str2 = "view_clk";
                            obj = "screenshot_share_type";
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("image_path", str4);
                            bundle.putString("json_params", jSONObject.toString());
                            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.ui.feature.api.screenshot.n1.class, new com.tencent.mm.ui.feature.api.screenshot.d1(j1Var5));
                        }
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, str2, kz5.c1.n(this.f208534h, new jz5.l(obj, 6)), 36458);
                        return;
                    case 910524427:
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "share to gamecircle onClick, imagePath: ".concat(str4));
                        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var6 = this.f208531e;
                        qj5.q qVar3 = this.f208532f;
                        android.app.Activity context = this.f208533g;
                        j1Var6.getClass();
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("imagePath", str4);
                        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
                            ((com.tencent.mm.ui.MMFragmentActivity) context).setMMOnFragmentActivityResult(j1Var6);
                        } else if ((context instanceof q80.z) && (context instanceof com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback)) {
                            ((q80.z) context).R1(new com.tencent.mm.ui.feature.api.screenshot.e1(j1Var6));
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotShareService", "shareToGameCircle, context is not MMFragmentActivity, drop \"Hide when success\" logic");
                        }
                        org.json.JSONObject f17 = qVar3.f();
                        if (f17 != null) {
                            intent2.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, f17.toString());
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "shareToGameCircle: extraData=" + f17);
                        }
                        ((et.i) ((ft.y3) i95.n0.c(ft.y3.class))).getClass();
                        kotlin.jvm.internal.o.g(context, "context");
                        if (context instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
                            com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = (com.tencent.mm.plugin.appbrand.ui.AppBrandUI) context;
                            com.tencent.mm.plugin.appbrand.hc q76 = appBrandUI.q7();
                            if (q76 != null && (activeRuntime = q76.getActiveRuntime()) != null && com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(activeRuntime)) {
                                z17 = true;
                            }
                            if (z17) {
                                com.tencent.mm.plugin.appbrand.hc q77 = appBrandUI.q7();
                                kotlin.jvm.internal.o.d(q77);
                                com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime2 = q77.getActiveRuntime();
                                kotlin.jvm.internal.o.d(activeRuntime2);
                                str3 = activeRuntime2.f74803n;
                                kotlin.jvm.internal.o.f(str3, "getAppId(...)");
                                intent2.putExtra("gameAppId", str3);
                                ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).bj(context, intent2);
                                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(this.f208534h, new jz5.l("screenshot_share_type", 5)), 36458);
                                return;
                            }
                        }
                        str3 = "";
                        intent2.putExtra("gameAppId", str3);
                        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).bj(context, intent2);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(this.f208534h, new jz5.l("screenshot_share_type", 5)), 36458);
                        return;
                    default:
                        return;
                }
        }
    }
}

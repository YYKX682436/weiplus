package r33;

/* loaded from: classes8.dex */
public class b implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m33.h1 f368963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f368964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r33.f f368965c;

    public b(r33.f fVar, m33.h1 h1Var, android.content.Context context) {
        this.f368965c = fVar;
        this.f368963a = h1Var;
        this.f368964b = context;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        int parseColor;
        int parseColor2;
        m53.g3 g3Var;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f70711b.f70700a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f70711b.f70700a);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("error", "GetLaunchGameInfo cgi failed");
            this.f368963a.b(hashMap);
            return;
        }
        m53.i2 i2Var = (m53.i2) fVar;
        m53.t3 t3Var = i2Var.f323781d;
        if (t3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi fail, gameInfo is null");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("error", "GetLaunchGameInfo cgi failed, gameInfo is null");
            this.f368963a.b(hashMap2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi success, game appId:%s appName:%s iconUrl:%s", t3Var.f324072d, t3Var.f324073e, t3Var.f324074f);
        int i19 = i2Var.f323782e;
        if (i19 == 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi failed, actionType is error, errMsg: %s", i2Var.f323783f);
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("error", i2Var.f323783f);
            r33.f fVar2 = this.f368965c;
            if (fVar2.f368979c == "waapp") {
                hashMap3.put("type", "showAlert");
            } else {
                android.content.Context context = this.f368964b;
                java.lang.String str2 = i2Var.f323783f;
                fVar2.getClass();
                ((ku5.t0) ku5.t0.f312615d).B(new r33.d(fVar2, context, str2));
            }
            this.f368963a.b(hashMap3);
            return;
        }
        if (i19 == 3) {
            m53.l2 l2Var = i2Var.f323785h;
            if (l2Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi fail, actionType is liteApp but info is nil");
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put("error", "GetLaunchGameInfo cgi fail, actionType is liteApp but info is nil");
                this.f368963a.b(hashMap4);
                return;
            }
            r33.f fVar3 = this.f368965c;
            android.content.Context context2 = this.f368964b;
            m53.t3 t3Var2 = i2Var.f323781d;
            m33.h1 h1Var = this.f368963a;
            fVar3.getClass();
            q80.d0 d0Var = new q80.d0();
            boolean z17 = l2Var.f323871h;
            boolean z18 = l2Var.f323872i;
            java.lang.String str3 = l2Var.f323867d;
            d0Var.f360649a = str3;
            d0Var.f360650b = l2Var.f323868e;
            d0Var.f360651c = l2Var.f323869f;
            d0Var.f360652d = java.lang.Boolean.valueOf(l2Var.f323877q);
            if (l2Var.f323874n) {
                d0Var.f360657i = 1;
            }
            d0Var.f360658j = l2Var.f323875o;
            d0Var.f360654f = l2Var.f323878r;
            java.lang.String str4 = l2Var.f323873m;
            if (str4 == null || str4.length() <= 0) {
                d0Var.f360664p = com.tencent.mm.R.anim.f477886ea;
                d0Var.f360665q = com.tencent.mm.R.anim.f477889ed;
            } else if (str4.equals("modal")) {
                d0Var.f360664p = com.tencent.mm.R.anim.f477876e0;
                d0Var.f360665q = com.tencent.mm.R.anim.f477877e1;
            } else if (str4.equals(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH)) {
                d0Var.f360664p = com.tencent.mm.R.anim.f477886ea;
                d0Var.f360665q = com.tencent.mm.R.anim.f477889ed;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetLaunchGameInfo", "open liteapp:" + str3 + ", page:" + l2Var.f323868e);
            d0Var.f360666r = z17;
            d0Var.f360667s = z18;
            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
            java.lang.String str5 = fVar3.f368979c;
            if (str5 == "webview") {
                liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.WEB_VIEW;
            } else if (str5 == "waapp") {
                liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.WA_APP;
            } else if (str5 == "liteapp") {
                liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.LITE_APP;
            } else if (str5 == "game") {
                liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.GAME;
            } else {
                liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.APP;
            }
            d0Var.f360674z = liteAppReferrerInfo;
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context2, d0Var, new r33.c(fVar3, str3, t3Var2, h1Var));
            return;
        }
        if (i19 != 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo fail , errType error:%d", java.lang.Integer.valueOf(i17));
            java.util.HashMap hashMap5 = new java.util.HashMap();
            hashMap5.put("error", "GetLaunchGameInfo cgi fail, actionType error");
            this.f368963a.b(hashMap5);
            return;
        }
        m53.u2 u2Var = i2Var.f323786i;
        if (u2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi fail, actionType is webview but info is nil");
            java.util.HashMap hashMap6 = new java.util.HashMap();
            hashMap6.put("error", "GetLaunchGameInfo cgi fail, actionType is webview but info is nil");
            this.f368963a.b(hashMap6);
            return;
        }
        r33.f fVar4 = this.f368965c;
        m53.t3 t3Var3 = i2Var.f323781d;
        m33.h1 h1Var2 = this.f368963a;
        fVar4.getClass();
        java.lang.String str6 = u2Var.f324090d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", "url is null");
            java.util.HashMap hashMap7 = new java.util.HashMap();
            hashMap7.put("error", "url is null");
            h1Var2.b(hashMap7);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo openWebview url: %s", str6);
            java.lang.String str7 = u2Var.f324094h;
            android.net.Uri parse = android.net.Uri.parse(str6);
            java.lang.String queryParameter = parse.getQueryParameter("not_in_game_luggage");
            android.os.Bundle bundle = new android.os.Bundle();
            if (queryParameter == null) {
                queryParameter = "";
            }
            if (queryParameter.equals("1") || !(parse.getHost() == null || parse.getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy)))) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str6);
                j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
                h1Var2.a(new java.util.HashMap());
            } else {
                java.lang.String str8 = u2Var.f324091e;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
                    parseColor = 0;
                } else {
                    try {
                        parseColor = android.graphics.Color.parseColor(str8);
                    } catch (java.lang.IllegalArgumentException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", e17.getMessage());
                        java.util.HashMap hashMap8 = new java.util.HashMap();
                        hashMap8.put("error", "invalid_color");
                        h1Var2.b(hashMap8);
                    }
                }
                java.lang.String str9 = u2Var.f324092f;
                java.lang.String str10 = u2Var.f324095i;
                bundle.putString("rawUrl", str6);
                bundle.putInt("customize_status_bar_color", parseColor);
                bundle.putString("status_bar_style", str9);
                bundle.putString("game_pre_inject_data", str10);
                java.lang.String str11 = u2Var.f324093g;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str11)) {
                    parseColor2 = 0;
                } else {
                    try {
                        parseColor2 = android.graphics.Color.parseColor(str11);
                    } catch (java.lang.IllegalArgumentException e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", e18.getMessage());
                        java.util.HashMap hashMap9 = new java.util.HashMap();
                        hashMap9.put("error", e18.getMessage());
                        h1Var2.b(hashMap9);
                    }
                }
                bundle.putInt("KHalfScreenBackGroundColor", parseColor2);
                m53.q3 q3Var = u2Var.f324098o;
                if (q3Var != null && (g3Var = q3Var.f323988f) != null) {
                    int i27 = g3Var.f323703d;
                    if (i27 == 1) {
                        bundle.putString("rawUrl", q3Var.f323987e);
                        bundle.putInt("KHalfScreenHeight", g3Var.f323705f);
                        bundle.putFloat("KHalfScreenHeightPercent", -1.0f);
                    } else if (i27 == 2) {
                        bundle.putString("rawUrl", q3Var.f323987e);
                        bundle.putInt("KHalfScreenHeight", 0);
                        bundle.putFloat("KHalfScreenHeightPercent", (float) g3Var.f323704e);
                    }
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                    bundle.putString("game_open_html", str7);
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtras(bundle);
                j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent2, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetLaunchGameInfo", "openWebview success " + str6);
                fVar4.a(4, t3Var3, h1Var2);
            }
        }
    }
}

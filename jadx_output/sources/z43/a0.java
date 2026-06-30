package z43;

/* loaded from: classes8.dex */
public class a0 extends com.tencent.mm.plugin.lite.api.p {
    public final void A(org.json.JSONObject jSONObject) {
        int parseColor;
        int parseColor2;
        java.lang.String optString = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", "url is null");
            this.f143443f.a("url is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "url: %s", optString);
        java.lang.String optString2 = jSONObject.optString("html");
        android.net.Uri parse = android.net.Uri.parse(optString);
        java.lang.String queryParameter = parse.getQueryParameter("not_in_game_luggage");
        android.os.Bundle bundle = new android.os.Bundle();
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.equals("1") || !(parse.getHost() == null || parse.getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy)))) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", optString);
            j45.l.j(c(), "webview", ".ui.tools.WebViewUI", intent, null);
            this.f143443f.d(false);
            return;
        }
        java.lang.String optString3 = jSONObject.optString("statusBarColor");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            parseColor = 0;
        } else {
            try {
                parseColor = android.graphics.Color.parseColor(optString3);
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", e17.getMessage());
                this.f143443f.a("invalid_color");
                return;
            }
        }
        java.lang.String optString4 = jSONObject.optString("statusBarStyle");
        java.lang.String optString5 = jSONObject.optString("preInjectData");
        bundle.putString("rawUrl", optString);
        bundle.putInt("customize_status_bar_color", parseColor);
        bundle.putString("status_bar_style", optString4);
        bundle.putString("game_pre_inject_data", optString5);
        java.lang.String optString6 = jSONObject.optString("halfScreenBackGroundColor");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString6)) {
            parseColor2 = 0;
        } else {
            try {
                parseColor2 = android.graphics.Color.parseColor(optString6);
            } catch (java.lang.IllegalArgumentException e18) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", e18.getMessage());
                this.f143443f.a("invalid_color");
                return;
            }
        }
        bundle.putInt("KHalfScreenBackGroundColor", parseColor2);
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("jumpInfo");
            org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("halfScreen");
            int i17 = jSONObject3.getInt("type");
            if (i17 == 1) {
                bundle.putString("rawUrl", jSONObject2.getString("jumpUrl"));
                bundle.putInt("KHalfScreenHeight", jSONObject3.getInt("screenHeightDp"));
                bundle.putFloat("KHalfScreenHeightPercent", -1.0f);
            } else if (i17 == 2) {
                bundle.putString("rawUrl", jSONObject2.getString("jumpUrl"));
                bundle.putInt("KHalfScreenHeight", 0);
                bundle.putFloat("KHalfScreenHeightPercent", (float) jSONObject3.getDouble("screenHeightPercent"));
            }
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenGameUrlWithExtraWebView", e19, "JSONException", new java.lang.Object[0]);
        }
        bundle.putBoolean("shouldCheckLimitedMode", java.lang.Boolean.valueOf(jSONObject.optBoolean("shouldCheckLimitedMode", true)).booleanValue());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            bundle.putString("game_open_html", optString2);
        }
        bundle.putLong("liteAppUuid", this.f143442e.f299024a);
        bundle.putLong("liteAppPageId", this.f143442e.f299026c);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtras(bundle);
        j45.l.j(c(), "webview", ".ui.tools.WebViewUI", intent2, null);
        this.f143443f.d(false);
    }

    public final void B(final org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("liteAppInfo");
        boolean optBoolean = jSONObject.optBoolean("transParentLiteApp");
        java.lang.String optString = jSONObject.optString("preInjectData");
        java.lang.String optString2 = jSONObject.optString("halfScreenBackGroundColor");
        int i17 = 0;
        boolean z17 = jSONObject.optInt("forceOpenLiteApp", 1) != 0;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            try {
                i17 = android.graphics.Color.parseColor(optString2);
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", e17.getMessage());
                this.f143443f.a("invalid_color");
                return;
            }
        }
        final java.lang.String optString3 = jSONObject.optString("url");
        java.lang.String queryParameter = android.net.Uri.parse(optString3).getQueryParameter("wechat_pkgid");
        final android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("pkgId", queryParameter);
        bundle.putString("appId", str);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
        bundle.putString("query", str3);
        if (optJSONObject != null) {
            bundle.putBoolean("forbidRightGesture", optJSONObject.optBoolean("isForbidRightGesture"));
        }
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, optBoolean);
        bundle.putBoolean("forceOpenLiteApp", z17);
        bundle.putString("preInjectData", optString);
        bundle.putInt("KHalfScreenBackGroundColor", i17);
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("jumpInfo");
        org.json.JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("halfScreen") : null;
        if (optJSONObject3 != null) {
            bundle.putBoolean("isHalfScreen", true);
            try {
                bundle.putDouble("heightPercent", optJSONObject3.getDouble("screenHeightPercent"));
            } catch (org.json.JSONException unused) {
            }
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$OpenLiteAppData(bundle), com.tencent.mm.plugin.game.luggage.jsapi.s2.class, new com.tencent.mm.ipcinvoker.r() { // from class: z43.a0$$b
            @Override // com.tencent.mm.ipcinvoker.r
            public final void a(java.lang.Object obj) {
                z43.a0 a0Var = z43.a0.this;
                a0Var.getClass();
                long j17 = ((com.tencent.mm.ipcinvoker.type.IPCLong) obj).f68405d;
                org.json.JSONObject jSONObject2 = jSONObject;
                if (j17 < 0) {
                    a0Var.A(jSONObject2);
                    return;
                }
                android.os.Bundle bundle2 = bundle;
                if (j17 > 0) {
                    bundle2.putLong(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_DATA_UUID, j17);
                }
                com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
                liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.GAME;
                jd.c cVar = a0Var.f143442e;
                liteAppReferrerInfo.sceneId = cVar.f299025b;
                com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo = cVar.f299031h;
                liteAppReferrerInfo.scenePath = pageInfo != null ? pageInfo.pageUrl : "";
                bundle2.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
                com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "checkLiteApp success");
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(a0Var.c(), bundle2, false, false, new z43.b0(a0Var, jSONObject2));
                com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "openLiteApp update pkg");
                java.lang.Object obj2 = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
                java.lang.String a17 = kh0.i.a(optString3);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    return;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(a17);
                com.tencent.mm.plugin.wepkg.version.f.a(linkedList, 4);
            }
        });
    }

    @Override // jd.b
    public void a(java.lang.String str, final org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("liteAppInfo");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("appId");
            java.lang.String optString2 = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            java.lang.String optString3 = optJSONObject.optString("query");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", "openInLiteApp appId is null");
                A(jSONObject);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "openInLiteApp, appId : %s, path : %s, query : %s", optString, optString2, optString3);
                B(jSONObject, optString, optString2, optString3);
                return;
            }
        }
        if (!jSONObject.optBoolean("openLiteIfMatchUrlLiteConf", false)) {
            A(jSONObject);
            return;
        }
        java.lang.String optString4 = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", "url is null");
            this.f143443f.a("fail");
        } else {
            final android.net.Uri parse = android.net.Uri.parse(optString4);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("url", optString4);
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.luggage.jsapi.n2.class, new com.tencent.mm.ipcinvoker.r() { // from class: z43.a0$$a
                @Override // com.tencent.mm.ipcinvoker.r
                public final void a(java.lang.Object obj) {
                    android.os.Bundle bundle2 = (android.os.Bundle) obj;
                    z43.a0 a0Var = z43.a0.this;
                    org.json.JSONObject jSONObject2 = jSONObject;
                    if (bundle2 == null) {
                        a0Var.A(jSONObject2);
                    } else {
                        a0Var.getClass();
                        a0Var.B(jSONObject2, bundle2.getString("appId"), bundle2.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), parse.getQuery());
                    }
                }
            });
        }
    }
}

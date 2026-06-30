package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class j2 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openGameUrlWithExtraWebView";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(final sd.b bVar) {
        int parseColor;
        org.json.JSONObject optJSONObject = bVar.f406597b.f344506c.optJSONObject("liteAppInfo");
        boolean optBoolean = bVar.f406597b.f344506c.optBoolean("transParentLiteApp");
        if (optJSONObject == null) {
            if (!bVar.f406597b.f344506c.optBoolean("openLiteIfMatchUrlLiteConf", false)) {
                f(bVar);
                return;
            }
            java.lang.String optString = bVar.f406597b.f344506c.optString("url");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "url is null");
                bVar.c("fail", null);
                return;
            } else {
                final android.net.Uri parse = android.net.Uri.parse(optString);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("url", optString);
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.luggage.jsapi.n2.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.plugin.game.luggage.jsapi.j2$$b
                    @Override // com.tencent.mm.ipcinvoker.r
                    public final void a(java.lang.Object obj) {
                        android.os.Bundle bundle2 = (android.os.Bundle) obj;
                        final com.tencent.mm.plugin.game.luggage.jsapi.j2 j2Var = com.tencent.mm.plugin.game.luggage.jsapi.j2.this;
                        final sd.b bVar2 = bVar;
                        if (bundle2 == null) {
                            j2Var.f(bVar2);
                            return;
                        }
                        j2Var.getClass();
                        java.lang.String string = bundle2.getString("appId");
                        java.lang.String string2 = bundle2.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                        java.lang.String query = parse.getQuery();
                        int i17 = 0;
                        boolean z17 = bVar2.f406597b.f344506c.optInt("forceOpenLiteApp", 1) != 0;
                        final java.lang.String optString2 = bVar2.f406597b.f344506c.optString("url");
                        java.lang.String queryParameter = android.net.Uri.parse(optString2).getQueryParameter("wechat_pkgid");
                        final android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putString("pkgId", queryParameter);
                        bundle3.putBoolean("forceOpenLiteApp", z17);
                        bundle3.putString("appId", string);
                        bundle3.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, string2);
                        bundle3.putString("query", query);
                        org.json.JSONObject optJSONObject2 = bVar2.f406597b.f344506c.optJSONObject("jumpInfo");
                        org.json.JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("halfScreen") : null;
                        bundle3.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, bVar2.f406597b.f344506c.optBoolean("transParentLiteApp"));
                        java.lang.String optString3 = bVar2.f406597b.f344506c.optString("halfScreenBackGroundColor");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
                            try {
                                i17 = android.graphics.Color.parseColor(optString3);
                            } catch (java.lang.IllegalArgumentException e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", e17.getMessage());
                                bVar2.c("invalid_color", null);
                                return;
                            }
                        }
                        bundle3.putInt("KHalfScreenBackGroundColor", i17);
                        if (optJSONObject3 != null) {
                            bundle3.putBoolean("isHalfScreen", true);
                            try {
                                bundle3.putDouble("heightPercent", optJSONObject3.getDouble("screenHeightPercent"));
                            } catch (org.json.JSONException unused) {
                            }
                        }
                        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$OpenLiteAppData(bundle3), com.tencent.mm.plugin.game.luggage.jsapi.s2.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.plugin.game.luggage.jsapi.j2$$c
                            /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
                            /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
                            @Override // com.tencent.mm.ipcinvoker.r
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void a(java.lang.Object r12) {
                                /*
                                    r11 = this;
                                    com.tencent.mm.ipcinvoker.type.IPCLong r12 = (com.tencent.mm.ipcinvoker.type.IPCLong) r12
                                    com.tencent.mm.plugin.game.luggage.jsapi.j2 r0 = com.tencent.mm.plugin.game.luggage.jsapi.j2.this
                                    r0.getClass()
                                    java.lang.String r1 = "MicroMsg.JsApiOpenGameUrlWithExtraWebView"
                                    long r2 = r12.f68405d
                                    r4 = 0
                                    int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                                    sd.b r4 = r3
                                    if (r12 < 0) goto L97
                                    android.os.Bundle r7 = r2
                                    if (r12 <= 0) goto L1c
                                    java.lang.String r12 = "dataUuid"
                                    r7.putLong(r12, r2)
                                L1c:
                                    com.tencent.liteapp.storage.LiteAppReferrerInfo r12 = new com.tencent.liteapp.storage.LiteAppReferrerInfo
                                    r12.<init>()
                                    com.tencent.liteapp.gen.LiteAppOpenScene r2 = com.tencent.liteapp.gen.LiteAppOpenScene.GAME
                                    r12.scene = r2
                                    sd.d r2 = r4.f406596a
                                    sd.u0 r2 = (sd.u0) r2
                                    android.os.Bundle r2 = r2.f406657n
                                    java.lang.String r3 = "rawUrl"
                                    java.lang.String r5 = ""
                                    java.lang.String r2 = r2.getString(r3, r5)
                                    java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> L43
                                    r3.<init>(r2)     // Catch: java.lang.Exception -> L43
                                    java.lang.String r2 = r3.getHost()     // Catch: java.lang.Exception -> L43
                                    java.lang.String r5 = r3.getPath()     // Catch: java.lang.Exception -> L41
                                    goto L4e
                                L41:
                                    r3 = move-exception
                                    goto L46
                                L43:
                                    r2 = move-exception
                                    r3 = r2
                                    r2 = r5
                                L46:
                                    r6 = 0
                                    java.lang.Object[] r6 = new java.lang.Object[r6]
                                    java.lang.String r8 = "parse Url error"
                                    com.tencent.mars.xlog.Log.printErrStackTrace(r1, r3, r8, r6)
                                L4e:
                                    r12.sceneId = r2
                                    r12.scenePath = r5
                                    java.lang.String r2 = "liteappReferrerInfo"
                                    r7.putParcelable(r2, r12)
                                    java.lang.String r12 = "checkLiteApp success"
                                    com.tencent.mars.xlog.Log.i(r1, r12)
                                    java.lang.Class<q80.g0> r12 = q80.g0.class
                                    i95.m r12 = i95.n0.c(r12)
                                    q80.g0 r12 = (q80.g0) r12
                                    sd.d r2 = r4.f406596a
                                    sd.u0 r2 = (sd.u0) r2
                                    android.content.Context r6 = r2.f406610d
                                    r8 = 0
                                    r9 = 0
                                    com.tencent.mm.plugin.game.luggage.jsapi.l2 r10 = new com.tencent.mm.plugin.game.luggage.jsapi.l2
                                    r10.<init>(r0, r4)
                                    r5 = r12
                                    com.tencent.mm.feature.lite.i r5 = (com.tencent.mm.feature.lite.i) r5
                                    r5.kk(r6, r7, r8, r9, r10)
                                    java.lang.String r12 = "openLiteApp update pkg"
                                    com.tencent.mars.xlog.Log.i(r1, r12)
                                    java.lang.Object r12 = com.tencent.mm.plugin.wepkg.utils.n.f188501a
                                    java.lang.String r12 = r4
                                    java.lang.String r12 = kh0.i.a(r12)
                                    boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r12)
                                    if (r0 != 0) goto L9a
                                    java.util.LinkedList r0 = new java.util.LinkedList
                                    r0.<init>()
                                    r0.add(r12)
                                    r12 = 4
                                    com.tencent.mm.plugin.wepkg.version.f.a(r0, r12)
                                    goto L9a
                                L97:
                                    r0.f(r4)
                                L9a:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.jsapi.j2$$c.a(java.lang.Object):void");
                            }
                        });
                    }
                });
                return;
            }
        }
        java.lang.String optString2 = optJSONObject.optString("appId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openInLiteApp appId is null");
            f(bVar);
            return;
        }
        java.lang.String optString3 = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        java.lang.String optString4 = optJSONObject.optString("query");
        java.lang.String optString5 = bVar.f406597b.f344506c.optString("preInjectData");
        boolean optBoolean2 = optJSONObject.optBoolean("isForbidRightGesture");
        java.lang.String optString6 = bVar.f406597b.f344506c.optString("halfScreenBackGroundColor");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString6)) {
            parseColor = 0;
        } else {
            try {
                parseColor = android.graphics.Color.parseColor(optString6);
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", e17.getMessage());
                bVar.c("invalid_color", null);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openInLiteApp, appId : %s, path : %s, query : %s", optString2, optString3, optString4);
        final java.lang.String optString7 = bVar.f406597b.f344506c.optString("url");
        java.lang.String queryParameter = android.net.Uri.parse(optString7).getQueryParameter("wechat_pkgid");
        final android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("appId", optString2);
        bundle2.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, optString3);
        bundle2.putString("query", optString4);
        bundle2.putString("pkgId", queryParameter);
        bundle2.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, optBoolean);
        bundle2.putBoolean("forbidRightGesture", optBoolean2);
        bundle2.putString("preInjectData", optString5);
        bundle2.putBoolean("forceOpenLiteApp", bVar.f406597b.f344506c.optInt("forceOpenLiteApp", 0) != 0);
        org.json.JSONObject optJSONObject2 = bVar.f406597b.f344506c.optJSONObject("jumpInfo");
        bundle2.putInt("KHalfScreenBackGroundColor", parseColor);
        org.json.JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("halfScreen") : null;
        if (optJSONObject3 != null) {
            bundle2.putBoolean("isHalfScreen", true);
            try {
                bundle2.putDouble("heightPercent", optJSONObject3.getDouble("screenHeightPercent"));
            } catch (org.json.JSONException unused) {
            }
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$OpenLiteAppData(bundle2), com.tencent.mm.plugin.game.luggage.jsapi.s2.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.plugin.game.luggage.jsapi.j2$$a
            /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
            @Override // com.tencent.mm.ipcinvoker.r
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r12) {
                /*
                    r11 = this;
                    com.tencent.mm.ipcinvoker.type.IPCLong r12 = (com.tencent.mm.ipcinvoker.type.IPCLong) r12
                    com.tencent.mm.plugin.game.luggage.jsapi.j2 r0 = com.tencent.mm.plugin.game.luggage.jsapi.j2.this
                    r0.getClass()
                    java.lang.String r1 = "MicroMsg.JsApiOpenGameUrlWithExtraWebView"
                    long r2 = r12.f68405d
                    r4 = 0
                    int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    sd.b r4 = r3
                    if (r12 < 0) goto L92
                    android.os.Bundle r7 = r2
                    if (r12 <= 0) goto L1c
                    java.lang.String r12 = "dataUuid"
                    r7.putLong(r12, r2)
                L1c:
                    com.tencent.liteapp.storage.LiteAppReferrerInfo r12 = new com.tencent.liteapp.storage.LiteAppReferrerInfo
                    r12.<init>()
                    com.tencent.liteapp.gen.LiteAppOpenScene r2 = com.tencent.liteapp.gen.LiteAppOpenScene.GAME
                    r12.scene = r2
                    sd.d r2 = r4.f406596a
                    sd.u0 r2 = (sd.u0) r2
                    android.os.Bundle r2 = r2.f406657n
                    java.lang.String r3 = "rawUrl"
                    java.lang.String r5 = ""
                    java.lang.String r2 = r2.getString(r3, r5)
                    java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> L43
                    r3.<init>(r2)     // Catch: java.lang.Exception -> L43
                    java.lang.String r2 = r3.getHost()     // Catch: java.lang.Exception -> L43
                    java.lang.String r5 = r3.getPath()     // Catch: java.lang.Exception -> L41
                    goto L4e
                L41:
                    r3 = move-exception
                    goto L46
                L43:
                    r2 = move-exception
                    r3 = r2
                    r2 = r5
                L46:
                    r6 = 0
                    java.lang.Object[] r6 = new java.lang.Object[r6]
                    java.lang.String r8 = "parse Url error"
                    com.tencent.mars.xlog.Log.printErrStackTrace(r1, r3, r8, r6)
                L4e:
                    r12.sceneId = r2
                    r12.scenePath = r5
                    java.lang.String r2 = "liteappReferrerInfo"
                    r7.putParcelable(r2, r12)
                    java.lang.Class<q80.g0> r12 = q80.g0.class
                    i95.m r12 = i95.n0.c(r12)
                    q80.g0 r12 = (q80.g0) r12
                    sd.d r2 = r4.f406596a
                    sd.u0 r2 = (sd.u0) r2
                    android.content.Context r6 = r2.f406610d
                    r8 = 0
                    r9 = 0
                    com.tencent.mm.plugin.game.luggage.jsapi.k2 r10 = new com.tencent.mm.plugin.game.luggage.jsapi.k2
                    r10.<init>(r0, r4)
                    r5 = r12
                    com.tencent.mm.feature.lite.i r5 = (com.tencent.mm.feature.lite.i) r5
                    r5.kk(r6, r7, r8, r9, r10)
                    java.lang.String r12 = "openLiteApp update pkg"
                    com.tencent.mars.xlog.Log.i(r1, r12)
                    java.lang.Object r12 = com.tencent.mm.plugin.wepkg.utils.n.f188501a
                    java.lang.String r12 = r4
                    java.lang.String r12 = kh0.i.a(r12)
                    boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r12)
                    if (r0 != 0) goto L95
                    java.util.LinkedList r0 = new java.util.LinkedList
                    r0.<init>()
                    r0.add(r12)
                    r12 = 4
                    com.tencent.mm.plugin.wepkg.version.f.a(r0, r12)
                    goto L95
                L92:
                    r0.f(r4)
                L95:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.jsapi.j2$$a.a(java.lang.Object):void");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(sd.b r17) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.jsapi.j2.f(sd.b):void");
    }
}

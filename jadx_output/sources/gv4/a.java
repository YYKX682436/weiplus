package gv4;

/* loaded from: classes.dex */
public final class a extends aw4.b0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f276113h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(hv4.b uiComponent) {
        super(uiComponent);
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
        this.f276113h = "MicroMsg.WebSearch.TagSearchJSApi";
    }

    @android.webkit.JavascriptInterface
    public java.lang.String appendSearchTag(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f276113h, "appendSearchTag " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("query", "");
            java.lang.String optString2 = jSONObject.optString("searchId", "");
            java.lang.String optString3 = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
            java.lang.String optString4 = jSONObject.optString("requestId", "");
            av4.j jVar = this.f14326a;
            hv4.b bVar = jVar instanceof hv4.b ? (hv4.b) jVar : null;
            if (bVar != null) {
                kotlin.jvm.internal.o.d(optString);
                kotlin.jvm.internal.o.d(optString3);
                kotlin.jvm.internal.o.d(optString2);
                kotlin.jvm.internal.o.d(optString4);
                bVar.a5(optString, optString3, optString2, optString4);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @Override // aw4.l
    public int k() {
        return 1;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String openSearchWebView(java.lang.String str) {
        r45.ck6 ck6Var;
        java.lang.String str2;
        java.lang.String str3 = "";
        com.tencent.mars.xlog.Log.i(this.f276113h, "openSearchWebView " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("query");
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int optInt2 = jSONObject.optInt("type", 0);
            int optInt3 = jSONObject.optInt("subType", 0);
            java.lang.String optString2 = jSONObject.optString("searchId", "");
            java.lang.String optString3 = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
            int optInt4 = jSONObject.optInt("actionType", 0);
            java.lang.String optString4 = jSONObject.optString("extParams", "");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("nativeConfig");
            java.lang.String optString5 = optJSONObject != null ? optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE) : null;
            if (optString5 == null) {
                optString5 = "";
            }
            if (optInt4 == 3) {
                java.util.Map c17 = su4.r2.c(optInt, false, optInt2, optString4);
                java.util.HashMap hashMap = (java.util.HashMap) c17;
                hashMap.put("query", optString);
                hashMap.put("searchId", optString2);
                hashMap.put("subType", java.lang.String.valueOf(optInt3));
                hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, optString3);
                hashMap.put("subSessionId", su4.r2.f(optInt));
                r45.ck6 ck6Var2 = new r45.ck6();
                av4.j jVar = this.f14326a;
                hv4.b bVar = jVar instanceof hv4.b ? (hv4.b) jVar : null;
                if (bVar != null && (ck6Var = (r45.ck6) bVar.m4()) != null && (str2 = ck6Var.f371630o) != null) {
                    str3 = str2;
                }
                ck6Var2.f371630o = str3;
                ck6Var2.f371625g = gv4.d.f276119a.a(c17);
                ck6Var2.f371627i = optString;
                ck6Var2.f371624f = optInt;
                ck6Var2.f371622d = optString2;
                ck6Var2.f371623e = optString3;
                ck6Var2.f371626h = su4.r2.f(optInt);
                ck6Var2.f371629n = optString5;
                av4.j jVar2 = this.f14326a;
                hv4.b bVar2 = jVar2 instanceof hv4.b ? (hv4.b) jVar2 : null;
                if (bVar2 != null) {
                    bVar2.r1(ck6Var2);
                }
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String setSearchTagResult(java.lang.String str) {
        gv4.e c17;
        com.tencent.mars.xlog.Log.i(this.f276113h, "setSearchTagResult " + str);
        if (str == null) {
            return f().toString();
        }
        av4.j jVar = this.f14326a;
        hv4.b bVar = jVar instanceof hv4.b ? (hv4.b) jVar : null;
        if (bVar != null && (c17 = bVar.c()) != null) {
            try {
                su4.m1 m1Var = c17.f276121m;
                if (m1Var != null) {
                    gm0.j1.d().d(m1Var);
                    c17.f276121m = null;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                r45.rn3 rn3Var = new r45.rn3();
                rn3Var.f385022d = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
                rn3Var.f385023e = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
                rn3Var.f385024f = jSONObject.optString("requestId", "");
                rn3Var.f385025g = jSONObject.optString("searchId", "");
                rn3Var.f385027i = jSONObject.optString("query", "");
                rn3Var.f385028m = jSONObject.optString("content", "");
                rn3Var.f385026h = jSONObject.optInt("h5Version", 0);
                su4.m1 m1Var2 = new su4.m1(rn3Var, c17.a());
                gm0.j1.d().g(m1Var2);
                c17.f276121m = m1Var2;
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
                hv4.b k17 = c17.k();
                com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView = k17 != null ? k17.getWebView() : null;
                if (optJSONObject != null && webView != null) {
                    hv4.b k18 = c17.k();
                    int b17 = i65.a.b(k18 != null ? k18.H() : null, optJSONObject.optInt("x", 0));
                    hv4.b k19 = c17.k();
                    int b18 = i65.a.b(k19 != null ? k19.H() : null, optJSONObject.optInt("y", 0));
                    hv4.b k27 = c17.k();
                    int b19 = i65.a.b(k27 != null ? k27.H() : null, optJSONObject.optInt("w", 0));
                    hv4.b k28 = c17.k();
                    android.graphics.Bitmap E = com.tencent.mm.sdk.platformtools.x.E(webView.getBitmap(), b17, b18, b19, i65.a.b(k28 != null ? k28.H() : null, optJSONObject.optInt("h", 0)), true);
                    su4.m1 m1Var3 = c17.f276121m;
                    if (m1Var3 != null) {
                        m1Var3.f413011i = E;
                    }
                }
                hv4.b k29 = c17.k();
                if (k29 != null) {
                    java.lang.String RequestId = rn3Var.f385024f;
                    kotlin.jvm.internal.o.f(RequestId, "RequestId");
                    k29.D(RequestId);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return g().toString();
    }
}

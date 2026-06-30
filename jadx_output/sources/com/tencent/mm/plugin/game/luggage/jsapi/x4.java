package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class x4 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setGameData";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        java.lang.String str;
        java.lang.String optString;
        sd.b bVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetGameData", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetGameData", "data is null");
            bVar.c("null_data", null);
            return;
        }
        sd.a aVar = (sd.a) bVar.f406596a;
        boolean z17 = aVar instanceof com.tencent.mm.plugin.game.luggage.page.x0;
        if (z17) {
            com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) aVar;
            str = x0Var.K.b();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                java.lang.String s17 = x0Var.s();
                if (s17 == null) {
                    s17 = "";
                }
                android.net.Uri parse = android.net.Uri.parse(s17);
                if (parse.getHost() == null || !parse.getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetGameData", "appId is null");
                    bVar.c("appid_null", null);
                    return;
                }
            }
            optString = jSONObject.optString("key");
            java.lang.String optString2 = jSONObject.optString("value");
            java.lang.String optString3 = jSONObject.optString("weight", "1");
            java.lang.String optString4 = jSONObject.optString("expireTime");
            boolean optBoolean = jSONObject.optBoolean("autoClean", true);
            boolean optBoolean2 = jSONObject.optBoolean("pageCache", false);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2) || optString.length() > 80) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetGameData", "key or value is invalid");
                bVar.c("null_key", null);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", str);
            bundle.putString("key", optString);
            bundle.putString("weight", optString3);
            bundle.putString("expireTime", optString4);
            bundle.putBoolean("autoClean", optBoolean);
            ew4.c.c().getClass();
            long length = optString.getBytes().length + optString2.getBytes().length;
            bundle.putLong("storeSize", length);
            if (length <= 204800 && !optBoolean2) {
                bundle.putString("value", optString2);
            }
            if (!optBoolean2) {
                bVar2 = bVar;
            } else if (z17) {
                boolean z18 = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_open_page_cache, 0) == 1;
                boolean z19 = ((com.tencent.mm.plugin.game.luggage.page.x0) aVar).S().f441768p;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetGameData", "isOpenPageCache:%b, allowSetPageCache:%b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
                if (!z18) {
                    bVar.c("close_page_cache", null);
                    return;
                }
                bVar2 = bVar;
                if (!z19) {
                    bVar2.c("ban_set_page_cache", null);
                    return;
                }
            } else {
                bVar2 = bVar;
                bVar2.c("ban_set_page_cache", null);
            }
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.luggage.jsapi.w4.class, new com.tencent.mm.plugin.game.luggage.jsapi.v4(this, optString2, bVar2));
            return;
        }
        str = "wx62d9035fd4fd2059";
        optString = jSONObject.optString("key");
        java.lang.String optString22 = jSONObject.optString("value");
        java.lang.String optString32 = jSONObject.optString("weight", "1");
        java.lang.String optString42 = jSONObject.optString("expireTime");
        boolean optBoolean3 = jSONObject.optBoolean("autoClean", true);
        boolean optBoolean22 = jSONObject.optBoolean("pageCache", false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetGameData", "key or value is invalid");
        bVar.c("null_key", null);
    }
}

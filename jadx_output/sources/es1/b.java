package es1;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "savePageData";
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
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        java.lang.String optString = jSONObject.optString("pageUrl");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            bVar.c("pageUrl is empty", null);
            return;
        }
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.j(optString).length() == 0) {
            bVar.c("host invalid", null);
            return;
        }
        java.lang.String optString2 = jSONObject.optString("content");
        kotlin.jvm.internal.o.d(optString2);
        if (optString2.length() == 0) {
            bVar.c("content is empty", null);
            return;
        }
        java.lang.String i17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.i(optString, false);
        nu4.k kVar = nu4.b0.f340241J;
        nu4.b bVar2 = nu4.b0.P;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 t2Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a;
        ts1.o oVar = new ts1.o(optString, i17, bVar2, com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94447c, null, null, null, null, false, null, null, 2032, null);
        nu4.b bVar3 = oVar.f421590c;
        kotlin.jvm.internal.o.d(bVar3);
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(bVar3.Q(oVar.d()).u(), true);
        byte[] bytes = optString2.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        int S = com.tencent.mm.vfs.w6.S(i18, bytes, 0, bytes.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.GamePrefetchJsApiSavePageData", "[game-web-prefetch] savePageData content: " + optString2.length() + ", targetPath: " + i18 + ", webId: " + oVar.f421589b + ", bizId: " + oVar.d() + ", url: " + optString + ", ret: " + S);
        if (S != 0) {
            bVar.c("save page data error", null);
            return;
        }
        java.lang.String optString3 = jSONObject.optString("headers");
        kotlin.jvm.internal.o.d(optString3);
        if (optString3.length() > 0) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString3);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(jSONObject2.optInt("x-wx-max-cache", -1));
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                oVar.l().put("x-wx-max-cache", kz5.b0.c(java.lang.String.valueOf(valueOf.intValue())));
            }
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(jSONObject2.optInt("max-age", -1));
            if (!(valueOf2.intValue() > 0)) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                oVar.l().put("max-age", kz5.b0.c(java.lang.String.valueOf(valueOf2.intValue())));
            }
            if (jSONObject2.has("status")) {
                oVar.l().put("status", kz5.b0.c(java.lang.String.valueOf(jSONObject2.optInt("status", -1))));
            } else {
                oVar.l().put("status", kz5.b0.c("200"));
            }
            oVar.z(com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.f94222g, com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.j(optString));
        }
        bVar.a();
    }
}

package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f184658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184659e;

    public v(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, java.util.Map map) {
        this.f184659e = baseSOSWebViewUI;
        this.f184658d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184659e;
        baseSOSWebViewUI.getClass();
        java.util.Map map = this.f184658d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "openSearchWebView %s", map.toString());
        int e17 = com.tencent.mm.plugin.websearch.l2.e(map, "type", 0);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("toViewType", "suggestion");
        org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap);
        int e18 = com.tencent.mm.plugin.websearch.l2.e(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        boolean a17 = tg0.r2.a(e18);
        java.lang.String jSONObject2 = jSONObject.toString();
        if (!a17) {
            jSONObject2 = com.tencent.mm.plugin.webview.ui.tools.jsapi.j9.b(jSONObject2);
        }
        java.lang.String str = (java.lang.String) map.get("tagId");
        java.lang.String str2 = (java.lang.String) map.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        java.lang.String inEditTextQuery = baseSOSWebViewUI.J4.getInEditTextQuery();
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(map, "searchId");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("key_load_js_without_delay", true);
        intent.putExtra("ftsQuery", inEditTextQuery);
        intent.putExtra("ftsType", e17);
        intent.putExtra("ftsbizscene", e18);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map c17 = su4.r2.c(e18, false, e17, jSONObject2);
        java.util.HashMap hashMap2 = (java.util.HashMap) c17;
        hashMap2.put("query", tg0.r2.a(e18) ? inEditTextQuery : com.tencent.mm.plugin.webview.ui.tools.jsapi.j9.b(inEditTextQuery));
        hashMap2.put("searchId", f17);
        hashMap2.put("isHomePage", java.lang.String.valueOf(1));
        hashMap2.put("isSug", "1");
        if (!android.text.TextUtils.isEmpty(str2)) {
            hashMap2.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str2);
            intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str2);
        }
        java.lang.String str3 = (java.lang.String) map.get("subSessionId");
        hashMap2.put("subSessionId", str3);
        intent.putExtra("subSessionId", str3);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        intent.putExtra("rawUrl", su4.r2.e(c17, 0));
        intent.putExtra("ftsQuery", inEditTextQuery);
        intent.putExtra("tabId", str);
        intent.putExtra("key_load_js_without_delay", true);
        intent.putExtra("ftsneedkeyboard", true);
        intent.putExtra("key_search_icon_and_hint_fix_default", true);
        intent.putExtra("ftsInitToSearch", true);
        intent.putExtra("hideSearchInput", false);
        j45.l.y(com.tencent.mm.sdk.platformtools.x2.f193071a, intent);
    }
}

package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class v extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w f182633a;

    public v(com.tencent.mm.plugin.webview.luggage.w wVar) {
        this.f182633a = wVar;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", this.f182633a.f182641e);
            jSONObject.put("set_cookie", 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyUtil", "onGetA8Key, e:" + e17.getMessage());
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onGetA8KeyUrl";
    }
}

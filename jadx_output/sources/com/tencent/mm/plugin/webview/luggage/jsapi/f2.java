package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182306d;

    public f2(com.tencent.mm.plugin.webview.luggage.jsapi.g2 g2Var, org.json.JSONObject jSONObject) {
        this.f182306d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLog", "jslog : " + this.f182306d.optString("msg"));
    }
}

package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class o4 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f182418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.j4 f182421d;

    public o4(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, java.util.concurrent.CountDownLatch countDownLatch, org.json.JSONObject jSONObject, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182421d = j4Var;
        this.f182418a = countDownLatch;
        this.f182419b = jSONObject;
        this.f182420c = q5Var;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        org.json.JSONObject jSONObject = this.f182419b;
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182420c;
        if (bitmap == null || bitmap.isRecycled()) {
            q5Var.a("download fail", null);
            return;
        }
        this.f182418a.countDown();
        try {
            jSONObject.put("imgPath", this.f182421d.m("", bitmap));
            q5Var.a(null, jSONObject);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiShareCustomContent", e17, "", new java.lang.Object[0]);
            q5Var.a("JSONException", null);
        }
    }
}

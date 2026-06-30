package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class n4 extends com.tencent.mm.plugin.webview.luggage.jsapi.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f182406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.j4 f182408d;

    public n4(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, android.content.Intent intent, android.content.Context context) {
        this.f182408d = j4Var;
        this.f182405a = q5Var;
        this.f182406b = intent;
        this.f182407c = context;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182405a;
        if (!K0 || jSONObject == null) {
            q5Var.a(str, null);
            return;
        }
        java.lang.String optString = jSONObject.optString("imgPath");
        com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var = this.f182408d;
        j4Var.f182361f = optString;
        if (com.tencent.mm.sdk.platformtools.t8.K0(j4Var.f182361f)) {
            q5Var.a("imgPath is null", null);
            return;
        }
        android.content.Intent intent = this.f182406b;
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", j4Var.f182361f);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "doTimeline, start activity");
        j45.l.o(this.f182407c, "sns", ".ui.SnsUploadUI", this.f182406b, 2, false);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}

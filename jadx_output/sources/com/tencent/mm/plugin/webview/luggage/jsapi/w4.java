package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class w4 extends com.tencent.mm.plugin.webview.luggage.jsapi.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.y4 f182500b;

    public w4(com.tencent.mm.plugin.webview.luggage.jsapi.y4 y4Var, java.lang.String str) {
        this.f182500b = y4Var;
        this.f182499a = str;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) || jSONObject == null) {
            this.f182500b.f182526c.f182539e.a(str, null);
            return;
        }
        this.f182500b.f182526c.f182541g.f182361f = jSONObject.optString("imgPath");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f182500b.f182526c.f182541g.f182361f)) {
            this.f182500b.f182526c.f182539e.a("imgPath is null", null);
            return;
        }
        android.graphics.Bitmap j07 = com.tencent.mm.sdk.platformtools.x.j0(this.f182500b.f182526c.f182541g.f182361f, 140, 140, i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a));
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.luggage.jsapi.v4(this, j07));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}

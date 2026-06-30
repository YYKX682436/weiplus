package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.w4 f182482d;

    public v4(com.tencent.mm.plugin.webview.luggage.jsapi.w4 w4Var, android.graphics.Bitmap bitmap) {
        this.f182482d = w4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.jsapi.w4 w4Var = this.f182482d;
        com.tencent.mm.plugin.webview.luggage.jsapi.y4 y4Var = w4Var.f182500b;
        com.tencent.mm.plugin.webview.luggage.jsapi.z4 z4Var = y4Var.f182526c;
        final com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = z4Var.f182539e;
        final java.lang.String str = w4Var.f182499a;
        final org.json.JSONObject jSONObject = y4Var.f182524a;
        final android.content.Context context = z4Var.f182540f;
        final java.lang.String str2 = y4Var.f182525b;
        com.tencent.mm.ui.widget.dialog.j jVar = new com.tencent.mm.ui.widget.dialog.j() { // from class: com.tencent.mm.plugin.webview.luggage.jsapi.v4$$a
            @Override // com.tencent.mm.ui.widget.dialog.j
            public final void a(boolean z17, java.lang.String str3, int i17) {
                java.lang.String str4 = str;
                android.content.Context context2 = context;
                java.lang.String str5 = str2;
                com.tencent.mm.plugin.webview.luggage.jsapi.v4 v4Var = com.tencent.mm.plugin.webview.luggage.jsapi.v4.this;
                com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var2 = q5Var;
                if (!z17) {
                    v4Var.getClass();
                    q5Var2.a("cancel", null);
                    com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 20, 2001, 2, 56, 0, str5);
                    return;
                }
                com.tencent.mm.plugin.webview.luggage.jsapi.w4 w4Var2 = v4Var.f182482d;
                if (com.tencent.mm.sdk.platformtools.t8.K0(w4Var2.f182500b.f182526c.f182541g.f182361f)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "get filepath fail");
                    q5Var2.a("get filepath fail", null);
                    return;
                }
                ((dk5.s5) tg3.t1.a()).Ui(str3, str4);
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("tailInfo");
                ((dk5.s5) tg3.t1.a()).aj(context2, str4, w4Var2.f182500b.f182526c.f182541g.f182361f, 0, "", "", null, null, optJSONObject != null ? new com.tencent.mm.modelmulti.SourceImgInfo(optJSONObject.optString("url", ""), 1) : null);
                q5Var2.a(null, null);
                com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 20, 2001, 2, 48, 0, str5);
            }
        };
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.a aVar = new jd5.a();
        aVar.p(w4Var.f182500b.f182526c.f182541g.f182361f);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        android.content.Context context2 = w4Var.f182500b.f182526c.f182540f;
        java.lang.String str3 = w4Var.f182499a;
        n13.t a17 = n13.t.a(jVar);
        a17.f334138f.f334139a = 3;
        ((dk5.y) a0Var).wi(context2, aVar, str3, a17);
    }
}

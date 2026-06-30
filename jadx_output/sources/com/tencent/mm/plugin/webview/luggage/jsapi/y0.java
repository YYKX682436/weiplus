package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class y0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.z0 f182519e;

    public y0(com.tencent.mm.plugin.webview.luggage.jsapi.z0 z0Var, sd.b bVar) {
        this.f182519e = z0Var;
        this.f182518d = bVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != (this.f182519e.hashCode() & 65535)) {
            return;
        }
        sd.b bVar = this.f182518d;
        if (i18 == -1) {
            bVar.a();
            return;
        }
        if (i18 != 5) {
            bVar.c("cancel", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int intExtra = intent.getIntExtra("key_jsapi_pay_err_code", 0);
        java.lang.String stringExtra = intent.getStringExtra("key_jsapi_pay_err_msg");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        hashMap.put("err_code", java.lang.Integer.valueOf(intExtra));
        hashMap.put("err_desc", stringExtra);
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBrandWCPayRequest", "errCode: %d, errMsg: %s", java.lang.Integer.valueOf(intExtra), stringExtra);
        bVar.b("fail", hashMap);
    }
}

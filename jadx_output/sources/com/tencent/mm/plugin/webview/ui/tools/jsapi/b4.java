package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class b4 implements com.tencent.mm.plugin.webview.modeltools.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f184949c;

    public b4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f184949c = c1Var;
        this.f184947a = str;
        this.f184948b = y2Var;
    }

    @Override // com.tencent.mm.plugin.webview.modeltools.s
    public void a(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).equals(this.f184947a)) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("cardType", str);
            this.f184949c.i5(this.f184948b, "scanLicence:fail", hashMap);
        }
    }

    @Override // com.tencent.mm.plugin.webview.modeltools.s
    public void b(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).equals(this.f184947a)) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("cardType", str);
            this.f184949c.i5(this.f184948b, "scanLicence:cancel", hashMap);
        }
    }

    @Override // com.tencent.mm.plugin.webview.modeltools.s
    public void c(java.lang.String str, org.json.JSONObject jSONObject, android.graphics.Bitmap bitmap) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = this.f184947a;
        if (!str2.equalsIgnoreCase(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "msg.params.cardType = %s, callback type = %s, mismatch!!!", str3, str);
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "doScanLicence, type = %s, callback onSuccess but result is null", str);
            a(str);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("cardType", str);
            hashMap.put("cardInfo", jSONObject);
            this.f184949c.i5(this.f184948b, "scanLicence:ok", hashMap);
        }
    }
}

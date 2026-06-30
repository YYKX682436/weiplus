package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class u1 implements com.tencent.mm.plugin.webview.modeltools.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185426b;

    public u1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185426b = c1Var;
        this.f185425a = y2Var;
    }

    @Override // com.tencent.mm.plugin.webview.modeltools.s
    public void a(java.lang.String str) {
        int i17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K1;
        int i18 = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.M1;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185426b;
        c1Var.k5(i17, i18);
        c1Var.i5(this.f185425a, "chooseIdCard:fail", null);
    }

    @Override // com.tencent.mm.plugin.webview.modeltools.s
    public void b(java.lang.String str) {
        int i17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K1;
        int i18 = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.M1;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185426b;
        c1Var.k5(i17, i18);
        c1Var.i5(this.f185425a, "chooseIdCard:cancel", null);
    }

    @Override // com.tencent.mm.plugin.webview.modeltools.s
    public void c(java.lang.String str, org.json.JSONObject jSONObject, android.graphics.Bitmap bitmap) {
        nw4.y2 y2Var = this.f185425a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185426b;
        if (bitmap == null) {
            c1Var.i5(y2Var, "chooseIdCard:fail", null);
            return;
        }
        try {
            java.lang.String str2 = lp0.b.e() + "tmpScanLicense/";
            if (com.tencent.mm.vfs.w6.j(str2)) {
                com.tencent.mm.vfs.w6.f(str2);
            }
            com.tencent.mm.vfs.w6.u(str2);
            com.tencent.mm.vfs.w6.t(str2);
            java.lang.String str3 = str2 + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str3, true);
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(str3);
            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("sourceType", "scan");
            hashMap.put(dm.i4.COL_LOCALID, d17.f182736e);
            int i17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K1;
            c1Var.k5(i17, com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.O1);
            c1Var.k5(i17, com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.N1);
            c1Var.i5(y2Var, "chooseIdCard:ok", hashMap);
        } catch (java.lang.Exception e17) {
            c1Var.k5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K1, com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.M1);
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "save scan license error: %s", e17.getMessage());
            c1Var.i5(y2Var, "chooseIdCard:fail", null);
        }
    }
}

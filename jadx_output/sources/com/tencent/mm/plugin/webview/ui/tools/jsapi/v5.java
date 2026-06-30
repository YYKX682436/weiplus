package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class v5 implements com.tencent.mm.plugin.webview.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185472c;

    public v5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f185472c = c1Var;
        this.f185470a = str;
        this.f185471b = y2Var;
    }

    @Override // com.tencent.mm.plugin.webview.model.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doDownLoadImage, on cdn finish, is success : %b, local id : %s, media id is : %s", java.lang.Boolean.valueOf(z17), str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !str2.equals(this.f185470a)) {
            return;
        }
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185472c;
        android.app.ProgressDialog progressDialog = c1Var.f184979h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            c1Var.f184979h = null;
        }
        nw4.y2 y2Var = this.f185471b;
        if (!z17) {
            c1Var.i5(y2Var, "downloadImage:fail", null);
            return;
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str);
        if ((b17 instanceof com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) && com.tencent.mm.sdk.platformtools.t8.K0(b17.f182737f)) {
            ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) b17).f();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_LOCALID, str);
        c1Var.i5(y2Var, "downloadImage:ok", hashMap);
    }
}

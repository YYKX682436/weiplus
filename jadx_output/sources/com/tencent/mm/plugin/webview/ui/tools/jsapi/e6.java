package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class e6 implements com.tencent.mm.plugin.webview.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f185080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185081e;

    public e6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var, int i17) {
        this.f185081e = c1Var;
        this.f185077a = str;
        this.f185078b = str2;
        this.f185079c = y2Var;
        this.f185080d = i17;
    }

    @Override // com.tencent.mm.plugin.webview.model.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str5 = this.f185077a;
        sb6.append(str5);
        sb6.append(", on cdn finish,  is success : %s, mediaId : %s, local id is : %s, mediaUrl : %s");
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", sb6.toString(), java.lang.Boolean.valueOf(z17), str2, str, str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String str6 = this.f185078b;
        if (str.equals(str6)) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185081e;
            ((java.util.HashMap) c1Var.X).remove(str6);
            com.tencent.mm.plugin.webview.modeltools.z.bj().i(this);
            android.app.ProgressDialog progressDialog = c1Var.f184979h;
            if (progressDialog != null) {
                progressDialog.dismiss();
                c1Var.f184979h = null;
            }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.F3(c1Var);
            nw4.y2 y2Var = this.f185079c;
            if (!z17) {
                c1Var.i5(y2Var, str5 + ":fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str);
            if (this.f185080d != 8 || b17 == null || b17.f182746r == null) {
                hashMap.put("serverId", str2);
                hashMap.put("mediaUrl", str3);
            } else {
                hashMap.put("serverId", str2);
                hashMap.put("fileId", b17.f182746r.field_fileId);
                hashMap.put("aesKey", b17.f182746r.field_aesKey);
                hashMap.put("fileLength", java.lang.Integer.valueOf(b17.f182746r.field_fileLength));
                com.tencent.mm.plugin.webview.model.k4 k4Var = b17.f182746r;
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", str5 + "on cdn finish,  fileId : %s, aesKey is : %s, fileLength : %s", k4Var.field_fileId, k4Var.field_aesKey, java.lang.Integer.valueOf(k4Var.field_fileLength));
            }
            c1Var.i5(y2Var, str5 + ":ok", hashMap);
        }
    }
}

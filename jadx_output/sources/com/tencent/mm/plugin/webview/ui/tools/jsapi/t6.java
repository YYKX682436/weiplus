package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class t6 implements com.tencent.mm.plugin.webview.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185418b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185419c;

    public t6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f185419c = c1Var;
        this.f185417a = str;
        this.f185418b = y2Var;
    }

    @Override // com.tencent.mm.plugin.webview.model.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doUploadVoice, on cdn finish,  is success : %s, mediaid : %s, local id is : %s", java.lang.Boolean.valueOf(z17), str2, str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(this.f185417a)) {
            return;
        }
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185419c;
        android.app.ProgressDialog progressDialog = c1Var.f184979h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            c1Var.f184979h = null;
        }
        nw4.y2 y2Var = this.f185418b;
        if (!z17) {
            c1Var.i5(y2Var, "uploadVoice:fail", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("serverId", str2);
        c1Var.i5(y2Var, "uploadVoice:ok", hashMap);
    }
}

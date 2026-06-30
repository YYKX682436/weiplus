package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class a6 implements com.tencent.mm.plugin.webview.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184919c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f184920d;

    public a6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var) {
        this.f184920d = c1Var;
        this.f184917a = str;
        this.f184918b = str2;
        this.f184919c = y2Var;
    }

    @Override // com.tencent.mm.plugin.webview.model.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str5 = this.f184917a;
        sb6.append(str5);
        sb6.append(" on cdn finish,  is success : %s, mediaid : %s, local id is : %s, mediaUrl : %s");
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", sb6.toString(), java.lang.Boolean.valueOf(z17), str2, str, str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(this.f184918b)) {
            return;
        }
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f184920d;
        android.app.ProgressDialog progressDialog = c1Var.f184979h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            c1Var.f184979h = null;
        }
        nw4.y2 y2Var = this.f184919c;
        if (!z17) {
            c1Var.i5(y2Var, str5 + ":fail", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("serverId", str2);
        hashMap.put("mediaUrl", str3);
        c1Var.i5(y2Var, str5 + ":ok", hashMap);
    }
}

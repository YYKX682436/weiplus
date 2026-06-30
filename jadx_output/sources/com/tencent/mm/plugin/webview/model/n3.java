package com.tencent.mm.plugin.webview.model;

/* loaded from: classes15.dex */
public class n3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.SendAuth.Options f183043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.j3 f183044f;

    public n3(com.tencent.mm.plugin.webview.model.j3 j3Var, java.lang.String str, com.tencent.mm.opensdk.modelmsg.SendAuth.Options options) {
        this.f183044f = j3Var;
        this.f183042d = str;
        this.f183043e = options;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.model.j3 j3Var = this.f183044f;
        if (j3Var.f182965g) {
            return;
        }
        java.lang.String k17 = j3Var.k(j3Var.f182960b);
        if (com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOauthUtil", "dealWithError pkg nil");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealWithError:");
        java.lang.String str = this.f183042d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", sb6.toString());
        com.tencent.mm.opensdk.modelmsg.SendAuth.Resp resp = new com.tencent.mm.opensdk.modelmsg.SendAuth.Resp();
        resp.transaction = j3Var.f182962d;
        resp.errCode = -1;
        resp.errStr = str;
        resp.state = j3Var.f182963e;
        resp.lang = "zh_CN";
        resp.country = "";
        j3Var.h(k17, resp, this.f183043e);
    }
}

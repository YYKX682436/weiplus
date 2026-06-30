package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class f2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181832a;

    public f2(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f181832a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://openapi/openwebview/result?");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.opensdk.modelbiz.OpenWebview.Resp resp = new com.tencent.mm.opensdk.modelbiz.OpenWebview.Resp();
        android.net.Uri parse = android.net.Uri.parse(url);
        resp.result = parse.getQuery();
        resp.errCode = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("errCode"), 0);
        resp.errStr = parse.getQueryParameter("errMsg");
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f181832a;
        resp.transaction = e3Var.d0().getStringExtra("transaction_for_openapi_openwebview");
        java.lang.String queryParameter = parse.getQueryParameter("appid");
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
            com.tencent.mars.xlog.Log.e(e3Var.o1(), "SDKOpenWebViewResultHandler handleUrl, appId is null");
            return true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        resp.toBundle(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        try {
            args.targetPkgName = e3Var.e0().f3(queryParameter);
            args.bundle = bundle;
            args.flags = 268435456;
            e3Var.o1();
            com.tencent.mm.opensdk.channel.MMessageActV2.send(e3Var.Y(), args);
            e3Var.E0();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(e3Var.o1(), e17, "", new java.lang.Object[0]);
            return true;
        }
    }
}

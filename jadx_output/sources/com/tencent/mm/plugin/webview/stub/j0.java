package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class j0 implements com.tencent.mm.modelbase.e3 {
    public j0(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService) {
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "ServiceClick CGI return, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0) {
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "ServiceClick CGI fail, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return 0;
    }
}

package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class hd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.id f184813d;

    public hd(com.tencent.mm.plugin.webview.ui.tools.id idVar) {
        this.f184813d = idVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.id idVar = this.f184813d;
        if (idVar.f184841d) {
            int j17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(idVar.f184842e);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = 2;
            objArr[1] = idVar.f184842e;
            objArr[2] = java.lang.Integer.valueOf(idVar.f184847m.f185667r);
            objArr[3] = java.lang.Integer.valueOf(idVar.f184843f);
            objArr[4] = idVar.f184844g;
            objArr[5] = java.lang.Integer.valueOf(j17);
            objArr[6] = java.lang.Integer.valueOf(idVar.f184845h ? 3 : 2);
            objArr[7] = idVar.f184847m.e(idVar.f184846i);
            g0Var.d(23044, objArr);
        }
        if (idVar.f184841d && !idVar.f184845h) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("userName", idVar.f184842e);
            bundle.putString("exportId", idVar.f184844g);
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.ui.tools.kd.class, null);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = idVar.f184847m.f185654e;
        if (webViewUI != null) {
            webViewUI.f183849q2.i0("Contact_Scene", 154);
            idVar.f184847m.f185654e.V8(idVar.f184842e);
            nw4.n nVar = idVar.f184847m.f185654e.f183844p0;
            if (nVar != null && nVar.f340895i) {
                nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("topbar:click", null, nVar.f340903q, nVar.f340904r) + ")", null);
            }
            idVar.f184847m.f185658i.removeCallbacksAndMessages(null);
        }
    }
}

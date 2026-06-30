package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class uc extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.wc f186950a;

    public uc(com.tencent.mm.plugin.webview.ui.tools.wc wcVar, com.tencent.mm.plugin.webview.ui.tools.WebViewUI.AnonymousClass1 anonymousClass1) {
        this.f186950a = wcVar;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void c(com.tencent.xweb.WebView webView, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar = this.f186950a;
        wcVar.f187023d.f183804a3.a();
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = wcVar.f187023d;
        if (webViewUI.f183874y2 != null && com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            webViewUI.f183874y2.c0("rawUrl", str);
            com.tencent.mm.plugin.webview.ui.tools.floatball.w wVar = webViewUI.f183874y2;
            wVar.t().f93087g = str;
            wVar.g();
        }
        if (webViewUI.f183877z2 != null && com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            webViewUI.f183877z2.c0("rawUrl", str);
        }
        if (webViewUI.F2 != null && com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            webViewUI.F2.C.set(1, str);
        }
        webViewUI.d9(str);
        webViewUI.K8(webViewUI.t8());
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = webViewUI.f183849q2;
        if (c6Var != null) {
            java.lang.String str2 = wcVar.f181851a.I;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str) || str2.equals(str)) {
                return;
            }
            java.util.HashMap hashMap = (java.util.HashMap) c6Var.f184045b;
            android.util.SparseBooleanArray sparseBooleanArray = (android.util.SparseBooleanArray) hashMap.get(str2);
            if (sparseBooleanArray != null) {
                java.lang.String host = android.net.Uri.parse(str2).getHost();
                java.lang.String host2 = android.net.Uri.parse(str).getHost();
                if (com.tencent.mm.sdk.platformtools.t8.K0(host) || !host.equals(host2) || !com.tencent.mm.pluginsdk.ui.tools.h9.a(str2).equals(com.tencent.mm.pluginsdk.ui.tools.h9.a(str)) || hashMap.containsKey(str)) {
                    return;
                }
                android.util.SparseBooleanArray sparseBooleanArray2 = new android.util.SparseBooleanArray(sparseBooleanArray.size());
                for (int i17 = 0; i17 < sparseBooleanArray.size(); i17++) {
                    sparseBooleanArray2.put(sparseBooleanArray.keyAt(i17), sparseBooleanArray.valueAt(i17));
                }
                hashMap.put(str, sparseBooleanArray2);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "inheritMenuStateOnSpaNavigation: inherit menu state from [%s] to [%s]", str2, str);
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void f(com.tencent.xweb.WebView webView, java.lang.String str) {
        android.view.View j17;
        android.content.Intent intent;
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar = this.f186950a;
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = wcVar.f187023d.f183866w2;
        ldVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageCommitVisible, url:%s", str);
        ph0.i iVar = (ph0.i) i95.n0.c(ph0.i.class);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = ldVar.f185654e;
        ((nh0.i) iVar).getClass();
        java.lang.Integer valueOf = (webViewUI == null || (intent = webViewUI.getIntent()) == null) ? null : java.lang.Integer.valueOf(intent.getIntExtra("pay_report_scene", 0));
        if (valueOf != null && valueOf.intValue() == 1) {
            kotlin.jvm.internal.o.e(webViewUI, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            androidx.appcompat.app.b supportActionBar = webViewUI.getSupportActionBar();
            if (supportActionBar != null && (j17 = supportActionBar.j()) != null) {
                j17.findViewById(com.tencent.mm.R.id.f482482fq);
            }
        }
        ldVar.f185657h = str;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI.Y6(wcVar.f187023d, webView, str);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = wcVar.f187023d;
        webViewUI2.f183804a3.f(webViewUI2.x7());
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar = this.f186950a;
        com.tencent.mm.plugin.webview.ui.tools.floatball.w wVar = wcVar.f187023d.f183874y2;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = wcVar.f187023d;
        if (wVar != null && com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            webViewUI.f183874y2.c0("rawUrl", str);
            com.tencent.mm.plugin.webview.ui.tools.floatball.w wVar2 = webViewUI.f183874y2;
            wVar2.t().f93087g = str;
            wVar2.g();
        }
        if (webViewUI.f183877z2 != null && com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            webViewUI.f183877z2.c0("rawUrl", str);
        }
        if (webViewUI.F2 != null && com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            webViewUI.F2.C.set(1, str);
        }
        webViewUI.d9(str);
        if (!webViewUI.W1) {
            webViewUI.W1 = true;
            webViewUI.f183835m2.b().f183078a = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onPageFinished, old title = %s, new title = %s, fixedTitle = %b, showTitle = %b, loadUrl = %s", webViewUI.getMMTitle(), webViewUI.f183815f.getTitle(), java.lang.Boolean.valueOf(webViewUI.f183809d), java.lang.Boolean.valueOf(webViewUI.S), webViewUI.L1.f181964y);
        webViewUI.f183804a3.f(webViewUI.x7());
        webViewUI.setProgressBarIndeterminateVisibility(false);
        webViewUI.f183834m.a();
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = webViewUI.f183866w2;
        if (ldVar != null && !ldVar.f185650a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageFinished, url:%s", str);
            ldVar.f185657h = str;
        }
        com.tencent.mm.plugin.webview.core.x3 x3Var = com.tencent.mm.plugin.webview.core.x3.f182012a;
        if (!com.tencent.mm.sdk.platformtools.t8.D0(com.tencent.mm.pluginsdk.ui.tools.h9.a(str), com.tencent.mm.pluginsdk.ui.tools.h9.a(webViewUI.f183830k3))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onPageFinished  checkWeixinReady:" + str);
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI.Y6(webViewUI, webView, str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onPageFinished no need checkWeixinReady again:" + str);
        }
        webViewUI.x8(webView, str);
        by4.k kVar = webViewUI.f183841o2;
        if (kVar == null || !kVar.a()) {
            return;
        }
        webViewUI.f183841o2.f36400a = true;
        java.lang.String x76 = com.tencent.mm.sdk.platformtools.t8.K0(webViewUI.L1.f181964y) ? webViewUI.x7() : webViewUI.L1.f181964y;
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) webViewUI.f183841o2.f36404e).get(x76);
        java.lang.String X6 = com.tencent.mm.plugin.webview.ui.tools.WebViewUI.X6(webViewUI, webViewUI.f183815f.getTitle());
        if (str2 != null) {
            webViewUI.f183841o2.b(webViewUI, x76, webViewUI.F7(), str2);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(X6) || ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(x76)) {
                return;
            }
            webViewUI.f183841o2.b(webViewUI, x76, webViewUI.F7(), X6);
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar = this.f186950a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = wcVar.f187023d;
        if (!webViewUI.f183820g3) {
            webViewUI.f183849q2.y();
        }
        wcVar.f187023d.f183804a3.a();
        wcVar.f187023d.f183804a3.f(str);
        wcVar.f187023d.setProgressBarIndeterminateVisibility(false);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = wcVar.f187023d;
        webViewUI2.f183849q2.B(str, webViewUI2.getIntent());
        wcVar.f187023d.R8(true, false);
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = wcVar.f187023d.f183866w2;
        if (ldVar != null && !ldVar.f185650a) {
            ldVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageStart, url:%s", str);
            ldVar.f185657h = str;
            ldVar.l();
            ldVar.n();
        }
        wcVar.f187023d.G8(str);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI3 = wcVar.f187023d;
        webViewUI3.f183810d2 = 0;
        webViewUI3.C = false;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void i(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        this.f186950a.f187023d.f183849q2.G = false;
    }
}

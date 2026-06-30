package sf;

/* loaded from: classes7.dex */
public abstract class i {
    public static gg.c a(com.tencent.xweb.WebView webView, gg.d dVar, eg.c cVar, com.tencent.mm.plugin.appbrand.page.oa oaVar) {
        if (!(org.xwalk.core.XWalkEnvironment.o() && org.xwalk.core.XWalkEnvironment.d() >= 300)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, current version not support extend plugin");
            return null;
        }
        if (webView == null || !webView.isXWalkKernel()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, current webview is not xweb kernel");
        } else {
            android.view.KeyEvent.Callback webViewUI = webView.getWebViewUI();
            if ((webViewUI instanceof com.tencent.xweb.i2) && dVar != null) {
                com.tencent.xweb.i2 i2Var = (com.tencent.xweb.i2) webViewUI;
                gg.c createClientProxy = dVar.createClientProxy();
                sf.h hVar = new sf.h(i2Var);
                hVar.f406942a = createClientProxy;
                ((gg.a) createClientProxy).f271486c = hVar;
                i2Var.setExtendPluginClient(hVar);
                if (oaVar != null) {
                    hg.h hVar2 = new hg.h(i2Var);
                    hVar2.f281297a = oaVar;
                    i2Var.setExtendTextAreaClient(hVar2);
                    fg.b0 b0Var = new fg.b0(i2Var);
                    b0Var.f261727d = oaVar;
                    i2Var.setExtendInputClient(b0Var);
                }
                if (cVar != null) {
                    ((gg.a) createClientProxy).f271484a = cVar;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, set extend plugin client success");
                return createClientProxy;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, set extend plugin client fail");
        }
        return null;
    }

    public static void b(gg.c cVar, java.lang.String str, int i17) {
        if (cVar == null || ((gg.a) cVar).f271486c == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyPluginScreenshot, %s#%d", str, java.lang.Integer.valueOf(i17));
        ((gg.a) cVar).f271486c.takePluginScreenshot(str, i17);
    }

    public static void c(gg.c cVar, java.lang.String str, int i17, float f17, float f18) {
        if (cVar == null || ((gg.a) cVar).f271486c == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyPluginTextureScale, %s#%d, scale:[%s,%s]", str, java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        ((gg.a) cVar).f271486c.setPluginTextureScale(str, i17, f17, f18);
    }

    public static java.lang.String d(java.lang.String str, int i17) {
        return java.lang.String.format(java.util.Locale.US, "%s#%d", str, java.lang.Integer.valueOf(i17));
    }
}

package hv4;

/* loaded from: classes8.dex */
public final class f implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv4.l f285291d;

    public f(hv4.l lVar) {
        this.f285291d = lVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        hv4.l lVar = this.f285291d;
        hv4.n nVar = lVar.f285313n;
        if (nVar != null) {
            com.tencent.mars.xlog.Log.i(nVar.f285321g, "dismiss dialog");
            nVar.f285319e.f371627i = nVar.f285322h.getInEditTextQuery();
            nVar.f285320f.onDismiss();
            nVar.f285324m.e();
            com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = nVar.f285325n;
            webSearchWebView.removeJavascriptInterface("tagWebSearchJSApi");
            webSearchWebView.destroy();
        }
        hv4.o oVar = lVar.f285314o;
        if (oVar != null) {
            oVar.f285331i.e();
            com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView2 = oVar.f285332m;
            webSearchWebView2.removeJavascriptInterface("tagWebSearchJSApi");
            webSearchWebView2.destroy();
        }
    }
}

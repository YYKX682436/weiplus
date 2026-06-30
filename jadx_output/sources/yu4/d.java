package yu4;

/* loaded from: classes8.dex */
public final class d implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.k f465868d;

    public d(yu4.k kVar) {
        this.f465868d = kVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        yu4.n nVar = this.f465868d.f465886n;
        if (nVar != null) {
            java.lang.String str = nVar.f465898g;
            com.tencent.mars.xlog.Log.i(str, "onShow dialog");
            java.lang.String str2 = nVar.f465896e.f390118g;
            if (str2 != null) {
                android.net.Uri parse = android.net.Uri.parse(str2);
                cl0.g gVar = new cl0.g();
                for (java.lang.String str3 : parse.getQueryParameterNames()) {
                    gVar.h(str3, parse.getQueryParameter(str3));
                }
                com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = nVar.f465900i;
                java.lang.String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
                kotlin.jvm.internal.o.f(inEditTextQuery, "getInEditTextQuery(...)");
                if (inEditTextQuery.length() > 0) {
                    gVar.h("query", fTSEditTextView.getInEditTextQuery());
                }
                com.tencent.mars.xlog.Log.i(str, "onUiInit " + gVar);
                aw4.m0 m0Var = aw4.n0.f14901a;
                android.content.Context context = nVar.f465895d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                m0Var.c(context, 10);
                xu4.d dVar = nVar.f465901m;
                dVar.getClass();
                av4.j jVar = dVar.f14326a;
                if (jVar == null || (webView = jVar.getWebView()) == null) {
                    return;
                }
                java.lang.String gVar2 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onUiInit", gVar2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onUiInit", "onUiInit", gVar2}, 3));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(webView, format));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
        }
    }
}

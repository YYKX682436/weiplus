package su4;

/* loaded from: classes8.dex */
public class b3 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f412821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su4.e3 f412822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ su4.d3 f412823c;

    public b3(su4.d3 d3Var, com.tencent.mm.ui.widget.MMWebView mMWebView, su4.e3 e3Var) {
        this.f412823c = d3Var;
        this.f412821a = mMWebView;
        this.f412822b = e3Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        su4.d3 d3Var = this.f412823c;
        java.lang.String str = d3Var.f412858a;
        java.lang.String obj2 = this.f412821a.toString();
        int i17 = d3Var.f412859b;
        com.tencent.mars.xlog.Log.i(str, "loadJS, sys:attach_runOn3rd_apis callback %s,view %s preloadBiz:%d", (java.lang.String) obj, obj2, java.lang.Integer.valueOf(i17));
        long currentTimeMillis = java.lang.System.currentTimeMillis() - d3Var.f412862e;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15005, java.lang.Integer.valueOf(i17), 2, java.lang.Long.valueOf(currentTimeMillis), 2);
        java.util.LinkedList linkedList = (java.util.LinkedList) d3Var.f412861d;
        su4.e3 e3Var = this.f412822b;
        linkedList.add(e3Var);
        d3Var.f412860c.set(false);
        com.tencent.mars.xlog.Log.i(d3Var.f412858a, "preload webview done, cost: %s scene:%s coreType:%s", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(e3Var.f412877a), e3Var.f412878b.getCurrentInstanceWebCoreType());
    }
}

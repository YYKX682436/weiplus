package yd;

/* loaded from: classes7.dex */
public final class d0 extends pf1.q implements pf1.d {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f460936i;

    /* renamed from: m, reason: collision with root package name */
    public final yd.z f460937m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.content.MutableContextWrapper context, com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, yd.z provider) {
        super(context, runtime);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f460936i = runtime;
        this.f460937m = provider;
        provider.Pf(context);
        android.view.View view = provider.getView();
        if (view != null) {
            addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        provider.addJavascriptInterface(new pf1.h(this), "WeixinJSCore");
    }

    @Override // pf1.d
    public boolean a() {
        return false;
    }

    @Override // pf1.d
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        this.f460937m.addJavascriptInterface(obj, str);
    }

    @Override // pf1.q
    public void destroy() {
        this.f460937m.destroy();
    }

    @Override // pf1.d
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f460937m.jf(str);
    }

    public final yd.z getProvider() {
        return this.f460937m;
    }

    @Override // pf1.q, pf1.c
    public pf1.d getWebView() {
        return this;
    }

    @Override // pf1.d
    public void onHide() {
    }

    @Override // pf1.d
    public void onShow() {
    }
}

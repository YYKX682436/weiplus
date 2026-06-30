package fi1;

/* loaded from: classes.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge f262800e;

    public y(java.lang.String str, com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge openMaterialJsBridge) {
        this.f262799d = str;
        this.f262800e = openMaterialJsBridge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        java.lang.String format = java.lang.String.format("javascript:OpenMaterialJsApi['%s'] && OpenMaterialJsApi.%s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onWindowHeightChange", "onWindowHeightChange", this.f262799d}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        mMWebView = this.f262800e.webView;
        mMWebView.evaluateJavascript(format, fi1.x.f262798a);
    }
}

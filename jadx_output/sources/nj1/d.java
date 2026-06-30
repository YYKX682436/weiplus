package nj1;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f337812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f337813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f337814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f337815g;

    public d(kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f337812d = f0Var;
        this.f337813e = f0Var2;
        this.f337814f = h0Var;
        this.f337815g = h0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSkylineNativeViewSize width:");
        kotlin.jvm.internal.f0 f0Var = this.f337812d;
        sb6.append(f0Var.f310116d);
        sb6.append(" height:");
        kotlin.jvm.internal.f0 f0Var2 = this.f337813e;
        sb6.append(f0Var2.f310116d);
        sb6.append(" viewWrapper:");
        kotlin.jvm.internal.h0 h0Var = this.f337814f;
        sb6.append(h0Var.f310123d);
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", sb6.toString());
        java.lang.Object obj = h0Var.f310123d;
        if (obj == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SkylineNativeViewFactoryRichText", "updateSkylineNativeViewSize width:" + f0Var.f310116d + " height:" + f0Var2.f310116d + " fail, viewWrapper is null");
            return;
        }
        kotlin.jvm.internal.o.d(obj);
        android.view.ViewGroup.LayoutParams layoutParams = ((com.tencent.mm.plugin.appbrand.skyline.nativeview.l) obj).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = f0Var.f310116d;
            layoutParams.height = f0Var2.f310116d;
            java.lang.Object obj2 = h0Var.f310123d;
            kotlin.jvm.internal.o.d(obj2);
            ((com.tencent.mm.plugin.appbrand.skyline.nativeview.l) obj2).setLayoutParams(layoutParams);
        }
        wl1.h hVar = (wl1.h) this.f337815g.f310123d;
        com.tencent.mm.ui.widget.MMWebView mMWebView = hVar != null ? hVar.f447043c : null;
        android.view.ViewGroup.LayoutParams layoutParams2 = mMWebView != null ? mMWebView.getLayoutParams() : null;
        if (mMWebView == null || layoutParams2 == null) {
            return;
        }
        layoutParams2.width = f0Var.f310116d;
        layoutParams2.height = f0Var2.f310116d;
        mMWebView.setLayoutParams(layoutParams2);
    }
}

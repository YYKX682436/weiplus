package nj1;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f337809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f337810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337811f;

    public c(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, java.lang.String str) {
        this.f337809d = h0Var;
        this.f337810e = h0Var2;
        this.f337811f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wl1.h hVar = (wl1.h) this.f337809d.f310123d;
        if (hVar != null) {
            hVar.b();
        }
        kotlin.jvm.internal.h0 h0Var = this.f337810e;
        com.tencent.mm.plugin.appbrand.skyline.nativeview.l lVar = (com.tencent.mm.plugin.appbrand.skyline.nativeview.l) h0Var.f310123d;
        android.view.ViewParent parent = lVar != null ? lVar.getParent() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "removeWithParams params:" + this.f337811f + " parentView:" + parent);
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            return;
        }
        ((android.view.ViewGroup) parent).removeView((android.view.View) h0Var.f310123d);
    }
}

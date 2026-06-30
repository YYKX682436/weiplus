package nj1;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f337801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f337802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f337803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f337804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f337805h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337806i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337807m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sh1.f f337808n;

    public b(kotlin.jvm.internal.h0 h0Var, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, kotlin.jvm.internal.h0 h0Var2, android.view.View view, java.lang.String str, sh1.f fVar) {
        this.f337801d = h0Var;
        this.f337802e = surfaceTexture;
        this.f337803f = i17;
        this.f337804g = i18;
        this.f337805h = h0Var2;
        this.f337806i = view;
        this.f337807m = str;
        this.f337808n = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.graphics.SurfaceTexture surfaceTexture = this.f337802e;
        kotlin.jvm.internal.o.d(surfaceTexture);
        com.tencent.mm.plugin.appbrand.skyline.nativeview.l lVar = new com.tencent.mm.plugin.appbrand.skyline.nativeview.l(context, surfaceTexture);
        kotlin.jvm.internal.h0 h0Var = this.f337801d;
        h0Var.f310123d = lVar;
        java.lang.Object obj = h0Var.f310123d;
        kotlin.jvm.internal.o.d(obj);
        com.tencent.mm.plugin.appbrand.skyline.nativeview.l lVar2 = (com.tencent.mm.plugin.appbrand.skyline.nativeview.l) obj;
        int i17 = this.f337803f;
        lVar2.f88911h = i17;
        int i18 = this.f337804g;
        lVar2.f88912i = i18;
        android.graphics.SurfaceTexture surfaceTexture2 = lVar2.f88913m;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setDefaultBufferSize(i17, i18);
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        wl1.h hVar = new wl1.h(context2, new nj1.a(this.f337808n));
        kotlin.jvm.internal.h0 h0Var2 = this.f337805h;
        h0Var2.f310123d = hVar;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i18);
        java.lang.Object obj2 = h0Var.f310123d;
        kotlin.jvm.internal.o.d(obj2);
        ((com.tencent.mm.plugin.appbrand.skyline.nativeview.l) obj2).setLayoutParams(layoutParams);
        java.lang.Object obj3 = h0Var.f310123d;
        kotlin.jvm.internal.o.d(obj3);
        java.lang.Object obj4 = h0Var2.f310123d;
        kotlin.jvm.internal.o.d(obj4);
        com.tencent.mm.ui.widget.MMWebView mMWebView = ((wl1.h) obj4).f447043c;
        mMWebView.setImportantForAccessibility(4);
        mMWebView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
        ((com.tencent.mm.plugin.appbrand.skyline.nativeview.l) obj3).addView(mMWebView);
        android.view.View view = this.f337806i;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) view).addView((android.view.View) h0Var.f310123d);
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "create params:" + this.f337807m + " done");
    }
}

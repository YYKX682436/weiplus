package d00;

/* loaded from: classes7.dex */
public final class e implements d00.d {

    /* renamed from: a, reason: collision with root package name */
    public final l81.b1 f225254a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f225255b;

    public e(l81.b1 appOpenBundle, android.content.Context context) {
        kotlin.jvm.internal.o.g(appOpenBundle, "appOpenBundle");
        kotlin.jvm.internal.o.g(context, "context");
        this.f225254a = appOpenBundle;
        this.f225255b = context;
    }

    @Override // d00.d
    public java.lang.Object a(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        l81.b1 b1Var = this.f225254a;
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("RealStartAppBrandTask", "force pull , set appOpenBundle version is INT_MAX");
            b1Var.f317018d = Integer.MAX_VALUE;
            b1Var.N = true;
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f225255b, b1Var);
        return jz5.f0.f302826a;
    }
}

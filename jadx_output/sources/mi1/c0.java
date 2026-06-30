package mi1;

/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mi1.c0 f326525a = new mi1.c0();

    public final com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar a(com.tencent.mm.plugin.appbrand.o6 runtime, android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = runtime.u0().L1;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        k91.r m07 = runtime.m0();
        boolean z18 = false;
        boolean f17 = m07 != null ? m07.f() : false;
        boolean z19 = halfScreenConfig.f77361h;
        if (!z17 ? z19 || !f17 : z19 || halfScreenConfig.b() == k91.b1.f305541e) {
            z18 = true;
        }
        int ordinal = halfScreenConfig.D.ordinal();
        if (ordinal == 0) {
            return new com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandSingleCloseCapsuleBar(context, z18);
        }
        if (ordinal == 1) {
            return new com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandeEmbedSingleCloseCapsuleBar(context, z18);
        }
        throw new jz5.j();
    }
}

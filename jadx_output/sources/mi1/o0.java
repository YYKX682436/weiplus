package mi1;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mi1.o0 f326652a = new mi1.o0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f326653b = true;

    public final void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, java.lang.String str, yz5.a aVar) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        if (!f326653b) {
            com.tencent.mars.xlog.Log.w("Luggage.CapsuleAnimatorEventHelper", "showDefaultTips: isEnable = false");
            return;
        }
        mi1.m0 m0Var = runtime.f74821z.f326706e;
        java.lang.String n07 = runtime.n0();
        if (n07 == null) {
            n07 = "";
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.cr8, n07);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        mi1.z0 z0Var = mi1.z0.f326739e;
        m0Var.c(new mi1.j0(0, 0, 0, 3000L, 1, 0L, new mi1.r1(string, str, str, null, 1, false, n07.length(), null, be1.r0.CTRL_INDEX, null), 0, 7000L, aVar, 163, null));
    }

    public final void b(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, mi1.r1 config, int i17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(config, "config");
        if (f326653b) {
            runtime.f74821z.f326706e.c(new mi1.j0(0, 0, i17, 1500L, config.f326676e, 0L, config, 0, 7000L, aVar, 163, null));
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.CapsuleAnimatorEventHelper", "showTips: isEnable = false");
        }
    }
}

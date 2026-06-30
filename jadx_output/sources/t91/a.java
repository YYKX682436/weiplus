package t91;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final t91.a f416567a = new t91.a();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f416568b;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f416568b = z65.c.a();
    }

    public final void a(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i(tag, msg);
        if (f416568b) {
            com.tencent.mm.plugin.appbrand.debugger.console.n0.f77690a.b().logI(0L, null, null, null, 0, 0, 0L, 0L, tag + ": " + msg);
        }
    }

    public final void b(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.w(tag, msg);
        if (f416568b) {
            com.tencent.mm.plugin.appbrand.debugger.console.n0.f77690a.b().logW(0L, null, null, null, 0, 0, 0L, 0L, tag + ": " + msg);
        }
    }
}

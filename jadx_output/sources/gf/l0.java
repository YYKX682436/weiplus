package gf;

/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f271116b;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f271119e;

    /* renamed from: a, reason: collision with root package name */
    public static final gf.l0 f271115a = new gf.l0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f271117c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f271118d = new java.util.ArrayList();

    public static final void d(java.lang.Runnable runnable) {
        if (f271116b) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        synchronized (f271117c) {
            if (!f271116b) {
                f271118d.add(runnable);
            } else {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public final boolean a(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        kotlin.jvm.internal.o.d(iCommLibReader);
        return java.lang.Boolean.parseBoolean(iCommLibReader.qe("skyline"));
    }

    public final boolean b() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = df.h.f229472c;
        return o4Var.getInt("renderBackend", 0) == 1 || o4Var.getInt("renderBackend", 0) == 2;
    }

    public final void c(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "<this>");
        if (bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }
}

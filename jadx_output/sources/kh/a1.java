package kh;

/* loaded from: classes12.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kh.k1 f307746a;

    public a1(kh.k1 k1Var) {
        this.f307746a = k1Var;
    }

    public final java.lang.Object a() {
        java.lang.Object obj;
        f06.d a17 = kotlin.jvm.internal.i0.a(android.os.Looper.class);
        try {
            java.util.Iterator it = g06.f.b(a17).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((f06.s) obj).getName(), "sObserver")) {
                    break;
                }
            }
            kotlin.jvm.internal.o.d(obj);
            java.lang.reflect.Field a18 = h06.c.a((f06.v) obj);
            kotlin.jvm.internal.o.d(a18);
            a18.setAccessible(true);
            return a18.get(null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.LooperTaskMonitorFeatureKt", e17, "reflectLooperObserver failed", new java.lang.Object[0]);
            try {
                java.lang.reflect.Field declaredField = xz5.a.b(a17).getDeclaredField("sObserver");
                declaredField.setAccessible(true);
                return declaredField.get(null);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.LooperTaskMonitorFeatureKt", e18, "reflectLooperObserver2 failed", new java.lang.Object[0]);
                boolean z17 = kh.k1.f307838n;
                if (kh.k1.f307838n) {
                    ap.a.a(1, "errReflectLooper", e17, null, "reflectLooperObserver", e17.getMessage(), e18.getMessage());
                }
                return null;
            }
        }
    }
}

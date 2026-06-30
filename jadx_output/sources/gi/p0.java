package gi;

/* loaded from: classes12.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f272079a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f272080b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Runnable f272081c = gi.m0.f272070d;

    public static void a(boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("Matrix.battery.ThreadWatch", "removeCallStackSampling");
        android.os.Handler a17 = gi.k0.a();
        if (a17 != null) {
            a17.removeCallbacks(f272081c);
        }
        java.util.List list = f272080b;
        synchronized (list) {
            kz5.h0.B(list, new gi.o0(z17));
        }
    }
}

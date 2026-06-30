package yn1;

/* loaded from: classes11.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yn1.d0 f463635a = new yn1.d0();

    /* renamed from: b, reason: collision with root package name */
    public static yn1.c0 f463636b;

    public final synchronized void a() {
        java.lang.String str = "[initialize] scope = " + f463636b;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationCoroutineScope", str, null);
        if (f463636b == null) {
            f463636b = new yn1.c0(new kotlinx.coroutines.g2(((ku5.t0) ku5.t0.f312615d).o("MigrationCoroutinePool", 4, 4, new java.util.concurrent.LinkedBlockingQueue(128))), null, "MM.Mig.MigrationCoroutineScope", 2, null);
        }
    }

    public final synchronized void b() {
        java.lang.String str = "[unInitialize] scope = " + f463636b;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationCoroutineScope", str, null);
        yn1.c0 c0Var = f463636b;
        if (c0Var != null) {
            kotlinx.coroutines.z0.c(c0Var, null);
            kotlinx.coroutines.p0 p0Var = c0Var.f463620d;
            if (p0Var instanceof kotlinx.coroutines.f2) {
                ((kotlinx.coroutines.f2) p0Var).close();
            }
        }
        f463636b = null;
    }
}

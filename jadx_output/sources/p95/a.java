package p95;

/* loaded from: classes.dex */
public abstract class a {
    public static boolean a(java.lang.Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).g(runnable);
        return true;
    }

    public static boolean b(boolean z17, java.lang.Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        if (!z17) {
            return a(runnable);
        }
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
        return true;
    }
}

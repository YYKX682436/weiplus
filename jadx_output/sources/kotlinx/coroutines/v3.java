package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.v3 f310684a = new kotlinx.coroutines.v3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal f310685b = new java.lang.ThreadLocal();

    public final kotlinx.coroutines.w1 a() {
        java.lang.ThreadLocal threadLocal = f310685b;
        kotlinx.coroutines.w1 w1Var = (kotlinx.coroutines.w1) threadLocal.get();
        if (w1Var != null) {
            return w1Var;
        }
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(java.lang.Thread.currentThread());
        threadLocal.set(kVar);
        return kVar;
    }
}

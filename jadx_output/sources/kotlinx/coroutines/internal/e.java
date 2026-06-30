package kotlinx.coroutines.internal;

/* loaded from: classes13.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f310491a;

    static {
        java.lang.reflect.Method method;
        try {
            method = java.util.concurrent.ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused) {
            method = null;
        }
        f310491a = method;
    }
}

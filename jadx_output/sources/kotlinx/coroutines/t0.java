package kotlinx.coroutines;

/* loaded from: classes12.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f310677a = q26.h0.y(q26.y.a(kotlinx.coroutines.s0.a()));

    public static final void a(oz5.l lVar, java.lang.Throwable th6) {
        java.lang.Throwable runtimeException;
        java.util.Iterator it = f310677a.iterator();
        while (it.hasNext()) {
            try {
                ((kotlinx.coroutines.r0) it.next()).handleException(lVar, th6);
            } catch (java.lang.Throwable th7) {
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th6 == th7) {
                    runtimeException = th6;
                } else {
                    runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th7);
                    jz5.a.a(runtimeException, th6);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            jz5.a.a(th6, new kotlinx.coroutines.l1(lVar));
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th8) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th8));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th6);
    }
}

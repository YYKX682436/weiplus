package yb5;

/* loaded from: classes9.dex */
public abstract class n implements java.lang.Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ThreadLocal threadLocal = yb5.h.f460734a;
        java.lang.ThreadLocal threadLocal2 = yb5.h.f460734a;
        threadLocal2.set(java.lang.Boolean.TRUE);
        a();
        threadLocal2.set(java.lang.Boolean.FALSE);
    }
}

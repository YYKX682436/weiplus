package kotlinx.coroutines;

/* loaded from: classes12.dex */
public final class l1 extends java.lang.RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f310551d;

    public l1(oz5.l lVar) {
        this.f310551d = lVar;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public java.lang.String getLocalizedMessage() {
        return this.f310551d.toString();
    }
}

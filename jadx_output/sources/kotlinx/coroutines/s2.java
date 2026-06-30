package kotlinx.coroutines;

/* loaded from: classes13.dex */
public final class s2 extends java.util.concurrent.CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient kotlinx.coroutines.r2 f310581d;

    public s2(java.lang.String str, java.lang.Throwable th6, kotlinx.coroutines.r2 r2Var) {
        super(str);
        this.f310581d = r2Var;
        if (th6 != null) {
            initCause(th6);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof kotlinx.coroutines.s2) {
                kotlinx.coroutines.s2 s2Var = (kotlinx.coroutines.s2) obj;
                if (!kotlin.jvm.internal.o.b(s2Var.getMessage(), getMessage()) || !kotlin.jvm.internal.o.b(s2Var.f310581d, this.f310581d) || !kotlin.jvm.internal.o.b(s2Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        java.lang.String message = getMessage();
        kotlin.jvm.internal.o.d(message);
        int hashCode = ((message.hashCode() * 31) + this.f310581d.hashCode()) * 31;
        java.lang.Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return super.toString() + "; job=" + this.f310581d;
    }
}

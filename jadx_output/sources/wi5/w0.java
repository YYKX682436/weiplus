package wi5;

/* loaded from: classes.dex */
public final class w0 implements j75.e {

    /* renamed from: a, reason: collision with root package name */
    public final wi5.v0 f446357a;

    /* renamed from: b, reason: collision with root package name */
    public final wi5.u0 f446358b;

    public w0(wi5.v0 operation, wi5.u0 retCode) {
        kotlin.jvm.internal.o.g(operation, "operation");
        kotlin.jvm.internal.o.g(retCode, "retCode");
        this.f446357a = operation;
        this.f446358b = retCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.w0)) {
            return false;
        }
        wi5.w0 w0Var = (wi5.w0) obj;
        return this.f446357a == w0Var.f446357a && this.f446358b == w0Var.f446358b;
    }

    public int hashCode() {
        return (this.f446357a.hashCode() * 31) + this.f446358b.hashCode();
    }

    public java.lang.String toString() {
        return "SelectUserActionResult(operation=" + this.f446357a + ", retCode=" + this.f446358b + ')';
    }
}

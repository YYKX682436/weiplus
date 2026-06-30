package n35;

/* loaded from: classes7.dex */
public final class f extends java.io.IOException {

    /* renamed from: d, reason: collision with root package name */
    public final int f334807d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.IOException f334808e;

    public f(int i17, java.io.IOException iOException) {
        this.f334807d = i17;
        this.f334808e = iOException;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "UnknownConnectionError{httpStatusCode=" + this.f334807d + ", realException=" + this.f334808e + '}';
    }
}

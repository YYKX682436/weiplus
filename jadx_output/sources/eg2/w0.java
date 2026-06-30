package eg2;

/* loaded from: classes3.dex */
public final class w0 extends eg2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f252643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String localPath) {
        super(null);
        kotlin.jvm.internal.o.g(localPath, "localPath");
        this.f252643a = localPath;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg2.w0) && kotlin.jvm.internal.o.b(this.f252643a, ((eg2.w0) obj).f252643a);
    }

    public int hashCode() {
        return this.f252643a.hashCode();
    }

    public java.lang.String toString() {
        return "Success(localPath=" + this.f252643a + ')';
    }
}

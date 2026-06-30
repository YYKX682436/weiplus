package he1;

/* loaded from: classes15.dex */
public final class j extends he1.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f280884a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String data) {
        super(null);
        kotlin.jvm.internal.o.g(data, "data");
        this.f280884a = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he1.j) && kotlin.jvm.internal.o.b(this.f280884a, ((he1.j) obj).f280884a);
    }

    public int hashCode() {
        return this.f280884a.hashCode();
    }

    public java.lang.String toString() {
        return "Success(data=" + this.f280884a + ')';
    }
}

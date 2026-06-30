package o20;

/* loaded from: classes14.dex */
public final class k extends o20.t {

    /* renamed from: a, reason: collision with root package name */
    public final o20.d0 f342391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o20.d0 error) {
        super(null);
        kotlin.jvm.internal.o.g(error, "error");
        this.f342391a = error;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o20.k) && kotlin.jvm.internal.o.b(this.f342391a, ((o20.k) obj).f342391a);
    }

    public int hashCode() {
        return this.f342391a.hashCode();
    }

    public java.lang.String toString() {
        return "ERROR(error=" + this.f342391a + ')';
    }
}

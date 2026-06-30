package d82;

/* loaded from: classes11.dex */
public final class d extends d82.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f226925a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String compressedPath) {
        super(null);
        kotlin.jvm.internal.o.g(compressedPath, "compressedPath");
        this.f226925a = compressedPath;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d82.d) && kotlin.jvm.internal.o.b(this.f226925a, ((d82.d) obj).f226925a);
    }

    public int hashCode() {
        return this.f226925a.hashCode();
    }

    public java.lang.String toString() {
        return "Success(compressedPath=" + this.f226925a + ')';
    }
}

package wl2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f447045a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f447046b;

    public b(boolean z17, java.lang.String error) {
        kotlin.jvm.internal.o.g(error, "error");
        this.f447045a = z17;
        this.f447046b = error;
    }

    public final wl2.b a(wl2.b otherResult) {
        kotlin.jvm.internal.o.g(otherResult, "otherResult");
        return new wl2.b(this.f447045a && otherResult.f447045a, this.f447046b + '\n' + otherResult.f447046b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl2.b)) {
            return false;
        }
        wl2.b bVar = (wl2.b) obj;
        return this.f447045a == bVar.f447045a && kotlin.jvm.internal.o.b(this.f447046b, bVar.f447046b);
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f447045a) * 31) + this.f447046b.hashCode();
    }

    public java.lang.String toString() {
        return "Result(result=" + this.f447045a + ", error=" + this.f447046b + ')';
    }
}

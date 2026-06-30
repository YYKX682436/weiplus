package xo5;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.Closeable f455774a;

    /* renamed from: b, reason: collision with root package name */
    public final oz5.l f455775b;

    /* renamed from: c, reason: collision with root package name */
    public final int f455776c;

    public b(java.io.Closeable closable, oz5.l lVar, int i17) {
        kotlin.jvm.internal.o.g(closable, "closable");
        this.f455774a = closable;
        this.f455775b = lVar;
        this.f455776c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo5.b)) {
            return false;
        }
        xo5.b bVar = (xo5.b) obj;
        return kotlin.jvm.internal.o.b(this.f455774a, bVar.f455774a) && kotlin.jvm.internal.o.b(this.f455775b, bVar.f455775b) && this.f455776c == bVar.f455776c;
    }

    public int hashCode() {
        int hashCode = this.f455774a.hashCode() * 31;
        oz5.l lVar = this.f455775b;
        return ((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f455776c);
    }

    public java.lang.String toString() {
        return "ClosableInfo(closable=" + this.f455774a + ", coroutineContext=" + this.f455775b + ", stage=" + this.f455776c + ')';
    }
}

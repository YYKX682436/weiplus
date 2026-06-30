package gj3;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.Closeable f272383a;

    /* renamed from: b, reason: collision with root package name */
    public final oz5.l f272384b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272385c;

    public b(java.io.Closeable closable, oz5.l lVar, int i17) {
        kotlin.jvm.internal.o.g(closable, "closable");
        this.f272383a = closable;
        this.f272384b = lVar;
        this.f272385c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj3.b)) {
            return false;
        }
        gj3.b bVar = (gj3.b) obj;
        return kotlin.jvm.internal.o.b(this.f272383a, bVar.f272383a) && kotlin.jvm.internal.o.b(this.f272384b, bVar.f272384b) && this.f272385c == bVar.f272385c;
    }

    public int hashCode() {
        int hashCode = this.f272383a.hashCode() * 31;
        oz5.l lVar = this.f272384b;
        return ((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f272385c);
    }

    public java.lang.String toString() {
        return "ClosableInfo(closable=" + this.f272383a + ", coroutineContext=" + this.f272384b + ", stage=" + this.f272385c + ')';
    }
}

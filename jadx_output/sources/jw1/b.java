package jw1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.Closeable f302293a;

    /* renamed from: b, reason: collision with root package name */
    public final oz5.l f302294b;

    /* renamed from: c, reason: collision with root package name */
    public final int f302295c;

    public b(java.io.Closeable closable, oz5.l lVar, int i17) {
        kotlin.jvm.internal.o.g(closable, "closable");
        this.f302293a = closable;
        this.f302294b = lVar;
        this.f302295c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw1.b)) {
            return false;
        }
        jw1.b bVar = (jw1.b) obj;
        return kotlin.jvm.internal.o.b(this.f302293a, bVar.f302293a) && kotlin.jvm.internal.o.b(this.f302294b, bVar.f302294b) && this.f302295c == bVar.f302295c;
    }

    public int hashCode() {
        int hashCode = this.f302293a.hashCode() * 31;
        oz5.l lVar = this.f302294b;
        return ((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f302295c);
    }

    public java.lang.String toString() {
        return "ClosableInfo(closable=" + this.f302293a + ", coroutineContext=" + this.f302294b + ", stage=" + this.f302295c + ')';
    }
}

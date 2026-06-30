package y;

/* loaded from: classes14.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final z.e f458424a;

    /* renamed from: b, reason: collision with root package name */
    public long f458425b;

    public p1(z.e eVar, long j17, kotlin.jvm.internal.i iVar) {
        this.f458424a = eVar;
        this.f458425b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.p1)) {
            return false;
        }
        y.p1 p1Var = (y.p1) obj;
        return kotlin.jvm.internal.o.b(this.f458424a, p1Var.f458424a) && p2.q.a(this.f458425b, p1Var.f458425b);
    }

    public int hashCode() {
        return (this.f458424a.hashCode() * 31) + java.lang.Long.hashCode(this.f458425b);
    }

    public java.lang.String toString() {
        return "AnimData(anim=" + this.f458424a + ", startSize=" + ((java.lang.Object) p2.q.c(this.f458425b)) + ')';
    }
}

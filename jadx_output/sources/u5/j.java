package u5;

/* loaded from: classes14.dex */
public final class j extends u5.k {

    /* renamed from: a, reason: collision with root package name */
    public final h1.c f424710a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.q f424711b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h1.c painter, c6.q result) {
        super(null);
        kotlin.jvm.internal.o.g(painter, "painter");
        kotlin.jvm.internal.o.g(result, "result");
        this.f424710a = painter;
        this.f424711b = result;
    }

    @Override // u5.k
    public h1.c a() {
        return this.f424710a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5.j)) {
            return false;
        }
        u5.j jVar = (u5.j) obj;
        return kotlin.jvm.internal.o.b(this.f424710a, jVar.f424710a) && kotlin.jvm.internal.o.b(this.f424711b, jVar.f424711b);
    }

    public int hashCode() {
        return (this.f424710a.hashCode() * 31) + this.f424711b.hashCode();
    }

    public java.lang.String toString() {
        return "Success(painter=" + this.f424710a + ", result=" + this.f424711b + ')';
    }
}

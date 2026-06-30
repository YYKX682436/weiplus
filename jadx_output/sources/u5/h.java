package u5;

/* loaded from: classes14.dex */
public final class h extends u5.k {

    /* renamed from: a, reason: collision with root package name */
    public final h1.c f424707a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.f f424708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h1.c cVar, c6.f result) {
        super(null);
        kotlin.jvm.internal.o.g(result, "result");
        this.f424707a = cVar;
        this.f424708b = result;
    }

    @Override // u5.k
    public h1.c a() {
        return this.f424707a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5.h)) {
            return false;
        }
        u5.h hVar = (u5.h) obj;
        return kotlin.jvm.internal.o.b(this.f424707a, hVar.f424707a) && kotlin.jvm.internal.o.b(this.f424708b, hVar.f424708b);
    }

    public int hashCode() {
        h1.c cVar = this.f424707a;
        return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f424708b.hashCode();
    }

    public java.lang.String toString() {
        return "Error(painter=" + this.f424707a + ", result=" + this.f424708b + ')';
    }
}

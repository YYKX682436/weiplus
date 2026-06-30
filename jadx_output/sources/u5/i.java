package u5;

/* loaded from: classes14.dex */
public final class i extends u5.k {

    /* renamed from: a, reason: collision with root package name */
    public final h1.c f424709a;

    public i(h1.c cVar) {
        super(null);
        this.f424709a = cVar;
    }

    @Override // u5.k
    public h1.c a() {
        return this.f424709a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u5.i) {
            return kotlin.jvm.internal.o.b(this.f424709a, ((u5.i) obj).f424709a);
        }
        return false;
    }

    public int hashCode() {
        h1.c cVar = this.f424709a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public java.lang.String toString() {
        return "Loading(painter=" + this.f424709a + ')';
    }
}

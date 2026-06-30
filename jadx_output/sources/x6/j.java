package x6;

/* loaded from: classes13.dex */
public final class j implements x6.q {

    /* renamed from: a, reason: collision with root package name */
    public final x6.k f452154a;

    /* renamed from: b, reason: collision with root package name */
    public int f452155b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Class f452156c;

    public j(x6.k kVar) {
        this.f452154a = kVar;
    }

    @Override // x6.q
    public void a() {
        this.f452154a.c(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof x6.j)) {
            return false;
        }
        x6.j jVar = (x6.j) obj;
        return this.f452155b == jVar.f452155b && this.f452156c == jVar.f452156c;
    }

    public int hashCode() {
        int i17 = this.f452155b * 31;
        java.lang.Class cls = this.f452156c;
        return i17 + (cls != null ? cls.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Key{size=" + this.f452155b + "array=" + this.f452156c + '}';
    }
}

package w6;

/* loaded from: classes13.dex */
public final class h implements t6.h {

    /* renamed from: b, reason: collision with root package name */
    public final t6.h f443122b;

    /* renamed from: c, reason: collision with root package name */
    public final t6.h f443123c;

    public h(t6.h hVar, t6.h hVar2) {
        this.f443122b = hVar;
        this.f443123c = hVar2;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        this.f443122b.b(messageDigest);
        this.f443123c.b(messageDigest);
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof w6.h)) {
            return false;
        }
        w6.h hVar = (w6.h) obj;
        return this.f443122b.equals(hVar.f443122b) && this.f443123c.equals(hVar.f443123c);
    }

    @Override // t6.h
    public int hashCode() {
        return (this.f443122b.hashCode() * 31) + this.f443123c.hashCode();
    }

    public java.lang.String toString() {
        return "DataCacheKey{sourceKey=" + this.f443122b + ", signature=" + this.f443123c + '}';
    }
}

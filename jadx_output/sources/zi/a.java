package zi;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f473073a;

    /* renamed from: b, reason: collision with root package name */
    public final zi.b f473074b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f473075c;

    public a(int i17, zi.b bVar, java.lang.Object obj) {
        this.f473073a = i17;
        this.f473074b = bVar;
        this.f473075c = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi.a)) {
            return false;
        }
        zi.a aVar = (zi.a) obj;
        if (this.f473073a != aVar.f473073a || !this.f473074b.equals(aVar.f473074b)) {
            return false;
        }
        java.lang.Object obj2 = this.f473075c;
        java.lang.Object obj3 = aVar.f473075c;
        return (obj2 == null || obj2.equals(obj3)) && (obj3 == null || obj3.equals(obj2));
    }

    public int hashCode() {
        return (this.f473074b.hashCode() << 31) + this.f473073a;
    }
}

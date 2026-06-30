package p7;

/* loaded from: classes13.dex */
public final class b implements t6.h {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f352455b;

    public b(java.lang.Object obj) {
        q7.n.b(obj);
        this.f352455b = obj;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        messageDigest.update(this.f352455b.toString().getBytes(t6.h.f415967a));
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p7.b) {
            return this.f352455b.equals(((p7.b) obj).f352455b);
        }
        return false;
    }

    @Override // t6.h
    public int hashCode() {
        return this.f352455b.hashCode();
    }

    public java.lang.String toString() {
        return "ObjectKey{object=" + this.f352455b + '}';
    }
}

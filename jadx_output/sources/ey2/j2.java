package ey2;

/* loaded from: classes2.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f257408a;

    /* renamed from: b, reason: collision with root package name */
    public r45.lw0 f257409b = new r45.lw0();

    public j2(int i17) {
        this.f257408a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.j2) && this.f257408a == ((ey2.j2) obj).f257408a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f257408a);
    }

    public java.lang.String toString() {
        return "Cache(tabType=" + this.f257408a + ')';
    }
}

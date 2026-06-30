package xr0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f456173a;

    /* renamed from: b, reason: collision with root package name */
    public int f456174b;

    public j(int i17, int i18) {
        this.f456173a = i17;
        this.f456174b = i18;
    }

    public final float a() {
        return (this.f456174b * 1.0f) / this.f456173a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.j)) {
            return false;
        }
        xr0.j jVar = (xr0.j) obj;
        return this.f456173a == jVar.f456173a && this.f456174b == jVar.f456174b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f456173a) * 31) + java.lang.Integer.hashCode(this.f456174b);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f456173a);
        sb6.append('x');
        sb6.append(this.f456174b);
        return sb6.toString();
    }
}

package zr;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f475103a;

    /* renamed from: b, reason: collision with root package name */
    public final int f475104b;

    public a(int i17, int i18) {
        this.f475103a = i17;
        this.f475104b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr.a)) {
            return false;
        }
        zr.a aVar = (zr.a) obj;
        return this.f475103a == aVar.f475103a && this.f475104b == aVar.f475104b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f475103a) * 31) + java.lang.Integer.hashCode(this.f475104b);
    }

    public java.lang.String toString() {
        return "MainTabClickData(type=" + this.f475103a + ", unread=" + this.f475104b + ')';
    }
}

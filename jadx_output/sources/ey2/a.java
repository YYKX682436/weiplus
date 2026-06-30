package ey2;

/* loaded from: classes2.dex */
public final class a implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final int f257310d;

    /* renamed from: e, reason: collision with root package name */
    public final long f257311e;

    /* renamed from: f, reason: collision with root package name */
    public int f257312f;

    /* renamed from: g, reason: collision with root package name */
    public long f257313g;

    public a(int i17, long j17) {
        this.f257310d = i17;
        this.f257311e = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.a)) {
            return false;
        }
        ey2.a aVar = (ey2.a) obj;
        return this.f257310d == aVar.f257310d && this.f257311e == aVar.f257311e;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f257310d) * 31) + java.lang.Long.hashCode(this.f257311e);
    }

    public java.lang.String toString() {
        return "Item(scene=" + this.f257310d + ", feedId=" + this.f257311e + ')';
    }
}

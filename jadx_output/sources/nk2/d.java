package nk2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f337963a;

    /* renamed from: b, reason: collision with root package name */
    public final long f337964b;

    /* renamed from: c, reason: collision with root package name */
    public final float f337965c;

    public d(int i17, long j17, float f17) {
        this.f337963a = i17;
        this.f337964b = j17;
        this.f337965c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk2.d)) {
            return false;
        }
        nk2.d dVar = (nk2.d) obj;
        return this.f337963a == dVar.f337963a && this.f337964b == dVar.f337964b && java.lang.Float.compare(this.f337965c, dVar.f337965c) == 0;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f337963a) * 31) + java.lang.Long.hashCode(this.f337964b)) * 31) + java.lang.Float.hashCode(this.f337965c);
    }

    public java.lang.String toString() {
        return "FirstTimeBeforeData(getOperatorCount=" + this.f337963a + ", liveId=" + this.f337964b + ", pss=" + this.f337965c + ')';
    }
}

package ey2;

/* loaded from: classes2.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f257544a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f257545b;

    /* renamed from: c, reason: collision with root package name */
    public final float f257546c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f257547d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f257548e;

    /* renamed from: f, reason: collision with root package name */
    public float f257549f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f257550g;

    public u2(long j17, boolean z17, float f17) {
        this.f257544a = j17;
        this.f257545b = z17;
        this.f257546c = f17;
        this.f257548e = j17;
        this.f257549f = f17;
        this.f257550g = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.u2)) {
            return false;
        }
        ey2.u2 u2Var = (ey2.u2) obj;
        return this.f257544a == u2Var.f257544a && this.f257545b == u2Var.f257545b && java.lang.Float.compare(this.f257546c, u2Var.f257546c) == 0;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f257544a) * 31) + java.lang.Boolean.hashCode(this.f257545b)) * 31) + java.lang.Float.hashCode(this.f257546c);
    }

    public java.lang.String toString() {
        return "StartStateCache(pos=" + this.f257544a + ", isPauseOnStart=" + this.f257545b + ", speedRatio=" + this.f257546c + ')';
    }
}

package ey2;

/* loaded from: classes2.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f257478a;

    /* renamed from: b, reason: collision with root package name */
    public final int f257479b;

    /* renamed from: c, reason: collision with root package name */
    public int f257480c;

    /* renamed from: d, reason: collision with root package name */
    public long f257481d;

    /* renamed from: e, reason: collision with root package name */
    public long f257482e;

    /* renamed from: f, reason: collision with root package name */
    public float f257483f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public long f257484g = java.lang.System.currentTimeMillis();

    /* renamed from: h, reason: collision with root package name */
    public int f257485h = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f257486i;

    public q2(long j17, int i17) {
        this.f257478a = j17;
        this.f257479b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.q2)) {
            return false;
        }
        ey2.q2 q2Var = (ey2.q2) obj;
        return this.f257478a == q2Var.f257478a && this.f257479b == q2Var.f257479b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f257478a) * 31) + java.lang.Integer.hashCode(this.f257479b);
    }

    public java.lang.String toString() {
        return "Cache(feedId=" + this.f257478a + ", tabType=" + this.f257479b + ')';
    }
}

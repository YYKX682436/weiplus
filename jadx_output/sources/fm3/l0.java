package fm3;

/* loaded from: classes10.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f264088a;

    /* renamed from: b, reason: collision with root package name */
    public final long f264089b = c01.id.c();

    /* renamed from: c, reason: collision with root package name */
    public int f264090c;

    /* renamed from: d, reason: collision with root package name */
    public int f264091d;

    /* renamed from: e, reason: collision with root package name */
    public int f264092e;

    public l0(int i17) {
        this.f264088a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm3.l0) && this.f264088a == ((fm3.l0) obj).f264088a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f264088a);
    }

    public java.lang.String toString() {
        return "StatRecord(index=" + this.f264088a + ')';
    }
}

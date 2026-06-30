package ey2;

/* loaded from: classes2.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f257583a;

    /* renamed from: b, reason: collision with root package name */
    public long f257584b;

    /* renamed from: c, reason: collision with root package name */
    public long f257585c;

    /* renamed from: d, reason: collision with root package name */
    public long f257586d;

    public y2(int i17) {
        this.f257583a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.y2) && this.f257583a == ((ey2.y2) obj).f257583a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f257583a);
    }

    public java.lang.String toString() {
        return "LastPreloadTimeStampCache(liveTabId=" + this.f257583a + ')';
    }
}

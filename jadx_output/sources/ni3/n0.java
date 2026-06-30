package ni3;

/* loaded from: classes10.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f337638a;

    /* renamed from: b, reason: collision with root package name */
    public long f337639b;

    /* renamed from: c, reason: collision with root package name */
    public long f337640c;

    /* renamed from: d, reason: collision with root package name */
    public int f337641d;

    public n0(int i17, long j17, long j18, int i18) {
        this.f337638a = i17;
        this.f337639b = j17;
        this.f337640c = j18;
        this.f337641d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.n0)) {
            return false;
        }
        ni3.n0 n0Var = (ni3.n0) obj;
        return this.f337638a == n0Var.f337638a && this.f337639b == n0Var.f337639b && this.f337640c == n0Var.f337640c && this.f337641d == n0Var.f337641d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f337638a) * 31) + java.lang.Long.hashCode(this.f337639b)) * 31) + java.lang.Long.hashCode(this.f337640c)) * 31) + java.lang.Integer.hashCode(this.f337641d);
    }

    public java.lang.String toString() {
        return "CgiActionInfo(tabType=" + this.f337638a + ", startTimeMs=" + this.f337639b + ", endTimeMs=" + this.f337640c + ", respItemSize=" + this.f337641d + ')';
    }
}

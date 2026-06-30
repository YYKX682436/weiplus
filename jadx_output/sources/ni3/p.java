package ni3;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f337666a;

    /* renamed from: b, reason: collision with root package name */
    public long f337667b;

    /* renamed from: c, reason: collision with root package name */
    public long f337668c;

    /* renamed from: d, reason: collision with root package name */
    public int f337669d;

    public p(int i17, long j17, long j18, int i18) {
        this.f337666a = i17;
        this.f337667b = j17;
        this.f337668c = j18;
        this.f337669d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.p)) {
            return false;
        }
        ni3.p pVar = (ni3.p) obj;
        return this.f337666a == pVar.f337666a && this.f337667b == pVar.f337667b && this.f337668c == pVar.f337668c && this.f337669d == pVar.f337669d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f337666a) * 31) + java.lang.Long.hashCode(this.f337667b)) * 31) + java.lang.Long.hashCode(this.f337668c)) * 31) + java.lang.Integer.hashCode(this.f337669d);
    }

    public java.lang.String toString() {
        return "CgiActionInfo(tabType=" + this.f337666a + ", startTimeMs=" + this.f337667b + ", endTimeMs=" + this.f337668c + ", respItemSize=" + this.f337669d + ')';
    }
}

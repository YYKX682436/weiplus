package sf4;

/* loaded from: classes4.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f407556a;

    /* renamed from: b, reason: collision with root package name */
    public final long f407557b;

    /* renamed from: c, reason: collision with root package name */
    public final long f407558c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f407559d;

    public p1(boolean z17, long j17, long j18, boolean z18) {
        this.f407556a = z17;
        this.f407557b = j17;
        this.f407558c = j18;
        this.f407559d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf4.p1)) {
            return false;
        }
        sf4.p1 p1Var = (sf4.p1) obj;
        return this.f407556a == p1Var.f407556a && this.f407557b == p1Var.f407557b && this.f407558c == p1Var.f407558c && this.f407559d == p1Var.f407559d;
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f407556a) * 31) + java.lang.Long.hashCode(this.f407557b)) * 31) + java.lang.Long.hashCode(this.f407558c)) * 31) + java.lang.Boolean.hashCode(this.f407559d);
    }

    public java.lang.String toString() {
        return "MoovReadyInfo(isMoovReady=" + this.f407556a + ", offset=" + this.f407557b + ", length=" + this.f407558c + ", preloadFinish=" + this.f407559d + ')';
    }
}

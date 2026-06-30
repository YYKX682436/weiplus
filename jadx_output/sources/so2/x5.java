package so2;

/* loaded from: classes2.dex */
public final class x5 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f410699d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f410700e;

    /* renamed from: f, reason: collision with root package name */
    public final long f410701f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ni4 f410702g;

    public x5(long j17, boolean z17, long j18, r45.ni4 ni4Var, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        j18 = (i17 & 4) != 0 ? c01.id.c() : j18;
        ni4Var = (i17 & 8) != 0 ? null : ni4Var;
        this.f410699d = j17;
        this.f410700e = z17;
        this.f410701f = j18;
        this.f410702g = ni4Var;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        so2.x5 other = (so2.x5) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return (int) (other.f410701f - this.f410701f);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.x5)) {
            return false;
        }
        so2.x5 x5Var = (so2.x5) obj;
        return this.f410699d == x5Var.f410699d && this.f410700e == x5Var.f410700e && this.f410701f == x5Var.f410701f && kotlin.jvm.internal.o.b(this.f410702g, x5Var.f410702g);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Long.hashCode(this.f410699d) * 31) + java.lang.Boolean.hashCode(this.f410700e)) * 31) + java.lang.Long.hashCode(this.f410701f)) * 31;
        r45.ni4 ni4Var = this.f410702g;
        return hashCode + (ni4Var == null ? 0 : ni4Var.hashCode());
    }

    public java.lang.String toString() {
        return "StreamMarkReadStat(feedId=" + this.f410699d + ", isRead=" + this.f410700e + ", timestamp=" + this.f410701f + ", stat=" + this.f410702g + ')';
    }
}

package km2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f309111a;

    public j(long j17) {
        this.f309111a = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof km2.j) && this.f309111a == ((km2.j) obj).f309111a;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f309111a);
    }

    public java.lang.String toString() {
        return "FinderLiveBalanceData(wecoinBalance=" + this.f309111a + ')';
    }
}

package qk;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f364315a;

    /* renamed from: b, reason: collision with root package name */
    public final long f364316b;

    /* renamed from: c, reason: collision with root package name */
    public final long f364317c;

    public q(long j17, long j18, long j19, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 300000L : j17;
        j18 = (i17 & 2) != 0 ? 3000L : j18;
        j19 = (i17 & 4) != 0 ? 1000L : j19;
        this.f364315a = j17;
        this.f364316b = j18;
        this.f364317c = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk.q)) {
            return false;
        }
        qk.q qVar = (qk.q) obj;
        return this.f364315a == qVar.f364315a && this.f364316b == qVar.f364316b && this.f364317c == qVar.f364317c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f364315a) * 31) + java.lang.Long.hashCode(this.f364316b)) * 31) + java.lang.Long.hashCode(this.f364317c);
    }

    public java.lang.String toString() {
        return "DelayReleaseConfig(inactiveDelayMs=" + this.f364315a + ", backgroundDelayMs=" + this.f364316b + ", deepBackgroundDelayMs=" + this.f364317c + ')';
    }
}

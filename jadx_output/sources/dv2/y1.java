package dv2;

/* loaded from: classes2.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f243977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f243978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f243979c;

    /* renamed from: d, reason: collision with root package name */
    public final int f243980d;

    /* renamed from: e, reason: collision with root package name */
    public final long f243981e;

    public y1(long j17, int i17, int i18, int i19, long j18, int i27, kotlin.jvm.internal.i iVar) {
        j18 = (i27 & 16) != 0 ? c01.id.a() : j18;
        this.f243977a = j17;
        this.f243978b = i17;
        this.f243979c = i18;
        this.f243980d = i19;
        this.f243981e = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv2.y1)) {
            return false;
        }
        dv2.y1 y1Var = (dv2.y1) obj;
        return this.f243977a == y1Var.f243977a && this.f243978b == y1Var.f243978b && this.f243979c == y1Var.f243979c && this.f243980d == y1Var.f243980d && this.f243981e == y1Var.f243981e;
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.f243977a) * 31) + java.lang.Integer.hashCode(this.f243978b)) * 31) + java.lang.Integer.hashCode(this.f243979c)) * 31) + java.lang.Integer.hashCode(this.f243980d)) * 31) + java.lang.Long.hashCode(this.f243981e);
    }

    public java.lang.String toString() {
        return "WatchListItem(feedId=" + this.f243977a + ", progress=" + this.f243978b + ", commentScene=" + this.f243979c + ", scene=" + this.f243980d + ", lastWatchTime=" + this.f243981e + ')';
    }
}

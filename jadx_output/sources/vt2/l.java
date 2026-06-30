package vt2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f439975a;

    /* renamed from: b, reason: collision with root package name */
    public int f439976b;

    /* renamed from: c, reason: collision with root package name */
    public long f439977c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f439978d;

    public l(long j17, int i17, long j18, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? 1 : i17;
        j18 = (i18 & 4) != 0 ? java.lang.System.currentTimeMillis() : j18;
        z17 = (i18 & 8) != 0 ? false : z17;
        this.f439975a = j17;
        this.f439976b = i17;
        this.f439977c = j18;
        this.f439978d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt2.l)) {
            return false;
        }
        vt2.l lVar = (vt2.l) obj;
        return this.f439975a == lVar.f439975a && this.f439976b == lVar.f439976b && this.f439977c == lVar.f439977c && this.f439978d == lVar.f439978d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f439975a) * 31) + java.lang.Integer.hashCode(this.f439976b)) * 31) + java.lang.Long.hashCode(this.f439977c)) * 31) + java.lang.Boolean.hashCode(this.f439978d);
    }

    public java.lang.String toString() {
        return "RefreshNote(productId=" + this.f439975a + ", refreshTimes=" + this.f439976b + ", lastRefreshTime=" + this.f439977c + ", refreshing=" + this.f439978d + ')';
    }
}

package vf3;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f436365a;

    /* renamed from: b, reason: collision with root package name */
    public final long f436366b;

    /* renamed from: c, reason: collision with root package name */
    public final long f436367c;

    /* renamed from: d, reason: collision with root package name */
    public final long f436368d;

    /* renamed from: e, reason: collision with root package name */
    public final long f436369e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f436370f;

    public b(long j17, long j18, long j19, long j27, long j28, boolean z17) {
        this.f436365a = j17;
        this.f436366b = j18;
        this.f436367c = j19;
        this.f436368d = j27;
        this.f436369e = j28;
        this.f436370f = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf3.b)) {
            return false;
        }
        vf3.b bVar = (vf3.b) obj;
        return this.f436365a == bVar.f436365a && this.f436366b == bVar.f436366b && this.f436367c == bVar.f436367c && this.f436368d == bVar.f436368d && this.f436369e == bVar.f436369e && this.f436370f == bVar.f436370f;
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.f436365a) * 31) + java.lang.Long.hashCode(this.f436366b)) * 31) + java.lang.Long.hashCode(this.f436367c)) * 31) + java.lang.Long.hashCode(this.f436368d)) * 31) + java.lang.Long.hashCode(this.f436369e)) * 31) + java.lang.Boolean.hashCode(this.f436370f);
    }

    public java.lang.String toString() {
        return "LiveCDNInfo(imageFileLen=" + this.f436365a + ", imageHDFileLen=" + this.f436366b + ", videoFileLen=" + this.f436367c + ", videoHDFileLen=" + this.f436368d + ", coverTimeStamp=" + this.f436369e + ", isHDExpired=" + this.f436370f + ')';
    }

    public /* synthetic */ b(long j17, long j18, long j19, long j27, long j28, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? 0L : j17, (i17 & 2) != 0 ? 0L : j18, (i17 & 4) != 0 ? 0L : j19, (i17 & 8) != 0 ? 0L : j27, (i17 & 16) == 0 ? j28 : 0L, (i17 & 32) != 0 ? false : z17);
    }
}

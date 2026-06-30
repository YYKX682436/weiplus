package f65;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public long f259963a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f259964b;

    /* renamed from: c, reason: collision with root package name */
    public long f259965c;

    /* renamed from: d, reason: collision with root package name */
    public long f259966d;

    /* renamed from: e, reason: collision with root package name */
    public long f259967e;

    /* renamed from: f, reason: collision with root package name */
    public long f259968f;

    /* renamed from: g, reason: collision with root package name */
    public long f259969g;

    /* renamed from: h, reason: collision with root package name */
    public long f259970h;

    /* renamed from: i, reason: collision with root package name */
    public long f259971i;

    /* renamed from: j, reason: collision with root package name */
    public int f259972j;

    /* renamed from: k, reason: collision with root package name */
    public int f259973k;

    public s(long j17, java.lang.String str, long j18, long j19, long j27, long j28, long j29, long j37, long j38, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        long j39 = (i19 & 1) != 0 ? 0L : j17;
        java.lang.String fromUser = (i19 & 2) != 0 ? "" : str;
        long j47 = (i19 & 4) != 0 ? 0L : j18;
        long j48 = (i19 & 8) != 0 ? 0L : j19;
        long j49 = (i19 & 16) != 0 ? 0L : j27;
        long j57 = (i19 & 32) != 0 ? 0L : j28;
        long j58 = (i19 & 64) != 0 ? 0L : j29;
        long j59 = (i19 & 128) != 0 ? 0L : j37;
        long j66 = (i19 & 256) != 0 ? 0L : j38;
        int i27 = (i19 & 512) != 0 ? 0 : i17;
        int i28 = (i19 & 1024) != 0 ? 0 : i18;
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        this.f259963a = j39;
        this.f259964b = fromUser;
        this.f259965c = j47;
        this.f259966d = j48;
        this.f259967e = j49;
        this.f259968f = j57;
        this.f259969g = j58;
        this.f259970h = j59;
        this.f259971i = j66;
        this.f259972j = i27;
        this.f259973k = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f65.s)) {
            return false;
        }
        f65.s sVar = (f65.s) obj;
        return this.f259963a == sVar.f259963a && kotlin.jvm.internal.o.b(this.f259964b, sVar.f259964b) && this.f259965c == sVar.f259965c && this.f259966d == sVar.f259966d && this.f259967e == sVar.f259967e && this.f259968f == sVar.f259968f && this.f259969g == sVar.f259969g && this.f259970h == sVar.f259970h && this.f259971i == sVar.f259971i && this.f259972j == sVar.f259972j && this.f259973k == sVar.f259973k;
    }

    public int hashCode() {
        return (((((((((((((((((((java.lang.Long.hashCode(this.f259963a) * 31) + this.f259964b.hashCode()) * 31) + java.lang.Long.hashCode(this.f259965c)) * 31) + java.lang.Long.hashCode(this.f259966d)) * 31) + java.lang.Long.hashCode(this.f259967e)) * 31) + java.lang.Long.hashCode(this.f259968f)) * 31) + java.lang.Long.hashCode(this.f259969g)) * 31) + java.lang.Long.hashCode(this.f259970h)) * 31) + java.lang.Long.hashCode(this.f259971i)) * 31) + java.lang.Integer.hashCode(this.f259972j)) * 31) + java.lang.Integer.hashCode(this.f259973k);
    }

    public java.lang.String toString() {
        return "VideoMsgPreloadData(msgSvrId=" + this.f259963a + ", fromUser=" + this.f259964b + ", cdnUrlSize=" + this.f259965c + ", cdnUrlPri=" + this.f259966d + ", cdnUrlPd=" + this.f259967e + ", cdnRawUrlSize=" + this.f259968f + ", cdnRawUrlPri=" + this.f259969g + ", cdnRawUrlPd=" + this.f259970h + ", createTime=" + this.f259971i + ", preloadStatus=" + this.f259972j + ", resourceStatus=" + this.f259973k + ')';
    }
}

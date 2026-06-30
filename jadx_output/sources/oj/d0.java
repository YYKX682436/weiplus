package oj;

/* loaded from: classes12.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f345688a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f345689b;

    /* renamed from: c, reason: collision with root package name */
    public long f345690c;

    /* renamed from: d, reason: collision with root package name */
    public long f345691d;

    /* renamed from: e, reason: collision with root package name */
    public long f345692e;

    /* renamed from: f, reason: collision with root package name */
    public long f345693f;

    /* renamed from: g, reason: collision with root package name */
    public long f345694g;

    /* renamed from: h, reason: collision with root package name */
    public long f345695h;

    /* renamed from: i, reason: collision with root package name */
    public long f345696i;

    /* renamed from: j, reason: collision with root package name */
    public long f345697j;

    /* renamed from: k, reason: collision with root package name */
    public long f345698k;

    public d0(java.lang.String str, java.lang.String str2, long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, int i17, kotlin.jvm.internal.i iVar) {
        java.lang.String str3 = (i17 & 1) != 0 ? null : str;
        java.lang.String str4 = (i17 & 2) == 0 ? str2 : null;
        long j47 = (i17 & 4) != 0 ? 0L : j17;
        long j48 = (i17 & 8) != 0 ? 0L : j18;
        long j49 = (i17 & 16) != 0 ? 0L : j19;
        long j57 = (i17 & 32) != 0 ? 0L : j27;
        long j58 = (i17 & 64) != 0 ? 0L : j28;
        long j59 = (i17 & 128) != 0 ? 0L : j29;
        long j66 = (i17 & 256) != 0 ? 0L : j37;
        long j67 = (i17 & 512) != 0 ? 0L : j38;
        long j68 = (i17 & 1024) != 0 ? 0L : j39;
        this.f345688a = str3;
        this.f345689b = str4;
        this.f345690c = j47;
        this.f345691d = j48;
        this.f345692e = j49;
        this.f345693f = j57;
        this.f345694g = j58;
        this.f345695h = j59;
        this.f345696i = j66;
        this.f345697j = j67;
        this.f345698k = j68;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj.d0)) {
            return false;
        }
        oj.d0 d0Var = (oj.d0) obj;
        return kotlin.jvm.internal.o.b(this.f345688a, d0Var.f345688a) && kotlin.jvm.internal.o.b(this.f345689b, d0Var.f345689b) && this.f345690c == d0Var.f345690c && this.f345691d == d0Var.f345691d && this.f345692e == d0Var.f345692e && this.f345693f == d0Var.f345693f && this.f345694g == d0Var.f345694g && this.f345695h == d0Var.f345695h && this.f345696i == d0Var.f345696i && this.f345697j == d0Var.f345697j && this.f345698k == d0Var.f345698k;
    }

    public int hashCode() {
        java.lang.String str = this.f345688a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.f345689b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j17 = this.f345690c;
        int i17 = (hashCode2 + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        long j18 = this.f345691d;
        int i18 = (i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f345692e;
        int i19 = (i18 + ((int) (j19 ^ (j19 >>> 32)))) * 31;
        long j27 = this.f345693f;
        int i27 = (i19 + ((int) (j27 ^ (j27 >>> 32)))) * 31;
        long j28 = this.f345694g;
        int i28 = (i27 + ((int) (j28 ^ (j28 >>> 32)))) * 31;
        long j29 = this.f345695h;
        int i29 = (i28 + ((int) (j29 ^ (j29 >>> 32)))) * 31;
        long j37 = this.f345696i;
        int i37 = (i29 + ((int) (j37 ^ (j37 >>> 32)))) * 31;
        long j38 = this.f345697j;
        int i38 = (i37 + ((int) (j38 ^ (j38 >>> 32)))) * 31;
        long j39 = this.f345698k;
        return i38 + ((int) (j39 ^ (j39 >>> 32)));
    }

    public java.lang.String toString() {
        return "SmapsItem(name=" + this.f345688a + ", permission=" + this.f345689b + ", count=" + this.f345690c + ", vmSize=" + this.f345691d + ", rss=" + this.f345692e + ", pss=" + this.f345693f + ", sharedClean=" + this.f345694g + ", sharedDirty=" + this.f345695h + ", privateClean=" + this.f345696i + ", privateDirty=" + this.f345697j + ", swapPss=" + this.f345698k + ")";
    }
}

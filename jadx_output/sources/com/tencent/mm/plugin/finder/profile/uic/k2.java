package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f123870a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123871b;

    /* renamed from: c, reason: collision with root package name */
    public final int f123872c;

    /* renamed from: d, reason: collision with root package name */
    public long f123873d;

    /* renamed from: e, reason: collision with root package name */
    public long f123874e;

    /* renamed from: f, reason: collision with root package name */
    public long f123875f;

    /* renamed from: g, reason: collision with root package name */
    public long f123876g;

    /* renamed from: h, reason: collision with root package name */
    public long f123877h;

    /* renamed from: i, reason: collision with root package name */
    public long f123878i;

    /* renamed from: j, reason: collision with root package name */
    public int f123879j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Integer f123880k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Integer f123881l;

    /* renamed from: m, reason: collision with root package name */
    public int f123882m;

    /* renamed from: n, reason: collision with root package name */
    public final long f123883n;

    /* renamed from: o, reason: collision with root package name */
    public long f123884o;

    public k2(int i17, int i18, int i19, long j17, long j18, long j19, long j27, long j28, long j29, int i27, java.lang.Integer num, java.lang.Integer num2, int i28, long j37, long j38, int i29, kotlin.jvm.internal.i iVar) {
        long j39 = (i29 & 8) != 0 ? 0L : j17;
        long j47 = (i29 & 16) != 0 ? 0L : j18;
        long j48 = (i29 & 32) != 0 ? 0L : j19;
        long j49 = (i29 & 64) != 0 ? 0L : j27;
        long j57 = (i29 & 128) != 0 ? 0L : j28;
        long j58 = (i29 & 256) != 0 ? 0L : j29;
        int i37 = (i29 & 512) != 0 ? 0 : i27;
        java.lang.Integer num3 = (i29 & 1024) != 0 ? null : num;
        java.lang.Integer num4 = (i29 & 2048) != 0 ? null : num2;
        int i38 = (i29 & 4096) != 0 ? 0 : i28;
        long c17 = (i29 & 8192) != 0 ? c01.id.c() : j37;
        long j59 = (i29 & 16384) != 0 ? 0L : j38;
        this.f123870a = i17;
        this.f123871b = i18;
        this.f123872c = i19;
        this.f123873d = j39;
        this.f123874e = j47;
        this.f123875f = j48;
        this.f123876g = j49;
        this.f123877h = j57;
        this.f123878i = j58;
        this.f123879j = i37;
        this.f123880k = num3;
        this.f123881l = num4;
        this.f123882m = i38;
        this.f123883n = c17;
        this.f123884o = j59;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.profile.uic.k2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.profile.uic.k2 k2Var = (com.tencent.mm.plugin.finder.profile.uic.k2) obj;
        return this.f123870a == k2Var.f123870a && this.f123871b == k2Var.f123871b && this.f123872c == k2Var.f123872c && this.f123873d == k2Var.f123873d && this.f123874e == k2Var.f123874e && this.f123875f == k2Var.f123875f && this.f123876g == k2Var.f123876g && this.f123877h == k2Var.f123877h && this.f123878i == k2Var.f123878i && this.f123879j == k2Var.f123879j && kotlin.jvm.internal.o.b(this.f123880k, k2Var.f123880k) && kotlin.jvm.internal.o.b(this.f123881l, k2Var.f123881l) && this.f123882m == k2Var.f123882m && this.f123883n == k2Var.f123883n && this.f123884o == k2Var.f123884o;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((java.lang.Integer.hashCode(this.f123870a) * 31) + java.lang.Integer.hashCode(this.f123871b)) * 31) + java.lang.Integer.hashCode(this.f123872c)) * 31) + java.lang.Long.hashCode(this.f123873d)) * 31) + java.lang.Long.hashCode(this.f123874e)) * 31) + java.lang.Long.hashCode(this.f123875f)) * 31) + java.lang.Long.hashCode(this.f123876g)) * 31) + java.lang.Long.hashCode(this.f123877h)) * 31) + java.lang.Long.hashCode(this.f123878i)) * 31) + java.lang.Integer.hashCode(this.f123879j)) * 31;
        java.lang.Integer num = this.f123880k;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f123881l;
        return ((((((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f123882m)) * 31) + java.lang.Long.hashCode(this.f123883n)) * 31) + java.lang.Long.hashCode(this.f123884o);
    }

    public java.lang.String toString() {
        return "CgiReportInfo(cgiId=" + this.f123870a + ", bizType=" + this.f123871b + ", tabType=" + this.f123872c + ", totCost=" + this.f123873d + ", connCost=" + this.f123874e + ", startPacketCost=" + this.f123875f + ", tlsCost=" + this.f123876g + ", readPacketCost=" + this.f123877h + ", decodePacketCost=" + this.f123878i + ", finished=" + this.f123879j + ", reqSize=" + this.f123880k + ", respSize=" + this.f123881l + ", ret=" + this.f123882m + ", beginTimeStamp=" + this.f123883n + ", finishTimeStamp=" + this.f123884o + ')';
    }
}

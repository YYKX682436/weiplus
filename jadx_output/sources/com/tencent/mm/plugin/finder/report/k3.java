package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f125096a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f125097b;

    /* renamed from: c, reason: collision with root package name */
    public final long f125098c;

    /* renamed from: d, reason: collision with root package name */
    public final long f125099d;

    /* renamed from: e, reason: collision with root package name */
    public final long f125100e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f125101f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f125102g;

    public k3(long j17, java.lang.String str, long j18, int i17, long j19, long j27, java.lang.String str2, java.lang.String str3) {
        this.f125096a = j17;
        this.f125097b = str;
        this.f125098c = j18;
        this.f125099d = j19;
        this.f125100e = j27;
        this.f125101f = str2;
        this.f125102g = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.report.k3)) {
            return false;
        }
        com.tencent.mm.plugin.finder.report.k3 k3Var = (com.tencent.mm.plugin.finder.report.k3) obj;
        return this.f125096a == k3Var.f125096a && kotlin.jvm.internal.o.b(this.f125097b, k3Var.f125097b) && this.f125098c == k3Var.f125098c && this.f125099d == k3Var.f125099d && this.f125100e == k3Var.f125100e && kotlin.jvm.internal.o.b(this.f125101f, k3Var.f125101f) && kotlin.jvm.internal.o.b(this.f125102g, k3Var.f125102g);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f125096a) * 31;
        java.lang.String str = this.f125097b;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f125098c)) * 31) + java.lang.Integer.hashCode(1)) * 31) + java.lang.Long.hashCode(this.f125099d)) * 31) + java.lang.Long.hashCode(this.f125100e)) * 31;
        java.lang.String str2 = this.f125101f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f125102g;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PreMovieAdCommonReportInfo(feedId=" + this.f125096a + ", dupFlag=" + this.f125097b + ", outerDuration=" + this.f125098c + ", playCount=1, playTotalTime=" + this.f125099d + ", videoTotalTime=" + this.f125100e + ", adReportExtraData=" + this.f125101f + ", finderReportBypassData=" + this.f125102g + ')';
    }
}

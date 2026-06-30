package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public long f193362a;

    /* renamed from: b, reason: collision with root package name */
    public long f193363b;

    /* renamed from: c, reason: collision with root package name */
    public int f193364c;

    /* renamed from: d, reason: collision with root package name */
    public long f193365d;

    /* renamed from: e, reason: collision with root package name */
    public long f193366e;

    /* renamed from: f, reason: collision with root package name */
    public long f193367f;

    /* renamed from: g, reason: collision with root package name */
    public long f193368g;

    public s(long j17, long j18, int i17, long j19, long j27, long j28, long j29, int i18, kotlin.jvm.internal.i iVar) {
        long j37 = (i18 & 1) != 0 ? 0L : j17;
        long j38 = (i18 & 2) != 0 ? 0L : j18;
        int i19 = (i18 & 4) != 0 ? 0 : i17;
        long j39 = (i18 & 8) != 0 ? 0L : j19;
        long j47 = (i18 & 16) != 0 ? 0L : j27;
        long j48 = (i18 & 32) != 0 ? 0L : j28;
        long j49 = (i18 & 64) == 0 ? j29 : 0L;
        this.f193362a = j37;
        this.f193363b = j38;
        this.f193364c = i19;
        this.f193365d = j39;
        this.f193366e = j47;
        this.f193367f = j48;
        this.f193368g = j49;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.smiley.s)) {
            return false;
        }
        com.tencent.mm.smiley.s sVar = (com.tencent.mm.smiley.s) obj;
        return this.f193362a == sVar.f193362a && this.f193363b == sVar.f193363b && this.f193364c == sVar.f193364c && this.f193365d == sVar.f193365d && this.f193366e == sVar.f193366e && this.f193367f == sVar.f193367f && this.f193368g == sVar.f193368g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Long.hashCode(this.f193362a) * 31) + java.lang.Long.hashCode(this.f193363b)) * 31) + java.lang.Integer.hashCode(this.f193364c)) * 31) + java.lang.Long.hashCode(this.f193365d)) * 31) + java.lang.Long.hashCode(this.f193366e)) * 31) + java.lang.Long.hashCode(this.f193367f)) * 31) + java.lang.Long.hashCode(this.f193368g);
    }

    public java.lang.String toString() {
        return "CostStatistics(totalMs=" + this.f193362a + ", frameCount=" + this.f193363b + ", fileCount=" + this.f193364c + ", maxReadMs=" + this.f193365d + ", maxDecodeMs=" + this.f193366e + ", maxConvertMs=" + this.f193367f + ", maxOcrMs=" + this.f193368g + ')';
    }
}

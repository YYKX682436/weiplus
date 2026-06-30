package ml2;

/* loaded from: classes3.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f327654a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f327655b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f327656c;

    /* renamed from: d, reason: collision with root package name */
    public long f327657d;

    /* renamed from: e, reason: collision with root package name */
    public long f327658e;

    /* renamed from: f, reason: collision with root package name */
    public long f327659f;

    /* renamed from: g, reason: collision with root package name */
    public long f327660g;

    /* renamed from: h, reason: collision with root package name */
    public long f327661h;

    /* renamed from: i, reason: collision with root package name */
    public long f327662i;

    /* renamed from: j, reason: collision with root package name */
    public long f327663j;

    /* renamed from: k, reason: collision with root package name */
    public int f327664k;

    /* renamed from: l, reason: collision with root package name */
    public long f327665l;

    /* renamed from: m, reason: collision with root package name */
    public long f327666m;

    /* renamed from: n, reason: collision with root package name */
    public long f327667n;

    /* renamed from: o, reason: collision with root package name */
    public long f327668o;

    /* renamed from: p, reason: collision with root package name */
    public long f327669p;

    /* renamed from: q, reason: collision with root package name */
    public long f327670q;

    /* renamed from: r, reason: collision with root package name */
    public long f327671r;

    /* renamed from: s, reason: collision with root package name */
    public long f327672s;

    /* renamed from: t, reason: collision with root package name */
    public long f327673t;

    /* renamed from: u, reason: collision with root package name */
    public long f327674u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f327675v;

    /* renamed from: w, reason: collision with root package name */
    public long f327676w;

    /* renamed from: x, reason: collision with root package name */
    public long f327677x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f327678y;

    public k5(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, long j19, long j27, long j28, long j29, long j37, int i17, long j38, long j39, long j47, long j48, long j49, long j57, long j58, long j59, long j66, long j67, java.util.HashMap hashMap, long j68, long j69, java.lang.String str4, int i18, kotlin.jvm.internal.i iVar) {
        java.lang.String liveId = (i18 & 1) != 0 ? "" : str;
        java.lang.String feedId = (i18 & 2) != 0 ? "" : str2;
        java.lang.String description = (i18 & 4) != 0 ? "" : str3;
        long j76 = (i18 & 8) != 0 ? 0L : j17;
        long j77 = (i18 & 16) != 0 ? 0L : j18;
        long j78 = (i18 & 32) != 0 ? 0L : j19;
        long j79 = (i18 & 64) != 0 ? 0L : j27;
        long j86 = (i18 & 128) != 0 ? 0L : j28;
        long j87 = (i18 & 256) != 0 ? 0L : j29;
        long j88 = (i18 & 512) != 0 ? 0L : j37;
        int i19 = (i18 & 1024) != 0 ? 0 : i17;
        long j89 = (i18 & 2048) != 0 ? 0L : j38;
        long j96 = (i18 & 4096) != 0 ? 0L : j39;
        long j97 = (i18 & 8192) != 0 ? 0L : j47;
        long j98 = (i18 & 16384) != 0 ? 0L : j48;
        long j99 = (32768 & i18) != 0 ? 0L : j49;
        long j100 = (65536 & i18) != 0 ? 0L : j57;
        long j101 = (131072 & i18) != 0 ? 0L : j58;
        long j102 = (262144 & i18) != 0 ? 0L : j59;
        long j103 = (524288 & i18) != 0 ? 0L : j66;
        long j104 = (1048576 & i18) != 0 ? 0L : j67;
        java.util.HashMap promoteGoods = (2097152 & i18) != 0 ? new java.util.HashMap() : hashMap;
        long j105 = (i18 & 4194304) != 0 ? 0L : j68;
        long j106 = (i18 & 8388608) != 0 ? 0L : j69;
        java.lang.String shopWindowId = (i18 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? "" : str4;
        kotlin.jvm.internal.o.g(liveId, "liveId");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(promoteGoods, "promoteGoods");
        kotlin.jvm.internal.o.g(shopWindowId, "shopWindowId");
        this.f327654a = liveId;
        this.f327655b = feedId;
        this.f327656c = description;
        this.f327657d = j76;
        this.f327658e = j77;
        this.f327659f = j78;
        this.f327660g = j79;
        this.f327661h = j86;
        this.f327662i = j87;
        this.f327663j = j88;
        this.f327664k = i19;
        this.f327665l = j89;
        this.f327666m = j96;
        this.f327667n = j97;
        this.f327668o = j98;
        this.f327669p = j99;
        this.f327670q = j100;
        this.f327671r = j101;
        this.f327672s = j102;
        this.f327673t = j103;
        this.f327674u = j104;
        this.f327675v = promoteGoods;
        this.f327676w = j105;
        this.f327677x = j106;
        this.f327678y = shopWindowId;
    }

    public final long a() {
        return this.f327665l;
    }

    public final long b() {
        return this.f327676w;
    }

    public final void c(long j17) {
        this.f327665l = j17;
    }

    public final void d(long j17) {
        this.f327676w = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.k5)) {
            return false;
        }
        ml2.k5 k5Var = (ml2.k5) obj;
        return kotlin.jvm.internal.o.b(this.f327654a, k5Var.f327654a) && kotlin.jvm.internal.o.b(this.f327655b, k5Var.f327655b) && kotlin.jvm.internal.o.b(this.f327656c, k5Var.f327656c) && this.f327657d == k5Var.f327657d && this.f327658e == k5Var.f327658e && this.f327659f == k5Var.f327659f && this.f327660g == k5Var.f327660g && this.f327661h == k5Var.f327661h && this.f327662i == k5Var.f327662i && this.f327663j == k5Var.f327663j && this.f327664k == k5Var.f327664k && this.f327665l == k5Var.f327665l && this.f327666m == k5Var.f327666m && this.f327667n == k5Var.f327667n && this.f327668o == k5Var.f327668o && this.f327669p == k5Var.f327669p && this.f327670q == k5Var.f327670q && this.f327671r == k5Var.f327671r && this.f327672s == k5Var.f327672s && this.f327673t == k5Var.f327673t && this.f327674u == k5Var.f327674u && kotlin.jvm.internal.o.b(this.f327675v, k5Var.f327675v) && this.f327676w == k5Var.f327676w && this.f327677x == k5Var.f327677x && kotlin.jvm.internal.o.b(this.f327678y, k5Var.f327678y);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((this.f327654a.hashCode() * 31) + this.f327655b.hashCode()) * 31) + this.f327656c.hashCode()) * 31) + java.lang.Long.hashCode(this.f327657d)) * 31) + java.lang.Long.hashCode(this.f327658e)) * 31) + java.lang.Long.hashCode(this.f327659f)) * 31) + java.lang.Long.hashCode(this.f327660g)) * 31) + java.lang.Long.hashCode(this.f327661h)) * 31) + java.lang.Long.hashCode(this.f327662i)) * 31) + java.lang.Long.hashCode(this.f327663j)) * 31) + java.lang.Integer.hashCode(this.f327664k)) * 31) + java.lang.Long.hashCode(this.f327665l)) * 31) + java.lang.Long.hashCode(this.f327666m)) * 31) + java.lang.Long.hashCode(this.f327667n)) * 31) + java.lang.Long.hashCode(this.f327668o)) * 31) + java.lang.Long.hashCode(this.f327669p)) * 31) + java.lang.Long.hashCode(this.f327670q)) * 31) + java.lang.Long.hashCode(this.f327671r)) * 31) + java.lang.Long.hashCode(this.f327672s)) * 31) + java.lang.Long.hashCode(this.f327673t)) * 31) + java.lang.Long.hashCode(this.f327674u)) * 31) + this.f327675v.hashCode()) * 31) + java.lang.Long.hashCode(this.f327676w)) * 31) + java.lang.Long.hashCode(this.f327677x)) * 31) + this.f327678y.hashCode();
    }

    public java.lang.String toString() {
        return "LiveStaticsData_21056(liveId=" + this.f327654a + ", feedId=" + this.f327655b + ", description=" + this.f327656c + ", liveStartTimeMs=" + this.f327657d + ", liveEndTimeMs=" + this.f327658e + ", oriFansCount=" + this.f327659f + ", liveDurationSeconds=" + this.f327660g + ", audienceCount=" + this.f327661h + ", likeCount=" + this.f327662i + ", newFansNum=" + this.f327663j + ", errorCode=" + this.f327664k + ", floatingCount=" + this.f327665l + ", shareSnsCount=" + this.f327666m + ", shareSessionCount=" + this.f327667n + ", exchangeCameraCount=" + this.f327668o + ", complainCount=" + this.f327669p + ", allCommentCloseCount=" + this.f327670q + ", allCommentOpenCount=" + this.f327671r + ", personalCommentCloseCount=" + this.f327672s + ", personalCommentOpenCount=" + this.f327673t + ", kickOutCount=" + this.f327674u + ", promoteGoods=" + this.f327675v + ", topComment=" + this.f327676w + ", tickleTimes=" + this.f327677x + ", shopWindowId=" + this.f327678y + ')';
    }
}

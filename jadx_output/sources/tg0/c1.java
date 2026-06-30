package tg0;

/* loaded from: classes8.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f419029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f419030b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f419031c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f419032d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f419033e;

    /* renamed from: f, reason: collision with root package name */
    public final int f419034f;

    /* renamed from: g, reason: collision with root package name */
    public final int f419035g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f419036h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f419037i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f419038j;

    /* renamed from: k, reason: collision with root package name */
    public final int f419039k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f419040l;

    /* renamed from: m, reason: collision with root package name */
    public final int f419041m;

    /* renamed from: n, reason: collision with root package name */
    public final int f419042n;

    /* renamed from: o, reason: collision with root package name */
    public final int f419043o;

    /* renamed from: p, reason: collision with root package name */
    public double f419044p;

    /* renamed from: q, reason: collision with root package name */
    public final long f419045q;

    public c1(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, int i27, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i28, java.lang.String str7, int i29, int i37, int i38, double d17, long j17, int i39, kotlin.jvm.internal.i iVar) {
        int i47 = (i39 & 1) != 0 ? 0 : i17;
        int i48 = (i39 & 2) != 0 ? 0 : i18;
        java.lang.String sessionId = (i39 & 4) != 0 ? "" : str;
        java.lang.String query = (i39 & 8) != 0 ? "" : str2;
        java.lang.String resultJson = (i39 & 16) != 0 ? "" : str3;
        int i49 = (i39 & 32) != 0 ? 14 : i19;
        int i57 = (i39 & 64) != 0 ? 0 : i27;
        java.lang.String requestId = (i39 & 128) != 0 ? "" : str4;
        java.lang.String parentSearchId = (i39 & 256) != 0 ? "" : str5;
        java.lang.String filter = (i39 & 512) != 0 ? "" : str6;
        int i58 = (i39 & 1024) != 0 ? 1 : i28;
        java.lang.String mixerCommonContext = (i39 & 2048) == 0 ? str7 : "";
        int i59 = (i39 & 4096) != 0 ? 123 : i29;
        int i66 = (i39 & 8192) != 0 ? 14 : i37;
        int i67 = (i39 & 16384) != 0 ? 0 : i38;
        double d18 = (i39 & 32768) != 0 ? 0.0d : d17;
        long j18 = (i39 & 65536) != 0 ? 0L : j17;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(resultJson, "resultJson");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(parentSearchId, "parentSearchId");
        kotlin.jvm.internal.o.g(filter, "filter");
        kotlin.jvm.internal.o.g(mixerCommonContext, "mixerCommonContext");
        this.f419029a = i47;
        this.f419030b = i48;
        this.f419031c = sessionId;
        this.f419032d = query;
        this.f419033e = resultJson;
        this.f419034f = i49;
        this.f419035g = i57;
        this.f419036h = requestId;
        this.f419037i = parentSearchId;
        this.f419038j = filter;
        this.f419039k = i58;
        this.f419040l = mixerCommonContext;
        this.f419041m = i59;
        this.f419042n = i66;
        this.f419043o = i67;
        this.f419044p = d18;
        this.f419045q = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg0.c1)) {
            return false;
        }
        tg0.c1 c1Var = (tg0.c1) obj;
        return this.f419029a == c1Var.f419029a && this.f419030b == c1Var.f419030b && kotlin.jvm.internal.o.b(this.f419031c, c1Var.f419031c) && kotlin.jvm.internal.o.b(this.f419032d, c1Var.f419032d) && kotlin.jvm.internal.o.b(this.f419033e, c1Var.f419033e) && this.f419034f == c1Var.f419034f && this.f419035g == c1Var.f419035g && kotlin.jvm.internal.o.b(this.f419036h, c1Var.f419036h) && kotlin.jvm.internal.o.b(this.f419037i, c1Var.f419037i) && kotlin.jvm.internal.o.b(this.f419038j, c1Var.f419038j) && this.f419039k == c1Var.f419039k && kotlin.jvm.internal.o.b(this.f419040l, c1Var.f419040l) && this.f419041m == c1Var.f419041m && this.f419042n == c1Var.f419042n && this.f419043o == c1Var.f419043o && java.lang.Double.compare(this.f419044p, c1Var.f419044p) == 0 && this.f419045q == c1Var.f419045q;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f419029a) * 31) + java.lang.Integer.hashCode(this.f419030b)) * 31) + this.f419031c.hashCode()) * 31) + this.f419032d.hashCode()) * 31) + this.f419033e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f419034f)) * 31) + java.lang.Integer.hashCode(this.f419035g)) * 31) + this.f419036h.hashCode()) * 31) + this.f419037i.hashCode()) * 31) + this.f419038j.hashCode()) * 31) + java.lang.Integer.hashCode(this.f419039k)) * 31) + this.f419040l.hashCode()) * 31) + java.lang.Integer.hashCode(this.f419041m)) * 31) + java.lang.Integer.hashCode(this.f419042n)) * 31) + java.lang.Integer.hashCode(this.f419043o)) * 31) + java.lang.Double.hashCode(this.f419044p)) * 31) + java.lang.Long.hashCode(this.f419045q);
    }

    public java.lang.String toString() {
        return "FlutterSearchResult(sugVisible=" + this.f419029a + ", searchType=" + this.f419030b + ", sessionId=" + this.f419031c + ", query=" + this.f419032d + ", businessType=" + this.f419034f + ", offset=" + this.f419035g + ", requestId=" + this.f419036h + ", parentSearchId=" + this.f419037i + ", filter=" + this.f419038j + ", newQuery=" + this.f419039k + ", mixerCommonContext=" + this.f419040l + ", scene=" + this.f419041m + ", type=" + this.f419042n + ", preFetch=" + this.f419043o + ", initH5BoxHeight=" + this.f419044p + ", responseTime=" + this.f419045q + ')';
    }
}

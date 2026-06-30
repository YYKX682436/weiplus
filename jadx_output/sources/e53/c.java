package e53;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f249615a;

    /* renamed from: b, reason: collision with root package name */
    public final int f249616b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f249617c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f249618d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f249619e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f249620f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f249621g;

    /* renamed from: h, reason: collision with root package name */
    public long f249622h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f249623i;

    /* renamed from: j, reason: collision with root package name */
    public long f249624j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f249625k;

    public c(java.lang.String key, int i17, boolean z17, java.lang.String reportStr, java.lang.String str, boolean z18, boolean z19, long j17, boolean z27, long j18, boolean z28) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(reportStr, "reportStr");
        this.f249615a = key;
        this.f249616b = i17;
        this.f249617c = z17;
        this.f249618d = reportStr;
        this.f249619e = str;
        this.f249620f = z18;
        this.f249621g = z19;
        this.f249622h = j17;
        this.f249623i = z27;
        this.f249624j = j18;
        this.f249625k = z28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e53.c)) {
            return false;
        }
        e53.c cVar = (e53.c) obj;
        return kotlin.jvm.internal.o.b(this.f249615a, cVar.f249615a) && this.f249616b == cVar.f249616b && this.f249617c == cVar.f249617c && kotlin.jvm.internal.o.b(this.f249618d, cVar.f249618d) && kotlin.jvm.internal.o.b(this.f249619e, cVar.f249619e) && this.f249620f == cVar.f249620f && this.f249621g == cVar.f249621g && this.f249622h == cVar.f249622h && this.f249623i == cVar.f249623i && this.f249624j == cVar.f249624j && this.f249625k == cVar.f249625k;
    }

    public int hashCode() {
        int hashCode = ((((((this.f249615a.hashCode() * 31) + java.lang.Integer.hashCode(this.f249616b)) * 31) + java.lang.Boolean.hashCode(this.f249617c)) * 31) + this.f249618d.hashCode()) * 31;
        java.lang.String str = this.f249619e;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f249620f)) * 31) + java.lang.Boolean.hashCode(this.f249621g)) * 31) + java.lang.Long.hashCode(this.f249622h)) * 31) + java.lang.Boolean.hashCode(this.f249623i)) * 31) + java.lang.Long.hashCode(this.f249624j)) * 31) + java.lang.Boolean.hashCode(this.f249625k);
    }

    public java.lang.String toString() {
        return "FeedTimeReportStruct(key=" + this.f249615a + ", logId=" + this.f249616b + ", reportOnExit=" + this.f249617c + ", reportStr=" + this.f249618d + ", timePlaceHolderKey=" + this.f249619e + ", markTimeStart=" + this.f249620f + ", isReportNow=" + this.f249621g + ", reportDuration=" + this.f249622h + ", isTimeMillSecond=" + this.f249623i + ", startTime=" + this.f249624j + ", recordOpenOtherPage=" + this.f249625k + ')';
    }
}

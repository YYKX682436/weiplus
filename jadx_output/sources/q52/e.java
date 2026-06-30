package q52;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f360164a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f360165b;

    /* renamed from: c, reason: collision with root package name */
    public long f360166c;

    /* renamed from: d, reason: collision with root package name */
    public long f360167d;

    /* renamed from: e, reason: collision with root package name */
    public long f360168e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f360169f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f360170g;

    /* renamed from: h, reason: collision with root package name */
    public int f360171h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f360172i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f360173j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f360174k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f360175l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f360176m;

    /* renamed from: n, reason: collision with root package name */
    public int f360177n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f360178o;

    /* renamed from: p, reason: collision with root package name */
    public int f360179p;

    /* renamed from: q, reason: collision with root package name */
    public int f360180q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f360181r;

    public e() {
        this(null, null, 0L, 0L, 0L, null, null, 0, false, null, null, null, false, 0, false, 0, 0, null, 262143, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q52.e)) {
            return false;
        }
        q52.e eVar = (q52.e) obj;
        return kotlin.jvm.internal.o.b(this.f360164a, eVar.f360164a) && kotlin.jvm.internal.o.b(this.f360165b, eVar.f360165b) && this.f360166c == eVar.f360166c && this.f360167d == eVar.f360167d && this.f360168e == eVar.f360168e && kotlin.jvm.internal.o.b(this.f360169f, eVar.f360169f) && kotlin.jvm.internal.o.b(this.f360170g, eVar.f360170g) && this.f360171h == eVar.f360171h && this.f360172i == eVar.f360172i && kotlin.jvm.internal.o.b(this.f360173j, eVar.f360173j) && kotlin.jvm.internal.o.b(this.f360174k, eVar.f360174k) && kotlin.jvm.internal.o.b(this.f360175l, eVar.f360175l) && this.f360176m == eVar.f360176m && this.f360177n == eVar.f360177n && this.f360178o == eVar.f360178o && this.f360179p == eVar.f360179p && this.f360180q == eVar.f360180q && kotlin.jvm.internal.o.b(this.f360181r, eVar.f360181r);
    }

    public int hashCode() {
        java.lang.String str = this.f360164a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f360165b;
        int hashCode2 = (((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f360166c)) * 31) + java.lang.Long.hashCode(this.f360167d)) * 31) + java.lang.Long.hashCode(this.f360168e)) * 31;
        java.lang.String str3 = this.f360169f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f360170g;
        int hashCode4 = (((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Integer.hashCode(this.f360171h)) * 31) + java.lang.Boolean.hashCode(this.f360172i)) * 31;
        java.lang.String str5 = this.f360173j;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f360174k;
        return ((((((((((((((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f360175l.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f360176m)) * 31) + java.lang.Integer.hashCode(this.f360177n)) * 31) + java.lang.Boolean.hashCode(this.f360178o)) * 31) + java.lang.Integer.hashCode(this.f360179p)) * 31) + java.lang.Integer.hashCode(this.f360180q)) * 31) + this.f360181r.hashCode();
    }

    public java.lang.String toString() {
        return "StayTimeStatistics(sessionId=" + this.f360164a + ", pageName=" + this.f360165b + ", stayTimeMs=" + this.f360166c + ", enterTimeMs=" + this.f360167d + ", exitTimeMs=" + this.f360168e + ", clickTabContextId=" + this.f360169f + ", sid=" + this.f360170g + ", reportType=" + this.f360171h + ", isPoi=" + this.f360172i + ", extraInfo=" + this.f360173j + ", enterSourceInfo=" + this.f360174k + ", finderContextID=" + this.f360175l + ", forceUsingMyContextId=" + this.f360176m + ", enterType=" + this.f360177n + ", isFinderChattingUI=" + this.f360178o + ", lastSessionEnterType=" + this.f360179p + ", pageHashCode=" + this.f360180q + ", sdkEnterMethod=" + this.f360181r + ')';
    }

    public e(java.lang.String str, java.lang.String str2, long j17, long j18, long j19, java.lang.String str3, java.lang.String str4, int i17, boolean z17, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z18, int i18, boolean z19, int i19, int i27, java.lang.String str8, int i28, kotlin.jvm.internal.i iVar) {
        int i29;
        java.lang.String str9 = (i28 & 1) != 0 ? null : str;
        java.lang.String str10 = (i28 & 2) != 0 ? null : str2;
        long j27 = (i28 & 4) != 0 ? -1L : j17;
        long j28 = (i28 & 8) != 0 ? -1L : j18;
        long j29 = (i28 & 16) == 0 ? j19 : -1L;
        java.lang.String str11 = (i28 & 32) != 0 ? null : str3;
        java.lang.String str12 = (i28 & 64) != 0 ? null : str4;
        if ((i28 & 128) != 0) {
            p52.d[] dVarArr = p52.d.f352007d;
            i29 = 0;
        } else {
            i29 = i17;
        }
        boolean z27 = (i28 & 256) != 0 ? false : z17;
        java.lang.String str13 = (i28 & 512) != 0 ? null : str5;
        java.lang.String str14 = (i28 & 1024) != 0 ? null : str6;
        java.lang.String finderContextID = (i28 & 2048) != 0 ? "" : str7;
        java.lang.String str15 = str13;
        boolean z28 = (i28 & 4096) != 0 ? false : z18;
        int i37 = (i28 & 8192) != 0 ? 0 : i18;
        boolean z29 = (i28 & 16384) != 0 ? false : z19;
        int i38 = (i28 & 32768) != 0 ? 0 : i19;
        int i39 = (i28 & 65536) != 0 ? 0 : i27;
        java.lang.String sdkEnterMethod = (i28 & 131072) != 0 ? "" : str8;
        kotlin.jvm.internal.o.g(finderContextID, "finderContextID");
        kotlin.jvm.internal.o.g(sdkEnterMethod, "sdkEnterMethod");
        this.f360164a = str9;
        this.f360165b = str10;
        this.f360166c = j27;
        this.f360167d = j28;
        this.f360168e = j29;
        this.f360169f = str11;
        this.f360170g = str12;
        this.f360171h = i29;
        this.f360172i = z27;
        this.f360173j = str15;
        this.f360174k = str14;
        this.f360175l = finderContextID;
        this.f360176m = z28;
        this.f360177n = i37;
        this.f360178o = z29;
        this.f360179p = i38;
        this.f360180q = i39;
        this.f360181r = sdkEnterMethod;
    }
}

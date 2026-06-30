package kr5;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f311546a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f311547b;

    /* renamed from: c, reason: collision with root package name */
    public final bs5.q f311548c;

    /* renamed from: d, reason: collision with root package name */
    public final int f311549d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f311550e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f311551f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f311552g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f311553h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f311554i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f311555j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f311556k;

    /* renamed from: l, reason: collision with root package name */
    public final int f311557l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f311558m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f311559n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f311560o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f311561p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f311562q = false;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f311563r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f311564s;

    public g(int i17, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.util.Set set, java.util.Set set2, boolean z18, java.util.Set set3, java.util.Set set4, java.lang.String str6, boolean z19, boolean z27, int i19, lr5.b bVar, kr5.q qVar, java.util.List list, java.util.List list2, boolean z28, boolean z29, java.lang.String str7, java.lang.Boolean bool, kr5.e eVar) {
        this.f311546a = i17;
        this.f311547b = str;
        this.f311548c = new bs5.q(str3, str4, str5);
        this.f311549d = i18;
        this.f311550e = set;
        this.f311551f = set2;
        this.f311553h = z18;
        this.f311552g = set3;
        this.f311554i = str6;
        this.f311555j = z19;
        this.f311556k = z27;
        this.f311557l = i19;
        this.f311558m = list;
        this.f311559n = list2;
        this.f311560o = z28;
        this.f311561p = z29;
        this.f311563r = str7;
        this.f311564s = bool.booleanValue();
    }

    public java.lang.String toString() {
        return "DnsConfig{logLevel=" + this.f311546a + ", appId='" + this.f311547b + "', userId='', lookupExtra=" + this.f311548c + ", timeoutMills=" + this.f311549d + ", protectedDomains=" + sr5.a.e(this.f311550e) + ", preLookupDomains=" + sr5.a.e(this.f311551f) + ", enablePersistentCache=" + this.f311553h + ", persistentCacheDomains=" + sr5.a.e(this.f311552g) + ", IpRankItems=" + sr5.a.e(null) + ", channel='" + this.f311554i + "', enableReport='" + this.f311555j + "', blockFirst=" + this.f311556k + ", customNetStack=" + this.f311557l + ", executorSupplier=null, lookedUpListener=null, logNodes=" + sr5.a.e(this.f311558m) + ", reporters=" + sr5.a.e(this.f311559n) + ", useExpiredIpEnable=" + this.f311560o + ", cachedIpEnable=" + this.f311561p + ", enableDomainServer=" + this.f311562q + ", routeIp=" + this.f311563r + ", experimentalBuglyEnable=" + this.f311564s + '}';
    }
}

package g55;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f268976a;

    /* renamed from: b, reason: collision with root package name */
    public final int f268977b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f268978c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268979d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f268980e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f268981f;

    /* renamed from: g, reason: collision with root package name */
    public long f268982g;

    /* renamed from: h, reason: collision with root package name */
    public long f268983h;

    /* renamed from: i, reason: collision with root package name */
    public long f268984i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f268985j;

    /* renamed from: k, reason: collision with root package name */
    public long f268986k;

    /* renamed from: l, reason: collision with root package name */
    public long f268987l;

    /* renamed from: m, reason: collision with root package name */
    public long f268988m;

    /* renamed from: n, reason: collision with root package name */
    public long f268989n;

    /* renamed from: o, reason: collision with root package name */
    public int f268990o;

    /* renamed from: p, reason: collision with root package name */
    public long f268991p;

    /* renamed from: q, reason: collision with root package name */
    public long f268992q;

    /* renamed from: r, reason: collision with root package name */
    public long f268993r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f268994s;

    public g(long j17, int i17, java.lang.String pageName, int i18, java.lang.String clickEntryKey) {
        kotlin.jvm.internal.o.g(pageName, "pageName");
        kotlin.jvm.internal.o.g(clickEntryKey, "clickEntryKey");
        this.f268976a = j17;
        this.f268977b = i17;
        this.f268978c = pageName;
        this.f268979d = i18;
        this.f268980e = clickEntryKey;
        this.f268981f = new java.util.LinkedHashMap();
    }

    public final void a(long j17, int i17) {
        if (this.f268982g == 0) {
            this.f268982g = j17;
        }
        this.f268986k = 0L;
        long j18 = this.f268993r;
        if (j18 == 0 || j17 <= j18 || i17 != 1) {
            return;
        }
        long j19 = j17 - j18;
        this.f268991p = j19;
        this.f268992q += j19;
        this.f268993r = 0L;
    }

    public final void b(long j17, int i17) {
        long j18 = this.f268982g;
        if (j17 <= j18 || j18 == 0) {
            return;
        }
        if (!this.f268985j) {
            this.f268983h += j17 - j18;
            this.f268985j = true;
        }
        if (i17 == 1) {
            this.f268993r = j17;
        }
        this.f268986k = j17 - j18;
        this.f268988m += j17 - j18;
        this.f268982g = 0L;
        this.f268984i = j17;
        this.f268990o++;
    }

    public final java.util.Map c() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(this.f268981f);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("in_time", java.lang.Long.valueOf(this.f268976a));
        linkedHashMap2.put("out_time", java.lang.Long.valueOf(this.f268984i));
        if (this.f268994s) {
            linkedHashMap2.put("red_dot_consumption_time", java.lang.Long.valueOf(this.f268983h));
        }
        linkedHashMap2.put("first_page_stay_time", java.lang.Long.valueOf(this.f268987l));
        linkedHashMap2.put("all_stay_time", java.lang.Long.valueOf(this.f268988m));
        linkedHashMap2.put("page_id", java.lang.Integer.valueOf(this.f268977b));
        linkedHashMap2.put("page_name", this.f268978c);
        linkedHashMap2.put("click_entry_key", this.f268980e);
        linkedHashMap2.put("out_num", java.lang.Integer.valueOf(this.f268990o));
        linkedHashMap2.put("cur_stay_time", java.lang.Long.valueOf(this.f268986k));
        linkedHashMap2.put("cur_app_out_stay_time", java.lang.Long.valueOf(this.f268991p));
        linkedHashMap2.put("all_app_out_stay_time", java.lang.Long.valueOf(this.f268992q));
        linkedHashMap2.put("is_red_dot", java.lang.Integer.valueOf(this.f268994s ? 1 : 0));
        linkedHashMap.putAll(linkedHashMap2);
        return linkedHashMap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g55.g)) {
            return false;
        }
        g55.g gVar = (g55.g) obj;
        return this.f268976a == gVar.f268976a && this.f268977b == gVar.f268977b && kotlin.jvm.internal.o.b(this.f268978c, gVar.f268978c) && this.f268979d == gVar.f268979d && kotlin.jvm.internal.o.b(this.f268980e, gVar.f268980e);
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.f268976a) * 31) + java.lang.Integer.hashCode(this.f268977b)) * 31) + this.f268978c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f268979d)) * 31) + this.f268980e.hashCode();
    }

    public java.lang.String toString() {
        return "pageId = " + this.f268977b + "\npageName = " + this.f268978c + "\nleaveTime = " + this.f268976a + "\noutTime = " + this.f268984i + "\nstayTime = " + this.f268983h + "\nfirstPageStayTime = " + this.f268987l + "\ncurPageStayTime = " + this.f268986k + "\nallStayTime = " + this.f268988m + "\nentryKey = " + this.f268980e + "\nparams: " + kz5.n0.g0(((java.util.LinkedHashMap) this.f268981f).entrySet(), ",", "{", "}", 0, null, g55.f.f268975d, 24, null);
    }
}

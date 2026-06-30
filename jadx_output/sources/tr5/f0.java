package tr5;

/* loaded from: classes13.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f421475a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f421476b;

    /* renamed from: c, reason: collision with root package name */
    public final int f421477c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f421478d;

    /* renamed from: e, reason: collision with root package name */
    public final tr5.n f421479e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f421480f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f421481g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f421482h;

    /* renamed from: i, reason: collision with root package name */
    public final int f421483i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f421484j;

    /* renamed from: k, reason: collision with root package name */
    public final int f421485k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f421486l;

    /* renamed from: m, reason: collision with root package name */
    public final int f421487m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f421488n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f421489o;

    public f0(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, tr5.n nVar, java.lang.String str3, boolean z17, boolean z18, int i18, boolean z19, int i19, boolean z27, int i27, boolean z28, tr5.d0 d0Var) {
        this.f421475a = context;
        this.f421476b = str;
        this.f421477c = i17;
        this.f421478d = str2;
        this.f421479e = nVar;
        this.f421480f = str3;
        this.f421481g = z17;
        this.f421482h = z18;
        this.f421483i = i18;
        this.f421484j = z19;
        this.f421485k = i19;
        this.f421486l = z27;
        this.f421487m = i27;
        this.f421488n = z28;
        this.f421489o = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tr5.f0.class != obj.getClass()) {
            return false;
        }
        tr5.f0 f0Var = (tr5.f0) obj;
        return this.f421477c == f0Var.f421477c && this.f421481g == f0Var.f421481g && this.f421482h == f0Var.f421482h && this.f421483i == f0Var.f421483i && this.f421484j == f0Var.f421484j && this.f421485k == f0Var.f421485k && this.f421486l == f0Var.f421486l && this.f421487m == f0Var.f421487m && this.f421488n == f0Var.f421488n && sr5.a.b(this.f421475a, f0Var.f421475a) && sr5.a.b(this.f421476b, f0Var.f421476b) && sr5.a.b(this.f421478d, f0Var.f421478d) && sr5.a.b(this.f421479e, f0Var.f421479e) && sr5.a.b(this.f421480f, f0Var.f421480f);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f421475a, this.f421476b, java.lang.Integer.valueOf(this.f421477c), this.f421478d, this.f421479e, this.f421480f, java.lang.Boolean.valueOf(this.f421481g), java.lang.Boolean.valueOf(this.f421482h), java.lang.Integer.valueOf(this.f421483i), java.lang.Boolean.valueOf(this.f421484j), java.lang.Integer.valueOf(this.f421485k), java.lang.Boolean.valueOf(this.f421486l), java.lang.Integer.valueOf(this.f421487m), java.lang.Boolean.valueOf(this.f421488n)});
    }

    public java.lang.String toString() {
        return "LookupParameters{appContext=" + this.f421475a + ", hostname='" + this.f421476b + "', timeoutMills=" + this.f421477c + ", dnsIp=" + this.f421478d + ", lookupExtra=" + this.f421479e + ", channel='" + this.f421480f + "', fallback2Local=" + this.f421481g + ", blockFirst=" + this.f421482h + ", family=" + this.f421483i + ", ignoreCurNetStack=" + this.f421484j + ", customNetStack=" + this.f421485k + ", enableAsyncLookup=" + this.f421486l + ", curRetryTime=" + this.f421487m + ", netChangeLookup=" + this.f421488n + '}';
    }
}

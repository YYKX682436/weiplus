package tr5;

/* loaded from: classes13.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f421459a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f421460b;

    /* renamed from: c, reason: collision with root package name */
    public int f421461c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f421462d;

    /* renamed from: e, reason: collision with root package name */
    public tr5.n f421463e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f421464f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f421465g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f421466h;

    /* renamed from: i, reason: collision with root package name */
    public int f421467i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f421468j;

    /* renamed from: k, reason: collision with root package name */
    public int f421469k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f421470l;

    /* renamed from: m, reason: collision with root package name */
    public int f421471m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f421472n;

    public e0() {
        this.f421461c = -1;
        this.f421465g = true;
        this.f421466h = false;
        this.f421467i = 3;
        this.f421468j = false;
        this.f421469k = 0;
        this.f421470l = false;
        this.f421471m = 0;
        this.f421472n = false;
    }

    public tr5.f0 a() {
        android.content.Context context = this.f421459a;
        if (context == null) {
            throw new java.lang.IllegalStateException("mAppContext".concat(" is not initialized yet"));
        }
        java.lang.String str = this.f421460b;
        if (str == null) {
            throw new java.lang.IllegalStateException("mHostname".concat(" is not initialized yet"));
        }
        int i17 = this.f421461c;
        if (-1 == i17) {
            throw new java.lang.IllegalStateException("mTimeoutMills".concat(" is not initialized yet"));
        }
        java.lang.String str2 = this.f421462d;
        if (str2 == null) {
            throw new java.lang.IllegalStateException("mDnsIp".concat(" is not initialized yet"));
        }
        tr5.n nVar = this.f421463e;
        if (nVar == null) {
            throw new java.lang.IllegalStateException("mLookupExtra".concat(" is not initialized yet"));
        }
        java.lang.String str3 = this.f421464f;
        if (str3 != null) {
            return new tr5.f0(context, str, i17, str2, nVar, str3, this.f421465g, this.f421466h, this.f421467i, this.f421468j, this.f421469k, this.f421470l, this.f421471m, this.f421472n, null);
        }
        throw new java.lang.IllegalStateException("mChannel".concat(" is not initialized yet"));
    }

    public tr5.e0 b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("channel".concat(" can not be empty"));
        }
        this.f421464f = str;
        return this;
    }

    public tr5.e0 c(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context".concat(" can not be null"));
        }
        this.f421459a = context.getApplicationContext();
        return this;
    }

    public tr5.e0 d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("dnsIp".concat(" can not be empty"));
        }
        this.f421462d = str;
        return this;
    }

    public tr5.e0 e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        this.f421460b = str;
        return this;
    }

    public tr5.e0 f(tr5.n nVar) {
        if (nVar == null) {
            throw new java.lang.IllegalArgumentException("lookupExtra".concat(" can not be null"));
        }
        this.f421463e = nVar;
        return this;
    }

    public tr5.e0 g(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("timeoutMills".concat(" can not less than 0"));
        }
        this.f421461c = i17;
        return this;
    }

    public e0(tr5.f0 f0Var) {
        this.f421461c = -1;
        this.f421465g = true;
        this.f421466h = false;
        this.f421467i = 3;
        this.f421468j = false;
        this.f421469k = 0;
        this.f421470l = false;
        this.f421471m = 0;
        this.f421472n = false;
        this.f421459a = f0Var.f421475a;
        this.f421460b = f0Var.f421476b;
        this.f421461c = f0Var.f421477c;
        this.f421462d = f0Var.f421478d;
        this.f421463e = f0Var.f421479e;
        this.f421464f = f0Var.f421480f;
        this.f421465g = f0Var.f421481g;
        this.f421466h = f0Var.f421482h;
        this.f421467i = f0Var.f421483i;
        this.f421468j = f0Var.f421484j;
        this.f421469k = f0Var.f421485k;
        this.f421470l = f0Var.f421486l;
        this.f421471m = f0Var.f421487m;
        this.f421472n = f0Var.f421488n;
    }
}

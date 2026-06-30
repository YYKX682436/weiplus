package fs5;

/* loaded from: classes13.dex */
public final class c implements tr5.y {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f266352d;

    /* renamed from: n, reason: collision with root package name */
    public tr5.z f266359n;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f266353e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f266354f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f266355g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f266356h = -1;

    /* renamed from: i, reason: collision with root package name */
    public wr5.a f266357i = wr5.a.f448944h;

    /* renamed from: m, reason: collision with root package name */
    public bs5.g f266358m = bs5.g.f24027w;

    /* renamed from: o, reason: collision with root package name */
    public boolean f266360o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f266361p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f266362q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f266363r = false;

    public c(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context".concat(" can not be null"));
        }
        int a17 = sr5.g.a(context);
        this.f266352d = a17 != 1 ? a17 != 2 ? a17 != 3 ? a17 != 4 ? a17 != 5 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "ethernet" : "wifi" : "4G" : "3G" : "2G";
    }

    @Override // tr5.y
    public void a(tr5.z zVar) {
        if (zVar == null) {
            throw new java.lang.IllegalArgumentException("ipSet".concat(" can not be null"));
        }
        this.f266359n = zVar;
    }

    @Override // tr5.q
    public boolean b() {
        return this.f266361p;
    }

    @Override // tr5.y
    public void c(tr5.r rVar, tr5.q qVar) {
        if (rVar == null) {
            throw new java.lang.IllegalArgumentException("dns".concat(" can not be null"));
        }
        if (qVar == null) {
            throw new java.lang.IllegalArgumentException("stat".concat(" can not be null"));
        }
        or5.b.d("%s.merge(%s, %s) called", super.toString(), rVar, qVar);
        boolean z17 = false;
        if (this.f266362q) {
            this.f266360o = this.f266360o && qVar.d();
        } else {
            this.f266360o = qVar.d();
            this.f266362q = true;
        }
        if (this.f266361p && qVar.b()) {
            z17 = true;
        }
        this.f266361p = z17;
        this.f266363r = qVar.g();
        if ("Local".equals(rVar.getDescription().f421490a)) {
            this.f266357i = (wr5.a) qVar;
        } else {
            this.f266358m = (bs5.g) qVar;
        }
        ((lr5.d) lr5.e.f320770c).execute(new fs5.b(this, new tr5.g0(tr5.z.f421508g, this)));
    }

    @Override // tr5.q
    public boolean d() {
        return this.f266360o;
    }

    @Override // tr5.y
    public java.lang.String e() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            tr5.z zVar = this.f266359n;
            jSONObject.put("v4_ips", zVar == null ? "" : sr5.a.f(zVar.f421509d, ","));
            tr5.z zVar2 = this.f266359n;
            jSONObject.put("v6_ips", zVar2 == null ? "" : sr5.a.f(zVar2.f421510e, ","));
            java.lang.String str = this.f266354f;
            if (str == null) {
                str = "";
            }
            jSONObject.put("request_name", str);
            jSONObject.put("ttl", java.lang.String.valueOf(this.f266358m.f24032o));
            jSONObject.put("client_ip", java.lang.String.valueOf(this.f266358m.f24031n));
            jSONObject.put("expired_time", java.lang.String.valueOf(this.f266358m.f24033p));
            return jSONObject.toString();
        } catch (java.lang.Exception e17) {
            or5.b.b("exception: %s", e17);
            return "";
        }
    }

    @Override // tr5.y
    public void f(tr5.a0 a0Var) {
        if (a0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupContext".concat(" can not be null"));
        }
        tr5.f0 f0Var = a0Var.f421440a;
        this.f266353e = f0Var.f421476b;
        this.f266354f = f0Var.f421489o;
        this.f266355g = f0Var.f421480f;
        this.f266356h = a0Var.a();
    }

    @Override // tr5.q
    public boolean g() {
        return this.f266363r;
    }

    public java.lang.String toString() {
        return super.toString() + "{netType='" + this.f266352d + "', hostname='" + this.f266353e + "', requestHostname='" + this.f266354f + "', channel='" + this.f266355g + "', curNetStack=" + this.f266356h + ", localDnsStat=" + this.f266357i + ", restDnsStat=" + this.f266358m + ", ipSet=" + this.f266359n + ", lookupSuccess=" + this.f266360o + ", lookupGetEmptyResponse=" + this.f266361p + ", hasBeenMerge=" + this.f266362q + '}';
    }
}

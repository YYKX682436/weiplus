package rq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f398790a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f398791b;

    /* renamed from: c, reason: collision with root package name */
    public long f398792c;

    /* renamed from: d, reason: collision with root package name */
    public long f398793d;

    /* renamed from: f, reason: collision with root package name */
    public long f398795f;

    /* renamed from: g, reason: collision with root package name */
    public long f398796g;

    /* renamed from: h, reason: collision with root package name */
    public long f398797h;

    /* renamed from: i, reason: collision with root package name */
    public long f398798i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f398799j;

    /* renamed from: k, reason: collision with root package name */
    public int f398800k;

    /* renamed from: l, reason: collision with root package name */
    public int f398801l;

    /* renamed from: m, reason: collision with root package name */
    public int f398802m;

    /* renamed from: n, reason: collision with root package name */
    public int f398803n;

    /* renamed from: p, reason: collision with root package name */
    public long f398805p;

    /* renamed from: q, reason: collision with root package name */
    public long f398806q;

    /* renamed from: r, reason: collision with root package name */
    public long f398807r;

    /* renamed from: s, reason: collision with root package name */
    public long f398808s;

    /* renamed from: t, reason: collision with root package name */
    public long f398809t;

    /* renamed from: u, reason: collision with root package name */
    public r45.xw f398810u;

    /* renamed from: e, reason: collision with root package name */
    public int f398794e = 22;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f398804o = "";

    public final boolean a() {
        long j17 = this.f398805p;
        boolean z17 = j17 >= 0 && j17 <= 60000 && this.f398806q >= 0 && this.f398807r >= 0 && this.f398808s >= 0;
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "isValid: ret=" + z17 + ", enterCost=" + this.f398805p + ", cgiCost=" + this.f398806q + ", uiCost=" + this.f398807r + ", dbCost=" + this.f398808s + ", pullType=" + this.f398800k + ", cgiType=" + this.f398794e);
        return z17;
    }
}

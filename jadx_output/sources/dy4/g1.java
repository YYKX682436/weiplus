package dy4;

/* loaded from: classes15.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public long f244645a;

    /* renamed from: b, reason: collision with root package name */
    public long f244646b;

    /* renamed from: c, reason: collision with root package name */
    public long f244647c;

    /* renamed from: d, reason: collision with root package name */
    public long f244648d;

    /* renamed from: e, reason: collision with root package name */
    public long f244649e;

    /* renamed from: f, reason: collision with root package name */
    public long f244650f;

    /* renamed from: g, reason: collision with root package name */
    public int f244651g;

    /* renamed from: h, reason: collision with root package name */
    public long f244652h;

    /* renamed from: i, reason: collision with root package name */
    public long f244653i;

    /* renamed from: j, reason: collision with root package name */
    public long f244654j;

    /* renamed from: k, reason: collision with root package name */
    public long f244655k;

    /* renamed from: l, reason: collision with root package name */
    public long f244656l;

    /* renamed from: m, reason: collision with root package name */
    public int f244657m;

    /* renamed from: n, reason: collision with root package name */
    public int f244658n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f244659o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f244660p = "";

    public g1(dy4.h1 h1Var) {
    }

    public final void a() {
        b("");
        this.f244645a = 0L;
        this.f244647c = 0L;
        this.f244646b = 0L;
        this.f244648d = 0L;
        this.f244649e = 0L;
        this.f244650f = 0L;
        this.f244651g = 0;
        this.f244653i = 0L;
        this.f244654j = 0L;
        this.f244652h = 0L;
        this.f244655k = 0L;
        this.f244656l = 0L;
        this.f244657m = 0;
        this.f244658n = 0;
        this.f244659o = "";
    }

    public final void b(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (com.tencent.mm.sdk.platformtools.t8.K0(value)) {
            value = "";
        } else if (value.length() > 512) {
            value = value.substring(0, 512);
            kotlin.jvm.internal.o.f(value, "substring(...)");
        }
        this.f244660p = value;
    }
}

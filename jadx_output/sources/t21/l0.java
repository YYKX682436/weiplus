package t21;

/* loaded from: classes12.dex */
public class l0 {

    /* renamed from: l, reason: collision with root package name */
    public static final long f414819l = ip.c.l();

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f414820a = null;

    /* renamed from: b, reason: collision with root package name */
    public t21.k0 f414821b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f414822c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f414823d = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Intent f414824e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f414825f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f414826g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f414827h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f414828i = null;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f414829j = null;

    /* renamed from: k, reason: collision with root package name */
    public final android.os.AsyncTask f414830k = new t21.j0(this);

    public void a(android.content.Context context, android.content.Intent intent, java.lang.String str, boolean z17, t21.k0 k0Var) {
        this.f414820a = context;
        this.f414824e = intent;
        kk.l lVar = t21.w2.f415056c;
        this.f414825f = t21.c3.a(str);
        this.f414826g = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, this.f414825f, true);
        this.f414827h = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, this.f414825f, true);
        if (z17) {
            this.f414828i = this.f414825f + ya.b.ORIGIN;
            this.f414829j = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22570r, this.f414828i, true);
        }
        this.f414821b = k0Var;
        this.f414830k.execute(new java.lang.String[0]);
    }
}

package d9;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r9.n f227266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f227268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.Format f227269g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f227270h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f227271i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f227272m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f227273n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f227274o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f227275p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f227276q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d9.g f227277r;

    public b(d9.g gVar, r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
        this.f227277r = gVar;
        this.f227266d = nVar;
        this.f227267e = i17;
        this.f227268f = i18;
        this.f227269g = format;
        this.f227270h = i19;
        this.f227271i = obj;
        this.f227272m = j17;
        this.f227273n = j18;
        this.f227274o = j19;
        this.f227275p = j27;
        this.f227276q = j28;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.g gVar = this.f227277r;
        gVar.f227350b.f(this.f227266d, this.f227267e, this.f227268f, this.f227269g, this.f227270h, this.f227271i, d9.g.a(gVar, this.f227272m), d9.g.a(gVar, this.f227273n), this.f227274o, this.f227275p, this.f227276q);
    }
}

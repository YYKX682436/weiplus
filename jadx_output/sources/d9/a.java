package d9;

/* loaded from: classes15.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r9.n f227256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f227258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.Format f227259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f227260h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f227261i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f227262m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f227263n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f227264o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d9.g f227265p;

    public a(d9.g gVar, r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19) {
        this.f227265p = gVar;
        this.f227256d = nVar;
        this.f227257e = i17;
        this.f227258f = i18;
        this.f227259g = format;
        this.f227260h = i19;
        this.f227261i = obj;
        this.f227262m = j17;
        this.f227263n = j18;
        this.f227264o = j19;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.g gVar = this.f227265p;
        gVar.f227350b.w(this.f227256d, this.f227257e, this.f227258f, this.f227259g, this.f227260h, this.f227261i, d9.g.a(gVar, this.f227262m), d9.g.a(gVar, this.f227263n), this.f227264o);
    }
}

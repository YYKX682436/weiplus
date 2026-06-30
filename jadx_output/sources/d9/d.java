package d9;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r9.n f227311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f227313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.Format f227314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f227315h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f227316i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f227317m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f227318n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f227319o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f227320p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f227321q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.io.IOException f227322r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f227323s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d9.g f227324t;

    public d(d9.g gVar, r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28, java.io.IOException iOException, boolean z17) {
        this.f227324t = gVar;
        this.f227311d = nVar;
        this.f227312e = i17;
        this.f227313f = i18;
        this.f227314g = format;
        this.f227315h = i19;
        this.f227316i = obj;
        this.f227317m = j17;
        this.f227318n = j18;
        this.f227319o = j19;
        this.f227320p = j27;
        this.f227321q = j28;
        this.f227322r = iOException;
        this.f227323s = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.g gVar = this.f227324t;
        gVar.f227350b.r(this.f227311d, this.f227312e, this.f227313f, this.f227314g, this.f227315h, this.f227316i, d9.g.a(gVar, this.f227317m), d9.g.a(gVar, this.f227318n), this.f227319o, this.f227320p, this.f227321q, this.f227322r, this.f227323s);
    }
}

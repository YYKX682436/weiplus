package d9;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r9.n f227281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f227283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.Format f227284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f227285h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f227286i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f227287m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f227288n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f227289o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f227290p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f227291q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d9.g f227292r;

    public c(d9.g gVar, r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
        this.f227292r = gVar;
        this.f227281d = nVar;
        this.f227282e = i17;
        this.f227283f = i18;
        this.f227284g = format;
        this.f227285h = i19;
        this.f227286i = obj;
        this.f227287m = j17;
        this.f227288n = j18;
        this.f227289o = j19;
        this.f227290p = j27;
        this.f227291q = j28;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.g gVar = this.f227292r;
        gVar.f227350b.v(this.f227281d, this.f227282e, this.f227283f, this.f227284g, this.f227285h, this.f227286i, d9.g.a(gVar, this.f227287m), d9.g.a(gVar, this.f227288n), this.f227289o, this.f227290p, this.f227291q);
    }
}

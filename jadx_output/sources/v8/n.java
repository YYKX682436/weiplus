package v8;

/* loaded from: classes15.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final v8.g f434014a = new v8.g();

    /* renamed from: b, reason: collision with root package name */
    public q8.o f434015b;

    /* renamed from: c, reason: collision with root package name */
    public q8.g f434016c;

    /* renamed from: d, reason: collision with root package name */
    public v8.i f434017d;

    /* renamed from: e, reason: collision with root package name */
    public long f434018e;

    /* renamed from: f, reason: collision with root package name */
    public long f434019f;

    /* renamed from: g, reason: collision with root package name */
    public long f434020g;

    /* renamed from: h, reason: collision with root package name */
    public int f434021h;

    /* renamed from: i, reason: collision with root package name */
    public int f434022i;

    /* renamed from: j, reason: collision with root package name */
    public v8.l f434023j;

    /* renamed from: k, reason: collision with root package name */
    public long f434024k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f434025l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f434026m;

    public void a(long j17) {
        this.f434020g = j17;
    }

    public abstract long b(t9.p pVar);

    public abstract boolean c(t9.p pVar, long j17, v8.l lVar);

    public void d(boolean z17) {
        if (z17) {
            this.f434023j = new v8.l();
            this.f434019f = 0L;
            this.f434021h = 0;
        } else {
            this.f434021h = 1;
        }
        this.f434018e = -1L;
        this.f434020g = 0L;
    }
}

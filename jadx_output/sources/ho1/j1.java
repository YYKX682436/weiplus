package ho1;

/* loaded from: classes11.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f282728g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282729h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f282730i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f282731m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f282732n;

    public j1(java.lang.String str, long j17, long j18, long j19, ho1.q1 q1Var, long j27, long j28, int i17) {
        this.f282725d = str;
        this.f282726e = j17;
        this.f282727f = j18;
        this.f282728g = j19;
        this.f282729h = q1Var;
        this.f282730i = j27;
        this.f282731m = j28;
        this.f282732n = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm5.v1.a("getChatPackageAsync " + this.f282725d, new ho1.i1(this.f282726e, this.f282725d, this.f282727f, this.f282728g, this.f282729h, this.f282730i, this.f282731m, this.f282732n));
    }
}

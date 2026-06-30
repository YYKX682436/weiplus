package iy4;

/* loaded from: classes11.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f295940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f295941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f295942g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ iy4.g f295943h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f295944i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f295945m;

    public d(java.lang.String str, long j17, long j18, long j19, iy4.g gVar, long j27, int i17) {
        this.f295939d = str;
        this.f295940e = j17;
        this.f295941f = j18;
        this.f295942g = j19;
        this.f295943h = gVar;
        this.f295944i = j27;
        this.f295945m = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm5.v1.a("getChatPackageAsync " + this.f295939d, new iy4.e(this.f295940e, this.f295939d, this.f295941f, this.f295942g, this.f295943h, this.f295944i, this.f295945m));
    }
}

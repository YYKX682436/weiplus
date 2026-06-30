package hr5;

/* loaded from: classes15.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f284362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f284363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f284364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f284365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f284366h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f284367i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284368m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f284369n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f284370o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f284371p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f284372q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ zq5.v f284373r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zq5.v f284374s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(float f17, float f18, float f19, long j17, long j18, long j19, hr5.a1 a1Var, float f27, long j27, boolean z17, long j28, zq5.v vVar, zq5.v vVar2) {
        super(0);
        this.f284362d = f17;
        this.f284363e = f18;
        this.f284364f = f19;
        this.f284365g = j17;
        this.f284366h = j18;
        this.f284367i = j19;
        this.f284368m = a1Var;
        this.f284369n = f27;
        this.f284370o = j27;
        this.f284371p = z17;
        this.f284372q = j28;
        this.f284373r = vVar;
        this.f284374s = vVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float f17 = this.f284362d;
        float f18 = this.f284363e;
        float f19 = f17 - f18;
        float f27 = this.f284364f - f18;
        long j17 = this.f284365g;
        long j18 = this.f284366h;
        return this.f284368m.f284278b + ". scale. targetScale=" + zq5.b.c(this.f284369n, 4) + ", centroidContentPoint=" + zq5.m.e(this.f284370o) + ", animated=" + this.f284371p + ". touchPoint=" + zq5.m.e(this.f284372q) + ", targetUserScale=" + zq5.b.c(f17, 4) + ", addUserScale=" + zq5.b.c(f19, 4) + " -> " + zq5.b.c(f27, 4) + ", addUserOffset=" + zq5.m.e(zq5.l.d(j17, j18)) + " -> " + zq5.m.e(zq5.l.d(this.f284367i, j18)) + ", userTransform=" + zq5.w.c(this.f284373r) + " -> " + zq5.w.c(this.f284374s);
    }
}

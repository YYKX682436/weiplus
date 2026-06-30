package hr5;

/* loaded from: classes15.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f284310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f284311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f284312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f284313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f284314h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f284315i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284316m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f284317n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f284318o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f284319p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f284320q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ zq5.v f284321r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zq5.v f284322s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(float f17, float f18, float f19, long j17, long j18, long j19, hr5.a1 a1Var, long j27, float f27, long j28, float f28, zq5.v vVar, zq5.v vVar2) {
        super(0);
        this.f284310d = f17;
        this.f284311e = f18;
        this.f284312f = f19;
        this.f284313g = j17;
        this.f284314h = j18;
        this.f284315i = j19;
        this.f284316m = a1Var;
        this.f284317n = j27;
        this.f284318o = f27;
        this.f284319p = j28;
        this.f284320q = f28;
        this.f284321r = vVar;
        this.f284322s = vVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float f17 = this.f284310d;
        float f18 = this.f284311e;
        float f19 = this.f284312f;
        long j17 = this.f284313g;
        long j18 = this.f284314h;
        long d17 = zq5.l.d(j17, j18);
        long j19 = this.f284315i;
        return this.f284316m.f284278b + ". gestureTransform. centroid=" + zq5.m.e(this.f284317n) + ", zoomChange=" + zq5.b.c(this.f284318o, 4) + ", userScale=" + zq5.b.c(f18, 4) + " -> " + zq5.b.c(f17, 4) + '(' + zq5.b.c(f17 - f18, 4) + ") -> " + zq5.b.c(f19, 4) + '(' + zq5.b.c(f19 - f18, 4) + "), panChange=" + zq5.m.e(this.f284319p) + ", userOffset=" + zq5.m.e(j18) + " -> " + zq5.m.e(j17) + '(' + zq5.m.e(d17) + ") -> " + zq5.m.e(j19) + '(' + zq5.m.e(zq5.l.d(j19, j18)) + "), rotationChange=" + zq5.b.c(this.f284320q, 4) + ". userTransform=" + zq5.w.c(this.f284321r) + " -> " + zq5.w.c(this.f284322s);
    }
}

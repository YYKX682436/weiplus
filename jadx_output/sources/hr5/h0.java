package hr5;

/* loaded from: classes15.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq5.l f284349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f284350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f284351g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f284352h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zq5.n f284353i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f284354m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zq5.v f284355n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zq5.v f284356o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(hr5.a1 a1Var, zq5.l lVar, float f17, float f18, float f19, zq5.n nVar, long j17, zq5.v vVar, zq5.v vVar2) {
        super(0);
        this.f284348d = a1Var;
        this.f284349e = lVar;
        this.f284350f = f17;
        this.f284351g = f18;
        this.f284352h = f19;
        this.f284353i = nVar;
        this.f284354m = j17;
        this.f284355n = vVar;
        this.f284356o = vVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f284348d.f284278b);
        sb6.append(". rollback. focus=");
        zq5.l lVar = this.f284349e;
        sb6.append(lVar != null ? zq5.m.e(lVar.f475080a) : null);
        sb6.append(". currentScale=");
        sb6.append(zq5.b.c(this.f284350f, 4));
        sb6.append(", minScale=");
        sb6.append(zq5.b.c(this.f284351g, 4));
        sb6.append(", maxScale=");
        sb6.append(zq5.b.c(this.f284352h, 4));
        sb6.append(", userOffsetBoundsRect=");
        sb6.append(zq5.o.e(this.f284353i));
        sb6.append(", currentUserOffset=");
        sb6.append(zq5.m.e(this.f284354m));
        sb6.append(", currentUserTransform=");
        sb6.append(zq5.w.c(this.f284355n));
        sb6.append(", newUserTransform=");
        sb6.append(zq5.w.c(this.f284356o));
        return sb6.toString();
    }
}

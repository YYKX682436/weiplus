package hr5;

/* loaded from: classes15.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f284491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f284492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zq5.v f284493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f284494h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hr5.a1 a1Var, long j17, long j18, zq5.v vVar, boolean z17) {
        super(0);
        this.f284490d = a1Var;
        this.f284491e = j17;
        this.f284492f = j18;
        this.f284493g = vVar;
        this.f284494h = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f284490d.f284278b + ". fling. running. velocity=" + ((java.lang.Object) zq5.l.g(this.f284491e)) + ". startUserOffset=" + zq5.m.e(this.f284492f) + ", currentUserOffset=" + zq5.w.c(this.f284493g) + ", continue1=" + this.f284494h;
    }
}

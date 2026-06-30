package hr5;

/* loaded from: classes15.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f284482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zq5.n f284483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f284484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(hr5.a1 a1Var, long j17, zq5.n nVar, long j18) {
        super(0);
        this.f284481d = a1Var;
        this.f284482e = j17;
        this.f284483f = nVar;
        this.f284484g = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f284481d.f284278b + ". fling. start. startUserOffset=" + zq5.m.e(this.f284482e) + ", userOffsetBounds=" + zq5.o.e(this.f284483f) + ", velocity=" + zq5.m.e(this.f284484g);
    }
}

package hr5;

/* loaded from: classes15.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq5.n f284274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f284275f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(hr5.a1 a1Var, zq5.n nVar, long j17) {
        super(0);
        this.f284273d = a1Var;
        this.f284274e = nVar;
        this.f284275f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        hr5.a1 a1Var = this.f284273d;
        sb6.append(a1Var.f284278b);
        sb6.append(". fling. end. offset=");
        sb6.append(zq5.m.e(a1Var.f284296t.f475096b));
        sb6.append(", bounds=");
        sb6.append(zq5.o.e(this.f284274e));
        sb6.append(", velocity=");
        sb6.append(zq5.m.e(this.f284275f));
        return sb6.toString();
    }
}

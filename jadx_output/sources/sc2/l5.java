package sc2;

/* loaded from: classes2.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f406048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f406049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406050f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(sc2.d6 d6Var, r45.h32 h32Var, xc2.p0 p0Var) {
        super(0);
        this.f406048d = d6Var;
        this.f406049e = h32Var;
        this.f406050f = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc2.d6 d6Var = this.f406048d;
        android.view.View view = d6Var.f3143d;
        if (view != null) {
            java.lang.Object obj = sc2.d6.A;
            d6Var.U(this.f406049e, this.f406050f, view);
        }
        return jz5.f0.f302826a;
    }
}

package j0;

/* loaded from: classes14.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.g0 f296420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f296422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.l f296423g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(g2.g0 g0Var, j0.c5 c5Var, g2.e0 e0Var, g2.l lVar) {
        super(1);
        this.f296420d = g0Var;
        this.f296421e = c5Var;
        this.f296422f = e0Var;
        this.f296423g = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        if (this.f296420d != null) {
            j0.c5 c5Var = this.f296421e;
            if (c5Var.b()) {
                c5Var.f296236d = j0.t3.f296570a.a(this.f296420d, this.f296422f, c5Var.f296235c, this.f296423g, c5Var.f296247o, c5Var.f296248p);
            }
        }
        return new j0.k0();
    }
}

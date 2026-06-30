package zv0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f476179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f476180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rv0.n1 n1Var, ex0.a0 a0Var) {
        super(0);
        this.f476179d = n1Var;
        this.f476180e = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rv0.n1 n1Var = this.f476179d;
        gx0.bf p76 = n1Var.p7();
        p76.getClass();
        com.tencent.maas.model.time.MJTimeRange PositiveInfiniteTimeRange = com.tencent.maas.model.time.MJTimeRange.PositiveInfiniteTimeRange;
        kotlin.jvm.internal.o.f(PositiveInfiniteTimeRange, "PositiveInfiniteTimeRange");
        p76.o7(PositiveInfiniteTimeRange, true);
        n1Var.p7().D = -1;
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new zv0.g(n1Var, null), 3, null);
        ex0.i0.m(this.f476180e);
        n1Var.x7();
        n1Var.f400137y = null;
        return jz5.f0.f302826a;
    }
}

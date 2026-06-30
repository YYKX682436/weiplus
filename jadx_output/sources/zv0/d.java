package zv0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f476164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f476165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f476166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.j0 f476167g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zv0.f0 f0Var, rv0.n1 n1Var, ex0.a0 a0Var, ex0.j0 j0Var) {
        super(2);
        this.f476164d = f0Var;
        this.f476165e = n1Var;
        this.f476166f = a0Var;
        this.f476167g = j0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zv0.r transitionInfo = (zv0.r) obj;
        kotlin.jvm.internal.o.g(transitionInfo, "transitionInfo");
        kotlin.jvm.internal.o.g((ex0.j0) obj2, "<anonymous parameter 1>");
        this.f476164d.J();
        kotlinx.coroutines.l.d(this.f476165e.getMainScope(), null, null, new zv0.c(this.f476165e, transitionInfo, this.f476166f, this.f476167g, this.f476164d, null), 3, null);
        return jz5.f0.f302826a;
    }
}

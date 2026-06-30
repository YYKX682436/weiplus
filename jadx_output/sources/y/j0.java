package y;

/* loaded from: classes14.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f458371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f458372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f458373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0.e5 e5Var, n0.e5 e5Var2, n0.e5 e5Var3) {
        super(1);
        this.f458371d = e5Var;
        this.f458372e = e5Var2;
        this.f458373f = e5Var3;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e1.e0 graphicsLayer = (e1.e0) obj;
        kotlin.jvm.internal.o.g(graphicsLayer, "$this$graphicsLayer");
        e1.x0 x0Var = (e1.x0) graphicsLayer;
        x0Var.f246297f = ((java.lang.Number) this.f458371d.getValue()).floatValue();
        n0.e5 e5Var = this.f458372e;
        x0Var.f246295d = ((java.lang.Number) e5Var.getValue()).floatValue();
        x0Var.f246296e = ((java.lang.Number) e5Var.getValue()).floatValue();
        x0Var.f246307s = ((e1.i1) this.f458373f.getValue()).f246274a;
        return jz5.f0.f302826a;
    }
}

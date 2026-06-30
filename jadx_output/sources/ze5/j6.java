package ze5;

/* loaded from: classes9.dex */
public final class j6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.k6 f472031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f472032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472033f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(ze5.k6 k6Var, rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f472031d = k6Var;
        this.f472032e = dVar;
        this.f472033f = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.m6 it = (ze5.m6) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ze5.k6 k6Var = this.f472031d;
        rd5.d dVar = this.f472032e;
        yb5.d dVar2 = this.f472033f;
        k6Var.V(it, dVar, dVar2.t(), dVar2.D(), this.f472033f, this.f472031d);
        return jz5.f0.f302826a;
    }
}

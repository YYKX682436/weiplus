package ze5;

/* loaded from: classes9.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.y1 f472241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f472242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(ze5.y1 y1Var, rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f472241d = y1Var;
        this.f472242e = dVar;
        this.f472243f = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.g1 holder = (ze5.g1) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        ze5.y1 y1Var = this.f472241d;
        rd5.d dVar = this.f472242e;
        yb5.d dVar2 = this.f472243f;
        y1Var.V(holder, dVar, dVar2.t(), dVar2.D(), this.f472243f, this.f472241d);
        return jz5.f0.f302826a;
    }
}

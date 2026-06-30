package ze5;

/* loaded from: classes9.dex */
public final class v4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.y4 f472248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f472250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472251g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(ze5.y4 y4Var, com.tencent.mm.storage.f9 f9Var, rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f472248d = y4Var;
        this.f472249e = f9Var;
        this.f472250f = dVar;
        this.f472251g = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.t4 it = (ze5.t4) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f472248d.Z(it, this.f472249e.P0() < 2, true);
        ze5.y4 y4Var = this.f472248d;
        rd5.d dVar = this.f472250f;
        yb5.d dVar2 = this.f472251g;
        y4Var.V(it, dVar, dVar2.t(), dVar2.D(), this.f472251g, this.f472248d);
        return jz5.f0.f302826a;
    }
}

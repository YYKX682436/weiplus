package ze5;

/* loaded from: classes9.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.g4 f471875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f471877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(ze5.g4 g4Var, com.tencent.mm.storage.f9 f9Var, rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f471875d = g4Var;
        this.f471876e = f9Var;
        this.f471877f = dVar;
        this.f471878g = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.b4 it = (ze5.b4) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f471875d.Z(it, this.f471876e.P0() < 2, true);
        ze5.g4 g4Var = this.f471875d;
        rd5.d dVar = this.f471877f;
        yb5.d dVar2 = this.f471878g;
        g4Var.V(it, dVar, dVar2.t(), dVar2.D(), this.f471878g, this.f471875d);
        return jz5.f0.f302826a;
    }
}

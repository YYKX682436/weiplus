package ze5;

/* loaded from: classes9.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.q3 f472084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f472085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(ze5.q3 q3Var, rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f472084d = q3Var;
        this.f472085e = dVar;
        this.f472086f = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.y2 holder = (ze5.y2) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        ze5.q3 q3Var = this.f472084d;
        rd5.d dVar = this.f472085e;
        yb5.d dVar2 = this.f472086f;
        q3Var.V(holder, dVar, dVar2.t(), dVar2.D(), this.f472086f, this.f472084d);
        return jz5.f0.f302826a;
    }
}

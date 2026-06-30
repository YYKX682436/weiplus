package k0;

/* loaded from: classes14.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.f f302905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f302906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(p2.f fVar, n0.v2 v2Var) {
        super(1);
        this.f302905d = fVar;
        this.f302906e = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17 = ((p2.k) obj).f351387a;
        float b17 = p2.k.b(j17);
        p2.f fVar = this.f302905d;
        this.f302906e.setValue(new p2.q(p2.r.a(fVar.G(b17), fVar.G(p2.k.a(j17)))));
        return jz5.f0.f302826a;
    }
}

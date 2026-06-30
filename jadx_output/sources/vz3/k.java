package vz3;

/* loaded from: classes15.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz3.q f441687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vz3.q qVar) {
        super(1);
        this.f441687d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        vz3.q qVar = this.f441687d;
        if (booleanValue) {
            vz3.j jVar = new vz3.j(qVar);
            qVar.getClass();
            ((ku5.t0) ku5.t0.f312615d).h(new vz3.m(jVar), "MicroMsg.AffScanGoodsQueue");
        } else {
            vz3.q.n(qVar);
        }
        return jz5.f0.f302826a;
    }
}

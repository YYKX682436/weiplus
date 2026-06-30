package mz0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(mz0.b2 b2Var) {
        super(0);
        this.f333011d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = this.f333011d;
        dz0.d l76 = b2Var.l7();
        dz0.v vVar = (dz0.v) l76;
        kotlinx.coroutines.l.d(vVar.f245035g.getMainScope(), null, null, new dz0.p(false, vVar, new mz0.n(b2Var), vVar.f245035g, null), 3, null);
        return jz5.f0.f302826a;
    }
}

package uw0;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.e1 f431529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.u0 f431530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(uw0.e1 e1Var, uw0.u0 u0Var) {
        super(0);
        this.f431529d = e1Var;
        this.f431530e = u0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (((ow0.a0) ((jz5.n) this.f431529d.f431550v).getValue()).X6() && this.f431530e.getSelectedTabPage() == ov0.e.f349125e) {
            uw0.e1 e1Var = this.f431529d;
            pf5.e.launchUI$default(e1Var, null, null, new uw0.z0(e1Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

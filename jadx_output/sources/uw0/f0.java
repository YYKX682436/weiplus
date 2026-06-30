package uw0;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f431557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.x f431558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(uw0.t0 t0Var, uw0.x xVar) {
        super(0);
        this.f431557d = t0Var;
        this.f431558e = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f431557d.I7().X6() && this.f431558e.getSelectedTabPage() == ov0.e.f349125e) {
            uw0.t0 t0Var = this.f431557d;
            pf5.e.launchUI$default(t0Var, null, null, new uw0.e0(t0Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

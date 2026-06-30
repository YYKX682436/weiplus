package sc2;

/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f406351f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var) {
        super(0);
        this.f406349d = h1Var;
        this.f406350e = s0Var;
        this.f406351f = t01Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V5).getValue()).r()).booleanValue()) {
            sc2.h1 h1Var = this.f406349d;
            com.tencent.mm.plugin.finder.view.s2 s2Var = h1Var.Z;
            boolean z17 = s2Var != null && s2Var.isShowing();
            r45.t01 t01Var = this.f406351f;
            in5.s0 s0Var = this.f406350e;
            if (z17) {
                com.tencent.mm.plugin.finder.view.s2 s2Var2 = h1Var.Z;
                if (s2Var2 != null) {
                    s2Var2.setOnDismissListener(new sc2.w0(h1Var, s0Var, t01Var));
                }
            } else {
                h1Var.A1 = com.tencent.mm.plugin.finder.report.g3.f125046f;
                h1Var.P(s0Var, true, true, t01Var);
            }
        }
        return jz5.f0.f302826a;
    }
}

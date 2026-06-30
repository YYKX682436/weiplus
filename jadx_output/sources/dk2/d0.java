package dk2;

/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f233303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f233304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233305f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(dk2.g0 g0Var, int i17, java.lang.String str) {
        super(0);
        this.f233303d = g0Var;
        this.f233304e = i17;
        this.f233305f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.g0 g0Var = this.f233303d;
        if (g0Var.f233470c == 5) {
            int i17 = this.f233304e;
            if (i17 > 0) {
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = g0Var.f233469b;
                if (k0Var != null) {
                    k0Var.updateVerificationButtonState(dk2.g0.b(g0Var, this.f233305f, i17), false);
                }
            } else {
                com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = g0Var.f233469b;
                if (k0Var2 != null) {
                    k0Var2.updateVerificationButtonState(g0Var.f233476i, true);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

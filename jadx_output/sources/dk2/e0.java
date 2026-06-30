package dk2;

/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f233335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(dk2.g0 g0Var) {
        super(0);
        this.f233335d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var;
        dk2.g0 g0Var = this.f233335d;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = g0Var.f233469b;
        android.content.Context context = k0Var2 != null ? k0Var2.getContext() : null;
        if (context != null) {
            java.lang.CharSequence b17 = dk2.g0.b(g0Var, g0Var.f233477j, g0Var.f233473f);
            int i17 = g0Var.f233470c;
            if (i17 == 1 || i17 == 2) {
                com.tencent.mm.plugin.finder.live.view.k0 k0Var3 = g0Var.f233469b;
                if (k0Var3 != null) {
                    if (b17 == null) {
                        b17 = context.getString(com.tencent.mm.R.string.d5r, java.lang.Integer.valueOf(g0Var.f233473f));
                        kotlin.jvm.internal.o.f(b17, "getString(...)");
                    }
                    k0Var3.updateVerificationCountDownTip(b17);
                }
            } else if (i17 == 3) {
                com.tencent.mm.plugin.finder.live.view.k0 k0Var4 = g0Var.f233469b;
                if (k0Var4 != null) {
                    if (b17 == null) {
                        b17 = context.getString(com.tencent.mm.R.string.d5q, java.lang.Integer.valueOf(g0Var.f233473f));
                        kotlin.jvm.internal.o.f(b17, "getString(...)");
                    }
                    k0Var4.updateVerificationCountDownTip(b17);
                }
            } else if (i17 == 5 && (k0Var = g0Var.f233469b) != null) {
                k0Var.updateVerificationCountDownTip(b17);
            }
        }
        return jz5.f0.f302826a;
    }
}

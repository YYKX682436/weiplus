package ey2;

/* loaded from: classes2.dex */
public final class u1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey2.z1 f257543a;

    public u1(ey2.z1 z1Var) {
        this.f257543a = z1Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        ey2.z1 z1Var = this.f257543a;
        z1Var.N6().f257347f = z17;
        com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.U.getValue();
        if (z17) {
            boolean z18 = false;
            if (z9Var != null && z9Var.f105327a) {
                z18 = true;
            }
            if (z18) {
                z1Var.W6(z9Var);
                return;
            }
        }
        z1Var.Q6();
    }
}

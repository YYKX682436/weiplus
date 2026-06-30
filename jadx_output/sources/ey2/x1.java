package ey2;

/* loaded from: classes2.dex */
public final class x1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey2.z1 f257567a;

    public x1(ey2.z1 z1Var) {
        this.f257567a = z1Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        ey2.z1 z1Var = this.f257567a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", "enterFindPage isEnable=" + z1Var.f257595h);
        } else if (z1Var.f257595h) {
            if (!z1Var.f257596i) {
                z1Var.T6(1);
                z1Var.S6(z1Var.P6(1));
            }
            z1Var.f257596i = false;
        }
    }
}

package hu3;

/* loaded from: classes5.dex */
public final class t implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285198d;

    public t(hu3.n0 n0Var) {
        this.f285198d = n0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        int i17 = ((zt3.b) obj).f475585a;
        hu3.n0 n0Var = this.f285198d;
        if (i17 == 1) {
            n0Var.f285161e.S6(5, new hu3.m(n0Var));
            hu3.q qVar = new hu3.q(n0Var);
            zt3.a aVar = n0Var.f285161e;
            aVar.S6(6, qVar);
            aVar.S6(7, new hu3.r(n0Var));
            return;
        }
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "EVENT_CAMERA_FIRST_FRAME >> " + n0Var.D);
            if (n0Var.D) {
                n0Var.D = false;
                hu3.n0.b(n0Var).setVisibility(0);
                n0Var.n();
                kotlinx.coroutines.y0 y0Var = n0Var.f285163g;
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new hu3.s(n0Var, null), 2, null);
            }
        }
    }
}

package kc2;

/* loaded from: classes15.dex */
public final class r implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f306481d;

    public r(java.lang.ref.WeakReference rFreqController) {
        kotlin.jvm.internal.o.g(rFreqController, "rFreqController");
        this.f306481d = rFreqController;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        zy2.w7 w7Var = (zy2.w7) this.f306481d.get();
        if (w7Var != null) {
            kc2.g1 g1Var = (kc2.g1) w7Var;
            g1Var.k().post(new kc2.c1(g1Var));
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        zy2.w7 w7Var = (zy2.w7) this.f306481d.get();
        if (w7Var != null) {
            kc2.g1 g1Var = (kc2.g1) w7Var;
            g1Var.k().post(new kc2.e1(g1Var));
        }
    }
}

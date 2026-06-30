package im2;

/* loaded from: classes3.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292580d;

    public v2(im2.z3 z3Var) {
        this.f292580d = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        im2.z3 z3Var = this.f292580d;
        if (z3Var.P1 == null) {
            z3Var.P1 = new com.tencent.mm.ui.tools.f5(z3Var.getActivity());
            im2.z3 z3Var2 = this.f292580d;
            com.tencent.mm.ui.tools.f5 f5Var = z3Var2.P1;
            if (f5Var != null) {
                f5Var.f210400e = new im2.u2(z3Var2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f292580d.P1;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}

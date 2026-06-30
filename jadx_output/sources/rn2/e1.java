package rn2;

/* loaded from: classes8.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.f1 f397717d;

    public e1(rn2.f1 f1Var) {
        this.f397717d = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rn2.f1 f1Var = this.f397717d;
        if (f1Var.f397732g == null) {
            f1Var.f397732g = new com.tencent.mm.ui.tools.f5(f1Var.getActivity());
            rn2.f1 f1Var2 = this.f397717d;
            com.tencent.mm.ui.tools.f5 f5Var = f1Var2.f397732g;
            if (f5Var != null) {
                f5Var.f210400e = new rn2.d1(f1Var2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f397717d.f397732g;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}

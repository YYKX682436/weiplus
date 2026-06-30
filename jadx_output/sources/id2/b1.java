package id2;

/* loaded from: classes3.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290489d;

    public b1(id2.v1 v1Var) {
        this.f290489d = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        id2.v1 v1Var = this.f290489d;
        if (v1Var.M == null) {
            v1Var.M = new com.tencent.mm.ui.tools.f5(v1Var.getActivity());
            id2.v1 v1Var2 = this.f290489d;
            com.tencent.mm.ui.tools.f5 f5Var = v1Var2.M;
            if (f5Var != null) {
                f5Var.f210400e = new id2.a1(v1Var2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f290489d.M;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}

package um2;

/* loaded from: classes3.dex */
public final class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429113d;

    public z4(um2.x5 x5Var) {
        this.f429113d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = ((mm2.n0) this.f429113d.c(mm2.n0.class)).f329273r ? 16 : 2;
        um2.x5 x5Var = this.f429113d;
        dk2.xf h17 = x5Var.h();
        if (h17 != null) {
            ((dk2.r4) h17).B(i17, 0, new um2.o5(x5Var, true));
        }
    }
}

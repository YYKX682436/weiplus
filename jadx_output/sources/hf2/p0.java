package hf2;

/* loaded from: classes5.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f281135d;

    public p0(hf2.y0 y0Var) {
        this.f281135d = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        com.tencent.mm.ui.MMActivity N6 = this.f281135d.f281200a.N6();
        android.view.WindowManager.LayoutParams attributes = (N6 == null || (window = N6.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.softInputMode = 48;
        }
        hf2.y0 y0Var = this.f281135d;
        if (y0Var.f281203d == null) {
            y0Var.f281203d = new com.tencent.mm.ui.tools.f5(y0Var.f281200a.N6());
            hf2.y0 y0Var2 = this.f281135d;
            com.tencent.mm.ui.tools.f5 f5Var = y0Var2.f281203d;
            if (f5Var != null) {
                f5Var.f210400e = new hf2.o0(y0Var2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f281135d.f281203d;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}

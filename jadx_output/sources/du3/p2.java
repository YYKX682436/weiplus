package du3;

/* loaded from: classes3.dex */
public final class p2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.s2 f243677d;

    public p2(du3.s2 s2Var) {
        this.f243677d = s2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        hk0.y0 y0Var = (hk0.y0) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeDoodleState >> ");
        sb6.append(y0Var.f281846a);
        sb6.append(", ");
        hk0.z0 z0Var = y0Var.f281847b;
        sb6.append(z0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoMosaicPlugin", sb6.toString());
        hk0.z0 z0Var2 = y0Var.f281846a;
        if (z0Var == z0Var2) {
            return;
        }
        du3.s2 s2Var = this.f243677d;
        s2Var.getClass();
        hk0.z0 z0Var3 = hk0.z0.f281865g;
        android.widget.FrameLayout frameLayout = null;
        boolean z17 = y0Var.f281848c;
        if (z0Var == z0Var3) {
            s2Var.B().setBackground(null);
        } else {
            int ordinal = z0Var.ordinal();
            android.widget.FrameLayout A = ordinal != 1 ? ordinal != 2 ? null : s2Var.A() : s2Var.C();
            if (A != null) {
                if (z17) {
                    s2Var.z(A, 1.0f);
                } else {
                    A.setScaleY(1.0f);
                    A.setScaleY(1.0f);
                }
            }
        }
        if (z0Var2 == z0Var3) {
            s2Var.B().setBackground(i65.a.i(s2Var.f243697f.getContext(), com.tencent.mm.R.drawable.cjs));
            return;
        }
        int ordinal2 = z0Var2.ordinal();
        if (ordinal2 == 1) {
            frameLayout = s2Var.C();
        } else if (ordinal2 == 2) {
            frameLayout = s2Var.A();
        }
        if (frameLayout == null) {
            return;
        }
        if (z17) {
            s2Var.z(frameLayout, 1.4f);
        } else {
            frameLayout.setScaleX(1.4f);
            frameLayout.setScaleY(1.4f);
        }
    }
}

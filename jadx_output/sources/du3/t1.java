package du3;

/* loaded from: classes3.dex */
public final class t1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f243715d;

    public t1(du3.g2 g2Var) {
        this.f243715d = g2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        int d17;
        du3.g2 g2Var = this.f243715d;
        java.lang.Object value = ((jz5.n) g2Var.f243594p).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) value;
        boolean z17 = ((hk0.o) obj).f281783b;
        android.view.ViewGroup viewGroup = g2Var.f243587f;
        if (z17) {
            hk0.z0 S6 = g2Var.C().S6();
            int ordinal = S6.ordinal();
            if (ordinal == 0 || ordinal == 3) {
                g2Var.C().g7(hk0.z0.f281863e, false);
            } else {
                g2Var.C().g7(S6, false);
            }
            d17 = i65.a.d(viewGroup.getContext(), com.tencent.mm.R.color.ac7);
        } else {
            d17 = i65.a.d(viewGroup.getContext(), com.tencent.mm.R.color.f479273ac5);
        }
        weImageView.setIconColor(d17);
        du3.g2.z(g2Var);
    }
}

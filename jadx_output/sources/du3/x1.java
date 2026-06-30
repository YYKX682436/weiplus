package du3;

/* loaded from: classes3.dex */
public final class x1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f243765d;

    public x1(du3.g2 g2Var) {
        this.f243765d = g2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        int d17;
        du3.g2 g2Var = this.f243765d;
        java.lang.Object value = ((jz5.n) g2Var.f243590i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) value;
        boolean z17 = ((hk0.o) obj).f281783b;
        android.view.ViewGroup viewGroup = g2Var.f243587f;
        if (z17) {
            hk0.e T6 = g2Var.C().T6();
            int ordinal = T6.f281724a.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                g2Var.C().b7(new hk0.e(hk0.h.f281740e, -707825, 2));
            } else {
                g2Var.C().b7(T6);
            }
            d17 = i65.a.d(viewGroup.getContext(), com.tencent.mm.R.color.ac7);
        } else {
            d17 = i65.a.d(viewGroup.getContext(), com.tencent.mm.R.color.f479273ac5);
        }
        weImageView.setIconColor(d17);
        du3.g2.z(g2Var);
    }
}

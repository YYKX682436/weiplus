package du3;

/* loaded from: classes3.dex */
public final class u1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f243740d;

    public u1(du3.g2 g2Var) {
        this.f243740d = g2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        du3.g2 g2Var = this.f243740d;
        com.tencent.mm.ui.widget.imageview.WeImageView A = g2Var.A();
        boolean z17 = ((hk0.o) obj).f281783b;
        android.view.ViewGroup viewGroup = g2Var.f243587f;
        A.setIconColor(z17 ? i65.a.d(viewGroup.getContext(), com.tencent.mm.R.color.ac7) : i65.a.d(viewGroup.getContext(), com.tencent.mm.R.color.f479273ac5));
        du3.g2.z(g2Var);
    }
}

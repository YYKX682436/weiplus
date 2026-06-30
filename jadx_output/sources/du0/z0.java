package du0;

/* loaded from: classes5.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.b1 f243459d;

    public z0(du0.b1 b1Var) {
        this.f243459d = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/common/uic/MusicRecommendedUseUIC$musicTipView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        du0.b1 b1Var = this.f243459d;
        yy0.m7 m7Var = (yy0.m7) ((du0.v0) ((jz5.n) b1Var.f243329e).getValue()).O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.b5(m7Var, null), 3, null);
        du0.w0 w0Var = b1Var.f243330f;
        if (w0Var != null) {
            ((gx0.e6) w0Var).f276363a.U6().r7(zw0.b.f476551e);
        }
        b1Var.O6();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/common/uic/MusicRecommendedUseUIC$musicTipView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

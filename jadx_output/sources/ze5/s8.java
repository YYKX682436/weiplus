package ze5;

/* loaded from: classes9.dex */
public final class s8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.w8 f472192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f472194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(ze5.w8 w8Var, yb5.d dVar, rd5.d dVar2) {
        super(1);
        this.f472192d = w8Var;
        this.f472193e = dVar;
        this.f472194f = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.LinearLayout linearLayout;
        android.widget.FrameLayout frameLayout;
        ze5.n8 it = (ze5.n8) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.LinearLayout linearLayout2 = it.f472113e;
        ze5.w8 w8Var = this.f472192d;
        if (linearLayout2 != null) {
            ze5.y8.b(w8Var.f0(it), linearLayout2, this.f472193e, this.f472194f, it);
        }
        if (w8Var.M() && (linearLayout = it.f472113e) != null && (frameLayout = it.f472110b) != null) {
            java.lang.Object parent = linearLayout.getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view != null) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (!n3.x0.c(view) || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new ze5.v8(linearLayout, frameLayout));
                } else {
                    int width = linearLayout.getWidth();
                    int width2 = frameLayout.getWidth();
                    if (width > 0 && width2 > 0) {
                        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            float f17 = width < width2 ? 0.0f : 1.0f;
                            if (!(layoutParams2.f10915z == f17)) {
                                layoutParams2.f10915z = f17;
                                linearLayout.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

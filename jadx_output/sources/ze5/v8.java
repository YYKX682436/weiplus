package ze5;

/* loaded from: classes4.dex */
public final class v8 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f472261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f472262e;

    public v8(android.widget.LinearLayout linearLayout, android.widget.FrameLayout frameLayout) {
        this.f472261d = linearLayout;
        this.f472262e = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        android.widget.LinearLayout linearLayout = this.f472261d;
        int width = linearLayout.getWidth();
        int width2 = this.f472262e.getWidth();
        if (width <= 0 || width2 <= 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        float f17 = width < width2 ? 0.0f : 1.0f;
        if (layoutParams2.f10915z == f17) {
            return;
        }
        layoutParams2.f10915z = f17;
        linearLayout.setLayoutParams(layoutParams2);
    }
}

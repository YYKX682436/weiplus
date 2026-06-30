package ex4;

/* loaded from: classes3.dex */
public final class n implements com.tencent.xweb.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ex4.o f257224a;

    public n(ex4.o oVar) {
        this.f257224a = oVar;
    }

    @Override // com.tencent.xweb.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return true;
    }

    @Override // com.tencent.xweb.g1
    public void b(int i17) {
        ex4.o oVar = this.f257224a;
        com.tencent.mm.ui.widget.MMWebView mMWebView = oVar.f257232h;
        if (mMWebView != null) {
            int scale = (int) (mMWebView.getScale() * i17);
            android.widget.FrameLayout frameLayout = oVar.f257230f;
            int measuredHeight = frameLayout != null ? frameLayout.getMeasuredHeight() : 0;
            if (scale < measuredHeight) {
                scale = measuredHeight;
            }
            android.view.View view = oVar.f257233i;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = scale + 2;
            android.view.View view2 = oVar.f257233i;
            if (view2 == null) {
                return;
            }
            view2.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.xweb.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        android.view.View view2;
        kotlin.jvm.internal.o.g(view, "view");
        ex4.o oVar = this.f257224a;
        android.view.View view3 = oVar.f257237m;
        if ((view3 != null ? view3.getVisibility() : 8) == 0 && (view2 = oVar.f257237m) != null) {
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, ((java.lang.Number) ((jz5.n) oVar.f257226b).getValue()).intValue() - ((java.lang.Number) ((jz5.n) oVar.f257225a).getValue()).intValue());
            translateAnimation.setDuration(80L);
            translateAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator());
            translateAnimation.setAnimationListener(new ex4.i(oVar));
            view2.startAnimation(translateAnimation);
        }
    }

    @Override // com.tencent.xweb.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}

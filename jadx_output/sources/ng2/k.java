package ng2;

/* loaded from: classes10.dex */
public final class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f336971d;

    public k(ng2.s sVar) {
        this.f336971d = sVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        ng2.s sVar = this.f336971d;
        int i17 = sVar.q().top - ((int) ((sVar.q().top - sVar.s().top) * floatValue));
        int i18 = sVar.q().left - ((int) ((sVar.q().left - sVar.s().left) * floatValue));
        int width = sVar.q().width() - ((int) ((sVar.q().width() - sVar.s().width()) * floatValue));
        int height = sVar.q().height() - ((int) (floatValue * (sVar.q().height() - sVar.s().height())));
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = sVar.f318573t;
        android.view.ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout != null ? roundedCornerFrameLayout.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i17;
        marginLayoutParams.leftMargin = i18;
        marginLayoutParams.width = width;
        marginLayoutParams.height = height;
        ig2.q qVar = sVar.f336987v;
        if (qVar != null) {
            qVar.a(width, height);
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout2 = sVar.f318573t;
        if (roundedCornerFrameLayout2 != null) {
            roundedCornerFrameLayout2.requestLayout();
        }
        com.tencent.mars.xlog.Log.i(sVar.f318557e, "topMargin = " + marginLayoutParams.topMargin + " leftMargin = " + marginLayoutParams.leftMargin + " width = " + width + " height = " + height);
    }
}

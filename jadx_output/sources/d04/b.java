package d04;

/* loaded from: classes8.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView f225378d;

    public b(float f17, float f18, com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView baseScrollTabView) {
        this.f225378d = baseScrollTabView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView baseScrollTabView = this.f225378d;
        boolean z17 = baseScrollTabView.D;
        baseScrollTabView.canVibrate = true;
        baseScrollTabView.c(baseScrollTabView.f159671i);
        if (z17) {
            if (baseScrollTabView.f159679t != 2) {
                baseScrollTabView.f159679t = 2;
                d04.i3 i3Var = baseScrollTabView.f159678s;
                if (i3Var != null) {
                    i3Var.a(2);
                    return;
                }
                return;
            }
            return;
        }
        if (z17 || baseScrollTabView.f159679t == 3) {
            return;
        }
        baseScrollTabView.f159679t = 3;
        d04.i3 i3Var2 = baseScrollTabView.f159678s;
        if (i3Var2 != null) {
            i3Var2.a(3);
        }
    }
}

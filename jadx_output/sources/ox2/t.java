package ox2;

/* loaded from: classes2.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349710e;

    public t(android.view.View view, android.view.View view2) {
        this.f349709d = view;
        this.f349710e = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f349709d;
        if (weImageView != null) {
            weImageView.setAlpha(floatValue);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f349710e;
        if (weImageView2 == null) {
            return;
        }
        weImageView2.setAlpha(1.0f - floatValue);
    }
}

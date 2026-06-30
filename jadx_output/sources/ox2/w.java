package ox2;

/* loaded from: classes2.dex */
public final class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349715d;

    public w(android.view.View view) {
        this.f349715d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.view.View view = this.f349715d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view;
        if (weImageView != null) {
            weImageView.setScaleX(floatValue);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) view;
        if (weImageView2 == null) {
            return;
        }
        weImageView2.setScaleY(floatValue);
    }
}

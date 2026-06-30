package m22;

/* loaded from: classes5.dex */
public class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout f323082d;

    public z(com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout scaleRelativeLayout) {
        this.f323082d = scaleRelativeLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout scaleRelativeLayout = this.f323082d;
        scaleRelativeLayout.f98541f = floatValue;
        android.view.View view = scaleRelativeLayout.f98547o;
        if (view != null) {
            view.setScaleX(floatValue);
            view.setScaleY(scaleRelativeLayout.f98541f);
        }
    }
}

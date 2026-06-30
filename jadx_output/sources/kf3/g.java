package kf3;

/* loaded from: classes5.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout f307347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout f307348e;

    public g(com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout massMaskAnimLinearLayout, com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout massMaskAnimLinearLayout2) {
        this.f307347d = massMaskAnimLinearLayout;
        this.f307348e = massMaskAnimLinearLayout2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout massMaskAnimLinearLayout = this.f307348e;
        android.graphics.Rect rect = massMaskAnimLinearLayout.f148523e;
        com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout massMaskAnimLinearLayout2 = this.f307347d;
        massMaskAnimLinearLayout2.getGlobalVisibleRect(rect);
        massMaskAnimLinearLayout.f148523e.top = massMaskAnimLinearLayout2.getTop();
        massMaskAnimLinearLayout.f148523e.bottom = massMaskAnimLinearLayout2.getBottom();
        java.lang.Object animatedValue = animation.getAnimatedValue("alpha");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        massMaskAnimLinearLayout.f148524f.setAlpha((int) (255 * ((java.lang.Float) animatedValue).floatValue()));
        massMaskAnimLinearLayout.postInvalidate();
    }
}

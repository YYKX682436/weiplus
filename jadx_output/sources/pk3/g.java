package pk3;

/* loaded from: classes8.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView f356449d;

    public g(com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView) {
        this.f356449d = multiTaskFloatBallView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView = this.f356449d;
        android.view.ViewGroup.LayoutParams layoutParams = multiTaskFloatBallView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        multiTaskFloatBallView.o(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, true, false);
    }
}

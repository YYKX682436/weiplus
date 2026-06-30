package tk3;

/* loaded from: classes8.dex */
public final class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView f419921d;

    public f(com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView) {
        this.f419921d = multiTaskNewFloatBallView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView = this.f419921d;
        android.view.ViewGroup.LayoutParams layoutParams = multiTaskNewFloatBallView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        multiTaskNewFloatBallView.s(layoutParams2.x, layoutParams2.y, true, false);
    }
}

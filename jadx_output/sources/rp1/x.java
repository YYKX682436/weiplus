package rp1;

/* loaded from: classes14.dex */
public final class x extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f398553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398554e;

    public x(yz5.a aVar, com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        this.f398553d = aVar;
        this.f398554e = contentFloatBallView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        yz5.a aVar = this.f398553d;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f398554e;
        android.view.ViewGroup.LayoutParams layoutParams = contentFloatBallView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        this.f398554e.A(layoutParams2.x, layoutParams2.y, true, false, true);
        contentFloatBallView.f93429q = false;
    }
}

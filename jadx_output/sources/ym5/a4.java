package ym5;

/* loaded from: classes10.dex */
public final class a4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f463196e;

    public a4(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, float f17) {
        this.f463195d = refreshLoadMoreLayout;
        this.f463196e = f17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463195d;
        refreshLoadMoreLayout.C = false;
        refreshLoadMoreLayout.setTranslationY(this.f463196e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f463195d.C = true;
    }
}

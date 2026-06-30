package ym5;

/* loaded from: classes10.dex */
public final class z3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f463591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f463592f;

    public z3(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, float f17, yz5.a aVar) {
        this.f463590d = refreshLoadMoreLayout;
        this.f463591e = f17;
        this.f463592f = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463590d;
        refreshLoadMoreLayout.C = false;
        refreshLoadMoreLayout.setTranslationY(this.f463591e);
        refreshLoadMoreLayout.Q = false;
        this.f463592f.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f463590d.C = true;
    }
}

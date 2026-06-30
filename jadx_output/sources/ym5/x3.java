package ym5;

/* loaded from: classes10.dex */
public final class x3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f463570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f463571f;

    public x3(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, kotlin.jvm.internal.e0 e0Var, yz5.a aVar) {
        this.f463569d = refreshLoadMoreLayout;
        this.f463570e = e0Var;
        this.f463571f = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463569d;
        refreshLoadMoreLayout.C = false;
        refreshLoadMoreLayout.setTranslationY(this.f463570e.f310115d);
        this.f463571f.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f463569d.C = true;
    }
}

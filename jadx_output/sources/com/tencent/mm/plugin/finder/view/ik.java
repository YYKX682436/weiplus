package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ik implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f132311d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f132312e;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(p07, "p0");
        android.view.View view = this.f132311d;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        yz5.a aVar = this.f132312e;
        if (aVar != null) {
            aVar.invoke();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveSlideAnimHelper", "HorizontalAnimationListener onAnimationEnd onAnimationEnd：" + this.f132312e);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}

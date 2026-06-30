package com.tencent.mm.ui.tipsbar;

/* loaded from: classes3.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.ChatTipsBarGroup f209936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f209937e;

    public h(com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f209936d = chatTipsBarGroup;
        this.f209937e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f209936d.f209913o = false;
        this.f209937e.setListener(null);
    }
}

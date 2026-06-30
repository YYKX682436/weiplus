package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class b7 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f131698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f131699e;

    public b7(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter, boolean z17) {
        this.f131698d = finderCommentFooter;
        this.f131699e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f131698d;
        finderCommentFooter.getSmileyPanel().setVisibility(4);
        finderCommentFooter.setSmileyIcon(false);
        if (this.f131699e) {
            finderCommentFooter.setFooterMode(0);
            finderCommentFooter.n(finderCommentFooter.isShowKeyboard);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}

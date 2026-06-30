package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class d4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f130225e;

    public d4(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter, boolean z17) {
        this.f130224d = uniCommentFooter;
        this.f130225e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130224d;
        uniCommentFooter.getSmileyPanel().setVisibility(4);
        uniCommentFooter.setSmileyIcon(false);
        if (this.f130225e) {
            uniCommentFooter.setFooterMode(0);
        }
        if (uniCommentFooter.getAutoHideWithKeyboard()) {
            uniCommentFooter.setVisibility(8);
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

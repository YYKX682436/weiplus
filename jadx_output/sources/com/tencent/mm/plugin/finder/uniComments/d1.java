package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class d1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f130222e;

    public d1(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter, boolean z17) {
        this.f130221d = textStatusCommentFooter;
        this.f130222e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130221d;
        textStatusCommentFooter.getSmileyPanel().setVisibility(4);
        textStatusCommentFooter.setSmileyIcon(false);
        if (this.f130222e) {
            textStatusCommentFooter.setFooterMode(0);
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

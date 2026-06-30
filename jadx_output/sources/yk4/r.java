package yk4;

/* loaded from: classes10.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f462852e;

    public r(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter, boolean z17) {
        this.f462851d = tingCommentFooter;
        this.f462852e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462851d;
        tingCommentFooter.getSmileyPanel().setVisibility(4);
        tingCommentFooter.setSmileyIcon(false);
        if (this.f462852e) {
            tingCommentFooter.setFooterMode(0);
        }
        if (tingCommentFooter.getAutoHideWithKeyboard()) {
            tingCommentFooter.setVisibility(8);
        }
        yk4.a commentFooterStateListener = tingCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.c();
        }
        yk4.a commentFooterStateListener2 = tingCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener2 != null) {
            commentFooterStateListener2.g();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yk4.a commentFooterStateListener = this.f462851d.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.b();
        }
    }
}

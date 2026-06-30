package yk4;

/* loaded from: classes10.dex */
public final class s implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462853d;

    public s(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter) {
        this.f462853d = tingCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462853d;
        tingCommentFooter.getSmileyPanel().setAlpha(1.0f);
        tingCommentFooter.getSmileyPanel().setVisibility(4);
        yk4.a commentFooterStateListener = tingCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.c();
        }
        yk4.a commentFooterStateListener2 = tingCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener2 != null) {
            commentFooterStateListener2.a(tingCommentFooter.getEditLayoutMinHeight() + ((int) tingCommentFooter.f174682v));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462853d;
        yk4.a commentFooterStateListener = tingCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.h(tingCommentFooter.getEditLayoutMinHeight() + ((int) tingCommentFooter.f174682v));
        }
    }
}

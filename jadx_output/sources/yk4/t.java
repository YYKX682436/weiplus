package yk4;

/* loaded from: classes10.dex */
public final class t implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f462855e;

    public t(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter, int i17) {
        this.f462854d = tingCommentFooter;
        this.f462855e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462854d;
        tingCommentFooter.setFooterMode(2);
        tingCommentFooter.setSmileyIcon(false);
        tingCommentFooter.getSmileyBtn().setTag(java.lang.Boolean.FALSE);
        yk4.a commentFooterStateListener = tingCommentFooter.getCommentFooterStateListener();
        int i17 = this.f462855e;
        if (commentFooterStateListener != null) {
            commentFooterStateListener.e(i17);
        }
        yk4.a commentFooterStateListener2 = tingCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener2 != null) {
            commentFooterStateListener2.a(tingCommentFooter.getEditLayoutMinHeight() + i17);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462854d;
        if (tingCommentFooter.getAutoHideWithKeyboard()) {
            tingCommentFooter.setVisibility(0);
        }
        yk4.a commentFooterStateListener = tingCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.h(tingCommentFooter.getEditLayoutMinHeight() + this.f462855e);
        }
    }
}

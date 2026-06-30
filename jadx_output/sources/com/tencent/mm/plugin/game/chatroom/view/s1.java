package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class s1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139280d;

    public s1(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139280d = gameChatCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139280d;
        gameChatCommentFooter.f138949s.setVisibility(8);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) gameChatCommentFooter.f138949s.getLayoutParams();
        layoutParams.height = gameChatCommentFooter.f138954x;
        gameChatCommentFooter.f138949s.setLayoutParams(layoutParams);
        gameChatCommentFooter.setFooterVisibilityImpl(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f139280d.f138949s.setVisibility(0);
    }
}

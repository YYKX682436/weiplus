package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class v1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.y1 f139322d;

    public v1(com.tencent.mm.plugin.game.chatroom.view.y1 y1Var) {
        this.f139322d = y1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.game.chatroom.view.y1 y1Var = this.f139322d;
        android.view.ViewGroup.LayoutParams layoutParams = y1Var.f139358d.f138947q.getLayoutParams();
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = y1Var.f139358d;
        layoutParams.width = gameChatCommentFooter.A;
        gameChatCommentFooter.f138947q.setLayoutParams(layoutParams);
        y1Var.f139358d.f138947q.setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.game.chatroom.view.y1 y1Var = this.f139322d;
        y1Var.f139358d.f138947q.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams = y1Var.f139358d.f138947q.getLayoutParams();
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = y1Var.f139358d;
        layoutParams.width = gameChatCommentFooter.A;
        gameChatCommentFooter.f138947q.setLayoutParams(layoutParams);
        y1Var.f139358d.f138947q.setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f139322d.f139358d.f138947q.setVisibility(0);
    }
}

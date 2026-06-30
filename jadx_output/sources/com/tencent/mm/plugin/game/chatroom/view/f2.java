package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class f2 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139107d;

    public f2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139107d = gameChatCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139107d;
        gameChatCommentFooter.f138949s.setVisibility(0);
        com.tencent.mm.plugin.game.chatroom.view.q2 q2Var = gameChatCommentFooter.D;
        if (q2Var != null) {
            q2Var.b();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f139107d.f138949s.setVisibility(0);
    }
}

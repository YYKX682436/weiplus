package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class x1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.y1 f139342d;

    public x1(com.tencent.mm.plugin.game.chatroom.view.y1 y1Var) {
        this.f139342d = y1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f139342d.f139358d.f138947q.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f139342d.f139358d.f138947q.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f139342d.f139358d.f138947q.setVisibility(0);
    }
}

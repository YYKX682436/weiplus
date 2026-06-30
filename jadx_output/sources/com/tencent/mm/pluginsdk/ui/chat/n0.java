package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class n0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190494d;

    public n0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190494d = chatFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190494d;
        chatFooter.f189972d4.setVisibility(8);
        chatFooter.f189966c4.setVisibility(0);
        chatFooter.postDelayed(new com.tencent.mm.pluginsdk.ui.chat.m0(this), 200L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

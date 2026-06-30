package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class r2 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingAnimFrame f202637d;

    public r2(com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame) {
        this.f202637d = chattingAnimFrame;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "onAnimationEnd: luckBag");
        com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = this.f202637d;
        if (chattingAnimFrame.Q) {
            chattingAnimFrame.d();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "onAnimationStart: luckyBag");
        com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = this.f202637d;
        if (chattingAnimFrame.K == 1) {
            chattingAnimFrame.G = chattingAnimFrame.f198195i * chattingAnimFrame.C;
            chattingAnimFrame.H = -chattingAnimFrame.L;
        }
    }
}

package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class s2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.t2 f202656a;

    public s2(com.tencent.mm.ui.chatting.t2 t2Var) {
        this.f202656a = t2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = this.f202656a.f202690d;
        java.lang.String str = com.tencent.mm.ui.chatting.ChattingAnimFrame.W;
        chattingAnimFrame.d();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.ui.chatting.t2 t2Var = this.f202656a;
        ((android.os.Vibrator) t2Var.f202690d.getContext().getSystemService("vibrator")).vibrate(500L);
        com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = t2Var.f202690d;
        com.tencent.mm.ui.chatting.b3 b3Var = chattingAnimFrame.V;
        if (b3Var != null) {
            com.tencent.mm.ui.chatting.p9 p9Var = (com.tencent.mm.ui.chatting.p9) b3Var;
            com.tencent.mm.ui.chatting.n9.a(p9Var.f202088c, chattingAnimFrame.S, chattingAnimFrame.R, p9Var.f202086a, p9Var.f202087b);
        }
    }
}

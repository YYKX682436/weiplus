package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class y2 extends com.tencent.mm.ui.chatting.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.a3 f206254a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.tencent.mm.ui.chatting.a3 a3Var, com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame) {
        super(a3Var.f198362g);
        this.f206254a = a3Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.chatting.a3 a3Var = this.f206254a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "onAnimationEnd: %s", a3Var.f198361f);
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = a3Var.f198361f;
        if (mMAnimateView != null) {
            mMAnimateView.post(new com.tencent.mm.ui.chatting.z2(a3Var));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingAnimFrame", "mTargetView is NULL.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.ui.chatting.a3 a3Var = this.f206254a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "onAnimationStart: %s", a3Var.f198361f);
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = a3Var.f198361f;
        if (mMAnimateView != null) {
            mMAnimateView.postDelayed(new com.tencent.mm.ui.chatting.x2(this), a3Var.f198360e);
        }
    }
}

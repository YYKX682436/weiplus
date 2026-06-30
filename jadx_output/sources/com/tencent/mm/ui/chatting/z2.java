package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.a3 f206278d;

    public z2(com.tencent.mm.ui.chatting.a3 a3Var) {
        this.f206278d = a3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.a3 a3Var = this.f206278d;
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = a3Var.f198361f;
        if (mMAnimateView != null) {
            mMAnimateView.clearAnimation();
            com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = a3Var.f198362g;
            com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView2 = a3Var.f198361f;
            if (mMAnimateView2 == null) {
                chattingAnimFrame.getClass();
                return;
            }
            java.util.List list = chattingAnimFrame.f198191e;
            if (list != null) {
                int i17 = chattingAnimFrame.f198192f - 1;
                chattingAnimFrame.f198192f = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "remove view counter--: [%s]. %s", java.lang.Integer.valueOf(i17), mMAnimateView2);
                mMAnimateView2.t();
                mMAnimateView2.clearAnimation();
                chattingAnimFrame.f198190d.removeView(mMAnimateView2);
                ((java.util.ArrayList) list).remove(mMAnimateView2);
                if (chattingAnimFrame.f198192f <= 0) {
                    chattingAnimFrame.f198192f = 0;
                }
            }
        }
    }
}

package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class of extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.NewChattingTabUI f209474d;

    public of(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
        this.f209474d = newChattingTabUI;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.IChattingUIProxy iChattingUIProxy;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gm0.j1.e().o();
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.f209474d;
        newChattingTabUI.f197014a.onSwipe(1.0f);
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = newChattingTabUI.f197016c;
        if (testTimeForChatting != null) {
            testTimeForChatting.c();
        }
        iChattingUIProxy = newChattingTabUI.mChattingUIProxy;
        iChattingUIProxy.onEnterEnd();
        newChattingTabUI.s();
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "doJobOnChattingAnimEnd cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public java.lang.String toString() {
        return super.toString() + "|chattingView_onAnimationEnd";
    }
}

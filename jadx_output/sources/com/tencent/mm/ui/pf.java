package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class pf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.NewChattingTabUI f209505d;

    public pf(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
        this.f209505d = newChattingTabUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.f209505d;
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = newChattingTabUI.f197016c;
        if (testTimeForChatting == null || newChattingTabUI.f197024k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "[mDrawedOverTimeTask] skip, mChattingView=%s, mChattingClosed=%s", testTimeForChatting, java.lang.Boolean.valueOf(newChattingTabUI.f197024k));
            return;
        }
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = newChattingTabUI.f197027n;
        if (baseChattingUIFragment == null || !baseChattingUIFragment.K0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "[mDrawedOverTimeTask] not ready, leave it to ChattingDataCallback.overTimeTask");
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "[mDrawedOverTimeTask] onDrawed not invoked in %dms, force trigger", 1500L);
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting2 = newChattingTabUI.f197016c;
        if (testTimeForChatting2.f210262e != null) {
            testTimeForChatting2.post(new com.tencent.mm.ui.tools.nd(testTimeForChatting2));
        }
    }
}

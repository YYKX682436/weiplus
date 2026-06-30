package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class bh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f167913d;

    public bh(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        this.f167913d = snsCommentImageFlowUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6$onAnimationStart$1");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f167913d.f166810o;
        snsInfoFlip.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adaptImgViewSize", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.ui.base.MMViewPager mMViewPager = snsInfoFlip.W;
        if (mMViewPager != null) {
            android.view.KeyEvent.Callback selectedView = mMViewPager.getSelectedView();
            if (selectedView instanceof db5.f0) {
                ((db5.f0) selectedView).i();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adaptImgViewSize", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6$onAnimationStart$1");
    }
}

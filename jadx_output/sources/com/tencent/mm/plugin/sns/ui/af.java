package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class af implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.cf f167755d;

    public af(com.tencent.mm.plugin.sns.ui.cf cfVar) {
        this.f167755d = cfVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5$1");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f167755d.f168128f.f166810o;
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5$1");
    }
}

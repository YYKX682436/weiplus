package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ar implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI f167781d;

    public ar(com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f167781d = snsStrangerCommentDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$6");
        com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = this.f167781d;
        android.widget.ListView T6 = com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.T6(snsStrangerCommentDetailUI);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.hr hrVar = snsStrangerCommentDetailUI.f167434q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        T6.setSelection(hrVar.getCount() - 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$6");
    }
}

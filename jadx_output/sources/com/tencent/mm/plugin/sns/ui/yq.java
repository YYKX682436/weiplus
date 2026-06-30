package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class yq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.zq f171641d;

    public yq(com.tencent.mm.plugin.sns.ui.zq zqVar) {
        this.f171641d = zqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$5$1");
        com.tencent.mm.plugin.sns.ui.zq zqVar = this.f171641d;
        com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = zqVar.f171706d;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.f167423y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.hr hrVar = snsStrangerCommentDetailUI.f167434q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        hrVar.f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI2 = zqVar.f171706d;
        boolean z17 = snsStrangerCommentDetailUI2.f167438u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            snsStrangerCommentDetailUI2.f167438u = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            snsStrangerCommentDetailUI2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToLast", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            com.tencent.mm.plugin.sns.model.l4.Tj().postDelayed(new com.tencent.mm.plugin.sns.ui.ar(snsStrangerCommentDetailUI2), 10L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToLast", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$5$1");
    }
}

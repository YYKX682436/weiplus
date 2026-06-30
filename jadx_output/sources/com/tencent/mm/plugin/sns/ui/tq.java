package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class tq implements com.tencent.mm.plugin.sns.ui.dg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI f170544a;

    public tq(com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f170544a = snsStrangerCommentDetailUI;
    }

    @Override // com.tencent.mm.plugin.sns.ui.dg
    public void a(zb4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$11");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.f167423y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = this.f170544a;
        snsStrangerCommentDetailUI.f167438u = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = snsStrangerCommentDetailUI.f167432o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendTextComment", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        if (aVar.f()) {
            com.tencent.mm.plugin.sns.model.d6.p(snsStrangerCommentDetailUI.f167435r, 3, aVar, snsInfo, snsStrangerCommentDetailUI.f167439v);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendTextComment", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStrangerCommentDetailUI", "sendTextComment contentData is not valid");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendTextComment", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$11");
    }
}

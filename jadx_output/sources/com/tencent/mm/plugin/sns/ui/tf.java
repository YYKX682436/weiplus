package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class tf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.uf f170521d;

    public tf(com.tencent.mm.plugin.sns.ui.uf ufVar) {
        this.f170521d = ufVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$2$1");
        com.tencent.mm.plugin.sns.ui.uf ufVar = this.f170521d;
        int height = ufVar.f170578d.getHeight();
        java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = ufVar.f170578d;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = snsCommentFooter.f167101r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (height < chatFooterPanel.getHeight()) {
            snsCommentFooter.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.eg egVar = snsCommentFooter.G1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (egVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mm.plugin.sns.ui.eg egVar2 = snsCommentFooter.G1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            ((com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass35) egVar2).a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$2$1");
    }
}

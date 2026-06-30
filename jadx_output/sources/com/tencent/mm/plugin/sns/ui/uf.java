package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class uf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f170578d;

    public uf(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f170578d = snsCommentFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "showSmileyPanel in run");
        java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f170578d;
        snsCommentFooter.q(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.post(new com.tencent.mm.plugin.sns.ui.tf(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$2");
    }
}

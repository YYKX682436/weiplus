package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bg implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f167912a;

    public bg(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f167912a = snsCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("append", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        try {
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(this.f167912a).n(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCommentFooter", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("append", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("del", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f167912a;
        if (com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter) != null) {
            if (com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getInputConnection() == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("del", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
                return;
            } else {
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("del", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f167912a;
        boolean z18 = snsCommentFooter.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (!z18) {
            snsCommentFooter.setToSendTextColor(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }
}

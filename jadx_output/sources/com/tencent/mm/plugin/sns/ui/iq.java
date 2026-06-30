package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class iq implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter f169244a;

    public iq(com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter) {
        this.f169244a = snsSightUploadSayFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("append", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
        try {
            com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter.i(this.f169244a).n(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsSightUploadSayFooter", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("append", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("del", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter = this.f169244a;
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter.i(snsSightUploadSayFooter).getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter.i(snsSightUploadSayFooter).getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("del", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
    }
}

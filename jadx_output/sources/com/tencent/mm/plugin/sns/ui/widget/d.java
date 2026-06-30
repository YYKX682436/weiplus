package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter f171108a;

    public d(com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter) {
        this.f171108a = absSnsUploadSayFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("append", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
        try {
            com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f171108a;
            int i17 = com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter.f170755t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            fl5.i iVar = absSnsUploadSayFooter.f170758h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            iVar.n(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsUpload.AbsSayFooter", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("append", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("del", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
        int i17 = com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter.f170755t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f171108a;
        fl5.i iVar = absSnsUploadSayFooter.f170758h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        iVar.getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        fl5.i iVar2 = absSnsUploadSayFooter.f170758h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        iVar2.getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("del", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
    }
}

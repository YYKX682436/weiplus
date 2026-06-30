package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class lu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter f169877d;

    public lu(com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter snsUploadV2SayFooter) {
        this.f169877d = snsUploadV2SayFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$showSmileyPanel$1");
        com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter snsUploadV2SayFooter = this.f169877d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter.i(snsUploadV2SayFooter), "showSmileyPanel in run");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSmileyPanel$p$s527954705", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = snsUploadV2SayFooter.f170757g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSmileyPanel$p$s527954705", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        chatFooterPanel.setVisibility(0);
        snsUploadV2SayFooter.post(new com.tencent.mm.plugin.sns.ui.ku(snsUploadV2SayFooter));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$showSmileyPanel$1");
    }
}

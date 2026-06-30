package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class ku implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter f169650d;

    public ku(com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter snsUploadV2SayFooter) {
        this.f169650d = snsUploadV2SayFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$showSmileyPanel$1$1");
        com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter snsUploadV2SayFooter = this.f169650d;
        int height = snsUploadV2SayFooter.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSmileyPanel$p$s527954705", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = snsUploadV2SayFooter.f170757g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSmileyPanel$p$s527954705", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        if (height < chatFooterPanel.getHeight()) {
            snsUploadV2SayFooter.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$showSmileyPanel$1$1");
    }
}

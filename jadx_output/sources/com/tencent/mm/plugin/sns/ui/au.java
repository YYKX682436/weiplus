package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class au implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bu f167792d;

    public au(com.tencent.mm.plugin.sns.ui.bu buVar) {
        this.f167792d = buVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$2$1");
        com.tencent.mm.plugin.sns.ui.bu buVar = this.f167792d;
        com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView = buVar.f168063e;
        int i18 = com.tencent.mm.plugin.sns.ui.SnsUploadConfigView.f167506q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        boolean z17 = snsUploadConfigView.f167513m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        snsUploadConfigView.f167513m = !z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        buVar.f168063e.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$2$1");
    }
}

package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class cu implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUploadConfigView f168146d;

    public cu(com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView) {
        this.f168146d = snsUploadConfigView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$3");
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        android.content.Intent intent = new android.content.Intent();
        int i18 = com.tencent.mm.plugin.sns.ui.SnsUploadConfigView.f167506q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        android.content.Context context = this.f168146d.f167515o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        y7Var.i(intent, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$3");
    }
}

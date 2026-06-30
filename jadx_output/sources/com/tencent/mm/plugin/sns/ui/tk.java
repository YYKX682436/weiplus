package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class tk implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLabelUI f170527d;

    public tk(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        this.f170527d = snsLabelUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$6");
        int i18 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI = this.f170527d;
        snsLabelUI.f167229q = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ((b93.b) c93.a.a()).a(com.tencent.mm.plugin.sns.ui.SnsLabelUI.X6(snsLabelUI));
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(snsLabelUI, null, snsLabelUI.getString(com.tencent.mm.R.string.jbl), false, false, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.f167232t = Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$6");
    }
}

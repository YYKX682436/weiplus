package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class dn implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsNotInterestUI f168201d;

    public dn(com.tencent.mm.plugin.sns.ui.SnsNotInterestUI snsNotInterestUI) {
        this.f168201d = snsNotInterestUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$4");
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f168201d.f167306u);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$4");
    }
}

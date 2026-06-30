package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class yo implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.zo f171639a;

    public yo(com.tencent.mm.plugin.sns.ui.zo zoVar) {
        this.f171639a = zoVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$1$1");
        com.tencent.mm.plugin.sns.ui.zo zoVar = this.f171639a;
        zoVar.f171704d.hideVKB();
        if (z17) {
            int i17 = -1;
            try {
                i17 = com.tencent.mm.sdk.platformtools.t8.P(str, -1);
            } catch (java.lang.Exception unused) {
            }
            try {
                com.tencent.mm.plugin.sns.model.l4.yj();
                s94.a.b(new android.os.CancellationSignal(), i17);
            } catch (java.lang.Exception e17) {
                int i18 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
                java.lang.String str2 = zoVar.f171704d.d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
                com.tencent.mars.xlog.Log.e(str2, "cleanSnsTablesByTimeLimit error. %s", e17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$1$1");
    }
}

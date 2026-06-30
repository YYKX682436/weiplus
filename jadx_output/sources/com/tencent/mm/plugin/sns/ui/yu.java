package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class yu implements vj5.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f171649d;

    public yu(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f171649d = snsUserUI;
    }

    @Override // vj5.k
    public void n6(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStatusBarHeightChange", "com.tencent.mm.plugin.sns.ui.SnsUserUI$17");
        int i18 = com.tencent.mm.plugin.sns.ui.SnsUserUI.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f171649d;
        android.view.View view = snsUserUI.Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        view.setPadding(0, i17, 0, 0);
        vj5.o.e(snsUserUI.getWindow());
        com.tencent.mm.plugin.sns.ui.SnsUserUI.X6(snsUserUI, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStatusBarHeightChange", "com.tencent.mm.plugin.sns.ui.SnsUserUI$17");
    }
}

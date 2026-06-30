package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class mv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f169950d;

    public mv(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f169950d = snsUserUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$9");
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f169950d;
        snsUserUI.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        com.tencent.mm.plugin.sns.ui.SnsUserUI.X6(snsUserUI, rect.top);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$9");
    }
}

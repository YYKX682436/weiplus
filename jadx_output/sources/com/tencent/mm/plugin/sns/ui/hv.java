package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class hv implements com.tencent.mm.plugin.sns.ui.lo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f168543a;

    public hv(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f168543a = snsUserUI;
    }

    @Override // com.tencent.mm.plugin.sns.ui.lo
    public void a(int i17, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCaptureFinish", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
        this.f168543a.onActivityResult(17, i17, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCaptureFinish", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
    }
}

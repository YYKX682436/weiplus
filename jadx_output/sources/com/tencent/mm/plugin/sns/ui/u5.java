package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.MaskLinearLayout f170565d;

    public u5(com.tencent.mm.plugin.sns.ui.MaskLinearLayout maskLinearLayout) {
        this.f170565d = maskLinearLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$1");
        com.tencent.mm.plugin.sns.ui.MaskLinearLayout maskLinearLayout = this.f170565d;
        maskLinearLayout.setPressed(false);
        com.tencent.mm.plugin.sns.ui.MaskLinearLayout.a(maskLinearLayout);
        maskLinearLayout.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$1");
    }
}

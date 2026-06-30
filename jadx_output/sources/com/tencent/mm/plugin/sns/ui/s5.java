package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.MaskImageView f170442d;

    public s5(com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView) {
        this.f170442d = maskImageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.MaskImageView$1");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = this.f170442d;
        maskImageView.setPressed(false);
        maskImageView.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.MaskImageView$1");
    }
}

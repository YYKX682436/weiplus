package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes14.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.AsyncMaskImageView f170438d;

    public s0(com.tencent.mm.plugin.sns.ui.AsyncMaskImageView asyncMaskImageView) {
        this.f170438d = asyncMaskImageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$1");
        com.tencent.mm.plugin.sns.ui.AsyncMaskImageView asyncMaskImageView = this.f170438d;
        asyncMaskImageView.setPressed(false);
        asyncMaskImageView.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$1");
    }
}

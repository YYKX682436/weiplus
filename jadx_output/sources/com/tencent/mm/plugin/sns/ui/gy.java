package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class gy implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.TouchImageView f168469d;

    public gy(com.tencent.mm.plugin.sns.ui.TouchImageView touchImageView) {
        this.f168469d = touchImageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.TouchImageView$1");
        com.tencent.mm.plugin.sns.ui.TouchImageView touchImageView = this.f168469d;
        touchImageView.setPressed(false);
        touchImageView.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.TouchImageView$1");
    }
}

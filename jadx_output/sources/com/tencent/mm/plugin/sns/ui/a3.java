package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public float f167721d;

    /* renamed from: e, reason: collision with root package name */
    public float f167722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.FlipView f167723f;

    public a3(com.tencent.mm.plugin.sns.ui.FlipView flipView) {
        this.f167723f = flipView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$ClickRunnable");
        this.f167723f.i(this.f167721d, this.f167722e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$ClickRunnable");
    }
}

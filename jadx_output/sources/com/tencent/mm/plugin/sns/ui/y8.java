package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class y8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView f171622e;

    public y8(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView, int i17) {
        this.f171622e = sightVideoFullScreenView;
        this.f171621d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$3");
        com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = this.f171622e;
        com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.i(sightVideoFullScreenView).a(this.f171621d);
        com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.d(sightVideoFullScreenView, com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.b(sightVideoFullScreenView).h());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$3");
    }
}

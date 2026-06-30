package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class d9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView f168176d;

    public d9(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        this.f168176d = sightVideoFullScreenView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$8");
        com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.g(this.f168176d, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$8");
    }
}

package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView f169729d;

    public l5(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView) {
        this.f169729d = longVideoFullScreenView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$5");
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.a(this.f169729d, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$5");
    }
}

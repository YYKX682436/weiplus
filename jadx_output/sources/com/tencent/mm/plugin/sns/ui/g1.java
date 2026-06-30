package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.l1 f168395d;

    public g1(com.tencent.mm.plugin.sns.ui.l1 l1Var) {
        this.f168395d = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$9");
        this.f168395d.f169710k.setToSendTextColor(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$9");
    }
}

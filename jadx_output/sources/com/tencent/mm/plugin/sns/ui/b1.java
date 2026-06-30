package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.l1 f167797d;

    public b1(com.tencent.mm.plugin.sns.ui.l1 l1Var) {
        this.f167797d = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$10");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f167797d;
        l1Var.f169710k.clearFocus();
        l1Var.f169710k.requestFocus();
        l1Var.f169710k.setToSendTextColor(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$10");
    }
}

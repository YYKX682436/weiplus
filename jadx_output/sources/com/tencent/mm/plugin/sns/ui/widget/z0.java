package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.a1 f171325d;

    public z0(com.tencent.mm.plugin.sns.ui.widget.a1 a1Var) {
        this.f171325d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1$1");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView snsAdTouchProgressView = this.f171325d.f170923d;
        com.tencent.mm.plugin.sns.ui.widget.b1 b1Var = snsAdTouchProgressView.f170837m;
        if (b1Var != null) {
            snsAdTouchProgressView.f170832e = true;
            b1Var.onFinish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1$1");
    }
}

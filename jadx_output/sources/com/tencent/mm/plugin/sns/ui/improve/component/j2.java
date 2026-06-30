package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC f168923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f168925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f168926g;

    public j2(com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC, android.view.View view, int i17, int i18) {
        this.f168923d = snsWsFoldInputUIC;
        this.f168924e = view;
        this.f168925f = i17;
        this.f168926g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$checkFixScrollUtilMatchViewBottom$1");
        int i17 = this.f168926g - 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        this.f168923d.T6(this.f168924e, this.f168925f, false, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$checkFixScrollUtilMatchViewBottom$1");
    }
}

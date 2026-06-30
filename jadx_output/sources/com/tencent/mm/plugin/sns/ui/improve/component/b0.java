package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC f168744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f168746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f168747g;

    public b0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC, android.view.View view, int i17, int i18) {
        this.f168744d = improveInputUIC;
        this.f168745e = view;
        this.f168746f = i17;
        this.f168747g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$checkFixScrollUtilMatchViewBottom$1");
        int i17 = this.f168747g - 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        this.f168744d.S6(this.f168745e, this.f168746f, false, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$checkFixScrollUtilMatchViewBottom$1");
    }
}

package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.f2 f168785e;

    public e2(android.view.View view, com.tencent.mm.plugin.sns.ui.improve.component.f2 f2Var) {
        this.f168784d = view;
        this.f168785e = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$onCreate$$inlined$doOnPreDraw$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        i64.b1 b1Var = this.f168785e.f168794d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        b1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAd", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        b1Var.e(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAd", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$onCreate$$inlined$doOnPreDraw$1");
    }
}

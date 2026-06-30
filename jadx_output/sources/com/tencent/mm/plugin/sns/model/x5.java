package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.d6 f164757d;

    public x5(com.tencent.mm.plugin.sns.model.d6 d6Var) {
        this.f164757d = d6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mm.plugin.sns.model.d6 d6Var = this.f164757d;
        d6Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delayCleanCache", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (!com.tencent.mm.plugin.sns.model.l4.Xj() && ((java.util.HashMap) d6Var.f164154n).isEmpty()) {
            com.tencent.mm.plugin.sns.model.l4.hj().g();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delayCleanCache", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$1");
    }
}

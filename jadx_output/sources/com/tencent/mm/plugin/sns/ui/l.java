package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.o f169698d;

    public l(com.tencent.mm.plugin.sns.ui.o oVar, boolean z17) {
        this.f169698d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$1");
        com.tencent.mm.plugin.sns.ui.o oVar = this.f169698d;
        java.util.List b17 = oVar.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyInUI", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        oVar.f170060a.post(new com.tencent.mm.plugin.sns.ui.m(oVar, b17, true));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyInUI", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$1");
    }
}

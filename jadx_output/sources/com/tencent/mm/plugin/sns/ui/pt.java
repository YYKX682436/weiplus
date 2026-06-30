package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pt extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUIAction f170280e;

    public pt(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        this.f170280e = snsUIAction;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ui.SnsUIAction$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ui.SnsUIAction$6");
        return "SnsUIAction#preloadRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$6");
        com.tencent.mm.plugin.sns.model.l4.Pj().o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        java.util.ArrayList arrayList = this.f170280e.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        java.util.Iterator it = new java.util.ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.l4.Pj().l((com.tencent.mm.plugin.sns.storage.SnsInfo) it.next(), true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$6");
    }
}

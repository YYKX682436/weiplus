package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class ok implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pk f170111e;

    public ok(com.tencent.mm.plugin.sns.ui.pk pkVar, int i17) {
        this.f170111e = pkVar;
        this.f170110d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2$1");
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.a7(this.f170111e.f170246a).d(this.f170110d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2$1");
    }
}

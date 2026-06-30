package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f169953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.o f169954e;

    public n(com.tencent.mm.plugin.sns.ui.o oVar, boolean z17) {
        this.f169954e = oVar;
        this.f169953d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$3");
        if (this.f169953d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            com.tencent.mm.plugin.sns.ui.o oVar = this.f169954e;
            oVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeType", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            java.util.LinkedList linkedList = (java.util.LinkedList) oVar.f170061b;
            if (linkedList.size() > 1) {
                linkedList.remove(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeType", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$3");
    }
}

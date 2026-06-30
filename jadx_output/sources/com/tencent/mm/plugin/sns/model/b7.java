package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i7 f164101d;

    public b7(com.tencent.mm.plugin.sns.model.i7 i7Var) {
        this.f164101d = i7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$3");
        synchronized (com.tencent.mm.plugin.sns.model.i7.b(this.f164101d)) {
            while (com.tencent.mm.plugin.sns.model.i7.b(this.f164101d).size() > 0) {
                try {
                    ((t21.v0) com.tencent.mm.plugin.sns.model.i7.b(this.f164101d).poll()).e();
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$3");
                    throw th6;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$3");
    }
}

package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.o5 f164429d;

    public l5(com.tencent.mm.plugin.sns.model.o5 o5Var) {
        this.f164429d = o5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        com.tencent.mm.plugin.sns.model.o5 o5Var = this.f164429d;
        java.util.HashMap hashMap = o5Var.f164549a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        if (hashMap.size() > 50) {
            com.tencent.mm.plugin.sns.model.o5.a(o5Var, 10);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$1");
    }
}

package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.o5 f164476d;

    public m5(com.tencent.mm.plugin.sns.model.o5 o5Var) {
        this.f164476d = o5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        com.tencent.mm.plugin.sns.model.o5 o5Var = this.f164476d;
        java.util.HashMap hashMap = o5Var.f164549a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        com.tencent.mm.plugin.sns.model.o5.a(o5Var, hashMap.size());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$2");
    }
}

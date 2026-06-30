package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.d2 f164512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.o5 f164513e;

    public n5(com.tencent.mm.plugin.sns.model.o5 o5Var, com.tencent.mm.plugin.sns.storage.d2 d2Var) {
        this.f164513e = o5Var;
        this.f164512d = d2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        java.util.HashMap hashMap = this.f164513e.f164549a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        com.tencent.mm.plugin.sns.storage.d2 d2Var = this.f164512d;
        hashMap.put(d2Var.field_userName, d2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsExtCache$3");
    }
}

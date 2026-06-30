package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class f7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.z7 f164193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f164194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i7 f164195f;

    public f7(com.tencent.mm.plugin.sns.model.i7 i7Var, com.tencent.mm.plugin.sns.model.z7 z7Var, boolean z17) {
        this.f164195f = i7Var;
        this.f164193d = z7Var;
        this.f164194e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.model.z7 z7Var = this.f164193d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$7");
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(ca4.m0.k(z7Var.f164817f, z7Var.f164815d.f377855d + "_"));
            z7Var.f164812a = k17 != null ? k17.getUserName() : "";
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoService", e17.toString());
        }
        boolean z17 = this.f164194e;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "offer [%b] video task[%s] to queue ", java.lang.Boolean.valueOf(z17), z7Var);
        com.tencent.mm.plugin.sns.model.i7 i7Var = this.f164195f;
        if (z17) {
            com.tencent.mm.plugin.sns.model.i7.c(i7Var).offerFirst(z7Var);
        } else {
            com.tencent.mm.plugin.sns.model.i7.c(i7Var).offerLast(z7Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.util.Map map = i7Var.f164310c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        ((java.util.concurrent.ConcurrentHashMap) map).put(z7Var.f164813b, z7Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$7");
    }
}

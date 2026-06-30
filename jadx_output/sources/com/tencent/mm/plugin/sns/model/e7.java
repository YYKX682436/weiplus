package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class e7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f164176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i7 f164177f;

    public e7(com.tencent.mm.plugin.sns.model.i7 i7Var, java.lang.String str, java.lang.Object[] objArr) {
        this.f164177f = i7Var;
        this.f164175d = str;
        this.f164176e = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$6");
        t21.o2.Di().g(this.f164175d, this.f164176e);
        if (this.f164177f.f164308a != null && com.tencent.mm.sdk.platformtools.t8.D0(this.f164177f.f164308a.f164813b, this.f164175d)) {
            com.tencent.mm.plugin.sns.model.i7 i7Var = this.f164177f;
            i7Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            cp.e.b("SnsVideoService", new com.tencent.mm.plugin.sns.model.h7(i7Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        }
        com.tencent.mm.plugin.sns.model.i7 i7Var2 = this.f164177f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.util.Map map = i7Var2.f164310c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.tencent.mm.plugin.sns.model.i7.c(this.f164177f).remove((com.tencent.mm.plugin.sns.model.z7) ((java.util.concurrent.ConcurrentHashMap) map).get(this.f164175d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$6");
    }
}

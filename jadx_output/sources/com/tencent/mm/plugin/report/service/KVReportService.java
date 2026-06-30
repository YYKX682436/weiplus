package com.tencent.mm.plugin.report.service;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/report/service/KVReportService;", "Lcom/tencent/mm/service/MMService;", "<init>", "()V", "com/tencent/mm/plugin/report/service/a0", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class KVReportService extends com.tencent.mm.service.MMService {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.plugin.report.service.a0 f158137m = new com.tencent.mm.plugin.report.service.a0(null);

    /* renamed from: n, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.report.service.n f158138n;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.report.service.b0 f158139i = new com.tencent.mm.plugin.report.service.b0();

    public static final void i() {
        com.tencent.mm.plugin.report.service.a0 a0Var = f158137m;
        com.tencent.mars.xlog.Log.i("MicroMsg.KVReportService", "bind from " + bm5.f1.a());
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.report.service.KVReportService.class);
        try {
            com.tencent.mm.plugin.report.service.z zVar = new com.tencent.mm.plugin.report.service.z(a0Var);
            android.content.Intent intent2 = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.service.ProcessService$MMProcessService.class);
            boolean z17 = l85.j1.f317187a;
            l85.j1.b("MicroMsg.KVReportService", intent2);
            l85.h1.b(intent, zVar, 0, "mm", true, intent2);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.KVReportService", th6, "", new java.lang.Object[0]);
        }
    }

    public static final void j(android.os.Bundle bundle) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(bundle, "bundle");
        com.tencent.mm.plugin.report.service.n nVar = f158138n;
        if (nVar != null) {
            nVar.X3(bundle);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            throw new java.lang.IllegalStateException("aidl not ready yet");
        }
    }

    @Override // com.tencent.mm.service.MMService
    public android.os.IBinder c(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KVReportService", "onBind");
        return this.f158139i;
    }

    @Override // com.tencent.mm.service.MMService
    public void d() {
        super.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.KVReportService", "onCreate");
    }
}

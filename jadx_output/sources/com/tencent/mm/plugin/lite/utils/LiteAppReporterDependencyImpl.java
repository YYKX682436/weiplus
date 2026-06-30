package com.tencent.mm.plugin.lite.utils;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/lite/utils/LiteAppReporterDependencyImpl;", "Lcom/tencent/liteapp/gen/LiteAppReporterDependency;", "", "logid", "", "logString", "Ljz5/f0;", "kvlog", "Lcom/tencent/liteapp/gen/LiteAppMetricsInfo;", "getMetricsInfo", "generateUUID", "", "calcIsSample", "calcIsTemporarySample", "useNewSampling", "<init>", "()V", "Companion", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class LiteAppReporterDependencyImpl implements com.tencent.liteapp.gen.LiteAppReporterDependency {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.Companion INSTANCE = new com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.Companion(null);
    public static final java.lang.String STATUS_MAIN_PROCESS_START = "LARS_MainProcessStart";
    public static final java.lang.String TAG = "MicroMsg.LiteAppReporterDependencyImpl";

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/lite/utils/LiteAppReporterDependencyImpl$Companion;", "", "()V", "STATUS_MAIN_PROCESS_START", "", "TAG", "getLiteAppReporter", "Lcom/tencent/liteapp/gen/LiteAppReporter;", "appId", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.liteapp.gen.LiteAppReporter getLiteAppReporter(java.lang.String appId) {
            kotlin.jvm.internal.o.g(appId, "appId");
            com.tencent.mm.plugin.lite.w.initLib();
            com.tencent.liteapp.gen.LiteAppReporter create = com.tencent.liteapp.gen.LiteAppReporter.create(appId, new com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl(), com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getSamplingConfigJson(appId));
            kotlin.jvm.internal.o.f(create, "create(...)");
            return create;
        }
    }

    @Override // com.tencent.liteapp.gen.LiteAppReporterDependency
    public boolean calcIsSample() {
        java.lang.String j17 = j62.e.g().j("clicfg_liteapp_reporter_sampling_rate", "0", true, true);
        kotlin.jvm.internal.o.d(j17);
        double parseDouble = java.lang.Double.parseDouble(j17);
        if (parseDouble < 0.0d) {
            parseDouble = 0.0d;
        }
        if (parseDouble > 1.0d) {
            parseDouble = 1.0d;
        }
        return c06.e.f37716d.i() < parseDouble;
    }

    @Override // com.tencent.liteapp.gen.LiteAppReporterDependency
    public boolean calcIsTemporarySample() {
        java.lang.String j17 = j62.e.g().j("clicfg_liteapp_reporter_temporary_sampling_rate", "1", true, true);
        kotlin.jvm.internal.o.d(j17);
        double parseDouble = java.lang.Double.parseDouble(j17);
        if (parseDouble < 0.0d) {
            parseDouble = 0.0d;
        }
        if (parseDouble > 1.0d) {
            parseDouble = 1.0d;
        }
        return c06.e.f37716d.i() < parseDouble;
    }

    @Override // com.tencent.liteapp.gen.LiteAppReporterDependency
    public java.lang.String generateUUID() {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        return uuid;
    }

    @Override // com.tencent.liteapp.gen.LiteAppReporterDependency
    public com.tencent.liteapp.gen.LiteAppMetricsInfo getMetricsInfo() {
        return new com.tencent.liteapp.gen.LiteAppMetricsInfo(0L, 0L, 0L);
    }

    @Override // com.tencent.liteapp.gen.LiteAppReporterDependency
    public void kvlog(int i17, java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.e(TAG, "kvlog: logString is null or empty");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
        }
    }

    @Override // com.tencent.liteapp.gen.LiteAppReporterDependency
    public boolean useNewSampling() {
        return j62.e.g().l("clicfg_liteapp_reporter_new_sampling", false, true, true);
    }
}

package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class k0 implements com.tencent.mm.plugin.sns.storage.h1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f166035a;

    public java.lang.Object a(java.lang.Object obj, f06.v property) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdClickRes");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdClickRes");
        kotlin.jvm.internal.o.g(property, "property");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f166035a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdClickRes");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdClickRes");
        return adClickActionInfo;
    }

    public void b(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        java.lang.Object m521constructorimpl;
        java.util.List<com.tencent.mm.plugin.sns.storage.x0> list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdClickRes");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdClickRes");
        kotlin.jvm.internal.o.g(property, "property");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.ThreadLocal<java.util.List<com.tencent.mm.plugin.sns.storage.x0>> threadLocal = com.tencent.mm.plugin.sns.storage.ADXml.sPreloadListThreadLocal;
            m521constructorimpl = kotlin.Result.m521constructorimpl((threadLocal == null || (list = threadLocal.get()) == null) ? null : java.lang.Boolean.valueOf(list.add(new com.tencent.mm.plugin.sns.storage.c1(adClickActionInfo))));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("add preload error?", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        this.f166035a = adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdClickRes");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdClickRes");
    }
}

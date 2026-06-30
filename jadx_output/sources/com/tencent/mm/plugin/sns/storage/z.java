package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class z implements com.tencent.mm.plugin.sns.storage.h1 {

    /* renamed from: a, reason: collision with root package name */
    public r45.jj4 f166181a;

    public java.lang.Object a(java.lang.Object obj, f06.v property) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdBigImageRes");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdBigImageRes");
        kotlin.jvm.internal.o.g(property, "property");
        r45.jj4 jj4Var = this.f166181a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdBigImageRes");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdBigImageRes");
        return jj4Var;
    }

    public void b(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        java.lang.Object m521constructorimpl;
        java.util.List<com.tencent.mm.plugin.sns.storage.x0> list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdBigImageRes");
        r45.jj4 jj4Var = (r45.jj4) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdBigImageRes");
        kotlin.jvm.internal.o.g(property, "property");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.ThreadLocal<java.util.List<com.tencent.mm.plugin.sns.storage.x0>> threadLocal = com.tencent.mm.plugin.sns.storage.ADXml.sPreloadListThreadLocal;
            m521constructorimpl = kotlin.Result.m521constructorimpl((threadLocal == null || (list = threadLocal.get()) == null) ? null : java.lang.Boolean.valueOf(list.add(new com.tencent.mm.plugin.sns.storage.b1(jj4Var))));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("add ad big image res error?", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        this.f166181a = jj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdBigImageRes");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdBigImageRes");
    }
}

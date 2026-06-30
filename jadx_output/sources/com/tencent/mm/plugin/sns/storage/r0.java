package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class r0 implements com.tencent.mm.plugin.sns.storage.h1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f166116a;

    public java.lang.Object a(java.lang.Object obj, f06.v property) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdImageRes");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdImageRes");
        kotlin.jvm.internal.o.g(property, "property");
        java.lang.String str = this.f166116a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdImageRes");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.storage.AdImageRes");
        return str;
    }

    public void b(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        java.lang.Object m521constructorimpl;
        java.util.List<com.tencent.mm.plugin.sns.storage.x0> list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdImageRes");
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdImageRes");
        kotlin.jvm.internal.o.g(property, "property");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.ThreadLocal<java.util.List<com.tencent.mm.plugin.sns.storage.x0>> threadLocal = com.tencent.mm.plugin.sns.storage.ADXml.sPreloadListThreadLocal;
            m521constructorimpl = kotlin.Result.m521constructorimpl((threadLocal == null || (list = threadLocal.get()) == null) ? null : java.lang.Boolean.valueOf(list.add(new com.tencent.mm.plugin.sns.storage.j1(str))));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("add preload error?", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        this.f166116a = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdImageRes");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdImageRes");
    }
}

package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class q0 implements com.tencent.mm.plugin.sns.storage.h1 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f166105a;

    public void a(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        java.lang.Object m521constructorimpl;
        java.util.ArrayList arrayList;
        java.lang.ThreadLocal<java.util.List<com.tencent.mm.plugin.sns.storage.x0>> threadLocal;
        java.util.List<com.tencent.mm.plugin.sns.storage.x0> list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdImageRes$Companion$withList$1");
        java.util.List list2 = (java.util.List) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdImageRes$Companion$withList$1");
        kotlin.jvm.internal.o.g(property, "property");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Boolean bool = null;
            if (list2 != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.tencent.mm.plugin.sns.storage.j1((java.lang.String) it.next()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && (threadLocal = com.tencent.mm.plugin.sns.storage.ADXml.sPreloadListThreadLocal) != null && (list = threadLocal.get()) != null) {
                bool = java.lang.Boolean.valueOf(list.addAll(arrayList));
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(bool);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("add preload error?", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        this.f166105a = list2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdImageRes$Companion$withList$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setValue", "com.tencent.mm.plugin.sns.storage.AdImageRes$Companion$withList$1");
    }
}

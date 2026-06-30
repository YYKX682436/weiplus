package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f187911a = new java.util.concurrent.ConcurrentLinkedDeque();

    public final void a(com.tencent.mm.plugin.webview.webcompt.b key) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i17 = key.f187763d;
        g0Var.idkeyStat(1147L, i17, 1L, false);
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f187911a;
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : concurrentLinkedDeque) {
            java.lang.Long l17 = (java.lang.Long) obj;
            kotlin.jvm.internal.o.d(l17);
            if (l17.longValue() > 0) {
                arrayList.add(obj);
            }
        }
        for (java.lang.Long l18 : arrayList) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            kotlin.jvm.internal.o.d(l18);
            g0Var2.idkeyStat(l18.longValue(), i17, 1L, false);
        }
    }
}

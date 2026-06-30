package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.e1 f125004a = new com.tencent.mm.plugin.finder.report.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f125005b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f125006c = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public final com.tencent.mm.plugin.finder.report.d1 a(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f125005b;
        com.tencent.mm.plugin.finder.report.d1 d1Var = (com.tencent.mm.plugin.finder.report.d1) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (d1Var != null) {
            return d1Var;
        }
        com.tencent.mm.plugin.finder.report.d1 d1Var2 = new com.tencent.mm.plugin.finder.report.d1();
        concurrentHashMap.put(java.lang.Long.valueOf(j17), d1Var2);
        return d1Var2;
    }

    public final void b(java.lang.Long l17) {
        if (l17 != null) {
            l17.longValue();
            com.tencent.mm.plugin.finder.report.d1 a17 = a(l17.longValue());
            if (!(a17.f124990c == 0)) {
                a17 = null;
            }
            if (a17 != null) {
                a17.f124990c = c01.id.c();
            } else {
                f125005b.remove(l17);
                b(l17);
            }
        }
    }

    public final void c(java.lang.Long l17) {
        if (l17 != null) {
            l17.longValue();
            com.tencent.mm.plugin.finder.report.d1 a17 = a(l17.longValue());
            if (!(a17.f124988a == 0)) {
                a17 = null;
            }
            if (a17 != null) {
                a17.f124988a = c01.id.c();
            } else {
                f125005b.remove(l17);
                c(l17);
            }
        }
    }
}

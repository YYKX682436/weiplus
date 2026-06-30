package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.k4 f125076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.tencent.mm.plugin.finder.report.k4 k4Var) {
        super(0);
        this.f125076d = k4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.report.h hVar;
        r45.i16 V6;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        r45.cl2 cl2Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.report.k4 k4Var = this.f125076d;
        java.util.Iterator it = k4Var.B.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hVar = k4Var.f125105w;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            r45.vd6 d17 = k4Var.d1((com.tencent.mm.plugin.finder.report.n4) entry.getValue(), false);
            com.tencent.mm.plugin.finder.report.n4 n4Var = k4Var.f125107y;
            if (!(n4Var != null && ((java.lang.Number) entry.getKey()).longValue() == n4Var.f125153a)) {
                linkedList.add(d17);
            }
            hVar.d(18054, (com.tencent.mm.plugin.finder.report.n4) entry.getValue());
        }
        k4Var.B = new java.util.HashMap();
        k4Var.e1();
        com.tencent.mm.plugin.finder.report.n4 n4Var2 = k4Var.f125107y;
        if (n4Var2 != null) {
            k4Var.a1(n4Var2, n4Var2.f125183p, true, c01.id.c());
            n4Var2.K(k4Var.f125288o);
            com.tencent.mm.plugin.finder.report.u0 u0Var = k4Var.f125106x;
            kotlinx.coroutines.r2 r2Var = u0Var.f125381f;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            u0Var.f125381f = null;
            u0Var.f125380e = null;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = n4Var2.f125159d;
            if ((finderItem == null || (feedObject = finderItem.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null || (cl2Var = (r45.cl2) object_extend.getCustom(4)) == null || !cl2Var.getBoolean(12)) ? false : true) {
                com.tencent.mm.ui.MMFragmentActivity activity = k4Var.f125283g;
                kotlin.jvm.internal.o.g(activity, "activity");
                sc2.a8 a8Var = (sc2.a8) pf5.z.f353948a.a(activity).e(sc2.a8.class);
                long j17 = n4Var2.f125153a;
                if (a8Var == null || (V6 = a8Var.V6(j17)) == null) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderSingleFeedFlowReporter", "get native ad extra info failed, feedId: " + j17 + " cache not found");
                } else {
                    V6.set(11, kz5.n0.g0(n4Var2.R, ";", null, null, 0, null, null, 62, null));
                    n4Var2.f125182o0 = V6;
                }
            }
            r45.vd6 d18 = com.tencent.mm.plugin.finder.report.n4.f125151r0.d(n4Var2, k4Var.f125284h);
            linkedList.add(d18);
            k4Var.b1(n4Var2, d18, false);
        }
        k4Var.f125107y = null;
        com.tencent.mm.plugin.finder.report.s3.f125347c = null;
        if (!linkedList.isEmpty()) {
            k4Var.f125103u.addAll(linkedList);
            k4Var.R0();
        }
        k4Var.A = new java.util.HashSet();
        if (!hVar.b(0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = hVar.f125057b;
            for (java.util.Map.Entry entry2 : concurrentHashMap.entrySet()) {
                int intValue = ((java.lang.Number) entry2.getKey()).intValue();
                int size = ((java.util.List) entry2.getValue()).size();
                java.lang.Iterable iterable = (java.lang.Iterable) entry2.getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : iterable) {
                    if (((com.tencent.mm.plugin.finder.report.g) obj).f125033b) {
                        arrayList.add(obj);
                    }
                }
                int size2 = arrayList.size();
                int i17 = size - size2;
                java.lang.String str = "logId:" + intValue + " -- allocateCount:" + size + " releasedCount:" + size2 + " unReleaseCount:" + i17;
                if (i17 > 0) {
                    java.lang.Iterable iterable2 = (java.lang.Iterable) entry2.getValue();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : iterable2) {
                        if (!((com.tencent.mm.plugin.finder.report.g) obj2).f125033b) {
                            arrayList2.add(obj2);
                        }
                    }
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        com.tencent.mars.xlog.Log.w("FeedReportWatcher", "not released logId:" + intValue + " -- " + ((com.tencent.mm.plugin.finder.report.g) it6.next()).f125034c);
                    }
                }
                sb6.append(str + '\n');
            }
            com.tencent.mars.xlog.Log.i("FeedReportWatcher", hVar.a(hVar) + " calc result:\n" + ((java.lang.Object) sb6));
            concurrentHashMap.clear();
        }
        return jz5.f0.f302826a;
    }
}

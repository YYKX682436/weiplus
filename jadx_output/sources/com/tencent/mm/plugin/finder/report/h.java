package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f125056a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f125057b = new java.util.concurrent.ConcurrentHashMap();

    public final java.lang.String a(java.lang.Object obj) {
        return ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(obj.hashCode());
    }

    public final boolean b(int i17) {
        int i18 = this.f125056a;
        return i18 == 0 || i18 != i17;
    }

    public void c(int i17, com.tencent.mm.plugin.finder.report.n4 n4Var) {
        if (b(i17) || n4Var == null) {
            return;
        }
        com.tencent.mm.plugin.finder.report.g gVar = new com.tencent.mm.plugin.finder.report.g(n4Var.hashCode(), false, "feedId:" + ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(n4Var.f125153a) + "  obj:" + a(n4Var), null, 8, null);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f125057b;
        java.util.List list = (java.util.List) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (list == null) {
            list = new java.util.ArrayList();
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), list);
        }
        list.add(gVar);
    }

    public void d(int i17, com.tencent.mm.plugin.finder.report.n4 n4Var) {
        if (b(i17) || n4Var == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f125057b;
        java.lang.Iterable iterable = (java.util.List) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (iterable == null) {
            iterable = new java.util.ArrayList();
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((com.tencent.mm.plugin.finder.report.g) next).f125032a == n4Var.hashCode()) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        com.tencent.mm.plugin.finder.report.g gVar = arrayList != null ? (com.tencent.mm.plugin.finder.report.g) arrayList.get(0) : null;
        if (gVar != null) {
            gVar.f125033b = true;
        }
    }

    public void e(so2.j5 j5Var, java.lang.String prefixLog, com.tencent.mm.plugin.finder.report.n4 record) {
        kotlin.jvm.internal.o.g(prefixLog, "prefixLog");
        kotlin.jvm.internal.o.g(record, "record");
        if (!b(0) && (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            java.lang.String Ui = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(baseFinderFeed.getItemId());
            ya2.b2 contact = baseFinderFeed.getContact();
            java.lang.String str = contact != null ? contact.field_nickname : null;
            if (str == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("FeedReportWatcher", prefixLog + " --- nickName:" + str + " feedId:" + Ui + "        record obj:" + a(record));
        }
    }
}

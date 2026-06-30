package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class w4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.w4 f125422a = new com.tencent.mm.plugin.finder.report.w4();

    public final r45.vd6 a(long j17, java.lang.String str, int i17, java.lang.String str2, int i18) {
        r45.vd6 vd6Var = new r45.vd6();
        vd6Var.set(2, new r45.yw6());
        vd6Var.set(1, new r45.oi());
        vd6Var.set(3, new r45.q25());
        vd6Var.set(0, java.lang.Long.valueOf(j17));
        vd6Var.set(28, str);
        vd6Var.set(10, java.lang.Integer.valueOf(i18));
        vd6Var.set(8, str2);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        vd6Var.set(5, xy2.c.e(context));
        vd6Var.set(6, java.lang.Long.valueOf(c01.id.c()));
        vd6Var.set(13, java.lang.Integer.valueOf(i17));
        return vd6Var;
    }

    public final void b(java.util.List list, r45.qt2 qt2Var, int i17) {
        kotlin.jvm.internal.o.g(list, "list");
        if (i17 > 2 || list.isEmpty()) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (list.size() > 20) {
            linkedList2.addAll(list.subList(0, 20));
            linkedList.addAll(list.subList(20, list.size()));
        } else {
            linkedList2.addAll(list);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[sendStatsLimit] list=");
        sb6.append(list.size());
        sb6.append(" feed=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(pm0.v.u(((r45.vd6) it.next()).getLong(0)));
        }
        sb6.append(arrayList);
        sb6.append("}  tryCount=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.StatLogicReporter", sb6.toString());
        db2.y2 y2Var = new db2.y2(linkedList2, qt2Var);
        y2Var.f70649i = true;
        y2Var.l().H(new com.tencent.mm.plugin.finder.report.v4(linkedList2, linkedList, qt2Var, i17));
    }
}

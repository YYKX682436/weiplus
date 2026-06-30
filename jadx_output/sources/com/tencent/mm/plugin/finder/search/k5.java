package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.search.k5 f125747a = new com.tencent.mm.plugin.finder.search.k5();

    /* renamed from: b, reason: collision with root package name */
    public static final r45.ju2 f125748b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f125749c;

    static {
        r45.ju2 ju2Var = new r45.ju2();
        f125748b = ju2Var;
        f125749c = new java.util.HashMap();
        try {
            ju2Var.parseFrom(com.tencent.mm.vfs.w6.N(com.tencent.mm.plugin.finder.assist.e9.f102145n + "ringtone-search-history.info", 0, -1));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderSearchHistoryLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public final void a() {
        java.util.Iterator it = f125749c.values().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.search.d5) it.next()).update();
        }
    }

    public final void b(java.lang.String query) {
        kotlin.jvm.internal.o.g(query, "query");
        r45.ku2 ku2Var = new r45.ku2();
        int i17 = 0;
        ku2Var.set(0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        ku2Var.set(1, query);
        synchronized (this) {
            java.util.LinkedList list = f125748b.getList(0);
            if (list != null) {
                int size = list.size();
                while (true) {
                    if (i17 >= size) {
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((r45.ku2) list.get(i17)).getString(1), query)) {
                        list.remove(i17);
                        break;
                    }
                    i17++;
                }
                list.addFirst(ku2Var);
                if (list.size() > 20) {
                    list.removeLast();
                }
            }
        }
        a();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.search.j5(this));
    }
}

package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class h extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.k f137553q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.fts.logic.k kVar, p13.u ftsRequest) {
        super(ftsRequest);
        kotlin.jvm.internal.o.g(ftsRequest, "ftsRequest");
        this.f137553q = kVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchCommonChatroomUserTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f351135n;
        com.tencent.mm.plugin.fts.logic.k kVar = this.f137553q;
        if (vVar == null || uVar == null) {
            return;
        }
        p13.r d17 = p13.r.d(uVar.f351155q);
        vVar.f351159d = d17;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String r17 = c01.z1.r();
        w13.a aVar = kVar.f137577g;
        if (aVar != null) {
            java.lang.String format = java.lang.String.format("SELECT content FROM " + aVar.o() + " NOT INDEXED JOIN " + aVar.r() + " ON (" + aVar.r() + ".docid = " + aVar.o() + ".rowid) WHERE " + aVar.o() + " MATCH '" + d17.f() + "' AND entity_id <= 50 ORDER BY timestamp DESC LIMIT 10;", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            kotlin.jvm.internal.o.f(format, "format(...)");
            android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) aVar.f342198f).o(format, null);
            while (o17.moveToNext()) {
                try {
                    java.lang.String[] split = o13.c.f342210c.split(o17.getString(0));
                    kotlin.jvm.internal.o.f(split, "split(...)");
                    for (java.lang.String str : split) {
                        if (!((java.util.ArrayList) uVar.f351155q).contains(str) && !r17.equals(str)) {
                            hashSet.add(str);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(o17, th6);
                        throw th7;
                    }
                }
            }
            vz5.b.a(o17, null);
        }
        o("queryCommonChatroom");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        java.util.HashMap hashMap = o13.n.f342241a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = ((java.util.ArrayList) d75.b.c(arrayList, 500)).iterator();
        while (it6.hasNext()) {
            java.util.List list = (java.util.List) it6.next();
            p75.n0 n0Var = dm.g3.f237047n;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            p75.d dVar = dm.g3.f237050q;
            linkedList.add(dVar);
            linkedList.add(dm.g3.f237051r);
            p75.m c17 = dVar.l(list).c(dm.g3.f237049p.i(5));
            p75.i0 g17 = dm.g3.f237047n.g(linkedList);
            g17.f352657d = c17;
            g17.d(linkedList2);
            g17.b(linkedList3);
            arrayList2.addAll(g17.a().k(((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f.l(), dm.g3.class));
        }
        java.util.Collections.sort(arrayList2, new o13.m());
        java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((dm.g3) it7.next()).t0());
        }
        for (java.lang.String str2 : arrayList3) {
            p13.z zVar = new p13.z();
            zVar.f351187e = str2;
            vVar.f351160e.add(zVar);
            if (vVar.f351160e.size() >= uVar.f351147i) {
                break;
            }
        }
        o("queryRelatedUser");
    }
}

package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class a1 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137449q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137449q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchTopContactTask";
    }

    @Override // p13.c
    public int k() {
        return 22;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        p13.r b17 = p13.r.b(this.f351135n.f351141c, true);
        vVar.f351159d = b17;
        w13.b bVar = this.f137449q.f137588g;
        bVar.getClass();
        if (b17.a()) {
            o17 = new d95.d();
        } else {
            o17 = ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype), CASE WHEN timestamp - %d > 0 THEN 1 ELSE 0 END AS time_range FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131072 ORDER BY time_range desc, subtype ;", bVar.r(), bVar.o(), java.lang.Long.valueOf(((java.util.ArrayList) b17.f351133e).size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - 1105032704), bVar.r(), bVar.o(), bVar.r(), bVar.o(), bVar.o(), b17.f()), null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.f351135n.f351148j);
        int i17 = 0;
        while (o17.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.c(o17);
            if (hashSet.add(zVar.f351187e)) {
                if (i17 >= zVar.f351185c) {
                    arrayList.add(zVar);
                } else {
                    if (arrayList.size() > this.f351135n.f351147i) {
                        break;
                    }
                    i17 = zVar.f351185c;
                    arrayList.add(zVar);
                }
                if (java.lang.Thread.interrupted() || this.f351066f) {
                    o17.close();
                    throw new java.lang.InterruptedException("Task is Cancel: " + this.f351135n.f351141c);
                }
            }
        }
        o17.close();
        vVar.f351160e = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p13.z zVar2 = (p13.z) it.next();
            zVar2.a();
            zVar2.b(vVar.f351159d);
            com.tencent.mm.plugin.fts.logic.l.n(zVar2);
            vVar.f351160e.add(zVar2);
        }
        java.util.Comparator comparator = this.f351135n.f351150l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f351160e, comparator);
        }
    }
}

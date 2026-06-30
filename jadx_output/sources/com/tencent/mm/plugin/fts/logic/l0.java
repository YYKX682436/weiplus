package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class l0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137604q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137604q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchTopChatroomInnerRankTask";
    }

    @Override // p13.c
    public int k() {
        return 25;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        o("start");
        p13.r b17 = p13.r.b(this.f351135n.f351141c, true);
        vVar.f351159d = b17;
        w13.b bVar = this.f137604q.f137588g;
        bVar.getClass();
        if (b17.a()) {
            o17 = new d95.d();
        } else {
            java.lang.String f17 = b17.f();
            long currentTimeMillis = java.lang.System.currentTimeMillis() - 1209600000;
            long size = ((java.util.ArrayList) b17.f351133e).size();
            o17 = ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype) AS Offsets, MMChatroomRank(%s, timestamp / 1000 - %d / 1000, subtype, ?, entity_id, %d) AS Rank FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131075 ORDER BY entity_id ;", bVar.r(), bVar.o(), java.lang.Long.valueOf(size), bVar.o(), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(size), bVar.r(), bVar.o(), bVar.r(), bVar.o(), bVar.o(), f17), new java.lang.String[]{b17.f351130b});
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.f351135n.f351148j);
        while (o17.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.e(o17);
            if (hashSet.add(zVar.f351187e)) {
                if (arrayList.size() > this.f351135n.f351147i) {
                    break;
                }
                arrayList.add(zVar);
                if (java.lang.Thread.interrupted() || this.f351066f) {
                    o17.close();
                    throw new java.lang.InterruptedException("Task is Cancel: " + this.f351135n.f351141c);
                }
            }
        }
        o17.close();
        if (java.lang.Thread.interrupted() || this.f351066f) {
            throw new java.lang.InterruptedException();
        }
        o("orm");
        vVar.f351160e = new java.util.ArrayList(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p13.z zVar2 = (p13.z) it.next();
            zVar2.a();
            zVar2.b(vVar.f351159d);
            com.tencent.mm.plugin.fts.logic.l.n(zVar2);
            vVar.f351160e.add(zVar2);
        }
        if (java.lang.Thread.interrupted() || this.f351066f) {
            throw new java.lang.InterruptedException();
        }
        java.util.Comparator comparator = this.f351135n.f351150l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f351160e, comparator);
        }
        o("calOffsets");
        o("checkChatroom");
    }
}

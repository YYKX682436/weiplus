package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class l1 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.s1 f137605q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.fts.logic.s1 s1Var, p13.u ftsRequest) {
        super(ftsRequest);
        kotlin.jvm.internal.o.g(ftsRequest, "ftsRequest");
        this.f137605q = s1Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchOpenIMKefuContactTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.f351135n.f351148j);
        p75.i0 i17 = dm.i2.K.i();
        i17.f352657d = dm.i2.L.p("'%@kefu.openim'");
        java.util.List k17 = i17.a().k(gm0.j1.u().f273153f, com.tencent.mm.storage.l4.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.mm.storage.l4) it.next()).h1());
        }
        p13.u uVar = this.f351135n;
        com.tencent.mm.plugin.fts.logic.s1 s1Var = this.f137605q;
        if (vVar == null || uVar == null) {
            return;
        }
        p13.r b17 = p13.r.b(uVar.f351141c, true);
        vVar.f351159d = b17;
        w13.g gVar = s1Var.f137665f;
        if (gVar != null) {
            if (b17.a()) {
                o17 = new d95.d();
            } else {
                java.lang.String format = java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %s, type, subtype) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = '%s' AND status >= 0 ORDER BY subtype;", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.r(), gVar.o(), java.lang.Long.valueOf(((java.util.ArrayList) b17.f351133e).size()), gVar.r(), gVar.o(), gVar.r(), gVar.o(), gVar.o(), b17.f(), 131089}, 10));
                kotlin.jvm.internal.o.f(format, "format(...)");
                o17 = ((com.tencent.mm.plugin.fts.o) gVar.f342198f).o(format, null);
            }
            while (o17.moveToNext()) {
                try {
                    p13.z zVar = new p13.z();
                    zVar.c(o17);
                    if (hashSet.add(zVar.f351187e)) {
                        if (arrayList.contains(zVar.f351187e)) {
                            vVar.f351160e.add(zVar);
                            if (vVar.f351160e.size() > uVar.f351147i) {
                                break;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", zVar.f351187e + " already delete");
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
    }
}

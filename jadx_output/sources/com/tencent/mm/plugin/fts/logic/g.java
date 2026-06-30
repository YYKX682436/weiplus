package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class g extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.k f137543q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.fts.logic.k kVar, p13.u ftsRequest) {
        super(ftsRequest);
        kotlin.jvm.internal.o.g(ftsRequest, "ftsRequest");
        this.f137543q = kVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchCommonChatroomTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f351135n;
        com.tencent.mm.plugin.fts.logic.k kVar = this.f137543q;
        if (vVar == null || uVar == null) {
            return;
        }
        p13.r d17 = p13.r.d(uVar.f351155q);
        int size = ((java.util.ArrayList) uVar.f351155q).size() + 1;
        vVar.f351159d = d17;
        w13.a aVar = kVar.f137577g;
        if (aVar != null) {
            java.lang.String format = java.lang.String.format("SELECT aux_index FROM " + aVar.o() + " NOT INDEXED JOIN " + aVar.r() + " ON (" + aVar.r() + ".docid = " + aVar.o() + ".rowid) WHERE " + aVar.o() + " MATCH '" + d17.f() + "' AND entity_id = " + size + " ORDER BY timestamp DESC;", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            kotlin.jvm.internal.o.f(format, "format(...)");
            android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) aVar.f342198f).o(format, null);
            do {
                try {
                    if (!o17.moveToNext()) {
                        break;
                    }
                    p13.z zVar = new p13.z();
                    zVar.f351187e = o17.getString(0);
                    vVar.f351160e.add(zVar);
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(o17, th6);
                        throw th7;
                    }
                }
            } while (vVar.f351160e.size() < uVar.f351147i);
            vz5.b.a(o17, null);
        }
    }
}

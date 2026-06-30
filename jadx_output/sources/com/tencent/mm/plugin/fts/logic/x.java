package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class x extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137730q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137730q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "CheckContactTask";
    }

    @Override // p13.c
    public int k() {
        return 48;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        java.lang.String str;
        boolean z17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        p13.r b17 = p13.r.b(this.f351135n.f351141c, true);
        vVar.f351159d = b17;
        w13.b bVar = this.f137730q.f137588g;
        p13.u uVar = this.f351135n;
        int[] iArr = uVar.f351145g;
        int[] iArr2 = uVar.f351146h;
        bVar.getClass();
        if (b17.a()) {
            z17 = false;
        } else {
            java.lang.String f17 = b17.f();
            java.lang.String str2 = "";
            if (iArr2 == null || iArr2.length <= 0) {
                str = "";
            } else {
                str = " AND subtype IN " + o13.n.m(iArr2);
            }
            if (iArr != null && iArr.length > 0) {
                str2 = " AND type IN " + o13.n.m(iArr);
            }
            android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o(java.lang.String.format("SELECT 1 FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + str2 + " AND status >= 0" + str + " LIMIT 1;", bVar.r(), bVar.o(), bVar.r(), bVar.o(), bVar.o(), f17), null);
            boolean moveToNext = ((android.database.CursorWrapper) o17).moveToNext();
            ((com.tencent.mm.plugin.fts.e) o17).close();
            z17 = moveToNext;
        }
        if (z17) {
            vVar.f351160e.add(new p13.y());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "CheckContactTask execSearch coast %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}

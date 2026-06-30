package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class v0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137709q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137709q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchContactSmallerTimestampTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        long longValue = java.lang.Long.valueOf(this.f351135n.f351141c).longValue();
        w13.b bVar = this.f137709q.f137588g;
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o(java.lang.String.format("SELECT distinct(aux_index) FROM %s WHERE timestamp < %d AND type = %d", bVar.r(), java.lang.Long.valueOf(longValue), 131072), null);
        vVar.f351160e = new java.util.ArrayList();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                return;
            } else {
                p13.y yVar = new p13.y();
                yVar.f351187e = cursorWrapper.getString(0);
                vVar.f351160e.add(yVar);
            }
        }
    }
}

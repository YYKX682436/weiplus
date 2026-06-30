package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class p2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.q2 f137648q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.fts.logic.q2 q2Var, p13.u uVar) {
        super(uVar);
        this.f137648q = q2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchSOSHistoryTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        super.p(vVar);
        vVar.f351160e = new java.util.ArrayList();
        w13.i iVar = this.f137648q.f137654e;
        int i17 = this.f351135n.f351147i;
        iVar.getClass();
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) iVar.f442219g).o(java.lang.String.format("SELECT content, timestamp FROM %s ORDER BY timestamp desc LIMIT " + i17, "FTS5MetaSOSHistory"), null);
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                vVar.f351158c = 0;
                return;
            } else {
                java.lang.String string = cursorWrapper.getString(0);
                p13.z zVar = new p13.z();
                zVar.f351190h = string;
                vVar.f351160e.add(zVar);
            }
        }
    }
}

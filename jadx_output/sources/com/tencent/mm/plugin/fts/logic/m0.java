package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class m0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137625q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137625q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchChatroomCountTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        super.p(vVar);
        w13.b bVar = this.f137625q.f137588g;
        java.lang.String str = this.f351135n.f351141c;
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o(java.lang.String.format("SELECT count(aux_index) FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=? AND subtype=38 AND type=131075", bVar.r()), new java.lang.String[]{str});
        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
        int i17 = cursorWrapper.moveToNext() ? cursorWrapper.getInt(0) : 0;
        ((com.tencent.mm.plugin.fts.e) o17).close();
        p13.y yVar = new p13.y();
        yVar.f351197o = java.lang.Integer.valueOf(i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        vVar.f351160e = arrayList;
        arrayList.add(yVar);
    }
}

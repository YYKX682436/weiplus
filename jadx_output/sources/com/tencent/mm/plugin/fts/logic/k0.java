package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class k0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137581q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137581q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchChatroomByMemberTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        super.p(vVar);
        w13.b bVar = this.f137581q.f137588g;
        java.lang.String str = this.f351135n.f351141c;
        java.lang.String format = java.lang.String.format("SELECT aux_index FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=? AND subtype=38 AND type=131075 ORDER BY timestamp desc", bVar.r());
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o(format, new java.lang.String[]{str});
        vVar.f351160e = new java.util.ArrayList();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                vVar.f351158c = 0;
                return;
            } else {
                p13.y yVar = new p13.y();
                yVar.f351187e = cursorWrapper.getString(0);
                vVar.f351160e.add(yVar);
            }
        }
    }
}

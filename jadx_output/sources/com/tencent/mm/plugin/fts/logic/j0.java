package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class j0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137567q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137567q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "QueryRecommendLabelByCommonChatroomTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        super.p(vVar);
        w13.b bVar = this.f137567q.f137588g;
        java.lang.String str = this.f351135n.f351141c;
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o("SELECT\n    l.label_id,\n    COUNT(DISTINCT m.member) AS user_count,\n    (SELECT COUNT(DISTINCT chatroom) FROM FTS5ChatRoomMembers) AS total_chatrooms,\n    (SELECT COUNT(DISTINCT member) FROM FTS5ChatRoomMembers) AS total_members,\n    (SELECT COUNT(DISTINCT chatroom) FROM FTS5ChatRoomMembers WHERE member = ?) AS member_chatroom_count,\n    (SELECT COUNT(DISTINCT m.member) FROM FTS5ChatRoomMembers m\n     INNER JOIN (\n         SELECT chatroom\n         FROM FTS5ChatRoomMembers\n         WHERE member = ?\n         GROUP BY chatroom\n     ) g ON m.chatroom = g.chatroom\n     INNER JOIN FTS5ContactLabels l ON m.member = l.user\n     WHERE m.member != ?) AS labeled_member_count\nFROM FTS5ChatRoomMembers m\nINNER JOIN (\n    SELECT chatroom\n    FROM FTS5ChatRoomMembers\n    WHERE member = ?\n    GROUP BY chatroom\n) g ON m.chatroom = g.chatroom\nINNER JOIN FTS5ContactLabels l ON m.member = l.user\nWHERE m.member != ?\nGROUP BY l.label_id\nORDER BY user_count DESC;", new java.lang.String[]{str, str, str, str, str});
        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "cursor getColumnNames: %s", java.util.Arrays.toString(cursorWrapper.getColumnNames()));
        vVar.f351160e = new java.util.ArrayList();
        while (cursorWrapper.moveToNext()) {
            if (cursorWrapper.getColumnCount() >= 6) {
                p13.y yVar = new p13.y();
                yVar.f351194l = new java.lang.String[]{cursorWrapper.getString(0), cursorWrapper.getString(1), cursorWrapper.getString(2), cursorWrapper.getString(3), cursorWrapper.getString(4), cursorWrapper.getString(5)};
                vVar.f351160e.add(yVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "cursor find: label_id=%s, user_count=%s", cursorWrapper.getString(0), cursorWrapper.getString(1));
        }
        ((com.tencent.mm.plugin.fts.e) o17).close();
        vVar.f351158c = 0;
    }
}

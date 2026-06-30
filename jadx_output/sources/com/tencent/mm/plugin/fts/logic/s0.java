package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class s0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137663q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137663q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchCommonChatroomTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(this.f351135n.f351141c.split(","));
        w13.b bVar = this.f137663q.f137588g;
        bVar.getClass();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("member IN (");
        for (int i17 = 0; i17 < P1.size(); i17++) {
            stringBuffer.append("'");
            stringBuffer.append((java.lang.String) P1.get(i17));
            stringBuffer.append("'");
            if (i17 != P1.size() - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(")");
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o(java.lang.String.format("SELECT member, chatroom, entity_id FROM FTS5ChatRoomMembers, %s WHERE %s AND chatroom = aux_index", bVar.r(), stringBuffer.toString()), null);
        java.util.HashMap hashMap = new java.util.HashMap();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                vVar.f351160e = arrayList;
                p13.y yVar = new p13.y();
                yVar.f351197o = hashMap;
                arrayList.add(yVar);
                return;
            }
            java.lang.String string = cursorWrapper.getString(0);
            java.util.List arrayList2 = hashMap.containsKey(string) ? (java.util.List) hashMap.get(string) : new java.util.ArrayList();
            p13.y yVar2 = new p13.y();
            yVar2.f351187e = cursorWrapper.getString(1);
            yVar2.f351186d = cursorWrapper.getLong(2);
            arrayList2.add(yVar2);
            hashMap.put(string, arrayList2);
        }
    }
}

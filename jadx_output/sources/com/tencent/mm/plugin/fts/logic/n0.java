package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class n0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137637q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137637q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchChatroomInMemberTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        super.p(vVar);
        w13.b bVar = this.f137637q.f137588g;
        java.lang.String str = this.f351135n.f351142d;
        p13.r rVar = vVar.f351159d;
        bVar.getClass();
        if (rVar.a()) {
            o17 = new d95.d();
        } else {
            java.lang.String f17 = rVar.f();
            o17 = ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o(java.lang.String.format("SELECT aux_index FROM %s NOT INDEXED JOIN (SELECT docid, aux_index, timestamp FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=?) as temp ON (%s.rowid = temp.docid) WHERE %s MATCH '%s' ORDER BY -timestamp;", bVar.o(), bVar.r(), bVar.o(), bVar.o(), f17), new java.lang.String[]{str});
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        vVar.f351160e = new java.util.ArrayList();
        while (o17.moveToNext()) {
            p13.y yVar = new p13.y();
            java.lang.String string = o17.getString(0);
            yVar.f351187e = string;
            if (hashSet.add(string)) {
                vVar.f351160e.add(yVar);
            }
        }
        o17.close();
        vVar.f351158c = 0;
    }
}

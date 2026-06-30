package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class r0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137660q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137660q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchChatroomTask";
    }

    @Override // p13.c
    public int k() {
        return 19;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f351135n;
        p13.r b17 = p13.r.b(uVar.f351141c, true);
        vVar.f351159d = b17;
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137660q;
        android.database.Cursor H = lVar.f137588g.H(b17, new int[]{131075}, null, null, true, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        while (H.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.c(H);
            if (!uVar.f351148j.contains(zVar.f351187e)) {
                p13.y yVar = (p13.y) hashMap.get(zVar.f351187e);
                if (yVar == null || o13.n.b(o13.d.f342232r, zVar.f351185c, yVar.f351185c) < 0) {
                    hashMap.put(zVar.f351187e, zVar);
                }
                if (java.lang.Thread.interrupted() || this.f351066f) {
                    H.close();
                    throw new java.lang.InterruptedException();
                }
            }
        }
        H.close();
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        for (p13.z zVar2 : hashMap.values()) {
            zVar2.a();
            zVar2.b(vVar.f351159d);
            com.tencent.mm.plugin.fts.logic.l.n(zVar2);
            arrayList.add(zVar2);
            if (java.lang.Thread.interrupted() || this.f351066f) {
                throw new java.lang.InterruptedException();
            }
        }
        java.util.Comparator comparator = uVar.f351150l;
        if (comparator != null) {
            java.util.Collections.sort(arrayList, comparator);
        }
        vVar.f351160e = new java.util.ArrayList(hashMap.size());
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            p13.y yVar2 = (p13.y) arrayList.get(i17);
            stringBuffer.append(yVar2.f351198p);
            stringBuffer.append("|");
            stringBuffer.append(yVar2.f351188f);
            stringBuffer.append(" ");
            vVar.f351160e.add(yVar2);
            if (i17 >= uVar.f351147i) {
                break;
            }
        }
        if (((java.util.ArrayList) vVar.f351159d.f351133e).size() > 1 && lVar.f137588g.O(vVar.f351159d)) {
            p13.y yVar3 = new p13.y();
            yVar3.f351187e = "create_chatroom\u200b";
            vVar.f351160e.add(0, yVar3);
            stringBuffer.append(" needCreateChatroom");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "rank score: %s", stringBuffer.toString());
    }
}

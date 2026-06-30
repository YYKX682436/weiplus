package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class j2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public int f137569q;

    /* renamed from: r, reason: collision with root package name */
    public int f137570r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137571s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.plugin.fts.logic.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f137571s = l2Var;
        this.f137569q = 0;
        this.f137570r = 0;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchTopGroupMessageTask";
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{totalMsgCount: %d conversationCount: %d}", java.lang.Integer.valueOf(this.f137569q), java.lang.Integer.valueOf(this.f137570r));
    }

    @Override // p13.c
    public int k() {
        return 15;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        java.lang.String str;
        android.database.Cursor o17;
        o("start");
        vVar.f351159d = p13.r.c(this.f351135n.f351141c, false, this.f137571s.f137618t);
        vVar.f351160e = new java.util.LinkedList();
        w13.h hVar = this.f137571s.f137609h;
        p13.r rVar = vVar.f351159d;
        int i17 = this.f351135n.f351147i;
        hVar.getClass();
        if (rVar.a()) {
            o17 = new d95.d();
        } else {
            java.lang.String f17 = rVar.f();
            if (i17 != Integer.MAX_VALUE) {
                str = " LIMIT " + (i17 + 1);
            } else {
                str = "";
            }
            o17 = ((com.tencent.mm.plugin.fts.o) hVar.f342198f).o(java.lang.String.format("SELECT type, subtype, entity_id, aux_index, MAX(timestamp) as maxTime, count(aux_index) as msgCount, talker FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND status >= 0" + hVar.q() + " GROUP BY aux_index ORDER BY timestamp desc" + str + ";", hVar.r(), hVar.o(), hVar.r(), hVar.o(), hVar.o(), f17), null);
        }
        while (o17.moveToNext()) {
            p13.y yVar = new p13.y();
            yVar.f351184b = o17.getInt(0);
            yVar.f351185c = o17.getInt(1);
            yVar.f351186d = o17.getLong(2);
            yVar.f351187e = o17.getString(3);
            yVar.f351188f = o17.getLong(4);
            int i18 = o17.getInt(5);
            if (com.tencent.mm.storage.z3.o4(yVar.f351187e) || com.tencent.mm.storage.z3.C3(yVar.f351187e)) {
                yVar.f351189g = o17.getString(6);
            }
            yVar.f351197o = java.lang.Integer.valueOf(i18);
            vVar.f351160e.add(yVar);
            this.f137569q += ((java.lang.Integer) yVar.f351197o).intValue();
            this.f137570r++;
        }
        o17.close();
        o("groupMessage");
        java.lang.String[] strArr = vVar.f351159d.f351132d;
        if (strArr.length > 1) {
            android.database.Cursor Q = ((w13.b) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3)).Q(p13.r.b(strArr[0], true), null, o13.d.f342225k, o13.d.f342229o);
            if (Q.moveToNext()) {
                p13.y yVar2 = new p13.y();
                yVar2.f351187e = "create_talker_message\u200b";
                vVar.f351160e.add(0, yVar2);
            }
            Q.close();
            o("findTalkerConversation");
        }
    }
}

package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class e2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137513q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.fts.logic.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f137513q = l2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchConversationMessageTask";
    }

    @Override // p13.c
    public int k() {
        return 14;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        java.lang.String format;
        o("start");
        p13.r c17 = p13.r.c(this.f351135n.f351141c, false, this.f137513q.f137618t);
        vVar.f351159d = c17;
        w13.h hVar = this.f137513q.f137609h;
        java.lang.String str = this.f351135n.f351142d;
        hVar.getClass();
        java.lang.String f17 = c17.f();
        java.lang.String q17 = hVar.q();
        if (com.tencent.mm.storage.z3.p4(str) || com.tencent.mm.storage.z3.z3(str)) {
            format = java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, talker, timestamp, talker FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND talker = ? AND status >= 0" + q17 + " ORDER BY timestamp desc;", hVar.r(), hVar.r(), hVar.o(), hVar.r(), hVar.o(), hVar.o(), f17);
        } else {
            format = java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index = ? AND status >= 0" + q17 + " ORDER BY timestamp desc;", hVar.r(), hVar.r(), hVar.o(), hVar.r(), hVar.o(), hVar.o(), f17);
        }
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) hVar.f342198f).o(format, new java.lang.String[]{str});
        vVar.f351160e = new java.util.ArrayList();
        while (((android.database.CursorWrapper) o17).moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.d(o17);
            zVar.f351197o = 1;
            zVar.f351190h = "conv_message_content";
            vVar.f351160e.add(zVar);
        }
        ((com.tencent.mm.plugin.fts.e) o17).close();
        o("findConversationMessage");
        if (vVar.f351159d.f351132d.length <= 1 || this.f351135n.f351148j.contains("create_talker_message\u200b")) {
            return;
        }
        android.database.Cursor Q = ((w13.b) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3)).Q(p13.r.b(vVar.f351159d.f351132d[0], true), null, o13.d.f342225k, o13.d.f342229o);
        if (Q.moveToNext()) {
            p13.y yVar = new p13.y();
            yVar.f351187e = "create_talker_message\u200b";
            vVar.f351160e.add(0, yVar);
        }
        Q.close();
        o("findTalkerConversation");
    }
}

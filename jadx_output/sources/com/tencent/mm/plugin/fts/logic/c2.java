package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class c2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137481q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.plugin.fts.logic.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f137481q = l2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchAppBrandKefuConversationMessageTask";
    }

    @Override // p13.c
    public int k() {
        return 14;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        o("start");
        p13.r c17 = p13.r.c(this.f351135n.f351141c, false, this.f137481q.f137618t);
        vVar.f351159d = c17;
        w13.h hVar = this.f137481q.f137609h;
        hVar.getClass();
        if (c17.a()) {
            o17 = new d95.d();
        } else {
            o17 = ((com.tencent.mm.plugin.fts.o) hVar.f342198f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, talker, MAX(timestamp) as maxTime, count(talker) as msgCount FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE aux_index = '%s' AND %s MATCH '%s' AND status >= 0 GROUP BY talker ORDER BY timestamp desc;", hVar.r(), hVar.r(), hVar.o(), hVar.r(), hVar.o(), "appbrandcustomerservicemsg", hVar.o(), c17.f()), null);
        }
        vVar.f351160e = new java.util.ArrayList();
        while (o17.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.f351183a = o17.getLong(0);
            zVar.f351184b = o17.getInt(1);
            zVar.f351185c = o17.getInt(2);
            zVar.f351186d = o17.getLong(3);
            zVar.f351187e = o17.getString(4);
            zVar.f351188f = o17.getLong(5);
            zVar.f351197o = java.lang.Integer.valueOf(o17.getInt(6));
            zVar.f351189g = o17.getString(4);
            vVar.f351160e.add(zVar);
        }
        o17.close();
        o("findkefuConversationMessage");
    }
}

package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class k2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137583q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.plugin.fts.logic.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f137583q = l2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchTypeMessage";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        o("start");
        vVar.f351160e = new java.util.LinkedList();
        w13.h hVar = this.f137583q.f137609h;
        p13.u uVar = this.f351135n;
        android.database.Cursor q17 = hVar.q1(uVar.f351146h, uVar.f351142d);
        while (q17.moveToNext()) {
            p13.y yVar = new p13.y();
            yVar.f351184b = q17.getInt(0);
            yVar.f351185c = q17.getInt(1);
            yVar.f351186d = q17.getLong(2);
            yVar.f351187e = q17.getString(3);
            yVar.f351188f = q17.getLong(4);
            yVar.f351189g = q17.getString(5);
            vVar.f351160e.add(yVar);
        }
        q17.close();
    }
}

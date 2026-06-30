package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class z2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final boolean f137757q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.e3 f137758r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.plugin.fts.logic.e3 e3Var, p13.u uVar, boolean z17) {
        super(uVar);
        this.f137758r = e3Var;
        this.f137757q = false;
        this.f137757q = z17;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchMessageTask";
    }

    @Override // p13.c
    public int k() {
        return 34;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.database.CursorWrapper, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, p13.y, p13.z] */
    @Override // p13.t
    public void p(p13.v vVar) {
        ?? r07;
        o("start");
        p13.r c17 = p13.r.c(this.f351135n.f351141c, false, this.f137758r.f137522p);
        vVar.f351159d = c17;
        if (this.f137757q) {
            w13.j jVar = this.f137758r.f137517h;
            java.lang.String str = this.f351135n.f351142d;
            jVar.getClass();
            java.lang.String f17 = c17.f();
            java.lang.String r17 = jVar.r();
            java.lang.String o17 = jVar.o();
            r07 = ((com.tencent.mm.plugin.fts.o) jVar.f342198f).o("SELECT " + r17 + ".docid, type, subtype, entity_id, aux_index, timestamp, talker FROM " + r17 + " JOIN " + o17 + " ON (" + r17 + ".docid = " + o17 + ".rowid) WHERE " + o17 + " MATCH '" + f17 + "' AND aux_index = '" + str + "' AND status >= 0 ORDER BY timestamp desc;", null);
        } else {
            r07 = this.f137758r.f137517h.O(c17, this.f351135n.f351142d);
        }
        do {
            r07 = (android.database.CursorWrapper) r07;
            if (!r07.moveToNext()) {
                break;
            }
            ?? zVar = new p13.z();
            zVar.d(r07);
            zVar.f351197o = 1;
            vVar.f351160e.add(zVar);
        } while (vVar.f351160e.size() <= 100);
        r07.close();
        java.util.Collections.sort(vVar.f351160e, this.f351135n.f351150l);
        o("findMessage");
    }
}

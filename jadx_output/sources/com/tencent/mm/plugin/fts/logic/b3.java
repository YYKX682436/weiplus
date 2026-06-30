package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class b3 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.e3 f137474q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.tencent.mm.plugin.fts.logic.e3 e3Var, p13.u uVar) {
        super(uVar);
        this.f137474q = e3Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchSenderTask";
    }

    @Override // p13.c
    public int k() {
        return 33;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        o("start");
        p13.u uVar = this.f351135n;
        java.lang.String str = uVar.f351141c;
        com.tencent.mm.plugin.fts.logic.e3 e3Var = this.f137474q;
        p13.r c17 = p13.r.c(str, false, e3Var.f137522p);
        vVar.f351159d = c17;
        e3Var.f137517h.getClass();
        android.database.Cursor L0 = ((com.tencent.mm.storage.z9) ((ro3.e) ((st0.f) i95.n0.c(st0.f.class))).wi()).L0(c17.f351129a);
        try {
            if (L0 == null) {
                return;
            }
            try {
                L0.moveToFirst();
                while (!L0.isAfterLast()) {
                    p13.y yVar = new p13.y();
                    yVar.f351190h = L0.getString(0);
                    yVar.f351187e = L0.getString(1);
                    yVar.f351197o = java.lang.Integer.valueOf(L0.getInt(2));
                    yVar.f351185c = 55;
                    vVar.f351160e.add(yVar);
                    L0.moveToNext();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", e17, "", new java.lang.Object[0]);
            }
            L0.close();
            java.util.Collections.sort(vVar.f351160e, uVar.f351150l);
            o("findSender");
        } catch (java.lang.Throwable th6) {
            L0.close();
            throw th6;
        }
    }
}

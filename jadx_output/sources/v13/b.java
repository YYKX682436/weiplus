package v13;

/* loaded from: classes5.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v13.e f432517a;

    public b(v13.e eVar) {
        this.f432517a = eVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSQueryClickRecallPLC", "OnPardusSearchSceneEnd " + fVar.f70615a + ' ' + fVar.f70616b + ' ' + fVar.f70617c);
        int i17 = fVar.f70615a;
        v13.e eVar = this.f432517a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.yc4 yc4Var = (r45.yc4) fVar.f70618d;
            r45.wc4 wc4Var = yc4Var != null ? yc4Var.f390962d : null;
            r45.st4 st4Var = yc4Var != null ? yc4Var.f390963e : null;
            eVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSQueryClickRecallPLC", "updateRecallDict");
            com.tencent.mm.plugin.fts.t tVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137379d;
            if (tVar != null) {
                tVar.b(65536, new v13.d(eVar, wc4Var, st4Var));
            }
            eVar.f432532g = (((r45.yc4) fVar.f70618d) != null ? r7.f390964f : 0) * 1000;
        }
        eVar.f432533h = null;
        return jz5.f0.f302826a;
    }
}

package dz4;

/* loaded from: classes12.dex */
public final class a1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz4.r f245158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.b1 f245159e;

    public a1(iz4.r rVar, dz4.b1 b1Var) {
        this.f245158d = rVar;
        this.f245159e = b1Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        o72.k4 oj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
        iz4.r rVar = this.f245158d;
        o72.r2 F = oj6.F(rVar.f296140e);
        dz4.b1 b1Var = this.f245159e;
        if (F == null || F.field_id == -1) {
            com.tencent.mars.xlog.Log.i(b1Var.f245170b, "favitem with local id = " + rVar.f296140e + " is not ready to pin.");
            return;
        }
        b1Var.a(rVar);
        gm0.j1.d().q(401, this);
        com.tencent.mars.xlog.Log.i(b1Var.f245170b, "pin favitem with favid = " + F.field_id + ", after it's inserted to the database.");
    }
}

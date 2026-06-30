package df2;

/* loaded from: classes3.dex */
public final class r implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.s f231204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gk2.e f231205b;

    public r(df2.s sVar, gk2.e eVar) {
        this.f231204a = sVar;
        this.f231205b = eVar;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        df2.s sVar = this.f231204a;
        com.tencent.mars.xlog.Log.i(sVar.f231278m, "doMiniWindow onResultAllow");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        gk2.e eVar = this.f231205b;
        if (r4Var.W1(eVar) || r4Var.z1(eVar)) {
            if (sn0.b.f409964e2 == null) {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new java.lang.Object[0]);
                sn0.b.f409964e2 = new sn0.b();
            }
            sn0.b bVar = sn0.b.f409964e2;
            kotlin.jvm.internal.o.d(bVar);
            bVar.D.f309581a = true;
        } else {
            if (in0.q.f292769b2 == null) {
                in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
            }
            in0.q qVar = in0.q.f292769b2;
            kotlin.jvm.internal.o.d(qVar);
            qVar.D.f309581a = true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 12);
        sVar.X6(qo0.b.B, bundle);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        y4Var.U = true;
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        y4Var.V = false;
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        df2.s sVar = this.f231204a;
        com.tencent.mars.xlog.Log.i(sVar.f231278m, "doMiniWindow onResultCancel");
        if2.b.Y6(sVar, qo0.b.G, null, 2, null);
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        df2.s sVar = this.f231204a;
        com.tencent.mars.xlog.Log.i(sVar.f231278m, "doMiniWindow onResultRefuse");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        if2.b.Y6(sVar, qo0.b.E, null, 2, null);
    }
}

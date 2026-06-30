package g20;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g20.g f267766d;

    public c(g20.g gVar) {
        this.f267766d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g20.g gVar = this.f267766d;
        boolean Vi = gVar.Vi();
        x02.h Bi = gVar.Bi();
        if (Bi != null) {
            urgen.ur_7522.UR_3A2B.UR_B604(((x02.i) Bi).getCppPointer(), Vi);
        }
        gVar.f267776g = java.lang.Boolean.valueOf(Vi);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_ECS_HAS_REPORT_POI_BOOLEAN_SYNC;
        if (c17.o(u3Var, false)) {
            return;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.G);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("0,0,");
        stringBuffer.append(Ri ? 1 : 0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(37693, stringBuffer);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "onAccountInitialized report37693 first time,rptValue:" + ((java.lang.Object) stringBuffer));
    }
}

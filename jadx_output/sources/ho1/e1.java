package ho1;

/* loaded from: classes9.dex */
public final class e1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282662e;

    public e1(ho1.q1 q1Var, long j17) {
        this.f282661d = q1Var;
        this.f282662e = j17;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
        m1Var.setHasCallbackToQueue(true);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "build channel Fail, errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
            return;
        }
        jy3.c cVar = (jy3.c) m1Var;
        if (cVar.I() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackup.RoamProviderImpl", "ticketScene.getResp() == null");
        }
        java.lang.String a17 = jy3.c.f302503f.a(cVar.I());
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "notifyTunnelCryptoInfoResultAsync, ".concat(a17));
        com.tencent.wechat.aff.affroam.g0 g0Var = this.f282661d.f282787a;
        if (g0Var != null) {
            g0Var.s0(this.f282662e, a17);
        }
    }
}

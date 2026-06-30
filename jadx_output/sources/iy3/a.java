package iy3;

/* loaded from: classes9.dex */
public final class a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f295916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f295917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f295918f;

    public a(android.os.Bundle bundle, int i17, com.tencent.mm.ipcinvoker.r rVar) {
        this.f295916d = bundle;
        this.f295917e = i17;
        this.f295918f = rVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
        m1Var.setHasCallbackToQueue(true);
        com.tencent.mm.ipcinvoker.r rVar = this.f295918f;
        int i19 = this.f295917e;
        android.os.Bundle bundle = this.f295916d;
        if (i17 != 0 || i18 != 0) {
            h73.e.c(bundle, "code", i18);
            h73.e.c(bundle, "taskid", i19);
            if (rVar != null) {
                rVar.a(bundle);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "build channel Fail");
            return;
        }
        jy3.c cVar = (jy3.c) m1Var;
        if (cVar.I() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "ticketScene.getResp() == null");
        }
        h73.e.d(bundle, "handshke", jy3.c.f302503f.a(cVar.I()));
        h73.e.c(bundle, "code", i18);
        h73.e.c(bundle, "taskid", i19);
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}

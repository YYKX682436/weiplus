package ho1;

/* loaded from: classes9.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(java.lang.String str, ho1.q1 q1Var, long j17) {
        super(0);
        this.f282668d = str;
        this.f282669e = q1Var;
        this.f282670f = j17;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        java.lang.String str = this.f282668d;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("getAdamTunnelCryptoInfoAsync, cryptoMaterial == null");
        }
        jy3.c cVar = new jy3.c();
        cVar.J(jy3.c.f302503f.b(str));
        try {
            return java.lang.Integer.valueOf(cVar.doScene(gm0.j1.d().f70764d, new ho1.e1(this.f282669e, this.f282670f)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackup.RoamProviderImpl", "NetSceneBuildDeviceSecureChannel do scene error");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RoamBackup.RoamProviderImpl", e17, "", new java.lang.Object[0]);
            return jz5.f0.f302826a;
        }
    }
}

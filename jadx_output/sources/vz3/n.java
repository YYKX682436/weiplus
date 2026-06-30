package vz3;

/* loaded from: classes15.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz3.q f441690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz3.p f441691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f441692f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(vz3.q qVar, vz3.p pVar, long j17) {
        super(0);
        this.f441690d = qVar;
        this.f441691e = pVar;
        this.f441692f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17 = this.f441690d.f441703h;
        sz3.d0.f413991a.c(sz3.b0.f413965d);
        sz3.d0.f414000j = true;
        sz3.d0.f413992b = e04.j2.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", "init scanProductSkipFrameCount: " + sz3.d0.f413992b + ", enableFilterCodeFrame: " + sz3.d0.f413993c);
        sz3.d0.f414003m = this.f441690d.f441702g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startGoodsSession sessionId: ");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", sb6.toString());
        sz3.d0.f413998h = j17;
        com.tencent.wechat.aff.iam_scan.n0 n0Var = this.f441691e.f441694a;
        if (n0Var != null) {
            n0Var.z0(this.f441692f);
        }
        return jz5.f0.f302826a;
    }
}

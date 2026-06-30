package xw1;

/* loaded from: classes8.dex */
public class j extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f457680m;

    /* renamed from: n, reason: collision with root package name */
    public r45.nx f457681n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f457682o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f457683p;

    public j(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mx();
        lVar.f70665b = new r45.nx();
        lVar.f70667d = 1649;
        lVar.f70666c = "/cgi-bin/mmpay-bin/setrewardqrcodephotoword";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f457680m = a17;
        ((r45.mx) a17.f70710a.f70684a).f380874d = str;
        this.f457683p = str;
        if (str.length() >= 1 && str.length() <= 3) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(724L, 0L, 1L, false);
        } else if (str.length() > 3) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(724L, 1L, 1L, false);
        }
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.nx nxVar = (r45.nx) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f457681n = nxVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(nxVar.f381717d), this.f457681n.f381718e);
        if (!this.f457661h && this.f457681n.f381717d != 0) {
            this.f457662i = true;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f457682o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f457682o = u0Var;
        return dispatch(sVar, this.f457680m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1649;
    }
}

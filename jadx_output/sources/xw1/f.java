package xw1;

/* loaded from: classes8.dex */
public class f extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f457668m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ww f457669n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f457670o;

    public f(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vw();
        lVar.f70665b = new r45.ww();
        lVar.f70667d = 1960;
        lVar.f70666c = "/cgi-bin/mmpay-bin/rewardqrcodepaycheck";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f457668m = a17;
        r45.vw vwVar = (r45.vw) a17.f70710a.f70684a;
        vwVar.f388615d = str;
        vwVar.f388616e = str2;
        vwVar.f388617f = str3;
        vwVar.f388618g = i17;
        vwVar.f388619h = str4;
        vwVar.f388620i = str5;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardPayCheck", "rewardid: %s, amt: %s", str2, java.lang.Integer.valueOf(i17));
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardPayCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.ww wwVar = (r45.ww) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f457669n = wwVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardPayCheck", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(wwVar.f389543d), this.f457669n.f389544e);
        if (!this.f457661h && this.f457669n.f389543d != 0) {
            this.f457662i = true;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f457670o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f457670o = u0Var;
        return dispatch(sVar, this.f457668m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1960;
    }
}

package nt4;

/* loaded from: classes4.dex */
public class k extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f339832d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f339833e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f339834f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f339835g;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, int i18, java.lang.String str9) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u73();
        lVar.f70665b = new r45.v73();
        lVar.f70666c = "/cgi-bin/mmpay-bin/genmallprepay";
        lVar.f70667d = 2755;
        lVar.f70668e = 189;
        lVar.f70669f = 1000000189;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f339833e = a17;
        r45.u73 u73Var = (r45.u73) a17.f70710a.f70684a;
        u73Var.f387119d = str;
        u73Var.f387122g = str4;
        u73Var.f387120e = str3;
        u73Var.f387123h = str5;
        u73Var.f387124i = str2;
        u73Var.f387121f = str6;
        u73Var.f387125m = str7;
        u73Var.f387126n = str8;
        u73Var.f387127o = i17;
        u73Var.f387128p = str9;
        if (i18 > 0) {
            u73Var.f387129q = i18;
        }
        java.lang.String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,channel:%s,scene:%s", str, str4, str3, str5, str2, str6, str7, str8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f339832d = u0Var;
        return dispatch(sVar, this.f339833e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2755;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        r45.v73 v73Var = (r45.v73) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGenMallPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", java.lang.Integer.valueOf(v73Var.f387961f), v73Var.f387962g);
        if (i18 == 0 && i19 == 0) {
            this.f339834f = v73Var.f387959d;
            this.f339835g = v73Var.f387960e;
        }
        java.lang.String str2 = v73Var.f387962g;
        this.f339832d.onSceneEnd(i18, v73Var.f387961f, str2, this);
    }
}

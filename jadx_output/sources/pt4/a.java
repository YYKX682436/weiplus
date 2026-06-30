package pt4;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f358262d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f358263e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f358264f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f358265g;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.g75();
        lVar.f70665b = new r45.h75();
        lVar.f70666c = "/cgi-bin/mmpay-bin/payugenprepay";
        lVar.f70667d = com.tencent.mm.minigame.download.mmdownloader.i.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f358263e = a17;
        r45.g75 g75Var = (r45.g75) a17.f70710a.f70684a;
        g75Var.f374950d = str;
        g75Var.f374953g = str4;
        g75Var.f374951e = str3;
        g75Var.f374954h = str5;
        g75Var.f374955i = str2;
        g75Var.f374952f = str6;
        g75Var.f374956m = str7;
        g75Var.f374957n = str8;
        g75Var.f374958o = i17;
        java.lang.String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", str, str4, str3, str5, str2, str6, str7, str8);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f358262d = u0Var;
        return dispatch(sVar, this.f358263e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.minigame.download.mmdownloader.i.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        r45.h75 h75Var = (r45.h75) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            this.f358264f = h75Var.f375916d;
            this.f358265g = h75Var.f375917e;
        }
        this.f358262d.onSceneEnd(i18, i19, h75Var.f375919g, this);
    }
}

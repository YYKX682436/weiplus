package xw1;

/* loaded from: classes9.dex */
public class g extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f457671m;

    /* renamed from: n, reason: collision with root package name */
    public r45.fx f457672n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f457673o;

    public g(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i27) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ex();
        lVar.f70665b = new r45.fx();
        lVar.f70667d = 1336;
        lVar.f70666c = "/cgi-bin/mmpay-bin/rewardqrcodeplaceorder";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f457671m = a17;
        r45.ex exVar = (r45.ex) a17.f70710a.f70684a;
        exVar.f373768e = i17;
        exVar.f373771h = i18;
        exVar.f373767d = str;
        exVar.f373769f = str2;
        exVar.f373770g = str3;
        exVar.f373772i = i19;
        exVar.f373773m = str4;
        exVar.f373774n = str5;
        exVar.f373775o = str6;
        exVar.f373776p = str7;
        exVar.f373777q = str8;
        exVar.f373778r = i27;
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.fx fxVar = (r45.fx) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f457672n = fxVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardPlaceOrder", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(fxVar.f374665d), this.f457672n.f374666e);
        if (!this.f457661h && this.f457672n.f374665d != 0) {
            this.f457662i = true;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f457673o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f457673o = u0Var;
        return dispatch(sVar, this.f457671m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1336;
    }
}

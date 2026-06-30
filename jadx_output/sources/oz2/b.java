package oz2;

/* loaded from: classes9.dex */
public class b extends oe4.g implements d50.m {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f350241d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f350242e;

    /* renamed from: f, reason: collision with root package name */
    public final int f350243f;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.lc6();
        lVar.f70665b = new r45.mc6();
        lVar.f70666c = "/cgi-bin/mmpay-bin/soteropenfppayment";
        lVar.f70667d = 1638;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f350242e = a17;
        r45.lc6 lc6Var = (r45.lc6) a17.f70710a.f70684a;
        lc6Var.f379307d = str;
        lc6Var.f379308e = str2;
        lc6Var.f379309f = str3;
        lc6Var.f379310g = com.tenpay.android.wechat.TenpayUtil.signWith3Des("passwd=" + lc6Var.f379309f);
        lc6Var.f379311h = i17;
        lc6Var.f379312i = 1;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
        lc6Var.f379313m = M.getInt("MMKV_KEY_SOTER_OPEN_SCENE", 0);
        M.putInt("MMKV_KEY_SOTER_OPEN_SCENE", -1);
        this.f350243f = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterOpenTouchPay", "soter_type: %s open_scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(lc6Var.f379313m));
    }

    @Override // oe4.g
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: authkey required");
        com.tencent.mm.modelbase.u0 u0Var = this.f350241d;
        if (u0Var != null) {
            u0Var.onSceneEnd(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void I(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: onError: errType: %d, errcode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.u0 u0Var = this.f350241d;
        if (u0Var != null) {
            u0Var.onSceneEnd(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay success");
            if (this.f350243f == 1) {
                mz2.m0.b(true);
                mz2.m0.c(false);
            } else {
                mz2.m0.c(true);
                mz2.m0.b(false);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay failed");
        }
        this.f350241d.onSceneEnd(i18, i19, "", this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f350241d = u0Var;
        return dispatch(sVar, this.f350242e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1638;
    }
}

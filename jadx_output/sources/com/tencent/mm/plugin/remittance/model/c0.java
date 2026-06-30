package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class c0 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156797d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156798e;

    /* renamed from: f, reason: collision with root package name */
    public r45.al4 f156799f;

    public c0(java.lang.String str, int i17, int i18, java.lang.String str2, long j17, java.lang.String str3, int i19) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zk4();
        lVar.f70665b = new r45.al4();
        lVar.f70667d = 4708;
        lVar.f70666c = "/cgi-bin/mmpay-bin/sjtpayhome";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156798e = a17;
        r45.zk4 zk4Var = (r45.zk4) a17.f70710a.f70684a;
        zk4Var.f392167d = str;
        zk4Var.f392169f = i17;
        zk4Var.f392170g = i18;
        zk4Var.f392171h = str2;
        zk4Var.f392172i = j17;
        zk4Var.f392173m = str3;
        zk4Var.f392174n = i19;
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        zk4Var.f392175o = intValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "NetSceneMerchantPayGetQRCodeInfo, qrcode: %s,scan_scene:%s, channel :%s qrcodeSenderUsername:%s msgSvrId:%s username:%s chatType:%s wallet_region:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, java.lang.Long.valueOf(j17), str3, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(intValue));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "doScene");
        this.f156797d = u0Var;
        return dispatch(sVar, this.f156798e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4708;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.al4 al4Var = (r45.al4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156799f = al4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(al4Var.f370093d), this.f156799f.f370094e);
        com.tencent.mm.modelbase.u0 u0Var = this.f156797d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
